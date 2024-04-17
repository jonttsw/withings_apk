package com.withings.wiscale2.device.scale.wbs13;

import aj.b;
import android.content.Context;
import android.os.Build;
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
/* compiled from: Wbs13NetworkSetup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/scale/wbs13/Wbs13NetworkSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$j;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wbs13NetworkSetup implements Setup, Setup.j {
    public static final Parcelable.Creator<Wbs13NetworkSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54756a;

    /* compiled from: Wbs13NetworkSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wbs13NetworkSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wbs13NetworkSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wbs13NetworkSetup(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Wbs13NetworkSetup[] newArray(int i11) {
            return new Wbs13NetworkSetup[i11];
        }
    }

    public Wbs13NetworkSetup(String str) {
        this.f54756a = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.wbs13_install_ready_description;
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
        return C1987R.string.scale_connection_message_instructions;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WBS05_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.scale_connection_title_searching;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1987R.string.instal_android_popupWarning;
        }
        return C1987R.string._WBS05_CONNECTION_MESSAGE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131232875;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_BLACK) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_GREY) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = zd0.a.C1961a.f110477a;
     */
    @Override // com.withings.devicesetup.Setup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f54756a
            if (r0 == 0) goto L38
            int r1 = r0.hashCode()
            r2 = 3181279(0x308adf, float:4.457921E-39)
            if (r1 == r2) goto L2d
            r2 = 93818879(0x5978fff, float:1.4252868E-35)
            if (r1 == r2) goto L24
            r2 = 113101865(0x6bdcc29, float:7.1393885E-35)
            if (r1 == r2) goto L18
            goto L38
        L18:
            java.lang.String r1 = "white"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L38
        L21:
            zd0.a$c r0 = zd0.a.c.f110479a
            goto L3a
        L24:
            java.lang.String r1 = "black"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L38
        L2d:
            java.lang.String r1 = "grey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
        L35:
            zd0.a$a r0 = zd0.a.C1961a.f110477a
            goto L3a
        L38:
            zd0.a$b r0 = zd0.a.b.f110478a
        L3a:
            int r0 = r0.b()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs13.Wbs13NetworkSetup.Z():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_BLACK) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r0.equals(com.withings.library.authentication.api.ConstantsWs.DEVICE_COLOR_GREY) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = zd0.a.C1961a.f110477a;
     */
    @Override // com.withings.devicesetup.Setup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f54756a
            if (r0 == 0) goto L38
            int r1 = r0.hashCode()
            r2 = 3181279(0x308adf, float:4.457921E-39)
            if (r1 == r2) goto L2d
            r2 = 93818879(0x5978fff, float:1.4252868E-35)
            if (r1 == r2) goto L24
            r2 = 113101865(0x6bdcc29, float:7.1393885E-35)
            if (r1 == r2) goto L18
            goto L38
        L18:
            java.lang.String r1 = "white"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L38
        L21:
            zd0.a$c r0 = zd0.a.c.f110479a
            goto L3a
        L24:
            java.lang.String r1 = "black"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L38
        L2d:
            java.lang.String r1 = "grey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
        L35:
            zd0.a$a r0 = zd0.a.C1961a.f110477a
            goto L3a
        L38:
            zd0.a$b r0 = zd0.a.b.f110478a
        L3a:
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs13.Wbs13NetworkSetup.c1():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131232877;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e0() {
        return C1987R.string.wbs13_install_setUp_button;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string.scale_connection_title_connecting;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.scale_connection_title_instructions;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.wbs13_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.scale_connection_message_searching;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        k4.e(setupActivity, "setupActivity", -1);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.scale_connection_message_detected;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wifiConfiguring_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final b w() {
        return e.b(p.f67672b, 16);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f54756a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.wbs13_install_ready_title;
    }
}
