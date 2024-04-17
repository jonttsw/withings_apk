package com.withings.wiscale2.device.hwa03;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.setup.ui.l;
import com.withings.device.ws.FirmwareUpgrade;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.Webservices;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation;
import com.withings.wiscale2.device.common.handcalibration.v2.f;
import com.withings.wiscale2.device.common.handcalibration.v2.k;
import com.withings.wiscale2.device.hwa03.conversation.Hwa03InitConversation;
import ej.w;
import fl.p;
import java.util.List;
import jl.c;
import kotlin.jvm.internal.u;
import uc0.e;
import vh.h;
import vi.o;
import xp.g;
import yi.d;
import zg.c;
/* loaded from: classes5.dex */
public class Hwa03InstallSetup implements Setup, Setup.WithOverview, Setup.e, Setup.WithUpgrade, Setup.f, Setup.WithBatteryCheck, SetupWithUser, Setup.k, Setup.o, Setup.WithBonding, Setup.l, Setup.m {
    public static final Parcelable.Creator<Hwa03InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54204a;

    /* renamed from: b  reason: collision with root package name */
    private User f54205b;

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<Hwa03InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa03InstallSetup createFromParcel(Parcel parcel) {
            return new Hwa03InstallSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa03InstallSetup[] newArray(int i11) {
            return new Hwa03InstallSetup[i11];
        }
    }

    public Hwa03InstallSetup(String str) {
        this.f54204a = str;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final Object B1() {
        return 2131231522;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        String str = this.f54204a;
        str.getClass();
        if (!str.equals(ConstantsWs.DEVICE_COLOR_SPORT_BLACK) && !str.equals(ConstantsWs.DEVICE_COLOR_SPORT_WHITE)) {
            return 2131232556;
        }
        return 2131232558;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return e.d(C1987R.string._HWA03_OVERVIEW_LEARN_MORE_URL_, context);
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int G0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._HWA03_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._HWA03_ACTIVATION_MESSAGE_ACTIVATED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        List list;
        w w11 = w.w();
        int i11 = ml.a.f82249l;
        list = ml.a.f82241d;
        return new com.withings.common.device.b(w11, setupActivity, list);
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int J2() {
        return C1987R.string._HWA03_CONNECTION_MESSAGE_IS_PAIRING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return C1987R.string._HWA03_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        int i11;
        String str = this.f54204a;
        str.getClass();
        if (!str.equals(ConstantsWs.DEVICE_COLOR_SPORT_BLACK) && !str.equals(ConstantsWs.DEVICE_COLOR_SPORT_WHITE)) {
            i11 = C1987R.string._HWA03_OVERVIEW_LEARN_MORE_URL_;
        } else {
            i11 = C1987R.string._HWA03BS_OVERVIEW_LEARN_MORE_URL_;
        }
        return e.c(i11, context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final Object N2() {
        return 2131232554;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final boolean O1(long j5, SetupConversation setupConversation) {
        FirmwareUpgrade call;
        if (j5 > 1170 && (call = new vb0.a(Webservices.get(), j5, setupConversation).call()) != null && call.version != null) {
            return true;
        }
        return false;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int P0() {
        return C1987R.string._HWA03_ERROR_PAIRING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._HWA03_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._HWA03_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._HWA03_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string._HWA03_CONNECTION_MESSAGE_CONNECTING_);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int T0() {
        return C1987R.string._HWA03_CONNECTION_TITLE_IS_PAIRING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return 2131232555;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return 2131232554;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        final dj0.b bVar = new dj0.b(setupActivity);
        final String string = setupActivity.getString(C1987R.string._HWA03_DISCOVERY_VIDEO_1_URL_);
        h.l().a(new vh.a() { // from class: dj0.a
            @Override // vh.a
            public final void run() {
                b.a(b.this, string);
            }
        });
        final String string2 = setupActivity.getString(C1987R.string._HWA03_DISCOVERY_VIDEO_2_URL_);
        h.l().a(new vh.a() { // from class: dj0.a
            @Override // vh.a
            public final void run() {
                b.a(b.this, string2);
            }
        });
        final String string3 = setupActivity.getString(C1987R.string._HWA03_DISCOVERY_VIDEO_3_URL_);
        h.l().a(new vh.a() { // from class: dj0.a
            @Override // vh.a
            public final void run() {
                b.a(b.this, string3);
            }
        });
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string._HWA03_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().e(w()).I(this.f54204a);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return 2131232554;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._HWA03_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232557;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        lc0.a aVar = (lc0.a) p.f67672b.a().e(w());
        return new HandsCalibrationConversation(new k(setupConversation.M(), setupConversation.N(), new f(aVar.u(), Integer.valueOf(aVar.Z()), C1987R.string.setup_calibrate_subtitle)), true, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e0() {
        return C1987R.string._NEXT_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string._HWA03_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string.hwa03Setup_scan_failed_secondary_message;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._HWA03_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return 16;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        return new DebugDumpConversation(a11, new jl.b(c11), null, new c(0L));
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int h2() {
        return C1987R.string.ANDROID_HWA03_HOW_TO_RECHARGE;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        com.withings.device.setup.ui.b.b(this, setupConversation, 55, 0L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._HWA03_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final boolean m(cj.b bVar) {
        xi.b j5 = bVar.j();
        if ((j5 instanceof o) && ((o) j5).d() != 12 && bVar.i().softVersion > 3351) {
            return true;
        }
        return false;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
        this.f54205b = user;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int m1() {
        return C1987R.string._HWA03_CONNECTION_TITLE_CONNECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final SetupBleBondConversation n(SetupConversation setupConversation) {
        return new SetupBleBondConversation();
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._HWA03_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b bVar) {
        fl.o f11 = p.f67672b.a().f(bVar);
        gq.a.a(16, 55);
        return f11.e0(new DeviceModel(f11.a(), null));
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        oi0.b.h().k(kn.e.c().f(setupConversation.v()), "HWA03_post_association");
        Hwa03InitConversation hwa03InitConversation = new Hwa03InitConversation(this.f54205b);
        hwa03InitConversation.M();
        return hwa03InitConversation;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final Object q0() {
        return 2131232554;
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
        this.f54204a = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        e.e(setupActivity);
        setupActivity.startActivity(c.a.b(setupActivity, kn.e.c().f(setupActivity.U3()), this.f54205b, false));
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._HWA03_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String string = context.getString(C1987R.string._HWA03_CONNECTION_HELPER_LINK_SEARCHING_);
        return HMWebActivity.f35395c.c(context, context.getString(C1987R.string._HELP_CENTER_), string);
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return C1987R.string._HWA03__s_ALREADY_ASSIGNED_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        String str = this.f54204a;
        str.getClass();
        if (!str.equals(ConstantsWs.DEVICE_COLOR_SPORT_BLACK) && !str.equals(ConstantsWs.DEVICE_COLOR_SPORT_WHITE)) {
            return C1987R.string._HWA03_OVERVIEW_TITLE_;
        }
        return C1987R.string._HWA03BS_OVERVIEW_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Object u() {
        return 2131231522;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._HWA03_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int v2() {
        return C1987R.string._HWA03_UPGRADE_TITLE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 55);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        if (androidx.core.os.a.b()) {
            return 3;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f54204a);
        parcel.writeParcelable(this.f54205b, i11);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        String str = this.f54204a;
        str.getClass();
        if (!str.equals(ConstantsWs.DEVICE_COLOR_SPORT_BLACK) && !str.equals(ConstantsWs.DEVICE_COLOR_SPORT_WHITE)) {
            return C1987R.string._HWA03_OVERVIEW_MESSAGE_;
        }
        return C1987R.string._HWA03BS_OVERVIEW_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final Intent x2(Context context) {
        return HMWebActivity.f35395c.c(context, "", context.getString(C1987R.string.ANDROID_HWA03_HOW_TO_RECHARGE_URL));
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final Integer y1() {
        return 2131232301;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._HWA03_ACTIVATION_TITLE_ACTIVATED_;
    }

    Hwa03InstallSetup(Parcel parcel) {
        this.f54204a = parcel.readString();
        this.f54205b = (User) parcel.readParcelable(User.class.getClassLoader());
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
    }
}
