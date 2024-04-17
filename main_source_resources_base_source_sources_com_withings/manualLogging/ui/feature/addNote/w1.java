package com.withings.manualLogging.ui.feature.addNote;

import androidx.compose.material.t5;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.common.LogType;
import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
import com.withings.user.User;
import java.util.List;
/* compiled from: SelectManualLogCategoryScreen.kt */
/* loaded from: classes4.dex */
public final class w1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectManualLogCategoryScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41604a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(2);
            this.f41604a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.a(0L, 0L, null, false, f1.d.a(), null, null, null, false, this.f41604a, aVar2, 0, 495);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectManualLogCategoryScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f41605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41606b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<ManualLogCategory, nm0.y> f41607c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LogType f41608d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<ManualLogCategory> f41609e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ User f41610f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f41611g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, String str, ym0.l<? super ManualLogCategory, nm0.y> lVar, LogType logType, List<? extends ManualLogCategory> list, User user, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(3);
            this.f41605a = eVar;
            this.f41606b = str;
            this.f41607c = lVar;
            this.f41608d = logType;
            this.f41609e = list;
            this.f41610f = user;
            this.f41611g = pVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.e b10;
            r0.w padding = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(padding, "padding");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(this.f41605a);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    e.a aVar3 = androidx.compose.ui.e.f8927a;
                    b10 = androidx.compose.foundation.c.b(aVar3, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).O(), d2.h1.a());
                    aVar2.s(733328855);
                    androidx.compose.ui.layout.l0 c13 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                    int G2 = aVar2.G();
                    k1.v0 l6 = aVar2.l();
                    ym0.a a13 = g.a.a();
                    s1.a c14 = androidx.compose.ui.layout.y.c(b10);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a13);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c15 = com.google.protobuf.t.c(aVar2, c13, aVar2, l6);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c15);
                        }
                        l0.r.c(0, c14, k1.j1.a(aVar2), aVar2, 2058660585);
                        v4.a(androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), yk.h.o(), 0.0f, yk.h.o(), yk.h.B(), 2), this.f41606b, null, null, null, 0.0f, 0.0f, 0, 0, 0, aVar2, 0, 1020);
                        aVar2.J();
                        aVar2.o();
                        aVar2.J();
                        aVar2.J();
                        s0.a.a(null, null, null, false, null, null, null, false, new a2(this.f41607c, this.f41608d, this.f41609e, this.f41610f, this.f41611g), aVar2, 0, 255);
                        defpackage.d.j(aVar2);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectManualLogCategoryScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f41612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LogType f41613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f41614c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41615d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<ManualLogCategory, nm0.y> f41616e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<ManualLogCategory> f41617f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f41618g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f41619h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f41620i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f41621j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, LogType logType, User user, ym0.a<nm0.y> aVar, ym0.l<? super ManualLogCategory, nm0.y> lVar, List<? extends ManualLogCategory> list, androidx.compose.ui.e eVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, int i11, int i12) {
            super(2);
            this.f41612a = str;
            this.f41613b = logType;
            this.f41614c = user;
            this.f41615d = aVar;
            this.f41616e = lVar;
            this.f41617f = list;
            this.f41618g = eVar;
            this.f41619h = pVar;
            this.f41620i = i11;
            this.f41621j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f41620i | 1);
            androidx.compose.ui.e eVar = this.f41618g;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f41619h;
            w1.a(this.f41612a, this.f41613b, this.f41614c, this.f41615d, this.f41616e, this.f41617f, eVar, pVar, aVar, g11, this.f41621j);
            return nm0.y.f85009a;
        }
    }

    public static final void a(String title, LogType logType, User user, ym0.a<nm0.y> onBackClicked, ym0.l<? super ManualLogCategory, nm0.y> onClickOnLogCategory, List<? extends ManualLogCategory> list, androidx.compose.ui.e eVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        List<? extends ManualLogCategory> list2;
        androidx.compose.ui.e eVar2;
        ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(logType, "logType");
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onClickOnLogCategory, "onClickOnLogCategory");
        androidx.compose.runtime.b g11 = aVar.g(-876755390);
        if ((i12 & 32) != 0) {
            list2 = ManualLogCategory.b();
        } else {
            list2 = list;
        }
        if ((i12 & 64) != 0) {
            eVar2 = androidx.compose.ui.e.f8927a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 128) != 0) {
            pVar2 = null;
        } else {
            pVar2 = pVar;
        }
        t5.b(null, null, s1.b.b(g11, 1607059869, new a(onBackClicked)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, 867011140, new b(eVar2, title, onClickOnLogCategory, logType, list2, user, pVar2)), g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(title, logType, user, onBackClicked, onClickOnLogCategory, list2, eVar2, pVar2, i11, i12));
        }
    }
}
