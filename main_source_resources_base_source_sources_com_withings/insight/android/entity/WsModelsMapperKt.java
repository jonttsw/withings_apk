package com.withings.insight.android.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.Instant;
/* compiled from: WsModelsMapper.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0000\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u0000\u001a\u00020\u000f*\u00020\u0010¨\u0006\u0011"}, d2 = {"toEntity", "Lcom/withings/insight/android/entity/Action;", "Lcom/withings/insight/core/model/Action;", "Lcom/withings/insight/android/entity/Conversation;", "Lcom/withings/insight/core/model/Conversation;", "Lcom/withings/insight/android/entity/InputMetadata;", "Lcom/withings/insight/core/model/InputMetadata;", "Lcom/withings/insight/android/entity/Insight;", "Lcom/withings/insight/core/model/Insight;", "Lcom/withings/insight/android/entity/InsightContainer;", "Lcom/withings/insight/core/model/InsightContainer;", "Lcom/withings/insight/android/entity/InsightContent;", "Lcom/withings/insight/core/model/InsightContent;", "Lcom/withings/insight/android/entity/SelectedExchange;", "Lcom/withings/insight/core/model/SelectedExchange;", "Lcom/withings/insight/android/entity/Suggestion;", "Lcom/withings/insight/core/model/Suggestion;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WsModelsMapperKt {
    public static final InsightContainer toEntity(com.withings.insight.core.model.InsightContainer insightContainer) {
        u.j(insightContainer, "<this>");
        com.withings.insight.core.model.Insight insight = insightContainer.getInsight();
        Insight entity = insight != null ? toEntity(insight) : null;
        Long modified = insightContainer.getModified();
        return new InsightContainer(entity, modified != null ? Instant.ofEpochSecond(modified.longValue()).toDateTime() : null);
    }

    public static final Insight toEntity(com.withings.insight.core.model.Insight insight) {
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
        com.withings.insight.core.model.InsightContent content = insight.getContent();
        ArrayList arrayList = null;
        InsightContent entity = content != null ? toEntity(content) : null;
        List<com.withings.insight.core.model.SelectedExchange> scenario = insight.getScenario();
        if (scenario != null) {
            List<com.withings.insight.core.model.SelectedExchange> list = scenario;
            arrayList = new ArrayList(x.y(list, 10));
            for (com.withings.insight.core.model.SelectedExchange selectedExchange : list) {
                arrayList.add(toEntity(selectedExchange));
            }
        }
        return new Insight(crmId, conversationId, insightId, userId, format, emotion, bgcolor, category, day, archivable, entity, arrayList, insight.getSynced(), insight.getContext(), insight.getVariables(), insight.getRead(), insight.getOpened(), insight.getModified(), insight.getCreated(), insight.getDeleted(), insight.getConditions(), insight.getPriority(), insight.getExpirationDate(), insight.getVersion());
    }

    public static final InsightContent toEntity(com.withings.insight.core.model.InsightContent insightContent) {
        ArrayList arrayList;
        u.j(insightContent, "<this>");
        String title = insightContent.getTitle();
        String subtitle = insightContent.getSubtitle();
        String buttonText = insightContent.getButtonText();
        String buttonUrl = insightContent.getButtonUrl();
        List<com.withings.insight.core.model.Conversation> conversation = insightContent.getConversation();
        if (conversation != null) {
            List<com.withings.insight.core.model.Conversation> list = conversation;
            ArrayList arrayList2 = new ArrayList(x.y(list, 10));
            for (com.withings.insight.core.model.Conversation conversation2 : list) {
                arrayList2.add(toEntity(conversation2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new InsightContent(title, subtitle, buttonText, buttonUrl, arrayList);
    }

    public static final Conversation toEntity(com.withings.insight.core.model.Conversation conversation) {
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
        List<com.withings.insight.core.model.Action> onTapActionsWithConditions = conversation.getOnTapActionsWithConditions();
        if (onTapActionsWithConditions != null) {
            List<com.withings.insight.core.model.Action> list = onTapActionsWithConditions;
            arrayList = new ArrayList(x.y(list, 10));
            for (com.withings.insight.core.model.Action action : list) {
                arrayList.add(toEntity(action));
            }
        } else {
            arrayList = null;
        }
        List<String> actions = conversation.getActions();
        List<String> onDisplayActions = conversation.getOnDisplayActions();
        List<com.withings.insight.core.model.Action> onDisplayActionsWithConditions = conversation.getOnDisplayActionsWithConditions();
        if (onDisplayActionsWithConditions != null) {
            List<com.withings.insight.core.model.Action> list2 = onDisplayActionsWithConditions;
            arrayList2 = new ArrayList(x.y(list2, 10));
            for (com.withings.insight.core.model.Action action2 : list2) {
                arrayList2.add(toEntity(action2));
            }
        } else {
            arrayList2 = null;
        }
        String messageType = conversation.getMessageType();
        List<com.withings.insight.core.model.Suggestion> suggestions = conversation.getSuggestions();
        if (suggestions != null) {
            List<com.withings.insight.core.model.Suggestion> list3 = suggestions;
            arrayList3 = new ArrayList(x.y(list3, 10));
            for (com.withings.insight.core.model.Suggestion suggestion : list3) {
                arrayList3.add(toEntity(suggestion));
            }
        } else {
            arrayList3 = null;
        }
        boolean expectUserResponse = conversation.getExpectUserResponse();
        String inputType = conversation.getInputType();
        com.withings.insight.core.model.InputMetadata inputMetadata = conversation.getInputMetadata();
        return new Conversation(messageId, contentTitle, image, bubbleGlyph, content, onTapActions, arrayList, actions, onDisplayActions, arrayList2, messageType, arrayList3, expectUserResponse, inputType, inputMetadata != null ? toEntity(inputMetadata) : null, conversation.isEndMessage());
    }

    public static final InputMetadata toEntity(com.withings.insight.core.model.InputMetadata inputMetadata) {
        ArrayList arrayList;
        ArrayList arrayList2;
        u.j(inputMetadata, "<this>");
        String keyboard = inputMetadata.getKeyboard();
        String control = inputMetadata.getControl();
        String suffix = inputMetadata.getSuffix();
        String mode = inputMetadata.getMode();
        String defaultAction = inputMetadata.getDefaultAction();
        String buttonTitle = inputMetadata.getButtonTitle();
        List<com.withings.insight.core.model.Action> onTapActionsWithConditions = inputMetadata.getOnTapActionsWithConditions();
        ArrayList arrayList3 = null;
        if (onTapActionsWithConditions != null) {
            List<com.withings.insight.core.model.Action> list = onTapActionsWithConditions;
            arrayList = new ArrayList(x.y(list, 10));
            for (com.withings.insight.core.model.Action action : list) {
                arrayList.add(toEntity(action));
            }
        } else {
            arrayList = null;
        }
        String placeholder = inputMetadata.getPlaceholder();
        List<com.withings.insight.core.model.Action> onFailureActions = inputMetadata.getOnFailureActions();
        if (onFailureActions != null) {
            List<com.withings.insight.core.model.Action> list2 = onFailureActions;
            arrayList2 = new ArrayList(x.y(list2, 10));
            for (com.withings.insight.core.model.Action action2 : list2) {
                arrayList2.add(toEntity(action2));
            }
        } else {
            arrayList2 = null;
        }
        String style = inputMetadata.getStyle();
        List<com.withings.insight.core.model.Suggestion> suggestions = inputMetadata.getSuggestions();
        if (suggestions != null) {
            List<com.withings.insight.core.model.Suggestion> list3 = suggestions;
            arrayList3 = new ArrayList(x.y(list3, 10));
            for (com.withings.insight.core.model.Suggestion suggestion : list3) {
                arrayList3.add(toEntity(suggestion));
            }
        }
        return new InputMetadata(keyboard, control, suffix, mode, defaultAction, buttonTitle, arrayList, placeholder, arrayList2, style, arrayList3, inputMetadata.getPickerMin(), inputMetadata.getPickerMax(), inputMetadata.getPickerStep());
    }

    public static final Suggestion toEntity(com.withings.insight.core.model.Suggestion suggestion) {
        ArrayList arrayList;
        u.j(suggestion, "<this>");
        String id2 = suggestion.getId();
        String text = suggestion.getText();
        String title = suggestion.getTitle();
        String image = suggestion.getImage();
        List<String> actions = suggestion.getActions();
        boolean unique = suggestion.getUnique();
        List<com.withings.insight.core.model.Action> onTapActionsWithConditions = suggestion.getOnTapActionsWithConditions();
        if (onTapActionsWithConditions != null) {
            List<com.withings.insight.core.model.Action> list = onTapActionsWithConditions;
            ArrayList arrayList2 = new ArrayList(x.y(list, 10));
            for (com.withings.insight.core.model.Action action : list) {
                arrayList2.add(toEntity(action));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new Suggestion(id2, text, title, image, actions, unique, arrayList, suggestion.getDateTime());
    }

    public static final SelectedExchange toEntity(com.withings.insight.core.model.SelectedExchange selectedExchange) {
        u.j(selectedExchange, "<this>");
        return new SelectedExchange(selectedExchange.getMessageId(), selectedExchange.getSuggestionId());
    }

    public static final Action toEntity(com.withings.insight.core.model.Action action) {
        u.j(action, "<this>");
        return new Action(action.getAction(), action.getConditions());
    }
}
