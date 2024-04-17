package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class InsightItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "insight";
    public String colorName;
    public String glyphName;
    public String lovedUrl;
    public String notLikedUrl;
    public String text1;
    public String text2;
    public String whateverUrl;

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<InsightItemData> {
        private static final String KEY_COLOR_NAME = "color";
        private static final String KEY_GLYPH_NAME = "glyph";
        private static final String KEY_LOVED_URL = "url_loved";
        private static final String KEY_NOT_LIKED_URL = "url_notliked";
        private static final String KEY_TEXT1 = "text1";
        private static final String KEY_TEXT2 = "text2";
        private static final String KEY_WHATEVER_URL = "url_whatever";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, InsightItemData insightItemData) {
            insightItemData.colorName = v1.r0(jsonObject, "color", null);
            insightItemData.glyphName = v1.r0(jsonObject, KEY_GLYPH_NAME, null);
            insightItemData.text1 = v1.r0(jsonObject, KEY_TEXT1, null);
            insightItemData.text2 = v1.r0(jsonObject, KEY_TEXT2, null);
            insightItemData.lovedUrl = v1.r0(jsonObject, KEY_LOVED_URL, null);
            insightItemData.whateverUrl = v1.r0(jsonObject, KEY_WHATEVER_URL, null);
            insightItemData.notLikedUrl = v1.r0(jsonObject, KEY_NOT_LIKED_URL, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public InsightItemData newItemData() {
            return new InsightItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(InsightItemData insightItemData, JsonObject jsonObject) {
            jsonObject.addProperty("color", insightItemData.colorName);
            jsonObject.addProperty(KEY_GLYPH_NAME, insightItemData.glyphName);
            jsonObject.addProperty(KEY_TEXT1, insightItemData.text1);
            jsonObject.addProperty(KEY_TEXT2, insightItemData.text2);
            jsonObject.addProperty(KEY_LOVED_URL, insightItemData.lovedUrl);
            jsonObject.addProperty(KEY_WHATEVER_URL, insightItemData.whateverUrl);
            jsonObject.addProperty(KEY_NOT_LIKED_URL, insightItemData.notLikedUrl);
        }
    }

    public InsightItemData() {
        super(WS_TYPE);
    }
}
