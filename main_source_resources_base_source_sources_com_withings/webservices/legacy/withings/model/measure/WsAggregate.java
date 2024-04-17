package com.withings.webservices.legacy.withings.model.measure;

import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class WsAggregate {
    @SerializedName("type_37")
    public float ascent;
    public int brand;
    @SerializedName("type_38")
    public float calories;
    public String date;
    @SerializedName("type_41")
    public float descent;
    @SerializedName("type_40")
    public float distance;
    @SerializedName("type_87")
    public float earnedCalories;
    @SerializedName("type_11")
    public HRValues hrvalues;
    @SerializedName("type_50")
    public int inactiveDurationSecond;
    @SerializedName("type_53")
    public int intenseMETDurationSecond;
    @SerializedName("manual_addition_calories")
    public float manualAdditionCalories;
    @SerializedName("manual_addition_distance")
    public float manualAdditionDistance;
    public DateTime midnight;
    @SerializedName("type_52")
    public int moderateMETDurationSecond;
    public DateTime modified;
    @SerializedName("type_49")
    public float passiveCalories;
    @SerializedName("type_51")
    public int softMETDurationSecond;
    @SerializedName("type_36")
    public int steps;
    @SerializedName("synchrotime")
    public DateTime synchroTime;
    public String timezone;

    /* loaded from: classes4.dex */
    public static class HRValues {
        @SerializedName("average")
        public float hrAverage;
        @SerializedName(HealthConstants.HeartRate.MAX)
        public int hrMax;
        @SerializedName(HealthConstants.HeartRate.MIN)
        public int hrMin;
        @SerializedName("zone_2")
        public int hrZoneIntense;
        @SerializedName("zone_0")
        public int hrZoneLight;
        @SerializedName("zone_1")
        public int hrZoneModerate;
        @SerializedName("zone_3")
        public int hrZonePeak;
    }

    /* loaded from: classes4.dex */
    public static class Response {
        @SerializedName("agreg")
        public List<WsAggregate> aggregates;
        @SerializedName(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME)
        public boolean hasMore;
        public int offset;
    }
}
