package com.withings.wiscale2.device.scale.wbs13;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.h0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.BondPostUpgradeConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.scale.conversation.ScaleSetupInitConversation;
import fl.o;
import fl.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import m70.i;
import oi0.f;
import uc0.e;
import vf.c;
import xp.g;
import yi.d;
import ym0.l;
import zg.c;
/* compiled from: Wbs13InstallSetup.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/device/scale/wbs13/Wbs13InstallSetup;", "Lcom/withings/devicesetup/Setup$WithOverview;", "Lcom/withings/devicesetup/Setup$WithUpgrade;", "Lcom/withings/devicesetup/Setup$e;", "Lcom/withings/devicesetup/Setup$j;", "Lcom/withings/devicesetup/Setup$f;", "Lcom/withings/devicesetup/Setup$m;", "Lcom/withings/devicesetup/Setup$k;", "Lcom/withings/devicesetup/Setup$o;", "Lcom/withings/devicesetup/Setup$l;", "Lcom/withings/devicesetup/Setup$i;", "Lcom/withings/devicesetup/Setup$a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wbs13InstallSetup implements Setup.WithOverview, Setup.WithUpgrade, Setup.e, Setup.j, Setup.f, Setup.m, Setup.k, Setup.o, Setup.l, Setup.i, Setup.a {
    public static final Parcelable.Creator<Wbs13InstallSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f54754a;

    /* compiled from: Wbs13InstallSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wbs13InstallSetup> {
        @Override // android.os.Parcelable.Creator
        public final Wbs13InstallSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Wbs13InstallSetup(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Wbs13InstallSetup[] newArray(int i11) {
            return new Wbs13InstallSetup[i11];
        }
    }

    /* compiled from: Wbs13InstallSetup.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements l<oi0.b, SyncJob> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54755a = new w(1);

        @Override // ym0.l
        public final SyncJob invoke(oi0.b bVar) {
            oi0.b blockingPostSyncJob = bVar;
            u.j(blockingPostSyncJob, "$this$blockingPostSyncJob");
            return blockingPostSyncJob.e();
        }
    }

    public Wbs13InstallSetup(String str) {
        this.f54754a = str;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int B0() {
        return C1987R.string.device_upgrade_message_checking_firmware;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final /* bridge */ /* synthetic */ Object E() {
        return 2131232879;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        u.j(context, "context");
        return e.d(C1987R.string.marketing_bodysmart_url, context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int G1() {
        return C1987R.string.device_upgrade_title_downloading;
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
        List list;
        u.j(setupActivity, "setupActivity");
        ej.w w11 = ej.w.w();
        u.i(w11, "get(...)");
        int i11 = ml.a.f82249l;
        list = ml.a.f82238a;
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
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        return e.c(C1987R.string.marketing_bodysmart_url, context);
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation M2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
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
    @Override // com.withings.devicesetup.Setup.WithUpgrade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f54754a
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
            int r0 = r0.d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs13.Wbs13InstallSetup.N2():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string.scale_activation_message_activating;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int R0() {
        return C1987R.string.device_upgrade_title_checking_firmware;
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
        return C1987R.string.scale_connection_message_connecting;
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
            java.lang.String r0 = r3.f54754a
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
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs13.Wbs13InstallSetup.Z():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
    }

    @Override // com.withings.devicesetup.Setup.e
    public final boolean a() {
        c cVar;
        cVar = c.f103617d;
        if (cVar != null) {
            return !cVar.j();
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int a1() {
        return C1987R.string.device_upgrade_title_percent_upgrading;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int b() {
        return p.f67672b.a().d(16).I(this.f54754a);
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int c() {
        return Math.max(2, 2);
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
            java.lang.String r0 = r3.f54754a
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
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs13.Wbs13InstallSetup.c1():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int c2() {
        return C1987R.string.scales_install_rebooting;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final List<Integer> d() {
        int max = Math.max(2, 2);
        ArrayList arrayList = new ArrayList(max);
        for (int i11 = 0; i11 < max; i11++) {
            arrayList.add(null);
        }
        return arrayList;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object d0() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final WppDeviceConversation d2(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new BondPostUpgradeConversation();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void e() {
        oi0.b.h().q(i.b().e().q(), ConstantsWs.CALLCTX_INSTALL, null);
    }

    @Override // com.withings.devicesetup.Setup
    public final int e0() {
        return C1987R.string.wbs13_install_setUp_button;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return C1987R.string.scale_connection_title_connecting;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final int f() {
        return C1987R.string.scale_connection_helper_searching;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int g(int i11, boolean z5) {
        return i11 + 1;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        return new DebugDumpConversation(a11, new jl.b(c11), null, new jl.c(0L));
    }

    @Override // com.withings.devicesetup.Setup.i
    public final Object[] i() {
        return new Integer[]{2131232878, 2131232877};
    }

    @Override // com.withings.devicesetup.Setup.e
    public final void j(SetupConversation setupConversation) {
        c cVar;
        u.j(setupConversation, "setupConversation");
        cVar = c.f103617d;
        if (cVar != null) {
            setupConversation.G(new uc0.a(cVar, ConstantsWs.CALLCTX_SCALE_INSTALL));
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string.scales_install_device_detected;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] k() {
        return new int[]{C1987R.string.wbs12_install_pullTheTab_title, C1987R.string.scale_connection_title_instructions};
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int k0() {
        return C1987R.string.scale_upgrade_message_upgrading;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] l() {
        return new int[]{C1987R.string.wbs12_install_pullTheTab_description, C1987R.string.scale_connection_message_instructions};
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string.scale_connection_message_searching;
    }

    @Override // com.withings.devicesetup.Setup.m
    public final Setup p(cj.b wppDevice) {
        u.j(wppDevice, "wppDevice");
        o f11 = p.f67672b.a().f(wppDevice);
        gq.a.a(1, 16);
        Setup e02 = f11.e0(new DeviceModel(f11.a(), null));
        u.g(e02);
        return e02;
    }

    @Override // com.withings.devicesetup.Setup.e
    public final WppDeviceConversation q(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        return new ScaleSetupInitConversation(true, wr.b.c(FeatureFlag.f39112i));
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void r(String str) {
        this.f54754a = str;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        e.e(setupActivity);
        Device f11 = kn.e.c().f(setupActivity.U3());
        h0 m11 = h0.m(setupActivity);
        m11.c(new Intent(setupActivity, MainActivity.class));
        m11.c(c.a.a(setupActivity, f11.getId(), true));
        m11.r();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string.wbs13_title;
    }

    @Override // com.withings.devicesetup.Setup.l
    public final Intent s(Context context) {
        String b10 = com.google.android.gms.internal.p002firebaseauthapi.a.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, C1987R.string._WBS13_CONNECTION_HELPER_LINK_SEARCHING_, "getString(...)");
        String string = context.getString(C1987R.string._HELP_CENTER_);
        u.i(string, "getString(...)");
        return HMWebActivity.f35395c.c(context, string, b10);
    }

    @Override // com.withings.devicesetup.Setup.a
    public final void t() {
        oi0.b h11 = oi0.b.h();
        u.g(h11);
        f.a(h11, b.f54755a, "wbs13InstallSetup");
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string.wbs13_title;
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
    @Override // com.withings.devicesetup.Setup.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f54754a
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
            int r0 = r0.c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.wbs13.Wbs13InstallSetup.u():java.lang.Object");
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string.wifiConfiguring_title;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return androidx.camera.camera2.internal.e.b(p.f67672b, 16);
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
        out.writeString(this.f54754a);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return e.a(context);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string.wbs13_description;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y0() {
        return C1987R.string.scales_install_rebooting;
    }

    @Override // com.withings.devicesetup.Setup.WithUpgrade
    public final int y2() {
        return C1987R.string.device_upgrade_message_downloading;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string.wbs13_install_ready_title;
    }

    public Wbs13InstallSetup() {
        this(null);
    }

    @Override // com.withings.devicesetup.Setup.f
    public final void o(DevicePictures devicePictures) {
    }
}
