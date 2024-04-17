package com.withings.cycletracking.ui.viewmodel;

import java.util.List;
/* compiled from: CycleTrackingHistoryViewModel.kt */
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: CycleTrackingHistoryViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        private final List<wm.f> f35898a;

        public a(List<wm.f> cycleDaysList) {
            kotlin.jvm.internal.u.j(cycleDaysList, "cycleDaysList");
            this.f35898a = cycleDaysList;
        }

        public final List<wm.f> a() {
            return this.f35898a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f35898a, ((a) obj).f35898a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f35898a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("Loaded(cycleDaysList="), this.f35898a, ")");
        }
    }

    /* compiled from: CycleTrackingHistoryViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35899a = new b();

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
            return -180230305;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
