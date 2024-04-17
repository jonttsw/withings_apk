package com.withings.paywall.subscription;

import com.withings.paywall.b0;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: SubscriptionState.kt */
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: SubscriptionState.kt */
    /* loaded from: classes4.dex */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f43685a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return true;
        }

        public final int hashCode() {
            return -1138104765;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SubscriptionState.kt */
    /* loaded from: classes4.dex */
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43686a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return true;
        }

        public final int hashCode() {
            return -981347657;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: SubscriptionState.kt */
    /* loaded from: classes4.dex */
    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final List<b0> f43687a;

        /* renamed from: b  reason: collision with root package name */
        private final String f43688b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends b0> list, String selectedPlan) {
            u.j(selectedPlan, "selectedPlan");
            this.f43687a = list;
            this.f43688b = selectedPlan;
        }

        public static c a(c cVar, String selectedPlan) {
            List<b0> subscriptionPlans = cVar.f43687a;
            u.j(subscriptionPlans, "subscriptionPlans");
            u.j(selectedPlan, "selectedPlan");
            return new c(subscriptionPlans, selectedPlan);
        }

        public final String b() {
            return this.f43688b;
        }

        public final List<b0> c() {
            return this.f43687a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (u.e(this.f43687a, cVar.f43687a) && u.e(this.f43688b, cVar.f43688b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43688b.hashCode() + (this.f43687a.hashCode() * 31);
        }

        public final String toString() {
            return "Ready(subscriptionPlans=" + this.f43687a + ", selectedPlan=" + this.f43688b + ")";
        }
    }
}
