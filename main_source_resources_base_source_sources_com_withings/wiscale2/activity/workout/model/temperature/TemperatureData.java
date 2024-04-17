package com.withings.wiscale2.activity.workout.model.temperature;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.Duration;
/* compiled from: TemperatureData.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/temperature/TemperatureData;", "", "duration", "Lorg/joda/time/Duration;", "value", "", "(Lorg/joda/time/Duration;F)V", "getDuration", "()Lorg/joda/time/Duration;", "getValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TemperatureData {
    public static final int $stable = 8;
    private final Duration duration;
    private final float value;

    public TemperatureData(Duration duration, float f11) {
        u.j(duration, "duration");
        this.duration = duration;
        this.value = f11;
    }

    public static /* synthetic */ TemperatureData copy$default(TemperatureData temperatureData, Duration duration, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            duration = temperatureData.duration;
        }
        if ((i11 & 2) != 0) {
            f11 = temperatureData.value;
        }
        return temperatureData.copy(duration, f11);
    }

    public final Duration component1() {
        return this.duration;
    }

    public final float component2() {
        return this.value;
    }

    public final TemperatureData copy(Duration duration, float f11) {
        u.j(duration, "duration");
        return new TemperatureData(duration, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemperatureData)) {
            return false;
        }
        TemperatureData temperatureData = (TemperatureData) obj;
        if (u.e(this.duration, temperatureData.duration) && Float.compare(this.value, temperatureData.value) == 0) {
            return true;
        }
        return false;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value) + (this.duration.hashCode() * 31);
    }

    public String toString() {
        Duration duration = this.duration;
        float f11 = this.value;
        return "TemperatureData(duration=" + duration + ", value=" + f11 + ")";
    }
}
