package com.withings.authentication.mfa.totp;

import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
/* compiled from: TotpViewModel.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: TotpViewModel.kt */
    /* renamed from: com.withings.authentication.mfa.totp.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0428a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0428a f32220a = new C0428a();

        private C0428a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0428a)) {
                return false;
            }
            C0428a c0428a = (C0428a) obj;
            return true;
        }

        public final int hashCode() {
            return -1317733848;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: TotpViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f32221a;

        /* renamed from: b  reason: collision with root package name */
        private final String f32222b;

        /* renamed from: c  reason: collision with root package name */
        private final String f32223c;

        public b(String email, String key, String issuer) {
            u.j(email, "email");
            u.j(key, "key");
            u.j(issuer, "issuer");
            this.f32221a = email;
            this.f32222b = key;
            this.f32223c = issuer;
        }

        public final String a() {
            return this.f32221a;
        }

        public final String b() {
            return this.f32223c;
        }

        public final String c() {
            return this.f32222b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (u.e(this.f32221a, bVar.f32221a) && u.e(this.f32222b, bVar.f32222b) && u.e(this.f32223c, bVar.f32223c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f32223c.hashCode() + d.c(this.f32222b, this.f32221a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Ready(email=");
            sb2.append(this.f32221a);
            sb2.append(", key=");
            sb2.append(this.f32222b);
            sb2.append(", issuer=");
            return y1.e(sb2, this.f32223c, ")");
        }
    }
}
