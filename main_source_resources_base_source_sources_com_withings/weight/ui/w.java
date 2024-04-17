package com.withings.weight.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalBodyCompositionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$get3DModel$2", f = "SegmentalBodyCompositionViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super z80.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f47880a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f47881b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f47882c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, long j5, qm0.d<? super w> dVar) {
        super(2, dVar);
        this.f47881b = vVar;
        this.f47882c = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w(this.f47881b, this.f47882c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super z80.b> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d90.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47880a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            aVar = this.f47881b.f47831b;
            this.f47880a = 1;
            obj = aVar.a(this.f47882c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
