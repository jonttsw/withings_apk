package com.withings.authentication;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.AuthenticationActivity$onCreate$1$1$1$1$1$2", f = "AuthenticationActivity.kt", l = {195}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31450a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31451b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f31452c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.compose.material.m0 m0Var, k1.r0<Boolean> r0Var, qm0.d<? super c0> dVar) {
        super(2, dVar);
        this.f31451b = m0Var;
        this.f31452c = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c0(this.f31451b, this.f31452c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31450a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.compose.material.q0 a11 = this.f31451b.a();
            this.f31450a = 1;
            if (a11.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f31452c.setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
