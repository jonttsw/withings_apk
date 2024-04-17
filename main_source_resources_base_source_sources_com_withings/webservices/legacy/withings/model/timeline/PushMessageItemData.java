package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class PushMessageItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "pushmessage";
    public String colorName;
    public Details details;
    public String firstName;
    public String glyphName;
    public ImageP4 imageP4;
    public String lastName;
    public String message;
    public String messageType;
    public int receiverId;
    public int senderId;
    public String title;

    /* loaded from: classes4.dex */
    protected static abstract class BaseSerializer<D extends PushMessageItemData> extends WsTimelineItemData.Serializer<D> {
        private static final String KEY_COLOR_NAME = "color";
        private static final String KEY_DETAILS = "details";
        private static final String KEY_DETAILS_CONTENT = "content";
        private static final String KEY_DETAILS_TYPE = "type";
        private static final String KEY_FIRST_NAME = "firstname";
        private static final String KEY_GLYPH_NAME = "glyph";
        private static final String KEY_IMAGE_P4 = "p4";
        private static final String KEY_IMAGE_P4_128 = "128x128";
        private static final String KEY_IMAGE_P4_256 = "256x256";
        private static final String KEY_IMAGE_P4_64 = "64x64";
        private static final String KEY_LAST_NAME = "lastname";
        private static final String KEY_MESSAGE = "message";
        private static final String KEY_MESSAGE_TYPE = "type_message";
        private static final String KEY_RECEIVER_ID = "receiverid";
        private static final String KEY_SENDER_ID = "senderid";
        private static final String KEY_TITLE = "title";

        protected Details deserializeDetails(JsonObject jsonObject) {
            Details details = new Details();
            details.type = v1.r0(jsonObject, "type", null);
            details.content = v1.r0(jsonObject, "content", null);
            return details;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public ImageP4 deserializeImageP4(JsonObject jsonObject) {
            ImageP4 imageP4 = new ImageP4();
            imageP4.size64 = v1.r0(jsonObject, KEY_IMAGE_P4_64, null);
            imageP4.size128 = v1.r0(jsonObject, KEY_IMAGE_P4_128, null);
            imageP4.size256 = v1.r0(jsonObject, KEY_IMAGE_P4_256, null);
            return imageP4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public /* bridge */ /* synthetic */ void deserializeIntoData(JsonObject jsonObject, WsTimelineItemData wsTimelineItemData) {
            deserializeIntoData(jsonObject, (JsonObject) ((PushMessageItemData) wsTimelineItemData));
        }

        protected JsonObject serializeDetails(D d11) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type", d11.details.type);
            jsonObject.addProperty("content", d11.details.content);
            return jsonObject;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public JsonObject serializeImageP4(ImageP4 imageP4) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(KEY_IMAGE_P4_64, imageP4.size64);
            jsonObject.addProperty(KEY_IMAGE_P4_128, imageP4.size128);
            jsonObject.addProperty(KEY_IMAGE_P4_256, imageP4.size256);
            return jsonObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public /* bridge */ /* synthetic */ void serializeIntoJson(WsTimelineItemData wsTimelineItemData, JsonObject jsonObject) {
            serializeIntoJson((BaseSerializer<D>) ((PushMessageItemData) wsTimelineItemData), jsonObject);
        }

        public void deserializeIntoData(JsonObject jsonObject, D d11) {
            d11.colorName = v1.r0(jsonObject, "color", null);
            d11.glyphName = v1.r0(jsonObject, KEY_GLYPH_NAME, null);
            if (jsonObject.has(KEY_IMAGE_P4) && jsonObject.get(KEY_IMAGE_P4).isJsonObject()) {
                d11.imageP4 = deserializeImageP4(jsonObject.get(KEY_IMAGE_P4).getAsJsonObject());
            }
            d11.message = v1.r0(jsonObject, "message", null);
            d11.senderId = v1.o0(0, KEY_SENDER_ID, jsonObject);
            d11.receiverId = v1.o0(0, KEY_RECEIVER_ID, jsonObject);
            d11.lastName = v1.r0(jsonObject, KEY_LAST_NAME, null);
            d11.firstName = v1.r0(jsonObject, KEY_FIRST_NAME, null);
            d11.title = v1.r0(jsonObject, "title", null);
            d11.messageType = v1.r0(jsonObject, KEY_MESSAGE_TYPE, null);
            if (jsonObject.has(KEY_DETAILS) && jsonObject.get(KEY_DETAILS).isJsonObject()) {
                d11.details = deserializeDetails(jsonObject.get(KEY_DETAILS).getAsJsonObject());
            }
        }

        public void serializeIntoJson(D d11, JsonObject jsonObject) {
            jsonObject.addProperty("color", d11.colorName);
            jsonObject.addProperty(KEY_GLYPH_NAME, d11.glyphName);
            ImageP4 imageP4 = d11.imageP4;
            if (imageP4 != null) {
                jsonObject.add(KEY_IMAGE_P4, serializeImageP4(imageP4));
            }
            jsonObject.addProperty("message", d11.message);
            jsonObject.addProperty(KEY_SENDER_ID, Integer.valueOf(d11.senderId));
            jsonObject.addProperty(KEY_RECEIVER_ID, Integer.valueOf(d11.receiverId));
            jsonObject.addProperty(KEY_LAST_NAME, d11.lastName);
            jsonObject.addProperty(KEY_FIRST_NAME, d11.firstName);
            jsonObject.addProperty("title", d11.title);
            jsonObject.addProperty(KEY_MESSAGE_TYPE, d11.messageType);
            if (d11.details != null) {
                jsonObject.add(KEY_DETAILS, serializeDetails(d11));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class Details {
        public String content;
        public String type;
    }

    /* loaded from: classes4.dex */
    public static class ImageP4 {
        public String size128;
        public String size256;
        public String size64;
    }

    /* loaded from: classes4.dex */
    public static class Serializer extends BaseSerializer<PushMessageItemData> {
        @Override // com.withings.webservices.legacy.withings.model.timeline.PushMessageItemData.BaseSerializer
        public /* bridge */ /* synthetic */ void deserializeIntoData(JsonObject jsonObject, PushMessageItemData pushMessageItemData) {
            super.deserializeIntoData(jsonObject, (JsonObject) pushMessageItemData);
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.PushMessageItemData.BaseSerializer
        public /* bridge */ /* synthetic */ void serializeIntoJson(PushMessageItemData pushMessageItemData, JsonObject jsonObject) {
            super.serializeIntoJson((Serializer) pushMessageItemData, jsonObject);
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public PushMessageItemData newItemData() {
            return new PushMessageItemData();
        }
    }

    public PushMessageItemData() {
        super(WS_TYPE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PushMessageItemData(String str) {
        super(str);
    }
}
