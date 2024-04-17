package com.withings.authentication.deactivation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import th.u;
import ym0.p;
/* compiled from: AccountReactivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.deactivation.AccountReactivationViewModel$reactivateAccount$1", f = "AccountReactivationViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31496a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AccountReactivationViewModel f31497b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AccountReactivationViewModel accountReactivationViewModel, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f31497b = accountReactivationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f31497b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        u uVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31496a;
        AccountReactivationViewModel accountReactivationViewModel = this.f31497b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                uVar = accountReactivationViewModel.f31462b;
                long e11 = accountReactivationViewModel.i0().e();
                this.f31496a = 1;
                if (uVar.a(e11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            y yVar = (y) a11;
            accountReactivationViewModel.j0().postValue(null);
        }
        Throwable b10 = k.b(a11);
        if (b10 != null) {
            x70.b.n(b10);
            accountReactivationViewModel.m0().postValue(null);
        }
        return y.f85009a;
    }
}
