package com.withings.authentication.mfa.resolve;

import androidx.camera.core.y1;
/* compiled from: MfaResolutionViewModel.kt */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f31963a;

        public a(String phoneNumber) {
            kotlin.jvm.internal.u.j(phoneNumber, "phoneNumber");
            this.f31963a = phoneNumber;
        }

        public final String a() {
            return this.f31963a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f31963a, ((a) obj).f31963a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f31963a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Call(phoneNumber="), this.f31963a, ")");
        }
    }

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f31964a;

        public b(String phoneNumber) {
            kotlin.jvm.internal.u.j(phoneNumber, "phoneNumber");
            this.f31964a = phoneNumber;
        }

        public final String a() {
            return this.f31964a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f31964a, ((b) obj).f31964a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f31964a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Sms(phoneNumber="), this.f31964a, ")");
        }
    }

    /* compiled from: MfaResolutionViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.resolve.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0424c implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0424c f31965a = new C0424c();

        private C0424c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0424c)) {
                return false;
            }
            C0424c c0424c = (C0424c) obj;
            return true;
        }

        public final int hashCode() {
            return -352372586;
        }

        public final String toString() {
            return "Totp";
        }
    }

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f31966a;

        public d(String phoneNumber) {
            kotlin.jvm.internal.u.j(phoneNumber, "phoneNumber");
            this.f31966a = phoneNumber;
        }

        public final String a() {
            return this.f31966a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && kotlin.jvm.internal.u.e(this.f31966a, ((d) obj).f31966a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f31966a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Whatsapp(phoneNumber="), this.f31966a, ")");
        }
    }
}
