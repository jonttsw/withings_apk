package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class h0 extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f35578b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r8.n nVar, CycleTrackingActivity cycleTrackingActivity) {
        super(1);
        this.f35577a = cycleTrackingActivity;
        this.f35578b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        CycleTrackingActivity.B3(this.f35577a, this.f35578b, l5.longValue());
        return nm0.y.f85009a;
    }
}
