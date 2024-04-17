package com.withings.programs.viewmodel;

import com.withings.common.compose.component.m4;
import com.withings.goal.core.model.HealthGoal;
import com.withings.goal.core.model.HealthGoalTrend;
import com.withings.programs.model.goal.HealthGoalHeaderUi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import l70.u;
import nm0.y;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AchieveViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.programs.viewmodel.AchieveViewModel$healthGoalHeaderUiState$1", f = "AchieveViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements q<gs.a, u, qm0.d<? super HealthGoalHeaderUi>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ gs.a f43837a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ u f43838b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AchieveViewModel f43839c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AchieveViewModel achieveViewModel, qm0.d<? super m> dVar) {
        super(3, dVar);
        this.f43839c = achieveViewModel;
    }

    @Override // ym0.q
    public final Object invoke(gs.a aVar, u uVar, qm0.d<? super HealthGoalHeaderUi> dVar) {
        m mVar = new m(this.f43839c, dVar);
        mVar.f43837a = aVar;
        mVar.f43838b = uVar;
        return mVar.invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n90.h hVar;
        m4 d11;
        HealthGoalTrend healthGoalTrend;
        n90.h hVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        gs.a aVar = this.f43837a;
        u uVar = this.f43838b;
        int f11 = a50.a.f(aVar.a());
        AchieveViewModel achieveViewModel = this.f43839c;
        HealthGoalHeaderUi healthGoalHeaderUi = null;
        if (f11 == 1) {
            hVar = achieveViewModel.f43770a;
            d11 = hVar.d(uVar, aVar.b());
        } else if (f11 == 8 || f11 == 76) {
            hVar2 = achieveViewModel.f43770a;
            d11 = hVar2.b(aVar.b(), aVar.c());
        } else {
            d11 = null;
        }
        if (d11 != null) {
            int g11 = df.d.g(aVar.a());
            HealthGoal a11 = aVar.a();
            kotlin.jvm.internal.u.j(a11, "<this>");
            int ordinal = a11.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else {
                        healthGoalTrend = HealthGoalTrend.f39499c;
                        healthGoalHeaderUi = new HealthGoalHeaderUi(g11, healthGoalTrend, a50.a.f(aVar.a()), d11);
                    }
                }
                healthGoalTrend = HealthGoalTrend.f39498b;
                healthGoalHeaderUi = new HealthGoalHeaderUi(g11, healthGoalTrend, a50.a.f(aVar.a()), d11);
            }
            healthGoalTrend = HealthGoalTrend.f39497a;
            healthGoalHeaderUi = new HealthGoalHeaderUi(g11, healthGoalTrend, a50.a.f(aVar.a()), d11);
        }
        return healthGoalHeaderUi;
    }
}
