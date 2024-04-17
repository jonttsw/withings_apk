package com.withings.wiscale2.device.common.feature.ecg;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.lifecycle.k1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.ecg.review.EcgReviewStatusValue;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import x1.b;
/* compiled from: WBS08EcgActivationActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0013²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/WBS08EcgActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "needUserInfoUpdate", "", "shouldDisplayUserInfoDialog", "", "flowSpecificity", "Landroidx/navigation/d;", "navBackStackEntry", "Lcom/withings/wiscale2/device/common/feature/ecg/t5;", "selectedState", "", "states", "phoneNumber", "Lcom/withings/common/device/model/capabilities/DeviceWithVideoMedia$a;", "deviceMedia", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WBS08EcgActivationActivity extends Hilt_WBS08EcgActivationActivity {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f51104f = 0;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.i1 f51105e = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(WBS08EcgActivationViewModel.class), new e(this), new d(this), new f(this));

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f51106a;

        static {
            int[] iArr = new int[EcgReviewStatusValue.values().length];
            try {
                EcgReviewStatusValue ecgReviewStatusValue = EcgReviewStatusValue.f38854a;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue2 = EcgReviewStatusValue.f38854a;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue3 = EcgReviewStatusValue.f38854a;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue4 = EcgReviewStatusValue.f38854a;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue5 = EcgReviewStatusValue.f38854a;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f51106a = iArr;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1941570742, new pa(WBS08EcgActivationActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f51108a;

        c(ym0.l lVar) {
            this.f51108a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f51108a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f51108a;
        }

        public final int hashCode() {
            return this.f51108a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51108a.invoke(obj);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f51109a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f51109a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f51110a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f51110a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51111a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f51111a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f51111a.getDefaultViewModelCreationExtras();
        }
    }

    public static final void A3(WBS08EcgActivationActivity wBS08EcgActivationActivity, boolean z5, r8.n nVar, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(1261683003);
        float o11 = yk.h.o();
        float c11 = yk.h.c();
        r0.x xVar = new r0.x(o11, c11, o11, c11);
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        wk.c0.b(null, null, null, new x5(nVar), com.withings.wiscale2.device.common.feature.ecg.c.f51232f, com.withings.wiscale2.device.common.feature.ecg.c.f51233g, s1.b.b(g11, -1426407824, new y5(aVar, z5)), null, 0L, false, xVar, androidx.compose.foundation.layout.e.o(yk.h.B()), 0.0f, false, s1.b.b(g11, -314227531, new d6(wBS08EcgActivationActivity)), g11, 1794048, 24576, 13191);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e6(wBS08EcgActivationActivity, z5, nVar, aVar, i11));
        }
    }

    public static final void B3(WBS08EcgActivationActivity wBS08EcgActivationActivity, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(222622923);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.e(ay.b.u(C1987R.string.wbs08Rx_tutorial_aFib_title, g11), null, "afib.json", aVar, s1.b.b(g11, 1418206865, new f6(aVar2)), null, 0.0f, 0, com.withings.wiscale2.device.common.feature.ecg.c.f51228b, g11, ((i12 << 9) & 7168) | 113271168, 98);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g6(wBS08EcgActivationActivity, aVar, aVar2, i11));
        }
    }

    public static final void C3(WBS08EcgActivationActivity wBS08EcgActivationActivity, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(-1480856999);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.e(ay.b.u(C1987R.string.wbs08Rx_tutorial_cannotDetect_title, g11), null, "cantDetectStrokes.json", aVar, s1.b.b(g11, -1594963937, new h6(aVar2)), null, yk.h.a(), 0, com.withings.wiscale2.device.common.feature.ecg.c.f51229c, g11, ((i12 << 9) & 7168) | 113271168, 34);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i6(wBS08EcgActivationActivity, aVar, aVar2, i11));
        }
    }

    public static final void D3(WBS08EcgActivationActivity wBS08EcgActivationActivity, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(-832846642);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.e(ay.b.u(C1987R.string.wbs08Rx_tutorial_whatsEcg_title, g11), null, "ecg.json", aVar, s1.b.b(g11, -1355416248, new j6(aVar2)), null, 0.0f, 0, com.withings.wiscale2.device.common.feature.ecg.c.f51227a, g11, ((i12 << 9) & 7168) | 113271168, 98);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new k6(wBS08EcgActivationActivity, aVar, aVar2, i11));
        }
    }

    public static final void E3(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, xb.b bVar, androidx.compose.runtime.a aVar, int i11) {
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-49594875);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar2);
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(d11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar2, 1.0f);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                androidx.compose.ui.e n11 = e11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                androidx.compose.ui.layout.l0 e12 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(n11);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a12);
                    } else {
                        g11.m();
                    }
                    ym0.p b12 = com.withings.authentication.e.b(g11, e12, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                    }
                    c12.invoke(k1.j1.a(g11), g11, 0);
                    g11.s(2058660585);
                    xb.a.a(bVar, null, null, 0.0f, 0L, 0L, 0L, s1.b.b(g11, 1469753638, new w6(nVar, wBS08EcgActivationActivity)), g11, 12582920 | ((i11 >> 3) & 14), 126);
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    androidx.compose.runtime.v o02 = g11.o0();
                    if (o02 != null) {
                        o02.G(new x6(wBS08EcgActivationActivity, nVar, bVar, i11));
                        return;
                    }
                    return;
                }
                a3.g.s();
                throw null;
            }
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        a3.g.s();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F3(com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity r29, int r30, int r31, int r32, ym0.a r33, com.withings.wiscale2.device.common.feature.ecg.a r34, com.withings.wiscale2.device.common.feature.ecg.a r35, androidx.compose.runtime.a r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity.F3(com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity, int, int, int, ym0.a, com.withings.wiscale2.device.common.feature.ecg.a, com.withings.wiscale2.device.common.feature.ecg.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void G3(WBS08EcgActivationActivity wBS08EcgActivationActivity, androidx.compose.runtime.a aVar, int i11) {
        long j5;
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-2115678725);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar2);
        androidx.compose.ui.layout.l0 e11 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(d11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, e11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
            j5 = d2.f0.f63265i;
            com.withings.common.compose.component.c5.a(j5, 0L, null, false, null, null, null, null, false, new f7(wBS08EcgActivationActivity), g11, 6, ConstantsWs.WS_STATUS_ERROR_ARRAY_WAM);
            float f11 = 24;
            androidx.compose.material.f5.b(0.0f, 0, 0, 28, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).J(), 0L, g11, mVar.g(androidx.compose.foundation.layout.e1.o(aVar2, f11, f11), b.a.e()));
            androidx.compose.runtime.v b11 = androidx.compose.material.h6.b(g11);
            if (b11 != null) {
                b11.G(new g7(wBS08EcgActivationActivity, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void H3(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, boolean z5, boolean z11, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(-1149776737);
        h7 h7Var = new h7(nVar);
        s1.a aVar4 = com.withings.wiscale2.device.common.feature.ecg.c.f51234h;
        s1.a b10 = s1.b.b(g11, 1657782228, new i7(z5, z11, aVar));
        s1.a b11 = s1.b.b(g11, -1084097707, new j7(aVar2));
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        wk.c0.b(null, null, null, h7Var, null, aVar4, b10, b11, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 2031557657, new q7(wBS08EcgActivationActivity)), g11, 14352384, 24576, 15127);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new r7(wBS08EcgActivationActivity, nVar, z5, z11, aVar, aVar2, i11));
        }
    }

    public static final void I3(WBS08EcgActivationActivity wBS08EcgActivationActivity, rq.e eVar, ym0.a aVar, com.withings.wiscale2.device.common.feature.ecg.a aVar2, com.withings.wiscale2.device.common.feature.ecg.a aVar3, androidx.compose.runtime.a aVar4, int i11) {
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar4.g(-2102952308);
        androidx.compose.material.t5.b(ah.k.s(androidx.compose.ui.e.f8927a), null, s1.b.b(g11, 603006375, new t7(wBS08EcgActivationActivity)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, -827969266, new b8(eVar, wBS08EcgActivationActivity, aVar, aVar2, aVar3)), g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131066);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c8(wBS08EcgActivationActivity, eVar, aVar, aVar2, aVar3, i11));
        }
    }

    public static final void J3(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, boolean z5, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(1415082737);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        wk.c0.b(null, null, null, new d8(nVar), null, s1.b.b(g11, -1625412955, new e8(wBS08EcgActivationActivity)), s1.b.b(g11, -72325594, new f8(aVar, z5)), s1.b.b(g11, 1480761767, new g8(aVar2, z5)), 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 301449835, new k8(wBS08EcgActivationActivity, ((androidx.compose.runtime.k) t11).a(), (androidx.compose.ui.platform.k4) androidx.appcompat.view.menu.d.b(g11))), g11, 14352384, 24576, 15127);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l8(wBS08EcgActivationActivity, nVar, z5, aVar, aVar2, i11));
        }
    }

    public static final void K3(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, t5 t5Var, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, androidx.compose.runtime.a aVar4, int i11) {
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar4.g(-1602710147);
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        wk.c0.b(null, null, null, new m8(nVar), com.withings.wiscale2.device.common.feature.ecg.c.f51230d, com.withings.wiscale2.device.common.feature.ecg.c.f51231e, s1.b.b(g11, 113189928, new n8(t5Var, aVar2)), s1.b.b(g11, 1910640391, new o8(aVar3)), 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 1019285443, new p8(t5Var, aVar)), g11, 14376960, 24576, 15111);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new q8(wBS08EcgActivationActivity, nVar, t5Var, aVar, aVar2, aVar3, i11));
        }
    }

    public static final void L3(WBS08EcgActivationActivity wBS08EcgActivationActivity, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1152302439);
        k1.r0 a11 = androidx.compose.runtime.l0.a(wBS08EcgActivationActivity.R3().U0(), -1L, null, g11, 2);
        long longValue = ((Number) a11.getValue()).longValue();
        g11.s(-1037439685);
        boolean d11 = g11.d(longValue);
        Object t11 = g11.t();
        if (d11 || t11 == a.C0060a.a()) {
            if (((Number) a11.getValue()).longValue() >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            t11 = androidx.compose.runtime.l0.f(Boolean.valueOf(z5), androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        g11.J();
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            g11.s(-1037439489);
            boolean K = g11.K(r0Var);
            Object t12 = g11.t();
            if (K || t12 == a.C0060a.a()) {
                t12 = new t8(r0Var);
                g11.n(t12);
            }
            ym0.a aVar2 = (ym0.a) t12;
            g11.J();
            String u11 = ay.b.u(C1987R.string.beforeWeSetUpECG, g11);
            String u12 = ay.b.u(C1987R.string.beforeWeSetUpECG_description, g11);
            String u13 = ay.b.u(C1987R.string._EDIT_PROFILE_, g11);
            u8 u8Var = new u8(wBS08EcgActivationActivity, r0Var);
            String u14 = ay.b.u(C1987R.string._CANCEL_, g11);
            g11.s(-1037438790);
            boolean K2 = g11.K(r0Var);
            Object t13 = g11.t();
            if (K2 || t13 == a.C0060a.a()) {
                t13 = new v8(r0Var);
                g11.n(t13);
            }
            g11.J();
            wk.p.a(aVar2, u11, u12, u13, 0L, u8Var, u14, 0L, (ym0.a) t13, g11, 0, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new w8(wBS08EcgActivationActivity, i11));
        }
    }

    public static final void M3(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, androidx.compose.runtime.a aVar, int i11) {
        wBS08EcgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1923730462);
        k1.r0 a11 = t1.d.a(wBS08EcgActivationActivity.R3().M0(), g11);
        k1.r0 b10 = androidx.navigation.compose.r.b(nVar, g11);
        String str = (String) a11.getValue();
        g11.s(173241684);
        boolean K = g11.K(a11);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new x8(a11, null);
            g11.n(t11);
        }
        g11.J();
        k1.y.f(str, (ym0.p) t11, g11);
        k1.y.f((androidx.navigation.d) b10.getValue(), new y8(wBS08EcgActivationActivity, a11, b10, null), g11);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new z8(wBS08EcgActivationActivity, nVar, i11));
        }
    }

    public static final void O3(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        wBS08EcgActivationActivity.R3().V0().observe(wBS08EcgActivationActivity, new c(new aa(wBS08EcgActivationActivity)));
        androidx.lifecycle.j0 a11 = androidx.lifecycle.e1.a(wBS08EcgActivationActivity.R3().F0());
        a11.observe(wBS08EcgActivationActivity, new ba(a11, wBS08EcgActivationActivity));
    }

    public static final void P3(WBS08EcgActivationActivity wBS08EcgActivationActivity, String str, String str2, Bundle bundle) {
        EcgReviewStatusValue ecgReviewStatusValue;
        int i11;
        String string;
        wBS08EcgActivationActivity.getClass();
        switch (str2.hashCode()) {
            case -1751746413:
                if (str2.equals("VideoCallIntro")) {
                    int i12 = v70.a.f103433b;
                    v70.a.c("video_call", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case -1479427822:
                if (str2.equals("ReviewExplanations")) {
                    int i13 = v70.a.f103433b;
                    v70.a.c("ecg_end", kotlin.collections.s0.j(new nm0.j("flow", "ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case -1372701917:
                if (str2.equals("CannotDetectMedicalConditions")) {
                    int i14 = v70.a.f103433b;
                    v70.a.c("heart_attack_disclaimer", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case -680498753:
                if (str2.equals("EcgReviewStatusScreen")) {
                    rq.b bVar = (rq.b) wBS08EcgActivationActivity.R3().G0().getValue();
                    String str3 = null;
                    if (bVar != null) {
                        ecgReviewStatusValue = bVar.d();
                    } else {
                        ecgReviewStatusValue = null;
                    }
                    if (ecgReviewStatusValue == null) {
                        i11 = -1;
                    } else {
                        i11 = a.f51106a[ecgReviewStatusValue.ordinal()];
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        str3 = "rejected_status_network";
                                    }
                                } else {
                                    str3 = "rejected_status_noisy";
                                }
                            } else {
                                str3 = "needs_measure";
                            }
                        } else {
                            str3 = "rejected_status";
                        }
                    } else {
                        str3 = "awaiting_approval";
                    }
                    if (str3 != null && str3.length() > 0) {
                        int i15 = v70.a.f103433b;
                        v70.a.c(str3, kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                        return;
                    }
                    return;
                }
                return;
            case 576465947:
                if (str2.equals("StateSelection")) {
                    int i16 = v70.a.f103433b;
                    v70.a.c("state_request", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 740719090:
                if (str2.equals("DiscoverECG6Lead")) {
                    int i17 = v70.a.f103433b;
                    v70.a.c("ecg_explanation", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 1228767006:
                if (str2.equals("Support/{title}/{description}/{screenLog}") && bundle != null && (string = bundle.getString("screenLog")) != null && string.length() > 0) {
                    int i18 = v70.a.f103433b;
                    v70.a.c(string, kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 1404028145:
                if (str2.equals("CanDetectAFib")) {
                    int i19 = v70.a.f103433b;
                    v70.a.c("afib_explanation", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 1480392378:
                if (str2.equals("AcceptationTerms")) {
                    int i21 = v70.a.f103433b;
                    v70.a.c("data_sharing_agreement", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 1973186678:
                if (str2.equals("HeartbeatExplanations")) {
                    int i22 = v70.a.f103433b;
                    v70.a.c("hh_will_contact_you", kotlin.collections.s0.j(new nm0.j("flow", "ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void Q3(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        wBS08EcgActivationActivity.R3().V0().setValue("https://support.withings.com/hc/en-us/articles/4407741101457");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WBS08EcgActivationViewModel R3() {
        return (WBS08EcgActivationViewModel) this.f51105e.getValue();
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.Hilt_WBS08EcgActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 1610439472, new b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z3(int r18, int r19, androidx.compose.runtime.a r20, java.lang.String r21, ym0.a r22, ym0.a r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity.z3(int, int, androidx.compose.runtime.a, java.lang.String, ym0.a, ym0.a):void");
    }
}
