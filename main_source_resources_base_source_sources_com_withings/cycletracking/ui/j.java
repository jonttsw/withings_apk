package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final /* synthetic */ class j extends kotlin.jvm.internal.s implements ym0.l<Throwable, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(CycleTrackingActivity cycleTrackingActivity) {
        super(1, cycleTrackingActivity, CycleTrackingActivity.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(Throwable th2) {
        Throwable p02 = th2;
        kotlin.jvm.internal.u.j(p02, "p0");
        ((CycleTrackingActivity) this.receiver).G3();
        return nm0.y.f85009a;
    }
}
