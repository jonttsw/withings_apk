package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36092a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f36093b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ym0.a<nm0.y> aVar, CycleTrackingActivity cycleTrackingActivity) {
        super(0);
        this.f36092a = aVar;
        this.f36093b = cycleTrackingActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f36092a.invoke();
        CycleTrackingActivity.J3(this.f36093b, "factor", false, 6);
        return nm0.y.f85009a;
    }
}
