package com.withings.authentication.accountConsent;

import androidx.camera.core.y1;
/* compiled from: AccountLoginConsentViewModel.kt */
/* loaded from: classes3.dex */
public interface i {

    /* compiled from: AccountLoginConsentViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f31440a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f31441b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f31442c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f31443d;

        public a(boolean z5, boolean z11, boolean z12) {
            boolean z13;
            this.f31440a = z5;
            this.f31441b = z11;
            this.f31442c = z12;
            if (z5 && z11) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f31443d = z13;
        }

        public static a a(a aVar, boolean z5, boolean z11, boolean z12, int i11) {
            if ((i11 & 1) != 0) {
                z5 = aVar.f31440a;
            }
            if ((i11 & 2) != 0) {
                z11 = aVar.f31441b;
            }
            if ((i11 & 4) != 0) {
                z12 = aVar.f31442c;
            }
            aVar.getClass();
            return new a(z5, z11, z12);
        }

        public final boolean b() {
            return this.f31443d;
        }

        public final boolean c() {
            return this.f31440a;
        }

        public final boolean d() {
            return this.f31441b;
        }

        public final boolean e() {
            return this.f31442c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f31440a == aVar.f31440a && this.f31441b == aVar.f31441b && this.f31442c == aVar.f31442c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f31442c) + y1.a(this.f31441b, Boolean.hashCode(this.f31440a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(privacyPolicyAccepted=");
            sb2.append(this.f31440a);
            sb2.append(", termsOfUsageAccepted=");
            sb2.append(this.f31441b);
            sb2.append(", isLoading=");
            return androidx.appcompat.app.h.d(sb2, this.f31442c, ")");
        }
    }

    /* compiled from: AccountLoginConsentViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31444a = new b();

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
            return -176547495;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
