package com.withings.bloodpressure.core;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BloodPressureCategory.kt */
/* loaded from: classes3.dex */
public abstract class BloodPressureCategory {

    /* renamed from: c  reason: collision with root package name */
    private static final BloodPressureCategory[] f32881c = {s.f32909f, n.f32904f, o.f32905f, p.f32906f, q.f32907f, r.f32908f};

    /* renamed from: d  reason: collision with root package name */
    private static final BloodPressureCategory[] f32882d = {k.f32898f, j.f32897f, c.f32890f, e.f32892f, d.f32891f, g.f32894f, f.f32893f, i.f32896f, h.f32895f};

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f32883e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final b f32884a;

    /* renamed from: b  reason: collision with root package name */
    private final Status f32885b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BloodPressureCategory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/bloodpressure/core/BloodPressureCategory$Status;", "", "core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Status {

        /* renamed from: a  reason: collision with root package name */
        public static final Status f32886a;

        /* renamed from: b  reason: collision with root package name */
        public static final Status f32887b;

        /* renamed from: c  reason: collision with root package name */
        public static final Status f32888c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Status[] f32889d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.bloodpressure.core.BloodPressureCategory$Status] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.bloodpressure.core.BloodPressureCategory$Status] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.bloodpressure.core.BloodPressureCategory$Status] */
        static {
            ?? r02 = new Enum("GOOD", 0);
            f32886a = r02;
            ?? r12 = new Enum("MEDIUM", 1);
            f32887b = r12;
            ?? r22 = new Enum("BAD", 2);
            f32888c = r22;
            Status[] statusArr = {r02, r12, r22};
            f32889d = statusArr;
            sm0.b.a(statusArr);
        }

        private Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f32889d.clone();
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static BloodPressureCategory a(String country, double d11, double d12) {
            BloodPressureCategory bloodPressureCategory;
            u.j(country, "country");
            BloodPressureCategory[] b10 = b(country);
            int length = b10.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    bloodPressureCategory = b10[i11];
                    if (bloodPressureCategory.c().a(d11, d12)) {
                        break;
                    }
                    i11++;
                } else {
                    bloodPressureCategory = null;
                    break;
                }
            }
            if (bloodPressureCategory != null) {
                return bloodPressureCategory;
            }
            throw new IllegalArgumentException(String.format("There is no category for country %s with systole %d and diastole %d", Arrays.copyOf(new Object[]{country, Integer.valueOf((int) d11), Integer.valueOf((int) d12)}, 3)));
        }

        public static BloodPressureCategory[] b(String str) {
            u.j(str, "<this>");
            return (dp0.j.x(Locale.US.getCountry(), str) || dp0.j.x(Locale.CANADA.getCountry(), str)) ? BloodPressureCategory.f32881c : BloodPressureCategory.f32882d;
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public interface b {
        boolean a(double d11, double d12);
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class c extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final c f32890f = new c();

        private c() {
            super(new l(139.0d, 89.0d), Status.f32887b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public final int hashCode() {
            return 591237522;
        }

        public final String toString() {
            return "EU_ELEVATED";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class d extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final d f32891f = new d();

        private d() {
            super(new l(159.0d, 99.0d), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return true;
        }

        public final int hashCode() {
            return 2033895389;
        }

        public final String toString() {
            return "EU_HIGH_STAGE1_HYPERTENSION";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class e extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final e f32892f = new e();

        private e() {
            super(new m(140.0d, 159.0d, 89.0d, false, 20), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return true;
        }

        public final int hashCode() {
            return -508114227;
        }

        public final String toString() {
            return "EU_HIGH_STAGE1_ISOLATED_SYSTOLIC";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class f extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final f f32893f = new f();

        private f() {
            super(new l(179.0d, 109.0d), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return true;
        }

        public final int hashCode() {
            return 1563520745;
        }

        public final String toString() {
            return "EU_HIGH_STAGE2_2_HYPERTENSION";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class g extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final g f32894f = new g();

        private g() {
            super(new m(160.0d, 179.0d, 89.0d, false, 20), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return true;
        }

        public final int hashCode() {
            return -1352586098;
        }

        public final String toString() {
            return "EU_HIGH_STAGE2_ISOLATED_SYSTOLIC";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class h extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final h f32895f = new h();

        private h() {
            super(new l(1000.0d, 1000.0d), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return true;
        }

        public final int hashCode() {
            return 1022778139;
        }

        public final String toString() {
            return "EU_HIGH_STAGE3_HYPERTENSION";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class i extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final i f32896f = new i();

        private i() {
            super(new m(180.0d, 1000.0d, 89.0d, false, 20), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return true;
        }

        public final int hashCode() {
            return 2097909327;
        }

        public final String toString() {
            return "EU_HIGH_STAGE3_ISOLATED_SYSTOLIC";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class j extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final j f32897f = new j();

        private j() {
            super(new l(129.0d, 84.0d), Status.f32886a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return true;
        }

        public final int hashCode() {
            return 1718408399;
        }

        public final String toString() {
            return "EU_NORMAL";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class k extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final k f32898f = new k();

        private k() {
            super(new l(119.0d, 79.0d), Status.f32886a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return true;
        }

        public final int hashCode() {
            return -1646042502;
        }

        public final String toString() {
            return "EU_OPTIMAL";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static class l extends m {
        public l(double d11, double d12) {
            super(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d11, d12, true, 5);
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static class m implements b {

        /* renamed from: a  reason: collision with root package name */
        private final double f32899a;

        /* renamed from: b  reason: collision with root package name */
        private final double f32900b;

        /* renamed from: c  reason: collision with root package name */
        private final double f32901c;

        /* renamed from: d  reason: collision with root package name */
        private final double f32902d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f32903e;

        public m(double d11, double d12, double d13, boolean z5, int i11) {
            d11 = (i11 & 1) != 0 ? 0.0d : d11;
            z5 = (i11 & 16) != 0 ? true : z5;
            this.f32899a = d11;
            this.f32900b = d12;
            this.f32901c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.f32902d = d13;
            this.f32903e = z5;
        }

        @Override // com.withings.bloodpressure.core.BloodPressureCategory.b
        public final boolean a(double d11, double d12) {
            if (this.f32899a <= an0.a.a(d11) && an0.a.a(d11) <= this.f32900b) {
                if (this.f32901c <= an0.a.a(d12)) {
                    boolean z5 = this.f32903e;
                    double d13 = this.f32902d;
                    if ((z5 && an0.a.a(d12) <= d13) || an0.a.a(d12) < d13) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final double b() {
            return this.f32902d;
        }

        public final double c() {
            return this.f32900b;
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class n extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final n f32904f = new n();

        private n() {
            super(new m(120.0d, 129.0d, 80.0d, false, 4), Status.f32886a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return true;
        }

        public final int hashCode() {
            return -1997153436;
        }

        public final String toString() {
            return "US_ELEVATED";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class o extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final o f32905f = new o();

        private o() {
            super(new l(129.0d, 84.0d), Status.f32887b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return true;
        }

        public final int hashCode() {
            return -926345130;
        }

        public final String toString() {
            return "US_HIGH_STAGE1";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class p extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final p f32906f = new p();

        private p() {
            super(new l(139.0d, 89.0d), Status.f32887b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return true;
        }

        public final int hashCode() {
            return 177810863;
        }

        public final String toString() {
            return "US_HIGH_STAGE1_HYPERTENSION";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class q extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final q f32907f = new q();

        private q() {
            super(new l(179.0d, 119.0d), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return true;
        }

        public final int hashCode() {
            return -327747762;
        }

        public final String toString() {
            return "US_HIGH_STAGE2_HYPERTENSION";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class r extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final r f32908f = new r();

        private r() {
            super(new l(1000.0d, 1000.0d), Status.f32888c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return true;
        }

        public final int hashCode() {
            return -1317072910;
        }

        public final String toString() {
            return "US_HYPERTENSIVE_CRISIS";
        }
    }

    /* compiled from: BloodPressureCategory.kt */
    /* loaded from: classes3.dex */
    public static final class s extends BloodPressureCategory {

        /* renamed from: f  reason: collision with root package name */
        public static final s f32909f = new s();

        private s() {
            super(new l(119.0d, 79.0d), Status.f32886a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return true;
        }

        public final int hashCode() {
            return -621712607;
        }

        public final String toString() {
            return "US_NORMAL";
        }
    }

    public BloodPressureCategory(m mVar, Status status) {
        this.f32884a = mVar;
        this.f32885b = status;
    }

    public final b c() {
        return this.f32884a;
    }

    public final Status d() {
        return this.f32885b;
    }
}
