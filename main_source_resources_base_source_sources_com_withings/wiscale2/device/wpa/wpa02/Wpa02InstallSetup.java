package com.withings.wiscale2.device.wpa.wpa02;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.setup.ui.b;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02PostAssociationConversation;
import fl.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import uc0.e;
import vf.c;
import xp.g;
import yi.d;
import zg.c;
/* compiled from: Wpa02InstallSetup.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/Wpa02InstallSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/device/setup/ui/SetupWithUser;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$b;", "Lcom/withings/devicesetup/Setup$i;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02InstallSetup implements Setup, Setup.WithOverview, Setup.WithUpgrade, SetupWithUser, Setup.e, Setup.j, Setup.b, Setup.i {
    public static final Parcelable.Creator<Wpa02InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private User f55027a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55028b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55029c;

    /* compiled from: Wpa02InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpa02InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wpa02InstallSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wpa02InstallSetup((User) parcel.readParcelable(Wpa02InstallSetup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Wpa02InstallSetup[] newArray(int i11) {
            return new Wpa02InstallSetup[i11];
        }
    }

    public Wpa02InstallSetup(User user) {
        this.f55027a = user;
        this.f55028b = 512;
        this.f55029c = C1987R.string.wpa01Setup_activationErrorAlreadyAssignedTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.device_upgrade_message_checking_firmware;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final /* bridge */ /* synthetic */ Object E() {
        return 2131232943;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return false;
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
        return new wb0.g(setupActivity, 102, true);
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
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(C1987R.string._SHOP_WPA02_URL_, context);
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
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object Z() {
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.device_upgrade_title_percent_upgrading;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int c() {
        return 3;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.device_install_rebooting;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final List<Integer> d() {
        ArrayList arrayList = new ArrayList(3);
        for (int i11 = 0; i11 < 3; i11++) {
            arrayList.add(null);
        }
        return arrayList;
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
        return C1987R.string.wpa_installation_ready_button;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string.wpa02_pairing_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int g(int i11, boolean z5) {
        return i11 + 1;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return this.f55028b;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.V(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final Object[] i() {
        return new Integer[]{2131232936, 2131232941, 2131232930};
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        b.b(this, setupConversation, 102, 2000L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.install_deviceDetected;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] k() {
        return new int[]{C1987R.string.wpa02_install_getReady_title, C1987R.string.wpa02_openUScan_title, C1987R.string.wpa02_chargeUScan_title};
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.device_upgrade_title_upgrading;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] l() {
        return new int[]{C1987R.string.wpa02_install_getReady_description, C1987R.string.wpa02_openUScan_description, C1987R.string.wpa02_chargeUScan_description};
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
        this.f55027a = user;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.wpa02_searchingDevice_description;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        c cVar;
        User user = this.f55027a;
        if (user != null) {
            kn.e c11 = kn.e.c();
            u.i(c11, "get(...)");
            cVar = c.f103617d;
            if (cVar != null) {
                return new Wpa02PostAssociationConversation(user, c11, cVar);
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        Device f11 = kn.e.c().f(setupActivity.U3());
        c.a aVar = c.a.f110626a;
        u.g(f11);
        m11.c(aVar.g(setupActivity, f11, false));
        m11.r();
        setupActivity.setResult(-1);
        e.e(setupActivity);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.wpa01Setup_detectedMessage;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return this.f55029c;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string.wpa02_device_name;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wpa_installation_configuring_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 102);
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
        out.writeParcelable(this.f55027a, i11);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string.wpa02_device_description;
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

    public Wpa02InstallSetup() {
        this(null);
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
