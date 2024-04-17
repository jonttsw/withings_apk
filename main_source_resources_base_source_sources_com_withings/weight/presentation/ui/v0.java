package com.withings.weight.presentation.ui;

import kotlinx.coroutines.flow.StateFlow;
/* compiled from: WeightExploreDataActivity.kt */
/* loaded from: classes4.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightExploreDataActivity f47305a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(WeightExploreDataActivity weightExploreDataActivity) {
        super(2);
        this.f47305a = weightExploreDataActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            WeightExploreDataActivity weightExploreDataActivity = this.f47305a;
            StateFlow<? extends ws.b> stateFlow = weightExploreDataActivity.f47165g;
            if (stateFlow != null) {
                ks.p.c((ws.b) androidx.compose.runtime.l0.b(stateFlow, aVar2).getValue(), new t0(weightExploreDataActivity), new u0(WeightExploreDataActivity.z3(weightExploreDataActivity)), null, aVar2, 8, 8);
            } else {
                kotlin.jvm.internal.u.s("uiStateFlow");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
