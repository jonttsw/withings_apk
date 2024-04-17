package com.withings.wiscale2.activity.workout.ui.performance.splits;

import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.f5;
import androidx.compose.material.h6;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.lifecycle.k1;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.wiscale2.C1987R;
import dq.x;
import javax.inject.Inject;
import jm.a;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import x1.b;
import x1.d;
/* compiled from: WorkoutSplitsActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e²\u0006 \u0010\t\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/performance/splits/WorkoutSplitsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "Lnm0/j;", "", "Lcom/withings/wiscale2/activity/workout/ui/performance/splits/b;", "", "states", "", "isLoading", "", "unitType", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutSplitsActivity extends Hilt_WorkoutSplitsActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ComputeSplits f49961e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ComputePace f49962f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public GpsLocationRepository f49963g;

    /* renamed from: h  reason: collision with root package name */
    private final d f49964h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f49965i;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f49960k = {v.c(WorkoutSplitsActivity.class, "workoutId", "getWorkoutId()J", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f49959j = new Object();

    /* compiled from: WorkoutSplitsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutSplitsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f49967b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f49967b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f49967b | 1);
            WorkoutSplitsActivity.this.z3(aVar, g11);
            return y.f85009a;
        }
    }

    /* compiled from: WorkoutSplitsActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -37504627, new r(WorkoutSplitsActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49969a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49970b;

        public d(Activity activity) {
            this.f49970b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49969a.getValue();
        }
    }

    /* compiled from: WorkoutSplitsActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.a<com.withings.wiscale2.activity.workout.ui.performance.splits.d> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.activity.workout.ui.performance.splits.d invoke() {
            WorkoutSplitsActivity workoutSplitsActivity = WorkoutSplitsActivity.this;
            return (com.withings.wiscale2.activity.workout.ui.performance.splits.d) new k1(workoutSplitsActivity, new t(workoutSplitsActivity)).a(com.withings.wiscale2.activity.workout.ui.performance.splits.d.class);
        }
    }

    public WorkoutSplitsActivity() {
        super(0);
        this.f49964h = new d(this);
        this.f49965i = nm0.h.b(new e());
    }

    public static final void A3(WorkoutSplitsActivity workoutSplitsActivity, ok.c cVar, androidx.compose.runtime.a aVar, int i11) {
        workoutSplitsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1920088831);
        ok.b.a(null, ay.b.u(C1987R.string.workoutSplitsDetail_viewTitle, g11), null, null, null, 0L, 0L, 0L, f1.b.a(), false, null, null, null, new com.withings.wiscale2.activity.workout.ui.performance.splits.e(workoutSplitsActivity), cVar, false, 0.0f, g11, 0, Utils.MAX_EVENT_SIZE, 106237);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(workoutSplitsActivity, cVar, i11));
        }
    }

    public static final void B3(WorkoutSplitsActivity workoutSplitsActivity, androidx.compose.ui.e eVar, Integer num, double d11, androidx.compose.runtime.a aVar, int i11) {
        workoutSplitsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-2128086900);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(eVar);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            nk.a.d(x0.j(androidx.compose.ui.e.f8927a, 0.0f, 0.0f, yk.h.a(), 0.0f, 11), a.d.a(workoutSplitsActivity).b(d11, 126), 0L, null, 0, 0, null, g11, 0, 124);
            if (num == null) {
                g11.s(-73174951);
                androidx.compose.foundation.layout.k.a(androidx.collection.c.g(e1.n(new VerticalAlignElement(b.a.i()), yk.h.c()), x0.h.e()), g11, 0);
                g11.J();
            } else {
                g11.s(-73174734);
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.c(androidx.collection.c.g(e1.n(new VerticalAlignElement(b.a.i()), yk.h.c()), x0.h.e()), s2.b.a(num.intValue(), g11)), g11, 0);
                g11.J();
            }
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new g(workoutSplitsActivity, eVar, num, d11, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void C3(WorkoutSplitsActivity workoutSplitsActivity, int i11, com.withings.wiscale2.activity.workout.ui.performance.splits.b bVar, String str, boolean z5, androidx.compose.runtime.a aVar, int i12) {
        workoutSplitsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-705069737);
        com.withings.common.compose.component.o.r(x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.a()), s1.b.b(g11, 1464198259, new h(i11, workoutSplitsActivity, bVar, str)), z5, g11, ((i12 >> 3) & ConstantsWs.HWFAILURE_ZERO) | 48, 0);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(workoutSplitsActivity, i11, bVar, str, z5, i12));
        }
    }

    public static final void D3(WorkoutSplitsActivity workoutSplitsActivity, nm0.j jVar, androidx.compose.runtime.a aVar, int i11) {
        String string;
        workoutSplitsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(2060414809);
        g11.s(47475700);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            if (((Number) jVar.d()).intValue() == 7) {
                string = workoutSplitsActivity.getString(C1987R.string.workoutSplitsDetail_mile);
            } else {
                string = workoutSplitsActivity.getString(C1987R.string.workoutSplitsDetail_kilometer);
            }
            t11 = androidx.compose.runtime.l0.f(string, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = e1.d(aVar2);
        g11.s(-483455358);
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(d11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            com.withings.common.compose.component.o.r(x0.g(aVar2, og.y.a(0, c11, j1.a(g11), g11, 2058660585), yk.h.a()), s1.b.b(g11, 347317695, new j(workoutSplitsActivity, r0Var)), false, g11, 432, 0);
            s0.a.a(e1.e(aVar2, 1.0f), null, null, false, null, null, null, false, new m(jVar, workoutSplitsActivity), g11, 6, ConstantsWs.WS_STATUS_NOREPOUSER);
            androidx.compose.runtime.v b12 = h6.b(g11);
            if (b12 != null) {
                b12.G(new n(workoutSplitsActivity, jVar, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final com.withings.wiscale2.activity.workout.ui.performance.splits.d E3(WorkoutSplitsActivity workoutSplitsActivity) {
        return (com.withings.wiscale2.activity.workout.ui.performance.splits.d) workoutSplitsActivity.f49965i.getValue();
    }

    public static final long F3(WorkoutSplitsActivity workoutSplitsActivity) {
        return ((Number) workoutSplitsActivity.f49964h.getValue(workoutSplitsActivity, f49960k[0])).longValue();
    }

    @Override // com.withings.wiscale2.activity.workout.ui.performance.splits.Hilt_WorkoutSplitsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -1505458201, new c()));
    }

    public final void z3(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-389009);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            e.b b10 = androidx.compose.foundation.layout.e.b();
            d.a g12 = b.a.g();
            g11.s(-483455358);
            l0 a11 = androidx.compose.foundation.layout.n.a(b10, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                f5.b(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11));
        }
    }
}
