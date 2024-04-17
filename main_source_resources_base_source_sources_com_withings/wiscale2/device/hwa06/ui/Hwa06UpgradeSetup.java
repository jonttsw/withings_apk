package com.withings.wiscale2.device.hwa06.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa06.conversation.Hwa06SyncConversation;
import kotlin.Metadata;
/* compiled from: Hwa06UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/hwa06/ui/Hwa06UpgradeSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa06UpgradeSetup implements Setup, Setup.WithUpgrade {
    public static final Parcelable.Creator<Hwa06UpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f54332a = 90;

    /* renamed from: b  reason: collision with root package name */
    private DevicePictures f54333b;

    /* compiled from: Hwa06UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Hwa06UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa06UpgradeSetup createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.u.j(parcel, "parcel");
            parcel.readInt();
            return new Hwa06UpgradeSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa06UpgradeSetup[] newArray(int i11) {
            return new Hwa06UpgradeSetup[i11];
        }
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.hwa06Setup_firmwareCheckingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.hwa06Setup_firmwareDownloadTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.hwa06Setup_firmwareUpgradeSuccessMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final xp.g J0(SetupActivity setupActivity) {
        kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
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
        return C1987R.string.hwa06Setup_instructionsMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        kotlin.jvm.internal.u.j(setupConversation, "setupConversation");
        return new Hwa06SyncConversation(31, null);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final Object N2() {
        String url;
        DevicePictures devicePictures = this.f54333b;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return 2131232839;
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.hwa06Setup_activatingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.hwa06Setup_firmwareCheckingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.hwa06Setup_searchingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return C1987R.string.hwa06Setup_detectingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        kotlin.jvm.internal.u.j(setupConversation, "setupConversation");
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa06.ui.Hwa06UpgradeSetup$getInitializingConversation$1
            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() {
                Hwa06UpgradeSetup.this.f54333b = kn.e.c().f(x().g()).getPictures();
            }
        };
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        String url;
        DevicePictures devicePictures = this.f54333b;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return 2131232839;
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        String url;
        DevicePictures devicePictures = this.f54333b;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return 2131232839;
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.hwa06Setup_firmwareUpgradeTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131232839;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.hwa06Setup_rebootingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131232840;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        kotlin.jvm.internal.u.j(setupConversation, "setupConversation");
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
        return C1987R.string.hwa06Setup_detectingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.hwa06Setup_instructionsTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        kotlin.jvm.internal.u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.hwa06Setup_detectedTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.hwa06Setup_firmwareUpgradeMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.hwa06Setup_searchingMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.hwa06Setup_detectedMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.hwa06Setup_activatingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return fl.p.f67672b.a().d(this.f54332a).w();
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.u.j(out, "out");
        out.writeInt(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final yi.d x(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.hwa06Setup_rebootingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.hwa06Setup_firmwareDownloadMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.hwa06Setup_firmwareUpgradeSuccessTitle;
    }
}
