package com.withings.devicesetup.network.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.AttributionReporter;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.wpp.generated.object.IpSettings;
import com.withings.comm.wpp.generated.object.WifiApConnect;
import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.comm.wpp.generated.object.WifiConnectResult;
import com.withings.devicesetup.network.ui.d;
import com.withings.qrcode.QRCodeAnalyzerType;
import com.withings.qrcode.QRCodeScannerActivity;
import com.withings.wiscale2.C1987R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.u;
import sg.j;
import u70.k;
/* loaded from: classes3.dex */
public class WifiSetupActivityV2 extends WithingsActivity implements d.b {

    /* renamed from: s */
    public static final /* synthetic */ int f37758s = 0;

    /* renamed from: a */
    private View f37759a;

    /* renamed from: b */
    private TextView f37760b;

    /* renamed from: c */
    private LinearLayout f37761c;

    /* renamed from: d */
    private TextInputLayout f37762d;

    /* renamed from: e */
    private EditText f37763e;

    /* renamed from: f */
    private TextInputLayout f37764f;

    /* renamed from: g */
    private EditText f37765g;

    /* renamed from: h */
    private EditText f37766h;

    /* renamed from: i */
    private TextView f37767i;

    /* renamed from: j */
    private Button f37768j;

    /* renamed from: k */
    private qj.h f37769k;

    /* renamed from: p */
    private k f37774p;

    /* renamed from: l */
    private WifiApConnect f37770l = null;

    /* renamed from: m */
    private IpSettings f37771m = null;

    /* renamed from: n */
    private WifiConnectResult f37772n = null;

    /* renamed from: o */
    private String f37773o = "";

    /* renamed from: q */
    private final androidx.activity.result.b<String> f37775q = registerForActivityResult(new g.a(), new cq.f(this, 1));

    /* renamed from: r */
    private final androidx.activity.result.b<Intent> f37776r = registerForActivityResult(new g.a(), new a(this, 1));

    public static void A3(WifiSetupActivityV2 wifiSetupActivityV2, ActivityResult activityResult) {
        wifiSetupActivityV2.getClass();
        if (activityResult.b() == -1 && activityResult.a() != null) {
            String stringExtra = activityResult.a().getStringExtra("qrcode_ssid");
            String stringExtra2 = activityResult.a().getStringExtra("qrcode_password");
            wifiSetupActivityV2.f37761c.setVisibility(8);
            wifiSetupActivityV2.f37763e.setText(stringExtra);
            wifiSetupActivityV2.f37765g.setText(stringExtra2);
            wifiSetupActivityV2.E3();
        }
    }

    public static /* synthetic */ void B3(WifiSetupActivityV2 wifiSetupActivityV2, Boolean bool) {
        String str;
        wifiSetupActivityV2.getClass();
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
                wifiSetupActivityV2.f37774p.b("android.permission.CAMERA");
                wifiSetupActivityV2.D3();
                return;
            }
            Toast.makeText(wifiSetupActivityV2, wifiSetupActivityV2.getString(C1987R.string.installation_device_wifi_setup_qrcode_camerapermission_error), 1).show();
            if (androidx.core.app.a.h(wifiSetupActivityV2, "android.permission.CAMERA")) {
                wifiSetupActivityV2.f37774p.b("android.permission.CAMERA");
                return;
            }
            return;
        }
        throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key));
    }

    public static void C3(WifiSetupActivityV2 wifiSetupActivityV2) {
        wifiSetupActivityV2.getClass();
        if (androidx.core.content.a.checkSelfPermission(wifiSetupActivityV2, "android.permission.CAMERA") == 0) {
            wifiSetupActivityV2.D3();
            return;
        }
        boolean a11 = wifiSetupActivityV2.f37774p.a("android.permission.CAMERA");
        boolean h11 = androidx.core.app.a.h(wifiSetupActivityV2, "android.permission.CAMERA");
        if (!a11 && !h11) {
            qc.b bVar = new qc.b(wifiSetupActivityV2);
            bVar.g(C1987R.string.installation_device_wifi_setup_qrcode_camerapermission_error);
            bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new ao.i(wifiSetupActivityV2, 2)).w(C1987R.string._NO_, new cq.g(0)).s();
            return;
        }
        wifiSetupActivityV2.f37775q.a("android.permission.CAMERA");
    }

    private void D3() {
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
            this.f37776r.a(putExtra);
            return;
        }
        throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key));
    }

    public static void z3(WifiSetupActivityV2 wifiSetupActivityV2) {
        boolean z5;
        CharSequence text;
        String stringExtra = wifiSetupActivityV2.getIntent().getStringExtra("wifiPassword");
        if (stringExtra == null || !stringExtra.equals(wifiSetupActivityV2.f37765g.getText().toString())) {
            ClipData primaryClip = ((ClipboardManager) wifiSetupActivityV2.getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0 && (text = primaryClip.getItemAt(0).getText()) != null && text.length() > 0 && wifiSetupActivityV2.f37765g.getText().toString().equals(text.toString())) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i11 = v70.a.f103433b;
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(FirebaseAnalytics.Param.METHOD, "pasted")};
                HashMap hashMap = new HashMap(1);
                Map.Entry entry = entryArr[0];
                Object key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                if (hashMap.put(key, value) == null) {
                    v70.a.d("wifi_password", "wifi_password", Collections.unmodifiableMap(hashMap), true);
                } else {
                    throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key));
                }
            } else {
                int i12 = v70.a.f103433b;
                Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry(FirebaseAnalytics.Param.METHOD, "typed")};
                HashMap hashMap2 = new HashMap(1);
                Map.Entry entry2 = entryArr2[0];
                Object key2 = entry2.getKey();
                Objects.requireNonNull(key2);
                Object value2 = entry2.getValue();
                Objects.requireNonNull(value2);
                if (hashMap2.put(key2, value2) == null) {
                    v70.a.d("wifi_password", "wifi_password", Collections.unmodifiableMap(hashMap2), true);
                } else {
                    throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key2));
                }
            }
        }
        wifiSetupActivityV2.E3();
    }

    public final void E3() {
        boolean z5;
        this.f37762d.setError(null);
        this.f37764f.setError(null);
        this.f37767i.setText("");
        this.f37767i.setVisibility(8);
        if (TextUtils.isEmpty(this.f37763e.getText())) {
            this.f37762d.setError(getString(C1987R.string._WFC_SSID_EMPTY_));
            z5 = false;
        } else {
            z5 = true;
        }
        qj.h hVar = this.f37769k;
        if (hVar != null && (hVar.f92797a.authFlags & 1) != 1 && TextUtils.isEmpty(this.f37765g.getText())) {
            this.f37764f.setError(getString(C1987R.string._WFC_PASSWORD_EMPTY_));
        } else if (!z5) {
        } else {
            if (this.f37770l == null) {
                this.f37770l = new WifiApConnect();
            }
            this.f37770l.password = this.f37765g.getText().toString();
            this.f37770l.ssid = this.f37763e.getText().toString();
            this.f37759a.setVisibility(8);
            WifiApConnect wifiApConnect = this.f37770l;
            IpSettings ipSettings = this.f37771m;
            Intent intent = new Intent();
            intent.putExtra("wifiApConnect", wifiApConnect);
            intent.putExtra("ipSettings", ipSettings);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.withings.devicesetup.network.ui.d.b
    public final void X2(WifiApConnect wifiApConnect, IpSettings ipSettings) {
        Intent intent = new Intent();
        intent.putExtra("wifiApConnect", wifiApConnect);
        intent.putExtra("ipSettings", ipSettings);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_wifi_setup_v2);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        supportActionBar.o(true);
        this.f37759a = findViewById(C1987R.id.screen);
        this.f37760b = (TextView) findViewById(C1987R.id.title);
        this.f37761c = (LinearLayout) findViewById(C1987R.id.ssid_frame);
        this.f37762d = (TextInputLayout) findViewById(C1987R.id.ssid_layout);
        this.f37763e = (EditText) findViewById(C1987R.id.ssid);
        this.f37764f = (TextInputLayout) findViewById(C1987R.id.password_layout);
        this.f37765g = (EditText) findViewById(C1987R.id.password);
        this.f37766h = (EditText) findViewById(C1987R.id.qr_code);
        this.f37767i = (TextView) findViewById(C1987R.id.error);
        this.f37768j = (Button) findViewById(C1987R.id.connect_btn);
        this.f37766h.setOnClickListener(new j(this, 2));
        this.f37768j.setOnClickListener(new com.google.android.material.search.g(this, 2));
        this.f37759a.setVisibility(0);
        this.f37774p = new k(this);
        this.f37769k = (qj.h) getIntent().getSerializableExtra("wifiApScan");
        this.f37770l = (WifiApConnect) getIntent().getSerializableExtra("wifiApConnect");
        this.f37771m = (IpSettings) getIntent().getSerializableExtra("ipSettings");
        this.f37772n = (WifiConnectResult) getIntent().getSerializableExtra("wifiConnectReply");
        String stringExtra = getIntent().getStringExtra("wifiSSID");
        String stringExtra2 = getIntent().getStringExtra("wifiPassword");
        qj.h hVar = this.f37769k;
        if (hVar != null) {
            WifiApScan wifiApScan = hVar.f92797a;
            this.f37761c.setVisibility(8);
            this.f37763e.setText(wifiApScan.ssid);
        } else if (this.f37770l != null) {
            this.f37763e.setVisibility(8);
            this.f37763e.setText(this.f37770l.ssid);
            this.f37765g.setText(this.f37770l.password);
            WifiConnectResult wifiConnectResult = this.f37772n;
            if (wifiConnectResult != null) {
                this.f37767i.setVisibility(8);
                short s11 = wifiConnectResult.wifi;
                if (s11 != 0) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    this.f37767i.setText(C1987R.string._WFC_CFG_ERROR_REFUSED_MSG_);
                                    this.f37767i.setVisibility(0);
                                } else {
                                    this.f37767i.setText(C1987R.string._ERROR_WIFI_NO_ANSWER_);
                                    this.f37767i.setVisibility(0);
                                }
                            } else {
                                this.f37767i.setText(C1987R.string._WFC_CFG_ERROR_RSSI_MSG_);
                                this.f37767i.setVisibility(0);
                            }
                        } else {
                            this.f37767i.setText(C1987R.string._WFC_CFG_ERROR_NO_ANSWER_MSG_);
                            this.f37767i.setVisibility(0);
                        }
                    } else {
                        this.f37765g.setError(getString(C1987R.string._ERROR_WIFI_PASSWORD_));
                    }
                } else if (wifiConnectResult.dhcp != 0) {
                    this.f37767i.setText(C1987R.string._WFC_CFG_ERROR_DHCP_MSG_);
                    this.f37767i.setVisibility(0);
                } else if (wifiConnectResult.dnsResolv != 0) {
                    this.f37767i.setText(C1987R.string._WFC_CFG_ERROR_DNS_MSG_);
                    this.f37767i.setVisibility(0);
                } else if (wifiConnectResult.http != 0) {
                    this.f37767i.setText(C1987R.string._WFC_CFG_ERROR_HTTP_MSG_);
                    this.f37767i.setVisibility(0);
                }
            }
        } else if (stringExtra != null && stringExtra2 != null) {
            this.f37761c.setVisibility(8);
            this.f37763e.setText(stringExtra);
            this.f37765g.setText(stringExtra2);
            E3();
        }
        String obj = this.f37763e.getText().toString();
        if (!obj.isEmpty()) {
            this.f37773o = getString(C1987R.string.wifiConnect_titleWithWiFiName, obj);
        } else {
            this.f37773o = getString(C1987R.string._CONFIG_IP_MANUELLE_);
        }
        this.f37760b.setText(this.f37773o);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1987R.menu.configure_wifi, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            setResult(0);
            finish();
            return true;
        } else if (menuItem.getItemId() == C1987R.id.wifi_advanced_config) {
            d.a aVar = d.f37795x;
            String ssid = this.f37763e.getText().toString();
            String password = this.f37765g.getText().toString();
            IpSettings ipSettings = this.f37771m;
            aVar.getClass();
            u.j(ssid, "ssid");
            u.j(password, "password");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ssid", ssid);
            bundle.putSerializable("wifiPassword", password);
            bundle.putSerializable("ipSettings", ipSettings);
            dVar.setArguments(bundle);
            dVar.show(getSupportFragmentManager(), "WifiAdvancedConfigDialog");
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }
}
