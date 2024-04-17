package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$7$4$1", f = "MfaResolveScreen.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32181a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f32182b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<b> f32183c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c5 c5Var, r0<b> r0Var, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f32182b = c5Var;
        this.f32183c = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f32182b, this.f32183c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32181a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f32181a = 1;
            if (this.f32182b.h(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f32183c.setValue(null);
        return nm0.y.f85009a;
    }
}
