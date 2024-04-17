package com.withings.weight.presentation.ui;

import com.withings.periodsbar.Period;
import org.joda.time.DateTime;
/* compiled from: BodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.q<Integer, DateTime, Period, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyCompositionActivity f47280a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BodyCompositionActivity bodyCompositionActivity) {
        super(3);
        this.f47280a = bodyCompositionActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(Integer num, DateTime dateTime, Period period) {
        int intValue = num.intValue();
        DateTime date = dateTime;
        Period period2 = period;
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(period2, "period");
        BodyCompositionActivity bodyCompositionActivity = this.f47280a;
        ch.d dVar = bodyCompositionActivity.f47118f;
        if (dVar != null) {
            a3.b b10 = dVar.b();
            long q11 = BodyCompositionActivity.z3(bodyCompositionActivity).q();
            b10.getClass();
            bodyCompositionActivity.startActivity(a3.b.j(bodyCompositionActivity, q11, intValue, date, period2));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
