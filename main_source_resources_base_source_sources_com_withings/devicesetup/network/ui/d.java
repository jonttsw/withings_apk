package com.withings.devicesetup.network.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.l;
import com.google.android.material.textfield.TextInputLayout;
import com.withings.comm.wpp.generated.object.IpSettings;
import com.withings.comm.wpp.generated.object.WifiApConnect;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import d2.b0;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WifiAdvancedConfigFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/devicesetup/network/ui/d;", "Lcom/google/android/material/bottomsheet/l;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class d extends l {

    /* renamed from: c  reason: collision with root package name */
    private b f37797c;

    /* renamed from: d  reason: collision with root package name */
    private final c f37798d = new c(this);

    /* renamed from: e  reason: collision with root package name */
    private final C0496d f37799e = new C0496d(this);

    /* renamed from: f  reason: collision with root package name */
    private final IpSettings f37800f;

    /* renamed from: g  reason: collision with root package name */
    private TextInputLayout f37801g;

    /* renamed from: h  reason: collision with root package name */
    private EditText f37802h;

    /* renamed from: i  reason: collision with root package name */
    private TextInputLayout f37803i;

    /* renamed from: j  reason: collision with root package name */
    private EditText f37804j;

    /* renamed from: k  reason: collision with root package name */
    private TextInputLayout f37805k;

    /* renamed from: l  reason: collision with root package name */
    private EditText f37806l;

    /* renamed from: m  reason: collision with root package name */
    private TextInputLayout f37807m;

    /* renamed from: n  reason: collision with root package name */
    private EditText f37808n;

    /* renamed from: o  reason: collision with root package name */
    private TextInputLayout f37809o;

    /* renamed from: p  reason: collision with root package name */
    private EditText f37810p;

    /* renamed from: q  reason: collision with root package name */
    private TextInputLayout f37811q;

    /* renamed from: r  reason: collision with root package name */
    private EditText f37812r;

    /* renamed from: s  reason: collision with root package name */
    private TextInputLayout f37813s;

    /* renamed from: t  reason: collision with root package name */
    private EditText f37814t;

    /* renamed from: u  reason: collision with root package name */
    private EditText f37815u;

    /* renamed from: v  reason: collision with root package name */
    private Button f37816v;

    /* renamed from: w  reason: collision with root package name */
    private ImageButton f37817w;

    /* renamed from: y  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f37796y = {v.c(d.class, "wifiSsid", "getWifiSsid()Ljava/lang/String;", 0), v.c(d.class, "wifiPassword", "getWifiPassword()Ljava/lang/String;", 0)};

    /* renamed from: x  reason: collision with root package name */
    public static final a f37795x = new Object();

    /* compiled from: WifiAdvancedConfigFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: WifiAdvancedConfigFragment.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void X2(WifiApConnect wifiApConnect, IpSettings ipSettings);
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Fragment, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f37818a = nm0.h.b(new e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f37819b;

        public c(Fragment fragment) {
            this.f37819b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f37818a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* renamed from: com.withings.devicesetup.network.ui.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0496d implements bn0.d<Fragment, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f37820a = nm0.h.b(new f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f37821b;

        public C0496d(Fragment fragment) {
            this.f37821b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f37820a.getValue();
        }
    }

    public d() {
        Object obj;
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.get("ipSettings");
        } else {
            obj = null;
        }
        this.f37800f = obj instanceof IpSettings ? (IpSettings) obj : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e7, code lost:
        if (r12 == false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s1(com.withings.devicesetup.network.ui.d r18) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.devicesetup.network.ui.d.s1(com.withings.devicesetup.network.ui.d):void");
    }

    private final boolean t1() {
        EditText editText = this.f37806l;
        if (editText != null) {
            if (editText.getText().toString().length() <= 0) {
                EditText editText2 = this.f37808n;
                if (editText2 != null) {
                    if (editText2.getText().toString().length() <= 0) {
                        EditText editText3 = this.f37810p;
                        if (editText3 != null) {
                            if (editText3.getText().toString().length() <= 0) {
                                EditText editText4 = this.f37812r;
                                if (editText4 != null) {
                                    if (editText4.getText().toString().length() <= 0) {
                                        return false;
                                    }
                                } else {
                                    u.s("dns");
                                    throw null;
                                }
                            }
                        } else {
                            u.s("gateway");
                            throw null;
                        }
                    }
                } else {
                    u.s("mask");
                    throw null;
                }
            }
            return true;
        }
        u.s(ConstantsWs.JSON_SESSION_KEY_MYIP);
        throw null;
    }

    private final boolean u1() {
        EditText editText = this.f37814t;
        if (editText != null) {
            if (editText.getText().toString().length() <= 0) {
                EditText editText2 = this.f37815u;
                if (editText2 != null) {
                    if (editText2.getText().toString().length() <= 0) {
                        return false;
                    }
                } else {
                    u.s("proxyPort");
                    throw null;
                }
            }
            return true;
        }
        u.s("proxyIp");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        View inflate = inflater.inflate(C1987R.layout.fragment_wifi_advanced_config, viewGroup, false);
        u.i(inflate, "inflate(...)");
        View findViewById = inflate.findViewById(C1987R.id.ssid_layout);
        u.i(findViewById, "findViewById(...)");
        this.f37801g = (TextInputLayout) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.ssid);
        u.i(findViewById2, "findViewById(...)");
        this.f37802h = (EditText) findViewById2;
        View findViewById3 = inflate.findViewById(C1987R.id.password_layout);
        u.i(findViewById3, "findViewById(...)");
        this.f37803i = (TextInputLayout) findViewById3;
        View findViewById4 = inflate.findViewById(C1987R.id.password);
        u.i(findViewById4, "findViewById(...)");
        this.f37804j = (EditText) findViewById4;
        View findViewById5 = inflate.findViewById(C1987R.id.ip_layout);
        u.i(findViewById5, "findViewById(...)");
        this.f37805k = (TextInputLayout) findViewById5;
        View findViewById6 = inflate.findViewById(C1987R.id.f111261ip);
        u.i(findViewById6, "findViewById(...)");
        this.f37806l = (EditText) findViewById6;
        View findViewById7 = inflate.findViewById(C1987R.id.mask_layout);
        u.i(findViewById7, "findViewById(...)");
        this.f37807m = (TextInputLayout) findViewById7;
        View findViewById8 = inflate.findViewById(C1987R.id.mask);
        u.i(findViewById8, "findViewById(...)");
        this.f37808n = (EditText) findViewById8;
        View findViewById9 = inflate.findViewById(C1987R.id.gateway_layout);
        u.i(findViewById9, "findViewById(...)");
        this.f37809o = (TextInputLayout) findViewById9;
        View findViewById10 = inflate.findViewById(C1987R.id.gateway);
        u.i(findViewById10, "findViewById(...)");
        this.f37810p = (EditText) findViewById10;
        View findViewById11 = inflate.findViewById(C1987R.id.dns_layout);
        u.i(findViewById11, "findViewById(...)");
        this.f37811q = (TextInputLayout) findViewById11;
        View findViewById12 = inflate.findViewById(C1987R.id.dns);
        u.i(findViewById12, "findViewById(...)");
        this.f37812r = (EditText) findViewById12;
        View findViewById13 = inflate.findViewById(C1987R.id.proxy_ip_layout);
        u.i(findViewById13, "findViewById(...)");
        this.f37813s = (TextInputLayout) findViewById13;
        View findViewById14 = inflate.findViewById(C1987R.id.proxy_ip);
        u.i(findViewById14, "findViewById(...)");
        this.f37814t = (EditText) findViewById14;
        View findViewById15 = inflate.findViewById(C1987R.id.proxy_port);
        u.i(findViewById15, "findViewById(...)");
        this.f37815u = (EditText) findViewById15;
        View findViewById16 = inflate.findViewById(C1987R.id.connect_btn);
        u.i(findViewById16, "findViewById(...)");
        this.f37816v = (Button) findViewById16;
        View findViewById17 = inflate.findViewById(C1987R.id.navigation_up);
        u.i(findViewById17, "findViewById(...)");
        this.f37817w = (ImageButton) findViewById17;
        EditText editText = this.f37802h;
        b bVar = null;
        if (editText != null) {
            k<Object>[] kVarArr = f37796y;
            String str = (String) this.f37798d.getValue(this, kVarArr[0]);
            String str2 = "";
            if (str == null) {
                str = "";
            }
            editText.setText(str);
            EditText editText2 = this.f37804j;
            if (editText2 != null) {
                String str3 = (String) this.f37799e.getValue(this, kVarArr[1]);
                if (str3 != null) {
                    str2 = str3;
                }
                editText2.setText(str2);
                IpSettings ipSettings = this.f37800f;
                if (ipSettings != null) {
                    b0 b0Var = new b0(ipSettings);
                    EditText editText3 = this.f37806l;
                    if (editText3 != null) {
                        editText3.setText(b0Var.h());
                        EditText editText4 = this.f37808n;
                        if (editText4 != null) {
                            editText4.setText(b0Var.j());
                            EditText editText5 = this.f37810p;
                            if (editText5 != null) {
                                editText5.setText(b0Var.g());
                                EditText editText6 = this.f37812r;
                                if (editText6 != null) {
                                    editText6.setText(b0Var.f());
                                    EditText editText7 = this.f37814t;
                                    if (editText7 != null) {
                                        editText7.setText(b0Var.k());
                                        EditText editText8 = this.f37815u;
                                        if (editText8 != null) {
                                            editText8.setText(b0Var.l());
                                        } else {
                                            u.s("proxyPort");
                                            throw null;
                                        }
                                    } else {
                                        u.s("proxyIp");
                                        throw null;
                                    }
                                } else {
                                    u.s("dns");
                                    throw null;
                                }
                            } else {
                                u.s("gateway");
                                throw null;
                            }
                        } else {
                            u.s("mask");
                            throw null;
                        }
                    } else {
                        u.s(ConstantsWs.JSON_SESSION_KEY_MYIP);
                        throw null;
                    }
                }
                Button button = this.f37816v;
                if (button != null) {
                    button.setOnClickListener(new com.google.android.material.search.k(this, 2));
                    ImageButton imageButton = this.f37817w;
                    if (imageButton != null) {
                        imageButton.setOnClickListener(new sg.f(this, 1));
                        FragmentActivity activity = getActivity();
                        if (activity instanceof b) {
                            bVar = (b) activity;
                        }
                        this.f37797c = bVar;
                        return inflate;
                    }
                    u.s("navigationUp");
                    throw null;
                }
                u.s("connectButton");
                throw null;
            }
            u.s("password");
            throw null;
        }
        u.s("ssid");
        throw null;
    }
}
