package com.withings.devicesetup.conversation;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.conversation.WppDeviceSetupConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.BatteryStatus;
import com.withings.comm.wpp.generated.object.RebootReason;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.device.ws.DeviceApi;
import com.withings.device.ws.DeviceProperties;
import com.withings.devicesetup.DeviceSessionConversation;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.network.conversation.NetworkConfigurationConversation;
import com.withings.devicesetup.ui.e;
import com.withings.devicesetup.upgrade.conversation.BluetoothUpgradeConversation;
import com.withings.devicesetup.upgrade.conversation.NetUpgradeConversation;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.WsFailer;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import vb0.c;
import xp.c;
import yp.b;
import zp.a;
/* loaded from: classes3.dex */
public class SetupConversation extends WppDeviceSetupConversation {

    /* renamed from: f  reason: collision with root package name */
    private Setup f37709f;

    /* renamed from: g  reason: collision with root package name */
    private a f37710g;

    /* renamed from: h  reason: collision with root package name */
    public xp.a f37711h;

    /* renamed from: i  reason: collision with root package name */
    private yp.a f37712i;

    /* renamed from: j  reason: collision with root package name */
    private NetworkConfigurationConversation f37713j;

    public SetupConversation(Setup setup, e eVar) {
        this.f37709f = setup;
        this.f37710g = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    private boolean P() throws IOException {
        ?? aVar = new nj.a(x());
        aVar.c((short) 1284, new h[0]);
        return Arrays.asList(3, 1).contains(Short.valueOf(((BatteryStatus) aVar.y(BatteryStatus.class)).batteryState));
    }

    private void Q(Setup.WithUpgrade withUpgrade, WppDeviceConversation wppDeviceConversation) throws IOException, InterruptedException, ConversationException, WaitForInput.CancelException {
        WppDeviceConversation M2 = withUpgrade.M2(this);
        if (M2 != null) {
            E(M2);
        }
        try {
            E(wppDeviceConversation);
            WppDeviceConversation d22 = withUpgrade.d2(this);
            if (d22 != null) {
                E(d22);
            }
        } catch (IOException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new IOException("Unable to upgrade the device", e12);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0265 -> B:172:0x0266). Please submit an issue!!! */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        DevicePictures devicePictures;
        Long l5;
        NetworkConfigurationConversation networkConfigurationConversation;
        String str;
        TelephonyManager telephonyManager;
        String simCountryIso;
        String networkCountryIso;
        String str2 = null;
        if (x().i().secret.isEmpty()) {
            E(new DeviceSessionConversation(new b(this, 0), null, 14));
        } else {
            this.f37711h = new xp.b(x().i());
        }
        Setup setup = this.f37709f;
        if (setup instanceof Setup.m) {
            this.f37709f = ((Setup.m) setup).p(x());
        }
        if (this.f37709f instanceof Setup.f) {
            try {
                DeviceSession a11 = this.f37711h.a();
                ((Setup.f) this.f37709f).r(a11.getColor());
                Setup.f fVar = (Setup.f) this.f37709f;
                long j5 = a11.deviceId;
                try {
                    DeviceApi deviceApi = (DeviceApi) Webservices.get().getApiBuilder().setSessionIdProvider(this.f37711h).build(DeviceApi.class);
                    if (j5 != 0) {
                        l5 = Long.valueOf(j5);
                    } else {
                        l5 = null;
                    }
                    List<DeviceProperties.Picture> list = deviceApi.getProperties(l5).pictures;
                    if (list != null) {
                        devicePictures = new DevicePictures(list);
                    } else {
                        devicePictures = new DevicePictures(Collections.emptyList());
                    }
                } catch (Exception unused) {
                    x70.b.g(this, x().g(), "Fetching customized pictures failed...", new Object[0]);
                    devicePictures = new DevicePictures(Collections.emptyList());
                }
                fVar.o(devicePictures);
            } catch (Exception e11) {
                throw new IOException("Unable to open a session for this device", e11);
            }
        }
        B(300000L, true, false);
        a aVar = this.f37710g;
        aVar.J0(this);
        if (!((Boolean) K()).booleanValue()) {
            return;
        }
        Setup setup2 = this.f37709f;
        if ((setup2 instanceof Setup.WithBonding) && ((Setup.WithBonding) setup2).m(x())) {
            aVar.N0(this);
            if (((Boolean) K()).booleanValue()) {
                E(((Setup.WithBonding) this.f37709f).n(this));
            }
            aVar.D0(this);
            B(300000L, true, false);
            K();
        } else {
            Setup setup3 = this.f37709f;
            if ((setup3 instanceof Setup.WithSilentBonding) && ((Setup.WithSilentBonding) setup3).m(x())) {
                E(((Setup.WithSilentBonding) this.f37709f).n(this));
            }
        }
        WppDeviceConversation V1 = this.f37709f.V1(this);
        if (V1 != null) {
            E(V1);
        }
        Setup setup4 = this.f37709f;
        if ((setup4 instanceof Setup.WithBatteryCheck) && ((Setup.WithBatteryCheck) setup4).O1(x().i().softVersion, this) && P()) {
            aVar.o2();
            do {
                Thread.sleep(2000L);
                if (w() != WppDeviceConversation.State.f33150b) {
                    break;
                }
            } while (P());
        }
        Setup setup5 = this.f37709f;
        if (setup5 instanceof Setup.e) {
            Setup.e eVar = (Setup.e) setup5;
            if (eVar.a()) {
                x().q();
                B(300000L, true, true);
                eVar.j(this);
                this.f37712i = (yp.a) K();
            } else {
                this.f37712i = ((c) c.a.a()).c();
            }
        }
        Setup setup6 = this.f37709f;
        if ((setup6 instanceof Setup.WithUpgrade) && ((Setup.WithUpgrade) setup6).T() == 1) {
            Setup setup7 = this.f37709f;
            if (!(setup7 instanceof Setup.WithUpgradeDependingOnNetworkConfiguration)) {
                Q((Setup.WithUpgrade) setup7, new BluetoothUpgradeConversation(aVar));
            }
        }
        Setup setup8 = this.f37709f;
        if (setup8 instanceof Setup.j) {
            NetworkConfigurationConversation networkConfigurationConversation2 = new NetworkConfigurationConversation(((Setup.j) setup8).h(), aVar);
            this.f37713j = networkConfigurationConversation2;
            E(networkConfigurationConversation2);
        }
        Setup setup9 = this.f37709f;
        if ((setup9 instanceof Setup.WithUpgradeDependingOnNetworkConfiguration) && ((Setup.WithUpgradeDependingOnNetworkConfiguration) setup9).z0(this, this.f37713j.L())) {
            Q((Setup.WithUpgrade) this.f37709f, new BluetoothUpgradeConversation(aVar));
        }
        Setup setup10 = this.f37709f;
        if ((setup10 instanceof Setup.WithUpgrade) && ((Setup.WithUpgrade) setup10).T() == 2) {
            Q((Setup.WithUpgrade) this.f37709f, new NetUpgradeConversation(aVar, 2));
        }
        if ((this.f37709f instanceof Setup.e) && this.f37712i != null) {
            aVar.m2();
            try {
                yp.a aVar2 = this.f37712i;
                Context r7 = r();
                xp.a aVar3 = this.f37711h;
                try {
                    telephonyManager = (TelephonyManager) r().getSystemService("phone");
                    simCountryIso = telephonyManager.getSimCountryIso();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                if (simCountryIso != null && simCountryIso.length() == 2 && simCountryIso.matches("^[A-Za-z_.]+$")) {
                    str = simCountryIso.toUpperCase();
                } else {
                    if (telephonyManager.getPhoneType() != 2 && (networkCountryIso = telephonyManager.getNetworkCountryIso()) != null && networkCountryIso.length() == 2 && networkCountryIso.matches("^[A-Za-z_.]+$")) {
                        str = networkCountryIso.toUpperCase();
                    }
                    str = null;
                }
                try {
                    str2 = Locale.getDefault().getCountry();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                aVar2.b(r7, aVar3, str, str2);
                try {
                    WppDeviceConversation q11 = ((Setup.e) this.f37709f).q(this);
                    if (q11 != null) {
                        E(q11);
                    }
                    ((Setup.e) this.f37709f).e();
                } catch (Exception e14) {
                    try {
                        this.f37712i.a(r(), x());
                    } catch (Exception unused2) {
                    }
                    throw e14;
                }
            } catch (Exception e15) {
                throw new IOException("Unable to associate the device", e15);
            }
        }
        Setup setup11 = this.f37709f;
        if ((setup11 instanceof Setup.WithUpgrade) && ((Setup.WithUpgrade) setup11).T() == 3) {
            Q((Setup.WithUpgrade) this.f37709f, new NetUpgradeConversation(aVar, 3));
        }
        Device f11 = kn.e.c().f(v());
        if (f11 != null && (networkConfigurationConversation = this.f37713j) != null && networkConfigurationConversation.L() > 0) {
            f11.setNetwork(this.f37713j.L());
            kn.e.c().t(f11);
            try {
                ((DeviceApi) Webservices.get().getApiForAccount(DeviceApi.class)).updateNetwork(f11.getId(), f11.getNetwork());
            } catch (Exception e16) {
                WsFailer.failWithException(e16);
                x70.b.h(this, v(), e16, "Unable to update device network on webservices", new Object[0]);
            }
        }
        WppDeviceConversation h02 = this.f37709f.h0(this);
        if (h02 != null) {
            E(h02);
        }
        Setup setup12 = this.f37709f;
        if (!(setup12 instanceof Setup.WithUpgrade) || ((Setup.WithUpgrade) setup12).T() != 3) {
            try {
                nj.a aVar4 = new nj.a(x());
                aVar4.c((short) 275, new h[0]);
                aVar4.j();
                Setup setup13 = this.f37709f;
                if (setup13 instanceof Setup.a) {
                    ((Setup.a) setup13).t();
                }
            } catch (UnsupportedCommandException unused3) {
                x70.b.u(this, v(), "The device does not support command SETUP_OK", new Object[0]);
            }
        }
        if (this.f37709f instanceof Setup.h) {
            try {
                RebootReason rebootReason = new RebootReason();
                rebootReason.value = 1;
                nj.a aVar5 = new nj.a(x());
                aVar5.c(Wpp.CMD_REBOOT, rebootReason);
                aVar5.j();
            } catch (UnsupportedCommandException unused4) {
                x70.b.u(this, v(), "The device does not support command REBOOT", new Object[0]);
            }
        }
        if (this.f37709f instanceof Setup.b) {
            try {
                Thread.sleep(2000L);
                q().r();
            } catch (IOException unused5) {
                x70.b.g(this, v(), "Failure during request probe", new Object[0]);
            } catch (InterruptedException e17) {
                throw new RuntimeException(e17);
            }
        }
        aVar.n0(this);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceSetupConversation
    public final boolean L() {
        return ((vb0.c) xp.c.get()).e().get();
    }

    public final com.withings.devicesetup.ui.a M() {
        a aVar = this.f37710g;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    public final a N() {
        return this.f37710g;
    }

    public final Setup O() {
        return this.f37709f;
    }

    public final void R(int i11) {
        this.f37713j.G(Integer.valueOf(i11));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f37710g;
    }
}
