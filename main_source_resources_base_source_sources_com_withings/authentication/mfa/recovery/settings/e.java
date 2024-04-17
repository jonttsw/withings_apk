package com.withings.authentication.mfa.recovery.settings;

import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.account.network.ws.Code;
import com.withings.account.network.ws.CodesResponse;
import com.withings.authentication.mfa.recovery.settings.a;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.k;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: SettingsRecoveryCodeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeViewModel$generateRecoveryCode$1", f = "SettingsRecoveryCodeViewModel.kt", l = {54, 59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31929a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f31930b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsRecoveryCodeViewModel f31931c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SettingsRecoveryCodeViewModel settingsRecoveryCodeViewModel, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f31931c = settingsRecoveryCodeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        e eVar = new e(this.f31931c, dVar);
        eVar.f31930b = obj;
        return eVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        String code;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31929a;
        SettingsRecoveryCodeViewModel settingsRecoveryCodeViewModel = this.f31931c;
        try {
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    mutableStateFlow = settingsRecoveryCodeViewModel.f31885c;
                    mutableStateFlow.setValue(Boolean.FALSE);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow3 = (MutableStateFlow) this.f31930b;
            l.b(obj);
        } else {
            l.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f31930b;
            mutableStateFlow2 = settingsRecoveryCodeViewModel.f31885c;
            mutableStateFlow2.setValue(Boolean.TRUE);
            mutableStateFlow3 = settingsRecoveryCodeViewModel.f31884b;
            AccountRemoteRepository accountRemoteRepository = settingsRecoveryCodeViewModel.f31883a;
            this.f31930b = mutableStateFlow3;
            this.f31929a = 1;
            obj = accountRemoteRepository.generateRecoveryCode(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Code code2 = (Code) x.K(((CodesResponse) obj).getCodes());
        if (code2 != null && (code = code2.getCode()) != null) {
            mutableStateFlow3.setValue(new a.b(code));
            a11 = y.f85009a;
            Throwable b10 = k.b(a11);
            if (b10 != null) {
                x70.b.n(b10);
                MutableSharedFlow mutableSharedFlow = settingsRecoveryCodeViewModel.f31886d;
                k a12 = k.a(l.a(b10));
                this.f31930b = a11;
                this.f31929a = 2;
                if (mutableSharedFlow.emit(a12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            mutableStateFlow = settingsRecoveryCodeViewModel.f31885c;
            mutableStateFlow.setValue(Boolean.FALSE);
            return y.f85009a;
        }
        throw new NullPointerException("Can't get a valid recovery code");
    }
}
