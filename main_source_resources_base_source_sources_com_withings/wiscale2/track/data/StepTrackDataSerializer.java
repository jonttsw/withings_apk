package com.withings.wiscale2.track.data;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.StepWorkoutData;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: StepTrackDataSerializer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/track/data/StepTrackDataSerializer;", "Lcom/withings/wiscale2/track/data/Track$Serializer;", "Lcom/withings/workout/workoutdata/StepWorkoutData;", "()V", "deserialize", "jsonData", "Lcom/google/gson/JsonObject;", "serialize", "trackData", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepTrackDataSerializer implements Track.Serializer<StepWorkoutData> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String KEY_ASCENT = "ascent";
    private static final String KEY_CALORIES = "calories";
    private static final String KEY_CUMULMET = "cumulMet";
    private static final String KEY_DEVICE_END_DATE = "deviceEndDate";
    private static final String KEY_DEVICE_INTENSITY = "intensity";
    private static final String KEY_DEVICE_START_DATE = "deviceStartDate";
    private static final String KEY_DISTANCE = "distance";
    private static final String KEY_HR_AVERAGE = "hrAverage";
    private static final String KEY_HR_MAX = "hrMax";
    private static final String KEY_HR_MIN = "hrMin";
    private static final String KEY_HR_ZONE_INTENSE = "hrZoneIntense";
    private static final String KEY_HR_ZONE_LIGHT = "hrZoneLight";
    private static final String KEY_HR_ZONE_MODERATE = "hrZoneModerate";
    private static final String KEY_HR_ZONE_PEAK = "hrZonePeak";
    private static final String KEY_MANUAL_CALORIES = "manualCalories";
    private static final String KEY_MANUAL_DISTANCE = "manual_distance";
    private static final String KEY_PAUSE_DURATION = "pauseDuration";
    private static final String KEY_STEPS = "steps";
    private static final String KEY_TEMPERATURE_AVERAGE = "temperatureAverage";
    private static final String KEY_TEMPERATURE_MAX = "temperatureMax";
    private static final String KEY_TEMPERATURE_MIN = "temperatureMin";

    /* compiled from: StepTrackDataSerializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withings/wiscale2/track/data/StepTrackDataSerializer$Companion;", "", "()V", "KEY_ASCENT", "", "KEY_CALORIES", "KEY_CUMULMET", "KEY_DEVICE_END_DATE", "KEY_DEVICE_INTENSITY", "KEY_DEVICE_START_DATE", "KEY_DISTANCE", "KEY_HR_AVERAGE", "KEY_HR_MAX", "KEY_HR_MIN", "KEY_HR_ZONE_INTENSE", "KEY_HR_ZONE_LIGHT", "KEY_HR_ZONE_MODERATE", "KEY_HR_ZONE_PEAK", "KEY_MANUAL_CALORIES", "KEY_MANUAL_DISTANCE", "KEY_PAUSE_DURATION", "KEY_STEPS", "KEY_TEMPERATURE_AVERAGE", "KEY_TEMPERATURE_MAX", "KEY_TEMPERATURE_MIN", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.withings.wiscale2.track.data.Track.Serializer
    public StepWorkoutData deserialize(JsonObject jsonData) {
        u.j(jsonData, "jsonData");
        StepWorkoutData stepWorkoutData = new StepWorkoutData();
        stepWorkoutData.setSteps(jsonData.get(KEY_STEPS).getAsInt());
        stepWorkoutData.setAscent(v1.o0(0, KEY_ASCENT, jsonData));
        stepWorkoutData.setDistance(v1.o0(0, "distance", jsonData));
        stepWorkoutData.setManualDistance(v1.o0(0, KEY_MANUAL_DISTANCE, jsonData));
        stepWorkoutData.setCalories(v1.o0(0, "calories", jsonData));
        stepWorkoutData.setCumulMet(v1.o0(0, KEY_CUMULMET, jsonData));
        stepWorkoutData.setHrAverage(v1.n0(jsonData, KEY_HR_AVERAGE));
        stepWorkoutData.setHrMin(v1.o0(0, KEY_HR_MIN, jsonData));
        stepWorkoutData.setHrMax(v1.o0(0, KEY_HR_MAX, jsonData));
        stepWorkoutData.setHrZoneLight(v1.o0(0, KEY_HR_ZONE_LIGHT, jsonData));
        stepWorkoutData.setHrZoneModerate(v1.o0(0, KEY_HR_ZONE_MODERATE, jsonData));
        stepWorkoutData.setHrZoneIntense(v1.o0(0, KEY_HR_ZONE_INTENSE, jsonData));
        stepWorkoutData.setHrZonePeak(v1.o0(0, KEY_HR_ZONE_PEAK, jsonData));
        stepWorkoutData.setTemperatureMax(v1.n0(jsonData, KEY_TEMPERATURE_MAX));
        stepWorkoutData.setTemperatureMin(v1.n0(jsonData, KEY_TEMPERATURE_MIN));
        stepWorkoutData.setTemperatureAverage(v1.n0(jsonData, KEY_TEMPERATURE_AVERAGE));
        if (jsonData.has(KEY_DEVICE_START_DATE) && !jsonData.get(KEY_DEVICE_START_DATE).isJsonNull()) {
            stepWorkoutData.setDeviceStartDate(new DateTime(v1.p0(jsonData, KEY_DEVICE_START_DATE, 0L)));
        }
        if (jsonData.has(KEY_DEVICE_END_DATE) && !jsonData.get(KEY_DEVICE_END_DATE).isJsonNull()) {
            stepWorkoutData.setDeviceEndDate(new DateTime(v1.p0(jsonData, KEY_DEVICE_END_DATE, 0L)));
        }
        stepWorkoutData.setIntensity(v1.o0(0, KEY_DEVICE_INTENSITY, jsonData));
        stepWorkoutData.setManualCalories(v1.o0(0, KEY_MANUAL_CALORIES, jsonData));
        stepWorkoutData.setPauseDuration(v1.o0(0, KEY_PAUSE_DURATION, jsonData));
        return stepWorkoutData;
    }

    @Override // com.withings.wiscale2.track.data.Track.Serializer
    public JsonObject serialize(StepWorkoutData trackData) {
        u.j(trackData, "trackData");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(KEY_STEPS, Integer.valueOf(trackData.getSteps()));
        jsonObject.addProperty(KEY_ASCENT, Integer.valueOf(trackData.getAscent()));
        jsonObject.addProperty("distance", Integer.valueOf(trackData.getDistance()));
        jsonObject.addProperty(KEY_MANUAL_DISTANCE, Integer.valueOf(trackData.getManualDistance()));
        jsonObject.addProperty("calories", Integer.valueOf(trackData.getCalories()));
        jsonObject.addProperty(KEY_CUMULMET, Integer.valueOf(trackData.getCumulMet()));
        jsonObject.addProperty(KEY_HR_AVERAGE, Float.valueOf(trackData.getHrAverage()));
        jsonObject.addProperty(KEY_HR_MIN, Integer.valueOf(trackData.getHrMin()));
        jsonObject.addProperty(KEY_HR_MAX, Integer.valueOf(trackData.getHrMax()));
        jsonObject.addProperty(KEY_HR_ZONE_LIGHT, Integer.valueOf(trackData.getHrZoneLight()));
        jsonObject.addProperty(KEY_HR_ZONE_MODERATE, Integer.valueOf(trackData.getHrZoneModerate()));
        jsonObject.addProperty(KEY_HR_ZONE_INTENSE, Integer.valueOf(trackData.getHrZoneIntense()));
        jsonObject.addProperty(KEY_HR_ZONE_PEAK, Integer.valueOf(trackData.getHrZonePeak()));
        jsonObject.addProperty(KEY_TEMPERATURE_MAX, Float.valueOf(trackData.getTemperatureMax()));
        jsonObject.addProperty(KEY_TEMPERATURE_MIN, Float.valueOf(trackData.getTemperatureMin()));
        jsonObject.addProperty(KEY_TEMPERATURE_AVERAGE, Float.valueOf(trackData.getTemperatureAverage()));
        DateTime deviceStartDate = trackData.getDeviceStartDate();
        if (deviceStartDate != null) {
            jsonObject.addProperty(KEY_DEVICE_START_DATE, Long.valueOf(deviceStartDate.getMillis()));
        }
        DateTime deviceEndDate = trackData.getDeviceEndDate();
        if (deviceEndDate != null) {
            jsonObject.addProperty(KEY_DEVICE_END_DATE, Long.valueOf(deviceEndDate.getMillis()));
        }
        jsonObject.addProperty(KEY_DEVICE_INTENSITY, Integer.valueOf(trackData.getIntensity()));
        jsonObject.addProperty(KEY_MANUAL_CALORIES, Integer.valueOf(trackData.getManualCalories()));
        jsonObject.addProperty(KEY_PAUSE_DURATION, Integer.valueOf(trackData.getPauseDuration()));
        return jsonObject;
    }
}
