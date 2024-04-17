package com.withings.wiscale2.vo2max.view;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Vo2MaxComparison.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2MaxComparisonView$onUserInitialized$1$3$1", f = "Vo2MaxComparison.kt", l = {ConstantsWs.WS_STATUS_DEVASSOCERROR}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62840a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0.i0 f62841b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<String> f62842c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u0.i0 i0Var, List<String> list, qm0.d<? super v> dVar) {
        super(2, dVar);
        this.f62841b = i0Var;
        this.f62842c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new v(this.f62841b, this.f62842c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62840a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            u0.i0 i0Var = this.f62841b;
            this.f62840a = 1;
            if (u0.i0.S(i0Var, (i0Var.s() + 1) % this.f62842c.size(), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
