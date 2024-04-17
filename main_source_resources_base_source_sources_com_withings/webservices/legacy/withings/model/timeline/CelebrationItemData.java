package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public class CelebrationItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "celebration";
    public Animation animation;
    public String colorName;
    public Data data;
    public Wording description;
    public Feedback feedback;
    public Actions primaryActions;
    public Actions secondaryActions;
    public Wording title;
    public String type;

    /* loaded from: classes4.dex */
    public static class Action extends Wording {
        public String url;
    }

    /* loaded from: classes4.dex */
    public static class Actions extends Wording {
        public List<Action> actions = new ArrayList();
    }

    /* loaded from: classes4.dex */
    public static class Animation implements Serializable {
        public String url;
    }

    /* loaded from: classes4.dex */
    public static class Data implements Serializable {
        public String badge;
        public String glyphName;
        public String shareId;
        public String shareText;
        public String unit;
        public int value;
    }

    /* loaded from: classes4.dex */
    public static class Feedback extends Wording {
        public String lovedUrl;
        public String notLikedUrl;
        public String whateverUrl;
    }

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<CelebrationItemData> {
        private static final String KEY_ACTIONS_ACTIONS = "actions";
        private static final String KEY_ACTION_URL = "url";
        private static final String KEY_ANIMATION = "animation";
        private static final String KEY_ANIMATION_URL = "url";
        private static final String KEY_COLOR_NAME = "color";
        private static final String KEY_DATA = "data";
        private static final String KEY_DATA_BADGE = "badge";
        private static final String KEY_DATA_GLYPHNAME = "glyph";
        private static final String KEY_DATA_SHAREID = "shareid";
        private static final String KEY_DATA_SHARETEXT = "sharetext";
        private static final String KEY_DATA_UNIT = "unit";
        private static final String KEY_DATA_VALUE = "value";
        private static final String KEY_DESCRIPTION = "description";
        private static final String KEY_FEEDBACK = "feedbacks";
        private static final String KEY_FEEDBACK_LOVED_URL = "url_loved";
        private static final String KEY_FEEDBACK_NOT_LIKED_URL = "url_notliked";
        private static final String KEY_FEEDBACK_WHATEVER_URL = "url_whatever";
        private static final String KEY_PRIMARY_ACTIONS = "primary_actions";
        private static final String KEY_SECONDARY_ACTIONS = "secondary_actions";
        private static final String KEY_TITLE = "title";
        private static final String KEY_TYPE = "type";
        private static final String KEY_WORDING_DEFAULT_STRING = "default";
        private static final String KEY_WORDING_STRING_KEY = "key";

        private Action deserializeAction(JsonObject jsonObject) {
            Action action = new Action();
            deserializeWordingInto(jsonObject, action);
            action.url = v1.r0(jsonObject, "url", null);
            return action;
        }

        private Actions deserializeActions(JsonObject jsonObject) {
            Actions actions = new Actions();
            deserializeWordingInto(jsonObject, actions);
            ArrayList arrayList = new ArrayList();
            if (jsonObject.has(KEY_ACTIONS_ACTIONS) && jsonObject.get(KEY_ACTIONS_ACTIONS).isJsonArray()) {
                Iterator<JsonElement> it = jsonObject.get(KEY_ACTIONS_ACTIONS).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    if (next.isJsonObject()) {
                        arrayList.add(deserializeAction(next.getAsJsonObject()));
                    }
                }
            }
            actions.actions = arrayList;
            return actions;
        }

        private Animation deserializeAnimation(JsonObject jsonObject) {
            Animation animation = new Animation();
            animation.url = v1.r0(jsonObject, "url", null);
            return animation;
        }

        private Data deserializeData(JsonObject jsonObject) {
            Data data = new Data();
            data.value = v1.o0(-1, "value", jsonObject);
            data.badge = v1.r0(jsonObject, KEY_DATA_BADGE, null);
            data.glyphName = v1.r0(jsonObject, KEY_DATA_GLYPHNAME, null);
            data.unit = v1.r0(jsonObject, "unit", null);
            data.shareId = v1.r0(jsonObject, KEY_DATA_SHAREID, null);
            data.shareText = v1.r0(jsonObject, KEY_DATA_SHARETEXT, null);
            return data;
        }

        private Feedback deserializeFeedback(JsonObject jsonObject) {
            Feedback feedback = new Feedback();
            deserializeWordingInto(jsonObject, feedback);
            feedback.lovedUrl = v1.r0(jsonObject, KEY_FEEDBACK_LOVED_URL, null);
            feedback.whateverUrl = v1.r0(jsonObject, KEY_FEEDBACK_WHATEVER_URL, null);
            feedback.notLikedUrl = v1.r0(jsonObject, KEY_FEEDBACK_NOT_LIKED_URL, null);
            return feedback;
        }

        private Wording deserializeWording(JsonObject jsonObject) {
            Wording wording = new Wording();
            deserializeWordingInto(jsonObject, wording);
            return wording;
        }

        private void deserializeWordingInto(JsonObject jsonObject, Wording wording) {
            wording.stringKey = v1.r0(jsonObject, "key", null);
            wording.defaultString = v1.r0(jsonObject, "default", null);
        }

        private JsonObject serializeAction(Action action) {
            JsonObject serializeWording = serializeWording(action);
            serializeWording.addProperty("url", action.url);
            return serializeWording;
        }

        private JsonObject serializeActions(Actions actions) {
            JsonObject serializeWording = serializeWording(actions);
            JsonArray jsonArray = new JsonArray();
            for (Action action : actions.actions) {
                jsonArray.add(serializeAction(action));
            }
            serializeWording.add(KEY_ACTIONS_ACTIONS, jsonArray);
            return serializeWording;
        }

        private JsonObject serializeAnimation(Animation animation) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("url", animation.url);
            return jsonObject;
        }

        private JsonObject serializeData(Data data) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("value", Integer.valueOf(data.value));
            jsonObject.addProperty(KEY_DATA_BADGE, data.badge);
            jsonObject.addProperty(KEY_DATA_GLYPHNAME, data.glyphName);
            jsonObject.addProperty("unit", data.unit);
            jsonObject.addProperty(KEY_DATA_SHAREID, data.shareId);
            jsonObject.addProperty(KEY_DATA_SHARETEXT, data.shareText);
            return jsonObject;
        }

        private JsonObject serializeFeedback(Feedback feedback) {
            JsonObject serializeWording = serializeWording(feedback);
            serializeWording.addProperty(KEY_FEEDBACK_LOVED_URL, feedback.lovedUrl);
            serializeWording.addProperty(KEY_FEEDBACK_WHATEVER_URL, feedback.whateverUrl);
            serializeWording.addProperty(KEY_FEEDBACK_NOT_LIKED_URL, feedback.notLikedUrl);
            return serializeWording;
        }

        private JsonObject serializeWording(Wording wording) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("key", wording.stringKey);
            jsonObject.addProperty("default", wording.defaultString);
            return jsonObject;
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, CelebrationItemData celebrationItemData) {
            celebrationItemData.type = v1.r0(jsonObject, "type", null);
            celebrationItemData.title = deserializeWording(jsonObject.get("title").getAsJsonObject());
            celebrationItemData.description = deserializeWording(jsonObject.get("description").getAsJsonObject());
            if (jsonObject.has(KEY_PRIMARY_ACTIONS) && jsonObject.get(KEY_PRIMARY_ACTIONS).isJsonObject()) {
                celebrationItemData.primaryActions = deserializeActions(jsonObject.get(KEY_PRIMARY_ACTIONS).getAsJsonObject());
            }
            if (jsonObject.has(KEY_SECONDARY_ACTIONS) && jsonObject.get(KEY_SECONDARY_ACTIONS).isJsonObject()) {
                celebrationItemData.secondaryActions = deserializeActions(jsonObject.get(KEY_SECONDARY_ACTIONS).getAsJsonObject());
            }
            if (jsonObject.has(KEY_FEEDBACK) && jsonObject.get(KEY_FEEDBACK).isJsonObject()) {
                celebrationItemData.feedback = deserializeFeedback(jsonObject.get(KEY_FEEDBACK).getAsJsonObject());
            }
            celebrationItemData.data = deserializeData(jsonObject.get("data").getAsJsonObject());
            celebrationItemData.colorName = v1.r0(jsonObject, "color", null);
            if (jsonObject.has(KEY_ANIMATION) && jsonObject.get(KEY_ANIMATION).isJsonObject()) {
                celebrationItemData.animation = deserializeAnimation(jsonObject.get(KEY_ANIMATION).getAsJsonObject());
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public CelebrationItemData newItemData() {
            return new CelebrationItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(CelebrationItemData celebrationItemData, JsonObject jsonObject) {
            jsonObject.addProperty("type", celebrationItemData.type);
            jsonObject.add("title", serializeWording(celebrationItemData.title));
            jsonObject.add("description", serializeWording(celebrationItemData.description));
            Actions actions = celebrationItemData.primaryActions;
            if (actions != null) {
                jsonObject.add(KEY_PRIMARY_ACTIONS, serializeActions(actions));
            }
            Actions actions2 = celebrationItemData.secondaryActions;
            if (actions2 != null) {
                jsonObject.add(KEY_SECONDARY_ACTIONS, serializeActions(actions2));
            }
            Feedback feedback = celebrationItemData.feedback;
            if (feedback != null) {
                jsonObject.add(KEY_FEEDBACK, serializeFeedback(feedback));
            }
            jsonObject.add("data", serializeData(celebrationItemData.data));
            jsonObject.addProperty("color", celebrationItemData.colorName);
            Animation animation = celebrationItemData.animation;
            if (animation != null) {
                jsonObject.add(KEY_ANIMATION, serializeAnimation(animation));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class Wording implements Serializable {
        public String defaultString;
        public String stringKey;
    }

    public CelebrationItemData() {
        super(WS_TYPE);
    }
}
