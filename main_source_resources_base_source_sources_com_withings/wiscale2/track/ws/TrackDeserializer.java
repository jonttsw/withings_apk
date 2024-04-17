package com.withings.wiscale2.track.ws;

import android.os.Parcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.withings.webservices.legacy.common.DateTimeSerializer;
import com.withings.webservices.legacy.common.DurationSerializer;
import com.withings.wiscale2.track.data.DeviceWorkoutDataSerializer;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.DeviceWorkoutData;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.SwimWorkoutData;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* loaded from: classes5.dex */
public class TrackDeserializer implements JsonDeserializer<Track>, ExclusionStrategy {
    private void fixGPSFromPlatform(Track track) {
        GpsSummary gpsSummary = track.getGpsSummary();
        if (gpsSummary != null && gpsSummary.getDistance() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getAverageSpeed() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getMinSpeed() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getMaxSpeed() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getStartLatitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getStartLongitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getEndLatitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getEndLongitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getCenterLatitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getCenterLongitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getSpanLatitudeDelta() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && gpsSummary.getSpanLongitudeDelta() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            track.setGpsSummary(null);
        }
    }

    public Type getDataClass(int i11, int i12) {
        if (i12 == 20000) {
            return DeviceWorkoutData.class;
        }
        if (i11 == 7) {
            return SwimWorkoutData.class;
        }
        if (i11 == 37) {
            return SleepTrackData.class;
        }
        return StepWorkoutData.class;
    }

    @Override // com.google.gson.ExclusionStrategy
    public boolean shouldSkipClass(Class<?> cls) {
        return Parcelable.class.equals(cls);
    }

    @Override // com.google.gson.ExclusionStrategy
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Track deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Gson create = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateTimeSerializer()).registerTypeAdapter(Duration.class, new DurationSerializer()).registerTypeAdapter(DeviceWorkoutData.class, new DeviceWorkoutDataSerializer()).addDeserializationExclusionStrategy(this).create();
        Track track = (Track) create.fromJson(jsonElement, (Class<Object>) Track.class);
        track.setData((Parcelable) create.fromJson(jsonElement.getAsJsonObject().get("data"), getDataClass(track.getCategory(), track.getAttrib())));
        fixGPSFromPlatform(track);
        return track;
    }
}
