package com.withings.wiscale2.device.scale.wbs03;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.b;
import com.withings.common.device.conversation.BondPostUpgradeConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.scale.conversation.ScaleInstallFinalizingConversation;
import com.withings.wiscale2.device.scale.conversation.ScaleSetupInitConversation;
import ej.w;
import fl.o;
import fl.p;
import java.util.Arrays;
import java.util.List;
import uc0.e;
import vf.c;
import xp.g;
import yi.d;
/* loaded from: classes5.dex */
public class Wbs03InstallSetup implements Setup.WithOverview, Setup.WithUpgradeDependingOnNetworkConfiguration, Setup.e, Setup.f, Setup.m, Setup.k, Setup.o, Setup.l {
    public static final Parcelable.Creator<Wbs03InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54718a;

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<Wbs03InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wbs03InstallSetup createFromParcel(Parcel parcel) {
            return new Wbs03InstallSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Wbs03InstallSetup[] newArray(int i11) {
            return new Wbs03InstallSetup[i11];
        }
    }

    public Wbs03InstallSetup() {
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._WBS03_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return 2131232586;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._WBS03_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WBS03_ACTIVATION_MESSAGE_ACTIVATED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        List list;
        w w11 = w.w();
        int i11 = ml.a.f82249l;
        list = ml.a.f82238a;
        return new b(w11, setupActivity, list);
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return C1987R.string._WBS03_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        return e.c(C1987R.string._SCALE_WS30_URL_, context);
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
        return Integer.valueOf(rd0.a.a(this.f54718a).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WBS03_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._WBS03_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WBS03_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string._WBS03_CONNECTION_MESSAGE_CONNECTING_);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return 2131232585;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return Integer.valueOf(rd0.a.a(this.f54718a).f37551f);
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        c cVar;
        cVar = c.f103617d;
        if (cVar != null) {
            return !cVar.j();
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string._WBS03_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(2).I(this.f54718a);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(rd0.a.a(this.f54718a).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._WBS03_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232587;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        return new BondPostUpgradeConversation();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e0() {
        return C1987R.string._DONE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string._WBS03_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string._WBS03_CONNECTION_HELPER_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._WBS03_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return Arrays.asList(2, 1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.withings.wiscale2.device.scale.conversation.b] */
    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return new ScaleInstallFinalizingConversation(new Object(), setupConversation, false);
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        c cVar;
        cVar = c.f103617d;
        if (cVar != null) {
            setupConversation.G(new uc0.a(cVar, ConstantsWs.CALLCTX_SCALE_INSTALL));
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WBS03_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._WBS03_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WBS03_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b bVar) {
        o f11 = p.f67672b.a().f(bVar);
        gq.a.a(f11.getDeviceType(), 2);
        return f11.e0(new DeviceModel(f11.a(), null));
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        return new ScaleSetupInitConversation(false, false);
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
        this.f54718a = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        e.e(setupActivity);
        kn.e.c().f(setupActivity.U3());
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        m11.r();
        setupActivity.setResult(-1);
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WBS03_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String string = context.getString(C1987R.string._WBS03_CONNECTION_HELPER_LINK_SEARCHING_);
        return HMWebActivity.f35395c.c(context, context.getString(C1987R.string._HELP_CENTER_), string);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string._WBS03_OVERVIEW_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Object u() {
        return 2131232583;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WBS03_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 2);
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
        parcel.writeString(this.f54718a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        return e.b(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string._WBS03_OVERVIEW_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._WBS03_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._WBS03_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgradeDependingOnNetworkConfiguration
    public final boolean z0(SetupConversation setupConversation, int i11) {
        long j5 = setupConversation.x().i().softVersion;
        if (i11 != 2 && j5 >= 510) {
            return false;
        }
        return true;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WBS03_ACTIVATION_TITLE_ACTIVATED_;
    }

    Wbs03InstallSetup(Parcel parcel) {
        this.f54718a = parcel.readString();
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
    }
}
