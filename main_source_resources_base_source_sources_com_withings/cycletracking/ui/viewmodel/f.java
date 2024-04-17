package com.withings.cycletracking.ui.viewmodel;

import com.withings.factor.model.FactorImpactOnPredictions;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
/* compiled from: CycleTrackingFactorEditionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorEditionViewModel$warningTitleRes$1", f = "CycleTrackingFactorEditionViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.q<LocalDate, fr.a, qm0.d<? super Integer>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ LocalDate f35893a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ fr.a f35894b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.cycletracking.ui.viewmodel.f] */
    @Override // ym0.q
    public final Object invoke(LocalDate localDate, fr.a aVar, qm0.d<? super Integer> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f35893a = localDate;
        iVar.f35894b = aVar;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FactorImpactOnPredictions factorImpactOnPredictions;
        FactorImpactOnPredictions factorImpactOnPredictions2;
        LocalDate e11;
        LocalDate c11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        LocalDate localDate = this.f35893a;
        fr.a aVar = this.f35894b;
        if (aVar != null && (c11 = aVar.c()) != null) {
            boolean z5 = false;
            if (localDate.compareTo((ReadablePartial) aVar.e()) >= 0 && localDate.compareTo((ReadablePartial) c11) <= 0) {
                z5 = true;
            }
            if (!z5) {
                return null;
            }
        }
        if (aVar != null && (e11 = aVar.e()) != null && e11.isAfter(localDate)) {
            return null;
        }
        if (aVar != null) {
            factorImpactOnPredictions = mo.a.h(aVar.f());
        } else {
            factorImpactOnPredictions = null;
        }
        if (factorImpactOnPredictions == FactorImpactOnPredictions.f39103b) {
            return new Integer((int) C1987R.string.cycle_tracking_factors_contraceptive_pauseOvulation_title);
        }
        if (aVar != null) {
            factorImpactOnPredictions2 = mo.a.h(aVar.f());
        } else {
            factorImpactOnPredictions2 = null;
        }
        if (factorImpactOnPredictions2 != FactorImpactOnPredictions.f39104c) {
            return null;
        }
        return new Integer((int) C1987R.string.cycle_tracking_factors_contraceptive_pauseAllPredictions_title);
    }
}
