package com.withings.paywall;
/* compiled from: FetchSubscriptionResult.kt */
/* loaded from: classes4.dex */
public interface e {

    /* compiled from: FetchSubscriptionResult.kt */
    /* loaded from: classes4.dex */
    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f43607a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f43607a, ((a) obj).f43607a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f43607a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public final String toString() {
            return "Failure(exception=" + this.f43607a + ")";
        }

        public a(int i11) {
            this.f43607a = null;
        }
    }

    /* compiled from: FetchSubscriptionResult.kt */
    /* loaded from: classes4.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43608a = new b();

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
            return -1462039977;
        }

        public final String toString() {
            return "Pending";
        }
    }

    /* compiled from: FetchSubscriptionResult.kt */
    /* loaded from: classes4.dex */
    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final com.android.billingclient.api.g f43609a;

        public c(com.android.billingclient.api.g productDetails) {
            kotlin.jvm.internal.u.j(productDetails, "productDetails");
            this.f43609a = productDetails;
        }

        public final com.android.billingclient.api.g a() {
            return this.f43609a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f43609a, ((c) obj).f43609a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43609a.hashCode();
        }

        public final String toString() {
            return "Success(productDetails=" + this.f43609a + ")";
        }
    }
}
