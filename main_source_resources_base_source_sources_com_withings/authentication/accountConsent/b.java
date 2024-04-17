package com.withings.authentication.accountConsent;

import com.withings.authentication.accountConsent.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: AccountLoginConsentViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.AccountLoginConsentViewModel$privacyPolicyAccepted$1", f = "AccountLoginConsentViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AccountLoginConsentViewModel f31363a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f31364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AccountLoginConsentViewModel accountLoginConsentViewModel, boolean z5, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f31363a = accountLoginConsentViewModel;
        this.f31364b = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f31363a, this.f31364b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        MutableStateFlow mutableStateFlow = this.f31363a.f31350d;
        do {
            value = mutableStateFlow.getValue();
            i iVar = (i) value;
            if (iVar instanceof i.b) {
                a11 = i.b.f31444a;
            } else if (iVar instanceof i.a) {
                a11 = i.a.a((i.a) iVar, this.f31364b, false, false, 6);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } while (!mutableStateFlow.compareAndSet(value, a11));
        return y.f85009a;
    }
}
