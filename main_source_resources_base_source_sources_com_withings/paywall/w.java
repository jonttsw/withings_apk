package com.withings.paywall;

import androidx.camera.core.y1;
/* compiled from: PurchaseState.kt */
/* loaded from: classes4.dex */
public interface w {

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class a implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final a f43706a = new a();

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
            return 716082917;
        }

        public final String toString() {
            return "AlreadySubscribed";
        }
    }

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class b implements w {

        /* renamed from: a  reason: collision with root package name */
        private final String f43707a;

        public b(String str) {
            this.f43707a = str;
        }

        public final String a() {
            return this.f43707a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f43707a, ((b) obj).f43707a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43707a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Other(detail="), this.f43707a, ")");
        }
    }

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class c implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final c f43708a = new c();

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
            return -248226954;
        }

        public final String toString() {
            return "PaymentFailed";
        }
    }

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class d implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final d f43709a = new d();

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
            return 1338293016;
        }

        public final String toString() {
            return "ProductNotAvailable";
        }
    }
}
