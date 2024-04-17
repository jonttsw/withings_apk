package com.withings.measurements.ui.verticals;

import com.withings.measurement.model.MeasurementsVertical;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: HealthVerticalActivityViewModel.kt */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: HealthVerticalActivityViewModel.kt */
    /* renamed from: com.withings.measurements.ui.verticals.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0560a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final List<MeasurementsVertical> f42154a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0560a(List<? extends MeasurementsVertical> list) {
            this.f42154a = list;
        }

        public final List<MeasurementsVertical> a() {
            return this.f42154a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0560a) && u.e(this.f42154a, ((C0560a) obj).f42154a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f42154a.hashCode();
        }

        public final String toString() {
            return d.i(new StringBuilder("Loaded(measurementsVerticals="), this.f42154a, ")");
        }
    }

    /* compiled from: HealthVerticalActivityViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f42155a = new b();

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
            return -535206129;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
