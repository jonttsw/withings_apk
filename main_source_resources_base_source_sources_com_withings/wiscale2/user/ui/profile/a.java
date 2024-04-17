package com.withings.wiscale2.user.ui.profile;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material3.g9;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.y3;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import k1.j1;
/* compiled from: AthleteModeToggles.kt */
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteModeToggles.kt */
    /* renamed from: com.withings.wiscale2.user.ui.profile.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0784a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f61919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f61920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0784a(ym0.l lVar, boolean z5) {
            super(3);
            this.f61919a = z5;
            this.f61920b = lVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.o.l(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), this.f61919a, this.f61920b, null, ay.b.u(C1987R.string._ATHLETE_MODE_, aVar2), null, false, false, false, null, aVar2, 0, 1000);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteModeToggles.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f61921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f61922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f61923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, ym0.l lVar, boolean z5) {
            super(2);
            this.f61921a = z5;
            this.f61922b = lVar;
            this.f61923c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61923c | 1);
            a.a(this.f61921a, this.f61922b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteModeToggles.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.f f61924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m70.f fVar) {
            super(1);
            this.f61924a = fVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            int i11;
            if (bool.booleanValue()) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            this.f61924a.w(i11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteModeToggles.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.f f61925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m70.f fVar) {
            super(1);
            this.f61925a = fVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            int i11;
            if (bool.booleanValue()) {
                i11 = 4;
            } else {
                i11 = 3;
            }
            this.f61925a.w(i11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteModeToggles.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.f f61926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f61927b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m70.f fVar, int i11) {
            super(2);
            this.f61926a = fVar;
            this.f61927b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61927b | 1);
            a.b(this.f61926a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteModeToggles.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f61928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f61929b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.l lVar, boolean z5) {
            super(3);
            this.f61928a = z5;
            this.f61929b = lVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.o.l(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), this.f61928a, this.f61929b, null, ay.b.u(C1987R.string._IS_JAPAN_, aVar2), null, false, false, false, null, aVar2, 0, 1000);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteModeToggles.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f61930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f61931b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f61932c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, ym0.l lVar, boolean z5) {
            super(2);
            this.f61930a = z5;
            this.f61931b = lVar;
            this.f61932c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61932c | 1);
            a.c(this.f61930a, this.f61931b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(boolean z5, ym0.l<? super Boolean, nm0.y> onToggle, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onToggle, "onToggle");
        androidx.compose.runtime.b g11 = aVar.g(-1881927035);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onToggle)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            y3.d(null, ay.b.u(C1987R.string._ADVANCED_SETTINGS_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, 866679675, new C0784a(onToggle, z5)), g11, 1572864, 61);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            r0.d0.a(e1.f(aVar2, yk.h.b()), g11);
            nk.u.d(0, 0, 0, 60, 0L, g11, androidx.compose.foundation.layout.x0.h(e1.e(aVar2, 1.0f), yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.athleteMode_description, g11));
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11, onToggle, z5));
        }
    }

    public static final void b(m70.f userInfoFormState, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        kotlin.jvm.internal.u.j(userInfoFormState, "userInfoFormState");
        androidx.compose.runtime.b g11 = aVar.g(890693519);
        if ((i11 & 14) == 0) {
            if (g11.K(userInfoFormState)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            r0.d0.a(e1.f(aVar2, yk.h.q()), g11);
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                boolean z5 = true;
                if (dp0.j.x(Locale.JAPAN.getLanguage(), Locale.getDefault().getLanguage())) {
                    g11.s(-217477115);
                    if (userInfoFormState.h() != 5) {
                        z5 = false;
                    }
                    c(z5, new c(userInfoFormState), g11, 0);
                    g11.J();
                } else {
                    g11.s(-217476754);
                    if (userInfoFormState.h() != 4) {
                        z5 = false;
                    }
                    a(z5, new d(userInfoFormState), g11, 0);
                    g11.J();
                }
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(userInfoFormState, i11));
        }
    }

    public static final void c(boolean z5, ym0.l<? super Boolean, nm0.y> onToggle, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onToggle, "onToggle");
        androidx.compose.runtime.b g11 = aVar.g(-161498474);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onToggle)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            y3.d(null, ay.b.u(C1987R.string._ADVANCED_SETTINGS_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -854667892, new f(onToggle, z5)), g11, 1572864, 61);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            r0.d0.a(e1.f(aVar2, yk.h.b()), g11);
            nk.u.d(0, 0, 0, 60, 0L, g11, androidx.compose.foundation.layout.x0.h(e1.e(aVar2, 1.0f), yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string._JAPAN_EXPLANATION_, g11));
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(i11, onToggle, z5));
        }
    }
}
