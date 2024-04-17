package com.withings.wiscale2.device.common.feature.activitygoal;

import com.withings.views.view.SetValueView;
import kotlin.jvm.internal.n0;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class n implements SetValueView.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0 f50949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SetValueView f50950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(n0 n0Var, SetValueView setValueView) {
        this.f50949a = n0Var;
        this.f50950b = setValueView;
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void E2(float f11) {
        n0 n0Var = this.f50949a;
        n0Var.f76254a = an0.a.b(f11 / 1000) * 1000;
        SetValueView this_with = this.f50950b;
        kotlin.jvm.internal.u.i(this_with, "$this_with");
        b0.c(this_with, n0Var.f76254a);
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void u() {
    }
}
