package com.withings.weight.presentation.viewmodel;

import androidx.activity.b0;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.j;
import nm0.l;
import nm0.y;
import org.joda.time.Interval;
import qm0.d;
import ws.f;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyCompViewModel.kt */
@e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$onViewportChanged$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_INVALID_CROP_ARGS, ConstantsWs.WS_STATUS_P4_ERROR_INVALID_CROP_NUMERIC}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f47582a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BodyCompViewModel f47583b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f f47584c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BodyCompViewModel bodyCompViewModel, f fVar, d<? super a> dVar) {
        super(2, dVar);
        this.f47583b = bodyCompViewModel;
        this.f47584c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f47583b, this.f47584c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47582a;
        BodyCompViewModel bodyCompViewModel = this.f47583b;
        f fVar = this.f47584c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    xw.d.e(bodyCompViewModel.s1(), new j(fVar.b().a(), fVar.a()));
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        } else {
            l.b(obj);
            MutableSharedFlow mutableSharedFlow = bodyCompViewModel.F;
            this.f47582a = 1;
            obj = FlowKt.first(mutableSharedFlow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Interval interval = (Interval) obj;
        MutableSharedFlow mutableSharedFlow2 = bodyCompViewModel.Q;
        Interval interval2 = new Interval(b0.n(fVar, interval), b0.l(fVar, interval));
        this.f47582a = 2;
        if (mutableSharedFlow2.emit(interval2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        xw.d.e(bodyCompViewModel.s1(), new j(fVar.b().a(), fVar.a()));
        return y.f85009a;
    }
}
