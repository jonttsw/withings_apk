package com.withings.cycletracking.ui.viewmodel;

import com.withings.cycletracking.ui.e2;
import com.withings.factor.model.FactorImpactOnPredictions;
import com.withings.wiscale2.C1987R;
import en.m;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.LocalDate;
import wm.b;
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$upcomingEventsUiModel$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class u extends kotlin.coroutines.jvm.internal.i implements ym0.s<PredictionState, List<? extends wm.b>, fr.a, e2.c.b, qm0.d<? super en.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ PredictionState f35948a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f35949b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ fr.a f35950c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ e2.c.b f35951d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FactorImpactOnPredictions factorImpactOnPredictions;
        Object obj2;
        b.C1822b c1822b;
        Object obj3;
        b.C1822b c1822b2;
        LocalDate localDate;
        LocalDate localDate2;
        LocalDate localDate3;
        List<LocalDate> c11;
        boolean z5;
        FactorImpactOnPredictions factorImpactOnPredictions2;
        int i11;
        b.C1822b h11;
        LocalDate c12;
        b.C1822b h12;
        LocalDate b10;
        LocalDate b11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        PredictionState predictionState = this.f35948a;
        List list = this.f35949b;
        fr.a aVar = this.f35950c;
        e2.c.b bVar = this.f35951d;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            factorImpactOnPredictions = null;
            if (it.hasNext()) {
                obj2 = it.next();
                b.C1822b g11 = ((wm.b) obj2).g();
                if (g11 != null && (b11 = g11.b()) != null && (b11.isAfter(LocalDate.now()) || kotlin.jvm.internal.u.e(b11.toDateTimeAtStartOfDay(), LocalDate.now().toDateTimeAtStartOfDay()))) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        wm.b bVar2 = (wm.b) obj2;
        if (bVar2 != null) {
            c1822b = bVar2.g();
        } else {
            c1822b = null;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                b.C1822b h13 = ((wm.b) obj3).h();
                if (h13 != null && (b10 = h13.b()) != null && (b10.isAfter(LocalDate.now()) || kotlin.jvm.internal.u.e(b10.toDateTimeAtStartOfDay(), LocalDate.now().toDateTimeAtStartOfDay()))) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        wm.b bVar3 = (wm.b) obj3;
        if (bVar3 != null) {
            c1822b2 = bVar3.h();
        } else {
            c1822b2 = null;
        }
        wm.b bVar4 = (wm.b) kotlin.collections.x.U(list);
        if (bVar4 != null) {
            localDate = bVar4.i();
        } else {
            localDate = null;
        }
        if (bVar4 != null) {
            localDate2 = bVar4.f();
        } else {
            localDate2 = null;
        }
        if (bVar4 == null || (h12 = bVar4.h()) == null || (localDate3 = h12.b()) == null) {
            if (bVar4 != null && (c11 = bVar4.c()) != null) {
                localDate3 = (LocalDate) kotlin.collections.x.Y(c11);
            } else {
                localDate3 = null;
            }
        }
        boolean z11 = false;
        if (bVar4 != null && (h11 = bVar4.h()) != null && (c12 = h11.c()) != null) {
            z5 = kotlin.jvm.internal.u.e(c12, localDate);
        } else {
            z5 = false;
        }
        if (c1822b != null && c1822b2 != null && c1822b.c().isBefore(c1822b2.c())) {
            z11 = true;
        }
        if (!bVar.c()) {
            return m.b.f65759a;
        }
        if (aVar != null) {
            factorImpactOnPredictions2 = mo.a.h(aVar.f());
        } else {
            factorImpactOnPredictions2 = null;
        }
        if (factorImpactOnPredictions2 == FactorImpactOnPredictions.f39103b) {
            return new m.e(c1822b2);
        }
        if (aVar != null) {
            factorImpactOnPredictions = mo.a.h(aVar.f());
        }
        if (factorImpactOnPredictions == FactorImpactOnPredictions.f39104c) {
            return new m.a(bVar.a(), aVar.d());
        }
        if (predictionState == PredictionState.f35836b) {
            return m.c.f65760a;
        }
        if (localDate != null && localDate2 != null && m0.t.t(localDate2)) {
            if (localDate3 != null) {
                localDate2 = localDate3;
            }
            b.C1822b c1822b3 = new b.C1822b(localDate, localDate2);
            if (z5) {
                i11 = C1987R.string.cycleTracking_upcomingCycleEvents_missedPeriod_periodSection_title;
            } else {
                i11 = C1987R.string.pregnancy_mode_survey_calculateDueDate_radioButton_1;
            }
            return new m.g(c1822b3, i11);
        } else if (c1822b2 != null) {
            return new m.f(z11, c1822b2, c1822b);
        } else {
            return m.d.f65761a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.cycletracking.ui.viewmodel.u] */
    @Override // ym0.s
    public final Object k(PredictionState predictionState, List<? extends wm.b> list, fr.a aVar, e2.c.b bVar, qm0.d<? super en.m> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(5, dVar);
        iVar.f35948a = predictionState;
        iVar.f35949b = list;
        iVar.f35950c = aVar;
        iVar.f35951d = bVar;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }
}
