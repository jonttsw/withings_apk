package com.withings.wiscale2.activity.workout.ui.detail;

import java.util.List;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class l2 extends kotlin.jvm.internal.w implements ym0.l<List<? extends com.withings.common.compose.component.u1>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49404a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(x1 x1Var) {
        super(1);
        this.f49404a = x1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ym0.l
    public final nm0.y invoke(List<? extends com.withings.common.compose.component.u1> list) {
        za0.k kVar;
        List<? extends com.withings.common.compose.component.u1> list2 = list;
        if (list2 != null) {
            kVar = this.f49404a.f49795w;
            if (kVar != 0) {
                kVar.b(list2);
            } else {
                kotlin.jvm.internal.u.s("temperatureZonesView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
