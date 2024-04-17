package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f51227a = new s1.a(false, -1169850916, a.f51236a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f51228b = new s1.a(false, 1509328509, b.f51237a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f51229c = new s1.a(false, -1085810677, C0691c.f51238a);

    /* renamed from: d  reason: collision with root package name */
    public static s1.a f51230d = new s1.a(false, 813256298, d.f51239a);

    /* renamed from: e  reason: collision with root package name */
    public static s1.a f51231e = new s1.a(false, -1684260535, e.f51240a);

    /* renamed from: f  reason: collision with root package name */
    public static s1.a f51232f = new s1.a(false, -1672215698, f.f51241a);

    /* renamed from: g  reason: collision with root package name */
    public static s1.a f51233g = new s1.a(false, -1549311761, g.f51242a);

    /* renamed from: h  reason: collision with root package name */
    public static s1.a f51234h = new s1.a(false, 104694867, h.f51243a);

    /* renamed from: i  reason: collision with root package name */
    public static s1.a f51235i = new s1.a(false, -1987444180, i.f51244a);

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51236a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h LottieTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LottieTutorialScreen, "$this$LottieTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                g2.c a11 = s2.d.a(C1987R.drawable.advanced_icon_heartwave, aVar2);
                String u11 = ay.b.u(C1987R.string.wbs08Rx_tutorial_whatsEcg_item1, aVar2);
                CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
                com.withings.common.compose.component.o.q(null, a11, u11, null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_electricalwave, aVar2), ay.b.u(C1987R.string.wbs08Rx_tutorial_whatsEcg_item2, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.wbs08Rx_tutorial_whatsEcg_note, aVar2));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f51237a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h LottieTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LottieTutorialScreen, "$this$LottieTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                g2.c a11 = s2.d.a(C1987R.drawable.advanced_icon_afib, aVar2);
                String u11 = ay.b.u(C1987R.string.wbs08Rx_tutorial_aFib_item1, aVar2);
                CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
                com.withings.common.compose.component.o.q(null, a11, u11, null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_alert, aVar2), ay.b.u(C1987R.string.wbs08Rx_tutorial_aFib_item2, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* renamed from: com.withings.wiscale2.device.common.feature.ecg.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0691c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0691c f51238a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h LottieTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LottieTutorialScreen, "$this$LottieTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.wbs08Rx_tutorial_cannotDetect_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f51239a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e s11 = ah.k.s(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f));
                aVar2.s(733328855);
                androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(s11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c13 = com.google.protobuf.t.c(aVar2, c11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c13);
                    }
                    l0.r.c(0, c12, k1.j1.a(aVar2), aVar2, 2058660585);
                    n0.z.a(s2.d.a(2131232226, aVar2), "Us States", androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), null, null, 0.0f, null, aVar2, 440, 120);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f51240a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.v4.b(null, ay.b.u(C1987R.string.wbs08Rx_usOnboarding_stateSelection_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f51241a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e s11 = ah.k.s(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f));
                aVar2.s(733328855);
                androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(s11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c13 = com.google.protobuf.t.c(aVar2, c11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c13);
                    }
                    l0.r.c(0, c12, k1.j1.a(aVar2), aVar2, 2058660585);
                    n0.z.a(s2.d.a(2131232237, aVar2), "Family hands", androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), null, null, 0.0f, null, aVar2, 440, 120);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f51242a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.v4.b(null, ay.b.u(C1987R.string.wbs08Rx_usOnboarding_conditions_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f51243a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.v4.b(null, ay.b.u(C1987R.string.wbs08Rx_usOnboarding_phoneInput_title, aVar2), ay.b.u(C1987R.string.wbs08Rx_usOnboarding_phoneInput_paragraph, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f51244a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h VideoTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(VideoTutorialScreen, "$this$VideoTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                g2.c a11 = s2.d.a(C1987R.drawable.advanced_icon_handle, aVar2);
                String u11 = ay.b.u(C1987R.string.ecgWBS08_tutorial_howToRecord_item1, aVar2);
                CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
                com.withings.common.compose.component.o.q(null, a11, u11, null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_stand, aVar2), ay.b.u(C1987R.string.ecgWBS08_tutorial_howToRecord_item2, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_wait, aVar2), ay.b.u(C1987R.string.ecgWBS08_tutorial_howToRecord_item3, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.ecgWBS08_tutorial_howToRecord_note, aVar2));
            }
            return nm0.y.f85009a;
        }
    }
}
