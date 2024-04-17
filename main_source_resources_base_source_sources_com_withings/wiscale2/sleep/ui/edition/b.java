package com.withings.wiscale2.sleep.ui.edition;

import android.view.View;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NightEditionActivity.kt */
/* loaded from: classes5.dex */
public final class b extends w implements p<Integer, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f60466a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NightEditionActivity f60467b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, NightEditionActivity nightEditionActivity) {
        super(2);
        this.f60466a = view;
        this.f60467b = nightEditionActivity;
    }

    @Override // ym0.p
    public final y invoke(Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int id2 = this.f60466a.getId();
        NightEditionActivity nightEditionActivity = this.f60467b;
        if (id2 == NightEditionActivity.F3(nightEditionActivity).getId()) {
            nightEditionActivity.f60445m = true;
            DateTime dateTime = nightEditionActivity.f60448p;
            if (dateTime != null) {
                DateTime withMinuteOfHour = dateTime.withHourOfDay(intValue).withMinuteOfHour(intValue2);
                u.i(withMinuteOfHour, "withMinuteOfHour(...)");
                nightEditionActivity.f60450r = withMinuteOfHour;
            } else {
                u.s("asleepTime");
                throw null;
            }
        } else {
            nightEditionActivity.f60446n = true;
            DateTime dateTime2 = nightEditionActivity.f60449q;
            if (dateTime2 != null) {
                DateTime withMinuteOfHour2 = dateTime2.withHourOfDay(intValue).withMinuteOfHour(intValue2);
                u.i(withMinuteOfHour2, "withMinuteOfHour(...)");
                nightEditionActivity.f60451s = withMinuteOfHour2;
            } else {
                u.s("awakeTime");
                throw null;
            }
        }
        NightEditionActivity.Z3(nightEditionActivity);
        NightEditionActivity.Y3(nightEditionActivity);
        return y.f85009a;
    }
}
