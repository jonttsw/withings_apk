package com.withings.common.compose.component;
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public abstract class l2 {

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class a extends l2 {

        /* renamed from: a  reason: collision with root package name */
        private final h2.d f34041a;

        public a(h2.d dVar) {
            super(0);
            this.f34041a = dVar;
        }

        public final h2.d a() {
            return this.f34041a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f34041a, ((a) obj).f34041a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f34041a.hashCode();
        }

        public final String toString() {
            return "IconImageVector(vector=" + this.f34041a + ")";
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class b extends l2 {

        /* renamed from: a  reason: collision with root package name */
        private final g2.c f34042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g2.c painter) {
            super(0);
            kotlin.jvm.internal.u.j(painter, "painter");
            this.f34042a = painter;
        }

        public final g2.c a() {
            return this.f34042a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f34042a, ((b) obj).f34042a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f34042a.hashCode();
        }

        public final String toString() {
            return "IconPainter(painter=" + this.f34042a + ")";
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class c extends l2 {

        /* renamed from: a  reason: collision with root package name */
        private final qk.a f34043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qk.a icon) {
            super(0);
            kotlin.jvm.internal.u.j(icon, "icon");
            this.f34043a = icon;
        }

        public final qk.a a() {
            return this.f34043a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f34043a, ((c) obj).f34043a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f34043a.hashCode();
        }

        public final String toString() {
            return "IconWithings(icon=" + this.f34043a + ")";
        }
    }

    public /* synthetic */ l2(int i11) {
        this();
    }

    private l2() {
    }
}
