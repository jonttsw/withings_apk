package com.withings.wiscale2.device.wpa.wpa02;

import aj.b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import fl.p;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xp.g;
import yi.d;
/* compiled from: Wpa02UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/Wpa02UpgradeSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02UpgradeSetup implements Setup, Setup.WithUpgrade {
    public static final Parcelable.Creator<Wpa02UpgradeSetup> CREATOR = new Object();

    /* compiled from: Wpa02UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpa02UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wpa02UpgradeSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Wpa02UpgradeSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Wpa02UpgradeSetup[] newArray(int i11) {
            return new Wpa02UpgradeSetup[i11];
        }
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.device_upgrade_message_checking_firmware;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.device_upgrade_title_downloading;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.wpa_installation_ready_description;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return 0;
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
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.wpa01Setup_progressMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.device_upgrade_title_checking_firmware;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.wpa02_searchingDevice_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string.wpa01Setup_connectionMessage);
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
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.device_upgrade_title_percent_upgrading;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.device_install_rebooting;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 0;
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
        return C1987R.string._DONE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string.wpa02_pairing_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return 0;
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
        return C1987R.string.device_upgrade_title_upgrading;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.wpa02_searchingDevice_description;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.wpa01Setup_detectedMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wpa_installation_configuring_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final b w() {
        return e.b(p.f67672b, 102);
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
        out.writeInt(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.device_upgrade_message_upgrading;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.device_upgrade_message_downloading;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.wpa_installation_ready_title;
    }
}
