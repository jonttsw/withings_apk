package com.withings.devicesetup.network.ui;

import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.m0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.AttributionReporter;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.wpp.generated.object.IpSettings;
import com.withings.comm.wpp.generated.object.WifiApConnect;
import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.comm.wpp.generated.object.WifiConnectResult;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.network.conversation.NetworkConfigurationConversation;
import com.withings.devicesetup.network.ui.b;
import com.withings.features.FeatureFlag;
import com.withings.qrcode.QRCodeAnalyzerType;
import com.withings.qrcode.QRCodeScannerActivity;
import com.withings.wiscale2.C1987R;
import ej.w;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.u;
import u70.k;
/* loaded from: classes3.dex */
public class PickWifiForSetupActivity extends WithingsActivity implements b.InterfaceC0495b {

    /* renamed from: j */
    public static final /* synthetic */ int f37724j = 0;

    /* renamed from: a */
    private WifiApConnect f37725a;

    /* renamed from: b */
    private IpSettings f37726b;

    /* renamed from: c */
    private WifiConnectResult f37727c;

    /* renamed from: d */
    private SetupConversation f37728d;

    /* renamed from: e */
    private boolean f37729e;

    /* renamed from: f */
    private k f37730f;

    /* renamed from: g */
    private final androidx.activity.result.b<String> f37731g = registerForActivityResult(new g.a(), new com.withings.authentication.c(this, 2));

    /* renamed from: h */
    private final androidx.activity.result.b<Intent> f37732h = registerForActivityResult(new g.a(), new cq.f(this, 0));

    /* renamed from: i */
    private final androidx.activity.result.b<Intent> f37733i = registerForActivityResult(new g.a(), new a(this, 0));

    public static /* synthetic */ void A3(PickWifiForSetupActivity pickWifiForSetupActivity, Boolean bool) {
        String str;
        pickWifiForSetupActivity.getClass();
        int i11 = v70.a.f103433b;
        if (bool.booleanValue()) {
            str = "granted";
        } else {
            str = "denied";
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("camera", str)};
        HashMap hashMap = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (hashMap.put(key, value) == null) {
            v70.a.d(AttributionReporter.SYSTEM_PERMISSION, AttributionReporter.SYSTEM_PERMISSION, Collections.unmodifiableMap(hashMap), true);
            if (bool.booleanValue()) {
                pickWifiForSetupActivity.f37730f.b("android.permission.CAMERA");
                pickWifiForSetupActivity.E3();
                return;
            }
            Toast.makeText(pickWifiForSetupActivity, pickWifiForSetupActivity.getString(C1987R.string.installation_device_wifi_setup_qrcode_camerapermission_error), 1).show();
            if (androidx.core.app.a.h(pickWifiForSetupActivity, "android.permission.CAMERA")) {
                pickWifiForSetupActivity.f37730f.b("android.permission.CAMERA");
                return;
            }
            return;
        }
        throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key));
    }

    public static void B3(PickWifiForSetupActivity pickWifiForSetupActivity, ActivityResult activityResult) {
        String str;
        String str2;
        Intent putExtra;
        pickWifiForSetupActivity.getClass();
        if (activityResult.b() == -1) {
            if (activityResult.a() != null) {
                str = activityResult.a().getStringExtra("qrcode_ssid");
                str2 = activityResult.a().getStringExtra("qrcode_password");
            } else {
                str = "";
                str2 = "";
            }
            if (wr.b.c(FeatureFlag.f39140y)) {
                putExtra = new Intent(pickWifiForSetupActivity, WifiSetupActivityV2.class).putExtra("wifiSSID", str).putExtra("wifiPassword", str2);
            } else {
                putExtra = new Intent(pickWifiForSetupActivity, WifiSetupActivity.class).putExtra("wifiSSID", str).putExtra("wifiPassword", str2);
            }
            pickWifiForSetupActivity.f37733i.a(putExtra);
        }
    }

    private void D3() {
        if (((NetworkConfigurationConversation) this.f37728d.s(NetworkConfigurationConversation.class)).N()) {
            setResult(1111);
            finish();
            return;
        }
        qc.b bVar = new qc.b(this);
        bVar.g(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_);
        bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new cq.b(this, 0)).w(C1987R.string._NO_, new cq.c(0)).s();
    }

    private void E3() {
        int i11 = v70.a.f103433b;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(FirebaseAnalytics.Param.METHOD, "qr_code")};
        HashMap hashMap = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (hashMap.put(key, value) == null) {
            v70.a.d("wifi_connexion_method", "wifi_connexion_method", Collections.unmodifiableMap(hashMap), true);
            Intent putExtra = new Intent(this, QRCodeScannerActivity.class).putExtra("qrcode_analyzer_type", QRCodeAnalyzerType.f43850c);
            u.i(putExtra, "putExtra(...)");
            this.f37732h.a(putExtra);
            return;
        }
        throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key));
    }

    public void I3(qj.h hVar) {
        Intent putExtra;
        if (wr.b.c(FeatureFlag.f39140y)) {
            putExtra = new Intent(this, WifiSetupActivityV2.class).putExtra("wifiApScan", hVar);
        } else {
            putExtra = new Intent(this, WifiSetupActivity.class).putExtra("wifiApScan", hVar);
        }
        this.f37733i.a(putExtra);
    }

    public static /* synthetic */ void z3(PickWifiForSetupActivity pickWifiForSetupActivity) {
        pickWifiForSetupActivity.f37729e = true;
        pickWifiForSetupActivity.finish();
    }

    public final void F3() {
        Intent intent;
        if (wr.b.c(FeatureFlag.f39140y)) {
            intent = new Intent(this, WifiSetupActivityV2.class);
        } else {
            intent = new Intent(this, WifiSetupActivity.class);
        }
        this.f37733i.a(intent);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public final void G3() {
        if (androidx.core.content.a.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            E3();
            return;
        }
        boolean a11 = this.f37730f.a("android.permission.CAMERA");
        boolean h11 = androidx.core.app.a.h(this, "android.permission.CAMERA");
        if (!a11 && !h11) {
            qc.b bVar = new qc.b(this);
            bVar.g(C1987R.string.installation_device_wifi_setup_qrcode_camerapermission_error);
            bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new cq.d(this, 0)).w(C1987R.string._NO_, new Object()).s();
            return;
        }
        this.f37731g.a("android.permission.CAMERA");
    }

    public final void H3(qj.h hVar) {
        int i11 = v70.a.f103433b;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(FirebaseAnalytics.Param.METHOD, "list")};
        HashMap hashMap = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (hashMap.put(key, value) == null) {
            v70.a.d("wifi_connexion_method", "wifi_connexion_method", Collections.unmodifiableMap(hashMap), true);
            if (hVar.f92798b) {
                SetupConversation setupConversation = this.f37728d;
                if (setupConversation != null) {
                    Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry("device_model", setupConversation.O().w().toString()), new AbstractMap.SimpleEntry("mac_address", this.f37728d.v().toString()), new AbstractMap.SimpleEntry(FirebaseAnalytics.Param.METHOD, "already_configured")};
                    HashMap hashMap2 = new HashMap(3);
                    for (int i12 = 0; i12 < 3; i12++) {
                        Map.Entry entry2 = entryArr2[i12];
                        Object key2 = entry2.getKey();
                        Objects.requireNonNull(key2);
                        Object value2 = entry2.getValue();
                        Objects.requireNonNull(value2);
                        if (hashMap2.put(key2, value2) != null) {
                            throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key2));
                        }
                    }
                    v70.a.d("wifi_password", "wifi_password", Collections.unmodifiableMap(hashMap2), true);
                }
                qc.b bVar = new qc.b(this);
                bVar.v(getString(C1987R.string._WIFI_CONFIG_POPUP_CONTENT_));
                bVar.z(C1987R.string._WBS_CURRENT_WIFI_KEEP_, new ao.g(this, 1)).w(C1987R.string._WBS_CURRENT_WIFI_CHANGE_, new com.withings.device.setup.ui.c(1, this, hVar)).s();
                return;
            }
            WifiApScan wifiApScan = hVar.f92797a;
            if ((wifiApScan.authFlags & 1) == 1) {
                String str = wifiApScan.ssid;
                Intent intent = new Intent();
                intent.putExtra("wifiApConnect", new WifiApConnect().setSsid(str).setPassword(""));
                intent.putExtra("ipSettings", this.f37726b);
                setResult(-1, intent);
                finish();
                return;
            }
            I3(hVar);
            return;
        }
        throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        D3();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b bVar;
        Intent putExtra;
        String str;
        super.onCreate(bundle);
        u70.i iVar = (u70.i) getIntent().getSerializableExtra("macAddress");
        this.f37725a = (WifiApConnect) getIntent().getSerializableExtra("wifiApConnect");
        this.f37726b = (IpSettings) getIntent().getSerializableExtra("ipSettings");
        this.f37727c = (WifiConnectResult) getIntent().getSerializableExtra("wifiConnectReply");
        SetupConversation setupConversation = (SetupConversation) w.w().y(iVar, SetupConversation.class);
        this.f37728d = setupConversation;
        if (setupConversation == null) {
            x70.b.u(this, iVar, "There is no setup conversation for this mac address : %s", iVar);
            finish();
            return;
        }
        setContentView(C1987R.layout.activity_setup);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        supportActionBar.o(true);
        this.f37730f = new k(this);
        if (bundle == null) {
            WifiInfo connectionInfo = ((WifiManager) getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null && connectionInfo.getNetworkId() != -1) {
                str = connectionInfo.getSSID();
            } else {
                str = null;
            }
            bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("macAddress", iVar);
            bundle2.putString("currentSSID", str);
            bVar.setArguments(bundle2);
            m0 m11 = getSupportFragmentManager().m();
            m11.l(C1987R.id.content, bVar, "fragment");
            m11.g();
        } else {
            bVar = (b) getSupportFragmentManager().Y("fragment");
        }
        bVar.v1(this);
        if (this.f37725a != null) {
            if (wr.b.c(FeatureFlag.f39140y)) {
                WifiApConnect wifiApConnect = this.f37725a;
                IpSettings ipSettings = this.f37726b;
                putExtra = new Intent(this, WifiSetupActivityV2.class).putExtra("wifiApConnect", wifiApConnect).putExtra("ipSettings", ipSettings).putExtra("wifiConnectReply", this.f37727c);
            } else {
                WifiApConnect wifiApConnect2 = this.f37725a;
                IpSettings ipSettings2 = this.f37726b;
                putExtra = new Intent(this, WifiSetupActivity.class).putExtra("wifiApConnect", wifiApConnect2).putExtra("ipSettings", ipSettings2).putExtra("wifiConnectReply", this.f37727c);
            }
            this.f37733i.a(putExtra);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1987R.menu.pick_wifi, menu);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        SetupConversation setupConversation;
        if (this.f37729e && (setupConversation = this.f37728d) != null) {
            setupConversation.p();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 == menuItem.getItemId()) {
            D3();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
