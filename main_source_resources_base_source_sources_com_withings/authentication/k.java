package com.withings.authentication;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
/* compiled from: AuthenticationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.AuthenticationActivity$AuthProviderSheetContent$4$1", f = "AuthenticationActivity.kt", l = {HttpStatus.SC_METHOD_FAILURE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31538a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31539b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.compose.material.m0 m0Var, qm0.d<? super k> dVar) {
        super(2, dVar);
        this.f31539b = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k(this.f31539b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31538a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.compose.material.q0 a11 = this.f31539b.a();
            this.f31538a = 1;
            if (a11.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
