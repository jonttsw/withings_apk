package com.withings.badge.profile;

import ah.o;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.h6;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.badge.model.BadgeModelUI;
import com.withings.badge.profile.d;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dq.x;
import java.util.List;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nk.a0;
import nm0.y;
import s0.i0;
import yk.h;
import ym0.l;
import ym0.p;
/* compiled from: ProfileBadgeCarouselScreen.kt */
/* loaded from: classes3.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileBadgeCarouselScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements l<i0, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f32859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d.a aVar, p<? super Long, ? super String, y> pVar) {
            super(1);
            this.f32859a = aVar;
            this.f32860b = pVar;
        }

        @Override // ym0.l
        public final y invoke(i0 i0Var) {
            i0 LazyRow = i0Var;
            u.j(LazyRow, "$this$LazyRow");
            List<BadgeModelUI.UnlockedBadgeModelUI> a11 = this.f32859a.a();
            LazyRow.c(a11.size(), null, new ci.c(ci.b.f22867a, a11), new s1.a(true, -632812321, new com.withings.badge.profile.b(this.f32860b, a11)));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileBadgeCarouselScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<y> aVar) {
            super(0);
            this.f32861a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f32861a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileBadgeCarouselScreen.kt */
    /* renamed from: com.withings.badge.profile.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0443c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f32862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32864c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0443c(d.a aVar, ym0.a<y> aVar2, p<? super Long, ? super String, y> pVar, int i11) {
            super(2);
            this.f32862a = aVar;
            this.f32863b = aVar2;
            this.f32864c = pVar;
            this.f32865d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32865d | 1);
            ym0.a<y> aVar2 = this.f32863b;
            p<Long, String, y> pVar = this.f32864c;
            c.a(this.f32862a, aVar2, pVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileBadgeCarouselScreen.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a<y> aVar) {
            super(0);
            this.f32866a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f32866a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileBadgeCarouselScreen.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<y> aVar, int i11) {
            super(2);
            this.f32867a = aVar;
            this.f32868b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32868b | 1);
            c.b(this.f32867a, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileBadgeCarouselScreen.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeCarouselViewModel f32869a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32870b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32871c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32872d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f32873e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ProfileBadgeCarouselViewModel profileBadgeCarouselViewModel, ym0.a<y> aVar, p<? super Long, ? super String, y> pVar, int i11, int i12) {
            super(2);
            this.f32869a = profileBadgeCarouselViewModel;
            this.f32870b = aVar;
            this.f32871c = pVar;
            this.f32872d = i11;
            this.f32873e = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32872d | 1);
            ym0.a<y> aVar2 = this.f32870b;
            p<Long, String, y> pVar = this.f32871c;
            c.d(this.f32869a, aVar2, pVar, aVar, g11, this.f32873e);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileBadgeCarouselScreen.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.badge.profile.d f32874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32875b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32877d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(com.withings.badge.profile.d dVar, ym0.a<y> aVar, p<? super Long, ? super String, y> pVar, int i11) {
            super(2);
            this.f32874a = dVar;
            this.f32875b = aVar;
            this.f32876c = pVar;
            this.f32877d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32877d | 1);
            ym0.a<y> aVar2 = this.f32875b;
            p<Long, String, y> pVar = this.f32876c;
            c.c(this.f32874a, aVar2, pVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d.a aVar, ym0.a<y> aVar2, p<? super Long, ? super String, y> pVar, androidx.compose.runtime.a aVar3, int i11) {
        boolean z5;
        androidx.compose.runtime.b g11 = aVar3.g(-449576066);
        e.a aVar4 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e h11 = x0.h(aVar4, h.d(), 0.0f, 2);
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(h.d());
        g11.s(-483455358);
        l0 a11 = com.withings.authentication.e.a(o11, g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(h11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            a0.f(0, 0, 29, 0L, g11, null, null, ay.b.u(C1987R.string._PROFILE_BADGES_, g11));
            s0.a.b(e1.e(e1.f(aVar4, (float) ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING), 1.0f), null, null, false, androidx.compose.foundation.layout.e.o(h.c()), null, null, false, new a(aVar, pVar), g11, 6, ConstantsWs.WS_STATUS_WRONGACCOUNTID);
            String u11 = ay.b.u(C1987R.string._SEE_ALL_, g11);
            g11.s(1236097343);
            if ((((i11 & 112) ^ 48) > 32 && g11.K(aVar2)) || (i11 & 48) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new b(aVar2);
                g11.n(t11);
            }
            g11.J();
            com.withings.common.compose.component.l.a(null, u11, null, false, null, null, false, (ym0.a) t11, g11, 0, 125);
            v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new C0443c(aVar, aVar2, pVar, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.b g11 = aVar2.g(-585374575);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
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
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e h11 = x0.h(aVar3, h.d(), 0.0f, 2);
            int i14 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(h.d());
            g11.s(-483455358);
            l0 a11 = com.withings.authentication.e.a(o11, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(h11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                boolean z5 = false;
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                a0.f(0, 0, 29, 0L, g11, null, null, ay.b.u(C1987R.string._PROFILE_BADGES_, g11));
                androidx.compose.material.x0.a(e1.e(aVar3, 1.0f), null, 0L, 0, ci.a.f22865a, g11, 1769478, 30);
                String u11 = ay.b.u(C1987R.string._SEE_ALL_, g11);
                g11.s(-1444436549);
                if ((i12 & 14) == 4) {
                    z5 = true;
                }
                Object t11 = g11.t();
                if (z5 || t11 == a.C0060a.a()) {
                    t11 = new d(aVar);
                    g11.n(t11);
                }
                g11.J();
                com.withings.common.compose.component.l.a(null, u11, null, false, null, null, false, (ym0.a) t11, g11, 0, 125);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(aVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.withings.badge.profile.d dVar, ym0.a<y> aVar, p<? super Long, ? super String, y> pVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar2.g(-981206797);
        if ((i11 & 14) == 0) {
            if (g11.K(dVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else if (dVar instanceof d.a) {
            g11.s(-2021028891);
            a((d.a) dVar, aVar, pVar, g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 112) | 8);
            g11.J();
        } else if (u.e(dVar, d.b.f32879a)) {
            g11.s(-2021028664);
            g11.J();
        } else if (u.e(dVar, d.c.f32880a)) {
            g11.s(-2021028602);
            b(aVar, g11, (i12 >> 3) & 14);
            g11.J();
        } else {
            g11.s(-2021028560);
            g11.J();
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(dVar, aVar, pVar, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
        if (r0 != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.withings.badge.profile.ProfileBadgeCarouselViewModel r8, ym0.a<nm0.y> r9, ym0.p<? super java.lang.Long, ? super java.lang.String, nm0.y> r10, androidx.compose.runtime.a r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.badge.profile.c.d(com.withings.badge.profile.ProfileBadgeCarouselViewModel, ym0.a, ym0.p, androidx.compose.runtime.a, int, int):void");
    }
}
