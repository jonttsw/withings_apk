package com.withings.wiscale2.device.scale.wbs06;

import aj.b;
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
import com.withings.wiscale2.C1987R;
import fl.p;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xp.g;
import yi.d;
/* compiled from: Wbs06sNetworkSetup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/scale/wbs06/Wbs06sNetworkSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$j;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wbs06sNetworkSetup implements Setup, Setup.j {
    public static final Parcelable.Creator<Wbs06sNetworkSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54735a;

    /* compiled from: Wbs06sNetworkSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wbs06sNetworkSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wbs06sNetworkSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wbs06sNetworkSetup(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Wbs06sNetworkSetup[] newArray(int i11) {
            return new Wbs06sNetworkSetup[i11];
        }
    }

    public Wbs06sNetworkSetup(String str) {
        this.f54735a = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WBS06_UPDATE_NETWORK_MESSAGE_;
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

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WBS06_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WBS06_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string._WBS06_CONNECTION_MESSAGE_CONNECTING_);
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
        return Integer.valueOf(ud0.a.a(this.f54735a).f37551f);
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return Integer.valueOf(ud0.a.a(this.f54735a).f37549d);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232625;
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

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        List<Integer> asList = Arrays.asList(2, 1);
        u.i(asList, "asList(...)");
        return asList;
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
    public final b w() {
        return e.b(p.f67672b, 14);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f54735a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WBS06_UPDATE_NETWORK_TITLE_;
    }

    public Wbs06sNetworkSetup() {
        this(null);
    }
}
