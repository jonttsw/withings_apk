package com.withings.wiscale2.device.hwa;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.setup.ui.l;
import com.withings.device.setup.ui.n;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.handcalibration.HandsCalibrationConversation;
import com.withings.wiscale2.device.common.handcalibration.i;
import com.withings.wiscale2.device.hwa.conversation.Hwa0102InitConversation;
import fl.o;
import fl.p;
import kotlin.jvm.internal.u;
import vi.s;
import xp.g;
import yc0.e;
import yc0.f;
import yi.d;
/* loaded from: classes5.dex */
public class Hwa0102InstallSetup implements Setup, Setup.WithOverview, Setup.e, Setup.WithUpgrade, Setup.f, SetupWithUser, Setup.m, Setup.k, Setup.l {
    public static final Parcelable.Creator<Hwa0102InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final DeviceModel f54147a;

    /* renamed from: b  reason: collision with root package name */
    private String f54148b;

    /* renamed from: c  reason: collision with root package name */
    private User f54149c;

    /* renamed from: d  reason: collision with root package name */
    private DevicePictures f54150d;

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<Hwa0102InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa0102InstallSetup createFromParcel(Parcel parcel) {
            return new Hwa0102InstallSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa0102InstallSetup[] newArray(int i11) {
            return new Hwa0102InstallSetup[i11];
        }
    }

    public Hwa0102InstallSetup(DeviceModel deviceModel) {
        this.f54147a = deviceModel;
        this.f54148b = deviceModel.a();
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return f.a(this.f54147a.b(), this.f54148b).f37562k;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return Integer.valueOf(yc0.a.a(this.f54147a.b(), this.f54148b).f37546a);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return f.a(this.f54147a.b(), this.f54148b).f37563l;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return f.a(this.f54147a.b(), this.f54148b).f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        return new e(setupActivity);
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
        return f.a(this.f54147a.b(), this.f54148b).f37556e;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        return null;
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
        String url;
        DevicePictures devicePictures = this.f54150d;
        if (devicePictures != null && (url = devicePictures.getUrl(1)) != null) {
            return url;
        }
        return Integer.valueOf(yc0.a.a(this.f54147a.b(), this.f54148b).f37550e);
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return f.a(this.f54147a.b(), this.f54148b).f37570s;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return f.a(this.f54147a.b(), this.f54148b).f37561j;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return f.a(this.f54147a.b(), this.f54148b).f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(f.a(this.f54147a.b(), this.f54148b).f37574w);
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
        return Integer.valueOf(yc0.a.a(this.f54147a.b(), this.f54148b).f37548c);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        String url;
        DevicePictures devicePictures = this.f54150d;
        if (devicePictures != null && (url = devicePictures.getUrl(1)) != null) {
            return url;
        }
        return Integer.valueOf(yc0.a.a(this.f54147a.b(), this.f54148b).f37551f);
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return f.a(this.f54147a.b(), this.f54148b).f37565n;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(this.f54147a.b()).I(this.f54148b);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        String url;
        DevicePictures devicePictures = this.f54150d;
        if (devicePictures != null && (url = devicePictures.getUrl(1)) != null) {
            return url;
        }
        return Integer.valueOf(yc0.a.a(this.f54147a.b(), this.f54148b).f37549d);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return f.a(this.f54147a.b(), this.f54148b).f37567p;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return Integer.valueOf(yc0.a.a(this.f54147a.b(), this.f54148b).f37547b);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        return new HandsCalibrationConversation(new i(setupConversation.M(), setupConversation.N()), true, true, this.f54148b);
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
        return f.a(this.f54147a.b(), this.f54148b).f37573v;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return f.a(this.f54147a.b(), this.f54148b).f37576y;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return f.a(this.f54147a.b(), this.f54148b).f37555d;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return 16;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        com.withings.device.setup.ui.b.b(this, setupConversation, this.f54147a.b(), 0L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return f.a(this.f54147a.b(), this.f54148b).f37559h;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return f.a(this.f54147a.b(), this.f54148b).f37566o;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
        this.f54149c = user;
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
        this.f54150d = devicePictures;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return f.a(this.f54147a.b(), this.f54148b).f37558g;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b bVar) {
        o f11 = p.f67672b.a().f(bVar);
        gq.a.a(16, this.f54147a.b());
        return f11.e0(new DeviceModel(f11.a(), null));
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        Hwa0102InitConversation hwa0102InitConversation = new Hwa0102InitConversation(this.f54149c);
        hwa0102InitConversation.L();
        return hwa0102InitConversation;
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
        this.f54148b = str;
        this.f54147a.c(str);
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        uc0.e.e(setupActivity);
        uc0.e.f(setupActivity, this.f54149c);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return f.a(this.f54147a.b(), this.f54148b).f37560i;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        n a11 = f.a(this.f54147a.b(), this.f54148b);
        String string = context.getString(a11.f37575x);
        return HMWebActivity.f35395c.c(context, context.getString(a11.f37576y), string);
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return C1987R.string._HWA01__s_ALREADY_ASSIGNED_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return f.a(this.f54147a.b(), this.f54148b).f37552a;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Object u() {
        String url;
        DevicePictures devicePictures = this.f54150d;
        if (devicePictures != null && (url = devicePictures.getUrl(1)) != null) {
            return url;
        }
        return Integer.valueOf(yc0.a.a(this.f54147a.b(), this.f54148b).f37549d);
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return f.a(this.f54147a.b(), this.f54148b).f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return p.f67672b.a().d(this.f54147a.b()).w();
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
        parcel.writeParcelable(this.f54147a, i11);
        parcel.writeParcelable(this.f54149c, i11);
        parcel.writeString(this.f54148b);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        wi.a aVar;
        u.j(context, "context");
        Object systemService = context.getSystemService("location");
        u.h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        ui.d dVar = new ui.d(context, (LocationManager) systemService, 0);
        aVar = wi.a.f105219d;
        if (aVar == null) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            aVar = new wi.a(applicationContext);
            wi.a.f105219d = aVar;
        }
        return new s(context, aVar, dVar);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return f.a(this.f54147a.b(), this.f54148b).f37553b;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return f.a(this.f54147a.b(), this.f54148b).f37568q;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return f.a(this.f54147a.b(), this.f54148b).f37564m;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return f.a(this.f54147a.b(), this.f54148b).f37571t;
    }

    Hwa0102InstallSetup(Parcel parcel) {
        this.f54147a = (DeviceModel) parcel.readParcelable(DeviceModel.class.getClassLoader());
        this.f54149c = (User) parcel.readParcelable(User.class.getClassLoader());
        this.f54148b = parcel.readString();
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
