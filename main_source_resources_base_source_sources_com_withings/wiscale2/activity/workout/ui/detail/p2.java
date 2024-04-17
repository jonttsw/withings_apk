package com.withings.wiscale2.activity.workout.ui.detail;

import java.util.List;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class p2 extends kotlin.jvm.internal.w implements ym0.l<List<? extends com.withings.common.compose.component.u1>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(x1 x1Var) {
        super(1);
        this.f49530a = x1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ym0.l
    public final nm0.y invoke(List<? extends com.withings.common.compose.component.u1> list) {
        d5 d5Var;
        List<? extends com.withings.common.compose.component.u1> list2 = list;
        if (list2 != null) {
            d5Var = this.f49530a.f49793u;
            if (d5Var != 0) {
                d5Var.a(list2);
            } else {
                kotlin.jvm.internal.u.s("heartRateZoneView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
