package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
public abstract class i {

    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60037a = new i(0);
    }

    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class b extends i {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f60038a;

        public b(Throwable th2) {
            super(0);
            this.f60038a = th2;
        }

        public final Throwable a() {
            return this.f60038a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f60038a, ((b) obj).f60038a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f60038a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.f60038a + ")";
        }
    }

    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class c extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final c f60039a = new i(0);
    }

    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class d extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final d f60040a = new i(0);
    }

    public /* synthetic */ i(int i11) {
        this();
    }

    private i() {
    }
}
