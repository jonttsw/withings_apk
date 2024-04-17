package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f35726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35727b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r8.n nVar, CycleTrackingActivity cycleTrackingActivity) {
        super(0);
        this.f35726a = nVar;
        this.f35727b = cycleTrackingActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        if (!this.f35726a.N()) {
            this.f35727b.finish();
        }
        return nm0.y.f85009a;
    }
}
