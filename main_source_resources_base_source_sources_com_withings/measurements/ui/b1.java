package com.withings.measurements.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HealthVerticalActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalActivity$onCreate$1$1$1$2$2$54$1", f = "HealthVerticalActivity.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class b1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42024b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(HealthVerticalActivity healthVerticalActivity, qm0.d<? super b1> dVar) {
        super(2, dVar);
        this.f42024b = healthVerticalActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b1(this.f42024b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42023a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f42023a = 1;
            if (HealthVerticalActivity.G3(this.f42024b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
