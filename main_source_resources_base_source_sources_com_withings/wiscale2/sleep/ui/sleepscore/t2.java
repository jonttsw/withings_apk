package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SleepNapListActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class t2 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepNapListActivity.f f61524a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(SleepNapListActivity.f fVar) {
        super(0);
        this.f61524a = fVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f61524a.f60643b, "EXTRA_DAY"));
    }
}
