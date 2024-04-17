package com.withings.device.install.wsd.network;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import cj.b;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.device.Device;
import com.withings.device.install.wsd.conversation.TimeZoneAndGeolocConversation;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import ej.w;
import fl.p;
import java.util.List;
import kn.e;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import u70.i;
import xp.g;
import yi.d;
/* compiled from: Wsd01WifiSetup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/device/install/wsd/network/Wsd01WifiSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$j;", "device-install-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Wsd01WifiSetup implements Setup, Setup.j {
    public static final Parcelable.Creator<Wsd01WifiSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final i f37366a;

    /* compiled from: Wsd01WifiSetup.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Wsd01WifiSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wsd01WifiSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wsd01WifiSetup((i) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Wsd01WifiSetup[] newArray(int i11) {
            return new Wsd01WifiSetup[i11];
        }
    }

    public Wsd01WifiSetup(i macAddress) {
        u.j(macAddress, "macAddress");
        this.f37366a = macAddress;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WSD01_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return new fo.a(this.f37366a, setupActivity);
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        long j5;
        ProbeReply i11;
        w w11 = w.w();
        i iVar = this.f37366a;
        b D = w11.D(iVar);
        Device f11 = e.c().f(iVar);
        if (D != null && (i11 = D.i()) != null) {
            j5 = i11.softVersion;
        } else if (f11 != null) {
            j5 = f11.getFirmware();
        } else {
            j5 = Long.MAX_VALUE;
        }
        if (j5 >= 1104) {
            return true;
        }
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return p004do.a.a();
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return C1987R.string._WSD01_WIFI_CONFIG_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WSD01_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WSD01_SEARCHING_DETAILS_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return C1987R.string._WSD01_CONNECTION_MESSAGE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131232434;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object Z() {
        return 2131232434;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131232434;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131232434;
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
        return C1987R.string._BT_POPUP_CONNECTING_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._WSD01_;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.V(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new TimeZoneAndGeolocConversation();
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WSD01_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WSD01_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WSD01_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WSD01_SETUP_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 60);
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
        out.writeSerializable(this.f37366a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return new wi.e(context, (wi.a) null, (ui.d) null, 14);
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WSM_INSTALL_FINISHED_TITLE_;
    }
}
