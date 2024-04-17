package com.withings.core.data.aggregate.ws;

import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class WsAggregate {
    @SerializedName("type_37")
    public float ascent;
    public int brand;
    @SerializedName("type_38")
    public float calories;
    public String date;
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
    @SerializedName("complete")
    public boolean isCompleted;
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
    @SerializedName("type_54")
    public SpO2Values spO2Values;
    @SerializedName("type_36")
    public int steps;
    @SerializedName("synchrotime")
    public DateTime synchroTime;
    @SerializedName("type_208")
    public TemperatureValues temperatureValues;
    public String timezone;

    /* loaded from: classes3.dex */
    public static class HRValues {
        @SerializedName("average")
        public float hrAverage;
        @SerializedName(HealthConstants.HeartRate.MAX)
        public int hrMax;
        @SerializedName(HealthConstants.HeartRate.MIN)
        public int hrMin;
        @SerializedName("resting")
        public int hrResting;
        @SerializedName("zone_2")
        public int hrZoneIntense;
        @SerializedName("zone_0")
        public int hrZoneLight;
        @SerializedName("zone_1")
        public int hrZoneModerate;
        @SerializedName("zone_3")
        public int hrZonePeak;
    }

    /* loaded from: classes3.dex */
    public static class Response {
        @SerializedName("agreg")
        public List<WsAggregate> aggregates;
        @SerializedName(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME)
        public boolean hasMore;
        public int offset;
    }

    /* loaded from: classes3.dex */
    public static class SpO2Values {
        @SerializedName("average")
        public float averageSpO2;
        @SerializedName("us_average")
        public float averageSpO2US;
        @SerializedName("nbmeas_auto")
        public int nbMeasureAuto;
        @SerializedName("nbmeas_manual")
        public int nbMeasureManual;
    }

    /* loaded from: classes3.dex */
    public static class TemperatureValues {
        @SerializedName("average")
        public float temperatureAverage;
        @SerializedName(HealthConstants.HeartRate.MAX)
        public float temperatureMax;
        @SerializedName(HealthConstants.HeartRate.MIN)
        public float temperatureMin;
    }
}
