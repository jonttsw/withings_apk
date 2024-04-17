package com.withings.fever.ui.inputLogs;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemperatureItemInputLogsExtension.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/fever/ui/inputLogs/LogsCategoryColor;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LogsCategoryColor {

    /* renamed from: d  reason: collision with root package name */
    public static final LogsCategoryColor f39301d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ LogsCategoryColor[] f39302e;

    /* renamed from: a  reason: collision with root package name */
    private final int f39303a = C1987R.color.categorySymptomsIcon;

    /* renamed from: b  reason: collision with root package name */
    private final int f39304b = C1987R.color.categorySymptomsBackgroundCard;

    /* renamed from: c  reason: collision with root package name */
    private final int f39305c = C1987R.color.categorySymptomsBackgroundCardPressed;

    static {
        LogsCategoryColor logsCategoryColor = new LogsCategoryColor("SymptomCategory", 0);
        f39301d = logsCategoryColor;
        LogsCategoryColor[] logsCategoryColorArr = {logsCategoryColor, new LogsCategoryColor("MedicationCategory", 1)};
        f39302e = logsCategoryColorArr;
        b.a(logsCategoryColorArr);
    }

    private LogsCategoryColor(String str, int i11) {
    }

    public static LogsCategoryColor valueOf(String str) {
        return (LogsCategoryColor) Enum.valueOf(LogsCategoryColor.class, str);
    }

    public static LogsCategoryColor[] values() {
        return (LogsCategoryColor[]) f39302e.clone();
    }

    public final int a() {
        return this.f39304b;
    }

    public final int b() {
        return this.f39305c;
    }

    public final int d() {
        return this.f39303a;
    }
}
