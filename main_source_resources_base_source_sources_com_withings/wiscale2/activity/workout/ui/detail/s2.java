package com.withings.wiscale2.activity.workout.ui.detail;

import java.util.List;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class s2 extends kotlin.jvm.internal.w implements ym0.l<List<? extends x5>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(x1 x1Var) {
        super(1);
        this.f49607a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends x5> list) {
        r6 r6Var;
        List<? extends x5> list2 = list;
        r6Var = this.f49607a.f49797y;
        if (r6Var != null) {
            kotlin.jvm.internal.u.g(list2);
            r6Var.b(list2);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("notificationsView");
        throw null;
    }
}
