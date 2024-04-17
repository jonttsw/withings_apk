package com.withings.wiscale2.device.common.feature.activitygoal;

import android.view.View;
import androidx.lifecycle.h1;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
final class p extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitnessAndStepsGoalSettingsFragment f50953a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n0 f50954b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment, n0 n0Var) {
        super(1);
        this.f50953a = fitnessAndStepsGoalSettingsFragment;
        this.f50954b = n0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        a aVar;
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        aVar = this.f50953a.f50888j;
        if (aVar != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(aVar), Dispatchers.getIO(), null, new b(aVar, this.f50954b.f76254a, null), 2, null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
