package com.withings.badge.detail;

import kotlin.jvm.internal.u;
/* compiled from: BadgeDetailScreenState.kt */
/* loaded from: classes3.dex */
public interface k {

    /* compiled from: BadgeDetailScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32776a = new a();

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
            return -1838079555;
        }

        public final String toString() {
            return "BadgeNotFound";
        }
    }

    /* compiled from: BadgeDetailScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        private final ai.a f32777a;

        public b(ai.a badge) {
            u.j(badge, "badge");
            this.f32777a = badge;
        }

        public final ai.a a() {
            return this.f32777a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && u.e(this.f32777a, ((b) obj).f32777a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f32777a.hashCode();
        }

        public final String toString() {
            return "Loaded(badge=" + this.f32777a + ")";
        }
    }

    /* compiled from: BadgeDetailScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class c implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final c f32778a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public final int hashCode() {
            return 1462407687;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
