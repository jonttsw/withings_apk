package com.withings.authentication.deactivation;

import ah.o;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.compose.runtime.v0;
import androidx.lifecycle.h1;
import com.withings.account.core.model.Account;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.r0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import nm0.y;
import wk.c0;
import ym0.p;
/* compiled from: AccountReactivationScreen.kt */
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountReactivationScreenState f31467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AccountReactivationScreenState accountReactivationScreenState, ym0.a<y> aVar) {
            super(2);
            this.f31467a = accountReactivationScreenState;
            this.f31468b = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            boolean z11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.login_revokeProviderToken_button_disconnect, aVar2);
                AccountReactivationScreenState accountReactivationScreenState = AccountReactivationScreenState.f31459c;
                AccountReactivationScreenState accountReactivationScreenState2 = this.f31467a;
                if (accountReactivationScreenState2 == accountReactivationScreenState) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (accountReactivationScreenState2 != AccountReactivationScreenState.f31458b) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar2.s(-832559085);
                ym0.a<y> aVar3 = this.f31468b;
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new com.withings.authentication.deactivation.a(aVar3);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.l.c(null, u11, null, z11, null, null, z5, (ym0.a) t11, aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* renamed from: com.withings.authentication.deactivation.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0407b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31469a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0407b(r0<Boolean> r0Var) {
            super(0);
            this.f31469a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31469a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31470a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<y> aVar) {
            super(0);
            this.f31470a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31470a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31471a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(r0<Boolean> r0Var) {
            super(0);
            this.f31471a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31471a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountReactivationScreenState f31472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31473b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31474c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AccountReactivationScreenState accountReactivationScreenState, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f31472a = accountReactivationScreenState;
            this.f31473b = aVar;
            this.f31474c = aVar2;
            this.f31475d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31475d | 1);
            ym0.a<y> aVar2 = this.f31473b;
            ym0.a<y> aVar3 = this.f31474c;
            b.a(this.f31472a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Account, y> f31476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountReactivationViewModel f31477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ym0.l<? super Account, y> lVar, AccountReactivationViewModel accountReactivationViewModel) {
            super(0);
            this.f31476a = lVar;
            this.f31477b = accountReactivationViewModel;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31476a.invoke(this.f31477b.i0());
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31478a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a<y> aVar) {
            super(0);
            this.f31478a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31478a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class h extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f31479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<AccountReactivationScreenState> f31480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, r0<AccountReactivationScreenState> r0Var) {
            super(0);
            this.f31479a = context;
            this.f31480b = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31480b.setValue(AccountReactivationScreenState.f31457a);
            Toast.makeText(this.f31479a, (int) C1987R.string._ERROR_, 0).show();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class i extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountReactivationViewModel f31481a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<AccountReactivationScreenState> f31482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AccountReactivationViewModel accountReactivationViewModel, r0<AccountReactivationScreenState> r0Var) {
            super(0);
            this.f31481a = accountReactivationViewModel;
            this.f31482b = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31482b.setValue(AccountReactivationScreenState.f31458b);
            AccountReactivationViewModel accountReactivationViewModel = this.f31481a;
            accountReactivationViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(accountReactivationViewModel), null, null, new com.withings.authentication.deactivation.e(accountReactivationViewModel, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class j extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountReactivationViewModel f31483a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<AccountReactivationScreenState> f31484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AccountReactivationViewModel accountReactivationViewModel, r0<AccountReactivationScreenState> r0Var) {
            super(0);
            this.f31483a = accountReactivationViewModel;
            this.f31484b = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31484b.setValue(AccountReactivationScreenState.f31459c);
            AccountReactivationViewModel accountReactivationViewModel = this.f31483a;
            accountReactivationViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(accountReactivationViewModel), null, null, new com.withings.authentication.deactivation.d(accountReactivationViewModel, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class k extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountReactivationViewModel f31485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Account, y> f31486b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31487c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31488d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(AccountReactivationViewModel accountReactivationViewModel, ym0.l<? super Account, y> lVar, ym0.a<y> aVar, int i11, int i12) {
            super(2);
            this.f31485a = accountReactivationViewModel;
            this.f31486b = lVar;
            this.f31487c = aVar;
            this.f31488d = i11;
            this.f31489e = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31488d | 1);
            ym0.l<Account, y> lVar = this.f31486b;
            ym0.a<y> aVar2 = this.f31487c;
            b.b(this.f31485a, lVar, aVar2, aVar, g11, this.f31489e);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class l extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(r0<Boolean> r0Var) {
            super(0);
            this.f31490a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31490a.setValue(Boolean.TRUE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class m extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31491a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(r0<Boolean> r0Var) {
            super(0);
            this.f31491a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31491a.setValue(Boolean.TRUE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    public static final class n extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountReactivationScreenState f31492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31493b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(AccountReactivationScreenState accountReactivationScreenState, ym0.a<y> aVar) {
            super(2);
            this.f31492a = accountReactivationScreenState;
            this.f31493b = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            boolean z11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.account_reactivation_button_reactivate, aVar2);
                AccountReactivationScreenState accountReactivationScreenState = AccountReactivationScreenState.f31458b;
                AccountReactivationScreenState accountReactivationScreenState2 = this.f31492a;
                if (accountReactivationScreenState2 == accountReactivationScreenState) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (accountReactivationScreenState2 != AccountReactivationScreenState.f31459c) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar2.s(-832559480);
                ym0.a<y> aVar3 = this.f31493b;
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new com.withings.authentication.deactivation.c(aVar3);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.l.a(null, u11, null, z11, null, null, z5, (ym0.a) t11, aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AccountReactivationScreenState accountReactivationScreenState, ym0.a<y> aVar, ym0.a<y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        r0 r0Var;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar3.g(1914202136);
        if ((i11 & 14) == 0) {
            if (g11.K(accountReactivationScreenState)) {
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
            if (g11.w(aVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        if ((i16 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            g11.s(1608107176);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = l0.f(Boolean.FALSE, v0.f8878a);
                g11.n(t11);
            }
            r0 r0Var2 = (r0) t11;
            Object a11 = com.huawei.hms.health.a.a(g11, 1608107227);
            if (a11 == a.C0060a.a()) {
                a11 = new l(r0Var2);
                g11.n(a11);
            }
            g11.J();
            e.j.a(48, 1, g11, (ym0.a) a11, false);
            g11.s(1608107332);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = new m(r0Var2);
                g11.n(t12);
            }
            g11.J();
            boolean z5 = false;
            c0.b(null, null, null, (ym0.a) t12, com.withings.authentication.deactivation.f.f31498a, com.withings.authentication.deactivation.f.f31499b, s1.b.b(g11, -2008096125, new n(accountReactivationScreenState, aVar)), s1.b.b(g11, 2050253346, new a(accountReactivationScreenState, aVar2)), 0L, false, null, null, 0.0f, false, com.withings.authentication.deactivation.f.f31500c, g11, 819686400, 24576, 15623);
            if (((Boolean) r0Var2.getValue()).booleanValue()) {
                g11.s(1608109075);
                Object t13 = g11.t();
                if (t13 == a.C0060a.a()) {
                    r0Var = r0Var2;
                    t13 = new C0407b(r0Var);
                    g11.n(t13);
                } else {
                    r0Var = r0Var2;
                }
                ym0.a aVar4 = (ym0.a) t13;
                g11.J();
                String u11 = ay.b.u(C1987R.string.account_are_you_sure_to_cancel, g11);
                String u12 = ay.b.u(C1987R.string.account_are_you_sure_to_cancel_description, g11);
                String u13 = ay.b.u(C1987R.string._YES_, g11);
                g11.s(1608109419);
                if ((i16 & ConstantsWs.HWFAILURE_ZERO) == 256) {
                    z5 = true;
                }
                Object t14 = g11.t();
                if (z5 || t14 == a.C0060a.a()) {
                    t14 = new c(aVar2);
                    g11.n(t14);
                }
                ym0.a aVar5 = (ym0.a) t14;
                g11.J();
                String u14 = ay.b.u(C1987R.string._NO_, g11);
                g11.s(1608109542);
                Object t15 = g11.t();
                if (t15 == a.C0060a.a()) {
                    t15 = new d(r0Var);
                    g11.n(t15);
                }
                g11.J();
                wk.p.a(aVar4, u11, u12, u13, 0L, aVar5, u14, 0L, (ym0.a) t15, g11, 100663302, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(accountReactivationScreenState, aVar, aVar2, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.withings.authentication.deactivation.AccountReactivationViewModel r14, ym0.l<? super com.withings.account.core.model.Account, nm0.y> r15, ym0.a<nm0.y> r16, androidx.compose.runtime.a r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.deactivation.b.b(com.withings.authentication.deactivation.AccountReactivationViewModel, ym0.l, ym0.a, androidx.compose.runtime.a, int, int):void");
    }
}
