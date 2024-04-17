package com.withings.cycletracking.ui;

import org.joda.time.LocalDate;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35557a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(CycleTrackingActivity cycleTrackingActivity) {
        super(0);
        this.f35557a = cycleTrackingActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        LocalDate now = LocalDate.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        CycleTrackingActivity.F3(this.f35557a, now);
        return nm0.y.f85009a;
    }
}
