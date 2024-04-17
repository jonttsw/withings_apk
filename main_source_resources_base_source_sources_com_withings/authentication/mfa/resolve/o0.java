package com.withings.authentication.mfa.resolve;
/* compiled from: MfaResolutionViewModel.kt */
/* loaded from: classes3.dex */
public interface o0 {

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements o0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32184a = new a();

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
            return 1808007559;
        }

        public final String toString() {
            return "Failure";
        }
    }

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements o0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32185a = new b();

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
            return 1027411968;
        }

        public final String toString() {
            return "Success";
        }
    }
}
