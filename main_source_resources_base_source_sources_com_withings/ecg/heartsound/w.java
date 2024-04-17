package com.withings.ecg.heartsound;

import com.withings.ecg.details.o2;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartSignalMeasurement;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HeartSoundDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.heartsound.HeartSoundDetailsViewModel$graphEntriesLiveData$1$1", f = "HeartSoundDetailsFragment.kt", l = {413}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<o2>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38551a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38552b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f38553c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38554d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r rVar, HeartSignalMeasurement heartSignalMeasurement, qm0.d<? super w> dVar) {
        super(2, dVar);
        this.f38553c = rVar;
        this.f38554d = heartSignalMeasurement;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        w wVar = new w(this.f38553c, this.f38554d, dVar);
        wVar.f38552b = obj;
        return wVar;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<o2> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((w) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38551a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f38552b;
            r rVar = this.f38553c;
            mq.i iVar = new mq.i(rVar.f38505a);
            HeartSignalMeasurement ecg = this.f38554d;
            List<Short> d11 = iVar.d(ecg.getTimestamp().getMillis(), ecg.getSignal().getMeta());
            kotlin.jvm.internal.u.i(ecg, "$ecg");
            rVar.getClass();
            ArrayList arrayList = new ArrayList();
            float f11 = 0.0f;
            for (Number number : d11) {
                arrayList.add(new EcgEntry(f11, number.shortValue()));
                f11 += 1.0f;
            }
            o2 o2Var = new o2(ecg, arrayList, 0.0f);
            this.f38551a = 1;
            if (h0Var.emit(o2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
