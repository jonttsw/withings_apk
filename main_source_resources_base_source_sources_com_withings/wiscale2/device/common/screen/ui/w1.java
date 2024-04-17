package com.withings.wiscale2.device.common.screen.ui;

import androidx.camera.camera2.internal.c3;
import androidx.compose.material.h6;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.list.SlideState;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class w1 {

    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    static final class a implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f53465a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ym0.l lVar) {
            this.f53465a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f53465a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f53465a;
        }

        public final int hashCode() {
            return this.f53465a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53465a.invoke(obj);
        }
    }

    public static final void a(String str, List list, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        androidx.compose.runtime.b g11 = aVar3.g(991688893);
        wk.p.a(aVar, null, ay.b.v(C1987R.string.screenCustomization_disablingParentWarning, new Object[]{str, kotlin.collections.x.R(list, ", ", null, null, null, 62)}, g11), ay.b.u(C1987R.string._OK_, g11), 0L, aVar2, ay.b.u(C1987R.string._CANCEL_, g11), 0L, aVar, g11, ((i11 >> 6) & 14) | 48 | (458752 & (i11 << 6)) | ((i11 << 18) & 234881024), ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new s(str, list, aVar, aVar2, i11));
        }
    }

    public static final void b(List list, ym0.l lVar, ym0.l lVar2, ym0.l lVar3, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, androidx.compose.runtime.a aVar4, int i11, int i12) {
        ym0.l lVar4;
        androidx.compose.runtime.b g11 = aVar4.g(727079356);
        if ((i12 & 8) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar3;
        }
        e.a aVar5 = androidx.compose.ui.e.f8927a;
        nk.a0.g(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar5, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.customizeScreens_includedMeasurements, g11));
        r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar5, yk.h.f()), g11);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sc0.c cVar = (sc0.c) it.next();
            List<sc0.b> b10 = cVar.b();
            e.a aVar6 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar6, 1.0f);
            int i13 = androidx.compose.foundation.layout.e.f4229i;
            androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                String c12 = cVar.c();
                g11.s(-1988115077);
                if (c12 != null) {
                    nk.a0.i(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar6, yk.h.o(), 0.0f, 2), null, c12);
                }
                g11.J();
                y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, -854183110, new f0(b10, lVar2, lVar, aVar, aVar2, aVar3, lVar4)), g11, 1572864, 63);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g0(list, lVar, lVar2, lVar4, aVar, aVar2, aVar3, i11, i12));
        }
    }

    public static final void c(List list, ym0.l lVar, ym0.l lVar2, ym0.l lVar3, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, androidx.compose.runtime.a aVar4, int i11) {
        androidx.compose.runtime.b g11 = aVar4.g(-505793131);
        List<sc0.c> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (sc0.c cVar : list2) {
            kotlin.collections.x.n(cVar.b(), arrayList);
        }
        if (!arrayList.isEmpty()) {
            e.a aVar5 = androidx.compose.ui.e.f8927a;
            nk.a0.g(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar5, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.customizeScreens_moreScreens_title, g11));
            r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar5, yk.h.f()), g11);
            for (sc0.c cVar2 : list2) {
                List<sc0.b> b10 = cVar2.b();
                e.a aVar6 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar6, 1.0f);
                int i12 = androidx.compose.foundation.layout.e.f4229i;
                androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
                int G = g11.G();
                k1.v0 l5 = g11.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a12);
                    } else {
                        g11.m();
                    }
                    ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                        androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                    }
                    dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                    String c12 = cVar2.c();
                    g11.s(1846930113);
                    if (c12 != null) {
                        nk.a0.i(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar6, yk.h.o(), 0.0f, 2), null, c12);
                    }
                    g11.J();
                    y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, 64824152, new t0(b10, lVar2, lVar, aVar, aVar2, aVar3, lVar3)), g11, 1572864, 63);
                    g9.a(g11);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new u0(list, lVar, lVar2, lVar3, aVar, aVar2, aVar3, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.compose.ui.e r45, com.withings.wiscale2.device.common.screen.ui.y1 r46, ym0.a r47, ym0.l r48, ym0.a r49, boolean r50, ym0.l r51, ym0.l r52, ym0.l r53, ym0.p r54, ym0.l r55, ym0.a r56, ym0.a r57, ym0.a r58, androidx.compose.runtime.a r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.w1.d(androidx.compose.ui.e, com.withings.wiscale2.device.common.screen.ui.y1, ym0.a, ym0.l, ym0.a, boolean, ym0.l, ym0.l, ym0.l, ym0.p, ym0.l, ym0.a, ym0.a, ym0.a, androidx.compose.runtime.a, int, int, int):void");
    }

    public static final void e(List list, ym0.p pVar, ym0.l lVar, ym0.l lVar2, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b g11 = aVar.g(-1528005313);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        nk.a0.g(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar2, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.customizeScreens_includedMeasurements, g11));
        r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar2, yk.h.f()), g11);
        g11.s(957739806);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(SlideState.f34050a);
            }
            SlideState[] slideStateArr = (SlideState[]) arrayList.toArray(new SlideState[0]);
            Object[] copyOf = Arrays.copyOf(slideStateArr, slideStateArr.length);
            v1.w wVar = new v1.w();
            wVar.addAll(kotlin.collections.l.a0(copyOf));
            g11.n(wVar);
            t11 = wVar;
        }
        v1.w wVar2 = (v1.w) t11;
        g11.J();
        k1.y.f(list, new a1(wVar2, list, null), g11);
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (kotlin.jvm.internal.u.e(((sc0.b) listIterator.previous()).d(), b.InterfaceC1611b.a.f96886a)) {
                    i12 = listIterator.nextIndex();
                    break;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        int i14 = i12;
        androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        int i15 = androidx.compose.foundation.layout.e.f4229i;
        androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
            c11.invoke(k1.j1.a(g11), g11, 0);
            g11.s(2058660585);
            y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, 1148957401, new i1(list, i14, wVar2, pVar, lVar, lVar2)), g11, 1572864, 63);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new j1(list, pVar, lVar, lVar2, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void f(String str, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(1691525481);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            bVar = g11;
            wk.p.a(aVar, null, str, ay.b.u(C1987R.string._OK_, g11), 0L, aVar, null, 0L, aVar, g11, ((i12 >> 3) & 14) | 48 | ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | ((i12 << 12) & 458752) | ((i12 << 21) & 234881024), 208);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new k1(str, aVar, i11));
        }
    }

    public static final void g(String str, String str2, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.b g11 = aVar3.g(-305354432);
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
            if (g11.K(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(aVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(aVar2)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            wk.p.a(aVar, null, ay.b.v(C1987R.string.screenCustomization_enablingChildWarning, new Object[]{str, str2}, g11), ay.b.u(C1987R.string._OK_, g11), 0L, aVar2, ay.b.u(C1987R.string._CANCEL_, g11), 0L, aVar, g11, ((i12 >> 6) & 14) | 48 | (458752 & (i12 << 6)) | ((i12 << 18) & 234881024), ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l1(str, str2, aVar, aVar2, i11));
        }
    }

    public static final void h(List list, ym0.l lVar, ym0.l lVar2, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        androidx.compose.runtime.b g11 = aVar3.g(1422604967);
        e.a aVar4 = androidx.compose.ui.e.f8927a;
        nk.a0.g(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar4, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.customizeScreens_includedMeasurements, g11));
        r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar4, yk.h.f()), g11);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sc0.c cVar = (sc0.c) it.next();
            e.a aVar5 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar5, 1.0f);
            int i12 = androidx.compose.foundation.layout.e.f4229i;
            androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
                String c12 = cVar.c();
                g11.s(1213337968);
                if (c12 != null) {
                    nk.a0.i(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar5, yk.h.o(), 0.0f, 2), null, c12);
                }
                g11.J();
                y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, 1917236969, new u1(cVar, aVar, aVar2, lVar2, lVar)), g11, 1572864, 63);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new v1(list, lVar, lVar2, aVar, aVar2, i11));
        }
    }

    public static final long i(b.InterfaceC1611b interfaceC1611b, androidx.compose.runtime.a aVar) {
        long O;
        kotlin.jvm.internal.u.j(interfaceC1611b, "<this>");
        aVar.s(-1675419982);
        if ((interfaceC1611b instanceof b.InterfaceC1611b.g) || (interfaceC1611b instanceof b.InterfaceC1611b.a)) {
            O = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, 2078443065)).O();
            aVar.J();
        } else if (interfaceC1611b instanceof b.InterfaceC1611b.h) {
            O = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, 2078443162)).O();
            aVar.J();
        } else if (interfaceC1611b instanceof b.InterfaceC1611b.i) {
            aVar.J();
            O = ((yk.w) c3.b(aVar, 2078443249, 615317871)).b().e();
            aVar.J();
        } else if ((interfaceC1611b instanceof b.InterfaceC1611b.d) || (interfaceC1611b instanceof b.InterfaceC1611b.f) || (interfaceC1611b instanceof b.InterfaceC1611b.c) || (interfaceC1611b instanceof b.InterfaceC1611b.e) || (interfaceC1611b instanceof b.InterfaceC1611b.C1612b)) {
            aVar.J();
            O = ((yk.w) c3.b(aVar, 2078443562, 615317871)).b().e();
            aVar.J();
        } else {
            throw a0.a.c(aVar, 2078409737);
        }
        aVar.J();
        return O;
    }
}
