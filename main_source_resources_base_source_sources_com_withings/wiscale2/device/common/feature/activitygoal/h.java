package com.withings.wiscale2.device.common.feature.activitygoal;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class h implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitnessAndStepsGoalSettingsFragment f50941a;

    public h(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment) {
        this.f50941a = fitnessAndStepsGoalSettingsFragment;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment = this.f50941a;
        d dVar = fitnessAndStepsGoalSettingsFragment.f50889k;
        if (dVar != null) {
            return dVar.a(FitnessAndStepsGoalSettingsFragment.s1(fitnessAndStepsGoalSettingsFragment).a(), FitnessAndStepsGoalSettingsFragment.s1(fitnessAndStepsGoalSettingsFragment).b());
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
