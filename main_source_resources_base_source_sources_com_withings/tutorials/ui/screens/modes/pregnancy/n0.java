package com.withings.tutorials.ui.screens.modes.pregnancy;
/* compiled from: PregnancyModeActivity.kt */
/* loaded from: classes4.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PregnancyModeActivity f45993a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(PregnancyModeActivity pregnancyModeActivity) {
        super(2);
        this.f45993a = pregnancyModeActivity;
    }

    public static final boolean a(k1.o1 o1Var) {
        return ((Boolean) o1Var.getValue()).booleanValue();
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        String str;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            PregnancyModeActivity pregnancyModeActivity = this.f45993a;
            k1.r0 a11 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).Z0(), null, null, aVar2, 2);
            k1.r0 a12 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).g1(), Boolean.FALSE, null, aVar2, 2);
            k1.r0 a13 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).k1(), new s60.a(), null, aVar2, 2);
            k1.r0 a14 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).d1(), (Double) androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).R0(), null, null, aVar2, 2).getValue(), null, aVar2, 2);
            k1.r0 a15 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).T0(), null, null, aVar2, 2);
            k1.r0 a16 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).O0(), null, null, aVar2, 2);
            k1.r0 a17 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).c1(), null, null, aVar2, 2);
            k1.r0 a18 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).U0(), null, null, aVar2, 2);
            k1.r0 a19 = androidx.compose.runtime.l0.a(PregnancyModeActivity.z3(pregnancyModeActivity).X0(), "", null, aVar2, 2);
            if (((Boolean) a12.getValue()).booleanValue()) {
                str = "babyDue";
            } else if (((Boolean) a11.getValue()) == null) {
                str = "loading";
            } else if (kotlin.jvm.internal.u.e((Boolean) a11.getValue(), Boolean.TRUE)) {
                str = "deactivation";
            } else {
                str = "activation";
            }
            String str2 = str;
            k1.y.f("collect-error", new x(pregnancyModeActivity, null), aVar2);
            k1.y.f("collect-join-event", new y(pregnancyModeActivity, c11, a12, null), aVar2);
            k1.y.f("collect-storage-event", new z(this.f45993a, c11, a12, a15, null), aVar2);
            k1.y.f("collect-not-supported-pregnancy", new a0(pregnancyModeActivity, null), aVar2);
            androidx.compose.runtime.j.a(e.m.b(pregnancyModeActivity), s1.b.b(aVar2, -690344137, new m0(this.f45993a, c11, str2, a12, a14, a17, a16, a15, a18, a13, a19, a11)), aVar2, 56);
        }
        return nm0.y.f85009a;
    }
}
