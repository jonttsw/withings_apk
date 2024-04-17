package com.withings.fever.ui.temperatureList;

import java.util.List;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: TemperatureListState.kt */
/* loaded from: classes3.dex */
public interface o {

    /* compiled from: TemperatureListState.kt */
    /* loaded from: classes3.dex */
    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39441a = new a();

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
            return 522467759;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: TemperatureListState.kt */
    /* loaded from: classes3.dex */
    public static final class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final List<nm0.j<DateTime, List<ky.d>>> f39442a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends nm0.j<DateTime, ? extends List<ky.d>>> temperatureList) {
            u.j(temperatureList, "temperatureList");
            this.f39442a = temperatureList;
        }

        public final List<nm0.j<DateTime, List<ky.d>>> a() {
            return this.f39442a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && u.e(this.f39442a, ((b) obj).f39442a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f39442a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("Ready(temperatureList="), this.f39442a, ")");
        }
    }
}
