package com.withings.library.measure.ws;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.network.android.interceptors.AppQueryParamInterceptor;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public class MeasureGroupResponse {
    public final boolean hasMore;
    public final WsMeasureGroup[] list;
    public final long updateTime;

    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<MeasureGroupResponse> {
        private WsMeasure getMeasure(JsonObject jsonObject) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            String str;
            int asInt = jsonObject.getAsJsonPrimitive("type").getAsInt();
            int asInt2 = jsonObject.getAsJsonPrimitive(HealthConstants.FoodIntake.UNIT).getAsInt();
            double asDouble = jsonObject.getAsJsonPrimitive("value").getAsDouble();
            if (jsonObject.has(WsVasistasSerie.KEY_ALGO)) {
                num = Integer.valueOf(jsonObject.get(WsVasistasSerie.KEY_ALGO).getAsInt());
            } else {
                num = null;
            }
            if (jsonObject.has(AppQueryParamInterceptor.KEY_APP_VERSION)) {
                num2 = Integer.valueOf(jsonObject.get(AppQueryParamInterceptor.KEY_APP_VERSION).getAsInt());
            } else {
                num2 = null;
            }
            if (jsonObject.has("apppfmid")) {
                num3 = Integer.valueOf(jsonObject.get("apppfmid").getAsInt());
            } else {
                num3 = null;
            }
            if (jsonObject.has("position")) {
                num4 = Integer.valueOf(jsonObject.get("position").getAsInt());
            } else {
                num4 = null;
            }
            if (jsonObject.has("algo_params")) {
                str = jsonObject.get("algo_params").getAsJsonObject().toString();
            } else {
                str = null;
            }
            return new WsMeasure(asInt, asInt2, asDouble, num, num2, num3, num4, str);
        }

        private WsMeasureGroup getMeasureGroup(JsonObject jsonObject) {
            boolean z5;
            JsonArray asJsonArray = jsonObject.getAsJsonArray("measures");
            long asLong = jsonObject.getAsJsonPrimitive("grpid").getAsLong();
            int asInt = jsonObject.getAsJsonPrimitive("attrib").getAsInt();
            long asLong2 = 1000 * jsonObject.getAsJsonPrimitive("date").getAsLong();
            long asLong3 = jsonObject.getAsJsonPrimitive("modified").getAsLong();
            int asInt2 = jsonObject.getAsJsonPrimitive("category").getAsInt();
            String r02 = v1.r0(jsonObject, "comment", null);
            if (v1.o0(0, "deleted", jsonObject) > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            long p02 = v1.p0(jsonObject, "userid", -1L);
            long p03 = v1.p0(jsonObject, HiAnalyticsConstant.HaKey.BI_KEY_APPID, -1L);
            long p04 = v1.p0(jsonObject, "deviceid", 0L);
            long p05 = v1.p0(jsonObject, "brand", 0L);
            int size = asJsonArray.size();
            WsMeasure[] wsMeasureArr = new WsMeasure[size];
            for (int i11 = 0; i11 < size; i11++) {
                wsMeasureArr[i11] = getMeasure(asJsonArray.get(i11).getAsJsonObject());
            }
            return new WsMeasureGroup(asLong, asInt, asLong2, asLong3, asInt2, r02, z5, wsMeasureArr, p02, p03, p04, p05);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public MeasureGroupResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            long asLong = jsonElement.getAsJsonObject().getAsJsonPrimitive("updatetime").getAsLong() * 1000;
            int o02 = v1.o0(0, GetHealthAttributeResponse.FIELD_HAS_MORE_NAME, jsonElement);
            JsonArray asJsonArray = jsonElement.getAsJsonObject().get("measuregrps").getAsJsonArray();
            int size = asJsonArray.size();
            WsMeasureGroup[] wsMeasureGroupArr = new WsMeasureGroup[size];
            for (int i11 = 0; i11 < size; i11++) {
                wsMeasureGroupArr[i11] = getMeasureGroup(asJsonArray.get(i11).getAsJsonObject());
            }
            return new MeasureGroupResponse(asLong, o02 == 1, wsMeasureGroupArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class WsMeasure {
        public final String algoParams;
        public final Integer algoVersion;
        public final Integer appVersion;
        public final Integer limbPosition;
        public final Integer platform;
        public final int type;
        public final int unit;
        public final double value;

        public WsMeasure(int i11, int i12, double d11, Integer num, Integer num2, Integer num3, Integer num4, String str) {
            this.type = i11;
            this.unit = i12;
            this.value = d11;
            this.algoVersion = num;
            this.appVersion = num2;
            this.platform = num3;
            this.limbPosition = num4;
            this.algoParams = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class WsMeasureGroup {
        public final long appid;
        public final int attrib;
        public final long brand;
        public final int category;
        public final String comment;
        public final long date;
        public final boolean deleted;
        public final long deviceid;
        public final long grpid;
        public final WsMeasure[] measures;
        public final long modified;
        public final long userid;

        public WsMeasureGroup(long j5, int i11, long j11, long j12, int i12, String str, boolean z5, WsMeasure[] wsMeasureArr, long j13, long j14, long j15, long j16) {
            this.grpid = j5;
            this.attrib = i11;
            this.date = j11;
            this.modified = j12;
            this.category = i12;
            this.comment = str;
            this.deleted = z5;
            this.measures = wsMeasureArr;
            this.userid = j13;
            this.appid = j14;
            this.deviceid = j15;
            this.brand = j16;
        }
    }

    public MeasureGroupResponse(long j5, boolean z5, WsMeasureGroup[] wsMeasureGroupArr) {
        this.updateTime = j5;
        this.hasMore = z5;
        this.list = wsMeasureGroupArr;
    }

    public MeasureGroupResponse() {
        this.updateTime = 0L;
        this.hasMore = true;
        this.list = null;
    }
}
