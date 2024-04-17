package com.withings.wiscale2.activity.workout.model.temperature;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemperatureZone.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/temperature/TemperatureZonesType;", "", ConstantsWs.REDOX_DATA_MODEL_ORDER, "", "(Ljava/lang/String;II)V", "getOrder", "()I", "OVERHEATING", "PERFORMANCE", "WARMING_UP", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TemperatureZonesType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TemperatureZonesType[] $VALUES;
    public static final TemperatureZonesType OVERHEATING = new TemperatureZonesType("OVERHEATING", 0, 2);
    public static final TemperatureZonesType PERFORMANCE = new TemperatureZonesType("PERFORMANCE", 1, 1);
    public static final TemperatureZonesType WARMING_UP = new TemperatureZonesType("WARMING_UP", 2, 0);
    private final int order;

    private static final /* synthetic */ TemperatureZonesType[] $values() {
        return new TemperatureZonesType[]{OVERHEATING, PERFORMANCE, WARMING_UP};
    }

    static {
        TemperatureZonesType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TemperatureZonesType(String str, int i11, int i12) {
        this.order = i12;
    }

    public static a<TemperatureZonesType> getEntries() {
        return $ENTRIES;
    }

    public static TemperatureZonesType valueOf(String str) {
        return (TemperatureZonesType) Enum.valueOf(TemperatureZonesType.class, str);
    }

    public static TemperatureZonesType[] values() {
        return (TemperatureZonesType[]) $VALUES.clone();
    }

    public final int getOrder() {
        return this.order;
    }
}
