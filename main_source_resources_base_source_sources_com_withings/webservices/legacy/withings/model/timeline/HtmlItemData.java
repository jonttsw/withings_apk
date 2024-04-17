package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class HtmlItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "html";
    public String analyticsId;
    public Details details;
    public String groupType;
    public String message;

    /* loaded from: classes4.dex */
    public static class Details {
        public String content;
        public String type;
    }

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<HtmlItemData> {
        private static final String KEY_ANALYTICS_ID = "analyticid";
        private static final String KEY_DETAILS = "details";
        private static final String KEY_DETAILS_CONTENT = "content";
        private static final String KEY_DETAILS_TYPE = "type";
        private static final String KEY_GROUP_TYPE = "group_type";
        private static final String KEY_MESSAGE = "message";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, HtmlItemData htmlItemData) {
            htmlItemData.message = v1.r0(jsonObject, "message", null);
            htmlItemData.analyticsId = v1.r0(jsonObject, KEY_ANALYTICS_ID, null);
            htmlItemData.groupType = v1.r0(jsonObject, KEY_GROUP_TYPE, null);
            if (jsonObject.has(KEY_DETAILS) && jsonObject.get(KEY_DETAILS).isJsonObject()) {
                JsonObject asJsonObject = jsonObject.get(KEY_DETAILS).getAsJsonObject();
                Details details = new Details();
                details.type = v1.r0(asJsonObject, "type", null);
                details.content = v1.r0(asJsonObject, "content", null);
                htmlItemData.details = details;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public HtmlItemData newItemData() {
            return new HtmlItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(HtmlItemData htmlItemData, JsonObject jsonObject) {
            jsonObject.addProperty("message", htmlItemData.message);
            jsonObject.addProperty(KEY_ANALYTICS_ID, htmlItemData.analyticsId);
            jsonObject.addProperty(KEY_GROUP_TYPE, htmlItemData.groupType);
            if (htmlItemData.details != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("type", htmlItemData.details.type);
                jsonObject2.addProperty("content", htmlItemData.details.content);
                jsonObject.add(KEY_DETAILS, jsonObject2);
            }
        }
    }

    public HtmlItemData() {
        super("html");
    }
}
