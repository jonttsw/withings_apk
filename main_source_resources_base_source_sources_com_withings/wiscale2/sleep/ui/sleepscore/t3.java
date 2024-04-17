package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToSleepActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class t3 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreTimeToSleepActivity.d f61525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(SleepScoreTimeToSleepActivity.d dVar) {
        super(0);
        this.f61525a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f61525a.f60866b, "EXTRA_SLEEP_TRACK"));
    }
}
