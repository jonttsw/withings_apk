package com.withings.wiscale2.account.email;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.g6;
import androidx.compose.material.h6;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.k4;
import androidx.compose.ui.platform.n1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.account.email.EmailModificationViewModel;
import dq.x;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import x1.b;
/* compiled from: EmailModificationActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006&\u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\nX\u008a\u0084\u0002²\u0006\u001a\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/account/email/EmailModificationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "newEmailText", "confirmEmailText", "Lcom/withings/wiscale2/account/email/EmailModificationViewModel$a;", "emailStatus", "Lnm0/o;", "error", "", "kotlin.jvm.PlatformType", "shouldShowProgress", "Lnm0/j;", "hasReceivedData", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EmailModificationActivity extends Hilt_EmailModificationActivity {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f48003f = 0;

    /* renamed from: e  reason: collision with root package name */
    private final i1 f48004e = new i1(q0.b(EmailModificationViewModel.class), new q(this), new p(this), new r(this));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.a<y> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            EmailModificationActivity.this.J3().G0();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f48007b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f48007b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48007b | 1);
            EmailModificationActivity.this.z3(aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.l<String, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0<String> f48008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p0<String> p0Var) {
            super(1);
            this.f48008a = p0Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, java.lang.String] */
        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            this.f48008a.f76257a = it;
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.l<String, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<String> f48009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(r0<String> r0Var) {
            super(1);
            this.f48009a = r0Var;
        }

        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            int i11 = EmailModificationActivity.f48003f;
            this.f48009a.setValue(it);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w implements ym0.l<String, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<String> f48010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r0<String> r0Var) {
            super(1);
            this.f48010a = r0Var;
        }

        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            int i11 = EmailModificationActivity.f48003f;
            this.f48010a.setValue(it);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w implements ym0.a<y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0<String> f48012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<String> f48013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<String> f48014d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p0<String> p0Var, r0<String> r0Var, r0<String> r0Var2) {
            super(0);
            this.f48012b = p0Var;
            this.f48013c = r0Var;
            this.f48014d = r0Var2;
        }

        @Override // ym0.a
        public final y invoke() {
            EmailModificationActivity.this.J3().q0(this.f48012b.f76257a, this.f48013c.getValue(), this.f48014d.getValue());
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f48016b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11) {
            super(2);
            this.f48016b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48016b | 1);
            EmailModificationActivity.this.A3(aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b2.k f48017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b2.k kVar) {
            super(0);
            this.f48017a = kVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f48017a.c();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w implements ym0.l<String, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f48018a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ym0.l<? super String, y> lVar) {
            super(1);
            this.f48018a = lVar;
        }

        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            this.f48018a.invoke(it);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b2.k f48019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k4 f48020b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(b2.k kVar, k4 k4Var) {
            super(0);
            this.f48019a = kVar;
            this.f48020b = k4Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f48019a.d();
            k4 k4Var = this.f48020b;
            if (k4Var != null) {
                k4Var.a();
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements ym0.l<String, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f48021a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(ym0.l<? super String, y> lVar) {
            super(1);
            this.f48021a = lVar;
        }

        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            this.f48021a.invoke(it);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f48023b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f48024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f48025d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f48026e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f48027f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(String str, String str2, ym0.l<? super String, y> lVar, ym0.l<? super String, y> lVar2, int i11) {
            super(2);
            this.f48023b = str;
            this.f48024c = str2;
            this.f48025d = lVar;
            this.f48026e = lVar2;
            this.f48027f = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48027f | 1);
            ym0.l<String, y> lVar = this.f48025d;
            ym0.l<String, y> lVar2 = this.f48026e;
            EmailModificationActivity.this.C3(this.f48023b, this.f48024c, lVar, lVar2, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class m extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k4 f48028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f48029b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(k4 k4Var, ym0.a<y> aVar) {
            super(0);
            this.f48028a = k4Var;
            this.f48029b = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            k4 k4Var = this.f48028a;
            if (k4Var != null) {
                k4Var.a();
            }
            this.f48029b.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class n extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48031b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f48032c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48033d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.ui.e eVar, ym0.a<y> aVar, int i11) {
            super(2);
            this.f48031b = eVar;
            this.f48032c = aVar;
            this.f48033d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48033d | 1);
            androidx.compose.ui.e eVar = this.f48031b;
            ym0.a<y> aVar2 = this.f48032c;
            EmailModificationActivity.this.D3(eVar, aVar2, aVar, g11);
            return y.f85009a;
        }
    }

    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    static final class o extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        o() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1015519287, new com.withings.wiscale2.account.email.i(EmailModificationActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class p extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f48035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f48035a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f48035a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class q extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f48036a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentActivity componentActivity) {
            super(0);
            this.f48036a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f48036a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class r extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f48037a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f48037a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f48037a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(int i11, androidx.compose.runtime.a aVar, String str, ym0.l lVar) {
        androidx.compose.runtime.b g11 = aVar.g(-164350524);
        EmailModificationViewModel.a aVar2 = (EmailModificationViewModel.a) t1.d.a(J3().r0(), g11).getValue();
        if (aVar2 != null) {
            fk.q.b(null, InputFieldType.f33878f, null, ay.b.u(C1987R.string.emailChange_accountEmail, g11), str, new androidx.compose.ui.text.b(aVar2.a(), null, 6), null, null, null, null, null, !aVar2.c(), null, null, 0, null, false, null, com.withings.wiscale2.account.email.a.f48070a, g11, ((i11 << 12) & 57344) | 48, 102236160, 194501);
            g11.s(-956506743);
            if (!aVar2.c()) {
                String b10 = aVar2.b();
                if (b10 == null) {
                    b10 = "";
                }
                lVar.invoke(b10);
                z3(g11, 8);
            }
            g11.J();
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.account.email.b(this, str, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(String str, String str2, ym0.l<? super String, y> lVar, ym0.l<? super String, y> lVar2, androidx.compose.runtime.a aVar, int i11) {
        String str3;
        androidx.compose.ui.text.b bVar;
        String str4;
        String str5;
        androidx.compose.runtime.b g11 = aVar.g(-114694464);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e j5 = x0.j(e1.d(aVar2), 0.0f, yk.h.r(), 0.0f, 0.0f, 13);
        g11.s(-483455358);
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(j5);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            g11.s(1076738003);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = new b2.k();
                g11.n(t11);
            }
            b2.k kVar = (b2.k) t11;
            g11.J();
            r0 a12 = t1.d.a(J3().z0(), g11);
            k4 k4Var = (k4) g11.D(n1.m());
            androidx.compose.ui.e e11 = e1.e(aVar2, 1.0f);
            String u11 = ay.b.u(C1987R.string.emailChange_newEmail, g11);
            InputFieldType inputFieldType = InputFieldType.f33878f;
            nm0.o oVar = (nm0.o) a12.getValue();
            androidx.compose.ui.text.b bVar2 = (oVar == null || (str5 = (String) oVar.d()) == null) ? null : new androidx.compose.ui.text.b(str5, null, 6);
            nm0.o oVar2 = (nm0.o) a12.getValue();
            boolean z5 = (oVar2 != null ? (String) oVar2.d() : null) != null;
            g11.s(1076738657);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = new h(kVar);
                g11.n(t12);
            }
            ym0.a aVar3 = (ym0.a) t12;
            g11.J();
            g11.s(1076738557);
            boolean z11 = (((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(lVar)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256;
            Object t13 = g11.t();
            if (z11 || t13 == a.C0060a.a()) {
                t13 = new i(lVar);
                g11.n(t13);
            }
            g11.J();
            fk.q.b(e11, inputFieldType, null, u11, str, bVar2, null, null, null, null, null, z5, null, null, 6, null, false, aVar3, (ym0.l) t13, g11, ((i11 << 12) & 57344) | 54, 12607488, 112580);
            androidx.compose.ui.e j11 = x0.j(e1.e(aVar2, 1.0f), 0.0f, yk.h.r(), 0.0f, 0.0f, 13);
            String u12 = ay.b.u(C1987R.string.emailChange_confirmEmail, g11);
            nm0.o oVar3 = (nm0.o) a12.getValue();
            if (oVar3 == null || (str4 = (String) oVar3.e()) == null) {
                str3 = null;
                bVar = null;
            } else {
                str3 = null;
                bVar = new androidx.compose.ui.text.b(str4, null, 6);
            }
            nm0.o oVar4 = (nm0.o) a12.getValue();
            if (oVar4 != null) {
                str3 = (String) oVar4.e();
            }
            boolean z12 = str3 != null;
            g11.s(1076739387);
            boolean K = g11.K(k4Var);
            Object t14 = g11.t();
            if (K || t14 == a.C0060a.a()) {
                t14 = new j(kVar, k4Var);
                g11.n(t14);
            }
            ym0.a aVar4 = (ym0.a) t14;
            g11.J();
            g11.s(1076739214);
            boolean z13 = (((i11 & 7168) ^ 3072) > 2048 && g11.K(lVar2)) || (i11 & 3072) == 2048;
            Object t15 = g11.t();
            if (z13 || t15 == a.C0060a.a()) {
                t15 = new k(lVar2);
                g11.n(t15);
            }
            g11.J();
            fk.q.b(j11, inputFieldType, null, u12, str2, bVar, null, null, null, null, null, z12, kVar, null, 7, null, false, aVar4, (ym0.l) t15, g11, ((i11 << 9) & 57344) | 48, 24960, 108484);
            v b12 = h6.b(g11);
            if (b12 != null) {
                b12.G(new l(str, str2, lVar, lVar2, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(androidx.compose.ui.e eVar, ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        boolean z5;
        androidx.compose.runtime.b g11 = aVar2.g(-1338222319);
        k4 k4Var = (k4) g11.D(n1.m());
        r0 b10 = t1.d.b(J3().A0(), Boolean.FALSE, g11);
        r0 a11 = t1.d.a(J3().B0(), g11);
        String u11 = ay.b.u(C1987R.string.emailChange_updateButton, g11);
        androidx.compose.ui.e m11 = ah.k.m(ah.k.p(eVar));
        Boolean bool = (Boolean) b10.getValue();
        u.i(bool, "SaveNewEmailButton$lambda$21(...)");
        boolean z11 = false;
        if (bool.booleanValue() && ((nm0.j) a11.getValue()) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        g11.s(1605699078);
        boolean K = g11.K(k4Var);
        if ((((i11 & 112) ^ 48) > 32 && g11.K(aVar)) || (i11 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = K | z11;
        Object t11 = g11.t();
        if (z12 || t11 == a.C0060a.a()) {
            t11 = new m(k4Var, aVar);
            g11.n(t11);
        }
        g11.J();
        com.withings.common.compose.component.l.a(m11, u11, null, false, null, null, z5, (ym0.a) t11, g11, 0, 60);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(eVar, aVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailModificationViewModel J3() {
        return (EmailModificationViewModel) this.f48004e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(891412789);
        com.withings.common.compose.component.l.c(x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.b(), 0.0f, 0.0f, 13), ay.b.u(C1987R.string.emailChange_accountNotValidatedEmailRequest, g11), null, false, null, ButtonSize.f33304f, false, new a(), g11, 196608, 92);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11));
        }
    }

    public final void A3(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-2105733171);
        p0 p0Var = new p0();
        p0Var.f76257a = t1.d.b(J3().F0(), "", g11).getValue();
        g11.s(259586758);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, 259586822);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        r0 r0Var2 = (r0) a11;
        g11.J();
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e f11 = x0.f(e1.d(aVar2), yk.h.r());
        g11.s(-483455358);
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(f11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            B3(512, g11, (String) p0Var.f76257a, new c(p0Var));
            String str = (String) r0Var.getValue();
            String str2 = (String) r0Var2.getValue();
            g11.s(-963245938);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = new d(r0Var);
                g11.n(t12);
            }
            ym0.l<? super String, y> lVar = (ym0.l) t12;
            Object a13 = com.huawei.hms.health.a.a(g11, -963245868);
            if (a13 == a.C0060a.a()) {
                a13 = new e(r0Var2);
                g11.n(a13);
            }
            g11.J();
            C3(str, str2, lVar, (ym0.l) a13, g11, 36224);
            g11.J();
            g11.o();
            g11.J();
            g11.J();
            androidx.compose.ui.e d11 = e1.d(aVar2);
            g11.s(733328855);
            l0 d12 = g6.d(false, g11, -1323940314);
            int G2 = g11.G();
            v0 l6 = g11.l();
            ym0.a a14 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a14);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, d12, g11, l6);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                x.b(0, c12, j1.a(g11), g11, 2058660585);
                D3(x0.j(androidx.compose.foundation.layout.m.f4307a.g(aVar2, b.a.c()), yk.h.r(), 0.0f, yk.h.r(), yk.h.r(), 2), new f(p0Var, r0Var, r0Var2), g11, 512);
                v b13 = h6.b(g11);
                if (b13 != null) {
                    b13.G(new g(i11));
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

    @Override // com.withings.wiscale2.account.email.Hilt_EmailModificationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -762568035, new o()));
        xw.d.c(this, J3().y0(), new com.withings.wiscale2.account.email.c(this));
        xw.d.c(this, J3().t0(), new com.withings.wiscale2.account.email.e(this));
    }
}
