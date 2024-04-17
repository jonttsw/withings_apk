package com.withings.cycletracking.ui.viewmodel;

import com.withings.common.compose.picker.SurveyDateValidator;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.LocalDate;
/* compiled from: CycleTrackingFactorEditionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorEditionViewModel$state$1", f = "CycleTrackingFactorEditionViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.i implements ym0.q<fr.a, Integer, qm0.d<? super en.g>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ fr.a f35891a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Integer f35892b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.cycletracking.ui.viewmodel.e] */
    @Override // ym0.q
    public final Object invoke(fr.a aVar, Integer num, qm0.d<? super en.g> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f35891a = aVar;
        iVar.f35892b = num;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        LocalDate localDate;
        LocalDate localDate2;
        LocalDate e11;
        Integer f11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        fr.a aVar = this.f35891a;
        Integer num = this.f35892b;
        LocalDate now = LocalDate.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        long millis = now.toDateTimeAtCurrentTime().getMillis();
        if (aVar != null && (f11 = mo.a.f(aVar.f())) != null) {
            i11 = f11.intValue();
        } else {
            i11 = C1987R.string.dataSource_unknownTitle;
        }
        Long l5 = null;
        if (aVar != null) {
            localDate = aVar.e();
        } else {
            localDate = null;
        }
        if (aVar != null) {
            localDate2 = aVar.c();
        } else {
            localDate2 = null;
        }
        SurveyDateValidator surveyDateValidator = new SurveyDateValidator(null, new Long(millis));
        if (aVar != null && (e11 = aVar.e()) != null) {
            l5 = new Long(e11.toDateTimeAtStartOfDay().getMillis());
        }
        return new en.g(i11, localDate, localDate2, aVar, num, surveyDateValidator, new SurveyDateValidator(l5, new Long(millis)));
    }
}
