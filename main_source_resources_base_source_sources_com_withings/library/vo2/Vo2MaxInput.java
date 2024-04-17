package com.withings.library.vo2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.vo2.Vo2MaxInputNativeConstants;
import kotlin.Metadata;
/* compiled from: Vo2MaxInput.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0015\u0010\bR\u0011\u0010\u0016\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/withings/library/vo2/Vo2MaxInput;", "", "heartRate", "", "speed", "altitude", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "altitudeSource", "Lcom/withings/library/vo2/AltitudeSource;", "getAltitudeSource", "()Lcom/withings/library/vo2/AltitudeSource;", "getHeartRate", "heartRateQuality", "", "getHeartRateQuality", "()I", "rrInterval", "getRrInterval", "getSpeed", "steps", "getSteps", "userState", "Lcom/withings/library/vo2/UserState;", "getUserState", "()Lcom/withings/library/vo2/UserState;", "watts", "getWatts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toString", "", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vo2MaxInput {
    private final Double altitude;
    private final AltitudeSource altitudeSource;
    private final Double heartRate;
    private final int heartRateQuality;
    private final int rrInterval = 5000;
    private final Double speed;
    private final int steps;
    private final UserState userState;
    private final Integer watts;

    public Vo2MaxInput(Double d11, Double d12, Double d13) {
        int i11;
        this.heartRate = d11;
        this.speed = d12;
        this.altitude = d13;
        if (d11 != null && d11.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            i11 = 100;
        } else {
            i11 = 0;
        }
        this.heartRateQuality = i11;
        Vo2MaxInputNativeConstants.Companion companion = Vo2MaxInputNativeConstants.Companion;
        this.altitudeSource = companion.getETE_ALTITUDE_SOURCE_DEFAULT();
        this.userState = UserState.RUNNING;
        this.steps = companion.getETE_UNKNOWN_STEP_RATE();
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final AltitudeSource getAltitudeSource() {
        return this.altitudeSource;
    }

    public final Double getHeartRate() {
        return this.heartRate;
    }

    public final int getHeartRateQuality() {
        return this.heartRateQuality;
    }

    public final int getRrInterval() {
        return this.rrInterval;
    }

    public final Double getSpeed() {
        return this.speed;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final UserState getUserState() {
        return this.userState;
    }

    public final Integer getWatts() {
        return this.watts;
    }

    public String toString() {
        return "{ heartRate: " + this.heartRate + " - speed: " + this.speed + " - altitude: " + this.altitude + " }";
    }
}
