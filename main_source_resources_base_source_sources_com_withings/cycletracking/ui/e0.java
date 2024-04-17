package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35527a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(CycleTrackingActivity cycleTrackingActivity) {
        super(0);
        this.f35527a = cycleTrackingActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        CycleTrackingActivity cycleTrackingActivity = this.f35527a;
        cycleTrackingActivity.setResult(0);
        cycleTrackingActivity.finish();
        return nm0.y.f85009a;
    }
}
