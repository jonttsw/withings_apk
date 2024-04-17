package com.withings.wiscale2.heart.heartrate;

import com.withings.common.compose.component.u1;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.heartrate.HeartRateAwakeAverageActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.joda.time.Duration;
import org.joda.time.format.PeriodFormatterBuilder;
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<List<? extends l1>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateAwakeAverageActivity f57653a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity) {
        super(1);
        this.f57653a = heartRateAwakeAverageActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends l1> list) {
        String string;
        int i11;
        String print;
        int color;
        List<? extends l1> list2 = list;
        kotlin.jvm.internal.u.g(list2);
        HeartRateAwakeAverageActivity.a aVar = HeartRateAwakeAverageActivity.f57484h;
        HeartRateAwakeAverageActivity heartRateAwakeAverageActivity = this.f57653a;
        heartRateAwakeAverageActivity.getClass();
        List<? extends l1> list3 = list2;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list3, 10));
        for (l1 l1Var : list3) {
            int ordinal = l1Var.b().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            string = heartRateAwakeAverageActivity.getString(C1987R.string._HR_LIGHT_ZONE_);
                            kotlin.jvm.internal.u.i(string, "getString(...)");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        string = heartRateAwakeAverageActivity.getString(C1987R.string._HR_MODERATE_ZONE_);
                        kotlin.jvm.internal.u.i(string, "getString(...)");
                    }
                } else {
                    string = heartRateAwakeAverageActivity.getString(C1987R.string._HR_INTENSE_ZONE_);
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                }
            } else {
                string = heartRateAwakeAverageActivity.getString(C1987R.string._HR_PEAK_ZONE_);
                kotlin.jvm.internal.u.i(string, "getString(...)");
            }
            String str = string;
            float a11 = l1Var.a();
            if (a11 == 0.0f) {
                print = "-";
            } else {
                PeriodFormatterBuilder appendSuffix = new PeriodFormatterBuilder().appendHours().appendSuffix(heartRateAwakeAverageActivity.getString(C1987R.string._H_));
                if (a11 > 3600.0f) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                print = appendSuffix.minimumPrintedDigits(i11).appendMinutes().appendSuffix(heartRateAwakeAverageActivity.getString(C1987R.string._MIN_)).toFormatter().print(new Duration(an0.a.b(a11) * 1000).toPeriod());
                kotlin.jvm.internal.u.i(print, "print(...)");
            }
            String str2 = print;
            int ordinal2 = l1Var.b().ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            color = heartRateAwakeAverageActivity.getColor(C1987R.color.datavizMonochromaticNeutral2);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        color = heartRateAwakeAverageActivity.getColor(C1987R.color.datavizMonochromaticNeutral3);
                    }
                } else {
                    color = heartRateAwakeAverageActivity.getColor(C1987R.color.datavizMonochromaticNeutral4);
                }
            } else {
                color = heartRateAwakeAverageActivity.getColor(C1987R.color.datavizMonochromaticNeutral5);
            }
            arrayList.add(new u1(str, str2, null, l1Var.c(), color, null, null, 100));
        }
        HeartRateAwakeAverageActivity.G3(heartRateAwakeAverageActivity, arrayList);
        return nm0.y.f85009a;
    }
}
