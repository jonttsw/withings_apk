package com.withings.wiscale2.vo2max.view;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: Vo2maxActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2maxViewModel$setHasExplanationsBeenOpened$1", f = "Vo2maxActivity.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62732a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c2 f62733b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(c2 c2Var, qm0.d<? super d2> dVar) {
        super(2, dVar);
        this.f62733b = c2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d2(this.f62733b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62732a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            MutableStateFlow mutableStateFlow = this.f62733b.f62707e;
            Boolean bool = Boolean.TRUE;
            this.f62732a = 1;
            if (mutableStateFlow.emit(bool, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
