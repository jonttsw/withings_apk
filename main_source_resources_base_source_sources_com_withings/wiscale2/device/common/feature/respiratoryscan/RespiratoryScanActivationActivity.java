package com.withings.wiscale2.device.common.feature.respiratoryscan;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.lifecycle.k1;
import androidx.navigation.e;
import androidx.navigation.t;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.q;
/* compiled from: RespiratoryScanActivationActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/respiratoryscan/RespiratoryScanActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroidx/navigation/e$b;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RespiratoryScanActivationActivity extends Hilt_RespiratoryScanActivationActivity implements e.b {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52420k = {v.c(RespiratoryScanActivationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public m f52423g;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f52421e = nm0.h.b(new c());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f52422f = nm0.h.b(new a());

    /* renamed from: h  reason: collision with root package name */
    private final d f52424h = new d(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f52425i = nm0.h.b(new b());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f52426j = nm0.h.b(new e());

    /* compiled from: RespiratoryScanActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<q> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final q invoke() {
            return q.a(RespiratoryScanActivationActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: RespiratoryScanActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<Boolean> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(RespiratoryScanActivationActivity.this.getIntent().getBooleanExtra("from_install", true));
        }
    }

    /* compiled from: RespiratoryScanActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<androidx.navigation.e> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(RespiratoryScanActivationActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52430a = nm0.h.b(new i(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52431b;

        public d(Activity activity) {
            this.f52431b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f52430a.getValue();
        }
    }

    /* compiled from: RespiratoryScanActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<l> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final l invoke() {
            RespiratoryScanActivationActivity respiratoryScanActivationActivity = RespiratoryScanActivationActivity.this;
            return (l) new k1(respiratoryScanActivationActivity, new j(respiratoryScanActivationActivity)).a(l.class);
        }
    }

    public static final Device A3(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        return (Device) respiratoryScanActivationActivity.f52424h.getValue(respiratoryScanActivationActivity, f52420k[0]);
    }

    public static final l C3(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        return (l) respiratoryScanActivationActivity.f52426j.getValue();
    }

    public static final void D3(RespiratoryScanActivationActivity respiratoryScanActivationActivity, boolean z5) {
        Integer num;
        respiratoryScanActivationActivity.E3().f99428a.setEnabled(true);
        ProgressBar loading = respiratoryScanActivationActivity.E3().f99429b;
        u.i(loading, "loading");
        loading.setVisibility(8);
        t y11 = respiratoryScanActivationActivity.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.respiratory_scan_disturbances && z5) {
            respiratoryScanActivationActivity.getNavController().H(C1987R.id.action_disturbances_to_frequency, null);
        }
    }

    private final q E3() {
        return (q) this.f52422f.getValue();
    }

    private final void F3() {
        Integer num;
        E3().f99428a.setEnabled(true);
        t y11 = getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.respiratory_scan_start) {
            E3().f99428a.setText(C1987R.string._START_);
        } else if ((num != null && num.intValue() == C1987R.id.respiratory_scan_enhance) || (num != null && num.intValue() == C1987R.id.respiratory_scan_disturbances)) {
            E3().f99428a.setText(C1987R.string._NEXT_);
        } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_frequency) {
            E3().f99428a.setText(C1987R.string.set_frequency);
        } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_reminder) {
            E3().f99428a.setText(C1987R.string._NEXT_);
        } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_done) {
            E3().f99428a.setText(C1987R.string.hwa09_ecgPositionTutorialButton);
        } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_activateLater) {
            E3().f99428a.setText(C1987R.string._TM_GOT_IT_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.f52421e.getValue();
    }

    public static void z3(RespiratoryScanActivationActivity this$0) {
        Integer num;
        u.j(this$0, "this$0");
        t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.respiratory_scan_start) {
            this$0.getNavController().H(C1987R.id.action_start_to_enhance, null);
        } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_enhance) {
            this$0.getNavController().H(C1987R.id.action_enhance_to_disturbances, null);
        } else {
            nm0.g gVar = this$0.f52426j;
            if (num != null && num.intValue() == C1987R.id.respiratory_scan_disturbances) {
                if (((l) gVar.getValue()).r0()) {
                    this$0.getNavController().H(C1987R.id.action_disturbances_to_frequency, null);
                    return;
                }
                this$0.E3().f99428a.setEnabled(false);
                ProgressBar loading = this$0.E3().f99429b;
                u.i(loading, "loading");
                loading.setVisibility(0);
                ((l) gVar.getValue()).f0();
            } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_frequency) {
                ((l) gVar.getValue()).z0();
            } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_reminder) {
                this$0.getNavController().H(C1987R.id.action_reminder_to_done, null);
            } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_done) {
                if (!((Boolean) this$0.f52425i.getValue()).booleanValue()) {
                    this$0.finish();
                } else {
                    this$0.getNavController().H(C1987R.id.action_done_to_activateLater, null);
                }
            } else if (num != null && num.intValue() == C1987R.id.respiratory_scan_activateLater) {
                this$0.finish();
            }
        }
    }

    @Override // androidx.navigation.e.b
    public final void X0(androidx.navigation.e controller, t destination, Bundle bundle) {
        u.j(controller, "controller");
        u.j(destination, "destination");
        F3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!getNavController().N()) {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.respiratoryscan.Hilt_RespiratoryScanActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(E3().f99430c);
        getNavController().p(this);
        setSupportActionBar(E3().f99431d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        F3();
        E3().f99428a.setOnClickListener(new sg.g(this, 8));
        l lVar = (l) this.f52426j.getValue();
        xw.d.c(this, lVar.k0(), new com.withings.wiscale2.device.common.feature.respiratoryscan.b(this));
        xw.d.c(this, lVar.t0(), new com.withings.wiscale2.device.common.feature.respiratoryscan.c(this));
        xw.d.d(this, lVar.q0(), new com.withings.wiscale2.device.common.feature.respiratoryscan.d(this));
        xw.d.d(this, lVar.p0(), new com.withings.wiscale2.device.common.feature.respiratoryscan.e(this));
        xw.d.c(this, lVar.m0(), new f(this));
    }

    @Override // com.withings.wiscale2.device.common.feature.respiratoryscan.Hilt_RespiratoryScanActivationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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
