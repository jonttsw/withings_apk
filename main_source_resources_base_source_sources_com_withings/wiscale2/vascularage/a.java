package com.withings.wiscale2.vascularage;
/* compiled from: VascularAgeActivity.kt */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: VascularAgeActivity.kt */
    /* renamed from: com.withings.wiscale2.vascularage.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0789a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0789a f62239a = new C0789a();

        private C0789a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0789a)) {
                return false;
            }
            C0789a c0789a = (C0789a) obj;
            return true;
        }

        public final int hashCode() {
            return -248299688;
        }

        public final String toString() {
            return "InitViewPortWithLastData";
        }
    }

    /* compiled from: VascularAgeActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62240a = new b();

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
            return 53773519;
        }

        public final String toString() {
            return "OnRangeActivated";
        }
    }

    /* compiled from: VascularAgeActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ws.f f62241a;

        public c(ws.f timeGraphViewPort) {
            kotlin.jvm.internal.u.j(timeGraphViewPort, "timeGraphViewPort");
            this.f62241a = timeGraphViewPort;
        }

        public final ws.f a() {
            return this.f62241a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f62241a, ((c) obj).f62241a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f62241a.hashCode();
        }

        public final String toString() {
            return "OnViewPortChanged(timeGraphViewPort=" + this.f62241a + ")";
        }
    }
}
