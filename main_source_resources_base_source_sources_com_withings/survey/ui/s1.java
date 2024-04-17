package com.withings.survey.ui;

import androidx.compose.material.c5;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.x4;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import f50.a;
import x1.b;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class s1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44434a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44435b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f44436c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z4 f44437d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<f50.a> f44438e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(InAppSurveyActivity inAppSurveyActivity, r8.n nVar, c5 c5Var, z4 z4Var, k1.r0<f50.a> r0Var) {
        super(2);
        this.f44434a = inAppSurveyActivity;
        this.f44435b = nVar;
        this.f44436c = c5Var;
        this.f44437d = z4Var;
        this.f44438e = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        InAppSurveyActivity inAppSurveyActivity;
        e.a aVar2;
        k1.r0 r0Var;
        androidx.compose.runtime.a aVar3 = aVar;
        if ((num.intValue() & 11) == 2 && aVar3.h()) {
            aVar3.C();
        } else {
            aVar3.s(-2056934088);
            Object t11 = aVar3.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                aVar3.n(t11);
            }
            k1.r0 r0Var2 = (k1.r0) t11;
            Object j5 = w7.j(aVar3, -2056934021);
            if (j5 == a.C0060a.a()) {
                j5 = new n1(r0Var2);
                aVar3.n(j5);
            }
            aVar3.J();
            e.j.a(48, 1, aVar3, (ym0.a) j5, false);
            aVar3.s(733328855);
            e.a aVar4 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar3, -1323940314);
            int G = aVar3.G();
            k1.v0 l5 = aVar3.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(aVar4);
            if (aVar3.i() instanceof k1.d) {
                aVar3.A();
                if (aVar3.e()) {
                    aVar3.F(a11);
                } else {
                    aVar3.m();
                }
                ym0.p c13 = com.google.protobuf.t.c(aVar3, c11, aVar3, l5);
                if (aVar3.e() || !kotlin.jvm.internal.u.e(aVar3.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar3, G, c13);
                }
                l0.r.c(0, c12, k1.j1.a(aVar3), aVar3, 2058660585);
                aVar3.s(1635611028);
                boolean booleanValue = ((Boolean) r0Var2.getValue()).booleanValue();
                InAppSurveyActivity inAppSurveyActivity2 = this.f44434a;
                if (booleanValue) {
                    String u11 = ay.b.u(C1987R.string._CANCEL_, aVar3);
                    String u12 = ay.b.u(C1987R.string._CONFIRM_YES_, aVar3);
                    String u13 = ay.b.u(C1987R.string.survey_quit_title, aVar3);
                    String u14 = ay.b.u(C1987R.string.survey_quit_description, aVar3);
                    aVar3.s(1635611141);
                    Object t12 = aVar3.t();
                    if (t12 == a.C0060a.a()) {
                        t12 = new o1(r0Var2);
                        aVar3.n(t12);
                    }
                    ym0.a aVar5 = (ym0.a) t12;
                    aVar3.J();
                    p1 p1Var = new p1(inAppSurveyActivity2);
                    aVar3.s(1635611303);
                    Object t13 = aVar3.t();
                    if (t13 == a.C0060a.a()) {
                        t13 = new q1(r0Var2);
                        aVar3.n(t13);
                    }
                    aVar3.J();
                    inAppSurveyActivity = inAppSurveyActivity2;
                    aVar2 = aVar4;
                    r0Var = r0Var2;
                    wk.p.a(aVar5, u13, u14, u12, 0L, p1Var, u11, 0L, (ym0.a) t13, aVar3, 100663302, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
                } else {
                    inAppSurveyActivity = inAppSurveyActivity2;
                    aVar2 = aVar4;
                    r0Var = r0Var2;
                }
                aVar3.J();
                f50.a value = this.f44438e.getValue();
                boolean z5 = value instanceof a.c;
                z4 z4Var = this.f44437d;
                if (z5) {
                    aVar3.s(1635611977);
                    InAppSurveyActivity.B3(inAppSurveyActivity, aVar3, 8);
                    aVar3.J();
                } else {
                    InAppSurveyActivity inAppSurveyActivity3 = inAppSurveyActivity;
                    if (value instanceof a.C0909a) {
                        aVar3.s(1635612048);
                        InAppSurveyActivity.A3(inAppSurveyActivity3, aVar3, 8);
                        aVar3.J();
                    } else if (value instanceof a.b) {
                        aVar3.s(1635612150);
                        y50.a a12 = ((a.b) value).a();
                        aVar3.s(1635612280);
                        Object t14 = aVar3.t();
                        if (t14 == a.C0060a.a()) {
                            t14 = new r1(r0Var);
                            aVar3.n(t14);
                        }
                        aVar3.J();
                        InAppSurveyActivity.C3(inAppSurveyActivity3, a12, (ym0.a) t14, this.f44435b, this.f44436c, z4Var, aVar3, 266808);
                        aVar3.J();
                    } else {
                        aVar3.s(1635612575);
                        aVar3.J();
                    }
                }
                androidx.compose.ui.e j11 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.d(aVar2), 0.0f, 72, 0.0f, 0.0f, 13);
                androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar3, 733328855, false, aVar3, -1323940314);
                int G2 = aVar3.G();
                k1.v0 l6 = aVar3.l();
                ym0.a a13 = g.a.a();
                s1.a c14 = androidx.compose.ui.layout.y.c(j11);
                if (aVar3.i() instanceof k1.d) {
                    aVar3.A();
                    if (aVar3.e()) {
                        aVar3.F(a13);
                    } else {
                        aVar3.m();
                    }
                    ym0.p c15 = com.google.protobuf.t.c(aVar3, b10, aVar3, l6);
                    if (aVar3.e() || !kotlin.jvm.internal.u.e(aVar3.t(), Integer.valueOf(G2))) {
                        l0.q.a(G2, aVar3, G2, c15);
                    }
                    l0.r.c(0, c14, k1.j1.a(aVar3), aVar3, 2058660585);
                    x4.a(z4Var, androidx.compose.foundation.layout.x0.f(androidx.compose.foundation.layout.m.f4307a.g(aVar2, b.a.m()), yk.h.b()), aVar3, 0, 0);
                    aVar3.J();
                    aVar3.o();
                    aVar3.J();
                    aVar3.J();
                    aVar3.J();
                    aVar3.o();
                    aVar3.J();
                    aVar3.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
