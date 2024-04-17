package com.withings.tutorials.ui.screens.howtouse;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.compose.material.g6;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.u0;
import b70.t0;
import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.r0;
/* compiled from: HowToUseWBS12.kt */
/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f45366a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUseWBS12.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(2);
            this.f45367a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._DONE_, aVar2), null, false, null, null, false, this.f45367a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUseWBS12.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f45368a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(3);
            this.f45368a = context;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h VideoTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(VideoTutorialScreen, "$this$VideoTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                g2.c a11 = s2.d.a(C1987R.drawable.advanced_icon_feet, aVar2);
                String u11 = ay.b.u(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_item1, aVar2);
                CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
                com.withings.common.compose.component.o.q(null, a11, u11, null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_wait, aVar2), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_item2, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_scale, aVar2), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_item3, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                String u12 = ay.b.u(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_note_url, aVar2);
                nk.a.h(0, 0, 28, 0L, aVar2, androidx.compose.foundation.h.b(androidx.compose.ui.e.f8927a, URLUtil.isValidUrl(u12), new b0(this.f45368a, u12), 6), nk.g0.a(((i1) aVar2.D(j1.e())).J(), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_note, aVar2)), null);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUseWBS12.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f45370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45371c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45372d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45373e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45370b = str;
            this.f45371c = aVar;
            this.f45372d = aVar2;
            this.f45373e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45373e | 1);
            ym0.a<nm0.y> aVar2 = this.f45371c;
            ym0.a<nm0.y> aVar3 = this.f45372d;
            a0.this.a(this.f45370b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUseWBS12.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f45374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(2);
            this.f45374a = str;
            this.f45375b = aVar;
            this.f45376c = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "HowToUseBodyComp", null, null, null, null, null, null, new s1.a(true, -1761472710, new c0(this.f45374a, this.f45375b, this.f45376c)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUseWBS12.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f45378b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f45379c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45380d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45381e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f45382f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45378b = str;
            this.f45379c = nVar;
            this.f45380d = aVar;
            this.f45381e = aVar2;
            this.f45382f = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45382f | 1);
            ym0.a<nm0.y> aVar2 = this.f45380d;
            ym0.a<nm0.y> aVar3 = this.f45381e;
            a0.this.b(this.f45378b, this.f45379c, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(String str, ym0.a<nm0.y> onBackClicked, ym0.a<nm0.y> onNextClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        DeviceWithVideoMedia.a aVar2;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(-317644726);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onNextClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            Context context = (Context) g11.D(u0.d());
            g11.s(-1302123867);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                if (kotlin.jvm.internal.u.e(str, ConstantsWs.DEVICE_COLOR_WHITE)) {
                    aVar2 = new DeviceWithVideoMedia.a(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_video_w_url, 2131232421);
                } else {
                    aVar2 = new DeviceWithVideoMedia.a(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_video_b_url, 2131232420);
                }
                t11 = l0.f(aVar2, v0.f8878a);
                g11.n(t11);
            }
            r0 r0Var = (r0) t11;
            g11.J();
            String u11 = ay.b.u(C1987R.string.deviceInstallation_ariane_wbs12_howToUse_title, g11);
            t0.h(s1.b.b(g11, 1854676196, new a(onNextClicked)), ay.b.u(((DeviceWithVideoMedia.a) r0Var.getValue()).b(), g11), onBackClicked, s2.d.a(((DeviceWithVideoMedia.a) r0Var.getValue()).a(), g11), u11, null, 0.0f, s1.b.b(g11, 2023036589, new b(context)), g11, ((i12 << 3) & ConstantsWs.HWFAILURE_ZERO) | 12587014, 96);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(str, onBackClicked, onNextClicked, i11));
        }
    }

    public final void b(String str, r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        boolean z5;
        boolean z11;
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        androidx.compose.runtime.b c11 = g6.c(aVar, "onDone", aVar2, 708104882, -1831228938);
        boolean z12 = false;
        if ((((i11 & 14) ^ 6) > 4 && c11.K(str)) || (i11 & 6) == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && c11.K(onBack)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z5 | z11;
        if ((((i11 & 7168) ^ 3072) > 2048 && c11.K(aVar)) || (i11 & 3072) == 2048) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        Object t11 = c11.t();
        if (z14 || t11 == a.C0060a.a()) {
            t11 = new d(str, onBack, aVar);
            c11.n(t11);
        }
        c11.J();
        t0.b(navController, "HowToUseBodyComp", (ym0.p) t11, c11, 56);
        androidx.compose.runtime.v o02 = c11.o0();
        if (o02 != null) {
            o02.G(new e(str, navController, onBack, aVar, i11));
        }
    }
}
