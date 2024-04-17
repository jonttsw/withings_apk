package com.withings.wiscale2.settings;
/* compiled from: WithingsAdvertisingViewModel.kt */
/* loaded from: classes5.dex */
public interface e {

    /* compiled from: WithingsAdvertisingViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final a f59971a = new a();

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
            return 258260037;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: WithingsAdvertisingViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f59972a;

        public b(boolean z5) {
            this.f59972a = z5;
        }

        public final boolean a() {
            return this.f59972a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f59972a == ((b) obj).f59972a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f59972a);
        }

        public final String toString() {
            return androidx.appcompat.app.h.d(new StringBuilder("SetValue(personalizedAdvertisingAccepted="), this.f59972a, ")");
        }
    }
}
