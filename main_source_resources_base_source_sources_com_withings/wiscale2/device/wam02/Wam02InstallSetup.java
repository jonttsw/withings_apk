package com.withings.wiscale2.device.wam02;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.setup.ui.b;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wam02.conversation.Wam02PostAssociationConversation;
import fl.p;
import ie0.d;
import uc0.e;
import xp.g;
/* loaded from: classes5.dex */
public class Wam02InstallSetup implements Setup, Setup.WithOverview, Setup.e, Setup.WithUpgrade, SetupWithUser, Setup.k, Setup.l {
    public static final Parcelable.Creator<Wam02InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private User f54848a;

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<Wam02InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wam02InstallSetup createFromParcel(Parcel parcel) {
            return new Wam02InstallSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Wam02InstallSetup[] newArray(int i11) {
            return new Wam02InstallSetup[i11];
        }
    }

    public Wam02InstallSetup() {
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._WAM02_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return 2131232567;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._WAM02_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WAM02_ACTIVATION_MESSAGE_ACTIVATED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        return new d(setupActivity);
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
        return C1987R.string._WAM02_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        return null;
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
        return 2131232566;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WAM02_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._WAM02_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WAM02_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string._WAM02_CONNECTION_MESSAGE_CONNECTING_);
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
        return 2131232568;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return 2131232567;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string._WAM02_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(54).I(null);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return 2131232566;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._WAM02_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232568;
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
        return C1987R.string._WAM02_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string._WAM02_CONNECTION_HELPER_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._WAM02_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return 16;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        b.b(this, setupConversation, 54, 0L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WAM02_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._WAM02_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
        this.f54848a = user;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WAM02_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        return new Wam02PostAssociationConversation(this.f54848a, new Wam02PostAssociationConversation.a(setupConversation));
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        e.e(setupActivity);
        e.f(setupActivity.getApplicationContext(), this.f54848a);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WAM02_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String string = context.getString(C1987R.string._WAM02_CONNECTION_HELPER_LINK_SEARCHING_);
        return HMWebActivity.f35395c.c(context, context.getString(C1987R.string._HELP_CENTER_), string);
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return C1987R.string._WAM02__s_ALREADY_ASSIGNED_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string._WAM02_OVERVIEW_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Object u() {
        return 2131232566;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WAM02_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 54);
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
        parcel.writeParcelable(this.f54848a, i11);
    }

    @Override // com.withings.devicesetup.Setup
    public final yi.d x(Context context) {
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string._WAM02_OVERVIEW_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._WAM02_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._WAM02_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WAM02_ACTIVATION_TITLE_ACTIVATED_;
    }

    Wam02InstallSetup(Parcel parcel) {
        this.f54848a = (User) parcel.readParcelable(User.class.getClassLoader());
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
