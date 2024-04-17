package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.userCreation.UserInfoNavigationKt$SetupUserProfile$openBottomSheet$1", f = "UserInfoNavigation.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32618a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f32619b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c5 c5Var, qm0.d<? super w> dVar) {
        super(2, dVar);
        this.f32619b = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new w(this.f32619b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32618a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f32618a = 1;
            if (this.f32619b.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
