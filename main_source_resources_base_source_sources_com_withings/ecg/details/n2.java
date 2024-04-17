package com.withings.ecg.details;
/* compiled from: EcgListViewModel.kt */
/* loaded from: classes3.dex */
public interface n2 {

    /* compiled from: EcgListViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements n2 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38274a = new a();

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
            return -2057809906;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: EcgListViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements n2 {

        /* renamed from: a  reason: collision with root package name */
        private final m1 f38275a;

        public b(m1 m1Var) {
            this.f38275a = m1Var;
        }

        public final m1 a() {
            return this.f38275a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f38275a, ((b) obj).f38275a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            m1 m1Var = this.f38275a;
            if (m1Var == null) {
                return 0;
            }
            return m1Var.hashCode();
        }

        public final String toString() {
            return "Ready(ecgList=" + this.f38275a + ")";
        }
    }
}
