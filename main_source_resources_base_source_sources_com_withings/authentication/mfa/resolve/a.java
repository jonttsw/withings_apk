package com.withings.authentication.mfa.resolve;

import java.util.List;
/* compiled from: MfaResolutionViewModel.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: MfaResolutionViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.resolve.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0422a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0422a f31953a = new C0422a();

        private C0422a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0422a)) {
                return false;
            }
            C0422a c0422a = (C0422a) obj;
            return true;
        }

        public final int hashCode() {
            return -62583585;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31954a = new b();

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
            return 1802355283;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final List<com.withings.authentication.mfa.resolve.c> f31955a;

        /* renamed from: b  reason: collision with root package name */
        private final com.withings.authentication.mfa.resolve.c f31956b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends com.withings.authentication.mfa.resolve.c> list, com.withings.authentication.mfa.resolve.c selectedFactor) {
            kotlin.jvm.internal.u.j(selectedFactor, "selectedFactor");
            this.f31955a = list;
            this.f31956b = selectedFactor;
        }

        public static c a(c cVar, com.withings.authentication.mfa.resolve.c selectedFactor) {
            List<com.withings.authentication.mfa.resolve.c> factors = cVar.f31955a;
            kotlin.jvm.internal.u.j(factors, "factors");
            kotlin.jvm.internal.u.j(selectedFactor, "selectedFactor");
            return new c(factors, selectedFactor);
        }

        public final List<com.withings.authentication.mfa.resolve.c> b() {
            return this.f31955a;
        }

        public final com.withings.authentication.mfa.resolve.c c() {
            return this.f31956b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (kotlin.jvm.internal.u.e(this.f31955a, cVar.f31955a) && kotlin.jvm.internal.u.e(this.f31956b, cVar.f31956b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f31956b.hashCode() + (this.f31955a.hashCode() * 31);
        }

        public final String toString() {
            return "Ready(factors=" + this.f31955a + ", selectedFactor=" + this.f31956b + ")";
        }
    }
}
