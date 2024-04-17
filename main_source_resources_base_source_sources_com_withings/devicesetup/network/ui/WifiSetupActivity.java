package com.withings.devicesetup.network.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.wpp.generated.object.IpSettings;
import com.withings.comm.wpp.generated.object.WifiApConnect;
import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.comm.wpp.generated.object.WifiConnectResult;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import d2.b0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class WifiSetupActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private boolean f37734a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37735b = false;

    /* renamed from: c  reason: collision with root package name */
    private TextView f37736c;

    /* renamed from: d  reason: collision with root package name */
    private View f37737d;

    /* renamed from: e  reason: collision with root package name */
    private View f37738e;

    /* renamed from: f  reason: collision with root package name */
    private View f37739f;

    /* renamed from: g  reason: collision with root package name */
    private EditText f37740g;

    /* renamed from: h  reason: collision with root package name */
    private EditText f37741h;

    /* renamed from: i  reason: collision with root package name */
    private EditText f37742i;

    /* renamed from: j  reason: collision with root package name */
    private EditText f37743j;

    /* renamed from: k  reason: collision with root package name */
    private EditText f37744k;

    /* renamed from: l  reason: collision with root package name */
    private EditText f37745l;

    /* renamed from: m  reason: collision with root package name */
    private EditText f37746m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f37747n;

    /* renamed from: o  reason: collision with root package name */
    private TextInputLayout f37748o;

    /* renamed from: p  reason: collision with root package name */
    private TextInputLayout f37749p;

    /* renamed from: q  reason: collision with root package name */
    private TextInputLayout f37750q;

    /* renamed from: r  reason: collision with root package name */
    private TextInputLayout f37751r;

    /* renamed from: s  reason: collision with root package name */
    private TextInputLayout f37752s;

    /* renamed from: t  reason: collision with root package name */
    private TextInputLayout f37753t;

    /* renamed from: u  reason: collision with root package name */
    private CheckBox f37754u;

    /* renamed from: v  reason: collision with root package name */
    private EditText f37755v;

    /* renamed from: w  reason: collision with root package name */
    private CheckBox f37756w;

    /* renamed from: x  reason: collision with root package name */
    private qj.h f37757x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z3(WifiSetupActivity wifiSetupActivity) {
        boolean z5;
        CharSequence text;
        String stringExtra = wifiSetupActivity.getIntent().getStringExtra("wifiPassword");
        if (stringExtra == null || !stringExtra.equals(wifiSetupActivity.f37740g.getText().toString())) {
            ClipData primaryClip = ((ClipboardManager) wifiSetupActivity.getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0 && (text = primaryClip.getItemAt(0).getText()) != null && text.length() > 0 && wifiSetupActivity.f37740g.getText().toString().equals(text.toString())) {
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
                    return;
                }
                throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key));
            }
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
                return;
            }
            throw new IllegalArgumentException(androidx.activity.b.a("duplicate key: ", key2));
        }
    }

    public final void A3(boolean z5) {
        int i11;
        this.f37734a = z5;
        View view = this.f37738e;
        int i12 = 0;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        CheckBox checkBox = this.f37754u;
        if (!z5) {
            i12 = 8;
        }
        checkBox.setVisibility(i12);
        if (this.f37739f.getVisibility() == 0) {
            this.f37739f.setVisibility(8);
        }
    }

    public final void B3(boolean z5) {
        int i11;
        this.f37735b = z5;
        View view = this.f37739f;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    public final void C3() {
        Serializable serializable = null;
        this.f37749p.setError(null);
        this.f37750q.setError(null);
        this.f37751r.setError(null);
        this.f37752s.setError(null);
        this.f37753t.setError(null);
        this.f37748o.setError(null);
        if (TextUtils.isEmpty(this.f37746m.getText())) {
            this.f37747n.setText(C1987R.string._WFC_SSID_EMPTY_);
            this.f37747n.setVisibility(0);
            return;
        }
        if (this.f37756w.isChecked()) {
            if (TextUtils.isEmpty(this.f37741h.getText())) {
                this.f37749p.setError(getString(C1987R.string._WFC_IP_ADDRESS_EMPTY_));
                return;
            }
            Pattern pattern = Patterns.IP_ADDRESS;
            if (!pattern.matcher(this.f37741h.getText().toString()).matches()) {
                this.f37749p.setError(getString(C1987R.string._WFC_IP_ADDRESS_INVALID_));
                return;
            } else if (TextUtils.isEmpty(this.f37755v.getText())) {
                this.f37750q.setError(getString(C1987R.string._WFC_NETMASK_EMPTY_));
                return;
            } else if (!pattern.matcher(this.f37755v.getText().toString()).matches()) {
                this.f37750q.setError(getString(C1987R.string._WFC_NETMASK_INVALID_));
                return;
            } else if (TextUtils.isEmpty(this.f37743j.getText())) {
                this.f37751r.setError(getString(C1987R.string._WFC_ROUTER_EMPTY_));
                return;
            } else if (!pattern.matcher(this.f37743j.getText().toString()).matches()) {
                this.f37751r.setError(getString(C1987R.string._WFC_ROUTER_INVALID_));
                return;
            } else if (TextUtils.isEmpty(this.f37742i.getText())) {
                this.f37752s.setError(getString(C1987R.string._WFC_DNS_EMPTY_));
                return;
            } else if (!pattern.matcher(this.f37742i.getText().toString()).matches()) {
                this.f37752s.setError(getString(C1987R.string._WFC_DNS_INVALID_));
                return;
            }
        }
        if (this.f37754u.isChecked()) {
            if (TextUtils.isEmpty(this.f37744k.getText())) {
                this.f37748o.setError(getString(C1987R.string._WFC_PROXY_EMPTY_));
                return;
            } else if (!Patterns.IP_ADDRESS.matcher(this.f37744k.getText().toString()).matches()) {
                this.f37748o.setError(getString(C1987R.string._WFC_PROXY_INVALID_));
                return;
            }
        }
        qj.h hVar = this.f37757x;
        if (hVar != null && (hVar.f92797a.authFlags & 1) != 1 && TextUtils.isEmpty(this.f37740g.getText())) {
            this.f37753t.setError(getString(C1987R.string._WFC_PASSWORD_EMPTY_));
            return;
        }
        WifiApConnect wifiApConnect = new WifiApConnect();
        wifiApConnect.password = this.f37740g.getText().toString();
        wifiApConnect.ssid = this.f37746m.getText().toString();
        if (this.f37734a) {
            b0 b0Var = new b0(1, 0);
            b0Var.o(this.f37741h.getText().toString().trim());
            b0Var.m(this.f37742i.getText().toString().trim());
            b0Var.n(this.f37743j.getText().toString().trim());
            b0Var.p(this.f37755v.getText().toString().trim());
            if (this.f37735b) {
                b0Var.q(this.f37744k.getText().toString().trim());
                b0Var.r(this.f37745l.getText().toString().trim());
            }
            serializable = b0Var.i();
        }
        this.f37737d.setVisibility(8);
        Intent intent = new Intent();
        intent.putExtra("wifiApConnect", wifiApConnect);
        intent.putExtra("ipSettings", serializable);
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
        boolean z5;
        int i11;
        int i12;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_wifi_setup);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        boolean z11 = true;
        getSupportActionBar().o(true);
        this.f37736c = (TextView) findViewById(C1987R.id.text);
        this.f37737d = findViewById(C1987R.id.details);
        this.f37738e = findViewById(C1987R.id.ipFrame);
        this.f37739f = findViewById(C1987R.id.proxyFrame);
        this.f37740g = (EditText) findViewById(C1987R.id.password);
        this.f37755v = (EditText) findViewById(C1987R.id.mask);
        this.f37741h = (EditText) findViewById(C1987R.id.f111261ip);
        this.f37742i = (EditText) findViewById(C1987R.id.dns);
        this.f37743j = (EditText) findViewById(C1987R.id.gateway);
        this.f37744k = (EditText) findViewById(C1987R.id.proxyIp);
        this.f37745l = (EditText) findViewById(C1987R.id.proxyPort);
        this.f37746m = (EditText) findViewById(C1987R.id.ssid);
        this.f37747n = (TextView) findViewById(C1987R.id.error);
        this.f37748o = (TextInputLayout) findViewById(C1987R.id.proxy_ip_layout);
        this.f37749p = (TextInputLayout) findViewById(C1987R.id.ip_layout);
        this.f37750q = (TextInputLayout) findViewById(C1987R.id.mask_layout);
        this.f37751r = (TextInputLayout) findViewById(C1987R.id.gateway_layout);
        this.f37752s = (TextInputLayout) findViewById(C1987R.id.dns_layout);
        this.f37753t = (TextInputLayout) findViewById(C1987R.id.pass_layout);
        ((WorkflowBar) findViewById(C1987R.id.workflowBar)).setRightClickListener(new g(this));
        CheckBox checkBox = (CheckBox) findViewById(C1987R.id.isIpConfig);
        this.f37756w = checkBox;
        checkBox.setOnCheckedChangeListener(new h(this));
        CheckBox checkBox2 = (CheckBox) findViewById(C1987R.id.isProxy);
        this.f37754u = checkBox2;
        checkBox2.setOnCheckedChangeListener(new i(this));
        this.f37737d.setVisibility(0);
        this.f37757x = (qj.h) getIntent().getSerializableExtra("wifiApScan");
        WifiApConnect wifiApConnect = (WifiApConnect) getIntent().getSerializableExtra("wifiApConnect");
        IpSettings ipSettings = (IpSettings) getIntent().getSerializableExtra("ipSettings");
        WifiConnectResult wifiConnectResult = (WifiConnectResult) getIntent().getSerializableExtra("wifiConnectReply");
        String stringExtra = getIntent().getStringExtra("wifiSSID");
        String stringExtra2 = getIntent().getStringExtra("wifiPassword");
        qj.h hVar = this.f37757x;
        if (hVar != null) {
            WifiApScan wifiApScan = hVar.f92797a;
            this.f37736c.setText(wifiApScan.ssid);
            this.f37746m.setVisibility(8);
            this.f37746m.setText(wifiApScan.ssid);
        } else if (wifiApConnect != null) {
            this.f37736c.setText(wifiApConnect.ssid);
            this.f37746m.setVisibility(8);
            this.f37746m.setText(wifiApConnect.ssid);
            this.f37740g.setText(wifiApConnect.password);
            CheckBox checkBox3 = this.f37756w;
            if (ipSettings != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            checkBox3.setChecked(z5);
            View view = this.f37738e;
            if (ipSettings != null) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            if (ipSettings != null) {
                b0 b0Var = new b0(ipSettings);
                this.f37741h.setText(b0Var.h());
                this.f37742i.setText(b0Var.f());
                this.f37743j.setText(b0Var.g());
                this.f37755v.setText(b0Var.j());
                CheckBox checkBox4 = this.f37754u;
                if (ipSettings.proxyIp.length == 0) {
                    z11 = false;
                }
                checkBox4.setChecked(z11);
                View view2 = this.f37739f;
                if (ipSettings.proxyIp.length != 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                view2.setVisibility(i12);
                this.f37744k.setText(b0Var.k());
                this.f37745l.setText(b0Var.l());
            }
            if (wifiConnectResult != null) {
                this.f37747n.setVisibility(8);
                short s11 = wifiConnectResult.wifi;
                if (s11 != 0) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    this.f37747n.setText(C1987R.string._WFC_CFG_ERROR_REFUSED_MSG_);
                                    this.f37747n.setVisibility(0);
                                    return;
                                }
                                this.f37747n.setText(C1987R.string._ERROR_WIFI_NO_ANSWER_);
                                this.f37747n.setVisibility(0);
                                return;
                            }
                            this.f37747n.setText(C1987R.string._WFC_CFG_ERROR_RSSI_MSG_);
                            this.f37747n.setVisibility(0);
                            return;
                        }
                        this.f37747n.setText(C1987R.string._WFC_CFG_ERROR_NO_ANSWER_MSG_);
                        this.f37747n.setVisibility(0);
                        return;
                    }
                    this.f37740g.setError(getString(C1987R.string._ERROR_WIFI_PASSWORD_));
                } else if (wifiConnectResult.dhcp != 0) {
                    this.f37747n.setText(C1987R.string._WFC_CFG_ERROR_DHCP_MSG_);
                    this.f37747n.setVisibility(0);
                } else if (wifiConnectResult.dnsResolv != 0) {
                    this.f37747n.setText(C1987R.string._WFC_CFG_ERROR_DNS_MSG_);
                    this.f37747n.setVisibility(0);
                } else if (wifiConnectResult.http != 0) {
                    this.f37747n.setText(C1987R.string._WFC_CFG_ERROR_HTTP_MSG_);
                    this.f37747n.setVisibility(0);
                }
            }
        } else if (stringExtra != null && stringExtra2 != null) {
            this.f37736c.setText(stringExtra);
            this.f37746m.setVisibility(8);
            this.f37746m.setText(stringExtra);
            this.f37740g.setText(stringExtra2);
            C3();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            setResult(0);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }
}
