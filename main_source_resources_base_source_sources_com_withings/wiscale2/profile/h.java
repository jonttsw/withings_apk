package com.withings.wiscale2.profile;
/* compiled from: GoalTitleState.kt */
/* loaded from: classes5.dex */
public abstract class h {

    /* compiled from: GoalTitleState.kt */
    /* loaded from: classes5.dex */
    public static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        private final int f59349a;

        public a(int i11) {
            this.f59349a = i11;
        }

        public final int a() {
            return this.f59349a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f59349a == ((a) obj).f59349a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59349a);
        }

        public final String toString() {
            return androidx.camera.camera2.internal.e.c(new StringBuilder("Loaded(title="), this.f59349a, ")");
        }
    }

    /* compiled from: GoalTitleState.kt */
    /* loaded from: classes5.dex */
    public static final class b extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final b f59350a = new Object();
    }
}
