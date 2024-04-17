package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class TimelapseItemData extends EventItemData {
    public static final String WS_TYPE = "timelapse";

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<TimelapseItemData> {
        private static final String KEY_DEVICE_ID = "deviceId";
        private static final String KEY_PATH_LIST = "path_list";
        private static final String KEY_SIGN = "sign";
        private static final String KEY_SOURCE = "source";
        private static final String KEY_URL = "url";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, TimelapseItemData timelapseItemData) {
            timelapseItemData.source = v1.o0(26, "source", jsonObject);
            if (jsonObject.has(KEY_PATH_LIST) && jsonObject.get(KEY_PATH_LIST).isJsonArray()) {
                JsonArray asJsonArray = jsonObject.get(KEY_PATH_LIST).getAsJsonArray();
                int size = asJsonArray.size();
                timelapseItemData.pathLists = new ArrayList(size);
                if (size > 0) {
                    PathList pathList = new PathList();
                    JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
                    pathList.url = v1.r0(asJsonObject, "url", null);
                    pathList.sign = v1.r0(asJsonObject, KEY_SIGN, null);
                    pathList.deviceId = v1.p0(asJsonObject, KEY_DEVICE_ID, 0L);
                    timelapseItemData.pathLists.add(pathList);
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public TimelapseItemData newItemData() {
            return new TimelapseItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(TimelapseItemData timelapseItemData, JsonObject jsonObject) {
            jsonObject.addProperty("source", Integer.valueOf(timelapseItemData.source));
            if (timelapseItemData.pathLists != null) {
                JsonArray jsonArray = new JsonArray();
                for (PathList pathList : timelapseItemData.pathLists) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("url", pathList.url);
                    jsonObject2.addProperty(KEY_SIGN, pathList.sign);
                    jsonObject2.addProperty(KEY_DEVICE_ID, Long.valueOf(pathList.deviceId));
                    jsonArray.add(jsonObject2);
                }
                jsonObject.add(KEY_PATH_LIST, jsonArray);
            }
        }
    }

    public TimelapseItemData() {
        super(WS_TYPE);
    }
}
