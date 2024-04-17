package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.text.HeaderStyle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f45832a = new s1.a(false, -1026371394, C0631a.f45836a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f45833b = new s1.a(false, 1401005101, b.f45837a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f45834c = new s1.a(false, 1199914722, c.f45838a);

    /* renamed from: d  reason: collision with root package name */
    public static s1.a f45835d = new s1.a(false, 1420007087, d.f45839a);

    /* compiled from: PregnancyMode.kt */
    /* renamed from: com.withings.tutorials.ui.screens.modes.pregnancy.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0631a extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0631a f45836a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
            j5.e(num, cVar, "$this$composable", dVar, "it");
            com.withings.tutorials.ui.screens.modes.pregnancy.d.f45852a.f(aVar, 6);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f45837a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.pregnancy_mode_page_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                r0.d0.a(androidx.compose.foundation.layout.e1.f(androidx.compose.ui.e.f8927a, yk.h.a()), aVar2);
                nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.scale_mode_page_note, aVar2));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f45838a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), 1.0f);
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
                    nk.a0.f(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string.pregnancy_mode_survey_warningDisabledFeatures_title, aVar2));
                    nk.a.d(null, ay.b.u(C1987R.string.pregnancy_mode_survey_warningDisabledFeatures_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f45839a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.pregnancy_mode_survey_enabled_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }
}
