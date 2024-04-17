package com.withings.wiscale2.home.homeV2;

import com.withings.user.core.models.User;
import iz.a;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: HomeViewModel.kt */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: HomeViewModel.kt */
    /* renamed from: com.withings.wiscale2.home.homeV2.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0748a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0748a f57831a = new C0748a();

        private C0748a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0748a)) {
                return false;
            }
            C0748a c0748a = (C0748a) obj;
            return true;
        }

        public final int hashCode() {
            return 304990875;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: HomeViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final List<a.b> f57832a;

        /* renamed from: b  reason: collision with root package name */
        private final List<c10.c<?>> f57833b;

        /* renamed from: c  reason: collision with root package name */
        private final String f57834c;

        /* renamed from: d  reason: collision with root package name */
        private final List<bw.d> f57835d;

        /* renamed from: e  reason: collision with root package name */
        private final List<vg0.a> f57836e;

        /* renamed from: f  reason: collision with root package name */
        private final User f57837f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<a.b> measureList, List<? extends c10.c<?>> notificationList, String rankingPosition, List<? extends bw.d> trendsList, List<vg0.a> familySection, User user) {
            u.j(measureList, "measureList");
            u.j(notificationList, "notificationList");
            u.j(rankingPosition, "rankingPosition");
            u.j(trendsList, "trendsList");
            u.j(familySection, "familySection");
            u.j(user, "user");
            this.f57832a = measureList;
            this.f57833b = notificationList;
            this.f57834c = rankingPosition;
            this.f57835d = trendsList;
            this.f57836e = familySection;
            this.f57837f = user;
        }

        public final List<vg0.a> a() {
            return this.f57836e;
        }

        public final List<a.b> b() {
            return this.f57832a;
        }

        public final List<c10.c<?>> c() {
            return this.f57833b;
        }

        public final String d() {
            return this.f57834c;
        }

        public final List<bw.d> e() {
            return this.f57835d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (u.e(this.f57832a, bVar.f57832a) && u.e(this.f57833b, bVar.f57833b) && u.e(this.f57834c, bVar.f57834c) && u.e(this.f57835d, bVar.f57835d) && u.e(this.f57836e, bVar.f57836e) && u.e(this.f57837f, bVar.f57837f)) {
                return true;
            }
            return false;
        }

        public final User f() {
            return this.f57837f;
        }

        public final int hashCode() {
            return this.f57837f.hashCode() + e.b(this.f57836e, e.b(this.f57835d, defpackage.d.c(this.f57834c, e.b(this.f57833b, this.f57832a.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            return "Ready(measureList=" + this.f57832a + ", notificationList=" + this.f57833b + ", rankingPosition=" + this.f57834c + ", trendsList=" + this.f57835d + ", familySection=" + this.f57836e + ", user=" + this.f57837f + ")";
        }
    }
}
