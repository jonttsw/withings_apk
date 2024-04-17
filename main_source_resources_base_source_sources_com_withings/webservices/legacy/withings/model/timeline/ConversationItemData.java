package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class ConversationItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "conversation";
    public String buttonTitle;
    public int conversationId;
    public String emotionUrl;
    public String message;
    public int priority;
    public String title;

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<ConversationItemData> {
        private static final String KEY_DATA_BUTTON_TITLE = "button_title";
        private static final String KEY_DATA_CONVERSATION_ID = "conversation_id";
        private static final String KEY_DATA_MESSAGE = "message";
        private static final String KEY_DATA_PRIORITY = "priority";
        private static final String KEY_DATA_TITLE = "title";
        private static final String KEY_DATA_URL = "emotion_url";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, ConversationItemData conversationItemData) {
            conversationItemData.title = v1.r0(jsonObject, "title", null);
            conversationItemData.message = v1.r0(jsonObject, "message", null);
            conversationItemData.buttonTitle = v1.r0(jsonObject, KEY_DATA_BUTTON_TITLE, null);
            conversationItemData.emotionUrl = v1.r0(jsonObject, KEY_DATA_URL, null);
            conversationItemData.conversationId = v1.o0(0, KEY_DATA_CONVERSATION_ID, jsonObject);
            conversationItemData.priority = v1.o0(0, "priority", jsonObject);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public ConversationItemData newItemData() {
            return new ConversationItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(ConversationItemData conversationItemData, JsonObject jsonObject) {
            jsonObject.addProperty("title", conversationItemData.title);
            jsonObject.addProperty("message", conversationItemData.message);
            jsonObject.addProperty(KEY_DATA_BUTTON_TITLE, conversationItemData.buttonTitle);
            jsonObject.addProperty(KEY_DATA_URL, conversationItemData.emotionUrl);
            jsonObject.addProperty(KEY_DATA_CONVERSATION_ID, Integer.valueOf(conversationItemData.conversationId));
            jsonObject.addProperty("priority", Integer.valueOf(conversationItemData.priority));
        }
    }

    public ConversationItemData() {
        super(WS_TYPE);
    }
}
