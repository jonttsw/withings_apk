package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes4.dex */
public class CvrItemData extends EventItemData {
    public static final String WS_TYPE = "cvr";

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<CvrItemData> {
        private static final String KEY_DEVICE_ID = "deviceId";
        private static final String KEY_DURATION = "duration";
        private static final String KEY_EPOCH = "epoch";
        private static final String KEY_PATH_LIST = "path_list";
        private static final String KEY_SIGN = "sign";
        private static final String KEY_SOURCE = "source";
        private static final String KEY_URL = "url";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, CvrItemData cvrItemData) {
            cvrItemData.source = v1.o0(26, "source", jsonObject);
            if (jsonObject.has(KEY_PATH_LIST) && jsonObject.get(KEY_PATH_LIST).isJsonArray()) {
                JsonArray asJsonArray = jsonObject.get(KEY_PATH_LIST).getAsJsonArray();
                int size = asJsonArray.size();
                cvrItemData.pathLists = new ArrayList(size);
                if (size > 0) {
                    cvrItemData.duration = 0L;
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        PathList pathList = new PathList();
                        JsonObject asJsonObject = it.next().getAsJsonObject();
                        pathList.url = v1.r0(asJsonObject, "url", null);
                        pathList.sign = v1.r0(asJsonObject, KEY_SIGN, null);
                        pathList.deviceId = v1.p0(asJsonObject, KEY_DEVICE_ID, 0L);
                        pathList.duration = v1.o0(0, "duration", asJsonObject);
                        pathList.epoch = v1.p0(asJsonObject, KEY_EPOCH, 0L);
                        cvrItemData.pathLists.add(pathList);
                        cvrItemData.duration += pathList.duration / 1000;
                    }
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public CvrItemData newItemData() {
            return new CvrItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(CvrItemData cvrItemData, JsonObject jsonObject) {
            jsonObject.addProperty("source", Integer.valueOf(cvrItemData.source));
            if (cvrItemData.pathLists != null) {
                JsonArray jsonArray = new JsonArray();
                for (PathList pathList : cvrItemData.pathLists) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("url", pathList.url);
                    jsonObject2.addProperty(KEY_SIGN, pathList.sign);
                    jsonObject2.addProperty(KEY_DEVICE_ID, Long.valueOf(pathList.deviceId));
                    jsonObject2.addProperty("duration", Integer.valueOf(pathList.duration));
                    jsonObject2.addProperty(KEY_EPOCH, Long.valueOf(pathList.epoch));
                    jsonArray.add(jsonObject2);
                }
                jsonObject.add(KEY_PATH_LIST, jsonArray);
            }
        }
    }

    public CvrItemData() {
        super(WS_TYPE);
    }
}
