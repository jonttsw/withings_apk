package com.withings.wiscale2.device.wpm.wpm06;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.v0;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.wpm.wpm06.conversation.Wpm06SetupInitConversation;
import com.withings.wiscale2.device.wpm.wpm06.ui.Wpm06PostInstallActivity;
import ej.w;
import fl.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import uc0.e;
import vf.c;
import we0.m;
import we0.n;
import xp.g;
import yi.d;
/* compiled from: Wpm06InstallSetup.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm06/Wpm06InstallSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$l;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm06InstallSetup implements Setup, Setup.WithOverview, Setup.WithUpgrade, Setup.j, Setup.e, Setup.l {
    public static final Parcelable.Creator<Wpm06InstallSetup> CREATOR = new Object();

    /* compiled from: Wpm06InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpm06InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wpm06InstallSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Wpm06InstallSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Wpm06InstallSetup[] newArray(int i11) {
            return new Wpm06InstallSetup[i11];
        }
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return n.a(46).f37562k;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return Integer.valueOf(m.a(46).f37546a);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        u.j(context, "context");
        return e.d(n.a(46).f37554c, context);
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
        List list;
        u.j(setupActivity, "setupActivity");
        w w11 = w.w();
        u.i(w11, "get(...)");
        int i11 = ml.a.f82249l;
        list = ml.a.f82240c;
        return new com.withings.common.device.b(w11, setupActivity, list);
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

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(n.a(46).f37554c, context);
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
        return l.a(n.a(46).f37574w);
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
        return n.a(46).f37565n;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(46).I(null);
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
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e0() {
        return C1987R.string._NEXT_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return n.a(46).f37573v;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return n.a(46).f37576y;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return n.a(46).f37555d;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        return new DebugDumpConversation(a11, new jl.b(c11), null, new jl.c(0L));
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        c cVar;
        u.j(setupConversation, "setupConversation");
        cVar = c.f103617d;
        if (cVar != null) {
            setupConversation.G(new uc0.a(cVar, ConstantsWs.CALLCTX_INSTALL));
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
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

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        c cVar;
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            return new Wpm06SetupInitConversation(c11, cVar);
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        h0 m11 = h0.m(setupActivity);
        MainActivity.f47950r.getClass();
        m11.c(MainActivity.a.a(setupActivity));
        int i11 = Wpm06PostInstallActivity.f55960b;
        m11.c(new Intent(setupActivity, Wpm06PostInstallActivity.class));
        m11.r();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return n.a(46).f37560i;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        u.j(context, "context");
        String string = context.getString(n.a(46).f37575x);
        return HMWebActivity.f35395c.c(context, v0.c(string, "getString(...)", context, C1987R.string._HELP_CENTER_, "getString(...)"), string);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return n.a(46).f37552a;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Object u() {
        return Integer.valueOf(m.a(46).f37549d);
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
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return n.a(46).f37553b;
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

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
