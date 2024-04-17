package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRecoveryActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class f3 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreRecoveryActivity.g f60969a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(SleepScoreRecoveryActivity.g gVar) {
        super(0);
        this.f60969a = gVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f60969a.f60721b, "EXTRA_SLEEP_TRACK"));
    }
}
