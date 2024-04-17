package com.withings.tutorials.ui.screens.modes.pregnancy;
/* compiled from: PregnancyModeActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class d0 extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(PregnancyModeActivity pregnancyModeActivity) {
        super(0, pregnancyModeActivity, PregnancyModeActivity.class, "onBack", "onBack()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Object a11;
        PregnancyModeActivity pregnancyModeActivity = (PregnancyModeActivity) this.receiver;
        int i11 = PregnancyModeActivity.f45779h;
        pregnancyModeActivity.getClass();
        try {
            pregnancyModeActivity.onBackPressed();
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (nm0.k.b(a11) != null) {
            pregnancyModeActivity.finish();
        }
        return nm0.y.f85009a;
    }
}
