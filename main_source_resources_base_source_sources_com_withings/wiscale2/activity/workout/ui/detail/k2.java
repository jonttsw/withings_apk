package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class k2 extends kotlin.jvm.internal.w implements ym0.l<q4, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49360a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(x1 x1Var) {
        super(1);
        this.f49360a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(q4 q4Var) {
        a5 a5Var;
        q4 q4Var2 = q4Var;
        a5Var = this.f49360a.f49792t;
        if (a5Var != null) {
            kotlin.jvm.internal.u.g(q4Var2);
            a5Var.h(q4Var2);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("heartRateView");
        throw null;
    }
}
