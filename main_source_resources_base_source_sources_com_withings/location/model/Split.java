package com.withings.location.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.Duration;
/* compiled from: Split.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/withings/location/model/Split;", "", "duration", "Lorg/joda/time/Duration;", "distance", "", "(Lorg/joda/time/Duration;D)V", "getDistance", "()D", "getDuration", "()Lorg/joda/time/Duration;", "speed", "", "getSpeed", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Split {
    private final double distance;
    private final Duration duration;

    public Split(Duration duration, double d11) {
        u.j(duration, "duration");
        this.duration = duration;
        this.distance = d11;
    }

    public static /* synthetic */ Split copy$default(Split split, Duration duration, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            duration = split.duration;
        }
        if ((i11 & 2) != 0) {
            d11 = split.distance;
        }
        return split.copy(duration, d11);
    }

    public final Duration component1() {
        return this.duration;
    }

    public final double component2() {
        return this.distance;
    }

    public final Split copy(Duration duration, double d11) {
        u.j(duration, "duration");
        return new Split(duration, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Split)) {
            return false;
        }
        Split split = (Split) obj;
        if (u.e(this.duration, split.duration) && Double.compare(this.distance, split.distance) == 0) {
            return true;
        }
        return false;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    public final float getSpeed() {
        return (float) (this.distance / this.duration.getStandardSeconds());
    }

    public int hashCode() {
        return Double.hashCode(this.distance) + (this.duration.hashCode() * 31);
    }

    public String toString() {
        Duration duration = this.duration;
        double d11 = this.distance;
        return "Split(duration=" + duration + ", distance=" + d11 + ")";
    }
}
