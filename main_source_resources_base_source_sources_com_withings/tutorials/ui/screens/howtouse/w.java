package com.withings.tutorials.ui.screens.howtouse;

import androidx.compose.material.g6;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import b70.t0;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.ui.screens.wallhandlemount.WallHandleMountViewModel;
import com.withings.wiscale2.C1987R;
import i6.a;
import k1.r0;
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f45488a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUseWBS08.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f45489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45491c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r8.n f45492d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WallHandleMountViewModel f45493e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Long f45494f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f45495g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, r8.n nVar, WallHandleMountViewModel wallHandleMountViewModel, Long l5, String str, ym0.a aVar, ym0.a aVar2) {
            super(2);
            this.f45489a = str;
            this.f45490b = aVar;
            this.f45491c = aVar2;
            this.f45492d = nVar;
            this.f45493e = wallHandleMountViewModel;
            this.f45494f = l5;
            this.f45495g = j5;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "HowToUseBodyScan", null, null, null, null, null, null, new s1.a(true, -1208477460, new v(this.f45489a, this.f45490b, this.f45491c, this.f45492d)), 126);
            g70.b.a(GuidedPresentationTutorialNavHost, this.f45493e, this.f45494f, this.f45495g, this.f45489a, this.f45492d, this.f45490b, this.f45491c);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUseWBS08.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Long f45497b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f45498c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f45499d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r8.n f45500e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45501f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45502g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f45503h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l5, long j5, String str, r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45497b = l5;
            this.f45498c = j5;
            this.f45499d = str;
            this.f45500e = nVar;
            this.f45501f = aVar;
            this.f45502g = aVar2;
            this.f45503h = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45503h | 1);
            ym0.a<nm0.y> aVar2 = this.f45501f;
            ym0.a<nm0.y> aVar3 = this.f45502g;
            w.this.e(this.f45497b, this.f45498c, this.f45499d, this.f45500e, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(int i11, int i12, androidx.compose.runtime.a aVar, String str, ym0.a onBackClicked, ym0.a onInstalledClicked, ym0.a onNotInstalledClicked) {
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str3;
        int i18;
        String str4;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onInstalledClicked, "onInstalledClicked");
        kotlin.jvm.internal.u.j(onNotInstalledClicked, "onNotInstalledClicked");
        androidx.compose.runtime.b g11 = aVar.g(1769008258);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            str2 = str;
        } else if ((i11 & 14) == 0) {
            str2 = str;
            if (g11.K(str2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            str2 = str;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onInstalledClicked)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (g11.w(onNotInstalledClicked)) {
                i17 = ModuleCopy.f28574b;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i13 & 5851) == 1170 && g11.h()) {
            g11.C();
            str4 = str2;
        } else {
            if (i19 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (kotlin.jvm.internal.u.e(str3, ConstantsWs.DEVICE_COLOR_WHITE)) {
                i18 = 2131232411;
            } else {
                i18 = 2131232410;
            }
            t0.c(ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_didYouinstallWallHandleMount_title, g11), s2.d.a(i18, g11), onBackClicked, s1.b.b(g11, 370725643, new j(onInstalledClicked)), s1.b.b(g11, 1625507660, new k(onNotInstalledClicked)), yk.h.a(), null, com.withings.tutorials.ui.screens.howtouse.a.f45360c, g11, ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO) | 12610624, 64);
            str4 = str3;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(i11, i12, this, str4, onBackClicked, onInstalledClicked, onNotInstalledClicked));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r19, int r20, androidx.compose.runtime.a r21, java.lang.String r22, ym0.a r23, ym0.a r24, ym0.a r25) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.howtouse.w.b(int, int, androidx.compose.runtime.a, java.lang.String, ym0.a, ym0.a, ym0.a):void");
    }

    public final void c(int i11, androidx.compose.runtime.a aVar, String str, ym0.a onBackClicked, ym0.a onWallMountDetailsClicked, ym0.a onNextClicked) {
        int i12;
        DeviceWithVideoMedia.a aVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onWallMountDetailsClicked, "onWallMountDetailsClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1031196966);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onWallMountDetailsClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onNextClicked)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            g11.s(-510789106);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                if (kotlin.jvm.internal.u.e(str, ConstantsWs.DEVICE_COLOR_WHITE)) {
                    aVar2 = new DeviceWithVideoMedia.a(C1987R.string.deviceInstallation_ariane_wbs08_howToUse_video_w_url, 2131232419);
                } else {
                    aVar2 = new DeviceWithVideoMedia.a(C1987R.string.deviceInstallation_ariane_wbs08_howToUse_video_b_url, 2131232418);
                }
                t11 = l0.f(aVar2, v0.f8878a);
                g11.n(t11);
            }
            r0 r0Var = (r0) t11;
            g11.J();
            String u11 = ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_howToUse, g11);
            t0.h(s1.b.b(g11, -452152588, new p(onNextClicked)), ay.b.u(((DeviceWithVideoMedia.a) r0Var.getValue()).b(), g11), onBackClicked, s2.d.a(((DeviceWithVideoMedia.a) r0Var.getValue()).a(), g11), u11, null, 0.0f, s1.b.b(g11, 1585628541, new q(onWallMountDetailsClicked)), g11, ((i12 << 3) & ConstantsWs.HWFAILURE_ZERO) | 12587014, 96);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new r(this, str, onBackClicked, onWallMountDetailsClicked, onNextClicked, i11));
        }
    }

    public final void d(int i11, int i12, androidx.compose.runtime.a aVar, String str, ym0.a onBackClicked, ym0.a onNextClicked) {
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        String str3;
        int i17;
        int i18;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(1303723177);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            str2 = str;
        } else if ((i11 & 14) == 0) {
            str2 = str;
            if (g11.K(str2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            str2 = str;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onNextClicked)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i13 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            if (i19 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (kotlin.jvm.internal.u.e(str3, ConstantsWs.DEVICE_COLOR_WHITE)) {
                i17 = C1987R.string.deviceInstallation_ariane_wbs08_handleWallMount_video_url_w;
            } else {
                i17 = C1987R.string.deviceInstallation_ariane_wbs08_handleWallMount_video_url_b;
            }
            if (kotlin.jvm.internal.u.e(str3, ConstantsWs.DEVICE_COLOR_WHITE)) {
                i18 = 2131232413;
            } else {
                i18 = 2131232408;
            }
            String u11 = ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_installWallHandleMount_title, g11);
            t0.h(s1.b.b(g11, -818923197, new s(onNextClicked)), ay.b.u(i17, g11), onBackClicked, s2.d.a(i18, g11), u11, null, 0.0f, com.withings.tutorials.ui.screens.howtouse.a.f45359b, g11, ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO) | 12587014, 96);
            str2 = str3;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new t(this, str2, onBackClicked, onNextClicked, i11, i12));
        }
    }

    public final void e(Long l5, long j5, String str, r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        i6.a aVar3;
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        androidx.compose.runtime.b c11 = g6.c(aVar, "onDone", aVar2, 1946609252, 1890788296);
        n1 a11 = j6.a.a(c11);
        if (a11 != null) {
            fk0.c a12 = e6.a.a(a11, c11);
            c11.s(1729797275);
            if (a11 instanceof androidx.lifecycle.u) {
                aVar3 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
            } else {
                aVar3 = a.C1058a.f71431b;
            }
            g1 a13 = j6.b.a(WallHandleMountViewModel.class, a11, null, a12, aVar3, c11);
            c11.J();
            c11.J();
            t0.b(navController, "HowToUseBodyScan", new a(j5, navController, (WallHandleMountViewModel) a13, l5, str, onBack, aVar), c11, 56);
            androidx.compose.runtime.v o02 = c11.o0();
            if (o02 != null) {
                o02.G(new b(l5, j5, str, navController, onBack, aVar, i11));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public final void f(int i11, int i12, androidx.compose.runtime.a aVar, String str, ym0.a onBackClicked, ym0.a onNextClicked, ym0.a onDoneClicked) {
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str3;
        int i18;
        String str4;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        kotlin.jvm.internal.u.j(onDoneClicked, "onDoneClicked");
        androidx.compose.runtime.b g11 = aVar.g(1616318214);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            str2 = str;
        } else if ((i11 & 14) == 0) {
            str2 = str;
            if (g11.K(str2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            str2 = str;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onNextClicked)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (g11.w(onDoneClicked)) {
                i17 = ModuleCopy.f28574b;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i13 & 5851) == 1170 && g11.h()) {
            g11.C();
            str4 = str2;
        } else {
            if (i19 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (kotlin.jvm.internal.u.e(str3, ConstantsWs.DEVICE_COLOR_WHITE)) {
                i18 = 2131232411;
            } else {
                i18 = 2131232410;
            }
            t0.c(ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_wallHandleMount_title, g11), s2.d.a(i18, g11), onBackClicked, s1.b.b(g11, 391086237, new x(onNextClicked)), s1.b.b(g11, 1152967548, new y(onDoneClicked)), yk.h.a(), null, com.withings.tutorials.ui.screens.howtouse.a.f45358a, g11, ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO) | 12610624, 64);
            str4 = str3;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new z(i11, i12, this, str4, onBackClicked, onNextClicked, onDoneClicked));
        }
    }
}
