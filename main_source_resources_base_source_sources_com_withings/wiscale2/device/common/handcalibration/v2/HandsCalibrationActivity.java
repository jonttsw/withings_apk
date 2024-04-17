package com.withings.wiscale2.device.common.handcalibration.v2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.util.DeviceModelScanningAbilityProvider;
import com.withings.device.Device;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.devicesetup.ui.LottieData;
import com.withings.devicesetup.ui.SetupScreen;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.gps.ui.RequestLocationPermissionAndSettingsActivity;
import com.withings.wiscale2.device.common.handcalibration.HandCalibration;
import com.withings.wiscale2.device.common.handcalibration.a;
import com.withings.wiscale2.device.common.ui.s2;
import dq.c0;
import dq.u;
import e0.f0;
import fl.o;
import fl.p;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: HandsCalibrationActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/v2/HandsCalibrationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/common/handcalibration/v2/d;", "Llc0/c;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HandsCalibrationActivity extends WithingsActivity implements com.withings.wiscale2.device.common.handcalibration.v2.d, lc0.c {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f52725h = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f52726a = nm0.h.b(new d());

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f52727b = nm0.h.b(new e());

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f52728c = nm0.h.b(new f());

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f52729d = nm0.h.b(new c());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f52730e = nm0.h.b(new i());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f52731f = nm0.h.b(new j());

    /* renamed from: g  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f52732g;

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a implements u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.device.common.handcalibration.v2.g f52734b;

        a(com.withings.wiscale2.device.common.handcalibration.v2.g gVar) {
            this.f52734b = gVar;
        }

        @Override // dq.u
        public final void p() {
            uc0.b.f102052a.a(HandsCalibrationActivity.z3(HandsCalibrationActivity.this).getModelId(), true);
            this.f52734b.b(false);
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.device.common.handcalibration.v2.g f52736b;

        b(com.withings.wiscale2.device.common.handcalibration.v2.g gVar) {
            this.f52736b = gVar;
        }

        @Override // dq.u
        public final void p() {
            uc0.b.f102052a.a(HandsCalibrationActivity.z3(HandsCalibrationActivity.this).getModelId(), false);
            this.f52736b.b(true);
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<View> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return HandsCalibrationActivity.this.findViewById(C1987R.id.content);
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<Device> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = HandsCalibrationActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("extra_device", Device.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("extra_device");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            kotlin.jvm.internal.u.g(obj);
            return (Device) obj;
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<com.withings.wiscale2.device.common.handcalibration.v2.c> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.device.common.handcalibration.v2.c invoke() {
            HandsCalibrationActivity handsCalibrationActivity = HandsCalibrationActivity.this;
            com.withings.wiscale2.device.common.handcalibration.v2.c cVar = new com.withings.wiscale2.device.common.handcalibration.v2.c(HandsCalibrationActivity.z3(handsCalibrationActivity), handsCalibrationActivity);
            cVar.f52766c = p.f67672b.a().g(HandsCalibrationActivity.z3(handsCalibrationActivity)).g(handsCalibrationActivity, ej.w.w().E(HandsCalibrationActivity.z3(handsCalibrationActivity).getMacAddress()));
            return cVar;
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<View> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return HandsCalibrationActivity.this.findViewById(C1987R.id.root);
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.device.common.handcalibration.v2.g f52741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HandsCalibrationActivity f52742b;

        g(HandsCalibrationActivity handsCalibrationActivity, com.withings.wiscale2.device.common.handcalibration.v2.g gVar) {
            this.f52741a = gVar;
            this.f52742b = handsCalibrationActivity;
        }

        @Override // dq.u
        public final void p() {
            this.f52741a.e(true);
            this.f52742b.finish();
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class h implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.device.common.handcalibration.v2.g f52743a;

        h(com.withings.wiscale2.device.common.handcalibration.v2.g gVar) {
            this.f52743a = gVar;
        }

        @Override // dq.u
        public final void p() {
            this.f52743a.e(false);
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends w implements ym0.a<Toolbar> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) HandsCalibrationActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends w implements ym0.a<s2> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final s2 invoke() {
            return s2.s1(HandsCalibrationActivity.z3(HandsCalibrationActivity.this).getModel());
        }
    }

    public HandsCalibrationActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new wn.f(this, 2));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f52732g = registerForActivityResult;
    }

    private final com.withings.wiscale2.device.common.handcalibration.v2.c A3() {
        return (com.withings.wiscale2.device.common.handcalibration.v2.c) this.f52727b.getValue();
    }

    public static final Device z3(HandsCalibrationActivity handsCalibrationActivity) {
        return (Device) handsCalibrationActivity.f52726a.getValue();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void C(com.withings.wiscale2.device.common.handcalibration.v2.g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        p a11 = p.f67672b.a();
        nm0.g gVar = this.f52726a;
        o g11 = a11.g((Device) gVar.getValue());
        kotlin.jvm.internal.u.h(g11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.handcalibration.DeviceModelWithHandCalibration");
        lc0.a aVar = (lc0.a) g11;
        String string = getString(aVar.h());
        String string2 = getString(aVar.J());
        String string3 = getString(C1987R.string.hwa06Setup_calibrate_checkYes);
        String string4 = getString(C1987R.string.hwa06Setup_calibrate_checkNo);
        ((Device) gVar.getValue()).getColor();
        LottieData u11 = aVar.u();
        kotlin.jvm.internal.u.g(string);
        SetupScreen setupScreen = new SetupScreen(string, string2, null, u11, string3, string4, null, 32364);
        c0.f64134y.getClass();
        c0 a12 = c0.a.a(setupScreen);
        a12.G1(new a(presenter));
        a12.I1(new b(presenter));
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a12, null);
        m11.g();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void L(com.withings.wiscale2.device.common.handcalibration.v2.g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        String string = getString(C1987R.string.hwa06Setup_calibrate_autoTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = getString(C1987R.string.hwa06Setup_calibrate_autoMessage);
        String string3 = getString(C1987R.string.asset_loading);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        SetupScreen setupScreen = new SetupScreen(string, string2, null, new LottieData(8, "lottie", string3, true, false), null, null, null, 32748);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(setupScreen);
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a11, null);
        m11.g();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void N2(com.withings.wiscale2.device.common.handcalibration.v2.g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        String string = getString(C1987R.string.hwa06Setup_calibrate_motion_autoTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = getString(C1987R.string.hwa06Setup_calibrate_motion_autoMessage);
        String string3 = getString(C1987R.string.asset_loading);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        SetupScreen setupScreen = new SetupScreen(string, string2, null, new LottieData(8, "lottie", string3, true, false), null, null, null, 32748);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(setupScreen);
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a11, null);
        m11.g();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void T0(com.withings.wiscale2.device.common.handcalibration.v2.g presenter, WppDeviceConversation conversation, Exception exception) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        kotlin.jvm.internal.u.j(conversation, "conversation");
        kotlin.jvm.internal.u.j(exception, "exception");
        runOnUiThread(new f0(this, 7));
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void V2(com.withings.wiscale2.device.common.handcalibration.v2.g presenter, HandCalibration handCalibration) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        kotlin.jvm.internal.u.j(handCalibration, "handCalibration");
        com.withings.wiscale2.device.common.handcalibration.a.f52681i.getClass();
        com.withings.wiscale2.device.common.handcalibration.a a11 = a.C0705a.a(handCalibration, true);
        a11.y1(this);
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a11, null);
        m11.g();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.d
    public final void d3(com.withings.wiscale2.device.common.handcalibration.v2.c presenter, String str) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        Fragment X = getSupportFragmentManager().X(C1987R.id.content);
        nm0.g gVar = this.f52731f;
        if (!kotlin.jvm.internal.u.e(X, (s2) gVar.getValue())) {
            m0 m11 = getSupportFragmentManager().m();
            m11.l(C1987R.id.content, (s2) gVar.getValue(), null);
            m11.g();
        }
        ((s2) gVar.getValue()).t1(str);
    }

    @Override // lc0.c
    public final void g1(com.withings.wiscale2.device.common.handcalibration.a fragment) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        A3().h();
    }

    @Override // lc0.c
    public final void j0(com.withings.wiscale2.device.common.handcalibration.a fragment, int i11) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        A3().f(i11);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void l2(com.withings.wiscale2.device.common.handcalibration.v2.g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        String string = getString(C1987R.string.hwa06Setup_calibrate_stopTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = getString(C1987R.string.hwa06Setup_calibrate_stopMessage);
        String string3 = getString(C1987R.string.asset_loading);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        SetupScreen setupScreen = new SetupScreen(string, string2, null, new LottieData(8, "lottie", string3, true, false), null, null, null, 32748);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(setupScreen);
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a11, null);
        m11.g();
    }

    @Override // lc0.c
    public final void o3(com.withings.wiscale2.device.common.handcalibration.a fragment) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        A3().c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 4729 && i12 != -1) {
            x70.b.l(this, "Hands calibration cancelled because we can't use the bluetooth properly (Permission and localisation are not satisfied)", new Object[0]);
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!A3().d()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(C1987R.layout.activity_hands_calibration);
        View view = (View) this.f52728c.getValue();
        kotlin.jvm.internal.u.i(view, "<get-root>(...)");
        ay.b.t(view);
        nm0.g gVar = this.f52730e;
        Toolbar toolbar = (Toolbar) gVar.getValue();
        kotlin.jvm.internal.u.i(toolbar, "<get-toolbar>(...)");
        ay.b.n(toolbar, true, false, 29);
        View view2 = (View) this.f52729d.getValue();
        kotlin.jvm.internal.u.i(view2, "<get-content>(...)");
        ay.b.n(view2, true, true, 21);
        setSupportActionBar((Toolbar) gVar.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        A3().e();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        A3().g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        A3().g(null);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void p3(com.withings.wiscale2.device.common.handcalibration.v2.g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void v(com.withings.wiscale2.device.common.handcalibration.v2.g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        o g11 = p.f67672b.a().g((Device) this.f52726a.getValue());
        kotlin.jvm.internal.u.h(g11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.handcalibration.DeviceModelWithHandCalibration");
        int Z = ((lc0.a) g11).Z();
        String string = getString(C1987R.string.hwa06Setup_calibrate_endTitle);
        String string2 = getString(C1987R.string.hwa06Setup_calibrate_endMessage);
        String string3 = getString(C1987R.string.hwa06Setup_calibrate_end_done);
        String string4 = getString(C1987R.string.hwa06Setup_calibrate_end_tryAgain);
        kotlin.jvm.internal.u.g(string);
        SetupScreen setupScreen = new SetupScreen(string, string2, Integer.valueOf(Z), null, string3, string4, null, 32376);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(setupScreen);
        a11.G1(new g(this, presenter));
        a11.I1(new h(presenter));
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a11, null);
        m11.g();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.d
    public final void y0(com.withings.wiscale2.device.common.handcalibration.v2.c presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        if (!isFinishing()) {
            aq.a aVar = new aq.a(this);
            boolean b10 = androidx.core.os.a.b();
            androidx.activity.result.b<Intent> bVar = this.f52732g;
            if (b10 && (androidx.core.content.a.checkSelfPermission(this, "android.permission.BLUETOOTH_SCAN") != 0 || androidx.core.content.a.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0)) {
                DeviceModelScanningAbilityProvider deviceModelScanningAbilityProvider = new DeviceModelScanningAbilityProvider(((Device) this.f52726a.getValue()).getModelId());
                Intent intent = new Intent(this, EnablePermissionsForScanActivity.class);
                intent.putExtra("extra_scanning_ability_provider", deviceModelScanningAbilityProvider);
                bVar.a(intent);
            } else if (!aVar.e()) {
                startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 4729);
            } else if (!aVar.c() || !aVar.d()) {
                bVar.a(RequestLocationPermissionAndSettingsActivity.a.a(RequestLocationPermissionAndSettingsActivity.f48760f, this));
            }
        }
    }
}
