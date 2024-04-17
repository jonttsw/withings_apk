package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35488a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f35489b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r8.n nVar, CycleTrackingActivity cycleTrackingActivity) {
        super(1);
        this.f35488a = cycleTrackingActivity;
        this.f35489b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        CycleTrackingActivity.B3(this.f35488a, this.f35489b, l5.longValue());
        return nm0.y.f85009a;
    }
}
