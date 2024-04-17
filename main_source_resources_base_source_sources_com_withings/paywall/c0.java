package com.withings.paywall;

import java.util.ArrayList;
import java.util.List;
/* compiled from: SubscriptionPlanResult.kt */
/* loaded from: classes4.dex */
public interface c0 {

    /* compiled from: SubscriptionPlanResult.kt */
    /* loaded from: classes4.dex */
    public static final class a implements c0 {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f43602a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f43602a, ((a) obj).f43602a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f43602a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public final String toString() {
            return "Failure(exception=" + this.f43602a + ")";
        }

        public a(int i11) {
            this.f43602a = null;
        }
    }

    /* compiled from: SubscriptionPlanResult.kt */
    /* loaded from: classes4.dex */
    public static final class b implements c0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43603a = new b();

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
            return 1282427922;
        }

        public final String toString() {
            return "Pending";
        }
    }

    /* compiled from: SubscriptionPlanResult.kt */
    /* loaded from: classes4.dex */
    public static final class c implements c0 {

        /* renamed from: a  reason: collision with root package name */
        private final List<b0> f43604a;

        public c(ArrayList arrayList) {
            this.f43604a = arrayList;
        }

        public final List<b0> a() {
            return this.f43604a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f43604a, ((c) obj).f43604a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43604a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("Success(subscriptionPlans="), this.f43604a, ")");
        }
    }
}
