package com.withings.wiscale2.device.hwa03bs.ui;

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
/* compiled from: Hwa03PostInstallActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/hwa03bs/ui/Hwa03PostInstallActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lqc0/b$a;", "Lqc0/r$a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa03PostInstallActivity extends Hilt_Hwa03PostInstallActivity implements b.a, r.a {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54237l = {androidx.camera.core.v.c(Hwa03PostInstallActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(Hwa03PostInstallActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(Hwa03PostInstallActivity.class, "allowQuit", "getAllowQuit()Z", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final a f54238e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    private final b f54239f = new b(this);

    /* renamed from: g  reason: collision with root package name */
    private final c f54240g = new c(this);

    /* renamed from: h  reason: collision with root package name */
    private qc0.q f54241h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public fy.p f54242i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public bx.a f54243j;

    /* renamed from: k  reason: collision with root package name */
    private Toolbar f54244k;

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class a implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54245a = nm0.h.b(new a0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54246b;

        public a(Activity activity) {
            this.f54246b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54245a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54247a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54248b;

        public b(Activity activity) {
            this.f54248b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54247a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54249a = nm0.h.b(new c0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54250b;

        public c(Activity activity) {
            this.f54250b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54249a.getValue();
        }
    }

    public static final void A3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        hwa03PostInstallActivity.getClass();
        b.C1541b c1541b = qc0.b.f92458p;
        fn0.k<Object> kVar = f54237l[0];
        Device N3 = hwa03PostInstallActivity.N3();
        c1541b.getClass();
        qc0.b a11 = b.C1541b.a(N3, (User) hwa03PostInstallActivity.f54238e.getValue(hwa03PostInstallActivity, kVar));
        a11.x1(hwa03PostInstallActivity);
        hwa03PostInstallActivity.O3(a11);
    }

    public static final boolean B3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        return ((Boolean) hwa03PostInstallActivity.f54240g.getValue(hwa03PostInstallActivity, f54237l[2])).booleanValue();
    }

    public static final User F3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        hwa03PostInstallActivity.getClass();
        return (User) hwa03PostInstallActivity.f54238e.getValue(hwa03PostInstallActivity, f54237l[0]);
    }

    public static final void G3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        nm0.j jVar = new nm0.j(androidx.fragment.app.o.d("lottie/", com.withings.wiscale2.device.hwa03bs.ui.b.a(hwa03PostInstallActivity.N3().getColor()), "/activity_dial.json"), com.withings.wiscale2.device.hwa03bs.ui.b.b(hwa03PostInstallActivity.N3().getColor()));
        String string = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_ActivityGoalsTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_ActivityGoalsDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        w wVar = new w(hwa03PostInstallActivity);
        aVar.getClass();
        hwa03PostInstallActivity.O3(b.a.a(explanation, wVar));
    }

    public static final void H3(Hwa03PostInstallActivity hwa03PostInstallActivity, Boolean bool) {
        int i11;
        Toolbar toolbar = hwa03PostInstallActivity.f54244k;
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

    public static final void I3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        hwa03PostInstallActivity.startActivityForResult(zg.b.b(hwa03PostInstallActivity, hwa03PostInstallActivity.N3(), true), 22);
    }

    public static final void J3(Hwa03PostInstallActivity hwa03PostInstallActivity, int i11) {
        hwa03PostInstallActivity.getClass();
        r.b bVar = qc0.r.f92540m;
        fn0.k<Object> kVar = f54237l[0];
        Device N3 = hwa03PostInstallActivity.N3();
        bVar.getClass();
        qc0.r a11 = r.b.a(i11, (User) hwa03PostInstallActivity.f54238e.getValue(hwa03PostInstallActivity, kVar), N3, C1987R.drawable.hwa03bs_post_install_summary);
        a11.A1(hwa03PostInstallActivity);
        hwa03PostInstallActivity.O3(a11);
    }

    public static final void K3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        nm0.j jVar = new nm0.j(androidx.fragment.app.o.d("lottie/", com.withings.wiscale2.device.hwa03bs.ui.b.a(hwa03PostInstallActivity.N3().getColor()), "/short_press.json"), com.withings.wiscale2.device.hwa03bs.ui.b.b(hwa03PostInstallActivity.N3().getColor()));
        String string = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_workoutBrowsingTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_workoutBrowsingDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        x xVar = new x(hwa03PostInstallActivity);
        aVar.getClass();
        hwa03PostInstallActivity.O3(b.a.a(explanation, xVar));
    }

    public static final void L3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        nm0.j jVar = new nm0.j(androidx.fragment.app.o.d("lottie/", com.withings.wiscale2.device.hwa03bs.ui.b.a(hwa03PostInstallActivity.N3().getColor()), "/long_press_select.json"), com.withings.wiscale2.device.hwa03bs.ui.b.b(hwa03PostInstallActivity.N3().getColor()));
        String string = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_workoutActivationTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_workoutActivationDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        y yVar = new y(hwa03PostInstallActivity);
        aVar.getClass();
        hwa03PostInstallActivity.O3(b.a.a(explanation, yVar));
    }

    public static final void M3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        nm0.j jVar = new nm0.j(androidx.fragment.app.o.d("lottie/", com.withings.wiscale2.device.hwa03bs.ui.b.a(hwa03PostInstallActivity.N3().getColor()), "/long_press_workout.json"), com.withings.wiscale2.device.hwa03bs.ui.b.b(hwa03PostInstallActivity.N3().getColor()));
        String string = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_workoutSessionStartTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_workoutSessionStartDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa03PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        z zVar = new z(hwa03PostInstallActivity);
        aVar.getClass();
        hwa03PostInstallActivity.O3(b.a.a(explanation, zVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Device N3() {
        return (Device) this.f54239f.getValue(this, f54237l[1]);
    }

    private final void O3(Fragment fragment) {
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.e(null);
        m11.f();
    }

    public static final void z3(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        nm0.j jVar = new nm0.j(androidx.fragment.app.o.d("lottie/", com.withings.wiscale2.device.hwa03bs.ui.b.a(hwa03PostInstallActivity.N3().getColor()), "/notifications.json"), com.withings.wiscale2.device.hwa03bs.ui.b.b(hwa03PostInstallActivity.N3().getColor()));
        String string = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_notificationsTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_notificationsDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_enableNotificationsButton);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, hwa03PostInstallActivity.getString(C1987R.string.hwa03bsInstallation_noNotificationsButton), 6);
        b.a aVar = e80.b.f64938f;
        com.withings.wiscale2.device.hwa03bs.ui.c cVar = new com.withings.wiscale2.device.hwa03bs.ui.c(hwa03PostInstallActivity);
        d dVar = new d(hwa03PostInstallActivity);
        aVar.getClass();
        hwa03PostInstallActivity.O3(b.a.b(explanation, cVar, dVar));
    }

    @Override // qc0.r.a
    public final void a2() {
        qc0.q qVar = this.f54241h;
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
            qc0.q qVar = this.f54241h;
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
            qc0.q qVar2 = this.f54241h;
            if (qVar2 != null) {
                qVar2.M0();
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        } else if (this.f54241h != null) {
            if (intent != null) {
                intent.getIntExtra("goal", 0);
            }
            qc0.q qVar3 = this.f54241h;
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
        qc0.q qVar = this.f54241h;
        if (qVar != null) {
            qVar.O0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.hwa03bs.ui.Hilt_Hwa03PostInstallActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_device_post_install);
        View findViewById = findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) findViewById;
        this.f54244k = toolbar;
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        qc0.q qVar = (qc0.q) new k1(this, new f(this)).a(qc0.q.class);
        xw.d.c(this, qVar.p0(), new n(this));
        xw.d.d(this, qVar.t0(), new o(this));
        xw.d.d(this, qVar.g0(), new p(this));
        xw.d.d(this, qVar.i0(), new q(this));
        xw.d.d(this, qVar.m0(), new r(this));
        xw.d.d(this, qVar.y0(), new s(this));
        xw.d.d(this, qVar.G0(), new t(this));
        xw.d.d(this, qVar.B0(), new u(this));
        xw.d.d(this, qVar.K0(), new v(this));
        xw.d.d(this, qVar.F0(), new g(qVar));
        xw.d.d(this, qVar.r0(), new h(qVar));
        xw.d.d(this, qVar.A0(), new i(this));
        xw.d.d(this, qVar.f0(), new j(this));
        xw.d.d(this, qVar.q0(), new k(this));
        xw.d.d(this, qVar.z0(), new l(this));
        xw.d.d(this, qVar.j0(), new m(this));
        this.f54241h = qVar;
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
        qc0.q qVar = this.f54241h;
        if (qVar != null) {
            qVar.M0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }
}
