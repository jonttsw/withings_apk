package com.withings.wiscale2.device.wsm02.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.wsm02.conversation.Wsm02PostAssociationConversation;
import ej.w;
import fl.o;
import java.util.List;
import jl.c;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import qm0.d;
import xp.g;
import ym0.p;
/* compiled from: Wsm02InstallSetup.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/device/wsm02/ui/Wsm02InstallSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/device/setup/ui/SetupWithUser;", "Lcom/withings/devicesetup/Setup$i;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$o;", "Lcom/withings/devicesetup/Setup$l;", "Lcom/withings/devicesetup/Setup$m;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wsm02InstallSetup implements Setup, Setup.WithOverview, SetupWithUser, Setup.i, Setup.j, Setup.e, Setup.o, Setup.l, Setup.m {
    public static final Parcelable.Creator<Wsm02InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f55999a;

    /* renamed from: b  reason: collision with root package name */
    private User f56000b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56001c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56002d;

    /* compiled from: Wsm02InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wsm02InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wsm02InstallSetup createFromParcel(Parcel source) {
            u.j(source, "source");
            return new Wsm02InstallSetup(source);
        }

        @Override // android.os.Parcelable.Creator
        public final Wsm02InstallSetup[] newArray(int i11) {
            return new Wsm02InstallSetup[i11];
        }
    }

    /* compiled from: Wsm02InstallSetup.kt */
    @e(c = "com.withings.wiscale2.device.wsm02.ui.Wsm02InstallSetup$onSetupFinished$1", f = "Wsm02InstallSetup.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56003a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f56004b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SetupActivity f56006d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Device f56007e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h0 f56008f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Wsm02InstallSetup.kt */
        @e(c = "com.withings.wiscale2.device.wsm02.ui.Wsm02InstallSetup$onSetupFinished$1$1", f = "Wsm02InstallSetup.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f56009a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SetupActivity f56010b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, SetupActivity setupActivity, d<? super a> dVar) {
                super(2, dVar);
                this.f56009a = h0Var;
                this.f56010b = setupActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                return new a(this.f56009a, this.f56010b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                this.f56009a.r();
                SetupActivity setupActivity = this.f56010b;
                setupActivity.setResult(-1);
                setupActivity.finish();
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SetupActivity setupActivity, Device device, h0 h0Var, d<? super b> dVar) {
            super(2, dVar);
            this.f56006d = setupActivity;
            this.f56007e = device;
            this.f56008f = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f56006d, this.f56007e, this.f56008f, dVar);
            bVar.f56004b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56003a;
            SetupActivity setupActivity = this.f56006d;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                    coroutineScope = (CoroutineScope) this.f56004b;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f56004b;
                Device device = this.f56007e;
                u.i(device, "$device");
                this.f56004b = coroutineScope2;
                this.f56003a = 1;
                Object o11 = Wsm02InstallSetup.o(Wsm02InstallSetup.this, setupActivity, device, this);
                if (o11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coroutineScope = coroutineScope2;
                obj = o11;
            }
            h0 h0Var = this.f56008f;
            h0Var.c((Intent) obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new a(h0Var, setupActivity, null), 2, null);
            return y.f85009a;
        }
    }

    public Wsm02InstallSetup() {
        this((String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(com.withings.wiscale2.device.wsm02.ui.Wsm02InstallSetup r10, com.withings.devicesetup.ui.SetupActivity r11, com.withings.device.Device r12, qm0.d r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof com.withings.wiscale2.device.wsm02.ui.a
            if (r0 == 0) goto L16
            r0 = r13
            com.withings.wiscale2.device.wsm02.ui.a r0 = (com.withings.wiscale2.device.wsm02.ui.a) r0
            int r1 = r0.f56016f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56016f = r1
            goto L1b
        L16:
            com.withings.wiscale2.device.wsm02.ui.a r0 = new com.withings.wiscale2.device.wsm02.ui.a
            r0.<init>(r10, r13)
        L1b:
            java.lang.Object r13 = r0.f56014d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56016f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.withings.device.Device r12 = r0.f56013c
            com.withings.devicesetup.ui.SetupActivity r11 = r0.f56012b
            com.withings.wiscale2.device.wsm02.ui.Wsm02InstallSetup r10 = r0.f56011a
            nm0.l.b(r13)
        L2f:
            r5 = r11
            r6 = r12
            goto L4c
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            nm0.l.b(r13)
            r0.f56011a = r10
            r0.f56012b = r11
            r0.f56013c = r12
            r0.f56016f = r3
            java.lang.Object r13 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.e.a(r12, r0)
            if (r13 != r1) goto L2f
            goto L9e
        L4c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            if (r11 == 0) goto L60
            com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity$a r4 = com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity.f53060m
            r8 = 0
            r9 = 8
            r7 = 1
            android.content.Intent r10 = com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity.a.a(r4, r5, r6, r7, r8, r9)
        L5e:
            r1 = r10
            goto L9e
        L60:
            r10.getClass()
            com.withings.devicesetup.conversation.SetupConversation r10 = r5.S3()
            zp.a r10 = r10.N()
            com.withings.devicesetup.ui.SetupStateListener r10 = r10.y()
            java.lang.String r11 = "null cannot be cast to non-null type com.withings.common.device.reporting.InstallStateReporter"
            kotlin.jvm.internal.u.h(r10, r11)
            com.withings.common.device.reporting.InstallStateReporter r10 = (com.withings.common.device.reporting.InstallStateReporter) r10
            com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity$a r11 = com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity.f53518k
            r11.getClass()
            java.lang.String r11 = "device"
            kotlin.jvm.internal.u.j(r6, r11)
            r11 = 0
            r12 = 0
            android.content.Intent r11 = com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity.a.a(r5, r12, r12, r11)
            java.lang.String r12 = "EXTRA_KEY_DEVICE"
            android.content.Intent r11 = r11.putExtra(r12, r6)
            java.lang.String r12 = "EXTRA_KEY_STATE_LISTENER"
            android.content.Intent r10 = r11.putExtra(r12, r10)
            java.lang.String r11 = "EXTRA_KEY_AFTER_INSTALL"
            android.content.Intent r10 = r10.putExtra(r11, r3)
            java.lang.String r11 = "putExtra(...)"
            kotlin.jvm.internal.u.i(r10, r11)
            goto L5e
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.wsm02.ui.Wsm02InstallSetup.o(com.withings.wiscale2.device.wsm02.ui.Wsm02InstallSetup, com.withings.devicesetup.ui.SetupActivity, com.withings.device.Device, qm0.d):java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final /* bridge */ /* synthetic */ Object E() {
        return 2131232644;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        u.j(context, "context");
        if (u.e(this.f55999a, ConstantsWs.DEVICE_COLOR_ANALYZER) && !uc0.e.d(C1987R.string._WSM02_ANALYZER_OVERVIEW_LEARN_MORE_URL_, context)) {
            return false;
        }
        return true;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WSM02_CALIBRATION_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        w w11 = w.w();
        u.i(w11, "get(...)");
        return new com.withings.common.device.b(w11, setupActivity, 63);
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
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        int i11;
        u.j(context, "context");
        if (u.e(this.f55999a, ConstantsWs.DEVICE_COLOR_ANALYZER)) {
            i11 = C1987R.string._WSM02_ANALYZER_OVERVIEW_LEARN_MORE_URL_;
        } else {
            i11 = C1987R.string._WSM02_OVERVIEW_LEARN_MORE_URL_;
        }
        return uc0.e.c(i11, context);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WSM02_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WSM02_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return com.withings.device.setup.ui.l.a(C1987R.string._WSM02_CONNECTION_MESSAGE_CONNECTING_);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131232644;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object Z() {
        return 2131232643;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return fl.p.f67672b.a().d(63).I(this.f55999a);
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int c() {
        return 4;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131232644;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final List<Integer> d() {
        return x.W(Integer.valueOf((int) C1987R.string.WSM02installTuto_option1A), null, null, null);
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e0() {
        return C1987R.string._NEXT_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string._WSM02_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string._WSM02_CONNECTION_HELPER_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int g(int i11, boolean z5) {
        if (i11 == 0 && z5) {
            return 2;
        }
        return i11 + 1;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return this.f56001c;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.V(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        return new DebugDumpConversation(a11, new jl.b(c11), null, new c(0L));
    }

    @Override // com.withings.devicesetup.Setup.i
    public final Object[] i() {
        return new Object[]{2131232961, 2131232965, 2131232963, 2131232964};
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        com.withings.device.setup.ui.b.b(this, setupConversation, 63, 0L);
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WSM02_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] k() {
        return new int[]{C1987R.string.WSM02installTuto_title1A, C1987R.string.WSM02installTuto_title1B, C1987R.string.WSM02installTuto_title2, C1987R.string.WSM02installTuto_title3};
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] l() {
        return new int[]{C1987R.string.WSM02installTuto_description1A, C1987R.string.WSM02installTuto_description1B, C1987R.string.WSM02installTuto_description2, C1987R.string.WSM02installTuto_description3};
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
        this.f56000b = user;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WSM02_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b wppDevice) {
        u.j(wppDevice, "wppDevice");
        o f11 = fl.p.f67672b.a().f(wppDevice);
        gq.a.a(this.f56001c, 63);
        Setup e02 = f11.e0(new DeviceModel(f11.a(), null));
        u.g(e02);
        return e02;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        User user = this.f56000b;
        if (user != null) {
            return new Wsm02PostAssociationConversation(user);
        }
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        Device f11 = kn.e.c().f(setupActivity.U3());
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(setupActivity, f11, m11, null), 3, null);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WSM02_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String b10 = com.google.android.gms.internal.p002firebaseauthapi.a.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, C1987R.string._WSM02_CONNECTION_HELPER_LINK_SEARCHING_, "getString(...)");
        String string = context.getString(C1987R.string._HELP_CENTER_);
        u.i(string, "getString(...)");
        return HMWebActivity.f35395c.c(context, string, b10);
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return this.f56002d;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        if (u.e(this.f55999a, ConstantsWs.DEVICE_COLOR_ANALYZER)) {
            return C1987R.string._WSM02_ANALYZER_OVERVIEW_TITLE_;
        }
        return C1987R.string._WSM02_OVERVIEW_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final /* bridge */ /* synthetic */ Object u() {
        return 2131232644;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WSM02_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(fl.p.f67672b, 63);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        if (androidx.core.os.a.b()) {
            return 3;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        u.j(dest, "dest");
        dest.writeParcelable(this.f56000b, i11);
        dest.writeString(this.f55999a);
    }

    @Override // com.withings.devicesetup.Setup
    public final yi.d x(Context context) {
        u.j(context, "context");
        return uc0.e.b(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        if (u.e(this.f55999a, ConstantsWs.DEVICE_COLOR_ANALYZER)) {
            return C1987R.string._WSM02_ANALYZER_OVERVIEW_MESSAGE_;
        }
        return C1987R.string._WSM02_OVERVIEW_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WSM02_CALIBRATION_TITLE_;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Wsm02InstallSetup(Parcel source) {
        this((String) null);
        u.j(source, "source");
        this.f56000b = (User) source.readParcelable(User.class.getClassLoader());
        this.f55999a = source.readString();
    }

    public Wsm02InstallSetup(String str) {
        this.f55999a = str;
        this.f56001c = 32;
        this.f56002d = C1987R.string.wsm02InstallSetup_alreadyAssignedTitle_formatted;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
