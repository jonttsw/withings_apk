package com.withings.wiscale2.device.scale.wbs06;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import androidx.compose.material3.k4;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.features.FeatureFlag;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.scale.conversation.ScaleSetupInitConversation;
import fl.p;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import wr.b;
import xp.g;
import yi.d;
/* compiled from: Wbs06sUpgradeSetup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/scale/wbs06/Wbs06sUpgradeSetup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wbs06sUpgradeSetup implements Setup.WithUpgrade {
    public static final Parcelable.Creator<Wbs06sUpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54736a;

    /* compiled from: Wbs06sUpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wbs06sUpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wbs06sUpgradeSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wbs06sUpgradeSetup(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Wbs06sUpgradeSetup[] newArray(int i11) {
            return new Wbs06sUpgradeSetup[i11];
        }
    }

    public Wbs06sUpgradeSetup(String str) {
        this.f54736a = str;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._WBS06_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._WBS06_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WBS06_UPGRADE_MESSAGE_SUCCESS_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return null;
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
        return C1987R.string._WBS06_CONNECTION_MESSAGE_INSTRUCTIONS_;
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
        return Integer.valueOf(ud0.a.a(this.f54736a).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WBS06_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._WBS06_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WBS06_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string._WBS06_CONNECTION_MESSAGE_CONNECTING_);
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
        return 2131232623;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return Integer.valueOf(ud0.a.a(this.f54736a).f37551f);
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string._WBS06_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(ud0.a.a(this.f54736a).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._WBS06_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232625;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new ScaleSetupInitConversation(true, b.c(FeatureFlag.f39112i));
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
        return C1987R.string._WBS06_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._WBS06_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WBS06_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._WBS06_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WBS06_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        k4.e(setupActivity, "setupActivity", -1);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WBS06_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WBS06_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return e.b(p.f67672b, 14);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f54736a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._WBS06_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._WBS06_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WBS06_UPGRADE_TITLE_SUCCESS_;
    }

    public Wbs06sUpgradeSetup() {
        this(null);
    }
}
