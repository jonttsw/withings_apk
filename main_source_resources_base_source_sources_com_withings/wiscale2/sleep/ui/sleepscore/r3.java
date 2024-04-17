package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToGetUpActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class r3 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreTimeToGetUpActivity.e f61223a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(SleepScoreTimeToGetUpActivity.e eVar) {
        super(0);
        this.f61223a = eVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f61223a.f60839b, "EXTRA_SLEEP_TRACK"));
    }
}
