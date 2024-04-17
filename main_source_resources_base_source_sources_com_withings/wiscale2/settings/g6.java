package com.withings.wiscale2.settings;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: UnitsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.UnitsActivityViewModel$updateFatMassPercentState$1", f = "UnitsActivity.kt", l = {ConstantsWs.MEASURE_TYPE_R6_25KHZ_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60020a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UnitsActivityViewModel f60021b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f60022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(UnitsActivityViewModel unitsActivityViewModel, boolean z5, qm0.d<? super g6> dVar) {
        super(2, dVar);
        this.f60021b = unitsActivityViewModel;
        this.f60022c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g6(this.f60021b, this.f60022c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g6) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60020a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            om.d f02 = this.f60021b.f0();
            this.f60020a = 1;
            if (f02.H(this.f60022c) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
