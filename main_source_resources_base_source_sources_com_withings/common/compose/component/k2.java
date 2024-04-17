package com.withings.common.compose.component;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import x1.b;
/* compiled from: HorizontalSegmentedGauge.kt */
/* loaded from: classes3.dex */
public final class k2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalSegmentedGauge.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<j2> f33949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f33950b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f33951c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33952d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5, int i11, int i12, List list) {
            super(2);
            this.f33949a = list;
            this.f33950b = z5;
            this.f33951c = i11;
            this.f33952d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33951c | 1);
            k2.a(this.f33949a, this.f33950b, aVar, g11, this.f33952d);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalSegmentedGauge.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j2 f33953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33954b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f33955c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33956d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33957e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j2 j2Var, androidx.compose.ui.e eVar, boolean z5, int i11, int i12) {
            super(2);
            this.f33953a = j2Var;
            this.f33954b = eVar;
            this.f33955c = z5;
            this.f33956d = i11;
            this.f33957e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33956d | 1);
            androidx.compose.ui.e eVar = this.f33954b;
            boolean z5 = this.f33955c;
            k2.b(this.f33953a, eVar, z5, aVar, g11, this.f33957e);
            return nm0.y.f85009a;
        }
    }

    public static final void a(List<j2> bars, boolean z5, androidx.compose.runtime.a aVar, int i11, int i12) {
        kotlin.jvm.internal.u.j(bars, "bars");
        androidx.compose.runtime.b g11 = aVar.g(1681368462);
        if ((i12 & 2) != 0) {
            z5 = false;
        }
        int i13 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.a());
        g11.s(693286680);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.c1.a(o11, b.a.l(), g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            g11.s(-1935254745);
            for (j2 j2Var : bars) {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                float floatValue = ((Number) en0.r.m(Float.valueOf(j2Var.c()), en0.r.p(0.0f, 1.0f))).floatValue();
                if (floatValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    b(j2Var, androidx.compose.foundation.layout.e1.c(new LayoutWeightElement(en0.r.f(floatValue, Float.MAX_VALUE), true), 1.0f), z5, g11, (i11 << 3) & ConstantsWs.HWFAILURE_ZERO, 0);
                } else {
                    throw new IllegalArgumentException(defpackage.b.b("invalid weight ", floatValue, "; must be greater than zero").toString());
                }
            }
            androidx.compose.runtime.v a13 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a13 != null) {
                a13.G(new a(z5, i11, i12, bars));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.withings.common.compose.component.j2 r17, androidx.compose.ui.e r18, boolean r19, androidx.compose.runtime.a r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.k2.b(com.withings.common.compose.component.j2, androidx.compose.ui.e, boolean, androidx.compose.runtime.a, int, int):void");
    }
}
