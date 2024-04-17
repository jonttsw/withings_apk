package com.withings.authentication.mfa;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.authentication.mfa.a;
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
/* compiled from: SettingsMfaViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/SettingsMfaViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SettingsMfaViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final AccountRemoteRepository f31591a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<com.withings.authentication.mfa.a> f31592b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31593c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<nm0.k<nm0.y>> f31594d;

    /* compiled from: SettingsMfaViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.SettingsMfaViewModel$deletePhoneFactor$1", f = "SettingsMfaViewModel.kt", l = {87, 88, 89, 90, 93, 97}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31595a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f31596b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PhoneFactor f31598d;

        /* compiled from: SettingsMfaViewModel.kt */
        /* renamed from: com.withings.authentication.mfa.SettingsMfaViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0409a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f31599a;

            static {
                int[] iArr = new int[PhoneFactor.values().length];
                try {
                    PhoneFactor phoneFactor = PhoneFactor.f31561a;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PhoneFactor phoneFactor2 = PhoneFactor.f31561a;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    PhoneFactor phoneFactor3 = PhoneFactor.f31561a;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f31599a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PhoneFactor phoneFactor, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f31598d = phoneFactor;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f31598d, dVar);
            aVar.f31596b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.SettingsMfaViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SettingsMfaViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.SettingsMfaViewModel$deleteTotp$1", f = "SettingsMfaViewModel.kt", l = {70, 72, 76}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31600a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f31601b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f31601b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r6.f31600a
                r2 = 3
                r3 = 2
                r4 = 1
                com.withings.authentication.mfa.SettingsMfaViewModel r5 = com.withings.authentication.mfa.SettingsMfaViewModel.this
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                nm0.l.b(r7)
                goto L8c
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                nm0.l.b(r7)     // Catch: java.lang.Throwable -> L22
                goto L65
            L22:
                r7 = move-exception
                goto L68
            L24:
                java.lang.Object r1 = r6.f31601b
                com.withings.authentication.mfa.SettingsMfaViewModel r1 = (com.withings.authentication.mfa.SettingsMfaViewModel) r1
                nm0.l.b(r7)     // Catch: java.lang.Throwable -> L22
                goto L4c
            L2c:
                nm0.l.b(r7)
                java.lang.Object r7 = r6.f31601b
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.withings.authentication.mfa.SettingsMfaViewModel.k0(r5)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r7.setValue(r1)
                com.withings.account.network.ws.AccountRemoteRepository r7 = com.withings.authentication.mfa.SettingsMfaViewModel.g0(r5)     // Catch: java.lang.Throwable -> L22
                r6.f31601b = r5     // Catch: java.lang.Throwable -> L22
                r6.f31600a = r4     // Catch: java.lang.Throwable -> L22
                java.lang.Object r7 = r7.deleteTotp(r6)     // Catch: java.lang.Throwable -> L22
                if (r7 != r0) goto L4b
                return r0
            L4b:
                r1 = r5
            L4c:
                com.withings.authentication.mfa.SettingsMfaViewModel.f0(r1)     // Catch: java.lang.Throwable -> L22
                kotlinx.coroutines.flow.MutableSharedFlow r7 = com.withings.authentication.mfa.SettingsMfaViewModel.j0(r1)     // Catch: java.lang.Throwable -> L22
                nm0.y r1 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L22
                nm0.k r1 = nm0.k.a(r1)     // Catch: java.lang.Throwable -> L22
                r4 = 0
                r6.f31601b = r4     // Catch: java.lang.Throwable -> L22
                r6.f31600a = r3     // Catch: java.lang.Throwable -> L22
                java.lang.Object r7 = r7.emit(r1, r6)     // Catch: java.lang.Throwable -> L22
                if (r7 != r0) goto L65
                return r0
            L65:
                nm0.y r7 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L22
                goto L6c
            L68:
                nm0.k$a r7 = nm0.l.a(r7)
            L6c:
                java.lang.Throwable r1 = nm0.k.b(r7)
                if (r1 == 0) goto L8c
                x70.b.n(r1)
                kotlinx.coroutines.flow.MutableSharedFlow r3 = com.withings.authentication.mfa.SettingsMfaViewModel.j0(r5)
                nm0.k$a r1 = nm0.l.a(r1)
                nm0.k r1 = nm0.k.a(r1)
                r6.f31601b = r7
                r6.f31600a = r2
                java.lang.Object r7 = r3.emit(r1, r6)
                if (r7 != r0) goto L8c
                return r0
            L8c:
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.withings.authentication.mfa.SettingsMfaViewModel.k0(r5)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r7.setValue(r0)
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.SettingsMfaViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public SettingsMfaViewModel(AccountRemoteRepository accountRemoteRepository) {
        kotlin.jvm.internal.u.j(accountRemoteRepository, "accountRemoteRepository");
        this.f31591a = accountRemoteRepository;
        this.f31592b = StateFlowKt.MutableStateFlow(a.b.f31608a);
        this.f31593c = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f31594d = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new i0(this, null), 2, null);
    }

    public static final void f0(SettingsMfaViewModel settingsMfaViewModel) {
        settingsMfaViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(settingsMfaViewModel), Dispatchers.getIO(), null, new i0(settingsMfaViewModel, null), 2, null);
    }

    public final void m0(PhoneFactor phoneFactor) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(phoneFactor, null), 2, null);
    }

    public final void p0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final StateFlow<com.withings.authentication.mfa.a> q0() {
        return FlowKt.asStateFlow(this.f31592b);
    }

    public final SharedFlow<nm0.k<nm0.y>> r0() {
        return FlowKt.asSharedFlow(this.f31594d);
    }

    public final StateFlow<Boolean> t0() {
        return FlowKt.asStateFlow(this.f31593c);
    }
}
