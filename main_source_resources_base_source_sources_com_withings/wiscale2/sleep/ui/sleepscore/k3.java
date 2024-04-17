package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class k3 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreRegularityActivity.p f61115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(SleepScoreRegularityActivity.p pVar) {
        super(0);
        this.f61115a = pVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f61115a.f60763b, "EXTRA_SLEEP_TRACK"));
    }
}
