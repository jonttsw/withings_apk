package com.withings.nervehealth.ui.models.resources;

import com.withings.wiscale2.C1987R;
/* compiled from: NeuropathyCommonResources.kt */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f42749a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42750b;

    /* renamed from: c  reason: collision with root package name */
    private final int f42751c;

    /* compiled from: NeuropathyCommonResources.kt */
    /* renamed from: com.withings.nervehealth.ui.models.resources.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0573a extends a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0573a f42752d = new C0573a();

        private C0573a() {
            super(C1987R.string.electrochemicalSkinConductanceScore_metric_title_short, C1987R.string.nerveHealth_status_signsOfNeuropathy, C1987R.string.nerveHealthScore_inDepth_title);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0573a)) {
                return false;
            }
            C0573a c0573a = (C0573a) obj;
            return true;
        }

        public final int hashCode() {
            return -1556650730;
        }

        public final String toString() {
            return "B2BFeature";
        }
    }

    /* compiled from: NeuropathyCommonResources.kt */
    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: d  reason: collision with root package name */
        public static final b f42753d = new b();

        private b() {
            super(C1987R.string.nerveHealthScore_metric_title_short, C1987R.string.nerveHealth_status_signsOfNeuropathy, C1987R.string.nerveHealthScore_inDepth_title);
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
            return 1704935127;
        }

        public final String toString() {
            return "MedicalFeature";
        }
    }

    /* compiled from: NeuropathyCommonResources.kt */
    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: d  reason: collision with root package name */
        public static final c f42754d = new c();

        private c() {
            super(C1987R.string.electrodermalActivity_metric_title_short, C1987R.string.nerveHealth_status_low, C1987R.string.electrodermalActivity_inDepth_title);
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
            return 923082336;
        }

        public final String toString() {
            return "NonMedicalFeature";
        }
    }

    public a(int i11, int i12, int i13) {
        this.f42749a = i11;
        this.f42750b = i12;
        this.f42751c = i13;
    }

    public final int a() {
        return this.f42751c;
    }

    public final int b() {
        return this.f42750b;
    }

    public final int c() {
        return this.f42749a;
    }
}
