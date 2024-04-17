package com.withings.nervehealth.ui;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class n extends kotlin.jvm.internal.s implements ym0.l<ws.f, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(NerveHealthViewModel nerveHealthViewModel) {
        super(1, nerveHealthViewModel, NerveHealthViewModel.class, "onViewportChanged", "onViewportChanged$nervehealth_ui_release(Lcom/withings/graph/model/TimeGraphViewport;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(ws.f fVar) {
        ws.f p02 = fVar;
        kotlin.jvm.internal.u.j(p02, "p0");
        ((NerveHealthViewModel) this.receiver).e1(p02);
        return nm0.y.f85009a;
    }
}
