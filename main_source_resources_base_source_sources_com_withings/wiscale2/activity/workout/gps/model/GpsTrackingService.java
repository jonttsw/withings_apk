package com.withings.wiscale2.activity.workout.gps.model;

import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.r;
import androidx.lifecycle.LifecycleService;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutNotificationManager;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import m70.i;
import nm0.h;
import org.joda.time.DateTime;
import u70.a;
import ui.d;
import vh.o;
/* compiled from: GpsTrackingService.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/activity/workout/gps/model/GpsTrackingService;", "Landroidx/lifecycle/LifecycleService;", "Lui/d$d;", "Lu70/a$c;", "<init>", "()V", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GpsTrackingService extends LifecycleService implements d.InterfaceC1716d, a.c {

    /* renamed from: k  reason: collision with root package name */
    private static final nm0.g<Integer> f48729k = h.b(a.f48740a);

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f48730l = 0;

    /* renamed from: d  reason: collision with root package name */
    private User f48733d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f48734e;

    /* renamed from: h  reason: collision with root package name */
    private ui.d f48737h;

    /* renamed from: i  reason: collision with root package name */
    private LiveWorkoutNotificationManager f48738i;

    /* renamed from: j  reason: collision with root package name */
    private r f48739j;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f48731b = h.b(c.f48741a);

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f48732c = h.b(new d());

    /* renamed from: f  reason: collision with root package name */
    private GpsLocationRepository f48735f = GpsLocationRepository.Companion.get();

    /* renamed from: g  reason: collision with root package name */
    private WorkoutCategoryManager f48736g = WorkoutCategoryManager.get();

    /* compiled from: GpsTrackingService.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48740a = new w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ Integer invoke() {
            return 8;
        }
    }

    /* compiled from: GpsTrackingService.kt */
    /* loaded from: classes4.dex */
    public static final class b {
    }

    /* compiled from: GpsTrackingService.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<u70.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f48741a = new w(0);

        @Override // ym0.a
        public final u70.a invoke() {
            return u70.a.b();
        }
    }

    /* compiled from: GpsTrackingService.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<na0.c> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final na0.c invoke() {
            GpsTrackingService context = GpsTrackingService.this;
            com.withings.wiscale2.activity.workout.gps.model.a aVar = new com.withings.wiscale2.activity.workout.gps.model.a(context);
            u.j(context, "context");
            if (mm.a.f82252a.a()) {
                return new na0.b(context, aVar);
            }
            return new na0.e(context, aVar);
        }
    }

    public static final void f(GpsTrackingService gpsTrackingService) {
        ui.d dVar = gpsTrackingService.f48737h;
        if (dVar != null) {
            dVar.j(gpsTrackingService);
            gpsTrackingService.m();
            return;
        }
        u.s("locationStateWatcher");
        throw null;
    }

    public static final void g(GpsTrackingService gpsTrackingService, Location location) {
        gpsTrackingService.getClass();
        x70.b.l(gpsTrackingService, "New location received : " + location, new Object[0]);
        if (location.getSpeed() <= 30.0f) {
            DateTime dateTime = new DateTime(location.getTime());
            User user = gpsTrackingService.f48733d;
            if (user != null) {
                BuildersKt__Builders_commonKt.launch$default(t.l(gpsTrackingService), Dispatchers.getIO(), null, new com.withings.wiscale2.activity.workout.gps.model.d(gpsTrackingService, new GpsLocation(-1L, dateTime, new GpsLocation.MetaData(user.q(), false), new GpsLocation.Position(location.getLatitude(), location.getLongitude(), location.getAltitude()), new GpsLocation.Accuracy(location.getAccuracy(), location.getVerticalAccuracyMeters(), location.getSpeedAccuracyMetersPerSecond(), location.getBearingAccuracyDegrees()), location.getSpeed(), location.getBearing()), null), 2, null);
                return;
            }
            u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            throw null;
        }
    }

    public static final void i(GpsTrackingService gpsTrackingService, LiveWorkout liveWorkout, WorkoutCategory workoutCategory) {
        LiveWorkoutNotificationManager liveWorkoutNotificationManager = gpsTrackingService.f48738i;
        if (liveWorkoutNotificationManager != null) {
            r g11 = liveWorkoutNotificationManager.g(liveWorkout, workoutCategory, gpsTrackingService.l());
            gpsTrackingService.f48739j = g11;
            if (Build.VERSION.SDK_INT >= 29) {
                gpsTrackingService.startForeground(ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER, g11.c(), ((Number) f48729k.getValue()).intValue());
                return;
            } else {
                gpsTrackingService.startForeground(ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER, g11.c());
                return;
            }
        }
        u.s("notificationPresenter");
        throw null;
    }

    private final boolean j() {
        ui.d dVar = this.f48737h;
        if (dVar != null) {
            if (dVar.h()) {
                ui.d dVar2 = this.f48737h;
                if (dVar2 != null) {
                    if (dVar2.i()) {
                        ui.d dVar3 = this.f48737h;
                        if (dVar3 != null) {
                            if (dVar3.g() || k().e()) {
                                return true;
                            }
                        } else {
                            u.s("locationStateWatcher");
                            throw null;
                        }
                    }
                } else {
                    u.s("locationStateWatcher");
                    throw null;
                }
            }
            return false;
        }
        u.s("locationStateWatcher");
        throw null;
    }

    private final u70.a k() {
        return (u70.a) this.f48731b.getValue();
    }

    private final String l() {
        if (!this.f48734e) {
            return "";
        }
        if (j()) {
            String string = getString(C1987R.string.workoutNotification_content_gpsOn);
            u.i(string, "getString(...)");
            return string;
        }
        String string2 = getString(C1987R.string.workoutNotification_content_gpsOff);
        u.i(string2, "getString(...)");
        return string2;
    }

    private final void m() {
        if (this.f48734e) {
            boolean j5 = j();
            nm0.g gVar = this.f48732c;
            if (j5) {
                LiveWorkoutNotificationManager liveWorkoutNotificationManager = this.f48738i;
                if (liveWorkoutNotificationManager != null) {
                    liveWorkoutNotificationManager.b();
                    try {
                        ((na0.c) gVar.getValue()).b();
                        return;
                    } catch (SecurityException e11) {
                        x70.b.f(this, e11, "No location permission. Could not request updates.", new Object[0]);
                        return;
                    }
                }
                u.s("notificationPresenter");
                throw null;
            }
            LiveWorkoutNotificationManager liveWorkoutNotificationManager2 = this.f48738i;
            if (liveWorkoutNotificationManager2 != null) {
                r f11 = liveWorkoutNotificationManager2.f();
                this.f48739j = f11;
                if (Build.VERSION.SDK_INT >= 29) {
                    startForeground(ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER, f11.c(), ((Number) f48729k.getValue()).intValue());
                } else {
                    startForeground(ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER, f11.c());
                }
                try {
                    ((na0.c) gVar.getValue()).c();
                    return;
                } catch (SecurityException e12) {
                    x70.b.f(this, e12, "No location permission. Could not remove updates.", new Object[0]);
                    return;
                }
            }
            u.s("notificationPresenter");
            throw null;
        }
    }

    private final void n() {
        r rVar = this.f48739j;
        if (rVar != null) {
            rVar.l(l());
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER, rVar.c(), ((Number) f48729k.getValue()).intValue());
            } else {
                startForeground(ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER, rVar.c());
            }
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 0L;
    }

    @Override // u70.a.c
    public final void Q2() {
        n();
        m();
    }

    @Override // ui.d.InterfaceC1716d
    public final void b() {
        n();
        m();
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        n();
        m();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        k().h(this);
        if (this.f48734e) {
            Log.i("Stopping service", "needsGpsTracking");
            try {
                ((na0.c) this.f48732c.getValue()).c();
            } catch (SecurityException e11) {
                x70.b.f(this, e11, "No location permission. Could not remove updates.", new Object[0]);
            }
            ui.d dVar = this.f48737h;
            if (dVar != null) {
                dVar.k(this);
                LiveWorkoutNotificationManager liveWorkoutNotificationManager = this.f48738i;
                if (liveWorkoutNotificationManager != null) {
                    liveWorkoutNotificationManager.b();
                } else {
                    u.s("notificationPresenter");
                    throw null;
                }
            } else {
                u.s("locationStateWatcher");
                throw null;
            }
        }
        vh.h.b(this);
        super.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        Object obj;
        Object serializableExtra;
        super.onStartCommand(intent, i11, i12);
        User e11 = i.b().e();
        u.i(e11, "getMainUser(...)");
        this.f48733d = e11;
        x70.b.l(this, "Tracking service started", new Object[0]);
        LiveWorkout liveWorkout = null;
        Serializable serializable = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("extra_live_workout", LiveWorkout.class);
                obj = serializableExtra;
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra("extra_live_workout");
                if (serializableExtra2 instanceof LiveWorkout) {
                    serializable = serializableExtra2;
                }
                obj = (LiveWorkout) serializable;
            }
            liveWorkout = (LiveWorkout) obj;
        }
        if (liveWorkout != null) {
            this.f48738i = new LiveWorkoutNotificationManager(this);
            Object systemService = getSystemService("location");
            u.h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            this.f48737h = new ui.d(this, (LocationManager) systemService, 0);
            o d11 = vh.h.h().d(new com.withings.wiscale2.activity.workout.gps.model.b(this, liveWorkout));
            d11.s(new com.withings.wiscale2.activity.workout.gps.model.c(this, liveWorkout));
            d11.p(this);
            k().a(this);
            return 2;
        }
        throw new IllegalStateException("Should use createStartIntent function ".toString());
    }
}
