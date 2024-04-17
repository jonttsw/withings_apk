package com.withings.wiscale2.activity.workout.live.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.w implements ym0.l<dj.t, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f48945a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var) {
        super(1);
        this.f48945a = z0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(dj.t tVar) {
        dj.t tVar2;
        dj.t it = tVar;
        kotlin.jvm.internal.u.j(it, "it");
        z0 z0Var = this.f48945a;
        z0Var.P = it;
        tVar2 = z0Var.P;
        if (tVar2 != null) {
            tVar2.e(z0Var);
            androidx.lifecycle.k0<Boolean> m12 = z0Var.m1();
            String a11 = tVar2.a();
            kotlin.jvm.internal.u.i(a11, "getCurrentState(...)");
            m12.setValue(Boolean.valueOf(z0.B0(a11)));
        }
        return nm0.y.f85009a;
    }
}
