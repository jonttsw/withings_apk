package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class AlertEnvironmentItemData extends EventItemData {
    public static final String WS_TYPE = "alert_environment";

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<AlertEnvironmentItemData> {
        private static final String KEY_DEVICE_ID = "deviceId";
        private static final String KEY_GLYPH_NAME = "glyph";
        private static final String KEY_IMAGE_COUNT = "image_count";
        private static final String KEY_IMAGE_PARSED = "parsed";
        private static final String KEY_INTENSITY = "intensity";
        private static final String KEY_MESSAGE = "message";
        private static final String KEY_PATH_LIST = "path_list";
        private static final String KEY_RGB = "rgb";
        private static final String KEY_SIGN = "sign";
        private static final String KEY_SOURCE = "source";
        private static final String KEY_TITLE = "title";
        private static final String KEY_UNIT = "unit";
        private static final String KEY_URL = "url";
        private static final String KEY_VALUE = "value";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, AlertEnvironmentItemData alertEnvironmentItemData) {
            alertEnvironmentItemData.glyphName = v1.r0(jsonObject, KEY_GLYPH_NAME, null);
            alertEnvironmentItemData.message = v1.r0(jsonObject, "message", null);
            alertEnvironmentItemData.title = v1.r0(jsonObject, "title", null);
            alertEnvironmentItemData.unit = v1.r0(jsonObject, "unit", null);
            alertEnvironmentItemData.value = v1.o0(Integer.MIN_VALUE, "value", jsonObject);
            alertEnvironmentItemData.rgb = v1.r0(jsonObject, KEY_RGB, null);
            alertEnvironmentItemData.intensity = v1.o0(Integer.MIN_VALUE, KEY_INTENSITY, jsonObject);
            alertEnvironmentItemData.source = v1.o0(26, "source", jsonObject);
            if (jsonObject.has(KEY_PATH_LIST) && jsonObject.get(KEY_PATH_LIST).isJsonArray()) {
                JsonArray asJsonArray = jsonObject.get(KEY_PATH_LIST).getAsJsonArray();
                int size = asJsonArray.size();
                alertEnvironmentItemData.pathLists = new ArrayList(size);
                if (size > 0) {
                    PathList pathList = new PathList();
                    JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
                    pathList.url = v1.r0(asJsonObject, "url", null);
                    pathList.sign = v1.r0(asJsonObject, KEY_SIGN, null);
                    pathList.imageCount = v1.o0(1, KEY_IMAGE_COUNT, asJsonObject);
                    pathList.parsed = v1.m0(asJsonObject, KEY_IMAGE_PARSED);
                    pathList.deviceId = v1.p0(asJsonObject, KEY_DEVICE_ID, 0L);
                    alertEnvironmentItemData.pathLists.add(pathList);
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public AlertEnvironmentItemData newItemData() {
            return new AlertEnvironmentItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(AlertEnvironmentItemData alertEnvironmentItemData, JsonObject jsonObject) {
            jsonObject.addProperty(KEY_GLYPH_NAME, alertEnvironmentItemData.glyphName);
            jsonObject.addProperty("message", alertEnvironmentItemData.message);
            jsonObject.addProperty("title", alertEnvironmentItemData.title);
            jsonObject.addProperty("unit", alertEnvironmentItemData.unit);
            jsonObject.addProperty("value", Integer.valueOf(alertEnvironmentItemData.value));
            jsonObject.addProperty(KEY_RGB, alertEnvironmentItemData.rgb);
            jsonObject.addProperty(KEY_INTENSITY, Integer.valueOf(alertEnvironmentItemData.intensity));
            jsonObject.addProperty("source", Integer.valueOf(alertEnvironmentItemData.source));
            if (alertEnvironmentItemData.pathLists != null) {
                JsonArray jsonArray = new JsonArray();
                for (PathList pathList : alertEnvironmentItemData.pathLists) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("url", pathList.url);
                    jsonObject2.addProperty(KEY_SIGN, pathList.sign);
                    jsonObject2.addProperty(KEY_IMAGE_COUNT, Integer.valueOf(pathList.imageCount));
                    jsonObject2.addProperty(KEY_IMAGE_PARSED, Boolean.valueOf(pathList.parsed));
                    jsonObject2.addProperty(KEY_DEVICE_ID, Long.valueOf(pathList.deviceId));
                    jsonArray.add(jsonObject2);
                }
                jsonObject.add(KEY_PATH_LIST, jsonArray);
            }
        }
    }

    public AlertEnvironmentItemData() {
        super(WS_TYPE);
    }
}
