package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreInterruptionsActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class c3 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreInterruptionsActivity.j f60903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(SleepScoreInterruptionsActivity.j jVar) {
        super(0);
        this.f60903a = jVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f60903a.f60692b, "EXTRA_SLEEP_TRACK"));
    }
}
