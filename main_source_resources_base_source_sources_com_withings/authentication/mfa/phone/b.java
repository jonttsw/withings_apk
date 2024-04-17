package com.withings.authentication.mfa.phone;
/* compiled from: SettingsPhoneAuthViewModel.kt */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SettingsPhoneAuthViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31794a = new a();

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
            return -991406600;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SettingsPhoneAuthViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.phone.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0415b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0415b f31795a = new C0415b();

        private C0415b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0415b)) {
                return false;
            }
            C0415b c0415b = (C0415b) obj;
            return true;
        }

        public final int hashCode() {
            return 352815091;
        }

        public final String toString() {
            return "Success";
        }
    }
}
