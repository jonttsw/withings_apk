package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$8$14$1", f = "MfaResolveScreen.kt", l = {303}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32197a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f32198b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c5 c5Var, qm0.d<? super v> dVar) {
        super(2, dVar);
        this.f32198b = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new v(this.f32198b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32197a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f32197a = 1;
            if (this.f32198b.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
