package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class n2 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49474a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x1 x1Var) {
        super(1);
        this.f49474a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        a5 a5Var;
        String str2 = str;
        if (str2 != null) {
            a5Var = this.f49474a.f49792t;
            if (a5Var != null) {
                a5Var.g(str2);
            } else {
                kotlin.jvm.internal.u.s("heartRateView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
