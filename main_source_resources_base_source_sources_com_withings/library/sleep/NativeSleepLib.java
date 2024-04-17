package com.withings.library.sleep;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NativeSleepLib.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J~\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u0081\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0082 J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006J\u0011\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006H\u0082 J\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u001bH\u0082 ¨\u0006\u001d"}, d2 = {"Lcom/withings/library/sleep/NativeSleepLib;", "", "()V", "compute", "Lcom/withings/library/sleep/SleepScoreStruct;", "lightDuration", "", "deepDuration", "remDuration", "manualDuration", "wakeUpCount", "durationToWakeUp", "enableWakeUpTile", "durationToSleep", "enableAsleepTile", "startDate", "endDate", "bedInTimes", "", "bedOutTimes", "countPreviousNights", "deviceModel", "computeNative", "getConstants", "Lcom/withings/library/sleep/SleepScoreConstants;", "getConstantsNative", "getGenericConstants", "Lcom/withings/library/sleep/SleepScoreGenericConstants;", "getGenericConstantsNative", "sleep-lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class NativeSleepLib {
    public NativeSleepLib() {
        System.loadLibrary("sleep-lib");
    }

    private final native SleepScoreStruct computeNative(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int[] iArr, int[] iArr2, int i23, int i24);

    private final native SleepScoreConstants getConstantsNative(int i11);

    private final native SleepScoreGenericConstants getGenericConstantsNative();

    public final SleepScoreStruct compute(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int[] bedInTimes, int[] bedOutTimes, int i23, int i24) {
        u.j(bedInTimes, "bedInTimes");
        u.j(bedOutTimes, "bedOutTimes");
        return computeNative(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, bedInTimes, bedOutTimes, i23, i24);
    }

    public final SleepScoreConstants getConstants(int i11) {
        return getConstantsNative(i11);
    }

    public final SleepScoreGenericConstants getGenericConstants() {
        return getGenericConstantsNative();
    }
}
