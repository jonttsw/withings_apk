package com.withings.paywall;

import androidx.camera.camera2.internal.l0;
import java.util.List;
/* compiled from: SubscriptionPlan.kt */
/* loaded from: classes4.dex */
public interface b0 {

    /* compiled from: SubscriptionPlan.kt */
    /* loaded from: classes4.dex */
    public static final class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f43591a;

        /* renamed from: b  reason: collision with root package name */
        private final String f43592b;

        /* renamed from: c  reason: collision with root package name */
        private final double f43593c;

        /* renamed from: d  reason: collision with root package name */
        private final double f43594d;

        /* renamed from: e  reason: collision with root package name */
        private final List<a0> f43595e;

        /* renamed from: f  reason: collision with root package name */
        private final Double f43596f;

        public a(String str, String str2, double d11, double d12, List<a0> list, Double d13) {
            this.f43591a = str;
            this.f43592b = str2;
            this.f43593c = d11;
            this.f43594d = d12;
            this.f43595e = list;
            this.f43596f = d13;
        }

        public static a e(a aVar, Double d11) {
            String id2 = aVar.f43591a;
            kotlin.jvm.internal.u.j(id2, "id");
            String currencySymbol = aVar.f43592b;
            kotlin.jvm.internal.u.j(currencySymbol, "currencySymbol");
            List<a0> additionalOffers = aVar.f43595e;
            kotlin.jvm.internal.u.j(additionalOffers, "additionalOffers");
            return new a(id2, currencySymbol, aVar.f43593c, aVar.f43594d, additionalOffers, d11);
        }

        @Override // com.withings.paywall.b0
        public final String a() {
            return this.f43592b;
        }

        @Override // com.withings.paywall.b0
        public final double b() {
            return this.f43593c;
        }

        @Override // com.withings.paywall.b0
        public final List<a0> c() {
            return this.f43595e;
        }

        @Override // com.withings.paywall.b0
        public final double d() {
            return this.f43594d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f43591a, aVar.f43591a) && kotlin.jvm.internal.u.e(this.f43592b, aVar.f43592b) && Double.compare(this.f43593c, aVar.f43593c) == 0 && Double.compare(this.f43594d, aVar.f43594d) == 0 && kotlin.jvm.internal.u.e(this.f43595e, aVar.f43595e) && kotlin.jvm.internal.u.e(this.f43596f, aVar.f43596f)) {
                return true;
            }
            return false;
        }

        public final Double f() {
            return this.f43596f;
        }

        @Override // com.withings.paywall.b0
        public final String getId() {
            return this.f43591a;
        }

        public final int hashCode() {
            int hashCode;
            int b10 = defpackage.e.b(this.f43595e, l0.a(this.f43594d, l0.a(this.f43593c, defpackage.d.c(this.f43592b, this.f43591a.hashCode() * 31, 31), 31), 31), 31);
            Double d11 = this.f43596f;
            if (d11 == null) {
                hashCode = 0;
            } else {
                hashCode = d11.hashCode();
            }
            return b10 + hashCode;
        }

        public final String toString() {
            return "Annual(id=" + this.f43591a + ", currencySymbol=" + this.f43592b + ", monthlyPrice=" + this.f43593c + ", annualPrice=" + this.f43594d + ", additionalOffers=" + this.f43595e + ", savedMoney=" + this.f43596f + ")";
        }
    }

    /* compiled from: SubscriptionPlan.kt */
    /* loaded from: classes4.dex */
    public static final class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f43597a;

        /* renamed from: b  reason: collision with root package name */
        private final String f43598b;

        /* renamed from: c  reason: collision with root package name */
        private final double f43599c;

        /* renamed from: d  reason: collision with root package name */
        private final double f43600d;

        /* renamed from: e  reason: collision with root package name */
        private final List<a0> f43601e;

        public b(String str, String str2, double d11, double d12, List<a0> list) {
            this.f43597a = str;
            this.f43598b = str2;
            this.f43599c = d11;
            this.f43600d = d12;
            this.f43601e = list;
        }

        @Override // com.withings.paywall.b0
        public final String a() {
            return this.f43598b;
        }

        @Override // com.withings.paywall.b0
        public final double b() {
            return this.f43599c;
        }

        @Override // com.withings.paywall.b0
        public final List<a0> c() {
            return this.f43601e;
        }

        @Override // com.withings.paywall.b0
        public final double d() {
            return this.f43600d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f43597a, bVar.f43597a) && kotlin.jvm.internal.u.e(this.f43598b, bVar.f43598b) && Double.compare(this.f43599c, bVar.f43599c) == 0 && Double.compare(this.f43600d, bVar.f43600d) == 0 && kotlin.jvm.internal.u.e(this.f43601e, bVar.f43601e)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.paywall.b0
        public final String getId() {
            return this.f43597a;
        }

        public final int hashCode() {
            return this.f43601e.hashCode() + l0.a(this.f43600d, l0.a(this.f43599c, defpackage.d.c(this.f43598b, this.f43597a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Monthly(id=");
            sb2.append(this.f43597a);
            sb2.append(", currencySymbol=");
            sb2.append(this.f43598b);
            sb2.append(", monthlyPrice=");
            sb2.append(this.f43599c);
            sb2.append(", annualPrice=");
            sb2.append(this.f43600d);
            sb2.append(", additionalOffers=");
            return defpackage.d.i(sb2, this.f43601e, ")");
        }
    }

    String a();

    double b();

    List<a0> c();

    double d();

    String getId();
}
