package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.android.activity.WithingsActivity;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.DateTime;
/* compiled from: ListGpsPointActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u00062\u0010\f\u001a(\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u0001 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/detail/ListGpsPointActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lcom/withings/wiscale2/activity/workout/ui/detail/ListGpsPointActivity$b;", "locationsData", "", "Lcom/withings/vasistas/model/Vasistas;", "kotlin.jvm.PlatformType", "", "pauseVasistas", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ListGpsPointActivity extends WithingsActivity {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f49043c = {androidx.camera.core.v.c(ListGpsPointActivity.class, "trackId", "getTrackId()J", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final d f49044a = new d(this);

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f49045b = nm0.h.b(new e());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListGpsPointActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a extends androidx.lifecycle.g1 {

        /* renamed from: a  reason: collision with root package name */
        private final long f49046a;

        /* renamed from: b  reason: collision with root package name */
        private final FilterGpsLocationWithPause f49047b;

        /* renamed from: c  reason: collision with root package name */
        private final WorkoutManager f49048c;

        /* renamed from: d  reason: collision with root package name */
        private final lj0.h0 f49049d;

        /* renamed from: e  reason: collision with root package name */
        private final GpsLocationRepository f49050e;

        /* renamed from: f  reason: collision with root package name */
        private final Flow<Track> f49051f;

        /* renamed from: g  reason: collision with root package name */
        private final androidx.lifecycle.f f49052g;

        /* renamed from: h  reason: collision with root package name */
        private final androidx.lifecycle.j0 f49053h;

        public a(long j5, FilterGpsLocationWithPause filterGpsLocationWithPause) {
            WorkoutManager workoutManager = WorkoutManager.Companion.get();
            lj0.h0 e11 = lj0.h0.e();
            kotlin.jvm.internal.u.i(e11, "get(...)");
            GpsLocationRepository gpsLocationRepository = GpsLocationRepository.Companion.get();
            kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
            kotlin.jvm.internal.u.j(gpsLocationRepository, "gpsLocationRepository");
            this.f49046a = j5;
            this.f49047b = filterGpsLocationWithPause;
            this.f49048c = workoutManager;
            this.f49049d = e11;
            this.f49050e = gpsLocationRepository;
            Flow<Track> flow = FlowKt.flow(new o0(this, null));
            this.f49051f = flow;
            androidx.lifecycle.f b10 = androidx.lifecycle.q.b(new n0(flow, this), null, 3);
            this.f49052g = b10;
            this.f49053h = androidx.lifecycle.e1.c(xw.a.b(new nm0.j(b10, androidx.lifecycle.q.b(FlowKt.transformLatest(flow, new m0(this, null)), null, 3))), new k0(this));
        }

        public final androidx.lifecycle.j0 m0() {
            return this.f49053h;
        }

        public final androidx.lifecycle.f p0() {
            return this.f49052g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListGpsPointActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<GpsLocation> f49054a;

        /* renamed from: b  reason: collision with root package name */
        private final List<GpsLocation> f49055b;

        public b(List<GpsLocation> locations, List<GpsLocation> filteredLocation) {
            kotlin.jvm.internal.u.j(locations, "locations");
            kotlin.jvm.internal.u.j(filteredLocation, "filteredLocation");
            this.f49054a = locations;
            this.f49055b = filteredLocation;
        }

        public final List<GpsLocation> a() {
            return this.f49055b;
        }

        public final List<GpsLocation> b() {
            return this.f49054a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f49054a, bVar.f49054a) && kotlin.jvm.internal.u.e(this.f49055b, bVar.f49055b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f49055b.hashCode() + (this.f49054a.hashCode() * 31);
        }

        public final String toString() {
            return "LocationsData(locations=" + this.f49054a + ", filteredLocation=" + this.f49055b + ")";
        }
    }

    /* compiled from: ListGpsPointActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 66464355, new s0(ListGpsPointActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49057a = nm0.h.b(new t0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49058b;

        public d(Activity activity) {
            this.f49058b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49057a.getValue();
        }
    }

    /* compiled from: ListGpsPointActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<a> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final a invoke() {
            ListGpsPointActivity listGpsPointActivity = ListGpsPointActivity.this;
            return (a) new androidx.lifecycle.k1(listGpsPointActivity, new u0(listGpsPointActivity)).a(a.class);
        }
    }

    public static final void A3(ListGpsPointActivity listGpsPointActivity, b bVar, androidx.compose.runtime.a aVar, int i11) {
        listGpsPointActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(464396774);
        s0.a.a(null, null, null, false, null, null, null, false, new i0(bVar, listGpsPointActivity), g11, 0, 255);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j0(listGpsPointActivity, bVar, i11));
        }
    }

    public static final long B3(ListGpsPointActivity listGpsPointActivity) {
        return ((Number) listGpsPointActivity.f49044a.getValue(listGpsPointActivity, f49043c[0])).longValue();
    }

    public static final a C3(ListGpsPointActivity listGpsPointActivity) {
        return (a) listGpsPointActivity.f49045b.getValue();
    }

    public static final void z3(ListGpsPointActivity listGpsPointActivity, GpsLocation gpsLocation, androidx.compose.runtime.a aVar, int i11) {
        String a11;
        listGpsPointActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(100949490);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e g12 = androidx.compose.foundation.layout.x0.g(aVar2, yk.h.o(), yk.h.q());
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(g12);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            c11.invoke(k1.j1.a(g11), g11, 0);
            g11.s(2058660585);
            DateTime dateTime = new DateTime(gpsLocation.getDate());
            String string = listGpsPointActivity.getString(C1987R.string._DATE_MMMM_D_YYYY_);
            kotlin.jvm.internal.u.g(string);
            if (dateTime.isAfterNow()) {
                Fail.j("Date parameter is after now !: " + dateTime);
                a11 = dateTime.toString(string.concat(" yyyy"));
                kotlin.jvm.internal.u.g(a11);
            } else if (hn.a.g(dateTime)) {
                a11 = listGpsPointActivity.getString(C1987R.string._TODAY_);
                kotlin.jvm.internal.u.i(a11, "getString(...)");
            } else if (hn.a.h(dateTime)) {
                a11 = listGpsPointActivity.getString(C1987R.string._YESTERDAY_);
                kotlin.jvm.internal.u.i(a11, "getString(...)");
            } else {
                a11 = u70.m.a(dateTime.toString(string));
                kotlin.jvm.internal.u.i(a11, "asUpperCaseFirstChar(...)");
            }
            nk.u.d(0, 0, 0, 61, 0L, g11, null, null, androidx.activity.b.b("Date: ", a11, ", ", b50.b.f(new DateTime(gpsLocation.getDate()), listGpsPointActivity, "hh:mm a", "HH:mm")));
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar2, 1.0f);
            g11.s(693286680);
            androidx.compose.ui.layout.l0 a13 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a14 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(e11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a14);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, a13, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar2, 0.0f, 0.0f, 8, 0.0f, 11);
                double latitude = gpsLocation.getPosition().getLatitude();
                nk.u.d(0, 0, 6, 60, 0L, g11, j5, null, "Lat.: " + latitude);
                double longitude = gpsLocation.getPosition().getLongitude();
                nk.u.d(0, 0, 0, 61, 0L, g11, null, null, "Long.: " + longitude);
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                float speed = gpsLocation.getSpeed();
                nk.u.d(0, 0, 0, 61, 0L, g11, null, null, "Speed: " + speed);
                double altitude = gpsLocation.getPosition().getAltitude();
                nk.u.d(0, 0, 0, 61, 0L, g11, null, null, "Altitude: " + altitude);
                androidx.compose.ui.e e12 = androidx.compose.foundation.layout.e1.e(aVar2, 1.0f);
                g11.s(693286680);
                androidx.compose.ui.layout.l0 a15 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
                int G3 = g11.G();
                k1.v0 l11 = g11.l();
                ym0.a a16 = g.a.a();
                s1.a c13 = androidx.compose.ui.layout.y.c(e12);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a16);
                    } else {
                        g11.m();
                    }
                    ym0.p b13 = com.withings.authentication.e.b(g11, a15, g11, l11);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G3))) {
                        androidx.camera.camera2.internal.l0.d(G3, g11, G3, b13);
                    }
                    dq.x.b(0, c13, k1.j1.a(g11), g11, 2058660585);
                    boolean isSynced = gpsLocation.getMetadata().isSynced();
                    nk.u.d(0, 0, 0, 61, 0L, g11, null, null, "Synced: " + isSynced);
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
                    androidx.compose.runtime.v o02 = g11.o0();
                    if (o02 != null) {
                        o02.G(new e0(listGpsPointActivity, gpsLocation, i11));
                        return;
                    }
                    return;
                }
                a3.g.s();
                throw null;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -1101283779, new c()));
    }
}
