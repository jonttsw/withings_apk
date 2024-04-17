package com.withings.wiscale2.device.sct02;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import cj.b;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.sct01.conversation.SctSetupInitConversation;
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
/* compiled from: Sct02InstallSetup.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\t\b\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/device/sct02/Sct02InstallSetup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$f;", "Lcom/withings/devicesetup/Setup$m;", "Lcom/withings/devicesetup/Setup$k;", "Lcom/withings/devicesetup/Setup$o;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Sct02InstallSetup implements Setup.WithOverview, Setup.WithUpgrade, Setup.e, Setup.j, Setup.f, Setup.m, Setup.k, Setup.o {
    public static final Parcelable.Creator<Sct02InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54822a;

    /* compiled from: Sct02InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Sct02InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Sct02InstallSetup createFromParcel(Parcel source) {
            u.j(source, "source");
            return new Sct02InstallSetup(source);
        }

        @Override // android.os.Parcelable.Creator
        public final Sct02InstallSetup[] newArray(int i11) {
            return new Sct02InstallSetup[i11];
        }
    }

    public Sct02InstallSetup() {
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.empty_nbsp;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final /* bridge */ /* synthetic */ Object E() {
        return Integer.valueOf((int) C1987R.drawable.device_sct02);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        u.j(context, "context");
        return false;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._WBS05_UPGRADE_TITLE_AVAILABLE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.sct02_install_ready_description;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return new wb0.g(setupActivity, 71, true);
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
        return C1987R.string.wbs07Setup_instructionsMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(C1987R.string._SHOP_DEFAULT_URL_, context);
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
    public final /* bridge */ /* synthetic */ Object N2() {
        return Integer.valueOf((int) C1987R.drawable.device_sct02);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.empty_nbsp;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._WBS05_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.scales_instal_searching_device;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1987R.string.instal_android_popupWarning;
        }
        return C1987R.string.empty_nbsp;
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
    public final /* bridge */ /* synthetic */ Object X0() {
        return Integer.valueOf((int) C1987R.drawable.device_sct02);
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object Z() {
        return Integer.valueOf((int) C1987R.drawable.device_sct02);
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

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return Integer.valueOf((int) C1987R.drawable.device_sct02);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.install_deviceRebooting;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return Integer.valueOf((int) C1987R.drawable.device_sct02);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
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
        return C1987R.string._WBS05_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.install_turnOnYourDevice;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        c cVar;
        u.j(setupConversation, "setupConversation");
        cVar = c.f103617d;
        if (cVar != null) {
            setupConversation.G(new uc0.a(cVar, ConstantsWs.CALLCTX_THERMO_INSTALL));
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.install_deviceDetected;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.sct01Setup_firmwareUpgradeMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.empty_nbsp;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(b wppDevice) {
        u.j(wppDevice, "wppDevice");
        o f11 = p.f67672b.a().f(wppDevice);
        gq.a.a(64, 71);
        Setup e02 = f11.e0(new DeviceModel(f11.a(), null));
        u.g(e02);
        return e02;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new SctSetupInitConversation();
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
        this.f54822a = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        e.e(setupActivity);
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        m11.r();
        setupActivity.setResult(-1);
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.sct02_name;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string.sct02_install_welcome;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wifiConfiguring_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 71);
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
        parcel.writeString(this.f54822a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string.sct02_install_welcome_description;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.empty_nbsp;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.empty_nbsp;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.sct02_install_ready_title;
    }

    public Sct02InstallSetup(Parcel parcel) {
        this.f54822a = parcel.readString();
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
    }
}
