package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$7$1$1", f = "MfaResolveScreen.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32157a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f32158b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<b> f32159c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c5 c5Var, r0<b> r0Var, qm0.d<? super j> dVar) {
        super(2, dVar);
        this.f32158b = c5Var;
        this.f32159c = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f32158b, this.f32159c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32157a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f32157a = 1;
            if (this.f32158b.h(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f32159c.setValue(null);
        return nm0.y.f85009a;
    }
}
