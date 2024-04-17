package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes4.dex */
public class TextItemData extends WsTimelineItemData {
    public static final String SIZE_LARGE = "large";
    public static final String SIZE_SMALL = "small";
    public static final String WS_TYPE = "text";
    public String analyticsId;
    public String colorName;
    public Details details;
    public String glyphName;
    public String hexcolor;
    public String imageUrl;
    public boolean isImageRounded;
    public String labelHexcolor;
    public String labelTitle;
    public String message;
    public String size;
    public String title;

    /* loaded from: classes4.dex */
    public static class Details {
        public String content;
        public String type;
    }

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<TextItemData> {
        private static final String KEY_ANALYTICS_ID = "analyticid";
        private static final String KEY_COLOR_NAME = "color";
        private static final String KEY_DETAILS = "details";
        private static final String KEY_DETAILS_CONTENT = "content";
        private static final String KEY_DETAILS_TYPE = "type";
        private static final String KEY_GLYPH_NAME = "glyph";
        private static final String KEY_HEXCOLOR = "hexcolor";
        private static final String KEY_IMAGE_URL = "img";
        private static final String KEY_IS_IMAGE_ROUNDED = "rounded";
        private static final String KEY_LABEL_HEXCOLOR = "label_hexcolor";
        private static final String KEY_LABEL_TITLE = "label_title";
        private static final String KEY_MESSAGE = "message";
        private static final String KEY_SIZE = "size";
        private static final String KEY_TITLE = "title";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, TextItemData textItemData) {
            textItemData.colorName = v1.r0(jsonObject, "color", null);
            textItemData.glyphName = v1.r0(jsonObject, KEY_GLYPH_NAME, null);
            textItemData.imageUrl = v1.r0(jsonObject, "img", null);
            textItemData.isImageRounded = v1.m0(jsonObject, KEY_IS_IMAGE_ROUNDED);
            textItemData.title = v1.r0(jsonObject, "title", null);
            textItemData.message = v1.r0(jsonObject, "message", null);
            textItemData.analyticsId = v1.r0(jsonObject, KEY_ANALYTICS_ID, null);
            textItemData.labelTitle = v1.r0(jsonObject, KEY_LABEL_TITLE, null);
            textItemData.labelHexcolor = v1.r0(jsonObject, KEY_LABEL_HEXCOLOR, null);
            textItemData.hexcolor = v1.r0(jsonObject, KEY_HEXCOLOR, null);
            if (jsonObject.has(KEY_DETAILS) && jsonObject.get(KEY_DETAILS).isJsonObject()) {
                JsonObject asJsonObject = jsonObject.get(KEY_DETAILS).getAsJsonObject();
                Details details = new Details();
                details.type = v1.r0(asJsonObject, "type", null);
                details.content = v1.r0(asJsonObject, "content", null);
                textItemData.details = details;
            }
            textItemData.size = v1.r0(jsonObject, KEY_SIZE, "small");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public TextItemData newItemData() {
            return new TextItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(TextItemData textItemData, JsonObject jsonObject) {
            jsonObject.addProperty("color", textItemData.colorName);
            jsonObject.addProperty(KEY_GLYPH_NAME, textItemData.glyphName);
            jsonObject.addProperty("img", textItemData.imageUrl);
            jsonObject.addProperty(KEY_IS_IMAGE_ROUNDED, Boolean.valueOf(textItemData.isImageRounded));
            jsonObject.addProperty("title", textItemData.title);
            jsonObject.addProperty("message", textItemData.message);
            jsonObject.addProperty(KEY_HEXCOLOR, textItemData.hexcolor);
            jsonObject.addProperty(KEY_LABEL_HEXCOLOR, textItemData.labelHexcolor);
            jsonObject.addProperty(KEY_LABEL_TITLE, textItemData.labelTitle);
            jsonObject.addProperty(KEY_ANALYTICS_ID, textItemData.analyticsId);
            if (textItemData.details != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("type", textItemData.details.type);
                jsonObject2.addProperty("content", textItemData.details.content);
                jsonObject.add(KEY_DETAILS, jsonObject2);
            }
            jsonObject.addProperty(KEY_SIZE, textItemData.size);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    @interface Size {
    }

    public TextItemData() {
        super("text");
    }
}
