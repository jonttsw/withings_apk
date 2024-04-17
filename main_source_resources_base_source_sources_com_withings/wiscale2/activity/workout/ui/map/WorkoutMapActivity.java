package com.withings.wiscale2.activity.workout.ui.map;

import android.app.Activity;
import android.app.Application;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.camera.core.v;
import androidx.core.view.b1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.PolylineOptions;
import com.huawei.hms.maps.HuaweiMap;
import com.withings.graph.GraphView;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.location.repository.data.ktx.PaceDistanceUnitKt;
import com.withings.views.view.StatBarLayout;
import com.withings.views.view.StatBarView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.ui.map.WorkoutMapActivity;
import com.withings.wiscale2.activity.workout.ui.performance.PerformanceGraphLegendView;
import com.withings.wiscale2.graph.DataPopUpView;
import com.withings.workout.category.model.WorkoutCategory;
import cp0.n;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import l70.w;
import lj0.h0;
import nm0.y;
import tb0.z0;
/* compiled from: WorkoutMapActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/map/WorkoutMapActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutMapActivity extends Hilt_WorkoutMapActivity {

    /* renamed from: e  reason: collision with root package name */
    private HuaweiMap f49846e;

    /* renamed from: f  reason: collision with root package name */
    private GoogleMap f49847f;

    /* renamed from: g  reason: collision with root package name */
    private final i f49848g;

    /* renamed from: h  reason: collision with root package name */
    private final j f49849h;

    /* renamed from: i  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f49850i;

    /* renamed from: j  reason: collision with root package name */
    private Object f49851j;

    /* renamed from: k  reason: collision with root package name */
    private Object f49852k;

    /* renamed from: l  reason: collision with root package name */
    private l f49853l;

    /* renamed from: m  reason: collision with root package name */
    private final jm.a f49854m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public GpsLocationRepository f49855n;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public ComputePace f49856o;
    @Inject

    /* renamed from: p  reason: collision with root package name */
    public ComputeSpeed f49857p;
    @Inject

    /* renamed from: q  reason: collision with root package name */
    public HasEnoughGpsLocations f49858q;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    public FilterGpsLocationWithPause f49859r;

    /* renamed from: t  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f49845t = {v.c(WorkoutMapActivity.class, "trackId", "getTrackId()J", 0), v.c(WorkoutMapActivity.class, "category", "getCategory()Lcom/withings/workout/category/model/WorkoutCategory;", 0), v.c(WorkoutMapActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityWorkoutMapBinding;", 0)};

    /* renamed from: s  reason: collision with root package name */
    public static final a f49844s = new Object();

    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes4.dex */
    public static final class b implements k1.b {
        public b() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            u.j(modelClass, "modelClass");
            WorkoutMapActivity workoutMapActivity = WorkoutMapActivity.this;
            Application application = workoutMapActivity.getApplication();
            u.i(application, "getApplication(...)");
            long J3 = WorkoutMapActivity.J3(workoutMapActivity);
            h0 e11 = h0.e();
            u.i(e11, "get(...)");
            WorkoutManager workoutManager = WorkoutManager.Companion.get();
            GpsLocationRepository gpsLocationRepository = workoutMapActivity.f49855n;
            if (gpsLocationRepository != null) {
                w a11 = w.a.a();
                WorkoutCategory B3 = WorkoutMapActivity.B3(workoutMapActivity);
                jm.a aVar = workoutMapActivity.f49854m;
                ComputePace computePace = workoutMapActivity.f49856o;
                if (computePace != null) {
                    ComputeSpeed computeSpeed = workoutMapActivity.f49857p;
                    if (computeSpeed != null) {
                        HasEnoughGpsLocations hasEnoughGpsLocations = workoutMapActivity.f49858q;
                        if (hasEnoughGpsLocations != null) {
                            FilterGpsLocationWithPause filterGpsLocationWithPause = workoutMapActivity.f49859r;
                            if (filterGpsLocationWithPause != null) {
                                return new l(application, J3, e11, workoutManager, gpsLocationRepository, a11, B3, aVar, computePace, computeSpeed, hasEnoughGpsLocations, filterGpsLocationWithPause);
                            }
                            u.s("filterGpsLocationWithPause");
                            throw null;
                        }
                        u.s("hasEnoughGpsLocations");
                        throw null;
                    }
                    u.s("computeSpeed");
                    throw null;
                }
                u.s("computePace");
                throw null;
            }
            u.s("gpsLocationRepository");
            throw null;
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<List<? extends xa0.a>, y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(List<? extends xa0.a> list) {
            List<? extends xa0.a> it = list;
            u.j(it, "it");
            WorkoutMapActivity.L3(WorkoutMapActivity.this, it);
            return y.f85009a;
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<ab0.i, y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(ab0.i iVar) {
            ab0.i iVar2 = iVar;
            if (iVar2 != null) {
                WorkoutMapActivity.K3(WorkoutMapActivity.this, iVar2);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<Object, y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(final Object bounds) {
            u.j(bounds, "bounds");
            WorkoutMapActivity workoutMapActivity = WorkoutMapActivity.this;
            final GoogleMap googleMap = workoutMapActivity.f49847f;
            if (googleMap != null) {
                googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() { // from class: com.withings.wiscale2.activity.workout.ui.map.g
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
                    public final void onMapLoaded() {
                        Object bounds2 = bounds;
                        u.j(bounds2, "$bounds");
                        GoogleMap.this.moveCamera(CameraUpdateFactory.newLatLngBounds((LatLngBounds) bounds2, 0));
                    }
                });
            }
            final HuaweiMap huaweiMap = workoutMapActivity.f49846e;
            if (huaweiMap != null) {
                huaweiMap.setOnMapLoadedCallback(new HuaweiMap.OnMapLoadedCallback() { // from class: com.withings.wiscale2.activity.workout.ui.map.h
                    @Override // com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback
                    public final void onMapLoaded() {
                        Object bounds2 = bounds;
                        u.j(bounds2, "$bounds");
                        HuaweiMap.this.moveCamera(com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds((com.huawei.hms.maps.model.LatLngBounds) bounds2, 0));
                    }
                });
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<List<? extends vj0.c>, y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(List<? extends vj0.c> list) {
            List<? extends vj0.c> list2 = list;
            WorkoutMapActivity workoutMapActivity = WorkoutMapActivity.this;
            GoogleMap googleMap = workoutMapActivity.f49847f;
            if (googleMap != null) {
                googleMap.clear();
            }
            HuaweiMap huaweiMap = workoutMapActivity.f49846e;
            if (huaweiMap != null) {
                huaweiMap.clear();
            }
            if (list2 != null) {
                GoogleMap googleMap2 = workoutMapActivity.f49847f;
                if (googleMap2 != null) {
                    Iterator it = vj0.f.c(googleMap2, list2, Integer.valueOf(androidx.core.content.a.getColor(workoutMapActivity, C1987R.color.color_text_quaternary))).iterator();
                    while (it.hasNext()) {
                        PolylineOptions polylineOptions = (PolylineOptions) it.next();
                        GoogleMap googleMap3 = workoutMapActivity.f49847f;
                        if (googleMap3 != null) {
                            googleMap3.addPolyline(polylineOptions);
                        }
                    }
                }
                HuaweiMap huaweiMap2 = workoutMapActivity.f49846e;
                if (huaweiMap2 != null) {
                    Iterator it2 = vj0.f.d(huaweiMap2, workoutMapActivity, list2, Integer.valueOf(androidx.core.content.a.getColor(workoutMapActivity, C1987R.color.color_text_quaternary))).iterator();
                    while (it2.hasNext()) {
                        com.huawei.hms.maps.model.PolylineOptions polylineOptions2 = (com.huawei.hms.maps.model.PolylineOptions) it2.next();
                        HuaweiMap huaweiMap3 = workoutMapActivity.f49846e;
                        if (huaweiMap3 != null) {
                            huaweiMap3.addPolyline(polylineOptions2);
                        }
                    }
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<GpsLocation, y> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(GpsLocation gpsLocation) {
            Marker marker;
            com.huawei.hms.maps.model.Marker marker2;
            Marker marker3;
            GpsLocation gpsLocation2 = gpsLocation;
            WorkoutMapActivity workoutMapActivity = WorkoutMapActivity.this;
            Object obj = workoutMapActivity.f49851j;
            com.huawei.hms.maps.model.Marker marker4 = null;
            if (obj instanceof Marker) {
                marker = (Marker) obj;
            } else {
                marker = null;
            }
            if (marker != null) {
                marker.remove();
            }
            Object obj2 = workoutMapActivity.f49851j;
            if (obj2 instanceof com.huawei.hms.maps.model.Marker) {
                marker2 = (com.huawei.hms.maps.model.Marker) obj2;
            } else {
                marker2 = null;
            }
            if (marker2 != null) {
                marker2.remove();
            }
            if (gpsLocation2 != null) {
                GoogleMap googleMap = workoutMapActivity.f49847f;
                if (googleMap != null && (marker3 = vj0.f.a(googleMap, vj0.f.i(gpsLocation2), BitmapFactory.decodeResource(workoutMapActivity.getResources(), C1987R.drawable.workout_path_start))) != null) {
                    marker3.setTitle(workoutMapActivity.getString(C1987R.string.workoutFullScreen_popupStartPoint));
                    marker3.setSnippet(b50.b.t(workoutMapActivity, gpsLocation2.getDate()));
                } else {
                    marker3 = null;
                }
                workoutMapActivity.f49851j = marker3;
                HuaweiMap huaweiMap = workoutMapActivity.f49846e;
                if (huaweiMap != null) {
                    marker4 = vj0.f.b(huaweiMap, vj0.f.i(gpsLocation2), BitmapFactory.decodeResource(workoutMapActivity.getResources(), C1987R.drawable.workout_path_start));
                    marker4.setTitle(workoutMapActivity.getString(C1987R.string.workoutFullScreen_popupStartPoint));
                    marker4.setSnippet(b50.b.t(workoutMapActivity, gpsLocation2.getDate()));
                }
                workoutMapActivity.f49851j = marker4;
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.l<GpsLocation, y> {
        h() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(GpsLocation gpsLocation) {
            Marker marker;
            com.huawei.hms.maps.model.Marker marker2;
            Marker marker3;
            GpsLocation gpsLocation2 = gpsLocation;
            WorkoutMapActivity workoutMapActivity = WorkoutMapActivity.this;
            Object obj = workoutMapActivity.f49852k;
            com.huawei.hms.maps.model.Marker marker4 = null;
            if (obj instanceof Marker) {
                marker = (Marker) obj;
            } else {
                marker = null;
            }
            if (marker != null) {
                marker.remove();
            }
            Object obj2 = workoutMapActivity.f49852k;
            if (obj2 instanceof com.huawei.hms.maps.model.Marker) {
                marker2 = (com.huawei.hms.maps.model.Marker) obj2;
            } else {
                marker2 = null;
            }
            if (marker2 != null) {
                marker2.remove();
            }
            if (gpsLocation2 != null) {
                GoogleMap googleMap = workoutMapActivity.f49847f;
                if (googleMap != null && (marker3 = vj0.f.a(googleMap, vj0.f.i(gpsLocation2), BitmapFactory.decodeResource(workoutMapActivity.getResources(), C1987R.drawable.workout_path_end))) != null) {
                    marker3.setTitle(workoutMapActivity.getString(C1987R.string.workoutFullScreen_popupEndPoint));
                    marker3.setSnippet(b50.b.t(workoutMapActivity, gpsLocation2.getDate()));
                } else {
                    marker3 = null;
                }
                workoutMapActivity.f49852k = marker3;
                HuaweiMap huaweiMap = workoutMapActivity.f49846e;
                if (huaweiMap != null) {
                    marker4 = vj0.f.b(huaweiMap, vj0.f.i(gpsLocation2), BitmapFactory.decodeResource(workoutMapActivity.getResources(), C1987R.drawable.workout_path_end));
                    marker4.setTitle(workoutMapActivity.getString(C1987R.string.workoutFullScreen_popupEndPoint));
                    marker4.setSnippet(b50.b.t(workoutMapActivity, gpsLocation2.getDate()));
                }
                workoutMapActivity.f49852k = marker4;
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class i implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49867a = nm0.h.b(new com.withings.wiscale2.activity.workout.ui.map.i(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49868b;

        public i(Activity activity) {
            this.f49868b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f49867a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class j implements bn0.d<Activity, WorkoutCategory> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49869a = nm0.h.b(new com.withings.wiscale2.activity.workout.ui.map.j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49870b;

        public j(Activity activity) {
            this.f49870b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.workout.category.model.WorkoutCategory] */
        @Override // bn0.d
        public final WorkoutCategory getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f49869a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, z0> {
        @Override // ym0.l
        public final z0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return z0.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WorkoutMapActivity() {
        super(0);
        this.f49848g = new i(this);
        this.f49849h = new j(this);
        this.f49850i = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f49854m = a.d.a(this);
    }

    public static void A3(WorkoutMapActivity this$0, GoogleMap it) {
        u.j(this$0, "this$0");
        u.j(it, "it");
        this$0.f49847f = it;
        this$0.P3();
    }

    public static final WorkoutCategory B3(WorkoutMapActivity workoutMapActivity) {
        return (WorkoutCategory) workoutMapActivity.f49849h.getValue(workoutMapActivity, f49845t[1]);
    }

    public static final qf0.b G3(WorkoutMapActivity workoutMapActivity, float f11) {
        return new qf0.b(jm.a.c(workoutMapActivity.f49854m, 37, f11, 0, 0, 60).toString(), workoutMapActivity.getString(C1987R.string._ELEVATION_));
    }

    public static final qf0.b H3(WorkoutMapActivity workoutMapActivity, float f11) {
        l lVar = workoutMapActivity.f49853l;
        if (lVar != null) {
            Integer num = (Integer) lVar.F0().getValue();
            l lVar2 = workoutMapActivity.f49853l;
            if (lVar2 != null) {
                if (lVar2.O0() && num != null) {
                    ComputePace computePace = workoutMapActivity.f49856o;
                    if (computePace != null) {
                        return new qf0.b(jm.a.c(workoutMapActivity.f49854m, 126, computePace.fromSpeed(f11, PaceDistanceUnitKt.PaceDistanceUnit(num.intValue())).getMillis(), 0, 0, 60).toString(), workoutMapActivity.getString(C1987R.string.workout_detailView_pace));
                    }
                    u.s("computePace");
                    throw null;
                }
                return new qf0.b(jm.a.c(workoutMapActivity.f49854m, 72, f11, 0, 0, 60).toString(), workoutMapActivity.getString(C1987R.string._SPEED_));
            }
            u.s("viewModel");
            throw null;
        }
        u.s("viewModel");
        throw null;
    }

    public static final long J3(WorkoutMapActivity workoutMapActivity) {
        return ((Number) workoutMapActivity.f49848g.getValue(workoutMapActivity, f49845t[0])).longValue();
    }

    public static final void K3(WorkoutMapActivity workoutMapActivity, ab0.i iVar) {
        z0 O3 = workoutMapActivity.O3();
        O3.f99669e.i();
        GraphView graphView = O3.f99669e;
        graphView.h();
        graphView.setZoomEnabled(false);
        ab0.h a11 = iVar.a();
        DataPopUpView workoutPerformancePopup = O3.f99672h;
        u.i(workoutPerformancePopup, "workoutPerformancePopup");
        ab0.k kVar = new ab0.k(graphView, workoutPerformancePopup, a11, new com.withings.wiscale2.activity.workout.ui.map.e(workoutMapActivity));
        List<rs.e> mainDatumList = a11.f66439a;
        u.i(mainDatumList, "mainDatumList");
        boolean z5 = !mainDatumList.isEmpty();
        if (z5) {
            kVar.x(iVar.g(), iVar.b());
            ab0.m d11 = iVar.d();
            z0 O32 = workoutMapActivity.O3();
            O32.f99670f.setPaceVisibility(d11.b());
            boolean a12 = d11.a();
            PerformanceGraphLegendView performanceGraphLegendView = O32.f99670f;
            performanceGraphLegendView.setElevationVisibility(a12);
            performanceGraphLegendView.t(d11.c());
        }
        kVar.C(new com.withings.wiscale2.activity.workout.model.b(O3, z5));
    }

    public static final void L3(WorkoutMapActivity workoutMapActivity, List list) {
        StatBarLayout statbar = workoutMapActivity.O3().f99667c;
        u.i(statbar, "statbar");
        List A = n.A(n.h(b1.a(statbar), com.withings.wiscale2.activity.workout.ui.map.f.f49876a));
        int min = Math.min(4, list.size());
        for (int i11 = 0; i11 < min; i11++) {
            xa0.a aVar = (xa0.a) list.get(i11);
            StatBarView statBarView = (StatBarView) A.get(i11);
            statBarView.setId(aVar.a());
            statBarView.setVisibility(0);
            statBarView.setLabel(aVar.b());
            statBarView.setValue(aVar.c());
        }
    }

    private final z0 O3() {
        return (z0) ((LifecycleViewBindingProperty) this.f49850i).getValue(this, f49845t[2]);
    }

    private final void P3() {
        GoogleMap googleMap = this.f49847f;
        if (googleMap != null) {
            vj0.f.e(googleMap, this, C1987R.raw.google_workout_map_fullscreen_style, false, true, true, null);
        }
        HuaweiMap huaweiMap = this.f49846e;
        if (huaweiMap != null) {
            vj0.f.f(huaweiMap, this, C1987R.raw.google_workout_map_fullscreen_style, false, true, true, null);
        }
        l lVar = this.f49853l;
        if (lVar != null) {
            xw.d.c(this, lVar.B0(), new e());
            l lVar2 = this.f49853l;
            if (lVar2 != null) {
                xw.d.c(this, lVar2.M0(), new f());
                l lVar3 = this.f49853l;
                if (lVar3 != null) {
                    xw.d.c(this, lVar3.R0(), new g());
                    l lVar4 = this.f49853l;
                    if (lVar4 != null) {
                        xw.d.c(this, lVar4.G0(), new h());
                        return;
                    } else {
                        u.s("viewModel");
                        throw null;
                    }
                }
                u.s("viewModel");
                throw null;
            }
            u.s("viewModel");
            throw null;
        }
        u.s("viewModel");
        throw null;
    }

    public static void z3(WorkoutMapActivity this$0, HuaweiMap huaweiMap) {
        u.j(this$0, "this$0");
        this$0.f49846e = huaweiMap;
        this$0.P3();
    }

    @Override // com.withings.wiscale2.activity.workout.ui.map.Hilt_WorkoutMapActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportFragmentManager().g(new androidx.fragment.app.h0() { // from class: com.withings.wiscale2.activity.workout.ui.map.b
            @Override // androidx.fragment.app.h0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                WorkoutMapActivity.a aVar = WorkoutMapActivity.f49844s;
                final WorkoutMapActivity this$0 = WorkoutMapActivity.this;
                u.j(this$0, "this$0");
                u.j(fragmentManager, "<anonymous parameter 0>");
                u.j(fragment, "fragment");
                if (fragment instanceof SupportMapFragment) {
                    SupportMapFragment supportMapFragment = (SupportMapFragment) fragment;
                    View view = supportMapFragment.getView();
                    if (view != null) {
                        view.setClickable(false);
                    }
                    supportMapFragment.getMapAsync(new OnMapReadyCallback() { // from class: com.withings.wiscale2.activity.workout.ui.map.c
                        @Override // com.google.android.gms.maps.OnMapReadyCallback
                        public final void onMapReady(GoogleMap googleMap) {
                            WorkoutMapActivity.A3(WorkoutMapActivity.this, googleMap);
                        }
                    });
                } else if (fragment instanceof com.huawei.hms.maps.SupportMapFragment) {
                    com.huawei.hms.maps.SupportMapFragment supportMapFragment2 = (com.huawei.hms.maps.SupportMapFragment) fragment;
                    View view2 = supportMapFragment2.getView();
                    if (view2 != null) {
                        view2.setClickable(false);
                    }
                    supportMapFragment2.getMapAsync(new com.huawei.hms.maps.OnMapReadyCallback() { // from class: com.withings.wiscale2.activity.workout.ui.map.d
                        @Override // com.huawei.hms.maps.OnMapReadyCallback
                        public final void onMapReady(HuaweiMap huaweiMap) {
                            WorkoutMapActivity.z3(WorkoutMapActivity.this, huaweiMap);
                        }
                    });
                }
            }
        });
        mm.a aVar = mm.a.f82252a;
        if (aVar.a()) {
            m0 m11 = getSupportFragmentManager().m();
            m11.l(O3().f99666b.getId(), SupportMapFragment.newInstance(), null);
            m11.f();
        } else if (aVar.c()) {
            m0 m12 = getSupportFragmentManager().m();
            m12.l(O3().f99666b.getId(), com.huawei.hms.maps.SupportMapFragment.newInstance(), null);
            m12.f();
        } else {
            finish();
            return;
        }
        O3().f99665a.setOnClickListener(new androidx.viewpager.widget.c(this, 8));
        l lVar = (l) new k1(this, new b()).a(l.class);
        xw.d.c(this, lVar.T0(), new c());
        xw.d.c(this, lVar.K0(), new d());
        this.f49853l = lVar;
    }
}
