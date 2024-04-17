package com.withings.authentication.mfa.totp;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.account.models.TotpResponse;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.authentication.mfa.totp.a;
import com.withings.authentication.mfa.totp.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import th.q;
import ym0.p;
/* compiled from: TotpViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/totp/TotpViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TotpViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final AccountRemoteRepository f32208a;

    /* renamed from: b  reason: collision with root package name */
    private final q f32209b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<com.withings.authentication.mfa.totp.a> f32210c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<com.withings.authentication.mfa.totp.b> f32211d;

    /* compiled from: TotpViewModel.kt */
    @e(c = "com.withings.authentication.mfa.totp.TotpViewModel$1", f = "TotpViewModel.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32212a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f32213b;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f32213b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            TotpViewModel totpViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32212a;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        totpViewModel = (TotpViewModel) this.f32213b;
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f32213b;
                    TotpViewModel totpViewModel2 = TotpViewModel.this;
                    AccountRemoteRepository accountRemoteRepository = totpViewModel2.f32208a;
                    this.f32213b = totpViewModel2;
                    this.f32212a = 1;
                    Object generateTotp = accountRemoteRepository.generateTotp(this);
                    if (generateTotp == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    totpViewModel = totpViewModel2;
                    obj = generateTotp;
                }
                TotpResponse totpResponse = (TotpResponse) obj;
                totpViewModel.f32210c.setValue(new a.b(totpResponse.getEmail(), totpResponse.getSecret(), totpResponse.getIssuer()));
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            Throwable b10 = k.b(a11);
            if (b10 != null) {
                x70.b.n(b10);
            }
            return y.f85009a;
        }
    }

    /* compiled from: TotpViewModel.kt */
    @e(c = "com.withings.authentication.mfa.totp.TotpViewModel$confirmAndGenerateRecoveryCode$1", f = "TotpViewModel.kt", l = {54, 54}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32215a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32217c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TotpViewModel.kt */
        @e(c = "com.withings.authentication.mfa.totp.TotpViewModel$confirmAndGenerateRecoveryCode$1$1", f = "TotpViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends i implements p<k<? extends String>, d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f32218a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ TotpViewModel f32219b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TotpViewModel totpViewModel, d<? super a> dVar) {
                super(2, dVar);
                this.f32219b = totpViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                a aVar = new a(this.f32219b, dVar);
                aVar.f32218a = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(k<? extends String> kVar, d<? super y> dVar) {
                return ((a) create(k.a(kVar.c()), dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                Object c11 = ((k) this.f32218a).c();
                boolean z5 = !(c11 instanceof k.a);
                TotpViewModel totpViewModel = this.f32219b;
                if (z5) {
                    totpViewModel.f32211d.setValue(new b.c((String) c11));
                }
                Throwable b10 = k.b(c11);
                if (b10 != null) {
                    totpViewModel.f32211d.setValue(new b.a(b10.getMessage()));
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, d<? super b> dVar) {
            super(2, dVar);
            this.f32217c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(this.f32217c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32215a;
            TotpViewModel totpViewModel = TotpViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                totpViewModel.f32211d.setValue(b.C0429b.f32225a);
                q qVar = totpViewModel.f32209b;
                this.f32215a = 1;
                obj = qVar.b(this.f32217c);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a aVar = new a(totpViewModel, null);
            this.f32215a = 2;
            if (FlowKt.collectLatest((Flow) obj, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    @Inject
    public TotpViewModel(AccountRemoteRepository accountRemoteRepository, q qVar) {
        u.j(accountRemoteRepository, "accountRemoteRepository");
        this.f32208a = accountRemoteRepository;
        this.f32209b = qVar;
        this.f32210c = StateFlowKt.MutableStateFlow(a.C0428a.f32220a);
        this.f32211d = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void k0(String code) {
        u.j(code, "code");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(code, null), 2, null);
    }

    public final StateFlow<com.withings.authentication.mfa.totp.a> m0() {
        return FlowKt.asStateFlow(this.f32210c);
    }

    public final StateFlow<com.withings.authentication.mfa.totp.b> p0() {
        return FlowKt.asStateFlow(this.f32211d);
    }

    public final void q0() {
        this.f32211d.setValue(null);
    }
}
