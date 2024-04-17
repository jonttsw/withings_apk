package com.withings.authentication.mfa.resolve;
/* compiled from: MfaResolutionViewModel.kt */
/* loaded from: classes3.dex */
public interface p0 {

    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32189a = new a();

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
            return 1641097578;
        }

        public final String toString() {
            return "Success";
        }
    }
}
