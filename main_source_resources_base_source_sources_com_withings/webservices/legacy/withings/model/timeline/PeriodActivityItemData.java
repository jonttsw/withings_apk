package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class PeriodActivityItemData extends EventItemData {
    public static final String WS_TYPE = "period_activity";
    public List<String> ids;

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<PeriodActivityItemData> {
        private static final String KEY_DEVICE_ID = "deviceId";
        private static final String KEY_DURATION = "duration";
        private static final String KEY_GLYPH_NAME = "glyph";
        private static final String KEY_IDS = "ids";
        private static final String KEY_IMAGE_COUNT = "image_count";
        private static final String KEY_IMAGE_PARSED = "parsed";
        private static final String KEY_INTENSITY = "intensity";
        private static final String KEY_MESSAGE = "message";
        private static final String KEY_PATH_LIST = "path_list";
        private static final String KEY_RGB = "rgb";
        private static final String KEY_SIGN = "sign";
        private static final String KEY_SOURCE = "source";
        private static final String KEY_TIMESTAMP = "timestamp";
        private static final String KEY_TITLE = "title";
        private static final String KEY_URL = "url";
        private static final String KEY_VALUE = "value";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, PeriodActivityItemData periodActivityItemData) {
            periodActivityItemData.glyphName = v1.r0(jsonObject, KEY_GLYPH_NAME, null);
            periodActivityItemData.message = v1.r0(jsonObject, "message", null);
            periodActivityItemData.title = v1.r0(jsonObject, "title", null);
            periodActivityItemData.value = v1.o0(Integer.MIN_VALUE, "value", jsonObject);
            periodActivityItemData.rgb = v1.r0(jsonObject, KEY_RGB, null);
            periodActivityItemData.intensity = v1.o0(Integer.MIN_VALUE, KEY_INTENSITY, jsonObject);
            periodActivityItemData.source = v1.o0(26, "source", jsonObject);
            if (jsonObject.has(KEY_PATH_LIST) && jsonObject.get(KEY_PATH_LIST).isJsonArray()) {
                JsonArray asJsonArray = jsonObject.get(KEY_PATH_LIST).getAsJsonArray();
                int size = asJsonArray.size();
                periodActivityItemData.pathLists = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    PathList pathList = new PathList();
                    JsonObject asJsonObject = asJsonArray.get(i11).getAsJsonObject();
                    pathList.url = v1.r0(asJsonObject, "url", null);
                    pathList.sign = v1.r0(asJsonObject, KEY_SIGN, null);
                    pathList.timestamp = v1.p0(asJsonObject, KEY_TIMESTAMP, Long.MIN_VALUE);
                    pathList.imageCount = v1.o0(1, KEY_IMAGE_COUNT, asJsonObject);
                    pathList.parsed = v1.m0(asJsonObject, KEY_IMAGE_PARSED);
                    pathList.deviceId = v1.p0(asJsonObject, KEY_DEVICE_ID, 0L);
                    periodActivityItemData.pathLists.add(pathList);
                }
            }
            periodActivityItemData.duration = v1.p0(jsonObject, "duration", Long.MIN_VALUE);
            if (jsonObject.has(KEY_IDS) && jsonObject.get(KEY_IDS).isJsonArray()) {
                JsonArray asJsonArray2 = jsonObject.getAsJsonArray(KEY_IDS).getAsJsonArray();
                periodActivityItemData.ids = new ArrayList();
                for (int i12 = 0; i12 < asJsonArray2.size(); i12++) {
                    periodActivityItemData.ids.add(asJsonArray2.get(i12).getAsString());
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public PeriodActivityItemData newItemData() {
            return new PeriodActivityItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(PeriodActivityItemData periodActivityItemData, JsonObject jsonObject) {
            jsonObject.addProperty(KEY_GLYPH_NAME, periodActivityItemData.glyphName);
            jsonObject.addProperty("message", periodActivityItemData.message);
            jsonObject.addProperty("title", periodActivityItemData.title);
            jsonObject.addProperty("value", Integer.valueOf(periodActivityItemData.value));
            jsonObject.addProperty(KEY_RGB, periodActivityItemData.rgb);
            jsonObject.addProperty(KEY_INTENSITY, Integer.valueOf(periodActivityItemData.intensity));
            jsonObject.addProperty("source", Integer.valueOf(periodActivityItemData.source));
            if (periodActivityItemData.pathLists != null) {
                JsonArray jsonArray = new JsonArray();
                for (PathList pathList : periodActivityItemData.pathLists) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("url", pathList.url);
                    jsonObject2.addProperty(KEY_SIGN, pathList.sign);
                    jsonObject2.addProperty(KEY_TIMESTAMP, Long.valueOf(pathList.timestamp));
                    jsonObject2.addProperty(KEY_IMAGE_COUNT, Integer.valueOf(pathList.imageCount));
                    jsonObject2.addProperty(KEY_IMAGE_PARSED, Boolean.valueOf(pathList.parsed));
                    jsonObject2.addProperty(KEY_DEVICE_ID, Long.valueOf(pathList.deviceId));
                    jsonArray.add(jsonObject2);
                }
                jsonObject.add(KEY_PATH_LIST, jsonArray);
            }
            jsonObject.addProperty("duration", Long.valueOf(periodActivityItemData.duration));
            if (periodActivityItemData.ids != null) {
                JsonArray jsonArray2 = new JsonArray();
                for (String str : periodActivityItemData.ids) {
                    jsonArray2.add(new JsonPrimitive(str));
                }
                jsonObject.add(KEY_IDS, jsonArray2);
            }
        }
    }

    public PeriodActivityItemData() {
        super(WS_TYPE);
    }
}
