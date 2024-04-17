package com.withings.authentication.mfa.recovery.login;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.compose.runtime.v0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.k4;
import androidx.compose.ui.platform.n1;
import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
import com.withings.common.compose.component.card.FeedbackCard$Status;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.wiscale2.C1987R;
import ep0.a;
import java.util.Locale;
import k1.o1;
import k1.r0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import nk.g0;
import nm0.y;
import r0.d0;
import r0.x;
import th.r;
import uj.o;
import wk.c0;
import ym0.p;
import ym0.q;
/* compiled from: RecoveryCodeInput.kt */
/* loaded from: classes3.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecoveryCodeInput.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.login.RecoveryCodeInputKt$MfaRecoveryCodeInput$1", f = "RecoveryCodeInput.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoginRecoveryCodeViewModel f31830b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f31831c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RecoveryCodeInput.kt */
        /* renamed from: com.withings.authentication.mfa.recovery.login.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0418a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.l<String, y> f31832a;

            /* JADX WARN: Multi-variable type inference failed */
            C0418a(ym0.l<? super String, y> lVar) {
                this.f31832a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                r.a aVar = (r.a) obj;
                if (aVar instanceof r.a.d) {
                    this.f31832a.invoke(((r.a.d) aVar).a());
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, ym0.l<? super String, y> lVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f31830b = loginRecoveryCodeViewModel;
            this.f31831c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f31830b, this.f31831c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31829a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                MutableStateFlow<r.a> q02 = this.f31830b.q0();
                C0418a c0418a = new C0418a(this.f31831c);
                this.f31829a = 1;
                if (q02.collect(c0418a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecoveryCodeInput.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.login.RecoveryCodeInputKt$MfaRecoveryCodeInput$2$1", f = "RecoveryCodeInput.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<LoginRecoveryCodeViewModel.a> f31834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<Integer> f31835c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<Integer> f31836d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o1<? extends LoginRecoveryCodeViewModel.a> o1Var, r0<Integer> r0Var, r0<Integer> r0Var2, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f31834b = o1Var;
            this.f31835c = r0Var;
            this.f31836d = r0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f31834b, this.f31835c, this.f31836d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31833a;
            r0<Integer> r0Var = this.f31836d;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                o1<LoginRecoveryCodeViewModel.a> o1Var = this.f31834b;
                LoginRecoveryCodeViewModel.a value = o1Var.getValue();
                boolean e11 = u.e(value, com.withings.authentication.mfa.recovery.login.c.f31821a);
                r0<Integer> r0Var2 = this.f31835c;
                if (e11) {
                    int i12 = v70.a.f103433b;
                    v70.a.c("wrong_recovery_code", s0.i(new nm0.j("flow", "2FA")), 2);
                    r0Var2.setValue(new Integer((int) C1987R.string.login_2FA_recovery_error));
                    r0Var.setValue(null);
                } else if (value instanceof com.withings.authentication.mfa.recovery.login.b) {
                    r0Var2.setValue(null);
                    LoginRecoveryCodeViewModel.a value2 = o1Var.getValue();
                    u.h(value2, "null cannot be cast to non-null type com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel.ConfirmMfaRecoveryCodeState.Error.TooManyRequests");
                    int a11 = ((com.withings.authentication.mfa.recovery.login.b) value2).a();
                    r0Var.setValue(new Integer(a11));
                    long j5 = ep0.c.j(a11, DurationUnit.f78024d);
                    this.f31833a = 1;
                    if (DelayKt.m58delayVtjQ1oo(j5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (!u.e(value, LoginRecoveryCodeViewModel.a.C0417a.f31816a) && !u.e(value, LoginRecoveryCodeViewModel.a.b.f31817a) && !u.e(value, LoginRecoveryCodeViewModel.a.c.f31818a)) {
                    boolean z5 = value instanceof com.withings.authentication.mfa.recovery.login.a;
                }
                return y.f85009a;
            }
            r0Var.setValue(null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecoveryCodeInput.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<String> f31837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<Integer> f31838b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f31839c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f31840d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f31841e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b2.f f31842f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LoginRecoveryCodeViewModel f31843g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k4 f31844h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r0<String> r0Var, r0<Integer> r0Var2, o1<Boolean> o1Var, o1<Boolean> o1Var2, CoroutineScope coroutineScope, b2.f fVar, LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, k4 k4Var) {
            super(2);
            this.f31837a = r0Var;
            this.f31838b = r0Var2;
            this.f31839c = o1Var;
            this.f31840d = o1Var2;
            this.f31841e = coroutineScope;
            this.f31842f = fVar;
            this.f31843g = loginRecoveryCodeViewModel;
            this.f31844h = k4Var;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            boolean z11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._NEXT_, aVar2);
                if ((!dp0.j.D(this.f31837a.getValue())) && this.f31838b.getValue() == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!this.f31839c.getValue().booleanValue() && !this.f31840d.getValue().booleanValue()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                com.withings.common.compose.component.l.a(null, u11, null, z5, null, null, z11, new h(this.f31841e, this.f31842f, this.f31843g, this.f31844h, this.f31837a), aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecoveryCodeInput.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<InputFieldType> f31845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<String> f31846b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<Integer> f31847c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f31848d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b2.f f31849e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LoginRecoveryCodeViewModel f31850f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k4 f31851g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ r0<Integer> f31852h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31853i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(r0<InputFieldType> r0Var, r0<String> r0Var2, r0<Integer> r0Var3, CoroutineScope coroutineScope, b2.f fVar, LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, k4 k4Var, r0<Integer> r0Var4, ym0.a<y> aVar) {
            super(3);
            this.f31845a = r0Var;
            this.f31846b = r0Var2;
            this.f31847c = r0Var3;
            this.f31848d = coroutineScope;
            this.f31849e = fVar;
            this.f31850f = loginRecoveryCodeViewModel;
            this.f31851g = k4Var;
            this.f31852h = r0Var4;
            this.f31853i = aVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.text.b bVar;
            boolean z5;
            String str;
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                r0<InputFieldType> r0Var = this.f31845a;
                InputFieldType value = r0Var.getValue();
                String u11 = ay.b.u(C1987R.string.mfa_type_recoveryCode, aVar2);
                r0<String> r0Var2 = this.f31846b;
                String value2 = r0Var2.getValue();
                r0<Integer> r0Var3 = this.f31847c;
                Integer value3 = r0Var3.getValue();
                aVar2.s(-642819626);
                if (value3 == null) {
                    bVar = null;
                } else {
                    bVar = new androidx.compose.ui.text.b(ay.b.u(value3.intValue(), aVar2), null, 6);
                }
                aVar2.J();
                if (r0Var3.getValue() != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                s1.a b10 = s1.b.b(aVar2, -1998180449, new i(r0Var));
                k kVar = new k(this.f31848d, this.f31849e, this.f31850f, this.f31851g, this.f31846b);
                aVar2.s(-642819261);
                Object t11 = aVar2.t();
                a.C0060a.C0061a a11 = a.C0060a.a();
                r0<Integer> r0Var4 = this.f31852h;
                if (t11 == a11) {
                    t11 = new l(r0Var2, r0Var3, r0Var4);
                    aVar2.n(t11);
                }
                aVar2.J();
                fk.q.b(null, value, null, u11, value2, bVar, null, null, b10, null, null, z5, null, null, 4, null, false, kVar, (ym0.l) t11, aVar2, 100663296, 100687872, 112325);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                d0.a(e1.f(aVar3, yk.h.b()), aVar2);
                nk.u.c(0, 0, 0, 60, 0L, aVar2, androidx.compose.foundation.h.b(aVar3, false, new n(this.f31848d, this.f31849e, this.f31853i, this.f31851g), 7), g0.a(((i1) aVar2.D(j1.e())).B(), ay.b.u(C1987R.string.login_2FA_recovery_lost, aVar2)), null);
                Integer value4 = r0Var4.getValue();
                if (value4 != null) {
                    int intValue2 = value4.intValue();
                    FeedbackCard$Status feedbackCard$Status = FeedbackCard$Status.f33623b;
                    Object[] objArr = new Object[1];
                    DurationUnit durationUnit = DurationUnit.f78024d;
                    long j5 = ep0.c.j(intValue2, durationUnit);
                    a.C0892a c0892a = ep0.a.f65838b;
                    DurationUnit durationUnit2 = DurationUnit.f78025e;
                    if (ep0.a.f(j5, ep0.c.j(1, durationUnit2)) > 0) {
                        aVar2.s(1603889645);
                        long q11 = ep0.a.q(ep0.c.j(intValue2, durationUnit), durationUnit2);
                        String lowerCase = ay.b.u(C1987R.string._MINUTES_, aVar2).toLowerCase(Locale.ROOT);
                        u.i(lowerCase, "toLowerCase(...)");
                        str = q11 + " " + lowerCase;
                        aVar2.J();
                    } else if (ep0.a.h(ep0.c.j(intValue2, durationUnit), ep0.c.j(1, durationUnit2))) {
                        aVar2.s(1603889900);
                        String lowerCase2 = ay.b.u(C1987R.string._MINUTE_, aVar2).toLowerCase(Locale.ROOT);
                        u.i(lowerCase2, "toLowerCase(...)");
                        str = intValue2 + " " + lowerCase2;
                        aVar2.J();
                    } else {
                        aVar2.s(1603890060);
                        String lowerCase3 = ay.b.u(C1987R.string._SECONDS_, aVar2).toLowerCase(Locale.ROOT);
                        u.i(lowerCase3, "toLowerCase(...)");
                        str = intValue2 + " " + lowerCase3;
                        aVar2.J();
                    }
                    objArr[0] = str;
                    o.a(feedbackCard$Status, ay.b.v(C1987R.string.mfa_login_antiBrutForce_title, objArr, aVar2), ay.b.u(C1987R.string.mfa_login_antiBrutForce_description, aVar2), x0.j(aVar3, 0.0f, yk.h.d(), 0.0f, 0.0f, 13), 0.0f, aVar2, 6, 16);
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecoveryCodeInput.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginRecoveryCodeViewModel f31854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f31856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31859f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, ym0.a<y> aVar, ym0.l<? super String, y> lVar, ym0.a<y> aVar2, int i11, int i12) {
            super(2);
            this.f31854a = loginRecoveryCodeViewModel;
            this.f31855b = aVar;
            this.f31856c = lVar;
            this.f31857d = aVar2;
            this.f31858e = i11;
            this.f31859f = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31858e | 1);
            ym0.l<String, y> lVar = this.f31856c;
            ym0.a<y> aVar2 = this.f31857d;
            f.a(this.f31854a, this.f31855b, lVar, aVar2, aVar, g11, this.f31859f);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecoveryCodeInput.kt */
    /* renamed from: com.withings.authentication.mfa.recovery.login.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0419f extends w implements ym0.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1<LoginRecoveryCodeViewModel.a> f31860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0419f(r0 r0Var) {
            super(0);
            this.f31860a = r0Var;
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f31860a.getValue() instanceof LoginRecoveryCodeViewModel.a.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecoveryCodeInput.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements ym0.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1<r.a> f31861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(r0 r0Var) {
            super(0);
            this.f31861a = r0Var;
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f31861a.getValue() instanceof r.a.c);
        }
    }

    public static final void a(LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, ym0.a<y> onBack, ym0.l<? super String, y> onMfaRecoveryCodeConfirmed, ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11, int i12) {
        ym0.a<y> aVar3;
        u.j(loginRecoveryCodeViewModel, "loginRecoveryCodeViewModel");
        u.j(onBack, "onBack");
        u.j(onMfaRecoveryCodeConfirmed, "onMfaRecoveryCodeConfirmed");
        androidx.compose.runtime.b g11 = aVar2.g(-1575396786);
        if ((i12 & 8) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar;
        }
        g11.s(-1040508659);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f("", v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        k4 k4Var = (k4) androidx.appcompat.view.menu.d.b(g11);
        Object c11 = androidx.compose.material.o.c(g11, 773894976, -492369756);
        if (c11 == a.C0060a.a()) {
            c11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) c11).a();
        g11.J();
        r0 b10 = l0.b(loginRecoveryCodeViewModel.r0(), g11);
        r0 a12 = l0.a(loginRecoveryCodeViewModel.q0(), r.a.C1667a.f99920a, null, g11, 2);
        g11.s(-1040508253);
        boolean K = g11.K((LoginRecoveryCodeViewModel.a) b10.getValue());
        Object t12 = g11.t();
        if (K || t12 == a.C0060a.a()) {
            t12 = l0.e(new C0419f(b10));
            g11.n(t12);
        }
        o1 o1Var = (o1) t12;
        g11.J();
        g11.s(-1040508076);
        boolean K2 = g11.K((r.a) a12.getValue());
        Object t13 = g11.t();
        if (K2 || t13 == a.C0060a.a()) {
            t13 = l0.e(new g(a12));
            g11.n(t13);
        }
        o1 o1Var2 = (o1) t13;
        Object a13 = com.huawei.hms.health.a.a(g11, -1040507934);
        if (a13 == a.C0060a.a()) {
            a13 = l0.f(null, v0.f8878a);
            g11.n(a13);
        }
        r0 r0Var2 = (r0) a13;
        Object a14 = com.huawei.hms.health.a.a(g11, -1040507865);
        if (a14 == a.C0060a.a()) {
            a14 = l0.f(null, v0.f8878a);
            g11.n(a14);
        }
        r0 r0Var3 = (r0) a14;
        Object a15 = com.huawei.hms.health.a.a(g11, -1040507805);
        if (a15 == a.C0060a.a()) {
            a15 = l0.f(InputFieldType.f33880h, v0.f8878a);
            g11.n(a15);
        }
        r0 r0Var4 = (r0) a15;
        g11.J();
        b2.f fVar = (b2.f) g11.D(n1.f());
        k1.y.f("code2FAGeneratedState", new a(loginRecoveryCodeViewModel, onMfaRecoveryCodeConfirmed, null), g11);
        LoginRecoveryCodeViewModel.a aVar4 = (LoginRecoveryCodeViewModel.a) b10.getValue();
        g11.s(-1040507305);
        boolean K3 = g11.K(b10);
        Object t14 = g11.t();
        if (K3 || t14 == a.C0060a.a()) {
            t14 = new b(b10, r0Var2, r0Var3, null);
            g11.n(t14);
        }
        g11.J();
        k1.y.f(aVar4, (p) t14, g11);
        h2.d a16 = f1.d.a();
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        c0.b(null, null, a16, onBack, null, jh.c.f74379a, s1.b.b(g11, 1900308099, new c(r0Var, r0Var3, o1Var, o1Var2, a11, fVar, loginRecoveryCodeViewModel, k4Var)), null, 0L, false, new x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, -1287050296, new d(r0Var4, r0Var, r0Var2, a11, fVar, loginRecoveryCodeViewModel, k4Var, r0Var3, aVar3)), g11, ((i11 << 6) & 7168) | 1769472, 24576, 15251);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(loginRecoveryCodeViewModel, onBack, onMfaRecoveryCodeConfirmed, aVar3, i11, i12));
        }
    }
}
