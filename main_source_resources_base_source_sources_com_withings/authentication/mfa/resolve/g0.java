package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$8$4$1", f = "MfaResolveScreen.kt", l = {ConstantsWs.WS_STATUS_SHARINGGETERROR}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32075a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f32076b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c5 c5Var, qm0.d<? super g0> dVar) {
        super(2, dVar);
        this.f32076b = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g0(this.f32076b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32075a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f32075a = 1;
            if (this.f32076b.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
