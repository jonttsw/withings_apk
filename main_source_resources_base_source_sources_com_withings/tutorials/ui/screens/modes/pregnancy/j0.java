package com.withings.tutorials.ui.screens.modes.pregnancy;

import org.joda.time.DateTime;
/* compiled from: PregnancyModeActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class j0 extends kotlin.jvm.internal.s implements ym0.l<DateTime, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(PregnancyModeViewModel pregnancyModeViewModel) {
        super(1, pregnancyModeViewModel, PregnancyModeViewModel.class, "setConceptionDate", "setConceptionDate$ui_release(Lorg/joda/time/DateTime;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(DateTime dateTime) {
        DateTime p02 = dateTime;
        kotlin.jvm.internal.u.j(p02, "p0");
        ((PregnancyModeViewModel) this.receiver).m1(p02);
        return nm0.y.f85009a;
    }
}
