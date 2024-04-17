package com.withings.authentication.mfa.resolve;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.authentication.mfa.resolve.a;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: MfaResolutionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/resolve/MfaResolutionViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MfaResolutionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final vf.c f31932a;

    /* renamed from: b  reason: collision with root package name */
    private final AccountRemoteRepository f31933b;

    /* renamed from: c  reason: collision with root package name */
    private final AccountSessionRepository f31934c;

    /* renamed from: d  reason: collision with root package name */
    private final t00.d f31935d;

    /* renamed from: e  reason: collision with root package name */
    private final lg.a f31936e;

    /* renamed from: f  reason: collision with root package name */
    private final th.y f31937f;

    /* renamed from: g  reason: collision with root package name */
    private final qf.a f31938g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<com.withings.authentication.mfa.resolve.a> f31939h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31940i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableSharedFlow<p0> f31941j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableSharedFlow<o0> f31942k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31943l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f31944m;

    /* compiled from: MfaResolutionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolutionViewModel$resolveCode$1", f = "MfaResolutionViewModel.kt", l = {127, ConstantsWs.MEASURE_TYPE_PAUSE, 135, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT, 140, ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31945a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f31947c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f31948d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, String str, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f31947c = cVar;
            this.f31948d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f31947c, this.f31948d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.resolve.MfaResolutionViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MfaResolutionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolutionViewModel$sendPhoneCode$1", f = "MfaResolutionViewModel.kt", l = {98, 99, 100, 102, 106}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31949a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f31950b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f31951c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f31952d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, MfaResolutionViewModel mfaResolutionViewModel, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f31951c = cVar;
            this.f31952d = mfaResolutionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f31951c, this.f31952d, dVar);
            bVar.f31950b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f31949a
                com.withings.authentication.mfa.resolve.MfaResolutionViewModel r2 = r8.f31952d
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L3e
                if (r1 == r7) goto L39
                if (r1 == r6) goto L34
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                nm0.l.b(r9)
                goto Lbc
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                nm0.l.b(r9)     // Catch: java.lang.Throwable -> L29
                goto L9b
            L29:
                r9 = move-exception
                goto L9e
            L2c:
                java.lang.Object r1 = r8.f31950b
                com.withings.authentication.mfa.resolve.MfaResolutionViewModel r1 = (com.withings.authentication.mfa.resolve.MfaResolutionViewModel) r1
            L30:
                nm0.l.b(r9)     // Catch: java.lang.Throwable -> L29
                goto L89
            L34:
                java.lang.Object r1 = r8.f31950b
                com.withings.authentication.mfa.resolve.MfaResolutionViewModel r1 = (com.withings.authentication.mfa.resolve.MfaResolutionViewModel) r1
                goto L30
            L39:
                java.lang.Object r1 = r8.f31950b
                com.withings.authentication.mfa.resolve.MfaResolutionViewModel r1 = (com.withings.authentication.mfa.resolve.MfaResolutionViewModel) r1
                goto L30
            L3e:
                nm0.l.b(r9)
                java.lang.Object r9 = r8.f31950b
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                com.withings.authentication.mfa.resolve.c r9 = r8.f31951c
                com.withings.authentication.mfa.resolve.c$c r1 = com.withings.authentication.mfa.resolve.c.C0424c.f31965a     // Catch: java.lang.Throwable -> L29
                boolean r1 = kotlin.jvm.internal.u.e(r9, r1)     // Catch: java.lang.Throwable -> L29
                if (r1 != 0) goto L88
                boolean r1 = r9 instanceof com.withings.authentication.mfa.resolve.c.d     // Catch: java.lang.Throwable -> L29
                if (r1 == 0) goto L62
                com.withings.account.network.ws.AccountRemoteRepository r9 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.g0(r2)     // Catch: java.lang.Throwable -> L29
                r8.f31950b = r2     // Catch: java.lang.Throwable -> L29
                r8.f31949a = r7     // Catch: java.lang.Throwable -> L29
                java.lang.Object r9 = r9.sendCodeWhatsApp(r8)     // Catch: java.lang.Throwable -> L29
                if (r9 != r0) goto L88
                return r0
            L62:
                boolean r1 = r9 instanceof com.withings.authentication.mfa.resolve.c.b     // Catch: java.lang.Throwable -> L29
                if (r1 == 0) goto L75
                com.withings.account.network.ws.AccountRemoteRepository r9 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.g0(r2)     // Catch: java.lang.Throwable -> L29
                r8.f31950b = r2     // Catch: java.lang.Throwable -> L29
                r8.f31949a = r6     // Catch: java.lang.Throwable -> L29
                java.lang.Object r9 = r9.sendCodeSms(r8)     // Catch: java.lang.Throwable -> L29
                if (r9 != r0) goto L88
                return r0
            L75:
                boolean r9 = r9 instanceof com.withings.authentication.mfa.resolve.c.a     // Catch: java.lang.Throwable -> L29
                if (r9 == 0) goto L88
                com.withings.account.network.ws.AccountRemoteRepository r9 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.g0(r2)     // Catch: java.lang.Throwable -> L29
                r8.f31950b = r2     // Catch: java.lang.Throwable -> L29
                r8.f31949a = r5     // Catch: java.lang.Throwable -> L29
                java.lang.Object r9 = r9.sendCodeCall(r8)     // Catch: java.lang.Throwable -> L29
                if (r9 != r0) goto L88
                return r0
            L88:
                r1 = r2
            L89:
                kotlinx.coroutines.flow.MutableSharedFlow r9 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.t0(r1)     // Catch: java.lang.Throwable -> L29
                com.withings.authentication.mfa.resolve.o0$b r1 = com.withings.authentication.mfa.resolve.o0.b.f32185a     // Catch: java.lang.Throwable -> L29
                r5 = 0
                r8.f31950b = r5     // Catch: java.lang.Throwable -> L29
                r8.f31949a = r4     // Catch: java.lang.Throwable -> L29
                java.lang.Object r9 = r9.emit(r1, r8)     // Catch: java.lang.Throwable -> L29
                if (r9 != r0) goto L9b
                return r0
            L9b:
                nm0.y r9 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L29
                goto La2
            L9e:
                nm0.k$a r9 = nm0.l.a(r9)
            La2:
                java.lang.Throwable r1 = nm0.k.b(r9)
                if (r1 == 0) goto Lbc
                x70.b.n(r1)
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.t0(r2)
                com.withings.authentication.mfa.resolve.o0$a r2 = com.withings.authentication.mfa.resolve.o0.a.f32184a
                r8.f31950b = r9
                r8.f31949a = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto Lbc
                return r0
            Lbc:
                nm0.y r9 = nm0.y.f85009a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.resolve.MfaResolutionViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public MfaResolutionViewModel(vf.c accountManager, AccountRemoteRepository accountRemoteRepository, AccountSessionRepository accountSessionRepository, t00.d networkSyncManager, lg.a aVar, th.y yVar, com.withings.wiscale2.settings.k0 k0Var) {
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(accountRemoteRepository, "accountRemoteRepository");
        kotlin.jvm.internal.u.j(accountSessionRepository, "accountSessionRepository");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        this.f31932a = accountManager;
        this.f31933b = accountRemoteRepository;
        this.f31934c = accountSessionRepository;
        this.f31935d = networkSyncManager;
        this.f31936e = aVar;
        this.f31937f = yVar;
        this.f31938g = k0Var;
        this.f31939h = StateFlowKt.MutableStateFlow(a.b.f31954a);
        Boolean bool = Boolean.FALSE;
        this.f31940i = StateFlowKt.MutableStateFlow(bool);
        this.f31941j = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f31942k = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f31943l = StateFlowKt.MutableStateFlow(bool);
        this.f31944m = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(this, null), 2, null);
    }

    public final StateFlow<com.withings.authentication.mfa.resolve.a> B0() {
        return FlowKt.asStateFlow(this.f31939h);
    }

    public final SharedFlow<Boolean> F0() {
        return FlowKt.asSharedFlow(this.f31944m);
    }

    public final SharedFlow<o0> G0() {
        return FlowKt.asSharedFlow(this.f31942k);
    }

    public final StateFlow<Boolean> K0() {
        return FlowKt.asStateFlow(this.f31943l);
    }

    public final StateFlow<Boolean> M0() {
        return FlowKt.asStateFlow(this.f31940i);
    }

    public final SharedFlow<p0> O0() {
        return FlowKt.asSharedFlow(this.f31941j);
    }

    public final void R0(String code, c factor) {
        kotlin.jvm.internal.u.j(code, "code");
        kotlin.jvm.internal.u.j(factor, "factor");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(factor, code, null), 2, null);
    }

    public final void T0(c factor) {
        kotlin.jvm.internal.u.j(factor, "factor");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(factor, this, null), 2, null);
    }
}
