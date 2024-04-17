package com.withings.devicesetup;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* loaded from: classes3.dex */
public interface Setup extends Parcelable {

    /* loaded from: classes3.dex */
    public interface WithBatteryCheck extends Setup {
        int G0();

        boolean O1(long j5, SetupConversation setupConversation);

        int h2();

        int v2();

        Intent x2(Context context);

        Integer y1();
    }

    /* loaded from: classes3.dex */
    public interface WithBonding extends Setup {
        Object B1();

        int J2();

        int P0();

        int T0();

        boolean m(cj.b bVar);

        int m1();

        SetupBleBondConversation n(SetupConversation setupConversation);

        Object q0();
    }

    /* loaded from: classes3.dex */
    public interface WithOverview extends Setup {
        Object E();

        boolean E2(Context context);

        Intent M1(Context context);

        int t0();

        int x0();
    }

    /* loaded from: classes3.dex */
    public interface WithSilentBonding extends Setup {
        boolean m(cj.b bVar);

        SetupBleBondConversation n(SetupConversation setupConversation);
    }

    /* loaded from: classes3.dex */
    public interface WithUpgrade extends Setup {
        int B0();

        int G1();

        WppDeviceConversation M2(SetupConversation setupConversation);

        Object N2();

        int R0();

        int T();

        int a1();

        int c2();

        WppDeviceConversation d2(SetupConversation setupConversation);

        int k0();

        int y0();

        int y2();
    }

    /* loaded from: classes3.dex */
    public interface WithUpgradeDependingOnNetworkConfiguration extends WithUpgrade, j {
        boolean z0(SetupConversation setupConversation, int i11);
    }

    /* loaded from: classes3.dex */
    public interface a {
        void t();
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int f37696a;

        /* renamed from: b  reason: collision with root package name */
        int f37697b;

        /* renamed from: c  reason: collision with root package name */
        Intent f37698c;

        /* renamed from: d  reason: collision with root package name */
        d f37699d;

        public final int a() {
            return this.f37697b;
        }

        public final Intent b() {
            return this.f37698c;
        }

        public final d c() {
            return this.f37699d;
        }

        public final int d() {
            return this.f37696a;
        }

        public final void e(int i11) {
            this.f37697b = i11;
        }

        public final void f(Intent intent) {
            this.f37698c = intent;
        }

        public final void g(d dVar) {
            this.f37699d = dVar;
        }

        public final void h(int i11) {
            this.f37696a = i11;
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f37700a;

        /* renamed from: b  reason: collision with root package name */
        int f37701b;

        /* renamed from: c  reason: collision with root package name */
        int f37702c;

        /* renamed from: d  reason: collision with root package name */
        int f37703d;

        /* renamed from: e  reason: collision with root package name */
        int f37704e;

        public final int a() {
            return this.f37701b;
        }

        public final int b() {
            return this.f37702c;
        }

        public final int c() {
            return this.f37703d;
        }

        public final int d() {
            return this.f37704e;
        }

        public final int e() {
            return this.f37700a;
        }

        public final void f() {
            this.f37701b = C1987R.string.install_troubleshooting_charge_description;
        }

        public final void g(int i11) {
            this.f37702c = i11;
        }

        public final void h() {
            this.f37703d = C1987R.string.understood;
        }

        public final void i() {
            this.f37704e = C1987R.string.helpCenter_settings_goButton;
        }

        public final void j() {
            this.f37700a = C1987R.string.install_troubleshooting_charge_title;
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        boolean a();

        void e();

        void j(SetupConversation setupConversation);

        WppDeviceConversation q(SetupConversation setupConversation);
    }

    /* loaded from: classes3.dex */
    public interface f {
        void o(DevicePictures devicePictures);

        void r(String str);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void c(SetupActivity setupActivity);
    }

    /* loaded from: classes3.dex */
    public interface h {
    }

    /* loaded from: classes3.dex */
    public interface i {
        int c();

        List<Integer> d();

        int g(int i11, boolean z5);

        Object[] i();

        int[] k();

        int[] l();
    }

    /* loaded from: classes3.dex */
    public interface j {
        List<Integer> h();
    }

    /* loaded from: classes3.dex */
    public interface k {
    }

    /* loaded from: classes3.dex */
    public interface l {
        int b();

        int f();

        Intent s(Context context);

        Object u();
    }

    /* loaded from: classes3.dex */
    public interface m {
        Setup p(cj.b bVar);
    }

    /* loaded from: classes3.dex */
    public interface n {
        List<c> c(Context context);
    }

    /* loaded from: classes3.dex */
    public interface o {
    }

    /* loaded from: classes3.dex */
    public interface p {
    }

    boolean I2();

    int J();

    xp.g J0(SetupActivity setupActivity);

    boolean J1();

    boolean L();

    int M();

    Object N0();

    int R();

    int S();

    int S1();

    WppDeviceConversation V1(SetupConversation setupConversation);

    Object X0();

    Object Z();

    void Z1(SetupActivity setupActivity);

    Object c1();

    Object d0();

    int e0();

    int e2();

    int f1();

    WppDeviceConversation h0(SetupConversation setupConversation);

    int j0();

    int o2();

    void r0(SetupActivity setupActivity);

    int r2();

    int v1();

    aj.b w();

    int w1();

    yi.d x(Context context);

    int z2();
}
