package com.withings.nervehealth.ui;

import androidx.compose.material.c5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NerveHealthMeasureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthMeasureListActivity$onCreate$1$1$2$1$1", f = "NerveHealthMeasureListActivity.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42716a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f42717b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(c5 c5Var, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f42717b = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f42717b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42716a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f42716a = 1;
            if (this.f42717b.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
