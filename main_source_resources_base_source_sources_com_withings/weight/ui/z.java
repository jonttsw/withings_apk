package com.withings.weight.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalBodyCompositionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$refreshModel$1", f = "SegmentalBodyCompositionViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class z extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MutableSharedFlow f47887a;

    /* renamed from: b  reason: collision with root package name */
    int f47888b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f47889c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v vVar, qm0.d<? super z> dVar) {
        super(2, dVar);
        this.f47889c = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z(this.f47889c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((z) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47888b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = this.f47887a;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            v vVar = this.f47889c;
            mutableSharedFlow = vVar.f47844o;
            long j5 = vVar.f47838i;
            this.f47887a = mutableSharedFlow;
            this.f47888b = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new w(vVar, j5, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f47887a = null;
        this.f47888b = 2;
        if (mutableSharedFlow.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
