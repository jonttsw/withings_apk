package com.withings.wiscale2.device.common.feature.workout;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.fragment.app.n;
import androidx.navigation.e;
import androidx.navigation.t;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.features.platform.model.RoomPlatformFeatureRepository;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.u;
import fn0.k;
import gi.i;
import io.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import tb0.a1;
import ym0.l;
/* compiled from: WorkoutTutorialActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/workout/WorkoutTutorialActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutTutorialActivity extends Hilt_WorkoutTutorialActivity {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f52640m = {v.c(WorkoutTutorialActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), v.c(WorkoutTutorialActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityWorkoutTutorialBinding;", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final c f52641e;

    /* renamed from: f  reason: collision with root package name */
    private final g f52642f;

    /* renamed from: g  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f52643g;

    /* renamed from: h  reason: collision with root package name */
    private final g f52644h;

    /* renamed from: i  reason: collision with root package name */
    private final Handler f52645i;

    /* renamed from: j  reason: collision with root package name */
    private final n f52646j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public u f52647k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f52648l;

    /* compiled from: WorkoutTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<PlatformFeatureRepository> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f52649a = new w(0);

        @Override // ym0.a
        public final PlatformFeatureRepository invoke() {
            return RoomPlatformFeatureRepository.Companion.get();
        }
    }

    /* compiled from: WorkoutTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<androidx.navigation.e> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(WorkoutTutorialActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final g f52651a = h.b(new e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52652b;

        public c(Activity activity) {
            this.f52652b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52651a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements l<ComponentActivity, a1> {
        @Override // ym0.l
        public final a1 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return a1.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WorkoutTutorialActivity() {
        super(0);
        this.f52641e = new c(this);
        this.f52642f = h.b(new b());
        this.f52643g = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f52644h = h.b(a.f52649a);
        this.f52645i = new Handler(Looper.getMainLooper());
        this.f52646j = new n(this, 3);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new androidx.activity.result.a() { // from class: com.withings.wiscale2.device.common.feature.workout.b
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                WorkoutTutorialActivity.z3(WorkoutTutorialActivity.this);
            }
        });
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f52648l = registerForActivityResult;
    }

    public static void A3(WorkoutTutorialActivity this$0) {
        Integer num;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.workout_intro) {
            this$0.getNavController().H(C1987R.id.action_intro_to_short_press, null);
        } else if (num != null && num.intValue() == C1987R.id.workout_short_press) {
            this$0.getNavController().H(C1987R.id.action_short_to_long_press, null);
        } else if (num != null && num.intValue() == C1987R.id.workout_long_press) {
            this$0.getNavController().H(C1987R.id.action_long_press_to_track, null);
        } else if (num != null && num.intValue() == C1987R.id.workout_track) {
            this$0.getNavController().H(C1987R.id.action_track_to_run, null);
        } else if (num != null && num.intValue() == C1987R.id.workout_run) {
            if (!this$0.I3()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 == 28) {
                    wq.a.p(4321, this$0);
                    return;
                } else if (i11 == 29) {
                    wq.a.o(4321, this$0);
                    return;
                } else if (i11 >= 30) {
                    boolean a11 = wq.a.a(this$0, "android.permission.ACCESS_FINE_LOCATION");
                    boolean a12 = wq.a.a(this$0, "android.permission.ACCESS_COARSE_LOCATION");
                    if (a11 && a12) {
                        if (!wq.a.a(this$0, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                            androidx.core.app.a.d(this$0, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 4321);
                            return;
                        }
                        return;
                    }
                    wq.a.p(4321, this$0);
                    return;
                } else {
                    this$0.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 4321);
                    return;
                }
            }
            this$0.getNavController().H(C1987R.id.action_run_to_done, null);
        } else if (num != null && num.intValue() == C1987R.id.workout_full_gps) {
            if (!this$0.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                this$0.H3();
            } else if (!wq.a.a(this$0, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                androidx.core.app.a.d(this$0, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 4321);
            }
        } else if ((num != null && num.intValue() == C1987R.id.workout_no_gps) || (num != null && num.intValue() == C1987R.id.workout_no_bluetooth)) {
            this$0.H3();
        } else if (num != null && num.intValue() == C1987R.id.workout_done) {
            this$0.finish();
        }
    }

    public static void B3(WorkoutTutorialActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.getNavController().H(C1987R.id.workout_done, null);
    }

    public static void C3(WorkoutTutorialActivity this$0) {
        Integer num;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.workout_full_gps) {
            this$0.getNavController().H(C1987R.id.action_full_gps_to_no_gps, null);
        } else if (num != null && num.intValue() == C1987R.id.workout_no_gps) {
            this$0.getNavController().H(C1987R.id.action_no_gps_to_no_bluetooth, null);
        } else if (num != null && num.intValue() == C1987R.id.workout_no_bluetooth) {
            this$0.getNavController().H(C1987R.id.action_no_bluetooth_to_done, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        if (r10.I3() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
        r6 = com.withings.wiscale2.C1987R.string._ACTIVATE_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r10.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D3(com.withings.wiscale2.device.common.feature.workout.WorkoutTutorialActivity r10, androidx.navigation.e r11, androidx.navigation.t r12) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.workout.WorkoutTutorialActivity.D3(com.withings.wiscale2.device.common.feature.workout.WorkoutTutorialActivity, androidx.navigation.e, androidx.navigation.t):void");
    }

    public static final Device E3(WorkoutTutorialActivity workoutTutorialActivity) {
        return (Device) workoutTutorialActivity.f52641e.getValue(workoutTutorialActivity, f52640m[0]);
    }

    public static final PlatformFeatureRepository F3(WorkoutTutorialActivity workoutTutorialActivity) {
        return (PlatformFeatureRepository) workoutTutorialActivity.f52644h.getValue();
    }

    private final a1 G3() {
        Object value = ((LifecycleViewBindingProperty) this.f52643g).getValue(this, f52640m[1]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (a1) value;
    }

    private final void H3() {
        String packageName = getPackageName();
        this.f52648l.a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + packageName)));
    }

    private final boolean I3() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 28) {
            boolean a11 = wq.a.a(this, "android.permission.ACCESS_FINE_LOCATION");
            boolean a12 = wq.a.a(this, "android.permission.ACCESS_COARSE_LOCATION");
            if (!a11 || !a12) {
                return false;
            }
        } else if (i11 >= 29) {
            boolean a13 = wq.a.a(this, "android.permission.ACCESS_FINE_LOCATION");
            boolean a14 = wq.a.a(this, "android.permission.ACCESS_COARSE_LOCATION");
            boolean a15 = wq.a.a(this, "android.permission.ACCESS_BACKGROUND_LOCATION");
            if (!a13 || !a14 || !a15) {
                return false;
            }
        } else {
            return wq.a.a(this, "android.permission.ACCESS_FINE_LOCATION");
        }
        return true;
    }

    private final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.f52642f.getValue();
    }

    public static void z3(WorkoutTutorialActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (this$0.I3()) {
            this$0.f52645i.postDelayed(this$0.f52646j, 200L);
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.workout.Hilt_WorkoutTutorialActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getNavController().p(new e.b() { // from class: com.withings.wiscale2.device.common.feature.workout.c
            @Override // androidx.navigation.e.b
            public final void X0(androidx.navigation.e eVar, t tVar, Bundle bundle2) {
                WorkoutTutorialActivity.D3(WorkoutTutorialActivity.this, eVar, tVar);
            }
        });
        setSupportActionBar(G3().f98850d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        a1 G3 = G3();
        G3.f98848b.setOnClickListener(new j(this, 5));
        a1 G32 = G3();
        G32.f98849c.setOnClickListener(new i(this, 4));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        if (i11 == 4321) {
            getNavController().N();
            int length = grantResults.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (grantResults[i12] != 0) {
                        break;
                    }
                    i12++;
                } else if (I3()) {
                    getNavController().H(C1987R.id.workout_done, null);
                    return;
                }
            }
            getNavController().H(C1987R.id.workout_full_gps, null);
        }
    }
}
