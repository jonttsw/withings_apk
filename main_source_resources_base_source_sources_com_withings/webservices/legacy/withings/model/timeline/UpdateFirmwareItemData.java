package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class UpdateFirmwareItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "update_firmware";
    public String colorName;
    public String glyphName;
    public String message;
    public String title;
    public String url;

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<UpdateFirmwareItemData> {
        private static final String KEY_COLOR_NAME = "color";
        private static final String KEY_GLYPH_NAME = "glyph";
        private static final String KEY_MESSAGE = "message";
        private static final String KEY_TITLE = "title";
        private static final String KEY_URL = "url";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, UpdateFirmwareItemData updateFirmwareItemData) {
            updateFirmwareItemData.colorName = v1.r0(jsonObject, "color", null);
            updateFirmwareItemData.glyphName = v1.r0(jsonObject, KEY_GLYPH_NAME, null);
            updateFirmwareItemData.title = v1.r0(jsonObject, "title", null);
            updateFirmwareItemData.message = v1.r0(jsonObject, "message", null);
            updateFirmwareItemData.url = v1.r0(jsonObject, "url", null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public UpdateFirmwareItemData newItemData() {
            return new UpdateFirmwareItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(UpdateFirmwareItemData updateFirmwareItemData, JsonObject jsonObject) {
            jsonObject.addProperty("color", updateFirmwareItemData.colorName);
            jsonObject.addProperty(KEY_GLYPH_NAME, updateFirmwareItemData.glyphName);
            jsonObject.addProperty("title", updateFirmwareItemData.title);
            jsonObject.addProperty("message", updateFirmwareItemData.message);
            jsonObject.addProperty("url", updateFirmwareItemData.url);
        }
    }

    public UpdateFirmwareItemData() {
        super(WS_TYPE);
    }
}
