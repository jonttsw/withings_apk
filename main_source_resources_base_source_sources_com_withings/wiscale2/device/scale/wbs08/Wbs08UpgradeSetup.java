package com.withings.wiscale2.device.scale.wbs08;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import androidx.compose.material3.k4;
import com.withings.comm.remote.conversation.WppDeviceConversation;
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
/* compiled from: Wbs08UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/scale/wbs08/Wbs08UpgradeSetup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wbs08UpgradeSetup implements Setup.WithUpgrade {
    public static final Parcelable.Creator<Wbs08UpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f54740a;

    /* compiled from: Wbs08UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wbs08UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wbs08UpgradeSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wbs08UpgradeSetup(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Wbs08UpgradeSetup[] newArray(int i11) {
            return new Wbs08UpgradeSetup[i11];
        }
    }

    public Wbs08UpgradeSetup(String str) {
        this.f54740a = str;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.wbs08_upgrade_message_checking_firmware;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.wbs08_upgrade_title_downloading;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.wbs08_install_ready_description;
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
        return C1987R.string.wbs08_setup_instructions_message;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_BLACK) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_GREY) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = vd0.a.C1750a.f103610a;
     */
    @Override // com.withings.devicesetup.Setup.WithUpgrade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f54740a
            if (r0 == 0) goto L38
            int r1 = r0.hashCode()
            r2 = 3181279(0x308adf, float:4.457921E-39)
            if (r1 == r2) goto L2d
            r2 = 93818879(0x5978fff, float:1.4252868E-35)
            if (r1 == r2) goto L24
            r2 = 113101865(0x6bdcc29, float:7.1393885E-35)
            if (r1 == r2) goto L18
            goto L38
        L18:
            java.lang.String r1 = "white"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L38
        L21:
            vd0.a$c r0 = vd0.a.c.f103612a
            goto L3a
        L24:
            java.lang.String r1 = "black"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L38
        L2d:
            java.lang.String r1 = "grey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
        L35:
            vd0.a$a r0 = vd0.a.C1750a.f103610a
            goto L3a
        L38:
            vd0.a$b r0 = vd0.a.b.f103611a
        L3a:
            int r0 = r0.b()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs08.Wbs08UpgradeSetup.N2():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.wbs08_activation_message_activating;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.wbs08_upgrade_title_checking_firmware;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.scales_instal_searching_device;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return C1987R.string.wbs08_connection_message_connecting;
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
        return 2131232634;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_BLACK) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_GREY) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = vd0.a.C1750a.f103610a;
     */
    @Override // com.withings.devicesetup.Setup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f54740a
            if (r0 == 0) goto L38
            int r1 = r0.hashCode()
            r2 = 3181279(0x308adf, float:4.457921E-39)
            if (r1 == r2) goto L2d
            r2 = 93818879(0x5978fff, float:1.4252868E-35)
            if (r1 == r2) goto L24
            r2 = 113101865(0x6bdcc29, float:7.1393885E-35)
            if (r1 == r2) goto L18
            goto L38
        L18:
            java.lang.String r1 = "white"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L38
        L21:
            vd0.a$c r0 = vd0.a.c.f103612a
            goto L3a
        L24:
            java.lang.String r1 = "black"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L38
        L2d:
            java.lang.String r1 = "grey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
        L35:
            vd0.a$a r0 = vd0.a.C1750a.f103610a
            goto L3a
        L38:
            vd0.a$b r0 = vd0.a.b.f103611a
        L3a:
            int r0 = r0.b()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs08.Wbs08UpgradeSetup.Z():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.wbs08_upgrade_title_upgrading_percent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_BLACK) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_GREY) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = vd0.a.C1750a.f103610a;
     */
    @Override // com.withings.devicesetup.Setup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f54740a
            if (r0 == 0) goto L38
            int r1 = r0.hashCode()
            r2 = 3181279(0x308adf, float:4.457921E-39)
            if (r1 == r2) goto L2d
            r2 = 93818879(0x5978fff, float:1.4252868E-35)
            if (r1 == r2) goto L24
            r2 = 113101865(0x6bdcc29, float:7.1393885E-35)
            if (r1 == r2) goto L18
            goto L38
        L18:
            java.lang.String r1 = "white"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L38
        L21:
            vd0.a$c r0 = vd0.a.c.f103612a
            goto L3a
        L24:
            java.lang.String r1 = "black"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L38
        L2d:
            java.lang.String r1 = "grey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
        L35:
            vd0.a$a r0 = vd0.a.C1750a.f103610a
            goto L3a
        L38:
            vd0.a$b r0 = vd0.a.b.f103611a
        L3a:
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs08.Wbs08UpgradeSetup.c1():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.scales_install_rebooting;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131232847;
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
        return C1987R.string.wbs08_install_setUp_button;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string.wbs08_connection_title_connecting;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.wbs08_connection_title_instructions;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.scales_install_device_detected;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.wbs08_upgrade_message_upgrading;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.wbs08_connection_message_searching;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        k4.e(setupActivity, "setupActivity", -1);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.wbs08_connection_message_detected;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wbs08_activation_title_activating;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return e.b(p.f67672b, 10);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f54740a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.wbs08_upgrade_message_rebooting;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.wbs08_upgrade_message_downloading;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.wbs08_install_ready_title;
    }
}
