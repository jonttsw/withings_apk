package com.withings.measurements.ui;
/* compiled from: MeasurementUiItem.kt */
/* loaded from: classes4.dex */
public interface t1 {

    /* compiled from: MeasurementUiItem.kt */
    /* loaded from: classes4.dex */
    public static final class a implements t1 {

        /* renamed from: a  reason: collision with root package name */
        private final MeasurementHeader f42141a;

        public a(MeasurementHeader header) {
            kotlin.jvm.internal.u.j(header, "header");
            this.f42141a = header;
        }

        public final MeasurementHeader a() {
            return this.f42141a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f42141a == ((a) obj).f42141a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f42141a.hashCode();
        }

        public final String toString() {
            return "Header(header=" + this.f42141a + ")";
        }
    }

    /* compiled from: MeasurementUiItem.kt */
    /* loaded from: classes4.dex */
    public static final class b implements t1 {

        /* renamed from: a  reason: collision with root package name */
        private final iz.a f42142a;

        public b(iz.a measure) {
            kotlin.jvm.internal.u.j(measure, "measure");
            this.f42142a = measure;
        }

        public final iz.a a() {
            return this.f42142a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f42142a, ((b) obj).f42142a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f42142a.hashCode();
        }

        public final String toString() {
            return "Measure(measure=" + this.f42142a + ")";
        }
    }
}
