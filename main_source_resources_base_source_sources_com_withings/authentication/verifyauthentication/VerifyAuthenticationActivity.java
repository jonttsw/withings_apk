package com.withings.authentication.verifyauthentication;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.withings.account.models.AccountPrefEntity;
import com.withings.authentication.mfa.TwoFactorMultiAccountViewModel;
import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
import com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel;
import com.withings.authentication.tryToLogin.mail.TryToLoginViewModel;
import com.withings.authentication.userCreation.UserCreationViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
/* compiled from: VerifyAuthenticationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/authentication/verifyauthentication/VerifyAuthenticationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VerifyAuthenticationActivity extends Hilt_VerifyAuthenticationActivity {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f32633o = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ch.d f32634e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f32635f = nm0.h.b(a.f32644a);

    /* renamed from: g  reason: collision with root package name */
    private final i1 f32636g = new i1(q0.b(UserCreationViewModel.class), new k(this), new j(this), new l(this));

    /* renamed from: h  reason: collision with root package name */
    private final i1 f32637h = new i1(q0.b(TryToLoginViewModel.class), new n(this), new m(this), new o(this));

    /* renamed from: i  reason: collision with root package name */
    private final i1 f32638i = new i1(q0.b(LoginRecoveryCodeViewModel.class), new q(this), new p(this), new r(this));

    /* renamed from: j  reason: collision with root package name */
    private final i1 f32639j = new i1(q0.b(GoogleAuthProviderViewModel.class), new e(this), new d(this), new f(this));

    /* renamed from: k  reason: collision with root package name */
    private final i1 f32640k = new i1(q0.b(TwoFactorMultiAccountViewModel.class), new h(this), new g(this), new i(this));

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f32641l = nm0.h.b(new c());

    /* renamed from: m  reason: collision with root package name */
    private androidx.appcompat.app.c f32642m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f32643n;

    /* compiled from: VerifyAuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<vf.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32644a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final vf.c invoke() {
            vf.c cVar;
            cVar = vf.c.f103617d;
            if (cVar != null) {
                return cVar;
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
    }

    /* compiled from: VerifyAuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -2022129717, new b0(VerifyAuthenticationActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: VerifyAuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<qc.b> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final qc.b invoke() {
            qc.b bVar = new qc.b(VerifyAuthenticationActivity.this);
            bVar.t(false);
            bVar.q();
            return bVar;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32647a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f32647a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f32647a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f32648a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f32648a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32649a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f32649a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f32649a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f32650a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f32650a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32651a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f32651a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f32651a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f32652a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f32652a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32653a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f32653a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f32653a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f32654a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f32654a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32655a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f32655a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f32655a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32656a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f32656a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f32656a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32657a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f32657a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f32657a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f32658a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f32658a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f32659a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f32659a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentActivity componentActivity) {
            super(0);
            this.f32660a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f32660a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f32661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f32661a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f32661a.getDefaultViewModelCreationExtras();
        }
    }

    public VerifyAuthenticationActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.verifyauthentication.q(this, 0));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f32643n = registerForActivityResult;
    }

    public static final void A3(VerifyAuthenticationActivity verifyAuthenticationActivity, boolean z5) {
        int i11;
        verifyAuthenticationActivity.getClass();
        if (z5) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        verifyAuthenticationActivity.setResult(i11);
        verifyAuthenticationActivity.finish();
    }

    public static final vf.c B3(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        return (vf.c) verifyAuthenticationActivity.f32635f.getValue();
    }

    public static final GoogleAuthProviderViewModel C3(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        return (GoogleAuthProviderViewModel) verifyAuthenticationActivity.f32639j.getValue();
    }

    public static final LoginRecoveryCodeViewModel D3(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        return (LoginRecoveryCodeViewModel) verifyAuthenticationActivity.f32638i.getValue();
    }

    public static final qc.b F3(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        return (qc.b) verifyAuthenticationActivity.f32641l.getValue();
    }

    public static final TryToLoginViewModel H3(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        return (TryToLoginViewModel) verifyAuthenticationActivity.f32637h.getValue();
    }

    public static final TwoFactorMultiAccountViewModel I3(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        return (TwoFactorMultiAccountViewModel) verifyAuthenticationActivity.f32640k.getValue();
    }

    public static final UserCreationViewModel J3(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        return (UserCreationViewModel) verifyAuthenticationActivity.f32636g.getValue();
    }

    public static final void K3(VerifyAuthenticationActivity verifyAuthenticationActivity, androidx.navigation.e eVar, androidx.compose.runtime.a aVar, int i11) {
        verifyAuthenticationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1262657649);
        kotlin.jvm.internal.u.i(verifyAuthenticationActivity.getApplication(), "getApplication(...)");
        i1 i1Var = verifyAuthenticationActivity.f32637h;
        nm0.g gVar = verifyAuthenticationActivity.f32635f;
        ((TryToLoginViewModel) i1Var.getValue()).g1(((vf.c) gVar.getValue()).h().i().d().a());
        ((TryToLoginViewModel) i1Var.getValue()).e1(((vf.c) gVar.getValue()).h().b());
        if (kotlin.jvm.internal.u.e(((vf.c) gVar.getValue()).h().i().d().a(), AccountPrefEntity.PROVIDER_WITHINGS)) {
            ((TryToLoginViewModel) i1Var.getValue()).d1(((vf.c) gVar.getValue()).h().b());
        }
        xw.d.c(verifyAuthenticationActivity, androidx.lifecycle.q.b(((TryToLoginViewModel) i1Var.getValue()).T0(), null, 3), new s(verifyAuthenticationActivity));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new t(verifyAuthenticationActivity, eVar, i11));
        }
    }

    public static void z3(VerifyAuthenticationActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            i1 i1Var = this$0.f32639j;
            GoogleAuthProviderViewModel googleAuthProviderViewModel = (GoogleAuthProviderViewModel) i1Var.getValue();
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(activityResult.a());
            kotlin.jvm.internal.u.i(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
            GoogleSignInAccount O0 = GoogleAuthProviderViewModel.O0(signedInAccountFromIntent);
            if (O0 != null) {
                ((GoogleAuthProviderViewModel) i1Var.getValue()).R0(O0);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        finish();
        super.onBackPressed();
    }

    @Override // com.withings.authentication.verifyauthentication.Hilt_VerifyAuthenticationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        xw.d.c(this, ((GoogleAuthProviderViewModel) this.f32639j.getValue()).M0(), new com.withings.authentication.verifyauthentication.r(this));
        e.k.a(this, new s1.a(true, 318726053, new b()));
    }
}
