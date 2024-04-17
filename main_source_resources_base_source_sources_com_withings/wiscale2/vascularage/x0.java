package com.withings.wiscale2.vascularage;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$onViewportChange$1", f = "VascularAgeViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGAPPLI, ConstantsWs.WS_STATUS_WRONGVERSION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class x0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62505a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f62506b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ws.f f62507c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(r0 r0Var, ws.f fVar, qm0.d<? super x0> dVar) {
        super(2, dVar);
        this.f62506b = r0Var;
        this.f62507c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x0(this.f62506b, this.f62507c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62505a;
        r0 r0Var = this.f62506b;
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
            d1 d1Var = r0Var.f62456q;
            this.f62505a = 1;
            obj = FlowKt.first(d1Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Interval interval = (Interval) obj;
        MutableSharedFlow mutableSharedFlow = r0Var.f62455p;
        ws.f fVar = this.f62507c;
        Interval interval2 = new Interval(androidx.activity.b0.n(fVar, interval), androidx.activity.b0.l(fVar, interval));
        this.f62505a = 2;
        if (mutableSharedFlow.emit(interval2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
