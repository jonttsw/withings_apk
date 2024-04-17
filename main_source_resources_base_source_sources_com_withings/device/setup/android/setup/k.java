package com.withings.device.setup.android.setup;
/* compiled from: SetupState.kt */
/* loaded from: classes3.dex */
public interface k {

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37461a = new a();

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
            return -1487809187;
        }

        public final String toString() {
            return "Finished";
        }
    }

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37462a = new b();

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
            return -625498245;
        }

        public final String toString() {
            return "Init";
        }
    }
}
