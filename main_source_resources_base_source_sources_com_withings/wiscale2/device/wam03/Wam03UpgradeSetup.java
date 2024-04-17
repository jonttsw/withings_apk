package com.withings.wiscale2.device.wam03;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.conversation.NotificationInitConversation;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenGetConversation;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenSetConversation;
import com.withings.wiscale2.device.wam03.conversation.Wam03InitConversation;
import com.withings.wiscale2.device.wam03.conversation.Wam03SyncConversation;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fl.p;
import java.io.IOException;
import java.util.List;
import ke0.b;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import m70.i;
import nm0.y;
import xp.g;
import yi.d;
import ym0.q;
/* compiled from: Wam03UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wam03/Wam03UpgradeSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithBatteryCheck;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam03UpgradeSetup implements Setup, Setup.WithBatteryCheck, Setup.WithUpgrade {
    public static final Parcelable.Creator<Wam03UpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private long[] f54942a;

    /* compiled from: Wam03UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wam03UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wam03UpgradeSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Wam03UpgradeSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Wam03UpgradeSetup[] newArray(int i11) {
            return new Wam03UpgradeSetup[i11];
        }
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int G0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string._WAM03_UPGRADE_TITLE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_SUCCESS_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
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
        return C1987R.string._WAM03_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.wam03.Wam03UpgradeSetup$getPreUpgradeConversation$1

            /* compiled from: Wam03UpgradeSetup.kt */
            /* loaded from: classes5.dex */
            static final class a extends w implements q<Integer, long[], List<? extends ImageMetadata>, y> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Wam03UpgradeSetup f54946a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Wam03UpgradeSetup wam03UpgradeSetup) {
                    super(3);
                    this.f54946a = wam03UpgradeSetup;
                }

                @Override // ym0.q
                public final y invoke(Integer num, long[] jArr, List<? extends ImageMetadata> list) {
                    num.intValue();
                    long[] screens = jArr;
                    u.j(screens, "screens");
                    u.j(list, "<anonymous parameter 2>");
                    this.f54946a.f54942a = screens;
                    return y.f85009a;
                }
            }

            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() {
                E(new Wam03SyncConversation(0));
                E(new WorkoutScreenGetConversation(new a(Wam03UpgradeSetup.this)));
            }
        };
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final /* bridge */ /* synthetic */ Object N2() {
        return 2131232572;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final boolean O1(long j5, SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return true;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WAM03_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string._WAM03_UPGRADE_TITLE_CHECKING_FIRMWARE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WAM03_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return C1987R.string._WAM03_CONNECTION_MESSAGE_CONNECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131232572;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object Z() {
        return 2131232573;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string._WAM03_UPGRADE_TITLE__s_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return Integer.valueOf((int) C1987R.drawable.setup_wam03_detected);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string._WAM03_UPGRADE_TITLE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return Integer.valueOf((int) C1987R.drawable.setup_wam03_push_the_button);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(final SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.wam03.Wam03UpgradeSetup$getPostUpgradeConversation$1
            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
                long[] jArr;
                User user;
                boolean z5;
                jArr = Wam03UpgradeSetup.this.f54942a;
                Wam03InitConversation wam03InitConversation = null;
                if (jArr != null) {
                    if (jArr.length == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!(!z5)) {
                        jArr = null;
                    }
                    if (jArr != null) {
                        WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
                        u.i(workoutCategoryManager, "get(...)");
                        E(new WorkoutScreenSetConversation(workoutCategoryManager, jArr, null));
                    }
                }
                E(new NotificationInitConversation((b) p.f67672b.a().d(58)));
                Long userId = e.c().f(setupConversation.x().g()).getUserId();
                if (userId != null) {
                    user = i.b().i(userId.longValue());
                } else {
                    user = null;
                }
                if (user != null) {
                    wam03InitConversation = new Wam03InitConversation(user);
                    wam03InitConversation.L();
                }
                E(wam03InitConversation);
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
        return C1987R.string._WAM03_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int h2() {
        return C1987R.string.ANDROID_HWA03_HOW_TO_RECHARGE;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WAM03_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_UPGRADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WAM03_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WAM03_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WAM03_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int v2() {
        return C1987R.string._WAM03_UPGRADE_TITLE_BATTERY_LOW_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 58);
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

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final Intent x2(Context context) {
        u.j(context, "context");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = context.getString(C1987R.string.wam03_lowBatteryUrl);
        u.i(string, "getString(...)");
        return aVar.c(context, "", string);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_REBOOTING_;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final /* bridge */ /* synthetic */ Integer y1() {
        return 2131232301;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string._WAM03_UPGRADE_MESSAGE_DOWNLOADING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WAM03_UPGRADE_TITLE_SUCCESS_;
    }
}
