package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgAnalytics.kt */
/* loaded from: classes5.dex */
public abstract class f5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f51337a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51338b;

    /* compiled from: EcgAnalytics.kt */
    /* loaded from: classes5.dex */
    public static final class a extends f5 {

        /* renamed from: c  reason: collision with root package name */
        public static final a f51339c = new a();

        private a() {
            super("learn_about_us_regulation", 6);
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
            return -824563000;
        }

        public final String toString() {
            return "AboutUsRegulations";
        }
    }

    /* compiled from: EcgAnalytics.kt */
    /* loaded from: classes5.dex */
    public static final class b extends f5 {

        /* renamed from: c  reason: collision with root package name */
        public static final b f51340c = new b();

        private b() {
            super("exit", 3);
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
            return 1026899816;
        }

        public final String toString() {
            return "Exit";
        }
    }

    /* compiled from: EcgAnalytics.kt */
    /* loaded from: classes5.dex */
    public static final class c extends f5 {

        /* renamed from: c  reason: collision with root package name */
        public static final c f51341c = new c();

        private c() {
            super("tutorial_start", 1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public final int hashCode() {
            return 1781925720;
        }

        public final String toString() {
            return "Start";
        }
    }

    /* compiled from: EcgAnalytics.kt */
    /* loaded from: classes5.dex */
    public static final class d extends f5 {

        /* renamed from: c  reason: collision with root package name */
        public static final d f51342c = new d();

        private d() {
            super("go_to_support", 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return true;
        }

        public final int hashCode() {
            return -1218912955;
        }

        public final String toString() {
            return "Support";
        }
    }

    public f5(String str, int i11) {
        this.f51337a = str;
        this.f51338b = i11;
    }

    public final String a() {
        return this.f51337a;
    }

    public final int b() {
        return this.f51338b;
    }
}
