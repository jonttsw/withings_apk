package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class PeriodOfflineData extends WsTimelineItemData {
    public static final String WS_TYPE = "period_offline";
    public long duration;
    public String title;

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<PeriodOfflineData> {
        private static final String KEY_DURATION = "duration";
        private static final String KEY_TITLE = "title";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, PeriodOfflineData periodOfflineData) {
            periodOfflineData.duration = v1.p0(jsonObject, "duration", 0L);
            periodOfflineData.title = v1.r0(jsonObject, "title", null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public PeriodOfflineData newItemData() {
            return new PeriodOfflineData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(PeriodOfflineData periodOfflineData, JsonObject jsonObject) {
            jsonObject.addProperty("duration", Long.valueOf(periodOfflineData.duration));
            jsonObject.addProperty("title", periodOfflineData.title);
        }
    }

    public PeriodOfflineData() {
        super(WS_TYPE);
    }
}
