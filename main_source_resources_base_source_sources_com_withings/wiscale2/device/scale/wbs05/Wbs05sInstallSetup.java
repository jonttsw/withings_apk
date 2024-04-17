package com.withings.wiscale2.device.scale.wbs05;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.b;
import com.withings.common.device.conversation.BondPostUpgradeConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.scale.conversation.ScaleInstallFinalizingConversation;
import com.withings.wiscale2.device.scale.conversation.ScaleSetupInitConversation;
import ej.w;
import fl.o;
import fl.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import uc0.e;
import vf.c;
import xp.g;
import yi.d;
import zg.c;
/* compiled from: Wbs05sInstallSetup.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\t\b\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/device/scale/wbs05/Wbs05sInstallSetup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$f;", "Lcom/withings/devicesetup/Setup$m;", "Lcom/withings/devicesetup/Setup$k;", "Lcom/withings/devicesetup/Setup$o;", "Lcom/withings/devicesetup/Setup$l;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wbs05sInstallSetup implements Setup.WithOverview, Setup.WithUpgrade, Setup.e, Setup.j, Setup.f, Setup.m, Setup.k, Setup.o, Setup.l {
    public static final Parcelable.Creator<Wbs05sInstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54727a;

    /* compiled from: Wbs05sInstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wbs05sInstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wbs05sInstallSetup createFromParcel(Parcel source) {
            u.j(source, "source");
            return new Wbs05sInstallSetup(source);
        }

        @Override // android.os.Parcelable.Creator
        public final Wbs05sInstallSetup[] newArray(int i11) {
            return new Wbs05sInstallSetup[i11];
        }
    }

    public Wbs05sInstallSetup() {
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._WBS05_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return 2131232605;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        u.j(context, "context");
        return e.d(C1987R.string._SCALE_WS45_URL_, context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._WBS05_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WBS05_ACTIVATION_MESSAGE_ACTIVATED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        List list;
        u.j(setupActivity, "setupActivity");
        w w11 = w.w();
        u.i(w11, "get(...)");
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
        return C1987R.string._WBS05_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(C1987R.string._SCALE_WS45_URL_, context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final Object N2() {
        return Integer.valueOf(td0.a.a(this.f54727a).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WBS05_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._WBS05_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WBS05_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1987R.string.instal_android_popupWarning;
        }
        return C1987R.string._WBS05_CONNECTION_MESSAGE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return 2131232604;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return Integer.valueOf(td0.a.a(this.f54727a).f37551f);
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
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
        return C1987R.string._WBS05_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(5).I(this.f54727a);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(td0.a.a(this.f54727a).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._WBS05_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232614;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new BondPostUpgradeConversation();
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
        return C1987R.string._WBS05_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string._WBS05_HOW_TO_CONNECT_LINK_LABEL_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._WBS05_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.withings.wiscale2.device.scale.conversation.b] */
    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new ScaleInstallFinalizingConversation(new Object(), setupConversation, wr.b.c(FeatureFlag.f39112i));
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        c cVar;
        u.j(setupConversation, "setupConversation");
        cVar = c.f103617d;
        if (cVar != null) {
            setupConversation.G(new uc0.a(cVar, ConstantsWs.CALLCTX_SCALE_INSTALL));
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WBS05_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._WBS05_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WBS05_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b wppDevice) {
        u.j(wppDevice, "wppDevice");
        o f11 = p.f67672b.a().f(wppDevice);
        gq.a.a(1, 13);
        Setup e02 = f11.e0(new DeviceModel(f11.a(), null));
        u.g(e02);
        return e02;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new ScaleSetupInitConversation(true, wr.b.c(FeatureFlag.f39112i));
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
        this.f54727a = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        e.e(setupActivity);
        Device f11 = kn.e.c().f(setupActivity.U3());
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        u.g(f11);
        m11.c(c.a.e(setupActivity, f11, 13, setupActivity.S3(), true, false));
        m11.r();
        setupActivity.setResult(-1);
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WBS05_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String b10 = com.google.android.gms.internal.p002firebaseauthapi.a.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, C1987R.string._WBS05_CONNECTION_HELPER_LINK_SEARCHING_, "getString(...)");
        String string = context.getString(C1987R.string._HELP_CENTER_);
        u.i(string, "getString(...)");
        return HMWebActivity.f35395c.c(context, string, b10);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string._WBS05_OVERVIEW_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Object u() {
        return 2131232601;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WBS05_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 13);
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
        u.j(parcel, "parcel");
        parcel.writeString(this.f54727a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string._WBS05_OVERVIEW_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._WBS05_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._WBS05_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WBS05_ACTIVATION_TITLE_ACTIVATED_;
    }

    public Wbs05sInstallSetup(Parcel parcel) {
        this.f54727a = parcel.readString();
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
    }
}
