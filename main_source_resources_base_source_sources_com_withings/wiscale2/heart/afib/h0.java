package com.withings.wiscale2.heart.afib;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import com.withings.user.User;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: AFibMonthViewModel.kt */
/* loaded from: classes5.dex */
public final class h0 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f57160a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f57161b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f57162c;

    /* renamed from: d  reason: collision with root package name */
    private final b f57163d;

    /* renamed from: e  reason: collision with root package name */
    private final fy.o f57164e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.f f57165f;

    /* renamed from: g  reason: collision with root package name */
    private androidx.lifecycle.j0 f57166g;

    /* compiled from: AFibMonthViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<ky.d> f57167a;

        /* renamed from: b  reason: collision with root package name */
        private final int f57168b;

        /* renamed from: c  reason: collision with root package name */
        private final int f57169c;

        public a(int i11, int i12, List list) {
            this.f57167a = list;
            this.f57168b = i11;
            this.f57169c = i12;
        }

        public final int a() {
            return this.f57168b;
        }

        public final int b() {
            return this.f57169c;
        }

        public final List<ky.d> c() {
            return this.f57167a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f57167a, aVar.f57167a) && this.f57168b == aVar.f57168b && this.f57169c == aVar.f57169c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57169c) + androidx.appcompat.app.h.a(this.f57168b, this.f57167a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AFibStats(measuresGroups=");
            sb2.append(this.f57167a);
            sb2.append(", daysWithEvents=");
            sb2.append(this.f57168b);
            sb2.append(", eventsThisMonth=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f57169c, ")");
        }
    }

    /* compiled from: AFibMonthViewModel.kt */
    /* loaded from: classes5.dex */
    public interface b {
        rs.f d1(DateTime dateTime, ky.a aVar);
    }

    public h0(User user, DateTime date, boolean z5, y datumBuilderDelegate, fy.o oVar) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(datumBuilderDelegate, "datumBuilderDelegate");
        this.f57160a = user;
        this.f57161b = date;
        this.f57162c = z5;
        this.f57163d = datumBuilderDelegate;
        this.f57164e = oVar;
        androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new k0(this, null), 2);
        this.f57165f = a11;
        this.f57166g = e1.c(a11, new j0(this));
    }

    public final androidx.lifecycle.j0 m0() {
        return this.f57166g;
    }

    public final androidx.lifecycle.f p0() {
        return this.f57165f;
    }
}
