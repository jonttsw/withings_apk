package com.withings.nutrisync.ui;
/* compiled from: VitaminCDatavizActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class f extends kotlin.jvm.internal.s implements ym0.l<Throwable, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(VitaminCDatavizActivity vitaminCDatavizActivity) {
        super(1, vitaminCDatavizActivity, VitaminCDatavizActivity.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(Throwable th2) {
        Throwable p02 = th2;
        kotlin.jvm.internal.u.j(p02, "p0");
        ((VitaminCDatavizActivity) this.receiver).D3(p02);
        return nm0.y.f85009a;
    }
}
