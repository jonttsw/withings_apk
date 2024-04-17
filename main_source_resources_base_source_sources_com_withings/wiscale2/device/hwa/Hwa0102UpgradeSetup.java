package com.withings.wiscale2.device.hwa;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa.conversation.Hwa0102InitConversation;
import fl.p;
import java.io.IOException;
import kn.e;
import m70.i;
import xp.g;
import yc0.f;
import yi.d;
/* loaded from: classes5.dex */
public class Hwa0102UpgradeSetup implements Setup, Setup.WithUpgrade {
    public static final Parcelable.Creator<Hwa0102UpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private DeviceModel f54151a;

    /* renamed from: b  reason: collision with root package name */
    private String f54152b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54153c;

    /* renamed from: d  reason: collision with root package name */
    private DevicePictures f54154d;

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<Hwa0102UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa0102UpgradeSetup createFromParcel(Parcel parcel) {
            return new Hwa0102UpgradeSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa0102UpgradeSetup[] newArray(int i11) {
            return new Hwa0102UpgradeSetup[i11];
        }
    }

    public Hwa0102UpgradeSetup(DeviceModel deviceModel, boolean z5) {
        this.f54151a = deviceModel;
        this.f54152b = deviceModel.a();
        this.f54153c = z5;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return f.a(this.f54151a.b(), this.f54152b).f37562k;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return f.a(this.f54151a.b(), this.f54152b).f37563l;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return f.a(this.f54151a.b(), this.f54152b).f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
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
        return f.a(this.f54151a.b(), this.f54152b).f37556e;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        if (this.f54153c) {
            return null;
        }
        return new HwaSyncConversation(null);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final Object N2() {
        String url;
        DevicePictures devicePictures = this.f54154d;
        if (devicePictures != null && (url = devicePictures.getUrl(1)) != null) {
            return url;
        }
        return Integer.valueOf(yc0.a.a(this.f54151a.b(), this.f54152b).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return f.a(this.f54151a.b(), this.f54152b).f37570s;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return f.a(this.f54151a.b(), this.f54152b).f37561j;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return f.a(this.f54151a.b(), this.f54152b).f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(f.a(this.f54151a.b(), this.f54152b).f37574w);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa.Hwa0102UpgradeSetup.1
            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
                Hwa0102UpgradeSetup.this.f54154d = e.c().f(x().g()).getPictures();
            }
        };
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return Integer.valueOf(yc0.a.a(this.f54151a.b(), this.f54152b).f37548c);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        String url;
        DevicePictures devicePictures = this.f54154d;
        if (devicePictures != null && (url = devicePictures.getUrl(1)) != null) {
            return url;
        }
        return Integer.valueOf(yc0.a.a(this.f54151a.b(), this.f54152b).f37551f);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return f.a(this.f54151a.b(), this.f54152b).f37565n;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        String url;
        DevicePictures devicePictures = this.f54154d;
        if (devicePictures != null && (url = devicePictures.getUrl(1)) != null) {
            return url;
        }
        return Integer.valueOf(yc0.a.a(this.f54151a.b(), this.f54152b).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return f.a(this.f54151a.b(), this.f54152b).f37567p;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return Integer.valueOf(yc0.a.a(this.f54151a.b(), this.f54152b).f37547b);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        Hwa0102InitConversation hwa0102InitConversation = new Hwa0102InitConversation(i.b().i(e.c().f(setupConversation.x().g()).getUserId().longValue()));
        hwa0102InitConversation.L();
        return hwa0102InitConversation;
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
        return f.a(this.f54151a.b(), this.f54152b).f37573v;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return f.a(this.f54151a.b(), this.f54152b).f37555d;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return f.a(this.f54151a.b(), this.f54152b).f37559h;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return f.a(this.f54151a.b(), this.f54152b).f37566o;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return f.a(this.f54151a.b(), this.f54152b).f37558g;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return f.a(this.f54151a.b(), this.f54152b).f37560i;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return f.a(this.f54151a.b(), this.f54152b).f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return p.f67672b.a().d(this.f54151a.b()).w();
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f54152b);
        parcel.writeByte(this.f54153c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f54151a, i11);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return f.a(this.f54151a.b(), this.f54152b).f37568q;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return f.a(this.f54151a.b(), this.f54152b).f37564m;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return f.a(this.f54151a.b(), this.f54152b).f37571t;
    }

    Hwa0102UpgradeSetup(Parcel parcel) {
        this.f54152b = parcel.readString();
        this.f54153c = parcel.readByte() == 1;
        this.f54151a = (DeviceModel) parcel.readParcelable(DeviceModel.class.getClassLoader());
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
