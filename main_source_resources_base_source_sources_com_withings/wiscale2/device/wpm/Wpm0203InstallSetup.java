package com.withings.wiscale2.device.wpm;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import cj.b;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.setup.android.setup.init.association.SendAssociationKeysConversation;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.wpm.conversation.WpmMeasureConversation;
import ej.w;
import fl.o;
import fl.p;
import uc0.e;
import vf.c;
import we0.h;
import we0.m;
import we0.n;
import xp.g;
import yi.d;
/* loaded from: classes5.dex */
public class Wpm0203InstallSetup implements Setup, Setup.WithOverview, Setup.e, Setup.WithUpgrade, Setup.p, Setup.k, Setup.m, Setup.l {
    public static final Parcelable.Creator<Wpm0203InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f55593a;

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<Wpm0203InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wpm0203InstallSetup createFromParcel(Parcel parcel) {
            return new Wpm0203InstallSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Wpm0203InstallSetup[] newArray(int i11) {
            return new Wpm0203InstallSetup[i11];
        }
    }

    public Wpm0203InstallSetup(int i11) {
        this.f55593a = i11;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return n.a(this.f55593a).f37562k;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return Integer.valueOf(m.a(this.f55593a).f37546a);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return n.a(this.f55593a).f37563l;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return n.a(this.f55593a).f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        return new h(setupActivity);
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
        return n.a(this.f55593a).f37556e;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        return e.c(n.a(this.f55593a).f37554c, context);
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
        return Integer.valueOf(m.a(this.f55593a).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return n.a(this.f55593a).f37570s;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return n.a(this.f55593a).f37561j;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return n.a(this.f55593a).f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(n.a(this.f55593a).f37574w);
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
        return Integer.valueOf(m.a(this.f55593a).f37548c);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return Integer.valueOf(m.a(this.f55593a).f37551f);
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
        return n.a(this.f55593a).f37565n;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(this.f55593a).I(null);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(m.a(this.f55593a).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return n.a(this.f55593a).f37567p;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return Integer.valueOf(m.a(this.f55593a).f37547b);
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
        return n.a(this.f55593a).f37573v;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return n.a(this.f55593a).f37576y;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return n.a(this.f55593a).f37555d;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        w.w().O(setupConversation.x(), new WpmMeasureConversation(new com.withings.wiscale2.device.wpm.conversation.a(setupConversation.r())), WpmMeasureConversation.class);
        return null;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        c cVar;
        cVar = c.f103617d;
        if (cVar != null) {
            setupConversation.G(new uc0.a(cVar, ConstantsWs.CALLCTX_INSTALL));
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return n.a(this.f55593a).f37559h;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return n.a(this.f55593a).f37566o;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return n.a(this.f55593a).f37558g;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(b bVar) {
        int i11;
        o f11 = p.f67672b.a().f(bVar);
        if (bVar.h() == 7) {
            i11 = 42;
        } else {
            i11 = 43;
        }
        this.f55593a = i11;
        gq.a.a(f11.getDeviceType(), 4);
        return this;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        c cVar;
        kn.e c11 = kn.e.c();
        cVar = c.f103617d;
        if (cVar != null) {
            return new SendAssociationKeysConversation(c11, cVar);
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        setupActivity.setResult(-1);
        MainActivity.f47950r.getClass();
        setupActivity.startActivity(MainActivity.a.a(setupActivity));
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return n.a(this.f55593a).f37560i;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String string = context.getString(n.a(this.f55593a).f37575x);
        return HMWebActivity.f35395c.c(context, context.getString(C1987R.string._HELP_CENTER_), string);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return n.a(this.f55593a).f37552a;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Object u() {
        return Integer.valueOf(m.a(this.f55593a).f37549d);
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return n.a(this.f55593a).f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 42);
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
        parcel.writeInt(this.f55593a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        return e.b(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return n.a(this.f55593a).f37553b;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return n.a(this.f55593a).f37568q;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return n.a(this.f55593a).f37564m;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return n.a(this.f55593a).f37571t;
    }

    Wpm0203InstallSetup(Parcel parcel) {
        this.f55593a = parcel.readInt();
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
