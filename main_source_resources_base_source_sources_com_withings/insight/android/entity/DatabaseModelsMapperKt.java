package com.withings.insight.android.entity;

import com.withings.insight.core.model.HealthInsight;
import com.withings.insight.core.model.HealthInsightObjectStructure;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: DatabaseModelsMapper.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0004\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0004\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0004\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0004\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u0004\u001a\u00020\u000f*\u00020\u0010\u001a\n\u0010\u0004\u001a\u00020\u0011*\u00020\u0012¨\u0006\u0013"}, d2 = {"toDomain", "Lcom/withings/insight/core/model/HealthInsight;", "Lcom/withings/insight/android/entity/HealthInsightDb;", "toEntity", "toModel", "Lcom/withings/insight/core/model/Action;", "Lcom/withings/insight/android/entity/Action;", "Lcom/withings/insight/core/model/Conversation;", "Lcom/withings/insight/android/entity/Conversation;", "Lcom/withings/insight/core/model/InputMetadata;", "Lcom/withings/insight/android/entity/InputMetadata;", "Lcom/withings/insight/core/model/Insight;", "Lcom/withings/insight/android/entity/Insight;", "Lcom/withings/insight/core/model/InsightContent;", "Lcom/withings/insight/android/entity/InsightContent;", "Lcom/withings/insight/core/model/SelectedExchange;", "Lcom/withings/insight/android/entity/SelectedExchange;", "Lcom/withings/insight/core/model/Suggestion;", "Lcom/withings/insight/android/entity/Suggestion;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseModelsMapperKt {
    public static final HealthInsight toDomain(HealthInsightDb healthInsightDb) {
        HealthInsightObjectStructure healthInsightObjectStructure;
        u.j(healthInsightDb, "<this>");
        Long id2 = healthInsightDb.getId();
        String crmId = healthInsightDb.getCrmId();
        long userId = healthInsightDb.getUserId();
        String objectStructure = healthInsightDb.getObjectStructure();
        int hashCode = objectStructure.hashCode();
        if (hashCode != -1655966961) {
            if (hashCode != 175177151) {
                if (hashCode == 938321246 && objectStructure.equals("measure")) {
                    healthInsightObjectStructure = HealthInsightObjectStructure.Measure.INSTANCE;
                }
                healthInsightObjectStructure = new HealthInsightObjectStructure.Unknown(healthInsightDb.getObjectStructure());
            } else {
                if (objectStructure.equals("aggregate")) {
                    healthInsightObjectStructure = HealthInsightObjectStructure.Aggregate.INSTANCE;
                }
                healthInsightObjectStructure = new HealthInsightObjectStructure.Unknown(healthInsightDb.getObjectStructure());
            }
        } else {
            if (objectStructure.equals("activity")) {
                healthInsightObjectStructure = HealthInsightObjectStructure.Activity.INSTANCE;
            }
            healthInsightObjectStructure = new HealthInsightObjectStructure.Unknown(healthInsightDb.getObjectStructure());
        }
        return new HealthInsight(id2, crmId, userId, healthInsightObjectStructure, healthInsightDb.getObjectType(), healthInsightDb.getObjectId(), healthInsightDb.getTimestamp(), healthInsightDb.getTimeToLive(), healthInsightDb.getExpirationDate(), healthInsightDb.getUrl(), healthInsightDb.getTitle(), healthInsightDb.getDescription(), healthInsightDb.getCreated());
    }

    public static final HealthInsightDb toEntity(HealthInsight healthInsight) {
        String value;
        u.j(healthInsight, "<this>");
        Long id2 = healthInsight.getId();
        String crmId = healthInsight.getCrmId();
        long userId = healthInsight.getUserId();
        HealthInsightObjectStructure objectStructure = healthInsight.getObjectStructure();
        if (u.e(objectStructure, HealthInsightObjectStructure.Measure.INSTANCE)) {
            value = "measure";
        } else if (u.e(objectStructure, HealthInsightObjectStructure.Activity.INSTANCE)) {
            value = "activity";
        } else if (u.e(objectStructure, HealthInsightObjectStructure.Aggregate.INSTANCE)) {
            value = "aggregate";
        } else if (objectStructure instanceof HealthInsightObjectStructure.Unknown) {
            HealthInsightObjectStructure objectStructure2 = healthInsight.getObjectStructure();
            u.h(objectStructure2, "null cannot be cast to non-null type com.withings.insight.core.model.HealthInsightObjectStructure.Unknown");
            value = ((HealthInsightObjectStructure.Unknown) objectStructure2).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new HealthInsightDb(id2, crmId, userId, value, healthInsight.getObjectType(), healthInsight.getObjectId(), healthInsight.getTimestamp(), healthInsight.getTimeToLive(), healthInsight.getExpirationDate(), healthInsight.getUrl(), healthInsight.getTitle(), healthInsight.getDescription(), healthInsight.getCreated());
    }

    public static final com.withings.insight.core.model.Insight toModel(Insight insight) {
        u.j(insight, "<this>");
        String crmId = insight.getCrmId();
        Long conversationId = insight.getConversationId();
        Long insightId = insight.getInsightId();
        long userId = insight.getUserId();
        String format = insight.getFormat();
        String emotion = insight.getEmotion();
        String bgcolor = insight.getBgcolor();
        String category = insight.getCategory();
        Integer day = insight.getDay();
        Boolean archivable = insight.getArchivable();
        InsightContent content = insight.getContent();
        ArrayList arrayList = null;
        com.withings.insight.core.model.InsightContent model = content != null ? toModel(content) : null;
        List<SelectedExchange> scenario = insight.getScenario();
        if (scenario != null) {
            List<SelectedExchange> list = scenario;
            arrayList = new ArrayList(x.y(list, 10));
            for (SelectedExchange selectedExchange : list) {
                arrayList.add(toModel(selectedExchange));
            }
        }
        return new com.withings.insight.core.model.Insight(crmId, conversationId, insightId, userId, format, emotion, bgcolor, category, day, archivable, model, arrayList, insight.getSynced(), insight.getContext(), insight.getVariables(), insight.getRead(), insight.getOpened(), insight.getModified(), insight.getCreated(), insight.getDeleted(), insight.getConditions(), insight.getPriority(), insight.getExpirationDate(), insight.getVersion());
    }

    public static final com.withings.insight.core.model.InsightContent toModel(InsightContent insightContent) {
        ArrayList arrayList;
        u.j(insightContent, "<this>");
        String title = insightContent.getTitle();
        String subtitle = insightContent.getSubtitle();
        String buttonText = insightContent.getButtonText();
        String buttonUrl = insightContent.getButtonUrl();
        List<Conversation> conversation = insightContent.getConversation();
        if (conversation != null) {
            List<Conversation> list = conversation;
            ArrayList arrayList2 = new ArrayList(x.y(list, 10));
            for (Conversation conversation2 : list) {
                arrayList2.add(toModel(conversation2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.withings.insight.core.model.InsightContent(title, subtitle, buttonText, buttonUrl, arrayList);
    }

    public static final com.withings.insight.core.model.Conversation toModel(Conversation conversation) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        u.j(conversation, "<this>");
        String messageId = conversation.getMessageId();
        String contentTitle = conversation.getContentTitle();
        String image = conversation.getImage();
        String bubbleGlyph = conversation.getBubbleGlyph();
        String content = conversation.getContent();
        List<String> onTapActions = conversation.getOnTapActions();
        List<Action> onTapActionsWithConditions = conversation.getOnTapActionsWithConditions();
        if (onTapActionsWithConditions != null) {
            List<Action> list = onTapActionsWithConditions;
            arrayList = new ArrayList(x.y(list, 10));
            for (Action action : list) {
                arrayList.add(toModel(action));
            }
        } else {
            arrayList = null;
        }
        List<String> actions = conversation.getActions();
        List<String> onDisplayActions = conversation.getOnDisplayActions();
        List<Action> onDisplayActionsWithConditions = conversation.getOnDisplayActionsWithConditions();
        if (onDisplayActionsWithConditions != null) {
            List<Action> list2 = onDisplayActionsWithConditions;
            arrayList2 = new ArrayList(x.y(list2, 10));
            for (Action action2 : list2) {
                arrayList2.add(toModel(action2));
            }
        } else {
            arrayList2 = null;
        }
        String messageType = conversation.getMessageType();
        List<Suggestion> suggestions = conversation.getSuggestions();
        if (suggestions != null) {
            List<Suggestion> list3 = suggestions;
            arrayList3 = new ArrayList(x.y(list3, 10));
            for (Suggestion suggestion : list3) {
                arrayList3.add(toModel(suggestion));
            }
        } else {
            arrayList3 = null;
        }
        boolean expectUserResponse = conversation.getExpectUserResponse();
        String inputType = conversation.getInputType();
        InputMetadata inputMetadata = conversation.getInputMetadata();
        return new com.withings.insight.core.model.Conversation(messageId, contentTitle, image, bubbleGlyph, content, onTapActions, arrayList, actions, onDisplayActions, arrayList2, messageType, arrayList3, expectUserResponse, inputType, inputMetadata != null ? toModel(inputMetadata) : null, conversation.isEndMessage());
    }

    public static final com.withings.insight.core.model.InputMetadata toModel(InputMetadata inputMetadata) {
        ArrayList arrayList;
        ArrayList arrayList2;
        u.j(inputMetadata, "<this>");
        String keyboard = inputMetadata.getKeyboard();
        String control = inputMetadata.getControl();
        String suffix = inputMetadata.getSuffix();
        String mode = inputMetadata.getMode();
        String defaultAction = inputMetadata.getDefaultAction();
        String buttonTitle = inputMetadata.getButtonTitle();
        List<Action> onTapActionsWithConditions = inputMetadata.getOnTapActionsWithConditions();
        ArrayList arrayList3 = null;
        if (onTapActionsWithConditions != null) {
            List<Action> list = onTapActionsWithConditions;
            arrayList = new ArrayList(x.y(list, 10));
            for (Action action : list) {
                arrayList.add(toModel(action));
            }
        } else {
            arrayList = null;
        }
        String placeholder = inputMetadata.getPlaceholder();
        List<Action> onFailureActions = inputMetadata.getOnFailureActions();
        if (onFailureActions != null) {
            List<Action> list2 = onFailureActions;
            arrayList2 = new ArrayList(x.y(list2, 10));
            for (Action action2 : list2) {
                arrayList2.add(toModel(action2));
            }
        } else {
            arrayList2 = null;
        }
        String style = inputMetadata.getStyle();
        List<Suggestion> suggestions = inputMetadata.getSuggestions();
        if (suggestions != null) {
            List<Suggestion> list3 = suggestions;
            arrayList3 = new ArrayList(x.y(list3, 10));
            for (Suggestion suggestion : list3) {
                arrayList3.add(toModel(suggestion));
            }
        }
        return new com.withings.insight.core.model.InputMetadata(keyboard, control, suffix, mode, defaultAction, buttonTitle, arrayList, placeholder, arrayList2, style, arrayList3, inputMetadata.getPickerMin(), inputMetadata.getPickerMax(), inputMetadata.getPickerStep());
    }

    public static final com.withings.insight.core.model.Suggestion toModel(Suggestion suggestion) {
        ArrayList arrayList;
        u.j(suggestion, "<this>");
        String id2 = suggestion.getId();
        String text = suggestion.getText();
        String title = suggestion.getTitle();
        String image = suggestion.getImage();
        List<String> actions = suggestion.getActions();
        boolean unique = suggestion.getUnique();
        List<Action> onTapActionsWithConditions = suggestion.getOnTapActionsWithConditions();
        if (onTapActionsWithConditions != null) {
            List<Action> list = onTapActionsWithConditions;
            ArrayList arrayList2 = new ArrayList(x.y(list, 10));
            for (Action action : list) {
                arrayList2.add(toModel(action));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.withings.insight.core.model.Suggestion(id2, text, title, image, actions, unique, arrayList, suggestion.getDateTime());
    }

    public static final com.withings.insight.core.model.SelectedExchange toModel(SelectedExchange selectedExchange) {
        u.j(selectedExchange, "<this>");
        return new com.withings.insight.core.model.SelectedExchange(selectedExchange.getMessageId(), selectedExchange.getSuggestionId());
    }

    public static final com.withings.insight.core.model.Action toModel(Action action) {
        u.j(action, "<this>");
        return new com.withings.insight.core.model.Action(action.getAction(), action.getConditions());
    }
}
