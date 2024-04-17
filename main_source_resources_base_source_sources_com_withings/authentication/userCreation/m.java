package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.userCreation.UserInfoNavigationKt$HeightWeight$1$6$2$1", f = "UserInfoNavigation.kt", l = {ConstantsWs.WS_STATUS_WRONGMAINTDATA, ConstantsWs.WS_STATUS_TOOMANYASSOCIATIONS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32586a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f32587b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f32588c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j5, c5 c5Var, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f32587b = j5;
        this.f32588c = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f32587b, this.f32588c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32586a;
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
            this.f32586a = 1;
            if (DelayKt.delay(this.f32587b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f32586a = 2;
        if (this.f32588c.l(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
