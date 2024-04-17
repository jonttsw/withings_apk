package com.withings.periodsbar;

import android.content.Context;
import com.withings.favorite.model.FavoriteCategoryKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Period.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/periodsbar/Period;", "", "a", "periods-bar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Period {

    /* renamed from: c  reason: collision with root package name */
    public static final a f43718c;

    /* renamed from: d  reason: collision with root package name */
    public static final Period f43719d;

    /* renamed from: e  reason: collision with root package name */
    public static final Period f43720e;

    /* renamed from: f  reason: collision with root package name */
    public static final Period f43721f;

    /* renamed from: g  reason: collision with root package name */
    public static final Period f43722g;

    /* renamed from: h  reason: collision with root package name */
    public static final Period f43723h;

    /* renamed from: i  reason: collision with root package name */
    public static final Period f43724i;

    /* renamed from: j  reason: collision with root package name */
    public static final Period f43725j;

    /* renamed from: k  reason: collision with root package name */
    public static final Period f43726k;

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ Period[] f43727l;

    /* renamed from: a  reason: collision with root package name */
    private final String f43728a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f43729b;

    /* compiled from: Period.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Period a(String str) {
            switch (str.hashCode()) {
                case 96673:
                    if (str.equals(ConstantsWs.SYNC_PROCESS_ALL)) {
                        return Period.f43726k;
                    }
                    break;
                case 99228:
                    if (str.equals(FoodDayFragment.ARG_DAY)) {
                        return Period.f43721f;
                    }
                    break;
                case 3645428:
                    if (str.equals("week")) {
                        return Period.f43722g;
                    }
                    break;
                case 3704893:
                    if (str.equals("year")) {
                        return Period.f43725j;
                    }
                    break;
                case 104080000:
                    if (str.equals("month")) {
                        return Period.f43723h;
                    }
                    break;
                case 651403948:
                    if (str.equals("quarter")) {
                        return Period.f43724i;
                    }
                    break;
            }
            return Period.f43719d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.withings.periodsbar.Period$a] */
    static {
        Period period = new Period(0, null, "None", null);
        f43719d = period;
        Period period2 = new Period(1, Integer.valueOf((int) C1987R.string._MEASURE_), "Measurement", ConstantsWs.WELLNESS_TASK_TYPE_MEASUREMENT);
        f43720e = period2;
        Period period3 = new Period(2, Integer.valueOf((int) C1987R.string._DAY_), "Day", FoodDayFragment.ARG_DAY);
        f43721f = period3;
        Period period4 = new Period(3, Integer.valueOf((int) C1987R.string._WEEK_), "Week", "week");
        f43722g = period4;
        Period period5 = new Period(4, Integer.valueOf((int) C1987R.string._MONTH_), "Month", "month");
        f43723h = period5;
        Period period6 = new Period(5, Integer.valueOf((int) C1987R.string._QUARTER_), "Quarter", "quarter");
        f43724i = period6;
        Period period7 = new Period(6, Integer.valueOf((int) C1987R.string._YEAR_), "Year", "year");
        f43725j = period7;
        Period period8 = new Period(7, Integer.valueOf((int) C1987R.string._ALL_), FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, ConstantsWs.SYNC_PROCESS_ALL);
        f43726k = period8;
        Period[] periodArr = {period, period2, period3, period4, period5, period6, period7, period8};
        f43727l = periodArr;
        b.a(periodArr);
        f43718c = new Object();
    }

    private Period(int i11, Integer num, String str, String str2) {
        this.f43728a = str2;
        this.f43729b = num;
    }

    public static Period valueOf(String str) {
        return (Period) Enum.valueOf(Period.class, str);
    }

    public static Period[] values() {
        return (Period[]) f43727l.clone();
    }

    public final String a(Context context, DateTime dateTime) {
        u.j(context, "context");
        u.j(dateTime, "dateTime");
        switch (ordinal()) {
            case 0:
                return b50.b.h(context, dateTime);
            case 1:
                return b50.b.m(dateTime, context, false, 6);
            case 2:
                return b50.b.i(context, dateTime);
            case 3:
                return b50.b.p(context, dateTime);
            case 4:
                return b50.b.n(context, dateTime);
            case 5:
                return b50.b.o(context, dateTime);
            case 6:
                return b50.b.q(context, dateTime);
            case 7:
                String string = context.getString(C1987R.string._ALL_);
                u.i(string, "getString(...)");
                return string;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String b() {
        return this.f43728a;
    }

    public final Integer d() {
        return this.f43729b;
    }
}
