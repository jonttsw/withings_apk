package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.userCreation.UserInfoNavigationKt$HeightWeight$1$6$1$1", f = "UserInfoNavigation.kt", l = {250, ConstantsWs.WS_STATUS_NODATAFOUND}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32578a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f32579b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f32580c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j5, c5 c5Var, qm0.d<? super k> dVar) {
        super(2, dVar);
        this.f32579b = j5;
        this.f32580c = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new k(this.f32579b, this.f32580c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32578a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            this.f32578a = 1;
            if (DelayKt.delay(this.f32579b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f32578a = 2;
        if (this.f32580c.l(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
