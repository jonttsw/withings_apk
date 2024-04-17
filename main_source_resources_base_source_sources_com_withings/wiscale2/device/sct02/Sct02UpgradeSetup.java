package com.withings.wiscale2.device.sct02;

import aj.b;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import androidx.compose.material3.k4;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import fl.p;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xp.g;
import yi.d;
/* compiled from: Sct02UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/sct02/Sct02UpgradeSetup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Sct02UpgradeSetup implements Setup.WithUpgrade {
    public static final Parcelable.Creator<Sct02UpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54824a;

    /* compiled from: Sct02UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Sct02UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Sct02UpgradeSetup createFromParcel(Parcel source) {
            u.j(source, "source");
            return new Sct02UpgradeSetup(source);
        }

        @Override // android.os.Parcelable.Creator
        public final Sct02UpgradeSetup[] newArray(int i11) {
            return new Sct02UpgradeSetup[i11];
        }
    }

    public Sct02UpgradeSetup(String str) {
        this.f54824a = str;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.empty_nbsp;
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

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
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

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        k4.e(setupActivity, "setupActivity", -1);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.sct02_name;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wifiConfiguring_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final b w() {
        return e.b(p.f67672b, 71);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        u.j(parcel, "parcel");
        parcel.writeString(this.f54824a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
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

    public Sct02UpgradeSetup(Parcel parcel) {
        this.f54824a = parcel.readString();
    }
}
