package com.withings.programs.model;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProgressUnit.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withings/programs/model/ProgressUnit;", "", "stringRes", "", "(Ljava/lang/String;II)V", "getStringRes", "()I", "Day", "Week", "Month", "Year", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressUnit {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProgressUnit[] $VALUES;
    private final int stringRes;
    public static final ProgressUnit Day = new ProgressUnit("Day", 0, C1987R.string._DAY_);
    public static final ProgressUnit Week = new ProgressUnit("Week", 1, C1987R.string._WEEK_);
    public static final ProgressUnit Month = new ProgressUnit("Month", 2, C1987R.string._MONTH_);
    public static final ProgressUnit Year = new ProgressUnit("Year", 3, C1987R.string._YEAR_);

    private static final /* synthetic */ ProgressUnit[] $values() {
        return new ProgressUnit[]{Day, Week, Month, Year};
    }

    static {
        ProgressUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ProgressUnit(String str, int i11, int i12) {
        this.stringRes = i12;
    }

    public static a<ProgressUnit> getEntries() {
        return $ENTRIES;
    }

    public static ProgressUnit valueOf(String str) {
        return (ProgressUnit) Enum.valueOf(ProgressUnit.class, str);
    }

    public static ProgressUnit[] values() {
        return (ProgressUnit[]) $VALUES.clone();
    }

    public final int getStringRes() {
        return this.stringRes;
    }
}
