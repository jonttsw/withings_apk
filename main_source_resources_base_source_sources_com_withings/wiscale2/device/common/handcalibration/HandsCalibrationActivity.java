package com.withings.wiscale2.device.common.handcalibration;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.m;
import androidx.activity.o;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.util.DeviceModelScanningAbilityProvider;
import com.withings.device.Device;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.gps.ui.RequestLocationPermissionAndSettingsActivity;
import com.withings.wiscale2.device.common.handcalibration.a;
import com.withings.wiscale2.device.common.handcalibration.f;
import com.withings.wiscale2.device.common.ui.s2;
import fl.p;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: HandsCalibrationActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/HandsCalibrationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Llc0/h;", "Llc0/c;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HandsCalibrationActivity extends WithingsActivity implements lc0.h, lc0.c {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f52667f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f52668a = nm0.h.b(new a());

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f52669b = nm0.h.b(new b());

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f52670c = nm0.h.b(new c());

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f52671d = nm0.h.b(new d());

    /* renamed from: e  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f52672e;

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<Device> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = HandsCalibrationActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("extra_device", Device.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("extra_device");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            u.g(obj);
            return (Device) obj;
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<lc0.g> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final lc0.g invoke() {
            HandsCalibrationActivity handsCalibrationActivity = HandsCalibrationActivity.this;
            lc0.g gVar = new lc0.g(HandsCalibrationActivity.z3(handsCalibrationActivity), handsCalibrationActivity);
            gVar.f79285c = p.f67672b.a().g(HandsCalibrationActivity.z3(handsCalibrationActivity)).g(handsCalibrationActivity, ej.w.w().E(HandsCalibrationActivity.z3(handsCalibrationActivity).getMacAddress()));
            return gVar;
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<Toolbar> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) HandsCalibrationActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: HandsCalibrationActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<s2> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final s2 invoke() {
            return s2.s1(HandsCalibrationActivity.z3(HandsCalibrationActivity.this).getModel());
        }
    }

    public HandsCalibrationActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.devicesetup.network.ui.a(this, 3));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f52672e = registerForActivityResult;
    }

    private final lc0.g A3() {
        return (lc0.g) this.f52669b.getValue();
    }

    public static final Device z3(HandsCalibrationActivity handsCalibrationActivity) {
        return (Device) handsCalibrationActivity.f52668a.getValue();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void D2(f presenter, HandCalibration handCalibration) {
        u.j(presenter, "presenter");
        u.j(handCalibration, "handCalibration");
        com.withings.wiscale2.device.common.handcalibration.a.f52681i.getClass();
        com.withings.wiscale2.device.common.handcalibration.a a11 = a.C0705a.a(handCalibration, true);
        a11.y1(this);
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a11, null);
        m11.g();
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void F0(f presenter, WppDeviceConversation conversation, Exception exception) {
        u.j(presenter, "presenter");
        u.j(conversation, "conversation");
        u.j(exception, "exception");
        runOnUiThread(new o(this, 8));
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void S2(f presenter) {
        u.j(presenter, "presenter");
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void e2(f presenter, f.a aVar, HandCalibration handCalibration) {
        u.j(presenter, "presenter");
        u.j(handCalibration, "handCalibration");
        D2(presenter, handCalibration);
    }

    @Override // lc0.c
    public final void g1(com.withings.wiscale2.device.common.handcalibration.a fragment) {
        u.j(fragment, "fragment");
    }

    @Override // lc0.h
    public final void i3(lc0.g presenter) {
        u.j(presenter, "presenter");
        if (!isFinishing()) {
            aq.a aVar = new aq.a(this);
            int i11 = Build.VERSION.SDK_INT;
            androidx.activity.result.b<Intent> bVar = this.f52672e;
            if (i11 >= 31 && (androidx.core.content.a.checkSelfPermission(this, "android.permission.BLUETOOTH_SCAN") != 0 || androidx.core.content.a.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0)) {
                DeviceModelScanningAbilityProvider deviceModelScanningAbilityProvider = new DeviceModelScanningAbilityProvider(((Device) this.f52668a.getValue()).getModelId());
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

    @Override // lc0.c
    public final void j0(com.withings.wiscale2.device.common.handcalibration.a fragment, int i11) {
        u.j(fragment, "fragment");
        A3().f(i11);
    }

    @Override // lc0.h
    public final void l1(lc0.g presenter, String str) {
        u.j(presenter, "presenter");
        Fragment X = getSupportFragmentManager().X(C1987R.id.content);
        nm0.g gVar = this.f52671d;
        if (!u.e(X, (s2) gVar.getValue())) {
            m0 m11 = getSupportFragmentManager().m();
            m11.l(C1987R.id.content, (s2) gVar.getValue(), null);
            m11.g();
        }
        ((s2) gVar.getValue()).t1(str);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void n1(f presenter) {
        u.j(presenter, "presenter");
    }

    @Override // lc0.c
    public final void o3(com.withings.wiscale2.device.common.handcalibration.a fragment) {
        u.j(fragment, "fragment");
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
        setSupportActionBar((Toolbar) this.f52670c.getValue());
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
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
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

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void q2(f presenter) {
        u.j(presenter, "presenter");
        runOnUiThread(new m(this, 7));
    }
}
