package com.withings.authentication.deactivation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: AccountReactivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.deactivation.AccountReactivationViewModel$disconnect$1", f = "AccountReactivationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AccountReactivationViewModel f31495a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountReactivationViewModel accountReactivationViewModel, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f31495a = accountReactivationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f31495a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        vf.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        AccountReactivationViewModel accountReactivationViewModel = this.f31495a;
        cVar = accountReactivationViewModel.f31461a;
        cVar.f();
        accountReactivationViewModel.k0().postValue(null);
        return y.f85009a;
    }
}
