package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.k4;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.text.HeaderStyle;
import com.withings.common.compose.component.y3;
import com.withings.common.compose.picker.SurveyDateValidator;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
import com.withings.wiscale2.C1987R;
import fk.m;
import java.util.Locale;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k4 f46018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k4 k4Var, ym0.a<nm0.y> aVar) {
            super(0);
            this.f46018a = k4Var;
            this.f46019b = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k4 k4Var = this.f46018a;
            if (k4Var != null) {
                k4Var.a();
            }
            this.f46019b.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f46020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46021b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<DateTime> f46022c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f46023d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ym0.l<? super DateTime, nm0.y> lVar, ym0.a<nm0.y> aVar, k1.r0<DateTime> r0Var, k1.r0<String> r0Var2) {
            super(2);
            this.f46020a = lVar;
            this.f46021b = aVar;
            this.f46022c = r0Var;
            this.f46023d = r0Var2;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    String upperCase = ay.b.u(C1987R.string.tutorials_section_tutorials_required, aVar2).toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                    nk.a0.d(null, upperCase, HeaderStyle.f34761e, null, s2.b.a(C1987R.color.statusInfo, aVar2), 0, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 41);
                    nk.o0.a(ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1, aVar2, null, ay.b.u(C1987R.string.pregnancy_mode_survey_dueDate_title, aVar2), null);
                    r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.B()), aVar2);
                    String u11 = ay.b.u(C1987R.string.pregnancy_mode_survey_dueDate_datePicker_title, aVar2);
                    DateTime minusDays = DateTime.now().minusDays(1);
                    DateTime plusMonths = DateTime.now().plusMonths(10);
                    aVar2.s(1507963073);
                    ym0.l<DateTime, nm0.y> lVar = this.f46020a;
                    boolean K = aVar2.K(lVar);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new r0(lVar, this.f46022c, this.f46023d);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    m.a aVar4 = new m.a((ym0.l) t11);
                    SurveyDateValidator surveyDateValidator = new SurveyDateValidator(Long.valueOf(DateTime.now().minusDays(1).getMillis()), Long.valueOf(DateTime.now().plusMonths(10).getMillis()));
                    kotlin.jvm.internal.u.g(minusDays);
                    kotlin.jvm.internal.u.g(plusMonths);
                    fk.l.a(u11, aVar4, null, null, minusDays, plusMonths, false, surveyDateValidator, aVar2, 294912, 76);
                    com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.pregnancy_mode_survey_dueDate_helpButton, aVar2), null, false, ColorStyle.f33324c, ButtonSize.f33304f, false, this.f46021b, aVar2, 221184, 77);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<DateTime> f46024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46026c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.r0<DateTime> r0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f46024a = r0Var;
            this.f46025b = aVar;
            this.f46026c = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            wk.i.a(null, true, s1.b.b(aVar2, 635940947, new s0(this.f46024a, this.f46025b)), s1.b.b(aVar2, -1993152654, new t0(this.f46026c)), aVar2, 3504, 1);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DateTime f46028b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46029c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46030d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46031e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f46032f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46033g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f46034h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f46035i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, DateTime dateTime, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.l<? super DateTime, nm0.y> lVar, ym0.a<nm0.y> aVar4, int i11, int i12) {
            super(2);
            this.f46027a = str;
            this.f46028b = dateTime;
            this.f46029c = aVar;
            this.f46030d = aVar2;
            this.f46031e = aVar3;
            this.f46032f = lVar;
            this.f46033g = aVar4;
            this.f46034h = i11;
            this.f46035i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46034h | 1);
            ym0.l<DateTime, nm0.y> lVar = this.f46032f;
            ym0.a<nm0.y> aVar2 = this.f46033g;
            q0.a(this.f46027a, this.f46028b, this.f46029c, this.f46030d, this.f46031e, lVar, aVar2, aVar, g11, this.f46035i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DueDateMethod[] f46036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<DueDateMethod> f46037b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<DueDateMethod, nm0.y> f46038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(DueDateMethod[] dueDateMethodArr, k1.r0<DueDateMethod> r0Var, ym0.l<? super DueDateMethod, nm0.y> lVar) {
            super(2);
            this.f46036a = dueDateMethodArr;
            this.f46037b = r0Var;
            this.f46038c = lVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
                    c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2);
                    aVar2.s(-483455358);
                    androidx.compose.ui.layout.l0 a13 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                    int G2 = aVar2.G();
                    k1.v0 l6 = aVar2.l();
                    ym0.a a14 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(h11);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a14);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c14 = com.google.protobuf.t.c(aVar2, a13, aVar2, l6);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c14);
                        }
                        l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                        String upperCase = ay.b.u(C1987R.string.tutorials_section_tutorials_required, aVar2).toUpperCase(Locale.ROOT);
                        kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                        nk.a0.d(null, upperCase, HeaderStyle.f34761e, null, s2.b.a(C1987R.color.statusInfo, aVar2), 0, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 41);
                        r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.b()), aVar2);
                        nk.o0.a(ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1, aVar2, null, ay.b.u(C1987R.string.pregnancy_mode_survey_calculateDueDate_title, aVar2), null);
                        r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.a()), aVar2);
                        nk.a.d(null, ay.b.u(C1987R.string.pregnancy_mode_survey_calculateDueDate_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                        aVar2.J();
                        aVar2.o();
                        aVar2.J();
                        aVar2.J();
                        r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.s()), aVar2);
                        y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(aVar2, -456670913, new v0(this.f46036a, this.f46037b, this.f46038c)), aVar2, 1572864, 63);
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
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<DueDateMethod> f46039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k1.r0<DueDateMethod> r0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f46039a = r0Var;
            this.f46040b = aVar;
            this.f46041c = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            wk.i.a(null, true, s1.b.b(aVar2, 248107568, new w0(this.f46039a, this.f46040b)), s1.b.b(aVar2, 1819342351, new x0(this.f46041c)), aVar2, 3504, 1);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DueDateMethod f46043b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DueDateMethod[] f46044c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46045d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46046e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<DueDateMethod, nm0.y> f46047f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46048g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f46049h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f46050i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, DueDateMethod dueDateMethod, DueDateMethod[] dueDateMethodArr, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super DueDateMethod, nm0.y> lVar, ym0.a<nm0.y> aVar3, int i11, int i12) {
            super(2);
            this.f46042a = str;
            this.f46043b = dueDateMethod;
            this.f46044c = dueDateMethodArr;
            this.f46045d = aVar;
            this.f46046e = aVar2;
            this.f46047f = lVar;
            this.f46048g = aVar3;
            this.f46049h = i11;
            this.f46050i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46049h | 1);
            ym0.l<DueDateMethod, nm0.y> lVar = this.f46047f;
            ym0.a<nm0.y> aVar2 = this.f46048g;
            q0.b(this.f46042a, this.f46043b, this.f46044c, this.f46045d, this.f46046e, lVar, aVar2, aVar, g11, this.f46050i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k4 f46051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k4 k4Var, ym0.a<nm0.y> aVar) {
            super(0);
            this.f46051a = k4Var;
            this.f46052b = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k4 k4Var = this.f46051a;
            if (k4Var != null) {
                k4Var.a();
            }
            this.f46052b.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DateTime f46053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f46054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f46055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(DateTime dateTime, ym0.l<? super DateTime, nm0.y> lVar, k1.r0<String> r0Var) {
            super(2);
            this.f46053a = dateTime;
            this.f46054b = lVar;
            this.f46055c = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    String upperCase = ay.b.u(C1987R.string.tutorials_section_tutorials_required, aVar2).toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                    nk.a0.d(null, upperCase, HeaderStyle.f34761e, null, s2.b.a(C1987R.color.statusInfo, aVar2), 0, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 41);
                    nk.o0.a(ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1, aVar2, null, ay.b.u(C1987R.string.pregnancy_mode_survey_conceivedDate_title, aVar2), null);
                    r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.B()), aVar2);
                    DateTime dateTime = this.f46053a;
                    if (dateTime == null) {
                        dateTime = DateTime.now();
                    }
                    DateTime dateTime2 = dateTime;
                    String u11 = ay.b.u(C1987R.string.pregnancy_mode_survey_calculateDueDate_radioButton_2, aVar2);
                    aVar2.s(1204698054);
                    ym0.l<DateTime, nm0.y> lVar = this.f46054b;
                    boolean K = aVar2.K(lVar);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new y0(this.f46055c, lVar);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    fk.l.a(u11, new m.a((ym0.l) t11), null, dateTime2, null, null, false, new SurveyDateValidator(Long.valueOf(DateTime.now().minusYears(1).getMillis()), Long.valueOf(DateTime.now().getMillis())), aVar2, 4096, 116);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f46056a = aVar;
            this.f46057b = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            wk.i.a(null, true, s1.b.b(aVar2, -1378991763, new z0(this.f46056a)), s1.b.b(aVar2, -1703000146, new a1(this.f46057b)), aVar2, 3504, 1);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DateTime f46059b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46060c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46061d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f46062e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46063f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f46064g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f46065h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(String str, DateTime dateTime, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super DateTime, nm0.y> lVar, ym0.a<nm0.y> aVar3, int i11, int i12) {
            super(2);
            this.f46058a = str;
            this.f46059b = dateTime;
            this.f46060c = aVar;
            this.f46061d = aVar2;
            this.f46062e = lVar;
            this.f46063f = aVar3;
            this.f46064g = i11;
            this.f46065h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46064g | 1);
            ym0.l<DateTime, nm0.y> lVar = this.f46062e;
            ym0.a<nm0.y> aVar2 = this.f46063f;
            q0.c(this.f46058a, this.f46059b, this.f46060c, this.f46061d, lVar, aVar2, aVar, g11, this.f46065h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f46066a = aVar;
            this.f46067b = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            wk.i.a(null, true, s1.b.b(aVar2, 762704875, new b1(this.f46066a)), s1.b.b(aVar2, 1806492844, new c1(this.f46067b)), aVar2, 3504, 1);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46069b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46070c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f46071d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
            super(2);
            this.f46068a = aVar;
            this.f46069b = aVar2;
            this.f46070c = aVar3;
            this.f46071d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46071d | 1);
            ym0.a<nm0.y> aVar2 = this.f46069b;
            ym0.a<nm0.y> aVar3 = this.f46070c;
            q0.d(this.f46068a, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46072a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ym0.a<nm0.y> aVar) {
            super(2);
            this.f46072a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._DONE_, aVar2), null, false, null, null, false, this.f46072a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f46075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f46073a = aVar;
            this.f46074b = aVar2;
            this.f46075c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46075c | 1);
            q0.e(this.f46073a, this.f46074b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class p {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<DueDateMethod> f46076a = sm0.b.a(DueDateMethod.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k4 f46077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(k4 k4Var, ym0.a<nm0.y> aVar) {
            super(0);
            this.f46077a = k4Var;
            this.f46078b = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k4 k4Var = this.f46077a;
            if (k4Var != null) {
                k4Var.a();
            }
            this.f46078b.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f46079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<DateTime> f46080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f46081c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f46082d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(ym0.l<? super DateTime, nm0.y> lVar, k1.r0<DateTime> r0Var, k1.r0<String> r0Var2, String str) {
            super(2);
            this.f46079a = lVar;
            this.f46080b = r0Var;
            this.f46081c = r0Var2;
            this.f46082d = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    r0.i iVar = r0.i.f94242a;
                    String upperCase = ay.b.u(C1987R.string.tutorials_section_tutorials_required, aVar2).toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                    nk.a0.d(null, upperCase, HeaderStyle.f34761e, null, s2.b.a(C1987R.color.statusInfo, aVar2), 0, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 41);
                    nk.o0.a(ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1, aVar2, null, ay.b.u(C1987R.string.pregnancy_mode_survey_lastPeriodStart_title, aVar2), null);
                    r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.B()), aVar2);
                    String u11 = ay.b.u(C1987R.string.pregnancy_mode_survey_lastPeriodStart_datePicker_title, aVar2);
                    aVar2.s(-1512011732);
                    ym0.l<DateTime, nm0.y> lVar = this.f46079a;
                    boolean K = aVar2.K(lVar);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new d1(lVar, this.f46080b, this.f46081c);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    fk.l.a(u11, new m.a((ym0.l) t11), null, null, null, null, false, new SurveyDateValidator(Long.valueOf(DateTime.now().minusYears(1).getMillis()), Long.valueOf(DateTime.now().getMillis())), aVar2, 0, 124);
                    l0.g.c(iVar, false, null, null, null, null, s1.b.b(aVar2, 402358452, new e1(this.f46082d)), aVar2, 1572918, 30);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class s extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<DateTime> f46083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DateTime f46084b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f46085c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46086d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46087e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(k1.r0<DateTime> r0Var, DateTime dateTime, ym0.l<? super DateTime, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f46083a = r0Var;
            this.f46084b = dateTime;
            this.f46085c = lVar;
            this.f46086d = aVar;
            this.f46087e = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            wk.i.a(null, true, s1.b.b(aVar2, -850985447, new g1(this.f46083a, this.f46084b, this.f46085c, this.f46086d)), s1.b.b(aVar2, -506422088, new h1(this.f46087e)), aVar2, 3504, 1);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DateTime f46089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f46090c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46091d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46092e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f46093f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46094g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f46095h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f46096i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(String str, DateTime dateTime, String str2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super DateTime, nm0.y> lVar, ym0.a<nm0.y> aVar3, int i11, int i12) {
            super(2);
            this.f46088a = str;
            this.f46089b = dateTime;
            this.f46090c = str2;
            this.f46091d = aVar;
            this.f46092e = aVar2;
            this.f46093f = lVar;
            this.f46094g = aVar3;
            this.f46095h = i11;
            this.f46096i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46095h | 1);
            ym0.l<DateTime, nm0.y> lVar = this.f46093f;
            ym0.a<nm0.y> aVar2 = this.f46094g;
            q0.f(this.f46088a, this.f46089b, this.f46090c, this.f46091d, this.f46092e, lVar, aVar2, aVar, g11, this.f46096i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class u extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k4 f46097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(k4 k4Var, ym0.a<nm0.y> aVar) {
            super(0);
            this.f46097a = k4Var;
            this.f46098b = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k4 k4Var = this.f46097a;
            if (k4Var != null) {
                k4Var.a();
            }
            this.f46098b.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s60.a f46099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Double f46100b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46101c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<Double> f46102d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46103e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(s60.a aVar, Double d11, ym0.a<nm0.y> aVar2, k1.r0<Double> r0Var, ym0.a<nm0.y> aVar3) {
            super(2);
            this.f46099a = aVar;
            this.f46100b = d11;
            this.f46101c = aVar2;
            this.f46102d = r0Var;
            this.f46103e = aVar3;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            androidx.compose.ui.text.b bVar;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2));
                    aVar2.s(-483455358);
                    androidx.compose.ui.layout.l0 a12 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                    int G2 = aVar2.G();
                    k1.v0 l6 = aVar2.l();
                    ym0.a a13 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(d11);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a13);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c14 = com.google.protobuf.t.c(aVar2, a12, aVar2, l6);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c14);
                        }
                        l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                        String upperCase = ay.b.u(C1987R.string.tutorials_section_tutorials_required, aVar2).toUpperCase(Locale.ROOT);
                        kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                        nk.a0.d(null, upperCase, HeaderStyle.f34761e, null, s2.b.a(C1987R.color.statusInfo, aVar2), 0, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 41);
                        nk.o0.a(ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1, aVar2, null, ay.b.u(C1987R.string.pregnancy_mode_survey_lastWeight_title, aVar2), null);
                        r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.B()), aVar2);
                        aVar2.J();
                        aVar2.o();
                        aVar2.J();
                        aVar2.J();
                        aVar2.s(70051411);
                        Object t11 = aVar2.t();
                        if (t11 == a.C0060a.a()) {
                            t11 = new b2.k();
                            aVar2.n(t11);
                        }
                        b2.k kVar = (b2.k) t11;
                        aVar2.J();
                        String u11 = ay.b.u(C1987R.string._WEIGHT_, aVar2);
                        s60.a aVar4 = this.f46099a;
                        Double b11 = aVar4.b();
                        if (kotlin.jvm.internal.u.b(b11)) {
                            b11 = null;
                        }
                        Double d12 = this.f46100b;
                        k1.r0<Double> r0Var = this.f46102d;
                        if (b11 == null) {
                            if (d12 != null && r0Var.getValue() == null) {
                                b11 = d12;
                            } else {
                                b11 = null;
                            }
                        }
                        int c15 = aVar4.c();
                        if (aVar4.a() != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Integer a14 = aVar4.a();
                        aVar2.s(70051948);
                        if (a14 == null) {
                            bVar = null;
                        } else {
                            bVar = new androidx.compose.ui.text.b(ay.b.u(a14.intValue(), aVar2), null, 6);
                        }
                        aVar2.J();
                        fk.v.a(u11, b11, c15, z5, bVar, "", kVar, 6, true, null, new i1(aVar4, d12, this.f46103e), new j1(aVar4, r0Var), this.f46101c, aVar2, 115015680, 0, 512);
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
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class w extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Double> f46104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46105b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(k1.r0<Double> r0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f46104a = r0Var;
            this.f46105b = aVar;
            this.f46106c = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            wk.i.a(null, true, s1.b.b(aVar2, -1232879279, new k1(this.f46104a, this.f46105b)), s1.b.b(aVar2, -1182194286, new l1(this.f46106c)), aVar2, 3504, 1);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Double f46108b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s60.a f46109c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46110d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46111e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46112f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f46113g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f46114h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, Double d11, s60.a aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, int i11) {
            super(2);
            this.f46107a = str;
            this.f46108b = d11;
            this.f46109c = aVar;
            this.f46110d = aVar2;
            this.f46111e = aVar3;
            this.f46112f = aVar4;
            this.f46113g = aVar5;
            this.f46114h = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46114h | 1);
            ym0.a<nm0.y> aVar2 = this.f46112f;
            ym0.a<nm0.y> aVar3 = this.f46113g;
            q0.g(this.f46107a, this.f46108b, this.f46109c, this.f46110d, this.f46111e, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r30, org.joda.time.DateTime r31, ym0.a<nm0.y> r32, ym0.a<nm0.y> r33, ym0.a<nm0.y> r34, ym0.l<? super org.joda.time.DateTime, nm0.y> r35, ym0.a<nm0.y> r36, androidx.compose.runtime.a r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.q0.a(java.lang.String, org.joda.time.DateTime, ym0.a, ym0.a, ym0.a, ym0.l, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r28, com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod r29, com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod[] r30, ym0.a<nm0.y> r31, ym0.a<nm0.y> r32, ym0.l<? super com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod, nm0.y> r33, ym0.a<nm0.y> r34, androidx.compose.runtime.a r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.q0.b(java.lang.String, com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod, com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod[], ym0.a, ym0.a, ym0.l, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r30, org.joda.time.DateTime r31, ym0.a<nm0.y> r32, ym0.a<nm0.y> r33, ym0.l<? super org.joda.time.DateTime, nm0.y> r34, ym0.a<nm0.y> r35, androidx.compose.runtime.a r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.q0.c(java.lang.String, org.joda.time.DateTime, ym0.a, ym0.a, ym0.l, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void d(ym0.a<nm0.y> onBackClicked, ym0.a<nm0.y> onNextClicked, ym0.a<nm0.y> onFinish, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        long j5;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        kotlin.jvm.internal.u.j(onFinish, "onFinish");
        androidx.compose.runtime.b g11 = aVar.g(-1990248068);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onFinish)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar2);
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b11 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, b11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                r0.i iVar = r0.i.f94242a;
                androidx.compose.ui.e a12 = iVar.a(androidx.compose.foundation.layout.e1.e(aVar2, 1.0f), true);
                androidx.compose.ui.layout.l0 e11 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a13 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(a12);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a13);
                    } else {
                        g11.m();
                    }
                    ym0.p b13 = com.withings.authentication.e.b(g11, e11, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                    }
                    c12.invoke(k1.j1.a(g11), g11, 0);
                    g11.s(2058660585);
                    b10 = androidx.compose.foundation.c.b(aVar2, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), d2.h1.a());
                    g11.s(-483455358);
                    androidx.compose.ui.layout.l0 b14 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
                    int G3 = g11.G();
                    k1.v0 l11 = g11.l();
                    ym0.a a14 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(b10);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a14);
                        } else {
                            g11.m();
                        }
                        ym0.p b15 = com.withings.authentication.e.b(g11, b14, g11, l11);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G3))) {
                            androidx.camera.camera2.internal.l0.d(G3, g11, G3, b15);
                        }
                        dq.x.b(0, c13, k1.j1.a(g11), g11, 2058660585);
                        String u11 = ay.b.u(C1987R.string.pregnancy_mode_survey_title, g11);
                        h2.d a15 = d1.e.a();
                        j5 = d2.f0.f63265i;
                        c5.a(j5, 0L, u11, true, a15, null, null, null, false, onFinish, g11, ((i12 << 21) & 1879048192) | 3078, 482);
                        xk.c.a(androidx.compose.foundation.layout.e1.d(aVar2), null, "", com.withings.tutorials.ui.screens.modes.pregnancy.a.f45834c, g11, 3510, 0);
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                        g11 = g11;
                        l0.g.c(iVar, true, null, null, null, null, s1.b.b(g11, -671985718, new l(onNextClicked, onBackClicked)), g11, 1572918, 30);
                        g9.a(g11);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new m(onBackClicked, onNextClicked, onFinish, i11));
        }
    }

    public static final void e(ym0.a<nm0.y> onBackClicked, ym0.a<nm0.y> onFinish, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onFinish, "onFinish");
        androidx.compose.runtime.b g11 = aVar.g(192573228);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onFinish)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.c(ay.b.u(C1987R.string.pregnancy_mode_survey_enabled_title, g11), s2.d.a(2131232244, g11), onBackClicked, s1.b.b(g11, 1705442499, new n(onFinish)), null, 0.0f, null, com.withings.tutorials.ui.screens.modes.pregnancy.a.f45835d, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 12586048, 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new o(onBackClicked, onFinish, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r29, org.joda.time.DateTime r30, java.lang.String r31, ym0.a<nm0.y> r32, ym0.a<nm0.y> r33, ym0.l<? super org.joda.time.DateTime, nm0.y> r34, ym0.a<nm0.y> r35, androidx.compose.runtime.a r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.q0.f(java.lang.String, org.joda.time.DateTime, java.lang.String, ym0.a, ym0.a, ym0.l, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void g(String title, Double d11, s60.a formState, ym0.a<nm0.y> onBackClicked, ym0.a<nm0.y> onNextClicked, ym0.a<nm0.y> onWeightUnitClicked, ym0.a<nm0.y> onFinish, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        long j5;
        boolean z5;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(formState, "formState");
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        kotlin.jvm.internal.u.j(onWeightUnitClicked, "onWeightUnitClicked");
        kotlin.jvm.internal.u.j(onFinish, "onFinish");
        androidx.compose.runtime.b g11 = aVar.g(1878872674);
        if ((i11 & 14) == 0) {
            if (g11.K(title)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(d11)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(formState)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onBackClicked)) {
                i16 = ModuleCopy.f28574b;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((57344 & i11) == 0) {
            if (g11.w(onNextClicked)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((458752 & i11) == 0) {
            if (g11.w(onWeightUnitClicked)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((i11 & 3670016) == 0) {
            if (g11.w(onFinish)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((2995931 & i12) == 599186 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            g11.s(788489011);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(d11, androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            k4 k4Var = (k4) androidx.appcompat.view.menu.d.b(g11);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e d12 = androidx.compose.foundation.layout.e1.d(aVar2);
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b11 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d12);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, b11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                r0.i iVar = r0.i.f94242a;
                androidx.compose.ui.e a12 = iVar.a(androidx.compose.foundation.layout.e1.e(aVar2, 1.0f), true);
                androidx.compose.ui.layout.l0 e11 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a13 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(a12);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a13);
                    } else {
                        g11.m();
                    }
                    ym0.p b13 = com.withings.authentication.e.b(g11, e11, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                    }
                    c12.invoke(k1.j1.a(g11), g11, 0);
                    g11.s(2058660585);
                    b10 = androidx.compose.foundation.c.b(aVar2, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), d2.h1.a());
                    g11.s(-483455358);
                    androidx.compose.ui.layout.l0 b14 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
                    int G3 = g11.G();
                    k1.v0 l11 = g11.l();
                    ym0.a a14 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(b10);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a14);
                        } else {
                            g11.m();
                        }
                        ym0.p b15 = com.withings.authentication.e.b(g11, b14, g11, l11);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G3))) {
                            androidx.camera.camera2.internal.l0.d(G3, g11, G3, b15);
                        }
                        c13.invoke(k1.j1.a(g11), g11, 0);
                        g11.s(2058660585);
                        h2.d a15 = d1.e.a();
                        j5 = d2.f0.f63265i;
                        g11.s(-1513903165);
                        boolean K = g11.K(k4Var);
                        if ((3670016 & i12) == 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean z11 = K | z5;
                        Object t12 = g11.t();
                        if (z11 || t12 == a.C0060a.a()) {
                            t12 = new u(k4Var, onFinish);
                            g11.n(t12);
                        }
                        g11.J();
                        c5.a(j5, 0L, title, true, a15, null, null, null, false, (ym0.a) t12, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 3078, 482);
                        bVar = g11;
                        xk.c.a(androidx.compose.foundation.layout.e1.d(aVar2), null, "", s1.b.b(bVar, -1356653368, new v(formState, d11, onWeightUnitClicked, r0Var, onNextClicked)), bVar, 3510, 0);
                        bVar.J();
                        bVar.o();
                        bVar.J();
                        bVar.J();
                        bVar.J();
                        bVar.o();
                        bVar.J();
                        bVar.J();
                        l0.g.c(iVar, true, null, null, null, null, s1.b.b(bVar, -1704994384, new w(r0Var, onNextClicked, onBackClicked)), bVar, 1572918, 30);
                        g9.a(bVar);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new x(title, d11, formState, onBackClicked, onNextClicked, onWeightUnitClicked, onFinish, i11));
        }
    }
}
