package com.withings.wiscale2.settings;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.ButtonSize;
import com.withings.wiscale2.C1987R;
import x1.b;
/* compiled from: PrivacyAndLegals.kt */
/* loaded from: classes5.dex */
final class j1 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.p<String, String, nm0.y> f60070a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f60071b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f60072c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(String str, String str2, ym0.p pVar) {
        super(3);
        this.f60070a = pVar;
        this.f60071b = str;
        this.f60072c = str2;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        aVar2.s(-483455358);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
        int G = aVar2.G();
        k1.v0 l5 = aVar2.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
        if (aVar2.i() instanceof k1.d) {
            aVar2.A();
            if (aVar2.e()) {
                aVar2.F(a12);
            } else {
                aVar2.m();
            }
            ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                l0.q.a(G, aVar2, G, c12);
            }
            l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
            androidx.compose.ui.e t11 = androidx.compose.foundation.layout.e1.t(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f));
            androidx.compose.ui.layout.l0 a13 = androidx.activity.a0.a(aVar2, 693286680, b.a.i(), aVar2, -1323940314);
            int G2 = aVar2.G();
            k1.v0 l6 = aVar2.l();
            ym0.a a14 = g.a.a();
            s1.a c13 = androidx.compose.ui.layout.y.c(t11);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a14);
                } else {
                    aVar2.m();
                }
                ym0.p c14 = com.google.protobuf.t.c(aVar2, a13, aVar2, l6);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                    l0.q.a(G2, aVar2, G2, c14);
                }
                l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                String u11 = ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising_MoreInformationLink, aVar2);
                nk.a0.i(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising_MoreInformationTitle, aVar2));
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    r0.d0.a(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), aVar2);
                    String u12 = ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising_MoreInformationLinkTitle, aVar2);
                    ButtonSize buttonSize = ButtonSize.f33304f;
                    aVar2.s(-1713571426);
                    ym0.p<String, String, nm0.y> pVar = this.f60070a;
                    boolean K = aVar2.K(pVar) | aVar2.K(u11);
                    String str = this.f60071b;
                    boolean K2 = K | aVar2.K(str);
                    Object t12 = aVar2.t();
                    if (K2 || t12 == a.C0060a.a()) {
                        t12 = new h1(u11, str, pVar);
                        aVar2.n(t12);
                    }
                    aVar2.J();
                    com.withings.common.compose.component.l.c(null, u12, null, false, null, buttonSize, false, (ym0.a) t12, aVar2, 196608, 93);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar3, yk.h.a()), aVar2);
                    nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising_MoreInformationDescription, aVar2));
                    r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar3, yk.h.c()), aVar2);
                    androidx.compose.material3.d1.a(null, null, null, null, null, s1.b.b(aVar2, -1008160161, new i1(this.f60072c)), aVar2, 196608, 31);
                    defpackage.d.j(aVar2);
                    return nm0.y.f85009a;
                }
                throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }
}
