package com.withings.manualLogging.ui.uikit.atoms;

import ah.o;
import androidx.compose.material.v;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.protobuf.t;
import com.withings.features.FeatureFlag;
import com.withings.manualLogging.ui.common.LogType;
import com.withings.wiscale2.C1987R;
import d2.g0;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.r;
import n0.z;
import nm0.y;
import r0.a0;
import s2.d;
import ym0.p;
import ym0.q;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ManualLogCategory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/uikit/atoms/ManualLogCategory;", "", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ManualLogCategory {

    /* renamed from: f  reason: collision with root package name */
    public static final ManualLogCategory f41638f;

    /* renamed from: g  reason: collision with root package name */
    public static final ManualLogCategory f41639g;

    /* renamed from: h  reason: collision with root package name */
    public static final ManualLogCategory f41640h;

    /* renamed from: i  reason: collision with root package name */
    public static final ManualLogCategory f41641i;

    /* renamed from: j  reason: collision with root package name */
    public static final ManualLogCategory f41642j;

    /* renamed from: k  reason: collision with root package name */
    public static final ManualLogCategory f41643k;

    /* renamed from: l  reason: collision with root package name */
    public static final ManualLogCategory f41644l;

    /* renamed from: m  reason: collision with root package name */
    public static final ManualLogCategory f41645m;

    /* renamed from: n  reason: collision with root package name */
    public static final ManualLogCategory f41646n;

    /* renamed from: o  reason: collision with root package name */
    public static final ManualLogCategory f41647o;

    /* renamed from: p  reason: collision with root package name */
    public static final ManualLogCategory f41648p;

    /* renamed from: q  reason: collision with root package name */
    public static final ManualLogCategory f41649q;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ ManualLogCategory[] f41650r;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f41651s;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f41652a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41653b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41654c;

    /* renamed from: d  reason: collision with root package name */
    private final LogType f41655d;

    /* renamed from: e  reason: collision with root package name */
    private final FeatureFlag f41656e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManualLogCategory.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f41658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5) {
            super(3);
            this.f41658b = z5;
        }

        @Override // ym0.q
        public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            String u11;
            a0 LabelValueCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(LabelValueCell, "$this$LabelValueCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                boolean z5 = this.f41658b;
                ManualLogCategory manualLogCategory = ManualLogCategory.this;
                g2.c a11 = d.a(ManualLogCategory.a(manualLogCategory, z5), aVar2);
                Integer f11 = manualLogCategory.f();
                aVar2.s(-1629075763);
                if (f11 == null) {
                    u11 = null;
                } else {
                    u11 = ay.b.u(f11.intValue(), aVar2);
                }
                aVar2.J();
                if (u11 == null) {
                    u11 = manualLogCategory.e();
                }
                z.a(a11, androidx.activity.a0.b("Click to add ", u11), null, null, null, 0.0f, g0.a.a(5, ((i1) aVar2.D(j1.e())).J()), aVar2, 8, 60);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManualLogCategory.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements q<r0.c, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(3);
            this.f41660b = str;
        }

        @Override // ym0.q
        public final y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            String str;
            r0.c LabelValueCell = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(LabelValueCell, "$this$LabelValueCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(-483455358);
                e.a aVar3 = e.f8927a;
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
                String str2 = null;
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    ManualLogCategory manualLogCategory = ManualLogCategory.this;
                    Integer f11 = manualLogCategory.f();
                    aVar2.s(1355949114);
                    if (f11 != null) {
                        str2 = ay.b.u(f11.intValue(), aVar2);
                    }
                    aVar2.J();
                    if (str2 == null) {
                        str = manualLogCategory.e();
                    } else {
                        str = str2;
                    }
                    nk.a0.i(0, 0, 29, 0L, aVar2, null, null, str);
                    aVar2.s(-1629075360);
                    String str3 = this.f41660b;
                    if (str3 != null && str3.length() > 0) {
                        nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, str3);
                    }
                    v.b(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManualLogCategory.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f41662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f41664d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f41665e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f41666f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<y> aVar, String str, boolean z5, int i11, int i12) {
            super(2);
            this.f41662b = aVar;
            this.f41663c = str;
            this.f41664d = z5;
            this.f41665e = i11;
            this.f41666f = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f41665e | 1);
            String str = this.f41663c;
            boolean z5 = this.f41664d;
            ManualLogCategory.this.i(this.f41662b, str, z5, aVar, g11, this.f41666f);
            return y.f85009a;
        }
    }

    static {
        ManualLogCategory manualLogCategory = new ManualLogCategory("Activity", 0, Integer.valueOf((int) C1987R.string._ACTIVITY_), C1987R.drawable.ic_activity_walk, null, null, 26);
        f41638f = manualLogCategory;
        ManualLogCategory manualLogCategory2 = new ManualLogCategory("BloodPressure", 1, Integer.valueOf((int) C1987R.string._BLOOD_PRESSURE_), C1987R.drawable.ic_stock_pressure2, null, null, 26);
        f41639g = manualLogCategory2;
        ManualLogCategory manualLogCategory3 = new ManualLogCategory("BodyTemperature", 2, Integer.valueOf((int) C1987R.string._BODY_TEMPERATURE_), C1987R.drawable.icon_medium_feature_temperature, null, null, 26);
        f41640h = manualLogCategory3;
        ManualLogCategory manualLogCategory4 = new ManualLogCategory("HeartRate", 3, Integer.valueOf((int) C1987R.string._HEART_RATE_), C1987R.drawable.icon_medium_anatomical_ecg, null, null, 26);
        f41641i = manualLogCategory4;
        Integer valueOf = Integer.valueOf((int) C1987R.string._TM_MEDICINE_);
        LogType logType = LogType.f40693a;
        FeatureFlag featureFlag = FeatureFlag.f39130s0;
        ManualLogCategory manualLogCategory5 = new ManualLogCategory("Medicine", 4, valueOf, C1987R.drawable.ic_medicine, logType, featureFlag, 2);
        f41642j = manualLogCategory5;
        ManualLogCategory manualLogCategory6 = new ManualLogCategory("Note", 5, Integer.valueOf((int) C1987R.string._NOTES_), C1987R.drawable.ic_note, logType, featureFlag, 2);
        f41643k = manualLogCategory6;
        ManualLogCategory manualLogCategory7 = new ManualLogCategory("Nutrition", 6, Integer.valueOf((int) C1987R.string._FOOD_), C1987R.drawable.ic_rounded_food2, null, null, 26);
        f41644l = manualLogCategory7;
        ManualLogCategory manualLogCategory8 = new ManualLogCategory("Sleep", 7, Integer.valueOf((int) C1987R.string.manualLog_sleep), C1987R.drawable.ic_sleep, LogType.f40694b, featureFlag, 2);
        f41645m = manualLogCategory8;
        ManualLogCategory manualLogCategory9 = new ManualLogCategory("Symptoms", 8, Integer.valueOf((int) C1987R.string._TM_SYMPTOMS_), C1987R.drawable.ic_symptoms, logType, featureFlag, 2);
        f41646n = manualLogCategory9;
        ManualLogCategory manualLogCategory10 = new ManualLogCategory("Weight", 9, Integer.valueOf((int) C1987R.string._POIDS_), C1987R.drawable.ic_stock_feather, null, null, 26);
        f41647o = manualLogCategory10;
        ManualLogCategory manualLogCategory11 = new ManualLogCategory("Height", 10, Integer.valueOf((int) C1987R.string._TAILLE_), C1987R.drawable.ic_rounded_man3, null, null, 26);
        f41648p = manualLogCategory11;
        ManualLogCategory manualLogCategory12 = new ManualLogCategory("Cycle", 11, Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_period), C1987R.drawable.ic_lotus, null, null, 26);
        f41649q = manualLogCategory12;
        ManualLogCategory[] manualLogCategoryArr = {manualLogCategory, manualLogCategory2, manualLogCategory3, manualLogCategory4, manualLogCategory5, manualLogCategory6, manualLogCategory7, manualLogCategory8, manualLogCategory9, manualLogCategory10, manualLogCategory11, manualLogCategory12};
        f41650r = manualLogCategoryArr;
        f41651s = sm0.b.a(manualLogCategoryArr);
    }

    private ManualLogCategory() {
        throw null;
    }

    ManualLogCategory(String str, int i11, Integer num, int i12, LogType logType, FeatureFlag featureFlag, int i13) {
        logType = (i13 & 8) != 0 ? LogType.f40694b : logType;
        featureFlag = (i13 & 16) != 0 ? null : featureFlag;
        this.f41652a = num;
        this.f41653b = "";
        this.f41654c = i12;
        this.f41655d = logType;
        this.f41656e = featureFlag;
    }

    public static final int a(ManualLogCategory manualLogCategory, boolean z5) {
        manualLogCategory.getClass();
        if (manualLogCategory == f41648p) {
            if (z5) {
                return C1987R.drawable.ic_rounded_man3;
            }
            return C1987R.drawable.ic_rounded_woman3;
        }
        return manualLogCategory.f41654c;
    }

    public static sm0.a<ManualLogCategory> b() {
        return f41651s;
    }

    public static ManualLogCategory valueOf(String str) {
        return (ManualLogCategory) Enum.valueOf(ManualLogCategory.class, str);
    }

    public static ManualLogCategory[] values() {
        return (ManualLogCategory[]) f41650r.clone();
    }

    public final FeatureFlag d() {
        return this.f41656e;
    }

    public final String e() {
        return this.f41653b;
    }

    public final Integer f() {
        return this.f41652a;
    }

    public final LogType h() {
        return this.f41655d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(ym0.a<nm0.y> r26, java.lang.String r27, boolean r28, androidx.compose.runtime.a r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory.i(ym0.a, java.lang.String, boolean, androidx.compose.runtime.a, int, int):void");
    }
}
