package com.withings.wiscale2.device.hwa06.ui;

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
/* compiled from: Hwa06PostInstallActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/hwa06/ui/Hwa06PostInstallActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lqc0/b$a;", "Lqc0/r$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa06PostInstallActivity extends Hilt_Hwa06PostInstallActivity implements b.a, r.a {

    /* renamed from: e  reason: collision with root package name */
    private final b f54319e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private final c f54320f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final d f54321g = new d(this);

    /* renamed from: h  reason: collision with root package name */
    private qc0.q f54322h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public fy.p f54323i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public bx.a f54324j;

    /* renamed from: k  reason: collision with root package name */
    private Toolbar f54325k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54318m = {androidx.camera.core.v.c(Hwa06PostInstallActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(Hwa06PostInstallActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(Hwa06PostInstallActivity.class, "allowQuit", "getAllowQuit()Z", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f54317l = new Object();

    /* compiled from: Hwa06PostInstallActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54326a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54327b;

        public b(Activity activity) {
            this.f54327b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54326a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54328a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54329b;

        public c(Activity activity) {
            this.f54329b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54328a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54330a = nm0.h.b(new a0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54331b;

        public d(Activity activity) {
            this.f54331b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54330a.getValue();
        }
    }

    public static final boolean A3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        return ((Boolean) hwa06PostInstallActivity.f54321g.getValue(hwa06PostInstallActivity, f54318m[2])).booleanValue();
    }

    public static final Device B3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        hwa06PostInstallActivity.getClass();
        return (Device) hwa06PostInstallActivity.f54320f.getValue(hwa06PostInstallActivity, f54318m[1]);
    }

    public static final User E3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        hwa06PostInstallActivity.getClass();
        return (User) hwa06PostInstallActivity.f54319e.getValue(hwa06PostInstallActivity, f54318m[0]);
    }

    public static final void F3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        hwa06PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/activity-goals.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_progressTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_progressMessage);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa06PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        u uVar = new u(hwa06PostInstallActivity);
        aVar.getClass();
        hwa06PostInstallActivity.L3(b.a.a(explanation, uVar));
    }

    public static final void G3(Hwa06PostInstallActivity hwa06PostInstallActivity, Boolean bool) {
        int i11;
        Toolbar toolbar = hwa06PostInstallActivity.f54325k;
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

    public static final void H3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        String string = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_mapRunTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_mapRunMessage);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa06PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(2131232531, null, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION);
        b.a aVar = e80.b.f64938f;
        v vVar = new v(hwa06PostInstallActivity);
        aVar.getClass();
        hwa06PostInstallActivity.L3(b.a.a(explanation, vVar));
    }

    public static final void I3(Hwa06PostInstallActivity hwa06PostInstallActivity, int i11) {
        hwa06PostInstallActivity.getClass();
        r.b bVar = qc0.r.f92540m;
        fn0.k<Object>[] kVarArr = f54318m;
        fn0.k<Object> kVar = kVarArr[0];
        fn0.k<Object> kVar2 = kVarArr[1];
        bVar.getClass();
        qc0.r a11 = r.b.a(i11, (User) hwa06PostInstallActivity.f54319e.getValue(hwa06PostInstallActivity, kVar), (Device) hwa06PostInstallActivity.f54320f.getValue(hwa06PostInstallActivity, kVar2), C1987R.drawable.hwa06_post_install_summary);
        a11.A1(hwa06PostInstallActivity);
        hwa06PostInstallActivity.L3(a11);
    }

    public static final void J3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        hwa06PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/workoutSession-start.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_longPressEndTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_longPressEndMessage);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa06PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        w wVar = new w(hwa06PostInstallActivity);
        aVar.getClass();
        hwa06PostInstallActivity.L3(b.a.a(explanation, wVar));
    }

    public static final void K3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        hwa06PostInstallActivity.getClass();
        nm0.j jVar = new nm0.j("lottie/hwa08_hwa06_tutorial/workoutSession-start.json", "lottie/hwa08_hwa06_tutorial/images");
        String string = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_longPressStartTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa06PostInstallActivity.getString(C1987R.string.hwa06Tutorial_longPressStartMessage);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa06PostInstallActivity.getString(C1987R.string._NEXT_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(null, jVar, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT);
        b.a aVar = e80.b.f64938f;
        x xVar = new x(hwa06PostInstallActivity);
        aVar.getClass();
        hwa06PostInstallActivity.L3(b.a.a(explanation, xVar));
    }

    private final void L3(Fragment fragment) {
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.e(null);
        m11.f();
    }

    public static final void z3(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        hwa06PostInstallActivity.getClass();
        b.C1541b c1541b = qc0.b.f92458p;
        fn0.k<Object>[] kVarArr = f54318m;
        fn0.k<Object> kVar = kVarArr[0];
        Device device = (Device) hwa06PostInstallActivity.f54320f.getValue(hwa06PostInstallActivity, kVarArr[1]);
        c1541b.getClass();
        qc0.b a11 = b.C1541b.a(device, (User) hwa06PostInstallActivity.f54319e.getValue(hwa06PostInstallActivity, kVar));
        a11.x1(hwa06PostInstallActivity);
        hwa06PostInstallActivity.L3(a11);
    }

    @Override // qc0.r.a
    public final void a2() {
        qc0.q qVar = this.f54322h;
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
            qc0.q qVar = this.f54322h;
            if (qVar != null) {
                qVar.O0();
            } else {
                kotlin.jvm.internal.u.s("postInstallViewModel");
                throw null;
            }
        } else if (i11 != 11) {
            if (i11 == 22) {
                qc0.q qVar2 = this.f54322h;
                if (qVar2 != null) {
                    qVar2.M0();
                } else {
                    kotlin.jvm.internal.u.s("postInstallViewModel");
                    throw null;
                }
            }
        } else if (this.f54322h != null) {
            if (intent != null) {
                intent.getIntExtra("goal", 0);
            }
            qc0.q qVar3 = this.f54322h;
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
        qc0.q qVar = this.f54322h;
        if (qVar != null) {
            qVar.O0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.hwa06.ui.Hilt_Hwa06PostInstallActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_device_post_install);
        View findViewById = findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) findViewById;
        this.f54325k = toolbar;
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        qc0.q qVar = (qc0.q) new k1(this, new com.withings.wiscale2.device.hwa06.ui.d(this)).a(qc0.q.class);
        xw.d.c(this, qVar.p0(), new l(this));
        xw.d.d(this, qVar.t0(), new m(this));
        xw.d.d(this, qVar.g0(), new n(this));
        xw.d.d(this, qVar.i0(), new o(this));
        xw.d.d(this, qVar.m0(), new p(this));
        xw.d.d(this, qVar.y0(), new q(this));
        xw.d.d(this, qVar.B0(), new r(qVar));
        xw.d.d(this, qVar.G0(), new s(qVar));
        xw.d.d(this, qVar.K0(), new t(this));
        xw.d.d(this, qVar.F0(), new e(this));
        xw.d.d(this, qVar.r0(), new f(this));
        xw.d.d(this, qVar.A0(), new g(qVar));
        xw.d.d(this, qVar.f0(), new h(qVar));
        xw.d.d(this, qVar.q0(), new i(qVar));
        xw.d.d(this, qVar.z0(), new j(this));
        xw.d.d(this, qVar.j0(), new k(this));
        this.f54322h = qVar;
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
        qc0.q qVar = this.f54322h;
        if (qVar != null) {
            qVar.M0();
        } else {
            kotlin.jvm.internal.u.s("postInstallViewModel");
            throw null;
        }
    }
}
