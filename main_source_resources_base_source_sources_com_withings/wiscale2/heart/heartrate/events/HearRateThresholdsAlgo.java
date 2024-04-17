package com.withings.wiscale2.heart.heartrate.events;

import kotlin.Metadata;
/* compiled from: HearRateThresholdsAlgo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/events/HearRateThresholdsAlgo;", "", "", "getDaysToRetrieveNumber", "()I", "", "initThresholds", "()[I", "lowHRThreshold", "highHRThreshold", "restingDailyHR", "", "restingDailyTimestamp", "previousRestingDailyHR", "previousRestingDailyTimestamp", "updateThresholds", "(II[I[J[I[J)[I", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HearRateThresholdsAlgo {

    /* renamed from: a  reason: collision with root package name */
    public static final HearRateThresholdsAlgo f57620a = new Object();

    public final native int getDaysToRetrieveNumber();

    public final native int[] initThresholds();

    public final native int[] updateThresholds(int i11, int i12, int[] iArr, long[] jArr, int[] iArr2, long[] jArr2);
}
