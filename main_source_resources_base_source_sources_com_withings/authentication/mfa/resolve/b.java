package com.withings.authentication.mfa.resolve;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31959a = new a();

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
            return 1504026295;
        }

        public final String toString() {
            return "ChangeFactor";
        }
    }

    /* compiled from: MfaResolveScreen.kt */
    /* renamed from: com.withings.authentication.mfa.resolve.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0423b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final int f31960a;

        public C0423b(int i11) {
            this.f31960a = i11;
        }

        public final int a() {
            return this.f31960a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0423b) && this.f31960a == ((C0423b) obj).f31960a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31960a);
        }

        public final String toString() {
            return androidx.camera.camera2.internal.e.c(new StringBuilder("TooManyRequests(waitSeconds="), this.f31960a, ")");
        }
    }
}
