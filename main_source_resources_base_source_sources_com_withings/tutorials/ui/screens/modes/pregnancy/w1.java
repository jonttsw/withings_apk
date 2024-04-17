package com.withings.tutorials.ui.screens.modes.pregnancy;
/* compiled from: PregnancyModeViewModel.kt */
/* loaded from: classes4.dex */
public interface w1 {

    /* compiled from: PregnancyModeViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a implements w1 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46175a = new a();

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
            return -1385479079;
        }

        public final String toString() {
            return "Completed";
        }
    }

    /* compiled from: PregnancyModeViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b implements w1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46176a = new b();

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
            return -70034742;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
