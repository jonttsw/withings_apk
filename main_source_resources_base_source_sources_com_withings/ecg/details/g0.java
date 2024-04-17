package com.withings.ecg.details;

import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.library.ecg.EcgLeadType;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsViewModel$graphEntriesLiveData$1$1", f = "EcgDetailsFragment.kt", l = {611}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Map<EcgLeadType, ? extends List<? extends EcgEntry>>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38222a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38223b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38224c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b0 f38225d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(HeartSignalMeasurement heartSignalMeasurement, b0 b0Var, qm0.d<? super g0> dVar) {
        super(2, dVar);
        this.f38224c = heartSignalMeasurement;
        this.f38225d = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        g0 g0Var = new g0(this.f38224c, this.f38225d, dVar);
        g0Var.f38223b = obj;
        return g0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Map<EcgLeadType, ? extends List<? extends EcgEntry>>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((g0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38222a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            HeartSignalMeasurement ecg = this.f38224c;
            kotlin.jvm.internal.u.i(ecg, "$ecg");
            Map<EcgLeadType, List<EcgEntry>> a11 = mq.d.a(ecg, this.f38225d.f38097a);
            this.f38222a = 1;
            if (((androidx.lifecycle.h0) this.f38223b).emit(a11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
