package com.withings.authentication.accountConsent;

import com.withings.account.core.model.Account;
import com.withings.authentication.accountConsent.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: AccountLoginConsentViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.AccountLoginConsentViewModel$fetch$1", f = "AccountLoginConsentViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31361a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AccountLoginConsentViewModel f31362b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AccountLoginConsentViewModel accountLoginConsentViewModel, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f31362b = accountLoginConsentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f31362b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        vf.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31361a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            AccountLoginConsentViewModel accountLoginConsentViewModel = this.f31362b;
            cVar = accountLoginConsentViewModel.f31347a;
            Account i12 = cVar.i();
            if (i12 != null) {
                MutableStateFlow mutableStateFlow = accountLoginConsentViewModel.f31350d;
                i.a aVar = new i.a(i12.h(), i12.j(), false);
                this.f31361a = 1;
                if (mutableStateFlow.emit(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                return y.f85009a;
            }
        }
        return y.f85009a;
    }
}
