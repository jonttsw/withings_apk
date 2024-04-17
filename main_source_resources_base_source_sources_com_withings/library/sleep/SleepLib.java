package com.withings.library.sleep;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.withings.library.sleep.platform.DispatcherRepository;
import gb.b;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import nm0.y;
import ym0.l;
/* compiled from: SleepLib.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010#J\u0085\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0099\u0001\u0010 \u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/withings/library/sleep/SleepLib;", "", "", "lightDuration", "deepDuration", "remDuration", "manualDuration", "wakeUpCount", "durationToWakeUp", "", "enableWakeUpTile", "durationToSleep", "enableAsleepTile", "startDate", "endDate", "", "bedInTimes", "bedOutTimes", "countPreviousNights", "deviceModel", "Lcom/withings/library/sleep/SleepScoreStruct;", "compute", "(IIIIIIZIZII[I[III)Lcom/withings/library/sleep/SleepScoreStruct;", "Lcom/withings/library/sleep/SleepScoreConstants;", "getConstants", "(I)Lcom/withings/library/sleep/SleepScoreConstants;", "Lcom/withings/library/sleep/SleepScoreGenericConstants;", "getGenericConstants", "()Lcom/withings/library/sleep/SleepScoreGenericConstants;", "Lkotlin/Function1;", "Lnm0/y;", "callback", "asyncCompute", "(IIIIIIZIZII[I[IIILym0/l;)V", CrashHianalyticsData.EVENT_ID_CRASH, "()V", "Lcom/withings/library/sleep/NativeSleepLib;", "nativeSleepLib", "Lcom/withings/library/sleep/NativeSleepLib;", "Lcom/withings/library/sleep/platform/DispatcherRepository;", "dispatcherRepository", "Lcom/withings/library/sleep/platform/DispatcherRepository;", "<init>", "sleep-lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class SleepLib {
    private final NativeSleepLib nativeSleepLib = new NativeSleepLib();
    private final DispatcherRepository dispatcherRepository = new DispatcherRepository();

    public final void asyncCompute(int i11, int i12, int i13, int i14, int i15, int i16, boolean z5, int i17, boolean z11, int i18, int i19, int[] bedInTimes, int[] bedOutTimes, int i21, int i22, l<? super SleepScoreStruct, y> callback) {
        u.j(bedInTimes, "bedInTimes");
        u.j(bedOutTimes, "bedOutTimes");
        u.j(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(new b(), null, null, new SleepLib$asyncCompute$1(this, i11, i12, i13, i14, i15, i16, z11, i17, z5, i18, i19, bedInTimes, bedOutTimes, i21, i22, callback, null), 3, null);
    }

    public final SleepScoreStruct compute(int i11, int i12, int i13, int i14, int i15, int i16, boolean z5, int i17, boolean z11, int i18, int i19, int[] bedInTimes, int[] bedOutTimes, int i21, int i22) {
        u.j(bedInTimes, "bedInTimes");
        u.j(bedOutTimes, "bedOutTimes");
        return this.nativeSleepLib.compute(i11, i12, i13, i14, i15, i16, z5 ? 1 : 0, i17, z11 ? 1 : 0, i18, i19, bedInTimes, bedOutTimes, i21, i22);
    }

    public final void crash() {
        throw new RuntimeException("Test exception le retour");
    }

    public final SleepScoreConstants getConstants(int i11) {
        return this.nativeSleepLib.getConstants(i11);
    }

    public final SleepScoreGenericConstants getGenericConstants() {
        return this.nativeSleepLib.getGenericConstants();
    }
}
