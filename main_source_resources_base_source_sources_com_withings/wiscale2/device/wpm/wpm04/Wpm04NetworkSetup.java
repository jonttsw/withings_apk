package com.withings.wiscale2.device.wpm.wpm04;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import fl.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import vi.o;
import we0.m;
import we0.n;
import xp.g;
import yi.d;
/* compiled from: Wpm04NetworkSetup.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/Wpm04NetworkSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$WithSilentBonding;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04NetworkSetup implements Setup, Setup.j, Setup.WithSilentBonding {
    public static final Parcelable.Creator<Wpm04NetworkSetup> CREATOR = new Object();

    /* compiled from: Wpm04NetworkSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpm04NetworkSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wpm04NetworkSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Wpm04NetworkSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Wpm04NetworkSetup[] newArray(int i11) {
            return new Wpm04NetworkSetup[i11];
        }
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return n.a(44).f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return new wb0.g(setupActivity, 44, false);
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
        return n.a(44).f37556e;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return n.a(44).f37570s;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return n.a(44).f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return n.a(44).f37574w;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return Integer.valueOf(m.a(44).f37548c);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return Integer.valueOf(m.a(44).f37551f);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(m.a(44).f37549d);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return Integer.valueOf(m.a(44).f37547b);
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
        return n.a(44).f37573v;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return n.a(44).f37555d;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return n.a(44).f37559h;
    }

    @Override // com.withings.devicesetup.Setup.WithSilentBonding
    public final boolean m(cj.b bVar) {
        if (bVar == null) {
            return false;
        }
        xi.b j5 = bVar.j();
        if (!(j5 instanceof o) || ((o) j5).d() == 12) {
            return false;
        }
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithSilentBonding
    public final SetupBleBondConversation n(SetupConversation setupConversation) {
        return new SetupBleBondConversation();
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return n.a(44).f37558g;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        setupActivity.setResult(-1);
        MainActivity.f47950r.getClass();
        setupActivity.startActivity(MainActivity.a.a(setupActivity));
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return n.a(44).f37560i;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return n.a(44).f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return e.b(p.f67672b, 44);
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

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return n.a(44).f37571t;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
