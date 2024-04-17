package com.withings.authentication.mfa.totp;

import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
/* compiled from: TotpViewModel.kt */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: TotpViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f32224a;

        public a(String str) {
            this.f32224a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && u.e(this.f32224a, ((a) obj).f32224a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f32224a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Error(error="), this.f32224a, ")");
        }
    }

    /* compiled from: TotpViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.totp.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0429b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0429b f32225a = new C0429b();

        private C0429b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0429b)) {
                return false;
            }
            C0429b c0429b = (C0429b) obj;
            return true;
        }

        public final int hashCode() {
            return -468206516;
        }

        public final String toString() {
            return "Processing";
        }
    }

    /* compiled from: TotpViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f32226a;

        public c(String recoveryCode) {
            u.j(recoveryCode, "recoveryCode");
            this.f32226a = recoveryCode;
        }

        public final String a() {
            return this.f32226a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && u.e(this.f32226a, ((c) obj).f32226a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f32226a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Success(recoveryCode="), this.f32226a, ")");
        }
    }
}
