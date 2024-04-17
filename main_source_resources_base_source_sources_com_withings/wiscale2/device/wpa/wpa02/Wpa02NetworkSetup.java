package com.withings.wiscale2.device.wpa.wpa02;

import aj.b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import androidx.compose.material3.k4;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import fl.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import xp.g;
import yi.d;
/* compiled from: Wpa02NetworkSetup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/Wpa02NetworkSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$j;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02NetworkSetup implements Setup, Setup.j {
    public static final Parcelable.Creator<Wpa02NetworkSetup> CREATOR = new Object();

    /* compiled from: Wpa02NetworkSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpa02NetworkSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wpa02NetworkSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Wpa02NetworkSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Wpa02NetworkSetup[] newArray(int i11) {
            return new Wpa02NetworkSetup[i11];
        }
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
        return C1987R.string.wpa01Setup_instructionsMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.wpa01Setup_progressMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.wpa01Setup_searchingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return C1987R.string.wpa01Setup_connectionMessage;
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

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131231303;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131231303;
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
        return C1987R.string.wpa01Setup_connectionTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.wpa01Setup_instructionsTitle;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.V(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.wpa01Setup_detectedTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.wpa01Setup_searchingMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        k4.e(setupActivity, "setupActivity", -1);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.wpa01Setup_detectedMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wpa01Setup_progressTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final b w() {
        return e.b(p.f67672b, 102);
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
        return C1987R.string.wpa_installation_ready_title;
    }
}
