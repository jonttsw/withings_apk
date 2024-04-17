package com.withings.wiscale2.device.hwa11.ui;

import ah.o;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.common.device.conversation.FeatureTagsConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenGetConversation;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenSetConversation;
import com.withings.wiscale2.device.hwa09.conversation.Hwa0910SyncConversation;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.zendesk.ui.HelpCenterActivity;
import ej0.b;
import fl.p;
import java.util.List;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import m70.i;
import nm0.g;
import nm0.h;
import nm0.y;
import vf.c;
import yi.d;
import ym0.q;
/* compiled from: Hwa11UpgradeSetup.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/hwa11/ui/Hwa11UpgradeSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$WithBatteryCheck;", "Lcom/withings/devicesetup/Setup$l;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa11UpgradeSetup implements Setup, Setup.WithUpgrade, Setup.WithBatteryCheck, Setup.l {
    public static final Parcelable.Creator<Hwa11UpgradeSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private DevicePictures f54626a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f54627b;

    /* renamed from: c  reason: collision with root package name */
    private final g f54628c = h.b(b.f54629a);

    /* compiled from: Hwa11UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Hwa11UpgradeSetup> {
        @Override // android.os.Parcelable.Creator
        public final Hwa11UpgradeSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Hwa11UpgradeSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Hwa11UpgradeSetup[] newArray(int i11) {
            return new Hwa11UpgradeSetup[i11];
        }
    }

    /* compiled from: Hwa11UpgradeSetup.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54629a = new w(0);

        @Override // ym0.a
        public final e invoke() {
            return e.c();
        }
    }

    public static final e a(Hwa11UpgradeSetup hwa11UpgradeSetup) {
        return (e) hwa11UpgradeSetup.f54628c.getValue();
    }

    private final Object g() {
        String url;
        DevicePictures devicePictures = this.f54626a;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return 2131231513;
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.hwa11Setup_firmwareCheckingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int G0() {
        return C1987R.string.hwa11Setup_batteryLowMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.hwa11Setup_firmwareDownloadTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string.hwa09Setup_firmwareUpgradeSuccessMessage;
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
        return C1987R.string.hwa09Setup_instructionsMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa11.ui.Hwa11UpgradeSetup$getPreUpgradeConversation$1

            /* compiled from: Hwa11UpgradeSetup.kt */
            /* loaded from: classes5.dex */
            static final class a extends w implements q<Integer, long[], List<? extends ImageMetadata>, y> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Hwa11UpgradeSetup f54633a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Hwa11UpgradeSetup hwa11UpgradeSetup) {
                    super(3);
                    this.f54633a = hwa11UpgradeSetup;
                }

                @Override // ym0.q
                public final y invoke(Integer num, long[] jArr, List<? extends ImageMetadata> list) {
                    num.intValue();
                    long[] screens = jArr;
                    u.j(screens, "screens");
                    u.j(list, "<anonymous parameter 2>");
                    this.f54633a.f54627b = screens;
                    return y.f85009a;
                }
            }

            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() {
                c cVar;
                Hwa11UpgradeSetup hwa11UpgradeSetup = Hwa11UpgradeSetup.this;
                e a11 = Hwa11UpgradeSetup.a(hwa11UpgradeSetup);
                u.i(a11, "access$getDeviceManager(...)");
                b e11 = b.e();
                u.i(e11, "get(...)");
                i b10 = i.b();
                u.i(b10, "get(...)");
                cVar = c.f103617d;
                if (cVar != null) {
                    WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
                    u.i(workoutCategoryManager, "get(...)");
                    p a12 = p.f67672b.a();
                    oi0.b h11 = oi0.b.h();
                    u.i(h11, "get(...)");
                    E(new Hwa0910SyncConversation(null, a11, e11, b10, cVar, workoutCategoryManager, a12, h11, null, 16128));
                    E(new WorkoutScreenGetConversation(new a(hwa11UpgradeSetup)));
                    return;
                }
                throw new IllegalArgumentException("You must call init before".toString());
            }
        };
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final Object N2() {
        return g();
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final boolean O1(long j5, SetupConversation setupConversation) {
        return true;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.hwa09Setup_activatingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.hwa11Setup_firmwareCheckingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string.hwa11Setup_searchingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return C1987R.string.hwa11Setup_detectingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int T() {
        return 1;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa11.ui.Hwa11UpgradeSetup$getInitializingConversation$1
            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() {
                Hwa11UpgradeSetup hwa11UpgradeSetup = Hwa11UpgradeSetup.this;
                Device f11 = Hwa11UpgradeSetup.a(hwa11UpgradeSetup).f(x().g());
                hwa11UpgradeSetup.f54626a = f11.getPictures();
                f11.getColor();
            }
        };
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return g();
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return 2131231515;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.hwa11Setup_firmwareUpgradeTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(95).I(null);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return g();
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.hwa11Setup_rebootingTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 2131231513;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa11.ui.Hwa11UpgradeSetup$getPostUpgradeConversation$1
            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() {
                long[] jArr;
                boolean z5;
                jArr = Hwa11UpgradeSetup.this.f54627b;
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
                Context r7 = r();
                u.i(r7, "getContext(...)");
                Context applicationContext = r7.getApplicationContext();
                u.i(applicationContext, "getApplicationContext(...)");
                FeatureTagsConversation.a aVar = (FeatureTagsConversation.a) o.c(applicationContext, FeatureTagsConversation.a.class);
                E(new FeatureTagsConversation(aVar.a(), aVar.g()));
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
        return C1987R.string.hwa11Setup_detectingTitle;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string.hwa11Setup_searchingTimeoutMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string.hwa09Setup_instructionsTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int h2() {
        return C1987R.string.hwa09_howToRecharge;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.hwa11Setup_detectedTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.hwa11Setup_firmwareUpgradeMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.hwa09Setup_searchingMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.hwa09Setup_detectedMessage_empty;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        u.j(context, "context");
        return HelpCenterActivity.Companion.createIntent$default(HelpCenterActivity.Companion, context, null, 360009931838L, 2, null);
    }

    @Override // com.withings.devicesetup.Setup.l
    public final /* bridge */ /* synthetic */ Object u() {
        return 2131231516;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.hwa11Setup_activatingTitle;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final int v2() {
        return C1987R.string.hwa11Setup_batteryLowTitle;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 95);
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
        String string = context.getString(C1987R.string.hwa11_howToRecharge_url);
        u.i(string, "getString(...)");
        return aVar.c(context, "", string);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.hwa11Setup_rebootingMessage;
    }

    @Override // com.withings.devicesetup.Setup.WithBatteryCheck
    public final /* bridge */ /* synthetic */ Integer y1() {
        return 2131232533;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.hwa11Setup_firmwareDownloadMessage;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.hwa11Setup_firmwareUpgradeSuccessTitle;
    }
}
