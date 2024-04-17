package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SleepAverageHRSectionView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepAverageHRStatus;", "", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepAverageHRStatus {

    /* renamed from: d  reason: collision with root package name */
    public static final a f60613d;

    /* renamed from: e  reason: collision with root package name */
    public static final SleepAverageHRStatus f60614e;

    /* renamed from: f  reason: collision with root package name */
    public static final SleepAverageHRStatus f60615f;

    /* renamed from: g  reason: collision with root package name */
    public static final SleepAverageHRStatus f60616g;

    /* renamed from: h  reason: collision with root package name */
    public static final SleepAverageHRStatus f60617h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ SleepAverageHRStatus[] f60618i;

    /* renamed from: a  reason: collision with root package name */
    private final int f60619a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60620b;

    /* renamed from: c  reason: collision with root package name */
    private final int f60621c;

    /* compiled from: SleepAverageHRSectionView.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static SleepAverageHRStatus a(int i11) {
            SleepAverageHRStatus sleepAverageHRStatus = SleepAverageHRStatus.f60614e;
            if (i11 <= sleepAverageHRStatus.d()) {
                SleepAverageHRStatus sleepAverageHRStatus2 = SleepAverageHRStatus.f60615f;
                if (i11 < sleepAverageHRStatus2.d() || i11 > sleepAverageHRStatus2.b()) {
                    SleepAverageHRStatus sleepAverageHRStatus3 = SleepAverageHRStatus.f60616g;
                    if (i11 < sleepAverageHRStatus3.d() || i11 > sleepAverageHRStatus3.b()) {
                        return SleepAverageHRStatus.f60617h;
                    }
                    return sleepAverageHRStatus3;
                }
                return sleepAverageHRStatus2;
            }
            return sleepAverageHRStatus;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.withings.wiscale2.sleep.ui.sleepscore.SleepAverageHRStatus$a] */
    static {
        SleepAverageHRStatus sleepAverageHRStatus = new SleepAverageHRStatus("NonOptimal", 0, 80, Integer.MAX_VALUE, C1987R.color.statusModerate);
        f60614e = sleepAverageHRStatus;
        SleepAverageHRStatus sleepAverageHRStatus2 = new SleepAverageHRStatus("Normal", 1, 55, 80, C1987R.color.statusGood);
        f60615f = sleepAverageHRStatus2;
        SleepAverageHRStatus sleepAverageHRStatus3 = new SleepAverageHRStatus("Optimal", 2, 10, 55, C1987R.color.statusGood);
        f60616g = sleepAverageHRStatus3;
        SleepAverageHRStatus sleepAverageHRStatus4 = new SleepAverageHRStatus("Error", 3, Integer.MIN_VALUE, 10, C1987R.color.statusUndefined);
        f60617h = sleepAverageHRStatus4;
        SleepAverageHRStatus[] sleepAverageHRStatusArr = {sleepAverageHRStatus, sleepAverageHRStatus2, sleepAverageHRStatus3, sleepAverageHRStatus4};
        f60618i = sleepAverageHRStatusArr;
        sm0.b.a(sleepAverageHRStatusArr);
        f60613d = new Object();
    }

    private SleepAverageHRStatus(String str, int i11, int i12, int i13, int i14) {
        this.f60619a = i12;
        this.f60620b = i13;
        this.f60621c = i14;
    }

    public static SleepAverageHRStatus valueOf(String str) {
        return (SleepAverageHRStatus) Enum.valueOf(SleepAverageHRStatus.class, str);
    }

    public static SleepAverageHRStatus[] values() {
        return (SleepAverageHRStatus[]) f60618i.clone();
    }

    public final int a() {
        return this.f60621c;
    }

    public final int b() {
        return this.f60620b;
    }

    public final int d() {
        return this.f60619a;
    }
}
