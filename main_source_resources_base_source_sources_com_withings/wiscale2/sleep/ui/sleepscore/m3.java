package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class m3 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreSnoringActivity.k f61153a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(SleepScoreSnoringActivity.k kVar) {
        super(0);
        this.f61153a = kVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f61153a.f60803b, "EXTRA_SLEEP_TRACK"));
    }
}
