package com.withings.wiscale2.coretemperature.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.y;
import org.joda.time.Interval;
/* compiled from: ExploreCoreTemperatureViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureViewModel$onViewportChanged$1", f = "ExploreCoreTemperatureViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50479a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f50480b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Interval f50481c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, Interval interval, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f50480b = nVar;
        this.f50481c = interval;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f50480b, this.f50481c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50479a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f50480b.f50463a;
            this.f50479a = 1;
            if (mutableSharedFlow.emit(this.f50481c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
