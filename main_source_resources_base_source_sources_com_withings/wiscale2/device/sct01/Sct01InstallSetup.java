package com.withings.wiscale2.device.sct01;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.compose.component.q5;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.common.tutorial.media.MediaTutorialActivity;
import com.withings.wiscale2.device.sct01.conversation.SctSetupInitConversation;
import com.withings.wiscale2.device.sct01.tutorial.data.Sct01MeasurementTutorial;
import de0.q;
import fl.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import l70.v;
import l70.w;
import nm0.g;
import nm0.h;
import nm0.j;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: Sct01InstallSetup.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/device/sct01/Sct01InstallSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$f;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$m;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Sct01InstallSetup implements Setup, Setup.WithOverview, Setup.e, Setup.WithUpgrade, Setup.f, Setup.j, Setup.m {
    public static final Parcelable.Creator<Sct01InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final g f54763a = h.b(e.f54771a);

    /* renamed from: b  reason: collision with root package name */
    private final g f54764b = h.b(b.f54766a);

    /* renamed from: c  reason: collision with root package name */
    private DevicePictures f54765c;

    /* compiled from: Sct01InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Sct01InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Sct01InstallSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Sct01InstallSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Sct01InstallSetup[] newArray(int i11) {
            return new Sct01InstallSetup[i11];
        }
    }

    /* compiled from: Sct01InstallSetup.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54766a = new w(0);

        /* JADX WARN: Type inference failed for: r1v0, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.a
        public final Integer invoke() {
            Object runBlocking$default;
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new i(2, null), 1, null);
            return Integer.valueOf(new de0.a(((Number) runBlocking$default).intValue()).a());
        }
    }

    /* compiled from: Sct01InstallSetup.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.sct01.Sct01InstallSetup$onSetupFinished$1", f = "Sct01InstallSetup.kt", l = {192}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54767a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SetupActivity f54768b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SetupActivity setupActivity, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f54768b = setupActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f54768b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f54767a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                l70.w a11 = w.a.a();
                this.f54767a = 1;
                obj = FlowKt.first(a11.get(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            int d11 = ((v) obj).d();
            MainActivity.f47950r.getClass();
            SetupActivity setupActivity = this.f54768b;
            Intent a12 = MainActivity.a.a(setupActivity);
            MediaTutorialActivity.a aVar = MediaTutorialActivity.f53587l;
            Sct01MeasurementTutorial sct01MeasurementTutorial = new Sct01MeasurementTutorial(d11);
            Map j5 = s0.j(new j(Integer.valueOf((int) C1987R.id.cap), Integer.valueOf((int) C1987R.id.action_cap_to_turn_on)), new j(Integer.valueOf((int) C1987R.id.turn_on), Integer.valueOf((int) C1987R.id.action_turn_on_to_scan)), new j(Integer.valueOf((int) C1987R.id.scan), Integer.valueOf((int) C1987R.id.action_scan_to_artery)), new j(Integer.valueOf((int) C1987R.id.artery), Integer.valueOf((int) C1987R.id.action_artery_to_start_gesture)), new j(Integer.valueOf((int) C1987R.id.start_gesture), Integer.valueOf((int) C1987R.id.action_start_gesture_to_end_gesture)), new j(Integer.valueOf((int) C1987R.id.end_gesture), Integer.valueOf((int) C1987R.id.action_end_gesture_to_slide_to_assign)), new j(Integer.valueOf((int) C1987R.id.slide_to_assign), Integer.valueOf((int) C1987R.id.action_slide_to_assign_to_press_to_assign)), new j(Integer.valueOf((int) C1987R.id.press_to_assign), Integer.valueOf((int) C1987R.id.action_press_to_assign_to_results)), new j(Integer.valueOf((int) C1987R.id.results), Integer.valueOf((int) C1987R.id.action_results_to_final_tips)));
            aVar.getClass();
            Intent putExtra = new Intent(setupActivity, MediaTutorialActivity.class).putExtra("EXTRA_NAVIGATION_GRAPH", C1987R.navigation.sct01_measurement_tutorial_nav_graph).putExtra("EXTRA_NAVIGATION_ACTION_MAP", (Serializable) j5).putExtra("EXTRA_START_DESTINATION", -1).putExtra("EXTRA_TUTORIAL", sct01MeasurementTutorial).putExtra("EXTRA_TUTORIAL_ID", -1).putExtra("EXTRA_ANALYTICS_FLOW_NAME", (String) null);
            u.i(putExtra, "putExtra(...)");
            h0 m11 = h0.m(setupActivity);
            m11.c(a12);
            m11.c(putExtra);
            m11.r();
            setupActivity.setResult(-1);
            setupActivity.finish();
            return y.f85009a;
        }
    }

    /* compiled from: Sct01InstallSetup.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.sct01.Sct01InstallSetup$onSetupStarted$1", f = "Sct01InstallSetup.kt", l = {ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW, ConstantsWs.MEASURE_TYPE_CYCLE_DURATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SetupActivity f54770b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SetupActivity setupActivity, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f54770b = setupActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f54770b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f54769a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                l70.w a11 = w.a.a();
                this.f54769a = 1;
                obj = FlowKt.first(a11.get(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            int d11 = ((v) obj).d();
            q5 q5Var = q5.f34614a;
            ArrayList a12 = new Sct01MeasurementTutorial(d11).a();
            this.f54769a = 2;
            if (q5Var.d(this.f54770b, a12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* compiled from: Sct01InstallSetup.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<q> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f54771a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final q invoke() {
            return new q();
        }
    }

    private final q b() {
        return (q) this.f54763a.getValue();
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return b().f37562k;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        String url;
        DevicePictures devicePictures = this.f54765c;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return Integer.valueOf(((Number) this.f54764b.getValue()).intValue());
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        return false;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return b().f37563l;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return b().f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final xp.g J0(SetupActivity setupActivity) {
        List list;
        u.j(setupActivity, "setupActivity");
        ej.w w11 = ej.w.w();
        u.i(w11, "get(...)");
        int i11 = ml.a.f82249l;
        list = ml.a.f82243f;
        return new com.withings.common.device.b(w11, setupActivity, list);
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
        return b().f37556e;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = context.getString(b().f37554c);
        u.i(string, "getString(...)");
        return HMWebActivity.a.a(aVar, context, "url", "", string, 16);
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
    public final /* bridge */ /* synthetic */ Object N2() {
        return 2131231283;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return b().f37570s;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return b().f37561j;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return b().f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return com.withings.device.setup.ui.l.a(b().f37574w);
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
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131231283;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object Z() {
        return 2131231280;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(setupActivity, null), 3, null);
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return b().f37563l;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131231283;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return b().f37567p;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        String url;
        DevicePictures devicePictures = this.f54765c;
        if (devicePictures == null || (url = devicePictures.getUrl(1)) == null) {
            return Integer.valueOf(((Number) this.f54764b.getValue()).intValue());
        }
        return url;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        return new WppDeviceConversation() { // from class: com.withings.wiscale2.device.sct01.Sct01InstallSetup$getPostUpgradeConversation$1
            @Override // com.withings.comm.remote.conversation.WppDeviceConversation
            public final void D() {
                xi.b j5 = x().j();
                u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.bluetooth.BluetoothRemoteDevice");
                ((wi.c) j5).b();
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
        return b().f37573v;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return b().f37555d;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        vf.c cVar;
        u.j(setupConversation, "setupConversation");
        cVar = vf.c.f103617d;
        if (cVar != null) {
            setupConversation.G(new uc0.a(cVar, ConstantsWs.CALLCTX_THERMO_INSTALL));
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return b().f37559h;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return b().f37564m;
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
        this.f54765c = devicePictures;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return b().f37558g;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b wppDevice) {
        u.j(wppDevice, "wppDevice");
        o f11 = fl.p.f67672b.a().f(wppDevice);
        gq.a.a(64, 70);
        Setup e02 = f11.e0(new DeviceModel(f11.a(), null));
        u.g(e02);
        return e02;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        return new SctSetupInitConversation();
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        uc0.e.e(setupActivity);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new c(setupActivity, null), 3, null);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return b().f37560i;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return b().f37552a;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return b().f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(fl.p.f67672b, 70);
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
        out.writeInt(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final yi.d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return b().f37553b;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return b().f37568q;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return b().f37564m;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return b().f37571t;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
    }
}
