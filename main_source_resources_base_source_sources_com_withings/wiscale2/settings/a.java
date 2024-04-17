package com.withings.wiscale2.settings;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.account.core.model.Account;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: AccountAndSecurity.kt */
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountAndSecurity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.AccountAndSecurityKt$AccountAndSecurity$1", f = "AccountAndSecurity.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0775a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f59822b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f59823c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AccountAndSecurity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.AccountAndSecurityKt$AccountAndSecurity$1$1", f = "AccountAndSecurity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.settings.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0776a extends kotlin.coroutines.jvm.internal.i implements ym0.p<nm0.j<? extends Integer, ? extends Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f59824a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f59825b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0776a(Context context, qm0.d<? super C0776a> dVar) {
                super(2, dVar);
                this.f59825b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0776a c0776a = new C0776a(this.f59825b, dVar);
                c0776a.f59824a = obj;
                return c0776a;
            }

            @Override // ym0.p
            public final Object invoke(nm0.j<? extends Integer, ? extends Integer> jVar, qm0.d<? super nm0.y> dVar) {
                return ((C0776a) create(jVar, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                nm0.j jVar = (nm0.j) this.f59824a;
                int intValue = ((Number) jVar.c()).intValue();
                Context context = this.f59825b;
                String string = context.getString(intValue);
                String string2 = context.getString(((Number) jVar.d()).intValue());
                Toast.makeText(context, string + "\n" + string2, 1).show();
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0775a(SettingsViewModel settingsViewModel, Context context, qm0.d<? super C0775a> dVar) {
            super(2, dVar);
            this.f59822b = settingsViewModel;
            this.f59823c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new C0775a(this.f59822b, this.f59823c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((C0775a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59821a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Flow<nm0.j<Integer, Integer>> O0 = this.f59822b.O0();
                C0776a c0776a = new C0776a(this.f59823c, null);
                this.f59821a = 1;
                if (FlowKt.collectLatest(O0, c0776a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountAndSecurity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f59826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59827b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59828c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59829d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k1.o1<User> f59830e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k1.o1<Account> f59831f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59832g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f59833h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SettingsViewModel settingsViewModel, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, k1.r0 r0Var, k1.r0 r0Var2, ym0.a aVar4, k1.r0 r0Var3) {
            super(3);
            this.f59826a = settingsViewModel;
            this.f59827b = aVar;
            this.f59828c = aVar2;
            this.f59829d = aVar3;
            this.f59830e = r0Var;
            this.f59831f = r0Var2;
            this.f59832g = aVar4;
            this.f59833h = r0Var3;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            String str;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a aVar3;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar4 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar4.h()) {
                aVar4.C();
            } else {
                User value = this.f59830e.getValue();
                aVar4.s(1182519467);
                if (value == null) {
                    aVar2 = aVar4;
                } else {
                    androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                    String u11 = ay.b.u(C1987R.string.settings_account_security_withings_account, aVar4);
                    Account value2 = this.f59831f.getValue();
                    if (value2 != null) {
                        str = value2.b();
                    } else {
                        str = null;
                    }
                    aVar2 = aVar4;
                    com.withings.common.compose.component.o.g(h11, s1.b.b(aVar4, -1627262422, new com.withings.wiscale2.settings.b(value)), null, u11, str, false, false, false, null, null, null, aVar4, 48, 0, CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED);
                    nm0.y yVar = nm0.y.f85009a;
                }
                aVar2.J();
                SettingsViewModel settingsViewModel = this.f59826a;
                androidx.compose.runtime.a aVar5 = aVar2;
                k1.r0 a11 = androidx.compose.runtime.l0.a(settingsViewModel.z0(), Boolean.TRUE, null, aVar5, 2);
                aVar5.s(1182520439);
                if (((Boolean) a11.getValue()).booleanValue()) {
                    aVar3 = aVar5;
                    com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.emailChange_title, aVar5), null, true, false, true, null, null, this.f59827b, aVar5, 12779520, 0, 854);
                } else {
                    aVar3 = aVar5;
                }
                aVar3.J();
                androidx.compose.runtime.a aVar6 = aVar3;
                a.d(((Boolean) androidx.compose.runtime.l0.a(settingsViewModel.F0(), Boolean.FALSE, null, aVar6, 2).getValue()).booleanValue(), this.f59828c, this.f59829d, aVar6, 0);
                com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.mfa_setup_title, aVar6), null, true, false, true, null, null, new com.withings.wiscale2.settings.c(settingsViewModel, this.f59832g, this.f59833h), aVar6, 12779520, 0, 854);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountAndSecurity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f59835b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.r0 r0Var, ym0.a aVar) {
            super(0);
            this.f59834a = aVar;
            this.f59835b = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f59835b.setValue(Boolean.FALSE);
            this.f59834a.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountAndSecurity.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f59836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1.r0<Boolean> r0Var) {
            super(0);
            this.f59836a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f59836a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountAndSecurity.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59838b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59839c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59840d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59841e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f59842f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f59843g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, SettingsViewModel settingsViewModel, int i11) {
            super(2);
            this.f59837a = aVar;
            this.f59838b = aVar2;
            this.f59839c = aVar3;
            this.f59840d = aVar4;
            this.f59841e = aVar5;
            this.f59842f = settingsViewModel;
            this.f59843g = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59843g | 1);
            ym0.a<nm0.y> aVar2 = this.f59841e;
            SettingsViewModel settingsViewModel = this.f59842f;
            a.a(this.f59837a, this.f59838b, this.f59839c, this.f59840d, aVar2, settingsViewModel, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountAndSecurity.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59845b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f59844a = aVar;
            this.f59845b = aVar2;
            this.f59846c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59846c | 1);
            a.b(this.f59844a, this.f59845b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onBack, ym0.a<nm0.y> onChangePassword, ym0.a<nm0.y> onConfigureMFA, ym0.a<nm0.y> onCreatePassword, ym0.a<nm0.y> onEditEmail, SettingsViewModel viewModel, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        k1.r0 r0Var;
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onChangePassword, "onChangePassword");
        kotlin.jvm.internal.u.j(onConfigureMFA, "onConfigureMFA");
        kotlin.jvm.internal.u.j(onCreatePassword, "onCreatePassword");
        kotlin.jvm.internal.u.j(onEditEmail, "onEditEmail");
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        androidx.compose.runtime.b g11 = aVar.g(587191406);
        k1.y.f(Boolean.TRUE, new C0775a(viewModel, (Context) g11.D(androidx.compose.ui.platform.u0.d()), null), g11);
        g11.s(999660177);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var2 = (k1.r0) t11;
        g11.J();
        g11.s(-483455358);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
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
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            com.withings.common.compose.component.c5.a(0L, 0L, ay.b.u(C1987R.string.settings_account_security, g11), true, null, null, null, null, false, onBack, g11, ((i11 << 27) & 1879048192) | 3072, 499);
            androidx.compose.ui.e p11 = ah.k.p(n0.y0.c(androidx.compose.foundation.layout.e1.d(aVar2), n0.y0.b(g11), false, 14));
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b12 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a12 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(p11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b13 = com.withings.authentication.e.b(g11, b12, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                }
                dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                com.withings.common.compose.component.y3.d(null, ay.b.u(C1987R.string._ACCOUNT_SETTINGS_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -1575159388, new b(viewModel, onEditEmail, onCreatePassword, onChangePassword, androidx.compose.runtime.l0.a(viewModel.K0(), null, null, g11, 2), androidx.compose.runtime.l0.a(viewModel.y0(), null, null, g11, 2), onConfigureMFA, r0Var2)), g11, 1572864, 61);
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                g11.s(999663147);
                if (((Boolean) r0Var2.getValue()).booleanValue()) {
                    g11.s(975626530);
                    if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(onConfigureMFA)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Object t12 = g11.t();
                    if (!z5 && t12 != a.C0060a.a()) {
                        r0Var = r0Var2;
                    } else {
                        r0Var = r0Var2;
                        t12 = new c(r0Var, onConfigureMFA);
                        g11.n(t12);
                    }
                    ym0.a aVar3 = (ym0.a) t12;
                    Object a13 = com.huawei.hms.health.a.a(g11, 975626661);
                    if (a13 == a.C0060a.a()) {
                        a13 = new d(r0Var);
                        g11.n(a13);
                    }
                    g11.J();
                    b(aVar3, (ym0.a) a13, g11, 48);
                }
                androidx.compose.runtime.v a14 = com.withings.authentication.mfa.resolve.components.h.a(g11);
                if (a14 != null) {
                    a14.G(new e(onBack, onChangePassword, onConfigureMFA, onCreatePassword, onEditEmail, viewModel, i11));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-675606097);
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
            bVar = g11;
        } else {
            bVar = g11;
            wk.p.a(aVar2, ay.b.u(C1987R.string._WTI_WARNING_, g11), ay.b.u(C1987R.string.activate_2FA_ifHaveThermoHomeBabyScale, g11), ay.b.u(C1987R.string._CONTINUE_APP_, g11), 0L, aVar, ay.b.u(C1987R.string._CANCEL_, g11), 0L, aVar2, g11, ((i12 >> 3) & 14) | ((i12 << 15) & 458752) | ((i12 << 21) & 234881024), ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new f(aVar, aVar2, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r31, ym0.a r32, ym0.a r33, androidx.compose.runtime.a r34, int r35) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.a.d(boolean, ym0.a, ym0.a, androidx.compose.runtime.a, int):void");
    }
}
