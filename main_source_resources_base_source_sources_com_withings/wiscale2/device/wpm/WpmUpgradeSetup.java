package com.withings.wiscale2.device.wpm;

import aj.b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import fl.p;
import uc0.e;
import we0.m;
import we0.n;
import xp.g;
import yi.d;
/* loaded from: classes5.dex */
public class WpmUpgradeSetup implements Setup.WithUpgrade, Setup.p {
    public static final Parcelable.Creator<WpmUpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f55594a;

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<WpmUpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final WpmUpgradeSetup createFromParcel(Parcel parcel) {
            return new WpmUpgradeSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WpmUpgradeSetup[] newArray(int i11) {
            return new WpmUpgradeSetup[i11];
        }
    }

    public WpmUpgradeSetup(int i11) {
        this.f55594a = i11;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return n.a(this.f55594a).f37562k;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return n.a(this.f55594a).f37563l;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return n.a(this.f55594a).f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
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
        return n.a(this.f55594a).f37556e;
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
        return Integer.valueOf(m.a(this.f55594a).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return n.a(this.f55594a).f37570s;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return n.a(this.f55594a).f37561j;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return n.a(this.f55594a).f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(n.a(this.f55594a).f37574w);
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
        return Integer.valueOf(m.a(this.f55594a).f37548c);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return Integer.valueOf(m.a(this.f55594a).f37551f);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return n.a(this.f55594a).f37565n;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(m.a(this.f55594a).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return n.a(this.f55594a).f37567p;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return Integer.valueOf(m.a(this.f55594a).f37547b);
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
        return n.a(this.f55594a).f37573v;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return n.a(this.f55594a).f37555d;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return n.a(this.f55594a).f37559h;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return n.a(this.f55594a).f37566o;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return n.a(this.f55594a).f37558g;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        setupActivity.setResult(-1);
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return n.a(this.f55594a).f37560i;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return n.a(this.f55594a).f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final b w() {
        return p.f67672b.a().d(this.f55594a).w();
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f55594a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        return e.b(context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return n.a(this.f55594a).f37568q;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return n.a(this.f55594a).f37564m;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return n.a(this.f55594a).f37571t;
    }

    WpmUpgradeSetup(Parcel parcel) {
        this.f55594a = parcel.readInt();
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
