package com.withings.wiscale2.device.hwa08.ui;

import a3.g;
import aj.b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.conversation.Hwa08SyncConversation;
import fl.p;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import yi.d;
/* compiled from: Hwa08UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/hwa08/ui/Hwa08UpgradeSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa08UpgradeSetup implements Setup, Setup.WithUpgrade {
    public static final Parcelable.Creator<Hwa08UpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private DevicePictures f54484a;

    /* renamed from: b  reason: collision with root package name */
    private String f54485b;

    /* compiled from: Hwa08UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Hwa08UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa08UpgradeSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Hwa08UpgradeSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa08UpgradeSetup[] newArray(int i11) {
            return new Hwa08UpgradeSetup[i11];
        }
    }

    private final Object c() {
        String url;
        DevicePictures devicePictures = this.f54484a;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return Integer.valueOf(g.p(this.f54485b));
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.hwa08Setup_firmwareCheckingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.hwa08Setup_firmwareDownloadTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.hwa08Setup_firmwareUpgradeSuccessMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final xp.g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return C1987R.string.hwa08Setup_instructionsMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new Hwa08SyncConversation(null, null, null, 1023);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final Object N2() {
        return c();
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.hwa08Setup_activatingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.hwa08Setup_firmwareCheckingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.hwa08Setup_searchingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return C1987R.string.hwa08Setup_detectingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa08.ui.Hwa08UpgradeSetup$getInitializingConversation$1
            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() {
                Device f11 = e.c().f(x().g());
                DevicePictures pictures = f11.getPictures();
                Hwa08UpgradeSetup hwa08UpgradeSetup = Hwa08UpgradeSetup.this;
                hwa08UpgradeSetup.f54484a = pictures;
                hwa08UpgradeSetup.f54485b = f11.getColor();
            }
        };
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return c();
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return c();
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.hwa08Setup_firmwareUpgradeTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return c();
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.hwa08Setup_rebootingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131232839;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
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
        return C1987R.string.hwa08Setup_detectingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.hwa08Setup_instructionsTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.hwa08Setup_detectedTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.hwa08Setup_firmwareUpgradeMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.hwa08Setup_searchingMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.hwa08Setup_detectedMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.hwa08Setup_activatingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 91);
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
        return C1987R.string.hwa08Setup_rebootingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.hwa08Setup_firmwareDownloadMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.hwa08Setup_firmwareUpgradeSuccessTitle;
    }
}
