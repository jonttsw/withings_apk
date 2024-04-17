package com.withings.wiscale2.track.data;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.SwimWorkoutData;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: SwimWorkoutDataSerializer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/track/data/SwimWorkoutDataSerializer;", "Lcom/withings/wiscale2/track/data/Track$Serializer;", "Lcom/withings/workout/workoutdata/SwimWorkoutData;", "()V", "deserialize", "jsonData", "Lcom/google/gson/JsonObject;", "serialize", "trackData", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SwimWorkoutDataSerializer implements Track.Serializer<SwimWorkoutData> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_POOL_LENGTH = 25;
    private static final String KEY_ALGO_PAUSE_DURATION = "algoPauseDuration";
    private static final String KEY_CALORIES = "calories";
    private static final String KEY_DEVICE_END_DATE = "deviceEndDate";
    private static final String KEY_DEVICE_INTENSITY = "intensity";
    private static final String KEY_DEVICE_START_DATE = "deviceStartDate";
    private static final String KEY_HR_AVERAGE = "hrAverage";
    private static final String KEY_HR_MAX = "hrMax";
    private static final String KEY_HR_MIN = "hrMin";
    private static final String KEY_HR_ZONE_INTENSE = "hrZoneIntense";
    private static final String KEY_HR_ZONE_LIGHT = "hrZoneLight";
    private static final String KEY_HR_ZONE_MODERATE = "hrZoneModerate";
    private static final String KEY_HR_ZONE_PEAK = "hrZonePeak";
    private static final String KEY_LAPS = "laps";
    private static final String KEY_MANUAL_CALORIES = "manualCalories";
    private static final String KEY_MANUAL_LAPS = "manualLaps";
    private static final String KEY_MOVEMENTS = "movements";
    private static final String KEY_PAUSE_DURATION = "pauseDuration";
    private static final String KEY_POOL_LENGTH = "poolLength";
    private static final String KEY_SWIM_ALGO_VERSION = "swimAlgoVersion";
    private static final String KEY_SWIM_TYPE = "swimType";
    private static final String KEY_TEMPERATURE_AVERAGE = "temperatureAverage";
    private static final String KEY_TEMPERATURE_MAX = "temperatureMax";
    private static final String KEY_TEMPERATURE_MIN = "temperatureMin";

    /* compiled from: SwimWorkoutDataSerializer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/withings/wiscale2/track/data/SwimWorkoutDataSerializer$Companion;", "", "()V", "DEFAULT_POOL_LENGTH", "", "KEY_ALGO_PAUSE_DURATION", "", "KEY_CALORIES", "KEY_DEVICE_END_DATE", "KEY_DEVICE_INTENSITY", "KEY_DEVICE_START_DATE", "KEY_HR_AVERAGE", "KEY_HR_MAX", "KEY_HR_MIN", "KEY_HR_ZONE_INTENSE", "KEY_HR_ZONE_LIGHT", "KEY_HR_ZONE_MODERATE", "KEY_HR_ZONE_PEAK", "KEY_LAPS", "KEY_MANUAL_CALORIES", "KEY_MANUAL_LAPS", "KEY_MOVEMENTS", "KEY_PAUSE_DURATION", "KEY_POOL_LENGTH", "KEY_SWIM_ALGO_VERSION", "KEY_SWIM_TYPE", "KEY_TEMPERATURE_AVERAGE", "KEY_TEMPERATURE_MAX", "KEY_TEMPERATURE_MIN", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.withings.wiscale2.track.data.Track.Serializer
    public SwimWorkoutData deserialize(JsonObject jsonData) {
        u.j(jsonData, "jsonData");
        SwimWorkoutData swimWorkoutData = new SwimWorkoutData();
        swimWorkoutData.setLaps(jsonData.get("laps").getAsInt());
        swimWorkoutData.setMovements(jsonData.get(KEY_MOVEMENTS).getAsInt());
        int o02 = v1.o0(9, KEY_SWIM_TYPE, jsonData);
        Integer valueOf = Integer.valueOf(o02);
        if (o02 <= 0) {
            valueOf = null;
        }
        swimWorkoutData.setSwimType(valueOf != null ? valueOf.intValue() : 9);
        swimWorkoutData.setPoolLength(Integer.valueOf(v1.o0(25, KEY_POOL_LENGTH, jsonData)));
        if (jsonData.has(KEY_MANUAL_LAPS) && !jsonData.get(KEY_MANUAL_LAPS).isJsonNull()) {
            swimWorkoutData.setManualLaps(Integer.valueOf(v1.o0(0, KEY_MANUAL_LAPS, jsonData)));
        }
        if (jsonData.has(KEY_SWIM_ALGO_VERSION) && !jsonData.get(KEY_SWIM_ALGO_VERSION).isJsonNull()) {
            swimWorkoutData.setAlgoVersion(Integer.valueOf(v1.o0(0, KEY_SWIM_ALGO_VERSION, jsonData)));
        }
        swimWorkoutData.setCalories(jsonData.get("calories").getAsInt());
        swimWorkoutData.setHrAverage(v1.n0(jsonData, KEY_HR_AVERAGE));
        swimWorkoutData.setHrMin(v1.o0(0, KEY_HR_MIN, jsonData));
        swimWorkoutData.setHrMax(v1.o0(0, KEY_HR_MAX, jsonData));
        swimWorkoutData.setHrZoneLight(v1.o0(0, KEY_HR_ZONE_LIGHT, jsonData));
        swimWorkoutData.setHrZoneModerate(v1.o0(0, KEY_HR_ZONE_MODERATE, jsonData));
        swimWorkoutData.setHrZoneIntense(v1.o0(0, KEY_HR_ZONE_INTENSE, jsonData));
        swimWorkoutData.setHrZonePeak(v1.o0(0, KEY_HR_ZONE_PEAK, jsonData));
        swimWorkoutData.setTemperatureMax(v1.n0(jsonData, KEY_TEMPERATURE_MAX));
        swimWorkoutData.setTemperatureMin(v1.n0(jsonData, KEY_TEMPERATURE_MIN));
        swimWorkoutData.setTemperatureAverage(v1.n0(jsonData, KEY_TEMPERATURE_AVERAGE));
        if (jsonData.has(KEY_DEVICE_START_DATE) && !jsonData.get(KEY_DEVICE_START_DATE).isJsonNull()) {
            swimWorkoutData.setDeviceStartDate(new DateTime(v1.p0(jsonData, KEY_DEVICE_START_DATE, 0L)));
        }
        if (jsonData.has(KEY_DEVICE_END_DATE) && !jsonData.get(KEY_DEVICE_END_DATE).isJsonNull()) {
            swimWorkoutData.setDeviceEndDate(new DateTime(v1.p0(jsonData, KEY_DEVICE_END_DATE, 0L)));
        }
        swimWorkoutData.setIntensity(v1.o0(0, KEY_DEVICE_INTENSITY, jsonData));
        swimWorkoutData.setManualCalories(v1.o0(0, KEY_MANUAL_CALORIES, jsonData));
        swimWorkoutData.setPauseDuration(v1.o0(0, KEY_PAUSE_DURATION, jsonData));
        swimWorkoutData.setAlgoPauseDuration(v1.o0(0, KEY_ALGO_PAUSE_DURATION, jsonData));
        return swimWorkoutData;
    }

    @Override // com.withings.wiscale2.track.data.Track.Serializer
    public JsonObject serialize(SwimWorkoutData trackData) {
        u.j(trackData, "trackData");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("laps", Integer.valueOf(trackData.getLaps()));
        jsonObject.addProperty(KEY_MOVEMENTS, Integer.valueOf(trackData.getMovements()));
        jsonObject.addProperty("calories", Integer.valueOf(trackData.getCalories()));
        jsonObject.addProperty(KEY_SWIM_TYPE, Integer.valueOf(trackData.getSwimType()));
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
        if (trackData.getDeviceStartDate() != null) {
            jsonObject.addProperty(KEY_DEVICE_START_DATE, Long.valueOf(trackData.getDeviceStartDate().getMillis()));
        }
        if (trackData.getDeviceEndDate() != null) {
            jsonObject.addProperty(KEY_DEVICE_END_DATE, Long.valueOf(trackData.getDeviceEndDate().getMillis()));
        }
        jsonObject.addProperty(KEY_DEVICE_INTENSITY, Integer.valueOf(trackData.getIntensity()));
        jsonObject.addProperty(KEY_MANUAL_CALORIES, Integer.valueOf(trackData.getManualCalories()));
        jsonObject.addProperty(KEY_POOL_LENGTH, Integer.valueOf(trackData.getPoolLengthOrDefault()));
        jsonObject.addProperty(KEY_PAUSE_DURATION, Integer.valueOf(trackData.getPauseDuration()));
        jsonObject.addProperty(KEY_ALGO_PAUSE_DURATION, Integer.valueOf(trackData.getAlgoPauseDuration()));
        jsonObject.addProperty(KEY_MANUAL_LAPS, trackData.getManualLaps());
        jsonObject.addProperty(KEY_SWIM_ALGO_VERSION, trackData.getAlgoVersion());
        return jsonObject;
    }
}
