package com.withings.survey.ui;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.survey.viewModel.InAppSurveyViewModel;
import java.util.ArrayList;
import java.util.List;
import t50.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t50.a f44311a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<List<z50.a>, nm0.y> f44312b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<z50.a> f44313c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44314d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44315e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44316f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(t50.a aVar, ym0.l<? super List<z50.a>, nm0.y> lVar, List<z50.a> list, InAppSurveyActivity inAppSurveyActivity, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3) {
        super(2);
        this.f44311a = aVar;
        this.f44312b = lVar;
        this.f44313c = list;
        this.f44314d = inAppSurveyActivity;
        this.f44315e = aVar2;
        this.f44316f = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [kotlin.collections.i0] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.ArrayList] */
    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        Integer num2;
        boolean K;
        Object t11;
        z50.a aVar2;
        Integer num3;
        z50.a aVar3;
        InAppSurveyViewModel E3;
        z50.a aVar4;
        ?? r92;
        int i11;
        z50.a aVar5;
        String str;
        InAppSurveyViewModel E32;
        boolean K2;
        Object t12;
        z50.a aVar6;
        z50.a aVar7;
        z50.a aVar8;
        androidx.compose.runtime.a aVar9 = aVar;
        if ((num.intValue() & 11) == 2 && aVar9.h()) {
            aVar9.C();
        } else {
            t50.a aVar10 = this.f44311a;
            boolean z5 = aVar10 instanceof a.AbstractC1639a.C1640a;
            ym0.l<List<z50.a>, nm0.y> lVar = this.f44312b;
            if (z5) {
                aVar9.s(781519807);
                a.AbstractC1639a.C1640a c1640a = (a.AbstractC1639a.C1640a) aVar10;
                aVar9.s(781519922);
                boolean K3 = aVar9.K(lVar);
                Object t13 = aVar9.t();
                if (K3 || t13 == a.C0060a.a()) {
                    t13 = new t(lVar);
                    aVar9.n(t13);
                }
                aVar9.J();
                c60.h.a(c1640a, (ym0.l) t13, aVar9, 8);
                aVar9.J();
            } else if (aVar10 instanceof a.AbstractC1639a.b) {
                aVar9.s(781520049);
                a.AbstractC1639a.b bVar = (a.AbstractC1639a.b) aVar10;
                aVar9.s(781520157);
                boolean K4 = aVar9.K(lVar);
                Object t14 = aVar9.t();
                if (K4 || t14 == a.C0060a.a()) {
                    t14 = new z(lVar);
                    aVar9.n(t14);
                }
                aVar9.J();
                c60.i.a(bVar, (ym0.l) t14, aVar9, 8);
                aVar9.J();
            } else if (aVar10 instanceof a.AbstractC1639a.c) {
                aVar9.s(781520284);
                aVar9.s(781520345);
                boolean K5 = aVar9.K(lVar);
                Object t15 = aVar9.t();
                if (K5 || t15 == a.C0060a.a()) {
                    t15 = new a0(lVar);
                    aVar9.n(t15);
                }
                aVar9.J();
                c60.j.a((ym0.l) t15, aVar9, 0);
                aVar9.J();
            } else {
                boolean z11 = aVar10 instanceof a.b;
                List<z50.a> list = this.f44313c;
                String str2 = null;
                if (z11) {
                    aVar9.s(781520605);
                    if (list != null) {
                        if (!(!list.isEmpty())) {
                            list = null;
                        }
                        if (list != null && (aVar8 = (z50.a) kotlin.collections.x.I(list)) != null) {
                            str2 = aVar8.b();
                        }
                    }
                    aVar9.s(781520648);
                    boolean K6 = aVar9.K(lVar);
                    Object t16 = aVar9.t();
                    if (K6 || t16 == a.C0060a.a()) {
                        t16 = new b0(lVar);
                        aVar9.n(t16);
                    }
                    aVar9.J();
                    c60.d.a(0, aVar9, str2, (ym0.l) t16);
                    aVar9.J();
                } else if (aVar10 instanceof a.d) {
                    aVar9.s(781520959);
                    if (list != null) {
                        if (!(!list.isEmpty())) {
                            list = null;
                        }
                        if (list != null && (aVar7 = (z50.a) kotlin.collections.x.I(list)) != null) {
                            str2 = aVar7.b();
                        }
                    }
                    a.d dVar = (a.d) aVar10;
                    aVar9.s(781521002);
                    boolean K7 = aVar9.K(lVar);
                    Object t17 = aVar9.t();
                    if (K7 || t17 == a.C0060a.a()) {
                        t17 = new c0(lVar);
                        aVar9.n(t17);
                    }
                    aVar9.J();
                    c60.d.b(dVar, (ym0.l) t17, str2, aVar9, 8);
                    aVar9.J();
                } else {
                    boolean z12 = aVar10 instanceof a.f;
                    InAppSurveyActivity inAppSurveyActivity = this.f44314d;
                    if (z12) {
                        aVar9.s(781521259);
                        if (list != null) {
                            if (!(!list.isEmpty())) {
                                list = null;
                            }
                            if (list != null && (aVar6 = (z50.a) kotlin.collections.x.I(list)) != null) {
                                str = aVar6.b();
                                E32 = inAppSurveyActivity.E3();
                                k1.r0 b10 = androidx.compose.runtime.l0.b(E32.T0(), aVar9);
                                aVar9.s(781521374);
                                K2 = aVar9.K(lVar);
                                t12 = aVar9.t();
                                if (!K2 || t12 == a.C0060a.a()) {
                                    t12 = new d0(lVar);
                                    aVar9.n(t12);
                                }
                                aVar9.J();
                                c60.d.c(b10, str, (ym0.l) t12, new u(inAppSurveyActivity), this.f44315e, aVar9, 0);
                                aVar9.J();
                            }
                        }
                        str = null;
                        E32 = inAppSurveyActivity.E3();
                        k1.r0 b102 = androidx.compose.runtime.l0.b(E32.T0(), aVar9);
                        aVar9.s(781521374);
                        K2 = aVar9.K(lVar);
                        t12 = aVar9.t();
                        if (!K2) {
                        }
                        t12 = new d0(lVar);
                        aVar9.n(t12);
                        aVar9.J();
                        c60.d.c(b102, str, (ym0.l) t12, new u(inAppSurveyActivity), this.f44315e, aVar9, 0);
                        aVar9.J();
                    } else if (aVar10 instanceof a.j) {
                        aVar9.s(781521814);
                        if (list != null) {
                            if (!(!list.isEmpty())) {
                                list = null;
                            }
                            if (list != null && (aVar5 = (z50.a) kotlin.collections.x.I(list)) != null) {
                                str2 = aVar5.b();
                            }
                        }
                        a.j jVar = (a.j) aVar10;
                        aVar9.s(781521857);
                        boolean K8 = aVar9.K(lVar);
                        Object t18 = aVar9.t();
                        if (K8 || t18 == a.C0060a.a()) {
                            t18 = new v(lVar);
                            aVar9.n(t18);
                        }
                        aVar9.J();
                        c60.d.d(jVar, (ym0.l) t18, str2, aVar9, 8);
                        aVar9.J();
                    } else if (aVar10 instanceof a.i) {
                        aVar9.s(781521980);
                        aVar9.J();
                    } else if (aVar10 instanceof a.c) {
                        aVar9.s(781522031);
                        a.c cVar = (a.c) aVar10;
                        aVar9.s(781522141);
                        boolean K9 = aVar9.K(lVar) | aVar9.K(aVar10);
                        Object t19 = aVar9.t();
                        if (K9 || t19 == a.C0060a.a()) {
                            t19 = new w(lVar, aVar10);
                            aVar9.n(t19);
                        }
                        ym0.l lVar2 = (ym0.l) t19;
                        aVar9.J();
                        if (list != null) {
                            List<z50.a> list2 = list;
                            r92 = new ArrayList(kotlin.collections.x.y(list2, 10));
                            for (z50.a aVar11 : list2) {
                                Integer a11 = aVar11.a();
                                if (a11 != null) {
                                    i11 = a11.intValue();
                                } else {
                                    i11 = 0;
                                }
                                r92.add(Integer.valueOf(i11));
                            }
                        } else {
                            r92 = kotlin.collections.i0.f76187a;
                        }
                        c60.f.a(cVar, lVar2, r92, aVar9, ConstantsWs.WS_STATUS_ALREADY_EXIST, 0);
                        aVar9.J();
                    } else if (aVar10 instanceof a.e) {
                        aVar9.s(781522810);
                        E3 = inAppSurveyActivity.E3();
                        ?? value = E3.X0().getValue();
                        if (!((List) value).isEmpty()) {
                            str2 = value;
                        }
                        List list3 = (List) str2;
                        c60.g.a((list3 == null || (aVar4 = (z50.a) kotlin.collections.x.I(list3)) == null || (r9 = aVar4.b()) == null) ? "" : "", this.f44316f, aVar9, 0);
                        aVar9.J();
                    } else if (aVar10 instanceof a.g) {
                        aVar9.s(781523098);
                        a.g gVar = (a.g) aVar10;
                        aVar9.s(781523206);
                        boolean K10 = aVar9.K(lVar) | aVar9.K(aVar10);
                        Object t21 = aVar9.t();
                        if (K10 || t21 == a.C0060a.a()) {
                            t21 = new x(lVar, aVar10);
                            aVar9.n(t21);
                        }
                        ym0.l lVar3 = (ym0.l) t21;
                        aVar9.J();
                        if (list != null) {
                            if (!(!list.isEmpty())) {
                                list = null;
                            }
                            if (list != null && (aVar3 = (z50.a) kotlin.collections.x.I(list)) != null) {
                                num3 = aVar3.a();
                                c60.l.a(gVar, lVar3, num3, aVar9, 8, 0);
                                aVar9.J();
                            }
                        }
                        num3 = null;
                        c60.l.a(gVar, lVar3, num3, aVar9, 8, 0);
                        aVar9.J();
                    } else if (aVar10 instanceof a.h) {
                        aVar9.s(781523853);
                        a.h hVar = (a.h) aVar10;
                        if (list != null) {
                            if (!(!list.isEmpty())) {
                                list = null;
                            }
                            if (list != null && (aVar2 = (z50.a) kotlin.collections.x.I(list)) != null) {
                                num2 = aVar2.a();
                                aVar9.s(781524093);
                                K = aVar9.K(lVar) | aVar9.K(aVar10);
                                t11 = aVar9.t();
                                if (!K || t11 == a.C0060a.a()) {
                                    t11 = new y(lVar, aVar10);
                                    aVar9.n(t11);
                                }
                                aVar9.J();
                                c60.o.a(hVar, num2, (ym0.l) t11, aVar9, 8, 0);
                                aVar9.J();
                            }
                        }
                        num2 = null;
                        aVar9.s(781524093);
                        K = aVar9.K(lVar) | aVar9.K(aVar10);
                        t11 = aVar9.t();
                        if (!K) {
                        }
                        t11 = new y(lVar, aVar10);
                        aVar9.n(t11);
                        aVar9.J();
                        c60.o.a(hVar, num2, (ym0.l) t11, aVar9, 8, 0);
                        aVar9.J();
                    } else {
                        aVar9.s(781524575);
                        aVar9.J();
                    }
                }
            }
        }
        return nm0.y.f85009a;
    }
}
