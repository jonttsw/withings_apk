package com.withings.weight.presentation.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.weight.presentation.viewmodel.WeightViewModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.joda.time.DateTime;
/* compiled from: WeightActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$initViewModel$1", f = "WeightActivity.kt", l = {ConstantsWs.MEASURE_TYPE_IGLUCOSE_BLOOD_GLUCOSE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f47249a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47250b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeightActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeightActivity f47251a;

        a(WeightActivity weightActivity) {
            this.f47251a = weightActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            nm0.j jVar = (nm0.j) obj;
            com.withings.wiscale2.device.hwa08.postinstall.b0.V(this.f47251a, (Period) jVar.a(), (DateTime) jVar.b());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(WeightActivity weightActivity, qm0.d<? super g0> dVar) {
        super(2, dVar);
        this.f47250b = weightActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g0(this.f47250b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WeightViewModel D3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47249a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            WeightActivity weightActivity = this.f47250b;
            D3 = weightActivity.D3();
            Flow<nm0.j<Period, DateTime>> g12 = D3.g1();
            a aVar = new a(weightActivity);
            this.f47249a = 1;
            if (g12.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
