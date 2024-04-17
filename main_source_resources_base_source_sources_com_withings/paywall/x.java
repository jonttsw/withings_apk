package com.withings.paywall;

import androidx.camera.core.y1;
/* compiled from: PurchaseState.kt */
/* loaded from: classes4.dex */
public interface x {

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        private final w f43710a;

        public a(w error) {
            kotlin.jvm.internal.u.j(error, "error");
            this.f43710a = error;
        }

        public final w a() {
            return this.f43710a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f43710a, ((a) obj).f43710a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43710a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.f43710a + ")";
        }
    }

    /* compiled from: PurchaseState.kt */
    /* loaded from: classes4.dex */
    public static final class b implements x {

        /* renamed from: a  reason: collision with root package name */
        private final String f43711a;

        public b(String str) {
            this.f43711a = str;
        }

        public final String a() {
            return this.f43711a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f43711a, ((b) obj).f43711a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43711a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Success(token="), this.f43711a, ")");
        }
    }
}
