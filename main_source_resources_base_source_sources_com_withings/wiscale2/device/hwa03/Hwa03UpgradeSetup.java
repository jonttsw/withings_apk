package com.withings.wiscale2.device.hwa03;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.conversation.NotificationInitConversation;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenGetConversation;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenSetConversation;
import com.withings.wiscale2.device.hwa03.conversation.Hwa03InitConversation;
import com.withings.wiscale2.device.hwa03.conversation.Hwa03SyncConversation;
import com.withings.workout.category.model.WorkoutCategoryManager;
import ej.w;
import fl.o;
import fl.p;
import gl.i0;
import gl.t;
import java.io.IOException;
import kn.e;
import m70.i;
import xp.g;
import yi.d;
/* loaded from: classes5.dex */
public class Hwa03UpgradeSetup implements Setup, Setup.WithBatteryCheck, Setup.WithUpgrade {
    public static final Parcelable.Creator<Hwa03UpgradeSetup> CREATOR = new Object();

    /* renamed from: a */
    private String f54206a;

    /* renamed from: b */
    private long[] f54207b;

    /* renamed from: com.withings.wiscale2.device.hwa03.Hwa03UpgradeSetup$1 */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 extends WppDeviceConversation {
        AnonymousClass1() {
            Hwa03UpgradeSetup.this = r1;
        }

        @Override // com.withings.comm.remote.conversation.WppDeviceConversation
        public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
            E(new WorkoutScreenGetConversation(new b(this)));
        }
    }

    /* loaded from: classes5.dex */
    final class a implements Parcelable.Creator<Hwa03UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa03UpgradeSetup createFromParcel(Parcel parcel) {
            return new Hwa03UpgradeSetup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa03UpgradeSetup[] newArray(int i11) {
            return new Hwa03UpgradeSetup[i11];
        }
    }

    public Hwa03UpgradeSetup(Device device) {
        this.f54206a = device.getColor();
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int G0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._HWA03_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_SUCCESS_;
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
        return C1987R.string._HWA03_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        return new Hwa03SyncConversation(30, null);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final Object N2() {
        return 2131232554;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final boolean O1(long j5, SetupConversation setupConversation) {
        if (j5 > 1170) {
            return true;
        }
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._HWA03_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._HWA03_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._HWA03_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string._HWA03_CONNECTION_MESSAGE_CONNECTING_);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return new AnonymousClass1();
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return 2131232555;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return 2131232554;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string._HWA03_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return 2131232554;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._HWA03_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232557;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(final SetupConversation setupConversation) {
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa03.Hwa03UpgradeSetup.2
            {
                Hwa03UpgradeSetup.this = this;
            }

            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
                User i11 = i.b().i(e.c().f(setupConversation.x().g()).getUserId().longValue());
                Hwa03UpgradeSetup hwa03UpgradeSetup = Hwa03UpgradeSetup.this;
                if (hwa03UpgradeSetup.f54207b != null && hwa03UpgradeSetup.f54207b.length > 0) {
                    E(new WorkoutScreenSetConversation(WorkoutCategoryManager.get(), hwa03UpgradeSetup.f54207b, null));
                }
                Hwa03InitConversation hwa03InitConversation = new Hwa03InitConversation(i11);
                hwa03InitConversation.M();
                E(hwa03InitConversation);
            }
        };
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
        return C1987R.string._HWA03_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._HWA03_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int h2() {
        return C1987R.string.ANDROID_HWA03_HOW_TO_RECHARGE;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._HWA03_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._HWA03_CONNECTION_MESSAGE_SEARCHING_;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        setupActivity.finish();
        cj.b x11 = setupActivity.S3().x();
        o f11 = p.f67672b.a().f(x11);
        if (f11 instanceof t) {
            w.w().O(x11, new BondingMigrationConversation((t) f11, new Object()), BondingMigrationConversation.class);
        }
        if (f11 instanceof i0) {
            w.w().O(x11, new NotificationInitConversation((i0) f11, e.c()), NotificationInitConversation.class);
        }
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._HWA03_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._HWA03_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int v2() {
        return C1987R.string._HWA03_UPGRADE_TITLE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 55);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f54206a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final Intent x2(Context context) {
        return HMWebActivity.f35395c.c(context, "", context.getString(C1987R.string.ANDROID_HWA03_HOW_TO_RECHARGE_URL));
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final Integer y1() {
        return 2131232301;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._HWA03_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._HWA03_UPGRADE_TITLE_SUCCESS_;
    }

    Hwa03UpgradeSetup(Parcel parcel) {
        this.f54206a = parcel.readString();
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
