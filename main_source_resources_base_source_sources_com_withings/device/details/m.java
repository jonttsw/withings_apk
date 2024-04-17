package com.withings.device.details;

import androidx.compose.material.c5;
import com.withings.library.authentication.api.ConstantsWs;
import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DeviceDetailFragment$onCreateView$1$1$1$2$1$1", f = "DeviceDetailFragment.kt", l = {ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE, ConstantsWs.MEASURE_TYPE_NITRITES}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36861a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f36862b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f36863c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f36864d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, c5 c5Var, r0<Boolean> r0Var, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f36862b = hVar;
        this.f36863c = c5Var;
        this.f36864d = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f36862b, this.f36863c, this.f36864d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f36861a;
        r0<Boolean> r0Var = this.f36864d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            x.a(r0Var, true);
            this.f36861a = 1;
            if (h.z1(this.f36862b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        x.a(r0Var, false);
        this.f36861a = 2;
        if (this.f36863c.h(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
