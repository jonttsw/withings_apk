package com.withings.weight.android.model;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SegmentalBodyCompositionMeasureType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withings/weight/android/model/SegmentalBodyCompositionMeasureType;", "", "wsIdentifier", "", "(Ljava/lang/String;II)V", "getWsIdentifier", "()I", "FatMass", "FatFreeMass", "MuscleMass", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentalBodyCompositionMeasureType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SegmentalBodyCompositionMeasureType[] $VALUES;
    private final int wsIdentifier;
    public static final SegmentalBodyCompositionMeasureType FatMass = new SegmentalBodyCompositionMeasureType("FatMass", 0, ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT);
    public static final SegmentalBodyCompositionMeasureType FatFreeMass = new SegmentalBodyCompositionMeasureType("FatFreeMass", 1, ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT);
    public static final SegmentalBodyCompositionMeasureType MuscleMass = new SegmentalBodyCompositionMeasureType("MuscleMass", 2, ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT);

    private static final /* synthetic */ SegmentalBodyCompositionMeasureType[] $values() {
        return new SegmentalBodyCompositionMeasureType[]{FatMass, FatFreeMass, MuscleMass};
    }

    static {
        SegmentalBodyCompositionMeasureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SegmentalBodyCompositionMeasureType(String str, int i11, int i12) {
        this.wsIdentifier = i12;
    }

    public static a<SegmentalBodyCompositionMeasureType> getEntries() {
        return $ENTRIES;
    }

    public static SegmentalBodyCompositionMeasureType valueOf(String str) {
        return (SegmentalBodyCompositionMeasureType) Enum.valueOf(SegmentalBodyCompositionMeasureType.class, str);
    }

    public static SegmentalBodyCompositionMeasureType[] values() {
        return (SegmentalBodyCompositionMeasureType[]) $VALUES.clone();
    }

    public final int getWsIdentifier() {
        return this.wsIdentifier;
    }
}
