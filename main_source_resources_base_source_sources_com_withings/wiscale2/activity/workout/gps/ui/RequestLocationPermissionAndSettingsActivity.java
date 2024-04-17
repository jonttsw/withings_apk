package com.withings.wiscale2.activity.workout.gps.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.camera.core.v;
import androidx.navigation.b0;
import androidx.navigation.c0;
import androidx.navigation.compose.r;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.gps.ui.RequestLocationPermissionAndSettingsActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import yk.o;
import ym0.p;
/* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/activity/workout/gps/ui/RequestLocationPermissionAndSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "CloseActivityBroadcastReceiver", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RequestLocationPermissionAndSettingsActivity extends WithingsActivity {

    /* renamed from: c  reason: collision with root package name */
    private ui.d f48764c;

    /* renamed from: e  reason: collision with root package name */
    private n f48766e;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f48761g = {v.c(RequestLocationPermissionAndSettingsActivity.class, "askBackground", "getAskBackground()Z", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f48760f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final e f48762a = new e(this);

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f48763b = nm0.h.b(new d());

    /* renamed from: d  reason: collision with root package name */
    private CloseActivityBroadcastReceiver f48765d = new CloseActivityBroadcastReceiver();

    /* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/gps/ui/RequestLocationPermissionAndSettingsActivity$CloseActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class CloseActivityBroadcastReceiver extends BroadcastReceiver {
        public CloseActivityBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            u.j(context, "context");
            u.j(intent, "intent");
            RequestLocationPermissionAndSettingsActivity.this.finish();
        }
    }

    /* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(a aVar, Context context) {
            aVar.getClass();
            u.j(context, "context");
            Intent putExtra = new Intent(context, RequestLocationPermissionAndSettingsActivity.class).putExtra("EXTRA_SCREEN_TITLE", C1987R.string.liveWorkout_locationPermission_title).putExtra("EXTRA_SCREEN_MESSAGE", C1987R.string.liveWorkout_locationPermission_desc).putExtra("EXTRA_ASK_BACKGROUND", false);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n c11 = r.c(new c0[0], aVar2);
                RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity = RequestLocationPermissionAndSettingsActivity.this;
                requestLocationPermissionAndSettingsActivity.f48766e = c11;
                o.b(false, s1.b.b(aVar2, 955884664, new k(requestLocationPermissionAndSettingsActivity)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.l<b0, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f48769a = new w(1);

        @Override // ym0.l
        public final y invoke(b0 b0Var) {
            b0 navigate = b0Var;
            u.j(navigate, "$this$navigate");
            navigate.g();
            return y.f85009a;
        }
    }

    /* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<u70.k> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final u70.k invoke() {
            return new u70.k(RequestLocationPermissionAndSettingsActivity.this);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48771a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48772b;

        public e(Activity activity) {
            this.f48772b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f48771a.getValue();
        }
    }

    public static final void A3(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29) {
            ui.d dVar = requestLocationPermissionAndSettingsActivity.f48764c;
            if (dVar != null) {
                if (!dVar.h()) {
                    requestLocationPermissionAndSettingsActivity.F3(new String[]{"android.permission.ACCESS_FINE_LOCATION"});
                    return;
                }
                requestLocationPermissionAndSettingsActivity.setResult(-1);
                requestLocationPermissionAndSettingsActivity.finish();
                return;
            }
            u.s("locationStateWatcher");
            throw null;
        } else if (i11 == 29) {
            ui.d dVar2 = requestLocationPermissionAndSettingsActivity.f48764c;
            if (dVar2 != null) {
                if (dVar2.h()) {
                    ui.d dVar3 = requestLocationPermissionAndSettingsActivity.f48764c;
                    if (dVar3 != null) {
                        if (dVar3.g()) {
                            requestLocationPermissionAndSettingsActivity.setResult(-1);
                            requestLocationPermissionAndSettingsActivity.finish();
                            return;
                        }
                    } else {
                        u.s("locationStateWatcher");
                        throw null;
                    }
                }
                requestLocationPermissionAndSettingsActivity.F3(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"});
                return;
            }
            u.s("locationStateWatcher");
            throw null;
        } else if (i11 >= 30) {
            ui.d dVar4 = requestLocationPermissionAndSettingsActivity.f48764c;
            if (dVar4 != null) {
                if (!dVar4.h()) {
                    requestLocationPermissionAndSettingsActivity.F3(new String[]{"android.permission.ACCESS_FINE_LOCATION"});
                    return;
                }
                ui.d dVar5 = requestLocationPermissionAndSettingsActivity.f48764c;
                if (dVar5 != null) {
                    if (dVar5.g()) {
                        requestLocationPermissionAndSettingsActivity.setResult(-1);
                        requestLocationPermissionAndSettingsActivity.finish();
                        return;
                    }
                    return;
                }
                u.s("locationStateWatcher");
                throw null;
            }
            u.s("locationStateWatcher");
            throw null;
        } else {
            requestLocationPermissionAndSettingsActivity.getClass();
        }
    }

    public static final void C3(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity, n nVar) {
        requestLocationPermissionAndSettingsActivity.getClass();
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
        for (int i11 = 0; i11 < 2; i11++) {
            if (!((u70.k) requestLocationPermissionAndSettingsActivity.f48763b.getValue()).a(strArr[i11])) {
                androidx.navigation.e.L(nVar, "requestLocationPermission/askSecondPermission", null, 6);
                return;
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 29) {
            ui.d dVar = requestLocationPermissionAndSettingsActivity.f48764c;
            if (dVar != null) {
                if (dVar.h()) {
                    ui.d dVar2 = requestLocationPermissionAndSettingsActivity.f48764c;
                    if (dVar2 != null) {
                        if (dVar2.i()) {
                            requestLocationPermissionAndSettingsActivity.setResult(-1);
                            requestLocationPermissionAndSettingsActivity.finish();
                            return;
                        }
                    } else {
                        u.s("locationStateWatcher");
                        throw null;
                    }
                }
                androidx.navigation.e.L(nVar, "requestLocationPermission/foregroundPermission", null, 6);
                return;
            }
            u.s("locationStateWatcher");
            throw null;
        } else if (i12 == 29) {
            ui.d dVar3 = requestLocationPermissionAndSettingsActivity.f48764c;
            if (dVar3 != null) {
                if (dVar3.g()) {
                    ui.d dVar4 = requestLocationPermissionAndSettingsActivity.f48764c;
                    if (dVar4 != null) {
                        if (dVar4.h()) {
                            ui.d dVar5 = requestLocationPermissionAndSettingsActivity.f48764c;
                            if (dVar5 != null) {
                                if (dVar5.i()) {
                                    requestLocationPermissionAndSettingsActivity.setResult(-1);
                                    requestLocationPermissionAndSettingsActivity.finish();
                                    return;
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
                androidx.navigation.e.L(nVar, "requestLocationPermission/foregroundPermission", null, 6);
                return;
            }
            u.s("locationStateWatcher");
            throw null;
        } else if (i12 > 29) {
            ui.d dVar6 = requestLocationPermissionAndSettingsActivity.f48764c;
            if (dVar6 != null) {
                if (dVar6.h()) {
                    ui.d dVar7 = requestLocationPermissionAndSettingsActivity.f48764c;
                    if (dVar7 != null) {
                        if (dVar7.i()) {
                            ui.d dVar8 = requestLocationPermissionAndSettingsActivity.f48764c;
                            if (dVar8 != null) {
                                if (!dVar8.g()) {
                                    androidx.navigation.e.L(nVar, "requestLocationPermission/backgroundPermission", null, 6);
                                    return;
                                }
                                requestLocationPermissionAndSettingsActivity.setResult(-1);
                                requestLocationPermissionAndSettingsActivity.finish();
                                return;
                            }
                            u.s("locationStateWatcher");
                            throw null;
                        }
                    } else {
                        u.s("locationStateWatcher");
                        throw null;
                    }
                }
                androidx.navigation.e.L(nVar, "requestLocationPermission/foregroundPermission", null, 6);
                return;
            }
            u.s("locationStateWatcher");
            throw null;
        }
    }

    private final void F3(String[] strArr) {
        for (String str : strArr) {
            nm0.g gVar = this.f48763b;
            if (((u70.k) gVar.getValue()).a(str) || androidx.core.app.a.h(this, str)) {
                androidx.core.app.a.d(this, strArr, 456);
                for (String str2 : strArr) {
                    ((u70.k) gVar.getValue()).b(str2);
                }
                return;
            }
        }
        G3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3() {
        String packageName = getPackageName();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + packageName));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        startActivityForResult(intent, 456);
    }

    public static final void z3(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity) {
        ui.d dVar = requestLocationPermissionAndSettingsActivity.f48764c;
        if (dVar != null) {
            if (!dVar.g()) {
                requestLocationPermissionAndSettingsActivity.F3(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"});
                return;
            }
            requestLocationPermissionAndSettingsActivity.setResult(-1);
            requestLocationPermissionAndSettingsActivity.finish();
            return;
        }
        u.s("locationStateWatcher");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 245) {
            setResult(i12);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object systemService = getSystemService("location");
        u.h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.f48764c = new ui.d(this, (LocationManager) systemService, 0);
        androidx.core.content.a.registerReceiver(this, this.f48765d, new IntentFilter("com.withings.wiscale2.activity.workout.gps.model.ui.closeRequestLocationPermissionAndSettingsActivity"), 4);
        e.k.a(this, new s1.a(true, 886409950, new b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ay.b.w(this, this.f48765d);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        u.j(permissions, "permissions");
        u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        if (i11 == 456 && kotlin.collections.l.m(permissions, "android.permission.ACCESS_FINE_LOCATION")) {
            if (kotlin.collections.l.l(grantResults, -1)) {
                finish();
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                ui.d dVar = this.f48764c;
                if (dVar != null) {
                    if (!dVar.g()) {
                        n nVar = this.f48766e;
                        if (nVar != null) {
                            nVar.J("requestLocationPermission/backgroundPermission", c.f48769a);
                            return;
                        } else {
                            u.s("navHostController");
                            throw null;
                        }
                    }
                } else {
                    u.s("locationStateWatcher");
                    throw null;
                }
            }
            ui.d dVar2 = this.f48764c;
            if (dVar2 != null) {
                if (!dVar2.i()) {
                    LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
                    LocationRequest locationRequest = new LocationRequest();
                    locationRequest.setPriority(100);
                    locationRequest.setInterval(5000L);
                    locationRequest.setSmallestDisplacement(10.0f);
                    locationRequest.setFastestInterval(5000L);
                    LocationSettingsRequest build = builder.addLocationRequest(locationRequest).setAlwaysShow(true).build();
                    u.i(build, "build(...)");
                    LocationServices.getSettingsClient((Activity) this).checkLocationSettings(build).addOnCompleteListener(new OnCompleteListener() { // from class: oa0.b
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            RequestLocationPermissionAndSettingsActivity.a aVar = RequestLocationPermissionAndSettingsActivity.f48760f;
                            RequestLocationPermissionAndSettingsActivity this$0 = RequestLocationPermissionAndSettingsActivity.this;
                            u.j(this$0, "this$0");
                            u.j(task, "task");
                            try {
                                task.getResult(ApiException.class);
                            } catch (ApiException e11) {
                                if (e11.getStatusCode() == 6) {
                                    try {
                                        ((ResolvableApiException) e11).startResolutionForResult(this$0, ConstantsWs.WS_STATUS_MISSING);
                                    } catch (Exception e12) {
                                        x70.b.n(e12);
                                    }
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            u.s("locationStateWatcher");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z5 = false;
        if (((Boolean) this.f48762a.getValue(this, f48761g[0])).booleanValue()) {
            ui.d dVar = this.f48764c;
            if (dVar != null) {
                if (!dVar.g()) {
                    z5 = true;
                }
            } else {
                u.s("locationStateWatcher");
                throw null;
            }
        }
        ui.d dVar2 = this.f48764c;
        if (dVar2 != null) {
            if (dVar2.h()) {
                ui.d dVar3 = this.f48764c;
                if (dVar3 != null) {
                    if (dVar3.i() && !z5) {
                        setResult(-1);
                        finish();
                        return;
                    }
                    return;
                }
                u.s("locationStateWatcher");
                throw null;
            }
            return;
        }
        u.s("locationStateWatcher");
        throw null;
    }
}
