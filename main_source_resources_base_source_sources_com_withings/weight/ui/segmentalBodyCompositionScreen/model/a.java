package com.withings.weight.ui.segmentalBodyCompositionScreen.model;

import a90.b;
import androidx.camera.camera2.internal.e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: PopulationRepartition.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C0658a f47791a;

    /* renamed from: b  reason: collision with root package name */
    private final C0658a f47792b;

    /* renamed from: c  reason: collision with root package name */
    private final C0658a f47793c;

    /* renamed from: d  reason: collision with root package name */
    private final C0658a f47794d;

    /* renamed from: e  reason: collision with root package name */
    private final C0658a f47795e;

    /* compiled from: PopulationRepartition.kt */
    /* renamed from: com.withings.weight.ui.segmentalBodyCompositionScreen.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0658a {

        /* renamed from: a  reason: collision with root package name */
        private final b f47796a;

        /* renamed from: b  reason: collision with root package name */
        private final j<String, String> f47797b;

        /* renamed from: c  reason: collision with root package name */
        private final int f47798c;

        public C0658a(b boundaries, j<String, String> jVar, int i11) {
            u.j(boundaries, "boundaries");
            this.f47796a = boundaries;
            this.f47797b = jVar;
            this.f47798c = i11;
        }

        public final b a() {
            return this.f47796a;
        }

        public final j<String, String> b() {
            return this.f47797b;
        }

        public final int c() {
            return this.f47798c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0658a)) {
                return false;
            }
            C0658a c0658a = (C0658a) obj;
            if (u.e(this.f47796a, c0658a.f47796a) && u.e(this.f47797b, c0658a.f47797b) && this.f47798c == c0658a.f47798c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f47797b.hashCode();
            return Integer.hashCode(this.f47798c) + ((hashCode + (this.f47796a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Range(boundaries=");
            sb2.append(this.f47796a);
            sb2.append(", formattedBoundaries=");
            sb2.append(this.f47797b);
            sb2.append(", percentageOfPopulation=");
            return e.c(sb2, this.f47798c, ")");
        }
    }

    public a(C0658a c0658a, C0658a c0658a2, C0658a c0658a3, C0658a c0658a4, C0658a c0658a5) {
        this.f47791a = c0658a;
        this.f47792b = c0658a2;
        this.f47793c = c0658a3;
        this.f47794d = c0658a4;
        this.f47795e = c0658a5;
    }

    public final C0658a a() {
        return this.f47794d;
    }

    public final C0658a b() {
        return this.f47795e;
    }

    public final C0658a c() {
        return this.f47792b;
    }

    public final C0658a d() {
        return this.f47791a;
    }

    public final C0658a e() {
        return this.f47793c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (u.e(this.f47791a, aVar.f47791a) && u.e(this.f47792b, aVar.f47792b) && u.e(this.f47793c, aVar.f47793c) && u.e(this.f47794d, aVar.f47794d) && u.e(this.f47795e, aVar.f47795e)) {
            return true;
        }
        return false;
    }

    public final String f(double d11, androidx.compose.runtime.a aVar) {
        aVar.s(-290537574);
        int i11 = (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE > d11 ? 1 : (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == d11 ? 0 : -1));
        int i12 = C1987R.string.segmentalBodyComp_result_lowest_title;
        C0658a c0658a = this.f47791a;
        if ((i11 > 0 || d11 > c0658a.a().c()) && !c0658a.a().a(d11)) {
            if (this.f47792b.a().a(d11)) {
                i12 = C1987R.string.segmentalBodyComp_result_low_title;
            } else if (this.f47793c.a().a(d11)) {
                i12 = C1987R.string.segmentalBodyComp_result_middle_title;
            } else if (this.f47794d.a().a(d11)) {
                i12 = C1987R.string.segmentalBodyComp_result_high_title;
            } else {
                C0658a c0658a2 = this.f47795e;
                if (c0658a2.a().a(d11) || (c0658a2.a().b() <= d11 && d11 <= Double.MAX_VALUE)) {
                    i12 = C1987R.string.segmentalBodyComp_result_highest_title;
                } else {
                    double c11 = c0658a.a().c();
                    double b10 = c0658a2.a().b();
                    throw new IllegalStateException("Body composition value=" + d11 + " is outside ranges boundaries [" + c11 + ", " + b10 + "].");
                }
            }
        }
        String u11 = ay.b.u(i12, aVar);
        aVar.J();
        return u11;
    }

    public final String g(double d11, androidx.compose.runtime.a aVar) {
        aVar.s(-1766655954);
        int i11 = (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE > d11 ? 1 : (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == d11 ? 0 : -1));
        int i12 = C1987R.string.segmentalBodyComp_assessment_lowest;
        C0658a c0658a = this.f47791a;
        if ((i11 > 0 || d11 > c0658a.a().c()) && !c0658a.a().a(d11)) {
            if (this.f47792b.a().a(d11)) {
                i12 = C1987R.string.segmentalBodyComp_assessment_low;
            } else if (this.f47793c.a().a(d11)) {
                i12 = C1987R.string.segmentalBodyComp_assessment_middle;
            } else if (this.f47794d.a().a(d11)) {
                i12 = C1987R.string.segmentalBodyComp_assessment_high;
            } else {
                C0658a c0658a2 = this.f47795e;
                if (c0658a2.a().a(d11) || (c0658a2.a().b() <= d11 && d11 <= Double.MAX_VALUE)) {
                    i12 = C1987R.string.segmentalBodyComp_assessment_highest;
                } else {
                    double c11 = c0658a.a().c();
                    double b10 = c0658a2.a().b();
                    throw new IllegalStateException("Body composition value=" + d11 + " is outside ranges boundaries [" + c11 + ", " + b10 + "].");
                }
            }
        }
        String u11 = ay.b.u(i12, aVar);
        aVar.J();
        return u11;
    }

    public final int hashCode() {
        int hashCode = this.f47792b.hashCode();
        int hashCode2 = this.f47793c.hashCode();
        int hashCode3 = this.f47794d.hashCode();
        return this.f47795e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f47791a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PopulationRepartition(lowestRange=" + this.f47791a + ", lowRange=" + this.f47792b + ", middleRange=" + this.f47793c + ", highRange=" + this.f47794d + ", highestRange=" + this.f47795e + ")";
    }
}
