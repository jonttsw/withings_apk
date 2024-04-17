package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class o2 extends kotlin.jvm.internal.w implements ym0.l<c4, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49509a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(x1 x1Var) {
        super(1);
        this.f49509a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(c4 c4Var) {
        n4 n4Var;
        c4 c4Var2 = c4Var;
        if (c4Var2 != null) {
            n4Var = this.f49509a.f49789q;
            if (n4Var != null) {
                n4Var.d(c4Var2);
            } else {
                kotlin.jvm.internal.u.s("headerView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
