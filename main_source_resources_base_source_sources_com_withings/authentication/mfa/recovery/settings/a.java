package com.withings.authentication.mfa.recovery.settings;

import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
/* compiled from: SettingsRecoveryCodeViewModel.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SettingsRecoveryCodeViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.recovery.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0420a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0420a f31890a = new C0420a();

        private C0420a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0420a)) {
                return false;
            }
            C0420a c0420a = (C0420a) obj;
            return true;
        }

        public final int hashCode() {
            return -1768365095;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: SettingsRecoveryCodeViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f31891a;

        public b(String str) {
            this.f31891a = str;
        }

        public final String a() {
            return this.f31891a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && u.e(this.f31891a, ((b) obj).f31891a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f31891a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("Ready(recoveryCode="), this.f31891a, ")");
        }
    }
}
