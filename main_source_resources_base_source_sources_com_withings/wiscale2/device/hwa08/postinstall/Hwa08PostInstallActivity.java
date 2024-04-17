package com.withings.wiscale2.device.hwa08.postinstall;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import androidx.lifecycle.k1;
import com.google.android.material.button.MaterialButton;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.explanation.Explanation;
import com.withings.wiscale2.C1987R;
import e80.b;
import javax.inject.Inject;
import kotlin.Metadata;
import qc0.b;
import qc0.r;
/* compiled from: Hwa08PostInstallActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/device/hwa08/postinstall/Hwa08PostInstallActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lqc0/b$a;", "Lqc0/r$a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "EcgMeasurementEndBroadcastReceiver", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa08PostInstallActivity extends Hilt_Hwa08PostInstallActivity implements b.a, r.a {

    /* renamed from: h  reason: collision with root package name */
    private c0 f54409h;

    /* renamed from: j  reason: collision with root package name */
    private Toolbar f54411j;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public fy.p f54413l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public bx.a f54414m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54405o = {androidx.camera.core.v.c(Hwa08PostInstallActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(Hwa08PostInstallActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(Hwa08PostInstallActivity.class, "allowQuit", "getAllowQuit()Z", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final b f54404n = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final d f54406e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private final e f54407f = new e(this);

    /* renamed from: g  reason: collision with root package name */
    private final f f54408g = new f(this);

    /* renamed from: i  reason: collision with root package name */
    private EcgMeasurementEndBroadcastReceiver f54410i = new EcgMeasurementEndBroadcastReceiver();

    /* renamed from: k  reason: collision with root package name */
    private final a f54412k = new a();

    /* compiled from: Hwa08PostInstallActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa08/postinstall/Hwa08PostInstallActivity$EcgMeasurementEndBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class EcgMeasurementEndBroadcastReceiver extends BroadcastReceiver {
        public EcgMeasurementEndBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(intent, "intent");
            c0 c0Var = Hwa08PostInstallActivity.this.f54409h;
            if (c0Var != null) {
                c0Var.T0();
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        }
    }

    /* compiled from: Hwa08PostInstallActivity.kt */
    /* loaded from: classes5.dex */
    public final class a implements FragmentManager.l {
        public a() {
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public final void c() {
            View view;
            Fragment Y = Hwa08PostInstallActivity.this.getSupportFragmentManager().Y("handWrist");
            if (Y != null && (view = Y.getView()) != null) {
                MaterialButton materialButton = (MaterialButton) view.findViewById(C1987R.id.explanation_bottom_button);
                kotlin.jvm.internal.u.g(materialButton);
                materialButton.setVisibility(4);
                MaterialButton materialButton2 = (MaterialButton) view.findViewById(C1987R.id.explanation_button_positive_with_same_style_as_negative);
                materialButton2.setText(materialButton.getText());
                materialButton2.setOnClickListener(new androidx.viewpager.widget.d(materialButton, 6));
                materialButton2.setVisibility(0);
            }
        }
    }

    /* compiled from: Hwa08PostInstallActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hwa08PostInstallActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<Explanation, View, nm0.y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(Explanation explanation, View view) {
            kotlin.jvm.internal.u.j(explanation, "<anonymous parameter 0>");
            kotlin.jvm.internal.u.j(view, "<anonymous parameter 1>");
            c0 c0Var = Hwa08PostInstallActivity.this.f54409h;
            if (c0Var != null) {
                c0Var.T0();
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54418a = nm0.h.b(new x(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54419b;

        public d(Activity activity) {
            this.f54419b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54418a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54420a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54421b;

        public e(Activity activity) {
            this.f54421b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54420a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54422a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54423b;

        public f(Activity activity) {
            this.f54423b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54422a.getValue();
        }
    }

    public static final void A3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_positionDeviceTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.installation_positionDeviceDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string.deviceDetailView_wristUsed_right);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(2131232838, null, string, string2, string3, hwa08PostInstallActivity.getString(C1987R.string.deviceDetailView_wristUsed_left), 10);
        com.withings.wiscale2.device.hwa08.postinstall.d dVar = new com.withings.wiscale2.device.hwa08.postinstall.d(hwa08PostInstallActivity);
        com.withings.wiscale2.device.hwa08.postinstall.c cVar = new com.withings.wiscale2.device.hwa08.postinstall.c(hwa08PostInstallActivity);
        e80.b.f64938f.getClass();
        e80.b b10 = b.a.b(explanation, dVar, cVar);
        m0 m11 = hwa08PostInstallActivity.getSupportFragmentManager().m();
        m11.l(C1987R.id.content, b10, "handWrist");
        m11.e(null);
        m11.f();
    }

    public static final boolean B3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        return ((Boolean) hwa08PostInstallActivity.f54408g.getValue(hwa08PostInstallActivity, f54405o[2])).booleanValue();
    }

    public static final Device C3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        return (Device) hwa08PostInstallActivity.f54407f.getValue(hwa08PostInstallActivity, f54405o[1]);
    }

    public static final User F3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        return (User) hwa08PostInstallActivity.f54406e.getValue(hwa08PostInstallActivity, f54405o[0]);
    }

    public static final void G3(Hwa08PostInstallActivity hwa08PostInstallActivity, int i11) {
        c0 c0Var = hwa08PostInstallActivity.f54409h;
        if (c0Var != null) {
            c0Var.g0(i11);
            c0 c0Var2 = hwa08PostInstallActivity.f54409h;
            if (c0Var2 != null) {
                c0Var2.T0();
                return;
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("postInstallViewModel");
        throw null;
    }

    public static final void H3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/activity-goals.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_ActivityGoalsTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_ActivityGoalsDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        hwa08PostInstallActivity.R3(new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT));
    }

    public static final void I3(Hwa08PostInstallActivity hwa08PostInstallActivity, Boolean bool) {
        int i11;
        Toolbar toolbar = hwa08PostInstallActivity.f54411j;
        if (toolbar != null) {
            if (bool != null && bool.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            toolbar.setVisibility(i11);
            return;
        }
        kotlin.jvm.internal.u.s("toolbar");
        throw null;
    }

    public static final void J3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/hwa08_tutorial_AFib.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_aFibDetectionTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_aFibDetectionDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        hwa08PostInstallActivity.R3(new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT));
    }

    public static final void K3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/hwa08_tutorial_ECG.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_electrocardiogramTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_electrocardiogramDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        hwa08PostInstallActivity.R3(new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT));
    }

    public static final void L3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/hwa08_tutorial_noAttacks.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_strokesDetectionTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_strokesDetectionDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        hwa08PostInstallActivity.R3(new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT));
    }

    public static final void M3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_bluetoothTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_bluetoothDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        hwa08PostInstallActivity.R3(new Explanation(2131232531, null, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION));
    }

    public static final void N3(Hwa08PostInstallActivity hwa08PostInstallActivity, int i11) {
        hwa08PostInstallActivity.getClass();
        r.b bVar = qc0.r.f92540m;
        fn0.k<Object>[] kVarArr = f54405o;
        fn0.k<Object> kVar = kVarArr[0];
        fn0.k<Object> kVar2 = kVarArr[1];
        bVar.getClass();
        qc0.r a11 = r.b.a(i11, (User) hwa08PostInstallActivity.f54406e.getValue(hwa08PostInstallActivity, kVar), (Device) hwa08PostInstallActivity.f54407f.getValue(hwa08PostInstallActivity, kVar2), C1987R.drawable.hwa06_post_install_summary);
        a11.A1(hwa08PostInstallActivity);
        Q3(hwa08PostInstallActivity, a11);
    }

    public static final void O3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/workoutSession-start.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_workoutSessionStopTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_workoutSessionStopDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        hwa08PostInstallActivity.R3(new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT));
    }

    public static final void P3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/workoutSession-start.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_workoutSessionStartTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_workoutSessionStartDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        hwa08PostInstallActivity.R3(new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Q3(Hwa08PostInstallActivity hwa08PostInstallActivity, Fragment fragment) {
        m0 m11 = hwa08PostInstallActivity.getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.e(null);
        m11.f();
    }

    private final void R3(Explanation explanation) {
        b.a aVar = e80.b.f64938f;
        c cVar = new c();
        aVar.getClass();
        Q3(this, b.a.a(explanation, cVar));
    }

    public static final void z3(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        hwa08PostInstallActivity.getClass();
        b.C1541b c1541b = qc0.b.f92458p;
        fn0.k<Object>[] kVarArr = f54405o;
        fn0.k<Object> kVar = kVarArr[0];
        Device device = (Device) hwa08PostInstallActivity.f54407f.getValue(hwa08PostInstallActivity, kVarArr[1]);
        c1541b.getClass();
        qc0.b a11 = b.C1541b.a(device, (User) hwa08PostInstallActivity.f54406e.getValue(hwa08PostInstallActivity, kVar));
        a11.x1(hwa08PostInstallActivity);
        Q3(hwa08PostInstallActivity, a11);
    }

    @Override // qc0.r.a
    public final void a2() {
        c0 c0Var = this.f54409h;
        if (c0Var != null) {
            c0Var.T0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i12 != -1) {
            c0 c0Var = this.f54409h;
            if (c0Var != null) {
                c0Var.U0();
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        } else if (i11 != 11) {
            if (i11 == 22) {
                c0 c0Var2 = this.f54409h;
                if (c0Var2 != null) {
                    c0Var2.T0();
                } else {
                    kotlin.jvm.internal.u.s("postInstallViewModel");
                    throw null;
                }
            }
        } else if (this.f54409h != null) {
            if (intent != null) {
                intent.getIntExtra("goal", 0);
            }
            c0 c0Var3 = this.f54409h;
            if (c0Var3 != null) {
                c0Var3.T0();
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        c0 c0Var = this.f54409h;
        if (c0Var != null) {
            c0Var.U0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.hwa08.postinstall.Hilt_Hwa08PostInstallActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_device_post_install);
        View findViewById = findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) findViewById;
        this.f54411j = toolbar;
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        c0 c0Var = (c0) new k1(this, new com.withings.wiscale2.device.hwa08.postinstall.f(this)).a(c0.class);
        xw.d.c(this, c0Var.y0(), new o(this));
        xw.d.d(this, c0Var.G0(), new p(this));
        xw.d.d(this, c0Var.j0(), new q(this));
        xw.d.d(this, c0Var.k0(), new r(this));
        xw.d.d(this, c0Var.t0(), new s(this));
        xw.d.d(this, c0Var.K0(), new t(this));
        xw.d.d(this, c0Var.R0(), new u(this));
        xw.d.d(this, c0Var.O0(), new v(this));
        xw.d.d(this, c0Var.F0(), new w(this));
        xw.d.d(this, c0Var.M0(), new g(this));
        xw.d.d(this, c0Var.A0(), new h(this));
        xw.d.d(this, c0Var.z0(), new i(this));
        xw.d.d(this, c0Var.B0(), new j(this));
        xw.d.d(this, c0Var.m0(), new k(this));
        xw.d.d(this, c0Var.i0(), new l(this));
        xw.d.d(this, c0Var.p0(), new m(this));
        xw.d.d(this, c0Var.q0(), new n(this));
        this.f54409h = c0Var;
        androidx.core.content.a.registerReceiver(this, this.f54410i, new IntentFilter("ACTION_ECG_MEASUREMENT_FINISHED"), 4);
        getSupportFragmentManager().h(this.f54412k);
    }

    @Override // com.withings.wiscale2.device.hwa08.postinstall.Hilt_Hwa08PostInstallActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        try {
            getSupportFragmentManager().L0(this.f54412k);
            nm0.y yVar = nm0.y.f85009a;
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        try {
            ay.b.w(this, this.f54410i);
            nm0.y yVar2 = nm0.y.f85009a;
        } catch (Throwable th3) {
            nm0.l.a(th3);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return true;
    }

    @Override // qc0.b.a
    public final void q0() {
        c0 c0Var = this.f54409h;
        if (c0Var != null) {
            c0Var.T0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }
}
