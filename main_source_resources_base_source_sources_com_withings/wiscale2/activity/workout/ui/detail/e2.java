package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class e2 extends kotlin.jvm.internal.w implements ym0.l<ab0.i, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49171a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(x1 x1Var) {
        super(1);
        this.f49171a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(ab0.i iVar) {
        ab0.e0 e0Var;
        ab0.i iVar2 = iVar;
        if (iVar2 != null) {
            e0Var = this.f49171a.f49791s;
            if (e0Var != null) {
                e0Var.g(iVar2);
            } else {
                kotlin.jvm.internal.u.s("performanceView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
