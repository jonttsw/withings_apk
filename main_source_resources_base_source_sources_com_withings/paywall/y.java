package com.withings.paywall;
/* compiled from: PurchaseState.kt */
/* loaded from: classes4.dex */
public interface y {

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        private final w f43712a;

        public a(w error) {
            kotlin.jvm.internal.u.j(error, "error");
            this.f43712a = error;
        }

        public final w a() {
            return this.f43712a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f43712a, ((a) obj).f43712a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43712a.hashCode();
        }

        public final String toString() {
            return "Failure(error=" + this.f43712a + ")";
        }
    }

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class b implements y {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43713a = new b();

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
            return 312830616;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class c implements y {

        /* renamed from: a  reason: collision with root package name */
        public static final c f43714a = new c();

        private c() {
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
            return 268370780;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class d implements y {

        /* renamed from: a  reason: collision with root package name */
        public static final d f43715a = new d();

        private d() {
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
            return -1890989729;
        }

        public final String toString() {
            return "Success";
        }
    }
}
