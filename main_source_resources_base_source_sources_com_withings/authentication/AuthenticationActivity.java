package com.withings.authentication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.authentication.accountConsent.AccountConsentViewModel;
import com.withings.authentication.accountConsent.AccountLoginConsentViewModel;
import com.withings.authentication.mfa.TwoFactorMultiAccountViewModel;
import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
import com.withings.authentication.pickerUser.PickUserViewModel;
import com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel;
import com.withings.authentication.tryToLogin.mail.TryToLoginViewModel;
import com.withings.authentication.userCreation.UserCreationViewModel;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.device.setup.ui.SetupChooseDeviceActivity;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Inject;
import k1.j1;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpHeaders;
/* compiled from: AuthenticationActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/authentication/AuthenticationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "continueButtonEnabled", "Landroidx/navigation/d;", "navBackStackEntry", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AuthenticationActivity extends Hilt_AuthenticationActivity {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f31291w = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public m70.i f31292e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public vf.c f31293f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public AccountSessionRepository f31294g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ch.d f31295h;

    /* renamed from: i  reason: collision with root package name */
    private final i1 f31296i = new i1(kotlin.jvm.internal.q0.b(UserCreationViewModel.class), new s(this), new m(this), new t(this));

    /* renamed from: j  reason: collision with root package name */
    private final i1 f31297j = new i1(kotlin.jvm.internal.q0.b(AccountConsentViewModel.class), new v(this), new u(this), new w(this));

    /* renamed from: k  reason: collision with root package name */
    private final i1 f31298k = new i1(kotlin.jvm.internal.q0.b(AccountLoginConsentViewModel.class), new y(this), new x(this), new z(this));

    /* renamed from: l  reason: collision with root package name */
    private final i1 f31299l = new i1(kotlin.jvm.internal.q0.b(TryToLoginViewModel.class), new d(this), new c(this), new e(this));

    /* renamed from: m  reason: collision with root package name */
    private final i1 f31300m = new i1(kotlin.jvm.internal.q0.b(LoginRecoveryCodeViewModel.class), new g(this), new f(this), new h(this));

    /* renamed from: n  reason: collision with root package name */
    private final i1 f31301n = new i1(kotlin.jvm.internal.q0.b(PickUserViewModel.class), new j(this), new i(this), new k(this));

    /* renamed from: o  reason: collision with root package name */
    private final i1 f31302o = new i1(kotlin.jvm.internal.q0.b(TwoFactorMultiAccountViewModel.class), new n(this), new l(this), new o(this));

    /* renamed from: p  reason: collision with root package name */
    private final i1 f31303p = new i1(kotlin.jvm.internal.q0.b(GoogleAuthProviderViewModel.class), new q(this), new p(this), new r(this));

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f31304q = nm0.h.b(new b());

    /* renamed from: r  reason: collision with root package name */
    private androidx.appcompat.app.c f31305r;

    /* renamed from: s  reason: collision with root package name */
    private r8.n f31306s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f31307t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f31308u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f31309v;

    /* compiled from: AuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1339160498, new w0(AuthenticationActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<qc.b> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final qc.b invoke() {
            qc.b bVar = new qc.b(AuthenticationActivity.this);
            bVar.t(false);
            bVar.q();
            return bVar;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f31312a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31312a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31313a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f31313a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31313a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31314a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f31314a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31314a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f31315a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31315a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f31316a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31316a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f31317a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31317a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f31318a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31318a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31319a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f31319a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31319a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f31320a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31320a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f31321a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31321a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f31322a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31322a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31323a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f31323a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31323a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f31324a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31324a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f31325a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31325a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31326a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentActivity componentActivity) {
            super(0);
            this.f31326a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31326a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f31327a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31327a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class s extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentActivity componentActivity) {
            super(0);
            this.f31328a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31328a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class t extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f31329a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31329a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class u extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f31330a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31330a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class v extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentActivity componentActivity) {
            super(0);
            this.f31331a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31331a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class w extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f31332a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31332a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class x extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
            super(0);
            this.f31333a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31333a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class y extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31334a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
            super(0);
            this.f31334a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31334a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class z extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31335a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f31335a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31335a.getDefaultViewModelCreationExtras();
        }
    }

    public AuthenticationActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new androidx.activity.result.a() { // from class: com.withings.authentication.a
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                AuthenticationActivity.B3(AuthenticationActivity.this);
            }
        });
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f31307t = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new com.withings.authentication.b(this, 0));
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f31308u = registerForActivityResult2;
        androidx.activity.result.b<Intent> registerForActivityResult3 = registerForActivityResult(new g.a(), new com.withings.authentication.c(this, 0));
        kotlin.jvm.internal.u.i(registerForActivityResult3, "registerForActivityResult(...)");
        this.f31309v = registerForActivityResult3;
    }

    public static void A3(AuthenticationActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        SetupChooseDeviceActivity.a aVar = SetupChooseDeviceActivity.f37481i;
        InstallStateReporter installStateReporter = new InstallStateReporter(true);
        aVar.getClass();
        this$0.f31307t.a(SetupChooseDeviceActivity.a.a(this$0, true, installStateReporter));
    }

    public static void B3(AuthenticationActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.setResult(-1);
        ((PickUserViewModel) this$0.f31301n.getValue()).B0();
    }

    public static final void C3(AuthenticationActivity authenticationActivity, androidx.compose.material.m0 m0Var, ym0.a aVar, ym0.a aVar2, androidx.navigation.e eVar, CoroutineScope coroutineScope, androidx.compose.runtime.a aVar3, int i11) {
        authenticationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(913953551);
        k1.y.f(Boolean.TRUE, new com.withings.authentication.f(authenticationActivity, aVar, null), g11);
        sh.g.a(0, g11, new com.withings.authentication.l(coroutineScope, authenticationActivity, m0Var), new com.withings.authentication.h(authenticationActivity, aVar2, coroutineScope, m0Var), new com.withings.authentication.j(coroutineScope, authenticationActivity, eVar, m0Var));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.authentication.m(authenticationActivity, m0Var, aVar, aVar2, eVar, coroutineScope, i11));
        }
    }

    public static final void D3(AuthenticationActivity authenticationActivity, androidx.compose.material.m0 m0Var, ym0.a aVar, ym0.a aVar2, androidx.navigation.e eVar, CoroutineScope coroutineScope, androidx.compose.runtime.a aVar3, int i11) {
        authenticationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(335138767);
        Boolean bool = Boolean.TRUE;
        k1.y.f(bool, new com.withings.authentication.o(authenticationActivity, aVar, m0Var, eVar, null), g11);
        e.a aVar4 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e m11 = ah.k.m(ah.k.p(aVar4));
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(m11);
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
            boolean z5 = false;
            nk.a0.g(0, 48, 28, 0L, g11, androidx.compose.foundation.layout.x0.g(aVar4, og.y.a(0, c11, j1.a(g11), g11, 2058660585), yk.h.q()), null, HttpHeaders.WARNING);
            com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
            androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(e1.e(aVar4, 1.0f), yk.h.d());
            androidx.compose.ui.layout.l0 a12 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a13 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(f11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a13);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, a12, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                dq.x.b(0, c12, j1.a(g11), g11, 2058660585);
                nk.a.d(null, androidx.fragment.app.o.d("You are trying to login on account in debug. This will send an email to the entered email address ", ((TryToLoginViewModel) authenticationActivity.f31299l.getValue()).K0(), ".\nDo you want to login anyway?"), 0L, null, 0, 0, null, g11, 0, 125);
                g11.s(2078768243);
                Object t11 = g11.t();
                if (t11 == a.C0060a.a()) {
                    t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                    g11.n(t11);
                }
                k1.r0 r0Var = (k1.r0) t11;
                Object a14 = com.huawei.hms.health.a.a(g11, 2078768315);
                if (a14 == a.C0060a.a()) {
                    a14 = new com.withings.authentication.p(r0Var, null);
                    g11.n(a14);
                }
                g11.J();
                k1.y.f(bool, (ym0.p) a14, g11);
                com.withings.common.compose.component.l.a(null, "Continue", null, ((Boolean) r0Var.getValue()).booleanValue(), null, null, false, new com.withings.authentication.r(coroutineScope, authenticationActivity, m0Var), g11, 48, 117);
                g11.s(2078768789);
                if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(aVar2)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
                    z5 = true;
                }
                Object t12 = g11.t();
                if (z5 || t12 == a.C0060a.a()) {
                    t12 = new com.withings.authentication.s(aVar2);
                    g11.n(t12);
                }
                g11.J();
                com.withings.common.compose.component.l.c(null, "Cancel", null, false, null, null, false, (ym0.a) t12, g11, 48, 125);
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                androidx.compose.runtime.v o02 = g11.o0();
                if (o02 != null) {
                    o02.G(new com.withings.authentication.t(authenticationActivity, m0Var, aVar, aVar2, eVar, coroutineScope, i11));
                    return;
                }
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    public static final void E3(AuthenticationActivity authenticationActivity, r8.n nVar, androidx.compose.runtime.a aVar, int i11) {
        String str;
        androidx.navigation.t d11;
        authenticationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-766586795);
        androidx.navigation.d dVar = (androidx.navigation.d) androidx.navigation.compose.r.b(nVar, g11).getValue();
        if (dVar != null && (d11 = dVar.d()) != null) {
            str = d11.v();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        x70.b.b(authenticationActivity, "On navigation changed -> ".concat(str), new Object[0]);
        k1.y.f("navigation", new com.withings.authentication.u(authenticationActivity, null), g11);
        if (kotlin.jvm.internal.u.e(str, "onboarding")) {
            ((TryToLoginViewModel) authenticationActivity.f31299l.getValue()).c1();
            ((UserCreationViewModel) authenticationActivity.f31296i.getValue()).K0();
            ((AccountConsentViewModel) authenticationActivity.f31297j.getValue()).m0();
            ((AccountLoginConsentViewModel) authenticationActivity.f31298k.getValue()).p0();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.authentication.v(authenticationActivity, nVar, i11));
        }
    }

    public static final AccountConsentViewModel F3(AuthenticationActivity authenticationActivity) {
        return (AccountConsentViewModel) authenticationActivity.f31297j.getValue();
    }

    public static final AccountLoginConsentViewModel G3(AuthenticationActivity authenticationActivity) {
        return (AccountLoginConsentViewModel) authenticationActivity.f31298k.getValue();
    }

    public static final GoogleAuthProviderViewModel H3(AuthenticationActivity authenticationActivity) {
        return (GoogleAuthProviderViewModel) authenticationActivity.f31303p.getValue();
    }

    public static final LoginRecoveryCodeViewModel J3(AuthenticationActivity authenticationActivity) {
        return (LoginRecoveryCodeViewModel) authenticationActivity.f31300m.getValue();
    }

    public static final TwoFactorMultiAccountViewModel K3(AuthenticationActivity authenticationActivity) {
        return (TwoFactorMultiAccountViewModel) authenticationActivity.f31302o.getValue();
    }

    public static final PickUserViewModel M3(AuthenticationActivity authenticationActivity) {
        return (PickUserViewModel) authenticationActivity.f31301n.getValue();
    }

    public static final qc.b O3(AuthenticationActivity authenticationActivity) {
        return (qc.b) authenticationActivity.f31304q.getValue();
    }

    public static final TryToLoginViewModel P3(AuthenticationActivity authenticationActivity) {
        return (TryToLoginViewModel) authenticationActivity.f31299l.getValue();
    }

    public static final UserCreationViewModel Q3(AuthenticationActivity authenticationActivity) {
        return (UserCreationViewModel) authenticationActivity.f31296i.getValue();
    }

    public static final void T3(AuthenticationActivity authenticationActivity) {
        authenticationActivity.getClass();
        SetupChooseDeviceActivity.a aVar = SetupChooseDeviceActivity.f37481i;
        InstallStateReporter installStateReporter = new InstallStateReporter(true);
        aVar.getClass();
        authenticationActivity.f31307t.a(SetupChooseDeviceActivity.a.a(authenticationActivity, true, installStateReporter));
    }

    public static final void U3(AuthenticationActivity authenticationActivity) {
        ((GoogleAuthProviderViewModel) authenticationActivity.f31303p.getValue()).T0(authenticationActivity.f31309v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V3(boolean z5) {
        Uri uri;
        Uri data;
        String path;
        if (gm.b.g(getIntent().getData()) && (data = getIntent().getData()) != null && (path = data.getPath()) != null && dp0.j.r(path, "/accountLinked", false)) {
            setResult(-1);
        } else {
            if (z5) {
                uri = getIntent().getData();
            } else {
                uri = null;
            }
            ch.d dVar = this.f31295h;
            if (dVar != null) {
                dVar.p().getClass();
                Intent data2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(getPackageName(), "com.withings.wiscale2.MainActivity").setFlags(268468224).setData(uri);
                kotlin.jvm.internal.u.i(data2, "setData(...)");
                androidx.core.app.h0 m11 = androidx.core.app.h0.m(this);
                m11.c(data2);
                m11.r();
            } else {
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            }
        }
        finish();
    }

    public static void z3(AuthenticationActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            i1 i1Var = this$0.f31303p;
            GoogleAuthProviderViewModel googleAuthProviderViewModel = (GoogleAuthProviderViewModel) i1Var.getValue();
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(activityResult.a());
            kotlin.jvm.internal.u.i(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
            GoogleSignInAccount O0 = GoogleAuthProviderViewModel.O0(signedInAccountFromIntent);
            if (O0 != null) {
                ((GoogleAuthProviderViewModel) i1Var.getValue()).R0(O0);
            }
        }
    }

    @Override // com.withings.authentication.Hilt_AuthenticationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z5 = false;
        l1.a(getWindow(), false);
        GoogleAuthProviderViewModel googleAuthProviderViewModel = (GoogleAuthProviderViewModel) this.f31303p.getValue();
        xw.d.c(this, googleAuthProviderViewModel.G0(), new com.withings.authentication.w(this));
        xw.d.c(this, googleAuthProviderViewModel.M0(), new com.withings.authentication.x(this));
        xw.d.c(this, googleAuthProviderViewModel.K0(), new com.withings.authentication.y(this));
        xw.d.d(this, ((UserCreationViewModel) this.f31296i.getValue()).z0(), new com.withings.authentication.z(this));
        xw.d.c(this, androidx.lifecycle.q.b(((TryToLoginViewModel) this.f31299l.getValue()).T0(), null, 3), new a0(this));
        Intent intent = getIntent();
        kotlin.jvm.internal.u.i(intent, "getIntent(...)");
        if (intent.getFlags() != 269484032) {
            z5 = true;
        }
        if (z5) {
            vf.c cVar = this.f31293f;
            if (cVar != null) {
                if (cVar.i() != null && bundle == null) {
                    V3(true);
                }
            } else {
                kotlin.jvm.internal.u.s("accountManager");
                throw null;
            }
        }
        e.k.a(this, new s1.a(true, -1528296296, new a()));
    }

    @Override // com.withings.authentication.Hilt_AuthenticationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        vf.c cVar = this.f31293f;
        if (cVar != null) {
            cVar.f();
            super.onDestroy();
            return;
        }
        kotlin.jvm.internal.u.s("accountManager");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Uri data;
        super.onNewIntent(intent);
        if (intent != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("state");
            String queryParameter2 = data.getQueryParameter("shortcode");
            String queryParameter3 = data.getQueryParameter("jwt");
            if (queryParameter != null && (!dp0.j.D(queryParameter))) {
                if ((queryParameter3 != null && queryParameter3.length() != 0) || (queryParameter2 != null && queryParameter2.length() != 0)) {
                    TryToLoginViewModel tryToLoginViewModel = (TryToLoginViewModel) this.f31299l.getValue();
                    r8.n nVar = this.f31306s;
                    if (nVar != null) {
                        tryToLoginViewModel.Z0(nVar, queryParameter, queryParameter3, queryParameter2);
                    } else {
                        kotlin.jvm.internal.u.s("navController");
                        throw null;
                    }
                }
            }
        }
    }
}
