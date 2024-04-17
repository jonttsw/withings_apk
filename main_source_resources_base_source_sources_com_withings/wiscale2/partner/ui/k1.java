package com.withings.wiscale2.partner.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.c5;
import androidx.compose.material.g6;
import androidx.compose.material.h6;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import x1.b;
import x1.d;
/* compiled from: PartnerIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/partner/ui/k1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "d", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k1 extends n {

    /* renamed from: h  reason: collision with root package name */
    private final f f59136h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    private final g f59137i = new g(this);
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public AccountSessionRepository f59138j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public vf.c f59139k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public t10.e f59140l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public m70.i f59141m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f59142n;

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59135p = {androidx.camera.core.v.c(k1.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(k1.class, "partner", "getPartner()Lcom/withings/partner/model/Partner;", 0)};

    /* renamed from: o  reason: collision with root package name */
    public static final d f59134o = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerIntroFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            Object a11;
            k1 k1Var = k1.this;
            if (k1Var.B1().C()) {
                try {
                    a11 = BuildersKt__Builders_commonKt.launch$default(m0.t.l(k1Var), Dispatchers.getIO(), null, new w1(k1Var, null), 2, null);
                } catch (Throwable th2) {
                    a11 = nm0.l.a(th2);
                }
                if (nm0.k.b(a11) != null) {
                    Toast.makeText(k1Var.requireContext(), (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 0).show();
                }
            } else {
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(k1Var), null, null, new x1(k1Var, null), 3, null);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerIntroFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f59145b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f59146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z5, Context context) {
            super(0);
            this.f59145b = z5;
            this.f59146c = context;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k1 k1Var = k1.this;
            String B = k1Var.B1().B();
            Context context = this.f59146c;
            if (B != null && !this.f59145b) {
                String string = context.getString(k1Var.B1().d());
                kotlin.jvm.internal.u.i(string, "getString(...)");
                k1Var.f59142n.a(u70.e.b(string, k1Var.B1().B()));
            } else {
                u70.e.d(context, k1Var.B1().d());
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerIntroFragment.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f59148b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z5, int i11) {
            super(2);
            this.f59148b = z5;
            this.f59149c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59149c | 1);
            k1.this.t1(this.f59148b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PartnerIntroFragment.kt */
    /* loaded from: classes5.dex */
    public static final class d {
    }

    /* compiled from: PartnerIntroFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        e() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -774860648, new v1(k1.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59151a = nm0.h.b(new y1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f59152b;

        public f(Fragment fragment) {
            this.f59152b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59151a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Fragment, Partner> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59153a = nm0.h.b(new z1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f59154b;

        public g(Fragment fragment) {
            this.f59154b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.partner.model.Partner, java.lang.Object] */
        @Override // bn0.d
        public final Partner getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59153a.getValue();
        }
    }

    public k1() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new Object());
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f59142n = registerForActivityResult;
    }

    public static final User A1(k1 k1Var) {
        return (User) k1Var.f59136h.getValue(k1Var, f59135p[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Partner B1() {
        return (Partner) this.f59137i.getValue(this, f59135p[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(int i11, androidx.compose.runtime.a aVar, ym0.a aVar2, boolean z5) {
        float f11;
        int i12;
        androidx.compose.runtime.b g11 = aVar.g(-628196722);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        g11.s(142932069);
        if (B1().n()) {
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
            if (z5) {
                i12 = C1987R.string._OPEN_APP_;
            } else {
                i12 = C1987R.string._DOWNLOAD_APP_;
            }
            f11 = 0.0f;
            com.withings.common.compose.component.l.a(h11, ay.b.u(i12, g11), null, false, null, null, false, new i1(this, z5, context), g11, 0, 124);
        } else {
            f11 = 0.0f;
        }
        g11.J();
        com.withings.common.compose.component.l.c(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), f11, 2), ay.b.u(C1987R.string.partner_deactivate, g11), null, false, null, null, false, aVar2, g11, (i11 << 18) & 29360128, 124);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j1(this, z5, aVar2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(boolean z5, androidx.compose.runtime.a aVar, int i11) {
        boolean z11;
        float f11;
        int i12;
        k1 k1Var;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(720557509);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        boolean z12 = false;
        if ((B1().F() || B1().E()) && !z5 && B1().n()) {
            z11 = false;
        } else {
            z11 = true;
        }
        g11.s(-998349615);
        if (z11) {
            f11 = 0.0f;
            i12 = 2;
            com.withings.common.compose.component.l.a(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), ay.b.u(C1987R.string.partner_activate, g11), null, false, null, null, false, new a(), g11, 0, 124);
        } else {
            f11 = 0.0f;
            i12 = 2;
        }
        g11.J();
        if (B1().l() == Partner.f43457o.l() && z11) {
            z12 = true;
        }
        if (B1().n() && !z12) {
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), f11, i12);
            if (z5) {
                i13 = C1987R.string._OPEN_APP_;
            } else {
                i13 = C1987R.string._DOWNLOAD_APP_;
            }
            String u11 = ay.b.u(i13, g11);
            k1Var = this;
            com.withings.common.compose.component.l.c(h11, u11, null, false, null, null, false, new b(z5, context), g11, 0, 124);
        } else {
            k1Var = this;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(z5, i11));
        }
    }

    public static final void w1(k1 k1Var, CoroutineScope coroutineScope, c5 c5Var, androidx.compose.runtime.a aVar, int i11) {
        k1Var.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1991242791);
        androidx.compose.ui.e g12 = androidx.compose.foundation.layout.x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B());
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(g6.b(g11, -483455358), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(g12);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            String u11 = ay.b.u(k1Var.B1().w(), g11);
            nk.a.d(null, ay.b.v(C1987R.string._DISCONNECT_SERVICE_CONFIRMATION__s__s_, new Object[]{u11, u11}, g11), 0L, null, 0, 0, null, g11, 0, 125);
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.partner_deactivate, g11), null, false, null, null, false, new l1(k1Var), g11, 0, 125);
            com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._CANCEL_, g11), null, false, null, null, false, new n1(c5Var, coroutineScope), g11, 0, 125);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new o1(k1Var, coroutineScope, c5Var, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void x1(k1 k1Var, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        k1Var.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-2026276666);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(ah.k.p(aVar3), 0.0f, 0.0f, 0.0f, yk.h.B(), 7);
        d.a g12 = b.a.g();
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.B());
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(o11, g12, g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(j5);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            c11.invoke(k1.j1.a(g11), g11, 0);
            g11.s(2058660585);
            com.withings.common.compose.component.c5.a(((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), 0L, null, false, null, null, null, null, false, new p1(k1Var), g11, 0, ConstantsWs.WS_STATUS_ERROR_ARRAY_WAM);
            n0.z.a(s2.d.a(k1Var.B1().v(), g11), null, androidx.compose.foundation.layout.w0.a(androidx.compose.foundation.layout.e1.e(aVar3, 0.3f), 1.0f), null, null, 0.0f, null, g11, 440, 120);
            nk.a0.e(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2), null, ay.b.u(k1Var.B1().w(), g11));
            Integer A = k1Var.B1().A();
            g11.s(-1207889175);
            if (A != null) {
                nk.a0.i(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2), null, ay.b.u(A.intValue(), g11));
            }
            g11.J();
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                boolean z5 = true;
                nk.a.d(h11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true)), ay.b.u(k1Var.B1().q(), g11), 0L, null, 0, 0, null, g11, 0, 124);
                Context requireContext = k1Var.requireContext();
                kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                if (u70.e.a(requireContext, k1Var.B1().d(), null) == null) {
                    z5 = false;
                }
                Partner B1 = k1Var.B1();
                Context requireContext2 = k1Var.requireContext();
                kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
                if (B1.J(requireContext2)) {
                    g11.s(-1207888543);
                    k1Var.s1(((i11 << 3) & 112) | 512, g11, aVar, z5);
                    g11.J();
                } else {
                    g11.s(-1207888439);
                    k1Var.t1(z5, g11, 64);
                    g11.J();
                }
                androidx.compose.runtime.v b11 = h6.b(g11);
                if (b11 != null) {
                    b11.G(new q1(k1Var, aVar, i11));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        a3.g.s();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setContent(new s1.a(true, 187323506, new e()));
        return composeView;
    }
}
