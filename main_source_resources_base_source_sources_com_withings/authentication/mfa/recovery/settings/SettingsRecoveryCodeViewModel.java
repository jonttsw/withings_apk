package com.withings.authentication.mfa.recovery.settings;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.account.network.ws.Code;
import com.withings.account.network.ws.CodesResponse;
import com.withings.authentication.mfa.recovery.settings.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
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
import nm0.k;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: SettingsRecoveryCodeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/recovery/settings/SettingsRecoveryCodeViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SettingsRecoveryCodeViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final AccountRemoteRepository f31883a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<com.withings.authentication.mfa.recovery.settings.a> f31884b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31885c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<k<y>> f31886d;

    /* compiled from: SettingsRecoveryCodeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeViewModel$1", f = "SettingsRecoveryCodeViewModel.kt", l = {39, 44}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31887a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f31888b;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f31888b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            MutableStateFlow mutableStateFlow;
            String code;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31887a;
            SettingsRecoveryCodeViewModel settingsRecoveryCodeViewModel = SettingsRecoveryCodeViewModel.this;
            try {
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.f31888b;
                l.b(obj);
            } else {
                l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f31888b;
                mutableStateFlow = settingsRecoveryCodeViewModel.f31884b;
                AccountRemoteRepository accountRemoteRepository = settingsRecoveryCodeViewModel.f31883a;
                this.f31888b = mutableStateFlow;
                this.f31887a = 1;
                obj = accountRemoteRepository.getRecoveryCode(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Code code2 = (Code) x.K(((CodesResponse) obj).getCodes());
            if (code2 != null && (code = code2.getCode()) != null) {
                mutableStateFlow.setValue(new a.b(code));
                a11 = y.f85009a;
                Throwable b10 = k.b(a11);
                if (b10 != null) {
                    x70.b.n(b10);
                    MutableSharedFlow mutableSharedFlow = settingsRecoveryCodeViewModel.f31886d;
                    k a12 = k.a(l.a(b10));
                    this.f31888b = a11;
                    this.f31887a = 2;
                    if (mutableSharedFlow.emit(a12, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
            throw new NullPointerException("Can't get a valid recovery code");
        }
    }

    @Inject
    public SettingsRecoveryCodeViewModel(AccountRemoteRepository accountRemoteRepository) {
        u.j(accountRemoteRepository, "accountRemoteRepository");
        this.f31883a = accountRemoteRepository;
        this.f31884b = StateFlowKt.MutableStateFlow(a.C0420a.f31890a);
        this.f31885c = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f31886d = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final SharedFlow<k<y>> k0() {
        return FlowKt.asSharedFlow(this.f31886d);
    }

    public final StateFlow<Boolean> m0() {
        return FlowKt.asStateFlow(this.f31885c);
    }

    public final StateFlow<com.withings.authentication.mfa.recovery.settings.a> p0() {
        return FlowKt.asStateFlow(this.f31884b);
    }
}
