package com.withings.wiscale2.activity.workout.ui.detail;

import java.util.List;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class v2 extends kotlin.jvm.internal.w implements ym0.l<List<? extends xa0.a>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49734a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(x1 x1Var) {
        super(1);
        this.f49734a = x1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ym0.l
    public final nm0.y invoke(List<? extends xa0.a> list) {
        xa0.e eVar;
        List<? extends xa0.a> list2 = list;
        eVar = this.f49734a.f49790r;
        if (eVar != 0) {
            kotlin.jvm.internal.u.g(list2);
            eVar.a(list2);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("statBarView");
        throw null;
    }
}
