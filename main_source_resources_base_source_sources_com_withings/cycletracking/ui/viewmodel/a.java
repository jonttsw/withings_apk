package com.withings.cycletracking.ui.viewmodel;

import com.withings.wiscale2.C1987R;
/* compiled from: CycleTrackingFactorEditionViewModel.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: CycleTrackingFactorEditionViewModel.kt */
    /* renamed from: com.withings.cycletracking.ui.viewmodel.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0475a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0475a f35861a = new C0475a();

        private C0475a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0475a)) {
                return false;
            }
            C0475a c0475a = (C0475a) obj;
            return true;
        }

        public final int hashCode() {
            return -1704710852;
        }

        public final String toString() {
            return "Completed";
        }
    }

    /* compiled from: CycleTrackingFactorEditionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final int f35862a;

        /* renamed from: b  reason: collision with root package name */
        private final String f35863b;

        public b(int i11, String description) {
            kotlin.jvm.internal.u.j(description, "description");
            this.f35862a = i11;
            this.f35863b = description;
        }

        public final String a() {
            return this.f35863b;
        }

        public final int b() {
            return this.f35862a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f35862a == bVar.f35862a && kotlin.jvm.internal.u.e(this.f35863b, bVar.f35863b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f35863b.hashCode() + (Integer.hashCode(this.f35862a) * 31);
        }

        public final String toString() {
            return "OpenAlertDialogWithMessage(titleRes=" + this.f35862a + ", description=" + this.f35863b + ")";
        }
    }

    /* compiled from: CycleTrackingFactorEditionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final int f35864a = C1987R.string.authentication_error_generic;

        public final int a() {
            return this.f35864a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f35864a == ((c) obj).f35864a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f35864a);
        }

        public final String toString() {
            return androidx.camera.camera2.internal.e.c(new StringBuilder("OpenAlertDialogWithResId(messageRes="), this.f35864a, ")");
        }
    }
}
