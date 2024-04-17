package com.withings.cycletracking.ui;

import java.time.MonthDay;
import java.time.YearMonth;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<MonthDay, YearMonth, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final o f35712a = new kotlin.jvm.internal.w(2);

    @Override // ym0.p
    public final Boolean invoke(MonthDay monthDay, YearMonth yearMonth) {
        boolean z5;
        MonthDay monthDay2 = monthDay;
        YearMonth yearMonth2 = yearMonth;
        kotlin.jvm.internal.u.j(monthDay2, "monthDay");
        kotlin.jvm.internal.u.j(yearMonth2, "yearMonth");
        if (kotlin.jvm.internal.u.e(monthDay2, MonthDay.now()) && kotlin.jvm.internal.u.e(yearMonth2, YearMonth.now())) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
