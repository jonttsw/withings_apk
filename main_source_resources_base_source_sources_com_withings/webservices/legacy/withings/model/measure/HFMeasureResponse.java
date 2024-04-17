package com.withings.webservices.legacy.withings.model.measure;

import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class HFMeasureResponse {
    public Map<Integer, List<WsHfMeasure>> groupsByType;
    public long latestDate;

    /* loaded from: classes4.dex */
    public static class WsHfMeasure {
        public final long date;
        public final int type;
        public final double value;

        public WsHfMeasure(long j5, int i11, int i12, double d11) {
            this.date = j5;
            this.type = i11;
            this.value = d11;
        }
    }
}
