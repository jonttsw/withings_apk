package com.withings.wiscale2.device.wpm.wpm06;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.material3.k4;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm06.conversation.Wpm06SetupInitConversation;
import fl.p;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vf.c;
import we0.m;
import we0.n;
import xp.g;
import yi.d;
/* compiled from: Wpm06UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm06/Wpm06UpgradeSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm06UpgradeSetup implements Setup, Setup.WithUpgrade {
    public static final Parcelable.Creator<Wpm06UpgradeSetup> CREATOR = new Object();

    /* compiled from: Wpm06UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpm06UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wpm06UpgradeSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Wpm06UpgradeSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Wpm06UpgradeSetup[] newArray(int i11) {
            return new Wpm06UpgradeSetup[i11];
        }
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return n.a(46).f37562k;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return n.a(46).f37563l;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return n.a(46).f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return new wb0.g(setupActivity, 46, false);
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
        return n.a(46).f37556e;
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
        return Integer.valueOf(m.a(46).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return n.a(46).f37570s;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return n.a(46).f37561j;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return n.a(46).f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return n.a(46).f37574w;
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
        return Integer.valueOf(m.a(46).f37548c);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return Integer.valueOf(m.a(46).f37551f);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return n.a(46).f37565n;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(m.a(46).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return n.a(46).f37567p;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return Integer.valueOf(m.a(46).f37547b);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        c cVar;
        e c11 = e.c();
        u.i(c11, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            return new Wpm06SetupInitConversation(c11, cVar);
        }
        throw new IllegalArgumentException("You must call init before".toString());
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
        return n.a(46).f37573v;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return n.a(46).f37555d;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return n.a(46).f37559h;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return n.a(46).f37566o;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return n.a(46).f37558g;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        k4.e(setupActivity, "setupActivity", -1);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return n.a(46).f37560i;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return n.a(46).f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 46);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
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
        return n.a(46).f37568q;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return n.a(46).f37564m;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return n.a(46).f37571t;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
