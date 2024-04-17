package com.withings.wiscale2.device.wam03.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import androidx.lifecycle.k1;
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
/* compiled from: Wam03PostInstallActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/wam03/ui/Wam03PostInstallActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lqc0/b$a;", "Lqc0/r$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam03PostInstallActivity extends Hilt_Wam03PostInstallActivity implements b.a, r.a {

    /* renamed from: e  reason: collision with root package name */
    private final b f54969e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private final c f54970f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final d f54971g = new d(this);

    /* renamed from: h  reason: collision with root package name */
    private qc0.q f54972h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public fy.p f54973i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public bx.a f54974j;

    /* renamed from: k  reason: collision with root package name */
    private Toolbar f54975k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54968m = {androidx.camera.core.v.c(Wam03PostInstallActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(Wam03PostInstallActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(Wam03PostInstallActivity.class, "allowQuit", "getAllowQuit()Z", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f54967l = new Object();

    /* compiled from: Wam03PostInstallActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54976a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54977b;

        public b(Activity activity) {
            this.f54977b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54976a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54978a = nm0.h.b(new a0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54979b;

        public c(Activity activity) {
            this.f54979b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54978a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54980a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54981b;

        public d(Activity activity) {
            this.f54981b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54980a.getValue();
        }
    }

    public static final void A3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.getClass();
        b.C1541b c1541b = qc0.b.f92458p;
        fn0.k<Object> kVar = f54968m[0];
        Device N3 = wam03PostInstallActivity.N3();
        c1541b.getClass();
        qc0.b a11 = b.C1541b.a(N3, (User) wam03PostInstallActivity.f54969e.getValue(wam03PostInstallActivity, kVar));
        a11.x1(wam03PostInstallActivity);
        wam03PostInstallActivity.O3(a11);
    }

    public static final boolean B3(Wam03PostInstallActivity wam03PostInstallActivity) {
        return ((Boolean) wam03PostInstallActivity.f54971g.getValue(wam03PostInstallActivity, f54968m[2])).booleanValue();
    }

    public static final User F3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.getClass();
        return (User) wam03PostInstallActivity.f54969e.getValue(wam03PostInstallActivity, f54968m[0]);
    }

    public static final void G3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/wam03/activity-dial/activity_dial.json", "lottie/wam03");
        String string = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_ActivityGoalsTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_ActivityGoalsDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = wam03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        v vVar = new v(wam03PostInstallActivity);
        aVar.getClass();
        wam03PostInstallActivity.O3(b.a.a(explanation, vVar));
    }

    public static final void H3(Wam03PostInstallActivity wam03PostInstallActivity, Boolean bool) {
        int i11;
        Toolbar toolbar = wam03PostInstallActivity.f54975k;
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

    public static final void I3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.startActivityForResult(zg.b.b(wam03PostInstallActivity, wam03PostInstallActivity.N3(), true), 22);
    }

    public static final void J3(Wam03PostInstallActivity wam03PostInstallActivity, int i11) {
        wam03PostInstallActivity.getClass();
        r.b bVar = qc0.r.f92540m;
        fn0.k<Object> kVar = f54968m[0];
        Device N3 = wam03PostInstallActivity.N3();
        bVar.getClass();
        qc0.r a11 = r.b.a(i11, (User) wam03PostInstallActivity.f54969e.getValue(wam03PostInstallActivity, kVar), N3, 2131232835);
        a11.A1(wam03PostInstallActivity);
        wam03PostInstallActivity.O3(a11);
    }

    public static final void K3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/wam03/short-press/short_press.json", "lottie/wam03");
        String string = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_workoutBrowsingTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_workoutBrowsingDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = wam03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        w wVar = new w(wam03PostInstallActivity);
        aVar.getClass();
        wam03PostInstallActivity.O3(b.a.a(explanation, wVar));
    }

    public static final void L3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/wam03/long-press-select/long_press_select.json", "lottie/wam03");
        String string = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_workoutActivationTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_workoutActivationDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = wam03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        x xVar = new x(wam03PostInstallActivity);
        aVar.getClass();
        wam03PostInstallActivity.O3(b.a.a(explanation, xVar));
    }

    public static final void M3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/wam03/long-press-workout/long_press_workout.json", "lottie/wam03");
        String string = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_workoutSessionStartTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_workoutSessionStartDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = wam03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        y yVar = new y(wam03PostInstallActivity);
        aVar.getClass();
        wam03PostInstallActivity.O3(b.a.a(explanation, yVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Device N3() {
        return (Device) this.f54970f.getValue(this, f54968m[1]);
    }

    private final void O3(Fragment fragment) {
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.e(null);
        m11.f();
    }

    public static final void z3(Wam03PostInstallActivity wam03PostInstallActivity) {
        wam03PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/wam03/notification/notification.json", "lottie/wam03");
        String string = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_notificationsTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_notificationsDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = wam03PostInstallActivity.getString(C1987R.string.wam03Installation_enableNotificationsButton);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, wam03PostInstallActivity.getString(C1987R.string.wam03Installation_noNotificationsButton), 6);
        b.a aVar = e80.b.f64938f;
        com.withings.wiscale2.device.wam03.ui.b bVar = new com.withings.wiscale2.device.wam03.ui.b(wam03PostInstallActivity);
        com.withings.wiscale2.device.wam03.ui.c cVar = new com.withings.wiscale2.device.wam03.ui.c(wam03PostInstallActivity);
        aVar.getClass();
        wam03PostInstallActivity.O3(b.a.b(explanation, bVar, cVar));
    }

    @Override // qc0.r.a
    public final void a2() {
        qc0.q qVar = this.f54972h;
        if (qVar != null) {
            qVar.M0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        if (i12 != -1) {
            qc0.q qVar = this.f54972h;
            if (qVar != null) {
                qVar.O0();
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        } else if (i11 != 11) {
            if (i11 != 22) {
                super.onActivityResult(i11, i12, intent);
                return;
            }
            qc0.q qVar2 = this.f54972h;
            if (qVar2 != null) {
                qVar2.M0();
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        } else if (this.f54972h != null) {
            if (intent != null) {
                intent.getIntExtra("goal", 0);
            }
            qc0.q qVar3 = this.f54972h;
            if (qVar3 != null) {
                qVar3.M0();
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
        qc0.q qVar = this.f54972h;
        if (qVar != null) {
            qVar.O0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.wam03.ui.Hilt_Wam03PostInstallActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_device_post_install);
        View findViewById = findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) findViewById;
        this.f54975k = toolbar;
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        qc0.q qVar = (qc0.q) new k1(this, new e(this)).a(qc0.q.class);
        xw.d.c(this, qVar.p0(), new m(this));
        xw.d.d(this, qVar.t0(), new n(this));
        xw.d.d(this, qVar.g0(), new o(this));
        xw.d.d(this, qVar.i0(), new p(this));
        xw.d.d(this, qVar.m0(), new q(this));
        xw.d.d(this, qVar.y0(), new r(this));
        xw.d.d(this, qVar.G0(), new s(this));
        xw.d.d(this, qVar.B0(), new t(this));
        xw.d.d(this, qVar.K0(), new u(this));
        xw.d.d(this, qVar.F0(), new f(qVar));
        xw.d.d(this, qVar.r0(), new g(qVar));
        xw.d.d(this, qVar.A0(), new h(this));
        xw.d.d(this, qVar.f0(), new i(this));
        xw.d.d(this, qVar.q0(), new j(this));
        xw.d.d(this, qVar.z0(), new k(this));
        xw.d.d(this, qVar.j0(), new l(this));
        this.f54972h = qVar;
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
        qc0.q qVar = this.f54972h;
        if (qVar != null) {
            qVar.M0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }
}
