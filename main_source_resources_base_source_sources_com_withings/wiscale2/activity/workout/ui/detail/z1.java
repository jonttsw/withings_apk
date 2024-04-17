package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class z1 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49834a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(x1 x1Var) {
        super(1);
        this.f49834a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        j3 j3Var = this.f49834a.f49788p;
        if (j3Var != null) {
            j3Var.A1(it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
