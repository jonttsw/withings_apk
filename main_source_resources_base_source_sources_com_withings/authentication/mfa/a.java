package com.withings.authentication.mfa;

import com.withings.account.models.TwoFactorAuthentication;
import java.util.HashMap;
/* compiled from: SettingsMfaViewModel.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SettingsMfaViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0410a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0410a f31607a = new C0410a();

        private C0410a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0410a)) {
                return false;
            }
            C0410a c0410a = (C0410a) obj;
            return true;
        }

        public final int hashCode() {
            return 273487969;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SettingsMfaViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31608a = new b();

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
            return -1650395819;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: SettingsMfaViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f31609a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<PhoneFactor, String> f31610b;

        public c(TwoFactorAuthentication.Totp totp, HashMap phoneFactorsMap) {
            kotlin.jvm.internal.u.j(phoneFactorsMap, "phoneFactorsMap");
            this.f31609a = totp;
            this.f31610b = phoneFactorsMap;
        }

        public final HashMap<PhoneFactor, String> a() {
            return this.f31610b;
        }

        public final Object b() {
            return this.f31609a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (kotlin.jvm.internal.u.e(this.f31609a, cVar.f31609a) && kotlin.jvm.internal.u.e(this.f31610b, cVar.f31610b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            Object obj = this.f31609a;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            return this.f31610b.hashCode() + (hashCode * 31);
        }

        public final String toString() {
            return "Ready(totp=" + this.f31609a + ", phoneFactorsMap=" + this.f31610b + ")";
        }
    }
}
