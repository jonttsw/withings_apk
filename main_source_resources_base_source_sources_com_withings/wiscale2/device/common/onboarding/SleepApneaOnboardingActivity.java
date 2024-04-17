package com.withings.wiscale2.device.common.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import androidx.navigation.e;
import androidx.navigation.t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.q;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.FeatureActivationDocumentFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import tb0.r0;
/* compiled from: SleepApneaOnboardingActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/common/onboarding/SleepApneaOnboardingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroidx/navigation/e$b;", "Lcom/withings/wiscale2/device/common/feature/FeatureActivationDocumentFragment$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepApneaOnboardingActivity extends Hilt_SleepApneaOnboardingActivity implements e.b, FeatureActivationDocumentFragment.a {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public com.withings.wiscale2.device.common.onboarding.e f53062e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f53063f = nm0.h.b(new c());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f53064g = nm0.h.b(new d());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f53065h = nm0.h.b(new b());

    /* renamed from: i  reason: collision with root package name */
    private final l f53066i = new l(this);

    /* renamed from: j  reason: collision with root package name */
    private final m f53067j = new m(this);

    /* renamed from: k  reason: collision with root package name */
    private final n f53068k = new n(this);

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f53069l = nm0.h.b(new o());

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53061n = {v.c(SleepApneaOnboardingActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), v.c(SleepApneaOnboardingActivity.class, "fromMyDevices", "getFromMyDevices()Z", 0), v.c(SleepApneaOnboardingActivity.class, "fromInstall", "getFromInstall()Z", 0)};

    /* renamed from: m  reason: collision with root package name */
    public static final a f53060m = new Object();

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(a aVar, Context context, Device device, boolean z5, boolean z11, int i11) {
            if ((i11 & 4) != 0) {
                z5 = false;
            }
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            aVar.getClass();
            u.j(context, "context");
            u.j(device, "device");
            Intent putExtra = new Intent(context, SleepApneaOnboardingActivity.class).putExtra("extra_device", device).putExtra("extra_from_my_devices", z11).putExtra("extra_install", z5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<r0> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final r0 invoke() {
            return r0.a(SleepApneaOnboardingActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<androidx.navigation.e> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(SleepApneaOnboardingActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<androidx.navigation.v> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.v invoke() {
            return SleepApneaOnboardingActivity.this.getNavController().A();
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.l<Integer, y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Integer num) {
            y yVar;
            Integer num2 = num;
            SleepApneaOnboardingActivity sleepApneaOnboardingActivity = SleepApneaOnboardingActivity.this;
            if (num2 != null) {
                SleepApneaOnboardingActivity.I3(sleepApneaOnboardingActivity, num2.intValue());
                yVar = y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                sleepApneaOnboardingActivity.finish();
            }
            return y.f85009a;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<y> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            SleepApneaOnboardingActivity.H3(SleepApneaOnboardingActivity.this);
            return y.f85009a;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<y> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            SleepApneaOnboardingActivity.this.getNavController().H(C1987R.id.action_intro_to_soundSensor, null);
            return y.f85009a;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.l<Boolean, y> {
        h() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            if (bool.booleanValue()) {
                SleepApneaOnboardingActivity.G3(SleepApneaOnboardingActivity.this);
            }
            return y.f85009a;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends w implements ym0.l<Boolean, y> {
        i() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            if (bool.booleanValue()) {
                SleepApneaOnboardingActivity.F3(SleepApneaOnboardingActivity.this);
            }
            return y.f85009a;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends w implements ym0.l<Boolean, y> {
        j() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            int i11;
            Boolean bool2 = bool;
            ProgressBar loading = SleepApneaOnboardingActivity.this.J3().f99444a;
            u.i(loading, "loading");
            u.g(bool2);
            if (bool2.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            loading.setVisibility(i11);
            return y.f85009a;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends w implements ym0.l<Integer, y> {
        k() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Integer num) {
            Integer num2 = num;
            u.g(num2);
            Toast.makeText(SleepApneaOnboardingActivity.this, num2.intValue(), 1).show();
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class l implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53080a = nm0.h.b(new com.withings.wiscale2.device.common.onboarding.f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53081b;

        public l(Activity activity) {
            this.f53081b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f53080a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class m implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53082a = nm0.h.b(new com.withings.wiscale2.device.common.onboarding.g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53083b;

        public m(Activity activity) {
            this.f53083b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f53082a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class n implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53084a = nm0.h.b(new com.withings.wiscale2.device.common.onboarding.h(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53085b;

        public n(Activity activity) {
            this.f53085b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f53084a.getValue();
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class o extends w implements ym0.a<com.withings.wiscale2.device.common.onboarding.c> {
        o() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.device.common.onboarding.c invoke() {
            SleepApneaOnboardingActivity sleepApneaOnboardingActivity = SleepApneaOnboardingActivity.this;
            return (com.withings.wiscale2.device.common.onboarding.c) new k1(sleepApneaOnboardingActivity, new com.withings.wiscale2.device.common.onboarding.i(sleepApneaOnboardingActivity)).a(com.withings.wiscale2.device.common.onboarding.c.class);
        }
    }

    public static void A3(SleepApneaOnboardingActivity this$0) {
        Integer num;
        u.j(this$0, "this$0");
        t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        nm0.g gVar = this$0.f53069l;
        if (num != null && num.intValue() == C1987R.id.intro_destination) {
            ((com.withings.wiscale2.device.common.onboarding.c) gVar.getValue()).z0();
        } else if (num != null && num.intValue() == C1987R.id.soundSensor_destination) {
            com.withings.wiscale2.device.common.onboarding.c cVar = (com.withings.wiscale2.device.common.onboarding.c) gVar.getValue();
            cVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(cVar), Dispatchers.getIO(), null, new com.withings.wiscale2.device.common.onboarding.d(cVar, null), 2, null);
        } else if (num != null && num.intValue() == C1987R.id.document_destination) {
            ((com.withings.wiscale2.device.common.onboarding.c) gVar.getValue()).k0();
        } else if (num != null && num.intValue() == C1987R.id.calibrating_destination) {
            this$0.getNavController().H(C1987R.id.action_calibrating_to_installDone, null);
        } else if (num != null && num.intValue() == C1987R.id.activateLater_destination) {
            new com.withings.wiscale2.device.common.onboarding.k(this$0).b((Device) this$0.f53066i.getValue(this$0, f53061n[0]));
            if (this$0.K3()) {
                this$0.getNavController().H(C1987R.id.action_activateLater_to_calibrating, null);
            } else {
                this$0.finish();
            }
        } else if (num != null && num.intValue() == C1987R.id.installDone_destination) {
            this$0.finish();
        }
    }

    public static final Device C3(SleepApneaOnboardingActivity sleepApneaOnboardingActivity) {
        sleepApneaOnboardingActivity.getClass();
        return (Device) sleepApneaOnboardingActivity.f53066i.getValue(sleepApneaOnboardingActivity, f53061n[0]);
    }

    public static final void F3(SleepApneaOnboardingActivity sleepApneaOnboardingActivity) {
        t y11 = sleepApneaOnboardingActivity.getNavController().y();
        if (y11 != null && y11.r() == C1987R.id.document_destination) {
            if (sleepApneaOnboardingActivity.K3()) {
                sleepApneaOnboardingActivity.getNavController().H(C1987R.id.action_document_to_calibrating, null);
            } else {
                sleepApneaOnboardingActivity.finish();
            }
        }
    }

    public static final void G3(SleepApneaOnboardingActivity sleepApneaOnboardingActivity) {
        t y11 = sleepApneaOnboardingActivity.getNavController().y();
        if (y11 != null && y11.r() == C1987R.id.soundSensor_destination) {
            sleepApneaOnboardingActivity.getNavController().K(pc0.d.a());
        }
    }

    public static final void H3(SleepApneaOnboardingActivity sleepApneaOnboardingActivity) {
        sleepApneaOnboardingActivity.getClass();
        sleepApneaOnboardingActivity.getNavController().K(pc0.b.a());
    }

    public static final void I3(SleepApneaOnboardingActivity sleepApneaOnboardingActivity, int i11) {
        ((androidx.navigation.v) sleepApneaOnboardingActivity.f53064g.getValue()).Q(i11);
        androidx.navigation.e navController = sleepApneaOnboardingActivity.getNavController();
        androidx.navigation.v graph = (androidx.navigation.v) sleepApneaOnboardingActivity.f53064g.getValue();
        navController.getClass();
        u.j(graph, "graph");
        navController.a0(graph, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 J3() {
        return (r0) this.f53065h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K3() {
        return ((Boolean) this.f53068k.getValue(this, f53061n[2])).booleanValue();
    }

    private final void L3(int i11) {
        if (((Boolean) this.f53067j.getValue(this, f53061n[1])).booleanValue()) {
            finish();
        } else {
            getNavController().H(i11, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.f53063f.getValue();
    }

    public static void z3(SleepApneaOnboardingActivity this$0) {
        Integer num;
        u.j(this$0, "this$0");
        t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.intro_destination) {
            this$0.L3(C1987R.id.action_intro_to_activateLater);
        } else if (num != null && num.intValue() == C1987R.id.document_destination) {
            this$0.L3(C1987R.id.action_document_to_activateLater);
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.FeatureActivationDocumentFragment.a
    public final void F2() {
        Integer num;
        t y11 = getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.document_destination) {
            J3().f99445b.setEnabled(true);
        }
    }

    @Override // androidx.navigation.e.b
    public final void X0(androidx.navigation.e controller, t destination, Bundle bundle) {
        com.withings.wiscale2.device.common.onboarding.a aVar;
        y yVar;
        u.j(controller, "controller");
        u.j(destination, "destination");
        int r7 = destination.r();
        Integer valueOf = Integer.valueOf((int) C1987R.string._LATER_);
        y yVar2 = null;
        if (r7 == C1987R.id.intro_destination) {
            aVar = new com.withings.wiscale2.device.common.onboarding.a(Integer.valueOf((int) C1987R.string.sleepApnea_onboarding_button1), valueOf, null, 4);
        } else if (r7 == C1987R.id.soundSensor_destination) {
            aVar = new com.withings.wiscale2.device.common.onboarding.a(Integer.valueOf((int) C1987R.string.sleepApnea_onboarding_button4), null, null, 6);
        } else {
            int i11 = C1987R.string._NEXT_;
            if (r7 == C1987R.id.document_destination) {
                T value = ((com.withings.wiscale2.device.common.onboarding.c) this.f53069l.getValue()).A0().getValue();
                Boolean bool = Boolean.TRUE;
                if (u.e(value, bool)) {
                    aVar = new com.withings.wiscale2.device.common.onboarding.a(Integer.valueOf((int) C1987R.string._NEXT_), null, bool, 2);
                } else {
                    aVar = new com.withings.wiscale2.device.common.onboarding.a(Integer.valueOf((int) C1987R.string._I_AGREE_), valueOf, Boolean.FALSE);
                }
            } else if (r7 == C1987R.id.activateLater_destination) {
                if (!K3()) {
                    i11 = C1987R.string._DONE_;
                }
                aVar = new com.withings.wiscale2.device.common.onboarding.a(Integer.valueOf(i11), null, null, 6);
            } else if (r7 == C1987R.id.calibrating_destination) {
                aVar = new com.withings.wiscale2.device.common.onboarding.a(Integer.valueOf((int) C1987R.string._NEXT_), null, null, 6);
            } else if (r7 == C1987R.id.installDone_destination) {
                aVar = new com.withings.wiscale2.device.common.onboarding.a(Integer.valueOf((int) C1987R.string._DONE_), null, null, 6);
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            J3().f99445b.setEnabled(u.e(aVar.a(), Boolean.TRUE));
            MaterialButton primaryButton = J3().f99445b;
            u.i(primaryButton, "primaryButton");
            Integer b10 = aVar.b();
            if (b10 != null) {
                primaryButton.setVisibility(0);
                primaryButton.setText(getString(b10.intValue()));
                yVar = y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                primaryButton.setVisibility(8);
            }
            MaterialButton secondaryButton = J3().f99447d;
            u.i(secondaryButton, "secondaryButton");
            Integer c11 = aVar.c();
            if (c11 != null) {
                secondaryButton.setVisibility(0);
                secondaryButton.setText(getString(c11.intValue()));
                yVar2 = y.f85009a;
            }
            if (yVar2 == null) {
                secondaryButton.setVisibility(8);
            }
        }
    }

    @Override // com.withings.wiscale2.device.common.onboarding.Hilt_SleepApneaOnboardingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(J3().f99446c);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.s(y70.a.c(C1987R.drawable.icon_medium_navigation_close, this, ah.u.w(C1987R.attr.colorOnPrimary, this, -65281)));
        }
        J3().f99445b.setOnClickListener(new sg.d(this, 7));
        J3().f99447d.setOnClickListener(new q(this, 5));
        getNavController().p(this);
        com.withings.wiscale2.device.common.onboarding.c cVar = (com.withings.wiscale2.device.common.onboarding.c) this.f53069l.getValue();
        xw.d.c(this, cVar.t0(), new e());
        xw.d.d(this, cVar.p0(), new f());
        xw.d.d(this, cVar.q0(), new g());
        xw.d.c(this, cVar.r0(), new h());
        xw.d.c(this, cVar.B0(), new i());
        xw.d.c(this, cVar.m0(), new j());
        xw.d.c(this, cVar.y0(), new k());
    }

    @Override // com.withings.wiscale2.device.common.onboarding.Hilt_SleepApneaOnboardingActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        getNavController().W(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
