package com.withings.wiscale2.device.wam03;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.setup.ui.l;
import com.withings.device.ws.FirmwareUpgrade;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.LottieData;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.Webservices;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.wam03.conversation.Wam03InitConversation;
import com.withings.wiscale2.device.wam03.ui.Wam03PostInstallActivity;
import fl.p;
import jl.b;
import jl.c;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import uc0.e;
import vi.o;
import xp.g;
import yi.d;
/* compiled from: Wam03InstallSetup.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000bB\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/device/wam03/Wam03InstallSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$f;", "Lcom/withings/devicesetup/Setup$WithBatteryCheck;", "Lcom/withings/device/setup/ui/SetupWithUser;", "Lcom/withings/devicesetup/Setup$k;", "Lcom/withings/devicesetup/Setup$o;", "Lcom/withings/devicesetup/Setup$WithBonding;", "Lcom/withings/devicesetup/Setup$l;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam03InstallSetup implements Setup, Setup.WithOverview, Setup.e, Setup.WithUpgrade, Setup.f, Setup.WithBatteryCheck, SetupWithUser, Setup.k, Setup.o, Setup.WithBonding, Setup.l {
    public static final Parcelable.Creator<Wam03InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f54938a;

    /* renamed from: b  reason: collision with root package name */
    private User f54939b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54940c;

    /* renamed from: d  reason: collision with root package name */
    private final int f54941d;

    /* compiled from: Wam03InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wam03InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wam03InstallSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wam03InstallSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Wam03InstallSetup[] newArray(int i11) {
            return new Wam03InstallSetup[i11];
        }
    }

    public Wam03InstallSetup() {
        this.f54938a = 58;
        this.f54940c = 16;
        this.f54941d = C1987R.string._WAM03__s_ALREADY_ASSIGNED_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final /* bridge */ /* synthetic */ Object B1() {
        return Integer.valueOf((int) C1987R.drawable.wam03_scan_failed);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final /* bridge */ /* synthetic */ Object E() {
        return 2131232573;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        u.j(context, "context");
        return e.d(C1987R.string._WAM03_OVERVIEW_LEARN_MORE_URL_, context);
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int G0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._WAM03_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WAM03_ACTIVATION_MESSAGE_ACTIVATED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return new wb0.g(setupActivity, this.f54938a, true);
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int J2() {
        return C1987R.string._WAM03_CONNECTION_MESSAGE_IS_PAIRING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return C1987R.string._WAM03_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(C1987R.string._WAM03_OVERVIEW_LEARN_MORE_URL_, context);
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
    public final /* bridge */ /* synthetic */ Object N2() {
        return 2131232572;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final boolean O1(long j5, SetupConversation setupConversation) {
        String str;
        u.j(setupConversation, "setupConversation");
        Webservices webservices = Webservices.get();
        u.i(webservices, "get(...)");
        FirmwareUpgrade call = new vb0.a(webservices, j5, setupConversation).call();
        if (call != null) {
            str = call.version;
        } else {
            str = null;
        }
        if (str != null) {
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
        return C1987R.string._WAM03_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._WAM03_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WAM03_CONNECTION_TITLE_SEARCHING_;
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
        return C1987R.string._WAM03_CONNECTION_TITLE_IS_PAIRING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131232573;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return new LottieData(12, "lottie/wam03", "lottie/wam03/device-intro/intro.json", false, false);
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string._WAM03_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(58).I(null);
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return Integer.valueOf((int) C1987R.drawable.setup_wam03_detected);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._WAM03_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return Integer.valueOf((int) C1987R.drawable.setup_wam03_push_the_button);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        return null;
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
        return C1987R.string._WAM03_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string.wam03Setup_scan_failed_secondary_message;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._WAM03_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return this.f54940c;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        return new DebugDumpConversation(a11, new b(c11), null, new c(0L));
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int h2() {
        return C1987R.string.ANDROID_HWA03_HOW_TO_RECHARGE;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        com.withings.device.setup.ui.b.b(this, setupConversation, 58, 0L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WAM03_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final boolean m(cj.b wppDevice) {
        u.j(wppDevice, "wppDevice");
        xi.b j5 = wppDevice.j();
        if ((j5 instanceof o) && ((o) j5).d() != 12) {
            return true;
        }
        return false;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
        this.f54939b = user;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int m1() {
        return C1987R.string._WAM03_CONNECTION_TITLE_CONNECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final SetupBleBondConversation n(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new SetupBleBondConversation();
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WAM03_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        oi0.b.h().k(kn.e.c().f(setupConversation.v()), "WAM03_post_association");
        User user = this.f54939b;
        if (user != null) {
            Wam03InitConversation wam03InitConversation = new Wam03InitConversation(user);
            wam03InitConversation.L();
            return wam03InitConversation;
        }
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final /* bridge */ /* synthetic */ Object q0() {
        return Integer.valueOf((int) C1987R.drawable.setup_wam03_connected);
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String color) {
        u.j(color, "color");
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        Device f11 = kn.e.c().f(setupActivity.U3());
        Wam03PostInstallActivity.a aVar = Wam03PostInstallActivity.f54967l;
        User user = this.f54939b;
        u.g(f11);
        aVar.getClass();
        Intent putExtra = new Intent(setupActivity, Wam03PostInstallActivity.class).putExtra("extra_user", user).putExtra("extra_device", f11).putExtra("extra_allow_quit", false);
        u.i(putExtra, "putExtra(...)");
        m11.c(putExtra);
        m11.r();
        e.e(setupActivity);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WAM03_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String b10 = com.google.android.gms.internal.p002firebaseauthapi.a.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, C1987R.string._WAM03_CONNECTION_HELPER_LINK_SEARCHING_, "getString(...)");
        String string = context.getString(C1987R.string._HELP_CENTER_);
        u.i(string, "getString(...)");
        return HMWebActivity.f35395c.c(context, string, b10);
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return this.f54941d;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string._WAM03_NAME_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final /* bridge */ /* synthetic */ Object u() {
        return Integer.valueOf((int) C1987R.drawable.wam03_scan_failed);
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WAM03_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int v2() {
        return C1987R.string._WAM03_UPGRADE_TITLE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return p.f67672b.a().d(this.f54938a).w();
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        if (androidx.core.os.a.b()) {
            return 3;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        u.j(dest, "dest");
        dest.writeInt(this.f54938a);
        dest.writeParcelable(this.f54939b, i11);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string._WAM03_OVERVIEW_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final Intent x2(Context context) {
        u.j(context, "context");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = context.getString(C1987R.string.wam03_lowBatteryUrl);
        u.i(string, "getString(...)");
        return aVar.c(context, "", string);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final /* bridge */ /* synthetic */ Integer y1() {
        return 2131232301;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WAM03_ACTIVATION_TITLE_ACTIVATED_;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Wam03InstallSetup(Parcel source) {
        this();
        u.j(source, "source");
        this.f54938a = source.readInt();
        this.f54939b = (User) source.readParcelable(User.class.getClassLoader());
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
    }
}
