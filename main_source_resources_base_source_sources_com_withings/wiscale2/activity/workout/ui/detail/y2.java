package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class y2 extends kotlin.jvm.internal.w implements ym0.l<bb0.c1, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49827a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(x1 x1Var) {
        super(1);
        this.f49827a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(bb0.c1 c1Var) {
        ab0.e0 e0Var;
        boolean z5;
        bb0.c1 c1Var2 = c1Var;
        e0Var = this.f49827a.f49791s;
        if (e0Var != null) {
            if (c1Var2 != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            e0Var.k(z5);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("performanceView");
        throw null;
    }
}
