package com.withings.wiscale2.activity.workout.ui.detail;

import java.util.List;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class q2 extends kotlin.jvm.internal.w implements ym0.l<List<? extends x0>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49558a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(x1 x1Var) {
        super(1);
        this.f49558a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends x0> list) {
        b7 b7Var;
        List<? extends x0> list2 = list;
        if (list2 != null) {
            b7Var = this.f49558a.f49796x;
            if (b7Var != null) {
                b7Var.b(list2);
            } else {
                kotlin.jvm.internal.u.s("photoView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
