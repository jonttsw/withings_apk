package com.withings.healthplus.joinprogram.ui.model;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JoinStartDate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/joinprogram/ui/model/JoinStartDate;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class JoinStartDate {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40360d;

    /* renamed from: e  reason: collision with root package name */
    public static final JoinStartDate f40361e;

    /* renamed from: f  reason: collision with root package name */
    public static final JoinStartDate f40362f;

    /* renamed from: g  reason: collision with root package name */
    public static final JoinStartDate f40363g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ JoinStartDate[] f40364h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f40365i;

    /* renamed from: a  reason: collision with root package name */
    private final int f40366a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40367b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40368c;

    /* compiled from: JoinStartDate.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static DateTime a(JoinStartDate joinStartDate, DateTime dateTime) {
            u.j(joinStartDate, "<this>");
            int ordinal = joinStartDate.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (dateTime != null) {
                            return new DateTime(dateTime);
                        }
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return DateTime.now();
            }
            DateTime plusWeeks = DateTime.now().withMillisOfDay(0).withMillisOfSecond(1).plusWeeks(1);
            u.i(plusWeeks, "plusWeeks(...)");
            return hn.a.s(plusWeeks);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.withings.healthplus.joinprogram.ui.model.JoinStartDate$a, java.lang.Object] */
    static {
        JoinStartDate joinStartDate = new JoinStartDate("NextMonday", 0, 0, C1987R.string.program_start_date_selection_option_recommended, "next_monday");
        f40361e = joinStartDate;
        JoinStartDate joinStartDate2 = new JoinStartDate("Today", 1, 1, C1987R.string.program_start_date_selection_option_today, "today");
        f40362f = joinStartDate2;
        JoinStartDate joinStartDate3 = new JoinStartDate("Other", 2, 2, C1987R.string.program_start_date_selection_option_custom, HealthConstants.Common.CUSTOM);
        f40363g = joinStartDate3;
        JoinStartDate[] joinStartDateArr = {joinStartDate, joinStartDate2, joinStartDate3};
        f40364h = joinStartDateArr;
        f40365i = b.a(joinStartDateArr);
        f40360d = new Object();
    }

    private JoinStartDate(String str, int i11, int i12, int i13, String str2) {
        this.f40366a = i12;
        this.f40367b = i13;
        this.f40368c = str2;
    }

    public static sm0.a<JoinStartDate> b() {
        return f40365i;
    }

    public static JoinStartDate valueOf(String str) {
        return (JoinStartDate) Enum.valueOf(JoinStartDate.class, str);
    }

    public static JoinStartDate[] values() {
        return (JoinStartDate[]) f40364h.clone();
    }

    public final String a() {
        return this.f40368c;
    }

    public final int d() {
        return this.f40366a;
    }

    public final int e() {
        return this.f40367b;
    }
}
