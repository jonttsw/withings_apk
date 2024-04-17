package com.withings.authentication.accountConsent;

import android.content.Context;
import androidx.compose.material3.o7;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.lifecycle.h1;
import com.withings.authentication.accountConsent.i;
import com.withings.common.compose.component.s0;
import com.withings.common.compose.component.t0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
import k1.r0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.y;
/* compiled from: DataProtection.kt */
/* loaded from: classes3.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountLoginConsentViewModel f31373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31375c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31376d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AccountLoginConsentViewModel accountLoginConsentViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f31373a = accountLoginConsentViewModel;
            this.f31374b = aVar;
            this.f31375c = aVar2;
            this.f31376d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31376d | 1);
            ym0.a<y> aVar2 = this.f31374b;
            ym0.a<y> aVar3 = this.f31375c;
            f.b(this.f31373a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements ym0.l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountConsentViewModel f31377a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AccountConsentViewModel accountConsentViewModel) {
            super(1);
            this.f31377a = accountConsentViewModel;
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            this.f31377a.j0(bool.booleanValue());
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountConsentViewModel f31378a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AccountConsentViewModel accountConsentViewModel) {
            super(1);
            this.f31378a = accountConsentViewModel;
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            this.f31378a.p0(bool.booleanValue());
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountConsentViewModel f31379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AccountConsentViewModel accountConsentViewModel) {
            super(1);
            this.f31379a = accountConsentViewModel;
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            this.f31379a.f0(bool.booleanValue());
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountConsentViewModel f31380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31381b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31382c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31383d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AccountConsentViewModel accountConsentViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f31380a = accountConsentViewModel;
            this.f31381b = aVar;
            this.f31382c = aVar2;
            this.f31383d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31383d | 1);
            ym0.a<y> aVar2 = this.f31381b;
            ym0.a<y> aVar3 = this.f31382c;
            f.a(this.f31380a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.DataProtectionKt$DataProtection$5", f = "DataProtection.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: com.withings.authentication.accountConsent.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0406f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountLoginConsentViewModel f31385b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31386c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DataProtection.kt */
        /* renamed from: com.withings.authentication.accountConsent.f$f$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f31387a;

            a(ym0.a<y> aVar) {
                this.f31387a = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                y yVar = (y) obj;
                this.f31387a.invoke();
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0406f(AccountLoginConsentViewModel accountLoginConsentViewModel, ym0.a<y> aVar, qm0.d<? super C0406f> dVar) {
            super(2, dVar);
            this.f31385b = accountLoginConsentViewModel;
            this.f31386c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new C0406f(this.f31385b, this.f31386c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((C0406f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31384a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                MutableSharedFlow<y> k02 = this.f31385b.k0();
                a aVar = new a(this.f31386c);
                this.f31384a = 1;
                if (k02.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.DataProtectionKt$DataProtection$6", f = "DataProtection.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountLoginConsentViewModel f31388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AccountLoginConsentViewModel accountLoginConsentViewModel, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f31388a = accountLoginConsentViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f31388a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            AccountLoginConsentViewModel accountLoginConsentViewModel = this.f31388a;
            accountLoginConsentViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(accountLoginConsentViewModel), Dispatchers.getIO(), null, new com.withings.authentication.accountConsent.a(accountLoginConsentViewModel, null), 2, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class h extends w implements ym0.l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountLoginConsentViewModel f31389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AccountLoginConsentViewModel accountLoginConsentViewModel) {
            super(1);
            this.f31389a = accountLoginConsentViewModel;
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            AccountLoginConsentViewModel accountLoginConsentViewModel = this.f31389a;
            accountLoginConsentViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(accountLoginConsentViewModel), Dispatchers.getIO(), null, new com.withings.authentication.accountConsent.b(accountLoginConsentViewModel, booleanValue, null), 2, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class i extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountLoginConsentViewModel f31390a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AccountLoginConsentViewModel accountLoginConsentViewModel) {
            super(0);
            this.f31390a = accountLoginConsentViewModel;
        }

        @Override // ym0.a
        public final y invoke() {
            AccountLoginConsentViewModel accountLoginConsentViewModel = this.f31390a;
            accountLoginConsentViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(accountLoginConsentViewModel), Dispatchers.getIO(), null, new com.withings.authentication.accountConsent.d(accountLoginConsentViewModel, null), 2, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class j extends w implements ym0.l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountLoginConsentViewModel f31391a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AccountLoginConsentViewModel accountLoginConsentViewModel) {
            super(1);
            this.f31391a = accountLoginConsentViewModel;
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            AccountLoginConsentViewModel accountLoginConsentViewModel = this.f31391a;
            accountLoginConsentViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(accountLoginConsentViewModel), Dispatchers.getIO(), null, new com.withings.authentication.accountConsent.c(accountLoginConsentViewModel, booleanValue, null), 2, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class k extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z5, boolean z11, ym0.a<y> aVar) {
            super(2);
            this.f31392a = z5;
            this.f31393b = z11;
            this.f31394c = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, this.f31392a, null, null, this.f31393b, this.f31394c, aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class l extends w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31396b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31397c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31398d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31399e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f31400f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31401g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31402h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f31403i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f31404j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(boolean z5, ym0.l<? super Boolean, y> lVar, boolean z11, ym0.l<? super Boolean, y> lVar2, ym0.l<? super Boolean, y> lVar3, boolean z12, ym0.a<y> aVar, ym0.a<y> aVar2, Context context, boolean z13) {
            super(3);
            this.f31395a = z5;
            this.f31396b = lVar;
            this.f31397c = z11;
            this.f31398d = lVar2;
            this.f31399e = lVar3;
            this.f31400f = z12;
            this.f31401g = aVar;
            this.f31402h = aVar2;
            this.f31403i = context;
            this.f31404j = z13;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.signup_TC_privacy_title, aVar2);
                List V = x.V(new t0.b(ay.b.u(C1987R.string.signup_TC_privacy_description, aVar2)));
                String u12 = ay.b.u(C1987R.string.signup_TC_privacy_read, aVar2);
                Context context = this.f31403i;
                s0.a(u11, V, u12, 0.0f, new com.withings.authentication.accountConsent.g(context), ay.b.u(C1987R.string.signup_TC_privacy_button, aVar2), this.f31395a, false, 0L, this.f31396b, aVar2, 0, ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED);
                s0.a(ay.b.u(C1987R.string.signup_TC_terms_title, aVar2), x.V(new t0.b(ay.b.u(C1987R.string.signup_TC_terms_description, aVar2))), ay.b.u(C1987R.string.signup_TC_terms_read, aVar2), 0.0f, new com.withings.authentication.accountConsent.h(context), ay.b.u(C1987R.string.signup_TC_terms_button, aVar2), this.f31397c, false, 0L, this.f31398d, aVar2, 0, ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED);
                aVar2.s(1627240657);
                ym0.l<Boolean, y> lVar = this.f31399e;
                if (lVar != null) {
                    s0.a(ay.b.u(C1987R.string.signup_TC_communication_title, aVar2), x.V(new t0.b(ay.b.u(C1987R.string.signup_TC_communication_description, aVar2))), null, 0.0f, null, ay.b.u(C1987R.string.signup_TC_com_button, aVar2), this.f31404j, false, 0L, lVar, aVar2, 0, 412);
                    y yVar = y.f85009a;
                }
                aVar2.J();
                if (this.f31400f) {
                    String u13 = ay.b.u(C1987R.string.accountCreation_quit_title, aVar2);
                    String u14 = ay.b.u(C1987R.string.accountCreation_quit_description, aVar2);
                    String u15 = ay.b.u(C1987R.string._YES_, aVar2);
                    String u16 = ay.b.u(C1987R.string._NO_, aVar2);
                    ym0.a<y> aVar3 = this.f31401g;
                    wk.p.a(aVar3, u13, u14, u15, 0L, this.f31402h, u16, 0L, aVar3, aVar2, 0, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class m extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31405a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31406b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31407c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f31408d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31409e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31410f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f31411g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31412h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f31413i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31414j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f31415k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31416l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f31417m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f31418n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f31419o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f31420p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(ym0.a<y> aVar, boolean z5, ym0.a<y> aVar2, boolean z11, ym0.a<y> aVar3, ym0.a<y> aVar4, boolean z12, ym0.l<? super Boolean, y> lVar, boolean z13, ym0.l<? super Boolean, y> lVar2, boolean z14, ym0.l<? super Boolean, y> lVar3, boolean z15, int i11, int i12, int i13) {
            super(2);
            this.f31405a = aVar;
            this.f31406b = z5;
            this.f31407c = aVar2;
            this.f31408d = z11;
            this.f31409e = aVar3;
            this.f31410f = aVar4;
            this.f31411g = z12;
            this.f31412h = lVar;
            this.f31413i = z13;
            this.f31414j = lVar2;
            this.f31415k = z14;
            this.f31416l = lVar3;
            this.f31417m = z15;
            this.f31418n = i11;
            this.f31419o = i12;
            this.f31420p = i13;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31418n | 1);
            int g12 = ah.o.g(this.f31419o);
            ym0.l<Boolean, y> lVar = this.f31416l;
            boolean z5 = this.f31417m;
            f.c(this.f31405a, this.f31406b, this.f31407c, this.f31408d, this.f31409e, this.f31410f, this.f31411g, this.f31412h, this.f31413i, this.f31414j, this.f31415k, lVar, z5, aVar, g11, g12, this.f31420p);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class n extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(r0<Boolean> r0Var) {
            super(0);
            this.f31421a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31421a.setValue(Boolean.TRUE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class o extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31422a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(r0<Boolean> r0Var) {
            super(0);
            this.f31422a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31422a.setValue(Boolean.TRUE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class p extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31423a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(r0 r0Var, ym0.a aVar) {
            super(0);
            this.f31423a = aVar;
            this.f31424b = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31424b.setValue(Boolean.FALSE);
            this.f31423a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class q extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f31425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(r0<Boolean> r0Var) {
            super(0);
            this.f31425a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31425a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataProtection.kt */
    /* loaded from: classes3.dex */
    public static final class r extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31426a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31427b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31428c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f31429d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31430e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f31431f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31432g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f31433h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31434i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f31435j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f31436k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f31437l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(boolean z5, ym0.l<? super Boolean, y> lVar, ym0.a<y> aVar, boolean z11, ym0.l<? super Boolean, y> lVar2, boolean z12, ym0.l<? super Boolean, y> lVar3, boolean z13, ym0.a<y> aVar2, boolean z14, int i11, int i12) {
            super(2);
            this.f31426a = z5;
            this.f31427b = lVar;
            this.f31428c = aVar;
            this.f31429d = z11;
            this.f31430e = lVar2;
            this.f31431f = z12;
            this.f31432g = lVar3;
            this.f31433h = z13;
            this.f31434i = aVar2;
            this.f31435j = z14;
            this.f31436k = i11;
            this.f31437l = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31436k | 1);
            ym0.a<y> aVar2 = this.f31434i;
            boolean z5 = this.f31435j;
            f.d(this.f31426a, this.f31427b, this.f31428c, this.f31429d, this.f31430e, this.f31431f, this.f31432g, this.f31433h, aVar2, z5, aVar, g11, this.f31437l);
            return y.f85009a;
        }
    }

    public static final void a(AccountConsentViewModel accountConsentViewModel, ym0.a<y> onContinueAccountSetup, ym0.a<y> onQuit, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        u.j(accountConsentViewModel, "accountConsentViewModel");
        u.j(onContinueAccountSetup, "onContinueAccountSetup");
        u.j(onQuit, "onQuit");
        androidx.compose.runtime.b g11 = aVar.g(-1697939106);
        r0 a11 = t1.d.a(accountConsentViewModel.i0(), g11);
        boolean k02 = accountConsentViewModel.k0();
        boolean q02 = accountConsentViewModel.q0();
        boolean g02 = accountConsentViewModel.g0();
        Boolean bool = (Boolean) a11.getValue();
        if (bool != null) {
            z5 = bool.booleanValue();
        } else {
            z5 = false;
        }
        d(k02, new b(accountConsentViewModel), onContinueAccountSetup, q02, new c(accountConsentViewModel), g02, new d(accountConsentViewModel), z5, onQuit, false, g11, ((i11 << 3) & ConstantsWs.HWFAILURE_ZERO) | ((i11 << 18) & 234881024), 512);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(accountConsentViewModel, onContinueAccountSetup, onQuit, i11));
        }
    }

    public static final void b(AccountLoginConsentViewModel accountLoginConsentViewModel, ym0.a<y> onContinueAccountSetup, ym0.a<y> onQuit, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b bVar;
        u.j(accountLoginConsentViewModel, "accountLoginConsentViewModel");
        u.j(onContinueAccountSetup, "onContinueAccountSetup");
        u.j(onQuit, "onQuit");
        androidx.compose.runtime.b g11 = aVar.g(-845088991);
        r0 b10 = l0.b(accountLoginConsentViewModel.m0(), g11);
        k1.y.f("accountUpdated", new C0406f(accountLoginConsentViewModel, onContinueAccountSetup, null), g11);
        k1.y.f(y.f85009a, new g(accountLoginConsentViewModel, null), g11);
        com.withings.authentication.accountConsent.i iVar = (com.withings.authentication.accountConsent.i) b10.getValue();
        if (iVar instanceof i.a) {
            g11.s(-2007136432);
            i.a aVar2 = (i.a) iVar;
            d(aVar2.c(), new h(accountLoginConsentViewModel), new i(accountLoginConsentViewModel), aVar2.d(), new j(accountLoginConsentViewModel), false, null, aVar2.b(), onQuit, aVar2.e(), g11, (i11 << 18) & 234881024, 96);
            g11.J();
            bVar = g11;
        } else if (iVar instanceof i.b) {
            bVar = g11;
            bVar.s(-2007135727);
            o7.a(0.0f, 0, 0, 31, 0L, 0L, bVar, null);
            bVar.J();
        } else {
            bVar = g11;
            bVar.s(-2007135684);
            bVar.J();
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new a(accountLoginConsentViewModel, onContinueAccountSetup, onQuit, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(ym0.a<nm0.y> r42, boolean r43, ym0.a<nm0.y> r44, boolean r45, ym0.a<nm0.y> r46, ym0.a<nm0.y> r47, boolean r48, ym0.l<? super java.lang.Boolean, nm0.y> r49, boolean r50, ym0.l<? super java.lang.Boolean, nm0.y> r51, boolean r52, ym0.l<? super java.lang.Boolean, nm0.y> r53, boolean r54, androidx.compose.runtime.a r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.accountConsent.f.c(ym0.a, boolean, ym0.a, boolean, ym0.a, ym0.a, boolean, ym0.l, boolean, ym0.l, boolean, ym0.l, boolean, androidx.compose.runtime.a, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r23, ym0.l<? super java.lang.Boolean, nm0.y> r24, ym0.a<nm0.y> r25, boolean r26, ym0.l<? super java.lang.Boolean, nm0.y> r27, boolean r28, ym0.l<? super java.lang.Boolean, nm0.y> r29, boolean r30, ym0.a<nm0.y> r31, boolean r32, androidx.compose.runtime.a r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.accountConsent.f.d(boolean, ym0.l, ym0.a, boolean, ym0.l, boolean, ym0.l, boolean, ym0.a, boolean, androidx.compose.runtime.a, int, int):void");
    }
}
