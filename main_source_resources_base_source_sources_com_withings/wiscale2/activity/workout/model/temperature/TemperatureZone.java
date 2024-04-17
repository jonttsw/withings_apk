package com.withings.wiscale2.activity.workout.model.temperature;

import androidx.compose.material.o;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: TemperatureZone.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/temperature/TemperatureZone;", "", "minValue", "", "maxValue", "type", "Lcom/withings/wiscale2/activity/workout/model/temperature/TemperatureZonesType;", "(FFLcom/withings/wiscale2/activity/workout/model/temperature/TemperatureZonesType;)V", "getMaxValue", "()F", "getMinValue", "getType", "()Lcom/withings/wiscale2/activity/workout/model/temperature/TemperatureZonesType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TemperatureZone {
    public static final int $stable = 0;
    private final float maxValue;
    private final float minValue;
    private final TemperatureZonesType type;

    public TemperatureZone(float f11, float f12, TemperatureZonesType type) {
        u.j(type, "type");
        this.minValue = f11;
        this.maxValue = f12;
        this.type = type;
    }

    public static /* synthetic */ TemperatureZone copy$default(TemperatureZone temperatureZone, float f11, float f12, TemperatureZonesType temperatureZonesType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = temperatureZone.minValue;
        }
        if ((i11 & 2) != 0) {
            f12 = temperatureZone.maxValue;
        }
        if ((i11 & 4) != 0) {
            temperatureZonesType = temperatureZone.type;
        }
        return temperatureZone.copy(f11, f12, temperatureZonesType);
    }

    public final float component1() {
        return this.minValue;
    }

    public final float component2() {
        return this.maxValue;
    }

    public final TemperatureZonesType component3() {
        return this.type;
    }

    public final TemperatureZone copy(float f11, float f12, TemperatureZonesType type) {
        u.j(type, "type");
        return new TemperatureZone(f11, f12, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemperatureZone)) {
            return false;
        }
        TemperatureZone temperatureZone = (TemperatureZone) obj;
        if (Float.compare(this.minValue, temperatureZone.minValue) == 0 && Float.compare(this.maxValue, temperatureZone.maxValue) == 0 && this.type == temperatureZone.type) {
            return true;
        }
        return false;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final TemperatureZonesType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + o.a(this.maxValue, Float.hashCode(this.minValue) * 31, 31);
    }

    public String toString() {
        float f11 = this.minValue;
        float f12 = this.maxValue;
        TemperatureZonesType temperatureZonesType = this.type;
        return "TemperatureZone(minValue=" + f11 + ", maxValue=" + f12 + ", type=" + temperatureZonesType + ")";
    }
}
