package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderDayPagerFragment.kt */
/* loaded from: classes5.dex */
final class x1 extends kotlin.jvm.internal.w implements ym0.l<DateTime, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1 f61557a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(t1 t1Var) {
        super(1);
        this.f61557a = t1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(DateTime dateTime) {
        DateTime dateTime2 = dateTime;
        SleepDisorderActivity.b s12 = t1.s1(this.f61557a);
        if (s12 != null) {
            s12.A0(dateTime2);
        }
        return nm0.y.f85009a;
    }
}
