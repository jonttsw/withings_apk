package com.withings.authentication.mfa.phone;

import androidx.camera.camera2.internal.e;
import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
/* compiled from: SettingsPhoneAuthViewModel.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SettingsPhoneAuthViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.phone.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0414a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f31792a;

        public C0414a(String str) {
            this.f31792a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0414a) && u.e(this.f31792a, ((C0414a) obj).f31792a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f31792a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Success(recoveryCode="), this.f31792a, ")");
        }
    }

    /* compiled from: SettingsPhoneAuthViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final int f31793a;

        public b(int i11) {
            this.f31793a = i11;
        }

        public final int a() {
            return this.f31793a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f31793a == ((b) obj).f31793a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31793a);
        }

        public final String toString() {
            return e.c(new StringBuilder("TooManyRequests(timeToWaitSeconds="), this.f31793a, ")");
        }
    }
}
