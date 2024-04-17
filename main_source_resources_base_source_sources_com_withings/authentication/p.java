package com.withings.authentication;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.AuthenticationActivity$DebugLoginWarningContent$2$1$1$1", f = "AuthenticationActivity.kt", l = {360}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32250a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f32251b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k1.r0<Boolean> r0Var, qm0.d<? super p> dVar) {
        super(2, dVar);
        this.f32251b = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p(this.f32251b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32250a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f32250a = 1;
            if (DelayKt.delay(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        int i12 = AuthenticationActivity.f31291w;
        this.f32251b.setValue(Boolean.TRUE);
        return nm0.y.f85009a;
    }
}
