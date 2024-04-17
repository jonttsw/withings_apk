package com.withings.authentication.verifyauthentication;

import android.app.Activity;
import android.content.Intent;
import androidx.camera.camera2.internal.p2;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.b2;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.account.core.model.Account;
import com.withings.account.ui.VerifyAuthenticationSensitiveActivity;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import d2.h1;
import k1.v0;
/* compiled from: AuthBottomSheetDialog.kt */
/* loaded from: classes3.dex */
public final class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthBottomSheetDialog.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Account f32687b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar, Account account, ym0.a<nm0.y> aVar2) {
            super(2);
            this.f32686a = aVar;
            this.f32687b = account;
            this.f32688c = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.e b10;
            androidx.compose.ui.e b11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                b10 = androidx.compose.foundation.c.b(ah.k.m(ah.k.p(e1.e(aVar3, 1.0f))), ((i1) aVar2.D(j1.e())).O(), h1.a());
                aVar2.s(-483455358);
                l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(b10);
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
                    b11 = androidx.compose.foundation.c.b(e1.e(aVar3, 1.0f), ((i1) aVar2.D(j1.e())).O(), h1.a());
                    androidx.compose.ui.e g11 = x0.g(b11, yk.h.o(), yk.h.q());
                    aVar2.s(-2054359119);
                    ym0.a<nm0.y> aVar4 = this.f32686a;
                    boolean K = aVar2.K(aVar4);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new m(aVar4);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    nk.a.d(androidx.compose.foundation.h.b(g11, false, (ym0.a) t11, 7), ay.b.u(C1987R.string._CANCEL_, aVar2), 0L, null, 0, 0, null, aVar2, 0, 124);
                    aVar2.J();
                    b2.a(0.0f, 0.0f, 0, 13, ((yk.w) p2.b(aVar2, 615317871)).f().b(), aVar2, null);
                    v4.b(x0.g(aVar3, yk.h.o(), yk.h.q()), ay.b.u(C1987R.string.account_need_to_auth, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
                    fk.q.b(x0.g(aVar3, yk.h.o(), yk.h.q()), InputFieldType.f33878f, null, ay.b.u(C1987R.string.emailChange_accountEmail, aVar2), this.f32687b.b(), null, null, null, null, null, null, false, null, null, 0, null, false, null, n.f32685a, aVar2, 48, 102236160, 196580);
                    com.withings.common.compose.component.l.a(x0.i(aVar3, yk.h.o(), yk.h.c(), yk.h.q(), yk.h.q()), ay.b.u(C1987R.string._CONTINUE_APP_, aVar2), null, false, null, null, false, this.f32688c, aVar2, 0, 124);
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
    /* compiled from: AuthBottomSheetDialog.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Account f32689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32690b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32691c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32692d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Account account, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f32689a = account;
            this.f32690b = aVar;
            this.f32691c = aVar2;
            this.f32692d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f32692d | 1);
            ym0.a<nm0.y> aVar2 = this.f32690b;
            ym0.a<nm0.y> aVar3 = this.f32691c;
            o.a(this.f32689a, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(Account account, ym0.a<nm0.y> onCancel, ym0.a<nm0.y> onContinue, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(account, "account");
        kotlin.jvm.internal.u.j(onCancel, "onCancel");
        kotlin.jvm.internal.u.j(onContinue, "onContinue");
        androidx.compose.runtime.b g11 = aVar.g(-214522919);
        yk.o.b(false, s1.b.b(g11, 1161798143, new a(onCancel, account, onContinue)), g11, 48, 1);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(account, onCancel, onContinue, i11));
        }
    }

    public static final void b(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-818068970);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            yk.o.b(false, s1.b.b(g11, -1251960900, new k(aVar, aVar2)), g11, 48, 1);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(aVar, aVar2, i11));
        }
    }

    public static final void c(Activity activity, int i11, boolean z5, String mail) {
        kotlin.jvm.internal.u.j(activity, "activity");
        kotlin.jvm.internal.u.j(mail, "mail");
        VerifyAuthenticationSensitiveActivity.f31005g.getClass();
        Intent intent = new Intent(activity, VerifyAuthenticationSensitiveActivity.class);
        intent.putExtra("is_google", z5);
        intent.putExtra("mail", mail);
        activity.startActivityForResult(intent, i11);
    }
}
