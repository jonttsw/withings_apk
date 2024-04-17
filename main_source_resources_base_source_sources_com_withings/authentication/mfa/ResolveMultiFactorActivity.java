package com.withings.authentication.mfa;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.r3;
import androidx.compose.material3.g9;
import androidx.compose.material3.o7;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.u0;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.authentication.mfa.ResolveTwoFactorViewModel;
import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
import javax.inject.Inject;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
/* compiled from: ResolveMultiFactorActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/authentication/mfa/ResolveMultiFactorActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/authentication/mfa/ResolveTwoFactorViewModel$b;", "state", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ResolveMultiFactorActivity extends Hilt_ResolveMultiFactorActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ch.d f31565e;

    /* renamed from: f  reason: collision with root package name */
    private final i1 f31566f = new i1(q0.b(LoginRecoveryCodeViewModel.class), new e(this), new d(this), new f(this));

    /* renamed from: g  reason: collision with root package name */
    private final i1 f31567g = new i1(q0.b(ResolveTwoFactorViewModel.class), new h(this), new g(this), new i(this));

    /* renamed from: h  reason: collision with root package name */
    private final i1 f31568h = new i1(q0.b(TwoFactorMultiAccountViewModel.class), new k(this), new j(this), new l(this));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResolveMultiFactorActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.q<r8.n, androidx.compose.runtime.a, Integer, nm0.y> f31569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.q<? super r8.n, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar) {
            super(2);
            this.f31569a = qVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
                xb.b v11 = androidx.activity.b0.v(aVar2);
                c11.D().b(v11);
                xb.a.a(v11, e1.d(androidx.compose.ui.e.f8927a), wk.h.d(), 0.0f, 0L, 0L, 0L, s1.b.b(aVar2, 1425801693, new q(this.f31569a, c11)), aVar2, 12582968, 120);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResolveMultiFactorActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.q<r8.n, androidx.compose.runtime.a, Integer, nm0.y> f31571b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ym0.q<? super r8.n, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, int i11) {
            super(2);
            this.f31571b = qVar;
            this.f31572c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31572c | 1);
            ResolveMultiFactorActivity.this.z3(this.f31571b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ResolveMultiFactorActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ResolveMultiFactorActivity resolveMultiFactorActivity = ResolveMultiFactorActivity.this;
                ResolveTwoFactorViewModel.b bVar = (ResolveTwoFactorViewModel.b) h6.b.c(ResolveMultiFactorActivity.E3(resolveMultiFactorActivity).g0(), aVar2).getValue();
                if (bVar instanceof ResolveTwoFactorViewModel.b.a) {
                    aVar2.s(1037135792);
                    ResolveMultiFactorActivity.A3(resolveMultiFactorActivity, aVar2, 8);
                    aVar2.J();
                } else if (bVar instanceof ResolveTwoFactorViewModel.b.c) {
                    aVar2.s(1037135880);
                    ResolveMultiFactorActivity.B3(resolveMultiFactorActivity, "newTwoFactor/login/without2Fa", aVar2, 70);
                    aVar2.J();
                } else if (bVar instanceof ResolveTwoFactorViewModel.b.C0408b) {
                    aVar2.s(1037135997);
                    ResolveMultiFactorActivity.B3(resolveMultiFactorActivity, "newTwoFactor/login/withMFa", aVar2, 70);
                    aVar2.J();
                } else {
                    aVar2.s(1037136055);
                    aVar2.J();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31574a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f31574a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31574a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f31575a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31575a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31576a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f31576a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31576a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f31577a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31577a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f31578a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31578a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31579a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f31579a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31579a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31580a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f31580a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31580a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31581a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f31581a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31581a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31582a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f31582a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31582a.getDefaultViewModelCreationExtras();
        }
    }

    public static final void A3(ResolveMultiFactorActivity resolveMultiFactorActivity, androidx.compose.runtime.a aVar, int i11) {
        resolveMultiFactorActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1847470734);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            l0 a11 = r3.a(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
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
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                o7.a(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.authentication.mfa.d(resolveMultiFactorActivity, i11));
        }
    }

    public static final void B3(ResolveMultiFactorActivity resolveMultiFactorActivity, String str, androidx.compose.runtime.a aVar, int i11) {
        resolveMultiFactorActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1285354435);
        resolveMultiFactorActivity.z3(s1.b.b(g11, 2134571776, new n(str, resolveMultiFactorActivity, (Context) g11.D(u0.d()))), g11, 70);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new o(resolveMultiFactorActivity, str, i11));
        }
    }

    public static final LoginRecoveryCodeViewModel D3(ResolveMultiFactorActivity resolveMultiFactorActivity) {
        return (LoginRecoveryCodeViewModel) resolveMultiFactorActivity.f31566f.getValue();
    }

    public static final ResolveTwoFactorViewModel E3(ResolveMultiFactorActivity resolveMultiFactorActivity) {
        return (ResolveTwoFactorViewModel) resolveMultiFactorActivity.f31567g.getValue();
    }

    public static final TwoFactorMultiAccountViewModel F3(ResolveMultiFactorActivity resolveMultiFactorActivity) {
        return (TwoFactorMultiAccountViewModel) resolveMultiFactorActivity.f31568h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(ym0.q<? super r8.n, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(-1604174148);
        if ((i11 & 14) == 0) {
            if (g11.w(qVar)) {
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
            yk.o.b(false, s1.b.b(g11, -549699614, new a(qVar)), g11, 48, 1);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(qVar, i11));
        }
    }

    @Override // com.withings.authentication.mfa.Hilt_ResolveMultiFactorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -552356330, new c()));
    }
}
