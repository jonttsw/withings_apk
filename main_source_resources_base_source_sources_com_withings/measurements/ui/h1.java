package com.withings.measurements.ui;

import androidx.camera.camera2.internal.q2;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.ui.verticals.a;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class h1 extends kotlin.jvm.internal.w implements ym0.r<u0.d0, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42039a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42040b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f42041c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42042d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.withings.measurements.ui.verticals.a aVar, HealthVerticalActivity healthVerticalActivity, k1.r0 r0Var, CoroutineScope coroutineScope) {
        super(4);
        this.f42039a = aVar;
        this.f42040b = healthVerticalActivity;
        this.f42041c = r0Var;
        this.f42042d = coroutineScope;
    }

    @Override // ym0.r
    public final nm0.y invoke(u0.d0 d0Var, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        u0.d0 HorizontalPager = d0Var;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        num2.intValue();
        kotlin.jvm.internal.u.j(HorizontalPager, "$this$HorizontalPager");
        com.withings.measurements.ui.verticals.a aVar3 = this.f42039a;
        MeasurementsVertical valueOf = MeasurementsVertical.valueOf(((a.C0560a) aVar3).a().get(intValue).name());
        int ordinal = valueOf.ordinal();
        HealthVerticalActivity healthVerticalActivity = this.f42040b;
        switch (ordinal) {
            case 0:
                Object a11 = q2.a(aVar2, 1269774029, 1269774113);
                if (a11 == a.C0060a.a()) {
                    a11 = new e(healthVerticalActivity);
                    aVar2.n(a11);
                }
                aVar2.J();
                ym0.a aVar4 = (ym0.a) ((fn0.g) a11);
                aVar2.s(1269774220);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = new p(healthVerticalActivity);
                    aVar2.n(t11);
                }
                aVar2.J();
                ym0.l lVar = (ym0.l) ((fn0.g) t11);
                aVar2.s(1269774340);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = new a0(healthVerticalActivity);
                    aVar2.n(t12);
                }
                aVar2.J();
                ym0.l lVar2 = (ym0.l) ((fn0.g) t12);
                aVar2.s(1269774448);
                Object t13 = aVar2.t();
                if (t13 == a.C0060a.a()) {
                    t13 = new l0(healthVerticalActivity);
                    aVar2.n(t13);
                }
                aVar2.J();
                ym0.l lVar3 = (ym0.l) ((fn0.g) t13);
                aVar2.s(1269774561);
                Object t14 = aVar2.t();
                if (t14 == a.C0060a.a()) {
                    t14 = new w0(healthVerticalActivity, valueOf);
                    aVar2.n(t14);
                }
                ym0.l lVar4 = (ym0.l) t14;
                Object j5 = w7.j(aVar2, 1269774799);
                if (j5 == a.C0060a.a()) {
                    j5 = new d1(healthVerticalActivity, aVar3, intValue);
                    aVar2.n(j5);
                }
                ym0.a aVar5 = (ym0.a) j5;
                Object j11 = w7.j(aVar2, 1269775026);
                if (j11 == a.C0060a.a()) {
                    j11 = new e1(healthVerticalActivity);
                    aVar2.n(j11);
                }
                aVar2.J();
                ym0.a aVar6 = (ym0.a) ((fn0.g) j11);
                aVar2.s(1269775121);
                Object t15 = aVar2.t();
                if (t15 == a.C0060a.a()) {
                    t15 = new f1(healthVerticalActivity);
                    aVar2.n(t15);
                }
                aVar2.J();
                qz.l0.a(aVar4, null, lVar, lVar2, lVar3, lVar4, aVar5, aVar6, (ym0.l) ((fn0.g) t15), aVar2, 115043718, 2);
                aVar2.J();
                nm0.y yVar = nm0.y.f85009a;
                break;
            case 1:
                Object a12 = q2.a(aVar2, 1269775352, 1269775352);
                if (a12 == a.C0060a.a()) {
                    a12 = new g1(healthVerticalActivity);
                    aVar2.n(a12);
                }
                fn0.g gVar = (fn0.g) a12;
                Object j12 = w7.j(aVar2, 1269775459);
                if (j12 == a.C0060a.a()) {
                    j12 = new f(healthVerticalActivity);
                    aVar2.n(j12);
                }
                fn0.g gVar2 = (fn0.g) j12;
                Object j13 = w7.j(aVar2, 1269775579);
                if (j13 == a.C0060a.a()) {
                    j13 = new g(healthVerticalActivity);
                    aVar2.n(j13);
                }
                fn0.g gVar3 = (fn0.g) j13;
                Object j14 = w7.j(aVar2, 1269775687);
                if (j14 == a.C0060a.a()) {
                    j14 = new h(healthVerticalActivity);
                    aVar2.n(j14);
                }
                fn0.g gVar4 = (fn0.g) j14;
                Object j15 = w7.j(aVar2, 1269775800);
                if (j15 == a.C0060a.a()) {
                    j15 = new i(healthVerticalActivity, valueOf);
                    aVar2.n(j15);
                }
                ym0.l lVar5 = (ym0.l) j15;
                Object j16 = w7.j(aVar2, 1269776038);
                if (j16 == a.C0060a.a()) {
                    j16 = new j(healthVerticalActivity, aVar3, intValue);
                    aVar2.n(j16);
                }
                ym0.a aVar7 = (ym0.a) j16;
                Object j17 = w7.j(aVar2, 1269776265);
                if (j17 == a.C0060a.a()) {
                    j17 = new k(healthVerticalActivity);
                    aVar2.n(j17);
                }
                fn0.g gVar5 = (fn0.g) j17;
                Object j18 = w7.j(aVar2, 1269776360);
                if (j18 == a.C0060a.a()) {
                    j18 = new l(healthVerticalActivity);
                    aVar2.n(j18);
                }
                aVar2.J();
                qz.l0.b((ym0.a) gVar, null, (ym0.l) gVar2, (ym0.l) gVar3, (ym0.l) gVar4, (ym0.l) ((fn0.g) j18), aVar7, (ym0.a) gVar5, lVar5, aVar2, 115043718, 2);
                aVar2.J();
                nm0.y yVar2 = nm0.y.f85009a;
                break;
            case 2:
                Object a13 = q2.a(aVar2, 1269776512, 1269776593);
                if (a13 == a.C0060a.a()) {
                    a13 = new m(healthVerticalActivity);
                    aVar2.n(a13);
                }
                aVar2.J();
                ym0.a aVar8 = (ym0.a) ((fn0.g) a13);
                aVar2.s(1269776700);
                Object t16 = aVar2.t();
                if (t16 == a.C0060a.a()) {
                    t16 = new n(healthVerticalActivity);
                    aVar2.n(t16);
                }
                aVar2.J();
                ym0.l lVar6 = (ym0.l) ((fn0.g) t16);
                aVar2.s(1269776820);
                Object t17 = aVar2.t();
                if (t17 == a.C0060a.a()) {
                    t17 = new o(healthVerticalActivity);
                    aVar2.n(t17);
                }
                aVar2.J();
                ym0.l lVar7 = (ym0.l) ((fn0.g) t17);
                aVar2.s(1269776928);
                Object t18 = aVar2.t();
                if (t18 == a.C0060a.a()) {
                    t18 = new q(healthVerticalActivity);
                    aVar2.n(t18);
                }
                aVar2.J();
                ym0.l lVar8 = (ym0.l) ((fn0.g) t18);
                aVar2.s(1269777041);
                Object t19 = aVar2.t();
                if (t19 == a.C0060a.a()) {
                    t19 = new r(healthVerticalActivity, valueOf);
                    aVar2.n(t19);
                }
                ym0.l lVar9 = (ym0.l) t19;
                Object j19 = w7.j(aVar2, 1269777279);
                if (j19 == a.C0060a.a()) {
                    j19 = new s(healthVerticalActivity, aVar3, intValue);
                    aVar2.n(j19);
                }
                ym0.a aVar9 = (ym0.a) j19;
                Object j21 = w7.j(aVar2, 1269777506);
                if (j21 == a.C0060a.a()) {
                    j21 = new t(healthVerticalActivity);
                    aVar2.n(j21);
                }
                aVar2.J();
                ym0.a aVar10 = (ym0.a) ((fn0.g) j21);
                aVar2.s(1269777601);
                Object t21 = aVar2.t();
                if (t21 == a.C0060a.a()) {
                    t21 = new u(healthVerticalActivity);
                    aVar2.n(t21);
                }
                aVar2.J();
                qz.l0.c(aVar8, null, lVar6, lVar7, lVar8, lVar9, aVar9, aVar10, (ym0.l) ((fn0.g) t21), aVar2, 115043718, 2);
                aVar2.J();
                nm0.y yVar3 = nm0.y.f85009a;
                break;
            case 3:
                Object a14 = q2.a(aVar2, 1269777757, 1269777842);
                if (a14 == a.C0060a.a()) {
                    a14 = new v(healthVerticalActivity);
                    aVar2.n(a14);
                }
                aVar2.J();
                ym0.a aVar11 = (ym0.a) ((fn0.g) a14);
                aVar2.s(1269777949);
                Object t22 = aVar2.t();
                if (t22 == a.C0060a.a()) {
                    t22 = new w(healthVerticalActivity);
                    aVar2.n(t22);
                }
                aVar2.J();
                ym0.l lVar10 = (ym0.l) ((fn0.g) t22);
                aVar2.s(1269778069);
                Object t23 = aVar2.t();
                if (t23 == a.C0060a.a()) {
                    t23 = new x(healthVerticalActivity);
                    aVar2.n(t23);
                }
                aVar2.J();
                ym0.l lVar11 = (ym0.l) ((fn0.g) t23);
                aVar2.s(1269778177);
                Object t24 = aVar2.t();
                if (t24 == a.C0060a.a()) {
                    t24 = new y(healthVerticalActivity);
                    aVar2.n(t24);
                }
                aVar2.J();
                ym0.l lVar12 = (ym0.l) ((fn0.g) t24);
                aVar2.s(1269778290);
                Object t25 = aVar2.t();
                if (t25 == a.C0060a.a()) {
                    t25 = new z(healthVerticalActivity, valueOf);
                    aVar2.n(t25);
                }
                ym0.l lVar13 = (ym0.l) t25;
                Object j22 = w7.j(aVar2, 1269778528);
                if (j22 == a.C0060a.a()) {
                    j22 = new b0(healthVerticalActivity, aVar3, intValue);
                    aVar2.n(j22);
                }
                ym0.a aVar12 = (ym0.a) j22;
                Object j23 = w7.j(aVar2, 1269778755);
                if (j23 == a.C0060a.a()) {
                    j23 = new c0(healthVerticalActivity);
                    aVar2.n(j23);
                }
                aVar2.J();
                ym0.a aVar13 = (ym0.a) ((fn0.g) j23);
                aVar2.s(1269778850);
                Object t26 = aVar2.t();
                if (t26 == a.C0060a.a()) {
                    t26 = new d0(healthVerticalActivity);
                    aVar2.n(t26);
                }
                aVar2.J();
                qz.l0.e(aVar11, null, lVar10, lVar11, lVar12, lVar13, aVar12, aVar13, (ym0.l) ((fn0.g) t26), aVar2, 115043718, 2);
                aVar2.J();
                nm0.y yVar4 = nm0.y.f85009a;
                break;
            case 4:
                Object a15 = q2.a(aVar2, 1269779095, 1269779095);
                if (a15 == a.C0060a.a()) {
                    a15 = new e0(healthVerticalActivity);
                    aVar2.n(a15);
                }
                fn0.g gVar6 = (fn0.g) a15;
                Object j24 = w7.j(aVar2, 1269779202);
                if (j24 == a.C0060a.a()) {
                    j24 = new f0(healthVerticalActivity);
                    aVar2.n(j24);
                }
                fn0.g gVar7 = (fn0.g) j24;
                Object j25 = w7.j(aVar2, 1269779314);
                if (j25 == a.C0060a.a()) {
                    j25 = new g0(healthVerticalActivity);
                    aVar2.n(j25);
                }
                fn0.g gVar8 = (fn0.g) j25;
                Object j26 = w7.j(aVar2, 1269779422);
                if (j26 == a.C0060a.a()) {
                    j26 = new h0(healthVerticalActivity);
                    aVar2.n(j26);
                }
                fn0.g gVar9 = (fn0.g) j26;
                Object j27 = w7.j(aVar2, 1269779543);
                if (j27 == a.C0060a.a()) {
                    j27 = new i0(healthVerticalActivity, valueOf);
                    aVar2.n(j27);
                }
                ym0.l lVar14 = (ym0.l) j27;
                Object j28 = w7.j(aVar2, 1269779781);
                if (j28 == a.C0060a.a()) {
                    j28 = new j0(healthVerticalActivity, aVar3, intValue);
                    aVar2.n(j28);
                }
                ym0.a aVar14 = (ym0.a) j28;
                Object j29 = w7.j(aVar2, 1269780008);
                if (j29 == a.C0060a.a()) {
                    j29 = new k0(healthVerticalActivity);
                    aVar2.n(j29);
                }
                fn0.g gVar10 = (fn0.g) j29;
                Object j31 = w7.j(aVar2, 1269780103);
                if (j31 == a.C0060a.a()) {
                    j31 = new m0(healthVerticalActivity);
                    aVar2.n(j31);
                }
                aVar2.J();
                qz.l0.f((ym0.a) gVar6, null, (ym0.l) gVar7, (ym0.l) gVar9, (ym0.l) gVar8, lVar14, aVar14, (ym0.a) gVar10, (ym0.l) ((fn0.g) j31), aVar2, 115043718, 2);
                aVar2.J();
                nm0.y yVar5 = nm0.y.f85009a;
                break;
            case 5:
                Object a16 = q2.a(aVar2, 1269780336, 1269780336);
                if (a16 == a.C0060a.a()) {
                    a16 = new n0(healthVerticalActivity);
                    aVar2.n(a16);
                }
                fn0.g gVar11 = (fn0.g) a16;
                Object j32 = w7.j(aVar2, 1269780443);
                if (j32 == a.C0060a.a()) {
                    j32 = new o0(healthVerticalActivity);
                    aVar2.n(j32);
                }
                fn0.g gVar12 = (fn0.g) j32;
                Object j33 = w7.j(aVar2, 1269780555);
                if (j33 == a.C0060a.a()) {
                    j33 = new p0(healthVerticalActivity);
                    aVar2.n(j33);
                }
                fn0.g gVar13 = (fn0.g) j33;
                Object j34 = w7.j(aVar2, 1269780663);
                if (j34 == a.C0060a.a()) {
                    j34 = new q0(healthVerticalActivity);
                    aVar2.n(j34);
                }
                fn0.g gVar14 = (fn0.g) j34;
                Object j35 = w7.j(aVar2, 1269780784);
                if (j35 == a.C0060a.a()) {
                    j35 = new r0(healthVerticalActivity, valueOf);
                    aVar2.n(j35);
                }
                ym0.l lVar15 = (ym0.l) j35;
                Object j36 = w7.j(aVar2, 1269781022);
                if (j36 == a.C0060a.a()) {
                    j36 = new s0(healthVerticalActivity, aVar3, intValue);
                    aVar2.n(j36);
                }
                ym0.a aVar15 = (ym0.a) j36;
                Object j37 = w7.j(aVar2, 1269781249);
                if (j37 == a.C0060a.a()) {
                    j37 = new t0(healthVerticalActivity);
                    aVar2.n(j37);
                }
                fn0.g gVar15 = (fn0.g) j37;
                Object j38 = w7.j(aVar2, 1269781344);
                if (j38 == a.C0060a.a()) {
                    j38 = new u0(healthVerticalActivity);
                    aVar2.n(j38);
                }
                aVar2.J();
                qz.l0.h((ym0.a) gVar11, null, (ym0.l) gVar12, (ym0.l) gVar14, (ym0.l) gVar13, lVar15, aVar15, (ym0.a) gVar15, (ym0.l) ((fn0.g) j38), aVar2, 115043718, 2);
                aVar2.J();
                nm0.y yVar6 = nm0.y.f85009a;
                break;
            case 6:
                Object a17 = q2.a(aVar2, 1269781585, 1269781585);
                if (a17 == a.C0060a.a()) {
                    a17 = new v0(healthVerticalActivity);
                    aVar2.n(a17);
                }
                fn0.g gVar16 = (fn0.g) a17;
                Object j39 = w7.j(aVar2, 1269781692);
                if (j39 == a.C0060a.a()) {
                    j39 = new x0(healthVerticalActivity);
                    aVar2.n(j39);
                }
                fn0.g gVar17 = (fn0.g) j39;
                Object j41 = w7.j(aVar2, 1269781804);
                if (j41 == a.C0060a.a()) {
                    j41 = new y0(healthVerticalActivity);
                    aVar2.n(j41);
                }
                fn0.g gVar18 = (fn0.g) j41;
                Object j42 = w7.j(aVar2, 1269781912);
                if (j42 == a.C0060a.a()) {
                    j42 = new z0(healthVerticalActivity);
                    aVar2.n(j42);
                }
                fn0.g gVar19 = (fn0.g) j42;
                aVar2.J();
                boolean booleanValue = this.f42041c.getValue().booleanValue();
                aVar2.s(1269782537);
                Object t27 = aVar2.t();
                if (t27 == a.C0060a.a()) {
                    t27 = new a1(healthVerticalActivity);
                    aVar2.n(t27);
                }
                aVar2.J();
                qz.l0.g((ym0.a) gVar16, null, (ym0.l) gVar17, (ym0.l) gVar19, (ym0.l) gVar18, new c1(this.f42042d, healthVerticalActivity), (ym0.l) ((fn0.g) t27), booleanValue, aVar2, 1600902, 2);
                aVar2.J();
                nm0.y yVar7 = nm0.y.f85009a;
                break;
            default:
                aVar2.s(1269782655);
                aVar2.J();
                nm0.y yVar8 = nm0.y.f85009a;
                break;
        }
        return nm0.y.f85009a;
    }
}
