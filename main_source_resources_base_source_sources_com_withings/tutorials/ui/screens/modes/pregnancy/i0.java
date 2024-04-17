package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
/* compiled from: PregnancyModeActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class i0 extends kotlin.jvm.internal.s implements ym0.l<DueDateMethod, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(PregnancyModeViewModel pregnancyModeViewModel) {
        super(1, pregnancyModeViewModel, PregnancyModeViewModel.class, "setDueDateMethod", "setDueDateMethod$ui_release(Lcom/withings/tutorials/android/modes/pregnancy/survey/DueDateMethod;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(DueDateMethod dueDateMethod) {
        DueDateMethod p02 = dueDateMethod;
        kotlin.jvm.internal.u.j(p02, "p0");
        ((PregnancyModeViewModel) this.receiver).o1(p02);
        return nm0.y.f85009a;
    }
}
