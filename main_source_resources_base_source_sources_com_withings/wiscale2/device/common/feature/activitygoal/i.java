package com.withings.wiscale2.device.common.feature.activitygoal;

import tb0.k1;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
final class i extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitnessAndStepsGoalSettingsFragment f50942a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment) {
        super(1);
        this.f50942a = fitnessAndStepsGoalSettingsFragment;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        k1 v12;
        v12 = this.f50942a.v1();
        v12.f99265c.setValue(str);
        return nm0.y.f85009a;
    }
}
