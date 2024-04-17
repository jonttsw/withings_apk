package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import x1.b;
/* compiled from: CycleTutorialLogScreen.kt */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f40996a = new s1.a(false, 2130043959, a.f40999a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f40997b = new s1.a(false, 1267739798, b.f41000a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f40998c = new s1.a(false, -631614448, c.f41001a);

    /* compiled from: CycleTutorialLogScreen.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40999a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar3);
                androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(d11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    n0.z.a(s2.d.a(2131231259, aVar2), "", androidx.compose.foundation.layout.w0.a(mVar.g(androidx.compose.foundation.layout.e1.d(aVar3), b.a.b()), 1.0f), b.a.b(), f.a.b(), 0.0f, null, aVar2, 27704, 96);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTutorialLogScreen.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41000a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string.cycle_tutorial_log_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTutorialLogScreen.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f41001a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.cycle_tutorial_log_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }
}
