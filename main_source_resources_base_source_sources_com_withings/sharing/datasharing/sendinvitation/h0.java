package com.withings.sharing.datasharing.sendinvitation;

import androidx.compose.material3.m8;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ShareMethodScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.ShareMethodScreenKt$ShareMethodContent$3$1$1$2$1", f = "ShareMethodScreen.kt", l = {ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m8 f44212b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m8 m8Var, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f44212b = m8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f44212b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44211a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f44211a = 1;
            if (this.f44212b.j(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
