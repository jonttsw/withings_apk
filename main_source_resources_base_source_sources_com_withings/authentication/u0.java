package com.withings.authentication;

import android.content.Context;
import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.g;
import com.withings.authentication.accountConsent.AccountConsentViewModel;
import com.withings.authentication.accountConsent.AccountLoginConsentViewModel;
import com.withings.authentication.mfa.TwoFactorMultiAccountViewModel;
import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
import com.withings.authentication.pickerUser.PickUserViewModel;
import com.withings.authentication.tryToLogin.mail.TryToLoginViewModel;
import com.withings.authentication.userCreation.UserCreationViewModel;
import java.util.Locale;
import k1.j1;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class u0 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32467a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32468b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f32469c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f32470d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.compose.material.m0 m0Var, k1.r0 r0Var, AuthenticationActivity authenticationActivity, CoroutineScope coroutineScope) {
        super(3);
        this.f32467a = authenticationActivity;
        this.f32468b = coroutineScope;
        this.f32469c = m0Var;
        this.f32470d = r0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r8.n nVar;
        r8.n nVar2;
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
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
                c11.invoke(j1.a(aVar2), aVar2, 0);
                aVar2.s(2058660585);
                Context context = (Context) aVar2.D(androidx.compose.ui.platform.u0.d());
                aVar2.s(-2057262028);
                Object t11 = aVar2.t();
                a.C0060a.C0061a a12 = a.C0060a.a();
                AuthenticationActivity authenticationActivity = this.f32467a;
                if (t11 == a12) {
                    vf.c cVar = authenticationActivity.f31293f;
                    if (cVar != null) {
                        if (cVar.i() != null) {
                            m70.i iVar = authenticationActivity.f31292e;
                            if (iVar != null) {
                                if (iVar.c().isEmpty()) {
                                    TryToLoginViewModel P3 = AuthenticationActivity.P3(authenticationActivity);
                                    vf.c cVar2 = authenticationActivity.f31293f;
                                    if (cVar2 != null) {
                                        P3.e1(cVar2.h().b());
                                        t11 = "userCreation";
                                        aVar2.n(t11);
                                    } else {
                                        kotlin.jvm.internal.u.s("accountManager");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.u.s("userManager");
                                throw null;
                            }
                        }
                        if (kotlin.collections.x.W(Locale.TAIWAN.getCountry(), Locale.CHINA.getCountry(), "HK").contains(Locale.getDefault().getCountry())) {
                            t11 = "ChineseDataProtection";
                        } else {
                            t11 = "onboarding";
                        }
                        aVar2.n(t11);
                    } else {
                        kotlin.jvm.internal.u.s("accountManager");
                        throw null;
                    }
                }
                String str = (String) t11;
                aVar2.J();
                e.d.a(new g.a(), new t0(authenticationActivity), aVar2, 8);
                UserCreationViewModel Q3 = AuthenticationActivity.Q3(authenticationActivity);
                AccountConsentViewModel F3 = AuthenticationActivity.F3(authenticationActivity);
                AccountLoginConsentViewModel G3 = AuthenticationActivity.G3(authenticationActivity);
                TryToLoginViewModel P32 = AuthenticationActivity.P3(authenticationActivity);
                LoginRecoveryCodeViewModel J3 = AuthenticationActivity.J3(authenticationActivity);
                PickUserViewModel M3 = AuthenticationActivity.M3(authenticationActivity);
                TwoFactorMultiAccountViewModel K3 = AuthenticationActivity.K3(authenticationActivity);
                nVar = authenticationActivity.f31306s;
                if (nVar != null) {
                    CoroutineScope coroutineScope = this.f32468b;
                    androidx.compose.material.m0 m0Var = this.f32469c;
                    oh.a.a(Q3, F3, G3, P32, J3, M3, K3, nVar, str, new n0(coroutineScope, m0Var), new p0(m0Var, this.f32470d, authenticationActivity, coroutineScope), new q0(authenticationActivity, context), new r0(context), new s0(authenticationActivity, context), aVar2, 119837256, 0, 0);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    nVar2 = authenticationActivity.f31306s;
                    if (nVar2 != null) {
                        eh.b.a(nVar2, aVar2, 8);
                    } else {
                        kotlin.jvm.internal.u.s("navController");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.u.s("navController");
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
