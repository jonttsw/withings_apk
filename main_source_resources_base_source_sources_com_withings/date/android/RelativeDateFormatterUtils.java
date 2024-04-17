package com.withings.date.android;

import android.icu.text.RelativeDateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import org.joda.time.DateTime;
import sm0.b;
/* compiled from: RelativeDateFormatterUtils.kt */
/* loaded from: classes3.dex */
public final class RelativeDateFormatterUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RelativeDateFormatterUtils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/date/android/RelativeDateFormatterUtils$RelativeUnitWithOrder;", "", "a", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    private static final class RelativeUnitWithOrder {

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ RelativeUnitWithOrder[] f36097a;

        /* compiled from: RelativeDateFormatterUtils.kt */
        /* loaded from: classes3.dex */
        public static final class a {
        }

        static {
            RelativeUnitWithOrder[] relativeUnitWithOrderArr = {new RelativeUnitWithOrder("Seconds", 0, RelativeDateTimeFormatter.RelativeUnit.SECONDS, 0, 1, 60), new RelativeUnitWithOrder("Minutes", 1, RelativeDateTimeFormatter.RelativeUnit.MINUTES, 1, 60, 60), new RelativeUnitWithOrder("Hours", 2, RelativeDateTimeFormatter.RelativeUnit.HOURS, 2, 60, 24), new RelativeUnitWithOrder("Days", 3, RelativeDateTimeFormatter.RelativeUnit.DAYS, 3, 24, 7), new RelativeUnitWithOrder("Weeks", 4, RelativeDateTimeFormatter.RelativeUnit.WEEKS, 4, 7, -1), new RelativeUnitWithOrder("Months", 5, RelativeDateTimeFormatter.RelativeUnit.MONTHS, 5, -1, 12), new RelativeUnitWithOrder("Years", 6, RelativeDateTimeFormatter.RelativeUnit.YEARS, 6, 12, 1)};
            f36097a = relativeUnitWithOrderArr;
            b.a(relativeUnitWithOrderArr);
        }

        private RelativeUnitWithOrder(String str, int i11, RelativeDateTimeFormatter.RelativeUnit relativeUnit, int i12, int i13, int i14) {
        }

        public static RelativeUnitWithOrder valueOf(String str) {
            return (RelativeUnitWithOrder) Enum.valueOf(RelativeUnitWithOrder.class, str);
        }

        public static RelativeUnitWithOrder[] values() {
            return (RelativeUnitWithOrder[]) f36097a.clone();
        }
    }

    public static String a(double d11, RelativeDateTimeFormatter.RelativeUnit sourceRelativeUnit) {
        u.i(DateTime.now(), "now(...)");
        u.j(sourceRelativeUnit, "sourceRelativeUnit");
        RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance();
        j jVar = new j(Double.valueOf(d11), sourceRelativeUnit);
        String format = relativeDateTimeFormatter.format(((Number) jVar.a()).doubleValue(), RelativeDateTimeFormatter.Direction.NEXT, (RelativeDateTimeFormatter.RelativeUnit) jVar.b());
        u.i(format, "format(...)");
        return format;
    }
}
