package com.withings.wiscale2.device.hwa09.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.ws.FirmwareUpgrade;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.LottieData;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.sync.SerialSyncJob;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation;
import com.withings.wiscale2.device.common.handcalibration.v2.f;
import com.withings.wiscale2.device.common.handcalibration.v2.k;
import com.withings.wiscale2.device.common.ui.TrackerPositionDelegate;
import com.withings.wiscale2.device.hwa09.conversation.Hwa0910InitConversation;
import com.withings.wiscale2.device.hwa09.ui.HowToWearTrackerActivity;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.zendesk.ui.HelpCenterActivity;
import fl.o;
import fl.p;
import java.util.List;
import jl.c;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import uc0.e;
import xp.g;
import yi.d;
import ym0.l;
import zg.c;
/* compiled from: Hwa09InstallSetup.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/device/hwa09/ui/Hwa09InstallSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/device/setup/ui/SetupWithUser;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$f;", "Lcom/withings/devicesetup/Setup$k;", "Lcom/withings/devicesetup/Setup$o;", "Lcom/withings/devicesetup/Setup$l;", "Lcom/withings/devicesetup/Setup$WithBonding;", "Lcom/withings/devicesetup/Setup$a;", "Lcom/withings/devicesetup/Setup$n;", "Lcom/withings/devicesetup/Setup$WithBatteryCheck;", "Lcom/withings/devicesetup/Setup$m;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa09InstallSetup implements Setup, SetupWithUser, Setup.WithOverview, Setup.e, Setup.WithUpgrade, Setup.f, Setup.k, Setup.o, Setup.l, Setup.WithBonding, Setup.a, Setup.n, Setup.WithBatteryCheck, Setup.m {
    public static final Parcelable.Creator<Hwa09InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private User f54541a;

    /* renamed from: b  reason: collision with root package name */
    private DevicePictures f54542b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54543c;

    /* renamed from: d  reason: collision with root package name */
    private final int f54544d;

    /* compiled from: Hwa09InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Hwa09InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa09InstallSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Hwa09InstallSetup((User) parcel.readParcelable(Hwa09InstallSetup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa09InstallSetup[] newArray(int i11) {
            return new Hwa09InstallSetup[i11];
        }
    }

    /* compiled from: Hwa09InstallSetup.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements l<oi0.b, SyncJob> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Device f54545a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Device device) {
            super(1);
            this.f54545a = device;
        }

        @Override // ym0.l
        public final SyncJob invoke(oi0.b bVar) {
            oi0.b blockingPostSyncJob = bVar;
            u.j(blockingPostSyncJob, "$this$blockingPostSyncJob");
            return new SerialSyncJob(blockingPostSyncJob.e(), blockingPostSyncJob.d(this.f54545a.getId()));
        }
    }

    public Hwa09InstallSetup(User user) {
        this.f54541a = user;
        this.f54543c = 16;
        this.f54544d = C1987R.string.hwa09Setup_activationErrorAlreadyAssignedTitle;
    }

    private final Object d() {
        String url;
        DevicePictures devicePictures = this.f54542b;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return 2131231532;
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.hwa09Setup_firmwareCheckingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final /* bridge */ /* synthetic */ Object B1() {
        return 2131232841;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return new LottieData("lottie/hwa09_tutorials/images", "lottie/hwa09_tutorials/overview.json", false, true);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return false;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int G0() {
        return C1987R.string.hwa09Setup_batteryLowMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.hwa09Setup_firmwareDownloadTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.hwa09Setup_activationSuccessMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        List list;
        u.j(setupActivity, "setupActivity");
        ej.w w11 = ej.w.w();
        u.i(w11, "get(...)");
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
        return C1987R.string.hwa09Setup_waitingForPairingMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return C1987R.string.hwa09Setup_instructionsMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(C1987R.string.hwa09Setup_overviewLearnMoreUrl, context);
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
        return d();
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
        return C1987R.string.hwa09Setup_pairingErrorTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.hwa09Setup_activatingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.hwa09Setup_firmwareCheckingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.hwa09Setup_searchingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return com.withings.device.setup.ui.l.a(C1987R.string.hwa09Setup_detectingMessage);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int T0() {
        return C1987R.string.hwa09Setup_waitingForPairingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131231532;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return d();
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
        return C1987R.string.hwa09Setup_firmwareUpgradeTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(93).I(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.withings.devicesetup.Setup$d] */
    @Override // com.withings.devicesetup.Setup.n
    public final List<Setup.c> c(Context context) {
        u.j(context, "context");
        Setup.c cVar = new Setup.c();
        cVar.h(C1987R.string.install_troubleshooting_watchScreen_off);
        cVar.e(C1987R.string.install_troubleshooting_watchScreen_off);
        ?? obj = new Object();
        obj.j();
        obj.f();
        obj.g(2131232301);
        obj.h();
        obj.i();
        cVar.g(obj);
        HelpCenterActivity.Companion companion = HelpCenterActivity.Companion;
        cVar.f(HelpCenterActivity.Companion.createIntent$default(companion, context, null, 360009883777L, 2, null));
        Setup.c cVar2 = new Setup.c();
        cVar2.h(C1987R.string.install_troubleshooting_watchScreen_time);
        cVar2.e(C1987R.string.install_troubleshooting_watchScreen_time_description);
        cVar2.f(HelpCenterActivity.Companion.createIntent$default(companion, context, null, 360010218558L, 2, null));
        return x.W(cVar, cVar2);
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131231532;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.hwa09Setup_rebootingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131232559;
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
        return C1987R.string.hwa09Setup_detectingTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string.hwa09Setup_searchingTimeoutMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.hwa09Setup_instructionsTitle;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return this.f54543c;
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
        return C1987R.string.hwa09_howToRecharge;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        com.withings.device.setup.ui.b.b(this, setupConversation, 93, 0L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.hwa09Setup_detectedTitle;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.hwa09Setup_firmwareUpgradeMessage;
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
        this.f54541a = user;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final int m1() {
        return C1987R.string.hwa09Setup_connectedTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final SetupBleBondConversation n(SetupConversation setupConversation) {
        return new SetupBleBondConversation();
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
        this.f54542b = devicePictures;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.hwa09Setup_searchingMessage;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b wppDevice) {
        u.j(wppDevice, "wppDevice");
        o f11 = p.f67672b.a().f(wppDevice);
        gq.a.a(16, 93);
        Setup e02 = f11.e0(new DeviceModel(f11.a(), null));
        u.g(e02);
        return e02;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        vf.c cVar;
        u.j(setupConversation, "setupConversation");
        Device f11 = kn.e.c().f(setupConversation.v());
        oi0.b h11 = oi0.b.h();
        u.i(h11, "get(...)");
        oi0.f.a(h11, new b(f11), "HWA09_post_association");
        User user = this.f54541a;
        if (user != null) {
            kn.e c11 = kn.e.c();
            u.i(c11, "get(...)");
            cVar = vf.c.f103617d;
            if (cVar != null) {
                rg.b b10 = rg.b.b();
                u.i(b10, "get(...)");
                WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
                u.i(workoutCategoryManager, "get(...)");
                return new Hwa0910InitConversation(user, c11, cVar, b10, workoutCategoryManager, p.f67672b.a(), null, true, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithBonding
    public final Object q0() {
        return d();
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        Device f11 = kn.e.c().f(setupActivity.U3());
        m11.c(c.a.a(setupActivity, f11.getId(), false));
        int i11 = HowToWearTrackerActivity.f54536a;
        m11.c(HowToWearTrackerActivity.a.a(setupActivity, f11.getId()));
        DeviceSettingsActivity.c cVar = DeviceSettingsActivity.f35012e;
        TrackerPositionDelegate trackerPositionDelegate = new TrackerPositionDelegate(f11);
        cVar.getClass();
        m11.c(DeviceSettingsActivity.c.a(setupActivity, f11, trackerPositionDelegate));
        m11.r();
        e.e(setupActivity);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.hwa09Setup_detectedMessage;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        u.j(context, "context");
        return HelpCenterActivity.Companion.createIntent$default(HelpCenterActivity.Companion, context, null, 360009931838L, 2, null);
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return this.f54544d;
    }

    @Override // com.withings.devicesetup.Setup.a
    public final void t() {
        User user = this.f54541a;
        if (user != null) {
            new id0.a(user).d();
        }
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string.hwa09Setup_overviewTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final /* bridge */ /* synthetic */ Object u() {
        return 2131232841;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.hwa09Setup_activatingTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int v2() {
        return C1987R.string.hwa09Setup_batteryLowTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 93);
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
        out.writeParcelable(this.f54541a, i11);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string.hwa09Setup_overviewMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final Intent x2(Context context) {
        u.j(context, "context");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = context.getString(C1987R.string.hwa09_howToRecharge_url);
        u.i(string, "getString(...)");
        return aVar.c(context, "", string);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.hwa09Setup_rebootingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final /* bridge */ /* synthetic */ Integer y1() {
        return 2131232301;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.hwa09Setup_firmwareDownloadMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.hwa09Setup_activationSuccessTitle;
    }

    public Hwa09InstallSetup() {
        this(null);
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
    }
}
