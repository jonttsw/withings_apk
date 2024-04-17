package com.withings.wiscale2.device.common.feature.activitygoal;

import android.view.View;
import androidx.lifecycle.h1;
import com.withings.measure.android.data.FitnessLevel;
import kotlin.jvm.internal.p0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
final class r extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitnessAndStepsGoalSettingsFragment f50957a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p0<FitnessLevel> f50958b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment, p0<FitnessLevel> p0Var) {
        super(1);
        this.f50957a = fitnessAndStepsGoalSettingsFragment;
        this.f50958b = p0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        a aVar;
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        aVar = this.f50957a.f50888j;
        if (aVar != null) {
            FitnessLevel selectedFitnessLevel = this.f50958b.f76257a;
            kotlin.jvm.internal.u.j(selectedFitnessLevel, "selectedFitnessLevel");
            BuildersKt__Builders_commonKt.launch$default(h1.a(aVar), Dispatchers.getIO(), null, new c(selectedFitnessLevel, aVar, null), 2, null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
