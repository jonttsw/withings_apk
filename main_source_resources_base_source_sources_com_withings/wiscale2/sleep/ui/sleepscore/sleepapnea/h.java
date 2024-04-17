package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.fragment.app.Fragment;
import com.withings.periodsbar.Period;
/* compiled from: SleepDisorderActivity.kt */
/* loaded from: classes5.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<Period, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderActivity f61336a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SleepDisorderActivity sleepDisorderActivity) {
        super(1);
        this.f61336a = sleepDisorderActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Period period) {
        Period period2 = period;
        SleepDisorderActivity sleepDisorderActivity = this.f61336a;
        k1.r0 B3 = SleepDisorderActivity.B3(sleepDisorderActivity);
        kotlin.jvm.internal.u.g(period2);
        B3.setValue(period2);
        Fragment A3 = SleepDisorderActivity.A3(sleepDisorderActivity, period2);
        if (A3 != null) {
            SleepDisorderActivity.I3(sleepDisorderActivity, A3);
        }
        return nm0.y.f85009a;
    }
}
