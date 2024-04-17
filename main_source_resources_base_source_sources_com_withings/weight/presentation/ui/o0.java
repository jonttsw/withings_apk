package com.withings.weight.presentation.ui;

import android.content.Context;
import com.withings.weight.presentation.viewmodel.WeightViewModel;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: WeightActivity.kt */
/* loaded from: classes4.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StateFlow<m90.f> f47278a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47279b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(StateFlow<? extends m90.f> stateFlow, WeightActivity weightActivity) {
        super(2);
        this.f47278a = stateFlow;
        this.f47279b = weightActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        WeightViewModel D3;
        WeightViewModel D32;
        WeightViewModel D33;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Context context = (Context) aVar2.D(androidx.compose.ui.platform.u0.d());
            m90.f fVar = (m90.f) h6.b.c(this.f47278a, aVar2).getValue();
            WeightActivity weightActivity = this.f47279b;
            h0 h0Var = new h0(weightActivity);
            i0 i0Var = new i0(weightActivity, context);
            D3 = weightActivity.D3();
            j0 j0Var = new j0(D3);
            D32 = weightActivity.D3();
            k0 k0Var = new k0(D32);
            l0 l0Var = new l0(weightActivity, context);
            D33 = weightActivity.D3();
            l90.u0.a(fVar, h0Var, i0Var, j0Var, k0Var, l0Var, new m0(D33), n0.f47276a, aVar2, 12582912);
        }
        return nm0.y.f85009a;
    }
}
