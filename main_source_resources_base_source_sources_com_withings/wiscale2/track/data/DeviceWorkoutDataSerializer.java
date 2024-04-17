package com.withings.wiscale2.track.data;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.DeviceWorkoutData;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: DeviceWorkoutDataSerializer.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/withings/wiscale2/track/data/DeviceWorkoutDataSerializer;", "Lcom/withings/wiscale2/track/data/Track$Serializer;", "Lcom/withings/workout/workoutdata/DeviceWorkoutData;", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", LearnMoreManager.KEY_LEARN_MORE_JSON, "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/google/gson/JsonDeserializationContext;", "jsonData", "Lcom/google/gson/JsonObject;", "serialize", "trackData", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceWorkoutDataSerializer implements Track.Serializer<DeviceWorkoutData>, JsonDeserializer<DeviceWorkoutData> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String KEY_END_DATE_AUTO = "enddate_auto";
    public static final String KEY_START_DATE_AUTO = "startdate_auto";

    /* compiled from: DeviceWorkoutDataSerializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/track/data/DeviceWorkoutDataSerializer$Companion;", "", "()V", "KEY_END_DATE_AUTO", "", "KEY_START_DATE_AUTO", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.withings.wiscale2.track.data.Track.Serializer
    public JsonObject serialize(DeviceWorkoutData trackData) {
        u.j(trackData, "trackData");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(KEY_START_DATE_AUTO, Integer.valueOf(trackData.getStartDateAuto() ? 1 : 0));
        jsonObject.addProperty(KEY_END_DATE_AUTO, Integer.valueOf(trackData.getEndDateAuto() ? 1 : 0));
        return jsonObject;
    }

    @Override // com.withings.wiscale2.track.data.Track.Serializer
    public DeviceWorkoutData deserialize(JsonObject jsonData) {
        u.j(jsonData, "jsonData");
        DeviceWorkoutData deviceWorkoutData = new DeviceWorkoutData();
        int o02 = v1.o0(0, KEY_START_DATE_AUTO, jsonData);
        int o03 = v1.o0(0, KEY_END_DATE_AUTO, jsonData);
        deviceWorkoutData.setStartDateAuto(o02 == 1);
        deviceWorkoutData.setEndDateAuto(o03 == 1);
        return deviceWorkoutData;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public DeviceWorkoutData deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        DeviceWorkoutData deviceWorkoutData = new DeviceWorkoutData();
        int o02 = v1.o0(0, KEY_START_DATE_AUTO, json);
        int o03 = v1.o0(0, KEY_END_DATE_AUTO, json);
        deviceWorkoutData.setStartDateAuto(o02 == 1);
        deviceWorkoutData.setEndDateAuto(o03 == 1);
        return deviceWorkoutData;
    }
}
