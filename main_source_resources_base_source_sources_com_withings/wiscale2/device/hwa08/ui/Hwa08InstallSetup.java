package com.withings.wiscale2.device.hwa08.ui;

import a3.g;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.b;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.LottieData;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation;
import com.withings.wiscale2.device.common.handcalibration.v2.f;
import com.withings.wiscale2.device.common.handcalibration.v2.k;
import com.withings.wiscale2.device.hwa08.conversation.Hwa08InitConversation;
import ej.w;
import fl.o;
import fl.p;
import java.util.List;
import jl.c;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import uc0.e;
import yi.d;
import zg.c;
/* compiled from: Hwa08InstallSetup.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/device/hwa08/ui/Hwa08InstallSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$f;", "Lcom/withings/device/setup/ui/SetupWithUser;", "Lcom/withings/devicesetup/Setup$k;", "Lcom/withings/devicesetup/Setup$o;", "Lcom/withings/devicesetup/Setup$l;", "Lcom/withings/devicesetup/Setup$WithBonding;", "Lcom/withings/devicesetup/Setup$m;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa08InstallSetup implements Setup, Setup.WithOverview, Setup.e, Setup.WithUpgrade, Setup.f, SetupWithUser, Setup.k, Setup.o, Setup.l, Setup.WithBonding, Setup.m {
    public static final Parcelable.Creator<Hwa08InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private User f54481a;

    /* renamed from: b  reason: collision with root package name */
    private DevicePictures f54482b;

    /* renamed from: c  reason: collision with root package name */
    private String f54483c;

    /* compiled from: Hwa08InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Hwa08InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa08InstallSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Hwa08InstallSetup((User) parcel.readParcelable(Hwa08InstallSetup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa08InstallSetup[] newArray(int i11) {
            return new Hwa08InstallSetup[i11];
        }
    }

    public Hwa08InstallSetup(User user) {
        this.f54481a = user;
    }

    private final Object c() {
        String url;
        DevicePictures devicePictures = this.f54482b;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return Integer.valueOf(g.p(this.f54483c));
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.hwa08Setup_firmwareCheckingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final /* bridge */ /* synthetic */ Object B1() {
        return 2131232841;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final /* bridge */ /* synthetic */ Object E() {
        return 2131231528;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return false;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.hwa08Setup_firmwareDownloadTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.hwa08Setup_activationSuccessMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final xp.g J0(SetupActivity setupActivity) {
        List list;
        u.j(setupActivity, "setupActivity");
        w w11 = w.w();
        u.i(w11, "get(...)");
        int i11 = ml.a.f82249l;
        list = ml.a.f82241d;
        return new b(w11, setupActivity, list);
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int J2() {
        return C1987R.string.hwa08Setup_waitingForPairingMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return C1987R.string.hwa08Setup_instructionsMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(C1987R.string.hwa08Setup_overviewLearnMoreUrl, context);
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
        return c();
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int P0() {
        return C1987R.string.hwa08Setup_pairingErrorTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.hwa08Setup_activatingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.hwa08Setup_firmwareCheckingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.hwa08Setup_searchingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string.hwa08Setup_detectingMessage);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int T0() {
        return C1987R.string.hwa08Setup_waitingForPairingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131232839;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return c();
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.hwa08Setup_firmwareUpgradeTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(91).I(null);
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131232839;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.hwa08Setup_rebootingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131232840;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        lc0.a aVar;
        LottieData lottieData;
        lc0.a aVar2;
        u.j(setupConversation, "setupConversation");
        p.a aVar3 = p.f67672b;
        o e11 = aVar3.a().e(w());
        Integer num = null;
        if (e11 instanceof lc0.a) {
            aVar = (lc0.a) e11;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            lottieData = aVar.u();
        } else {
            lottieData = null;
        }
        o e12 = aVar3.a().e(w());
        if (e12 instanceof lc0.a) {
            aVar2 = (lc0.a) e12;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            num = Integer.valueOf(aVar2.Z());
        }
        f fVar = new f(lottieData, num);
        com.withings.devicesetup.ui.a M = setupConversation.M();
        u.i(M, "getActivityUpdater(...)");
        zp.a N = setupConversation.N();
        u.i(N, "getDelegate(...)");
        return new HandsCalibrationConversation(new k(M, N, fVar), true, true);
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
        return C1987R.string.hwa08Setup_detectingTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string.hwa08Setup_searchingTimeoutMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.hwa08Setup_instructionsTitle;
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

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        com.withings.device.setup.ui.b.b(this, setupConversation, 91, 0L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.hwa08Setup_detectedTitle;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.hwa08Setup_firmwareUpgradeMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final boolean m(cj.b wppDevice) {
        vi.o oVar;
        u.j(wppDevice, "wppDevice");
        xi.b j5 = wppDevice.j();
        if (j5 instanceof vi.o) {
            oVar = (vi.o) j5;
        } else {
            oVar = null;
        }
        if (oVar == null || oVar.d() == 12) {
            return false;
        }
        return true;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
        this.f54481a = user;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int m1() {
        return C1987R.string.hwa08Setup_connectedTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final SetupBleBondConversation n(SetupConversation setupConversation) {
        return new SetupBleBondConversation();
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
        this.f54482b = devicePictures;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.hwa08Setup_searchingMessage;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b wppDevice) {
        u.j(wppDevice, "wppDevice");
        o f11 = p.f67672b.a().f(wppDevice);
        gq.a.a(16, 91);
        Setup e02 = f11.e0(new DeviceModel(f11.a(), null));
        u.g(e02);
        return e02;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        User user = this.f54481a;
        if (user != null) {
            return new Hwa08InitConversation(user, true);
        }
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final Object q0() {
        return c();
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
        this.f54483c = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        e.e(setupActivity);
        Device f11 = kn.e.c().f(setupActivity.U3());
        User user = this.f54481a;
        if (user != null) {
            u.g(f11);
            setupActivity.startActivity(c.a.c(setupActivity, f11, user, false));
        }
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.hwa08Setup_detectedMessage;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String b10 = com.google.android.gms.internal.p002firebaseauthapi.a.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, C1987R.string.hwa08Setup_searchingTimeoutHelperUrl, "getString(...)");
        String string = context.getString(C1987R.string._HELP_CENTER_);
        u.i(string, "getString(...)");
        return HMWebActivity.f35395c.c(context, string, b10);
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return C1987R.string.hwa08Setup_activationErrorAlreadyAssignedTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string.hwa08Setup_overviewTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final /* bridge */ /* synthetic */ Object u() {
        return 2131232841;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.hwa08Setup_activatingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 91);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        if (androidx.core.os.a.b()) {
            return 3;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeParcelable(this.f54481a, i11);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string.hwa08Setup_overviewMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.hwa08Setup_rebootingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.hwa08Setup_firmwareDownloadMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.hwa08Setup_activationSuccessTitle;
    }

    public Hwa08InstallSetup() {
        this(null);
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
