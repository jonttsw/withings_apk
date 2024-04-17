package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class NoiseDetectedItemData extends EventItemData {
    public static final String WS_TYPE = "noise_detected";

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<NoiseDetectedItemData> {
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
        private static final String KEY_URL = "url";
        private static final String KEY_VALUE = "value";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, NoiseDetectedItemData noiseDetectedItemData) {
            noiseDetectedItemData.glyphName = v1.r0(jsonObject, KEY_GLYPH_NAME, null);
            noiseDetectedItemData.message = v1.r0(jsonObject, "message", null);
            noiseDetectedItemData.title = v1.r0(jsonObject, "title", null);
            noiseDetectedItemData.value = v1.o0(Integer.MIN_VALUE, "value", jsonObject);
            noiseDetectedItemData.rgb = v1.r0(jsonObject, KEY_RGB, null);
            noiseDetectedItemData.intensity = v1.o0(Integer.MIN_VALUE, KEY_INTENSITY, jsonObject);
            noiseDetectedItemData.source = v1.o0(26, "source", jsonObject);
            if (jsonObject.has(KEY_PATH_LIST) && jsonObject.get(KEY_PATH_LIST).isJsonArray()) {
                JsonArray asJsonArray = jsonObject.get(KEY_PATH_LIST).getAsJsonArray();
                int size = asJsonArray.size();
                noiseDetectedItemData.pathLists = new ArrayList(size);
                if (size > 0) {
                    PathList pathList = new PathList();
                    JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
                    pathList.url = v1.r0(asJsonObject, "url", null);
                    pathList.sign = v1.r0(asJsonObject, KEY_SIGN, null);
                    pathList.imageCount = v1.o0(1, KEY_IMAGE_COUNT, asJsonObject);
                    pathList.parsed = v1.m0(asJsonObject, KEY_IMAGE_PARSED);
                    pathList.deviceId = v1.p0(asJsonObject, KEY_DEVICE_ID, 0L);
                    noiseDetectedItemData.pathLists.add(pathList);
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public NoiseDetectedItemData newItemData() {
            return new NoiseDetectedItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(NoiseDetectedItemData noiseDetectedItemData, JsonObject jsonObject) {
            jsonObject.addProperty(KEY_GLYPH_NAME, noiseDetectedItemData.glyphName);
            jsonObject.addProperty("message", noiseDetectedItemData.message);
            jsonObject.addProperty("title", noiseDetectedItemData.title);
            jsonObject.addProperty("value", Integer.valueOf(noiseDetectedItemData.value));
            jsonObject.addProperty(KEY_RGB, noiseDetectedItemData.rgb);
            jsonObject.addProperty(KEY_INTENSITY, Integer.valueOf(noiseDetectedItemData.intensity));
            jsonObject.addProperty("source", Integer.valueOf(noiseDetectedItemData.source));
            if (noiseDetectedItemData.pathLists != null) {
                JsonArray jsonArray = new JsonArray();
                for (PathList pathList : noiseDetectedItemData.pathLists) {
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

    public NoiseDetectedItemData() {
        super(WS_TYPE);
    }
}
