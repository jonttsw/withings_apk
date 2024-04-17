package com.withings.devicesetup.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.exception.ConversationCanceledException;
import com.withings.comm.wpp.generated.object.IpSettings;
import com.withings.comm.wpp.generated.object.WifiApConnect;
import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.comm.wpp.generated.object.WifiConnectResult;
import com.withings.device.ws.FirmwareUpgrade;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.network.conversation.WifiSetupConversation;
import com.withings.devicesetup.network.ui.PickWifiForSetupActivity;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.devicesetup.ui.SetupScreen;
import com.withings.devicesetup.ui.listener.EmptySetupStateListener;
import com.withings.devicesetup.upgrade.conversation.BluetoothUpgradeConversation;
import com.withings.devicesetup.upgrade.conversation.NetUpgradeConversation;
import dq.c0;
/* compiled from: SetupDelegate.java */
/* loaded from: classes3.dex */
public final class e implements zp.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.devicesetup.ui.a f37906a;

    /* renamed from: b  reason: collision with root package name */
    private final SetupStateListener f37907b;

    /* compiled from: SetupDelegate.java */
    /* loaded from: classes3.dex */
    private static class a implements SetupActivity.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f37908a;

        /* renamed from: b  reason: collision with root package name */
        private final float f37909b;

        a(int i11, float f11) {
            this.f37908a = i11;
            this.f37909b = f11;
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(SetupActivity setupActivity) {
            setupActivity.n4(this.f37909b, this.f37908a);
        }
    }

    /* compiled from: SetupDelegate.java */
    /* loaded from: classes3.dex */
    private static class b implements SetupActivity.a.InterfaceC0497a {

        /* renamed from: a  reason: collision with root package name */
        private final WifiApConnect f37910a;

        /* renamed from: b  reason: collision with root package name */
        private final IpSettings f37911b;

        /* renamed from: c  reason: collision with root package name */
        private final WifiConnectResult f37912c;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f37913d = new Handler(Looper.getMainLooper());

        public b(WifiApConnect wifiApConnect, IpSettings ipSettings, WifiConnectResult wifiConnectResult) {
            this.f37910a = wifiApConnect;
            this.f37911b = ipSettings;
            this.f37912c = wifiConnectResult;
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a.InterfaceC0497a
        public final void e(SetupActivity setupActivity, int i11, int i12, Intent intent) {
            WifiApConnect wifiApConnect;
            IpSettings ipSettings;
            SetupConversation S3 = setupActivity.S3();
            if (i11 == 18) {
                if (i12 == -1) {
                    if (intent != null) {
                        wifiApConnect = (WifiApConnect) intent.getSerializableExtra("wifiApConnect");
                        ipSettings = (IpSettings) intent.getSerializableExtra("ipSettings");
                    } else {
                        wifiApConnect = null;
                        ipSettings = null;
                    }
                    ((WifiSetupConversation) S3.s(WifiSetupConversation.class)).N(wifiApConnect, ipSettings);
                    return;
                } else if (i12 == 1111) {
                    ((WifiSetupConversation) S3.s(WifiSetupConversation.class)).p();
                    return;
                } else {
                    return;
                }
            }
            S3.p();
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(final SetupActivity setupActivity) {
            setupActivity.m4();
            u70.i U3 = setupActivity.U3();
            int i11 = PickWifiForSetupActivity.f37724j;
            final Intent putExtra = new Intent(setupActivity, PickWifiForSetupActivity.class).putExtra("macAddress", U3).putExtra("wifiApConnect", this.f37910a).putExtra("ipSettings", this.f37911b).putExtra("wifiConnectReply", this.f37912c);
            this.f37913d.postDelayed(new Runnable() { // from class: dq.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SetupActivity.this.startActivityForResult(putExtra, 18);
                }
            }, 1000L);
        }
    }

    public e(Context context, Setup.WithUpgrade withUpgrade) {
        this.f37906a = new com.withings.devicesetup.ui.a(context, withUpgrade);
        this.f37907b = new EmptySetupStateListener();
    }

    @Override // fq.a
    public final void A2(BluetoothUpgradeConversation bluetoothUpgradeConversation, FirmwareUpgrade firmwareUpgrade) {
        this.f37907b.getClass();
    }

    @Override // fq.a
    public final void B(float f11) {
        this.f37906a.j(new a(1, f11));
    }

    @Override // com.withings.devicesetup.network.conversation.NetworkConfigurationConversation.a
    public final void C0() {
        this.f37906a.k(new b(null, null, null));
    }

    @Override // zp.a
    public final void D0(final SetupConversation setupConversation) {
        this.f37907b.z1(setupConversation);
        this.f37906a.k(new SetupActivity.a() { // from class: dq.y
            @Override // com.withings.devicesetup.ui.SetupActivity.a
            public final void h(SetupActivity setupActivity) {
                h0 h0Var = new h0(setupActivity);
                SetupConversation setupConversation2 = SetupConversation.this;
                SetupScreen c11 = h0Var.c((Setup.WithBonding) setupConversation2.O());
                c0.f64134y.getClass();
                c0 a11 = c0.a.a(c11);
                a11.G1(new t(setupConversation2, 1));
                setupActivity.h4(a11, 9);
            }
        });
    }

    @Override // com.withings.devicesetup.network.conversation.WifiSetupConversation.a
    public final void H1() {
        this.f37906a.g();
    }

    @Override // zp.a
    public final void J0(final SetupConversation setupConversation) {
        com.withings.devicesetup.ui.a aVar = this.f37906a;
        aVar.f(setupConversation);
        this.f37907b.e1(setupConversation);
        aVar.k(new SetupActivity.a() { // from class: dq.v
            @Override // com.withings.devicesetup.ui.SetupActivity.a
            public final void h(SetupActivity setupActivity) {
                setupActivity.k4(SetupConversation.this.x());
            }
        });
    }

    @Override // fq.a
    public final void J1() {
        this.f37906a.j(new a(1, 0.0f));
    }

    @Override // eq.c
    public final void K() {
        this.f37906a.j(new a(0, 0.0f));
    }

    @Override // fq.a
    public final void L0(float f11) {
        this.f37906a.j(new a(2, f11));
    }

    @Override // zp.a
    public final void N0(final SetupConversation setupConversation) {
        this.f37906a.k(new SetupActivity.a() { // from class: dq.w
            @Override // com.withings.devicesetup.ui.SetupActivity.a
            public final void h(SetupActivity setupActivity) {
                SetupScreen b10 = new h0(setupActivity).b((Setup.WithBonding) SetupConversation.this.O());
                c0.f64134y.getClass();
                c0 a11 = c0.a.a(b10);
                a11.G1(new z(setupActivity));
                setupActivity.h4(a11, 8);
                setupActivity.R3();
            }
        });
    }

    @Override // com.withings.devicesetup.network.conversation.NetworkConfigurationConversation.a
    public final void N1() {
        this.f37906a.g();
    }

    @Override // fq.a
    public final void O1() {
        this.f37906a.j(new a(3, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bq.b] */
    @Override // com.withings.devicesetup.network.conversation.WifiSetupConversation.a
    public final void P(WifiSetupConversation wifiSetupConversation) {
        jk0.c b10 = jk0.c.b();
        u70.i v11 = wifiSetupConversation.v();
        ?? obj = new Object();
        obj.f21726a = v11;
        b10.d(obj);
    }

    @Override // eq.c
    public final void W1(NetUpgradeConversation netUpgradeConversation) {
        this.f37907b.b2(netUpgradeConversation);
    }

    @Override // fq.a
    public final void X1(BluetoothUpgradeConversation bluetoothUpgradeConversation) {
        this.f37907b.b2(bluetoothUpgradeConversation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation wppDeviceConversation, Exception exc) {
        x70.b.o(wppDeviceConversation.v(), exc);
        this.f37907b.getClass();
        boolean z5 = exc instanceof ConversationCanceledException;
        com.withings.devicesetup.ui.a aVar = this.f37906a;
        if (z5) {
            aVar.k(new Object());
        } else {
            aVar.h(exc);
        }
    }

    @Override // eq.c
    public final void g3(float f11) {
        this.f37906a.j(new a(1, f11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // com.withings.devicesetup.network.conversation.NetworkConfigurationConversation.a
    public final void h1() {
        this.f37906a.k(new Object());
    }

    @Override // fq.a
    public final void h2(BluetoothUpgradeConversation bluetoothUpgradeConversation, FirmwareUpgrade firmwareUpgrade) {
        this.f37907b.i0(bluetoothUpgradeConversation);
        this.f37906a.j(new a(4, 1.0f));
    }

    @Override // zp.a
    public final com.withings.devicesetup.ui.a j1() {
        return this.f37906a;
    }

    @Override // fq.a
    public final void l0() {
        this.f37906a.j(new a(0, 0.0f));
    }

    @Override // zp.a
    public final void m2() {
        this.f37906a.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // zp.a
    public final void n0(SetupConversation setupConversation) {
        this.f37907b.g0(setupConversation, true);
        boolean z5 = setupConversation.O() instanceof Setup.p;
        com.withings.devicesetup.ui.a aVar = this.f37906a;
        if (z5) {
            aVar.c();
        } else {
            aVar.j(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // zp.a
    public final void o2() {
        this.f37906a.k(new Object());
    }

    @Override // fq.a
    public final void p1(BluetoothUpgradeConversation bluetoothUpgradeConversation, FirmwareUpgrade firmwareUpgrade) {
        this.f37907b.getClass();
        this.f37906a.j(new a(3, 1.0f));
    }

    @Override // eq.c
    public final void q3() {
        this.f37906a.j(new a(3, 1.0f));
    }

    @Override // com.withings.devicesetup.network.conversation.WifiSetupConversation.a
    public final void w0(WifiApConnect wifiApConnect, IpSettings ipSettings, WifiConnectResult wifiConnectResult) {
        this.f37906a.k(new b(wifiApConnect, ipSettings, wifiConnectResult));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bq.a] */
    @Override // com.withings.devicesetup.network.conversation.WifiSetupConversation.a
    public final void x0(WifiSetupConversation wifiSetupConversation, WifiApScan wifiApScan, boolean z5) {
        jk0.c b10 = jk0.c.b();
        u70.i v11 = wifiSetupConversation.v();
        ?? obj = new Object();
        obj.f21723a = v11;
        obj.f21724b = wifiApScan;
        obj.f21725c = z5;
        b10.d(obj);
    }

    @Override // zp.a
    public final SetupStateListener y() {
        return this.f37907b;
    }

    public e(Context context, Setup setup, SetupStateListener setupStateListener) {
        this.f37906a = new com.withings.devicesetup.ui.a(context, setup, setupStateListener);
        this.f37907b = setupStateListener;
    }
}
