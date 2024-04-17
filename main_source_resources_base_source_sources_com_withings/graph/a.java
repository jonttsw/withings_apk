package com.withings.graph;

import ah.o;
import android.content.Context;
import android.graphics.RectF;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.g6;
import androidx.compose.material.h6;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.compose.runtime.v0;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.analytics.instance.CallBack;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.filters.Filter;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.List;
import k1.j1;
import k1.r0;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import x1.b;
import xs.c;
import ym0.p;
import ym0.q;
/* compiled from: GraphViewCompose.kt */
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GraphViewCompose.kt */
    /* renamed from: com.withings.graph.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0517a extends w implements ym0.l<Context, GraphView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ xs.c f39565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RectF f39566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Filter f39567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<String> f39568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0517a(xs.c cVar, RectF rectF, Filter filter, List<String> list) {
            super(1);
            this.f39565a = cVar;
            this.f39566b = rectF;
            this.f39567c = filter;
            this.f39568d = list;
        }

        @Override // ym0.l
        public final GraphView invoke(Context context) {
            Context context2 = context;
            u.j(context2, "context");
            GraphView graphView = new GraphView(context2);
            graphView.setModifier(this.f39565a);
            RectF rectF = this.f39566b;
            graphView.D(rectF.left, rectF.bottom, rectF.right, rectF.top);
            graphView.C(this.f39567c, this.f39568d);
            graphView.f39530q = false;
            graphView.f39532r = false;
            graphView.f39524n = false;
            graphView.f39534s = false;
            graphView.setZoomEnabled(false);
            return graphView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GraphViewCompose.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements ym0.l<GraphView, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ xs.c f39569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RectF f39570b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Filter f39571c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<String> f39572d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<ts.d> f39573e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<Decorator> f39574f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ r0<RectF> f39575g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ r0<Filter> f39576h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(xs.c cVar, RectF rectF, Filter filter, List<String> list, List<? extends ts.d> list2, List<? extends Decorator> list3, r0<RectF> r0Var, r0<Filter> r0Var2) {
            super(1);
            this.f39569a = cVar;
            this.f39570b = rectF;
            this.f39571c = filter;
            this.f39572d = list;
            this.f39573e = list2;
            this.f39574f = list3;
            this.f39575g = r0Var;
            this.f39576h = r0Var2;
        }

        @Override // ym0.l
        public final y invoke(GraphView graphView) {
            GraphView graphView2 = graphView;
            u.j(graphView2, "graphView");
            xs.c cVar = graphView2.f39525n0;
            xs.c cVar2 = this.f39569a;
            if (cVar2 != cVar) {
                graphView2.setModifier(cVar2);
            }
            r0<RectF> r0Var = this.f39575g;
            RectF rectF = this.f39570b;
            if (!u.e(r0Var.getValue(), rectF)) {
                r0Var.setValue(rectF);
                RectF rectF2 = new RectF(rectF.left, rectF.bottom, rectF.right, rectF.top);
                graphView2.f39510b = rectF2;
                graphView2.f39511c = rectF2;
            }
            r0<Filter> r0Var2 = this.f39576h;
            Filter value = r0Var2.getValue();
            Filter filter = this.f39571c;
            if (value != filter) {
                graphView2.C(filter, this.f39572d);
                r0Var2.setValue(filter);
            }
            ArrayList arrayList = graphView2.f39518j;
            List<ts.d> list = this.f39573e;
            if (!arrayList.containsAll(list)) {
                graphView2.i();
                arrayList.addAll(list);
            }
            ArrayList arrayList2 = graphView2.f39517i;
            List<Decorator> list2 = this.f39574f;
            if (!arrayList2.containsAll(list2)) {
                graphView2.h();
                arrayList2.addAll(list2);
            }
            graphView2.invalidate();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GraphViewCompose.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f39577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RectF f39578b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<ts.d> f39579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Filter f39580d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f39581e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<Decorator> f39582f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ xs.c f39583g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f39584h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f39585i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.e eVar, RectF rectF, List<? extends ts.d> list, Filter filter, List<String> list2, List<? extends Decorator> list3, xs.c cVar, int i11, int i12) {
            super(2);
            this.f39577a = eVar;
            this.f39578b = rectF;
            this.f39579c = list;
            this.f39580d = filter;
            this.f39581e = list2;
            this.f39582f = list3;
            this.f39583g = cVar;
            this.f39584h = i11;
            this.f39585i = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f39584h | 1);
            List<Decorator> list = this.f39582f;
            xs.c cVar = this.f39583g;
            a.a(this.f39577a, this.f39578b, this.f39579c, this.f39580d, this.f39581e, list, cVar, aVar, g11, this.f39585i);
            return y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, RectF fixedViewport, List<? extends ts.d> list, Filter filter, List<String> list2, List<? extends Decorator> list3, xs.c cVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        i0 i0Var;
        Filter filter2;
        List<String> list4;
        i0 i0Var2;
        c.a aVar3;
        u.j(fixedViewport, "fixedViewport");
        androidx.compose.runtime.b g11 = aVar.g(-391034726);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        int i13 = i12 & 4;
        i0 i0Var3 = i0.f76187a;
        if (i13 != 0) {
            i0Var = i0Var3;
        } else {
            i0Var = list;
        }
        if ((i12 & 8) != 0) {
            filter2 = Filter.f39917a;
        } else {
            filter2 = filter;
        }
        if ((i12 & 16) != 0) {
            list4 = x.V("TAG_MAIN_GRAPH");
        } else {
            list4 = list2;
        }
        if ((i12 & 32) != 0) {
            i0Var2 = i0Var3;
        } else {
            i0Var2 = list3;
        }
        if ((i12 & 64) != 0) {
            aVar3 = xs.c.f107461a;
        } else {
            aVar3 = cVar;
        }
        g11.s(307463735);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f(filter2, v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, 307463799);
        if (a11 == a.C0060a.a()) {
            a11 = l0.f(fixedViewport, v0.f8878a);
            g11.n(a11);
        }
        r0 r0Var2 = (r0) a11;
        g11.J();
        g11.s(733328855);
        androidx.compose.ui.layout.l0 d11 = androidx.compose.foundation.layout.k.d(b.a.o(), false, g11);
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
            p b10 = com.withings.authentication.e.b(g11, d11, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            xs.c cVar2 = aVar3;
            androidx.compose.ui.viewinterop.d.a(new C0517a(aVar3, fixedViewport, filter2, list4), e1.d(androidx.compose.ui.e.f8927a), new b(aVar3, fixedViewport, filter2, list4, i0Var, i0Var2, r0Var2, r0Var), g11, 48, 0);
            v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new c(aVar2, fixedViewport, i0Var, filter2, list4, i0Var2, cVar2, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0147, code lost:
        if (r15.K(r39) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r35, int r36, int r37, androidx.compose.runtime.a r38, k1.r0 r39, androidx.compose.ui.e r40, com.withings.graph.filters.Filter r41, xs.c r42, ys.c r43, at.a r44, java.util.List r45, java.util.List r46, java.util.List r47, ym0.l r48, ym0.q r49, ym0.q r50, boolean r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.graph.a.b(int, int, int, androidx.compose.runtime.a, k1.r0, androidx.compose.ui.e, com.withings.graph.filters.Filter, xs.c, ys.c, at.a, java.util.List, java.util.List, java.util.List, ym0.l, ym0.q, ym0.q, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(int i11, int i12, int i13, androidx.compose.runtime.a aVar, r0 r0Var, androidx.compose.ui.e eVar, Filter filter, xs.c cVar, ys.c cVar2, at.a aVar2, List list, List list2, List list3, ym0.l lVar, q qVar, q qVar2, boolean z5, boolean z11) {
        int i14;
        at.a aVar3;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        int i15;
        ParcelableSnapshotMutableState f11;
        androidx.compose.runtime.b g11 = aVar.g(-1097549693);
        e.a aVar4 = (i13 & 1) != 0 ? androidx.compose.ui.e.f8927a : eVar;
        if ((i13 & 2) != 0) {
            GraphPeriod graphPeriod = GraphPeriod.f39503c;
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            at.a a11 = at.c.a(graphPeriod, now, g11);
            i14 = i11 & CallBack.OAID_TRACKING_OFF;
            aVar3 = a11;
        } else {
            i14 = i11;
            aVar3 = aVar2;
        }
        boolean z12 = (i13 & 4) != 0 ? true : z5;
        int i16 = i13 & 8;
        i0 i0Var = i0.f76187a;
        i0 i0Var2 = i16 != 0 ? i0Var : list;
        i0 i0Var3 = (i13 & 64) != 0 ? i0Var : list3;
        c.a aVar5 = (i13 & 128) != 0 ? xs.c.f107461a : cVar;
        ys.c cVar3 = (i13 & 256) != 0 ? null : cVar2;
        boolean z13 = (i13 & 512) != 0 ? true : z11;
        e eVar2 = (i13 & 1024) != 0 ? e.f39915a : lVar;
        f fVar = (i13 & ModuleCopy.f28574b) != 0 ? f.f39916a : qVar;
        q qVar3 = (i13 & 4096) != 0 ? null : qVar2;
        if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            f11 = l0.f(Boolean.FALSE, v0.f8878a);
            i15 = i12 & (-7169);
            parcelableSnapshotMutableState = f11;
        } else {
            parcelableSnapshotMutableState = r0Var;
            i15 = i12;
        }
        g11.s(1055623886);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f(filter, v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var2 = (r0) t11;
        g11.J();
        g11.s(733328855);
        e.a aVar6 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar6);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            p b10 = com.withings.authentication.e.b(g11, d11, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            c11.invoke(j1.a(g11), g11, 0);
            g11.s(2058660585);
            androidx.compose.ui.viewinterop.d.a(new j(aVar5, aVar3, filter, list2, qVar3, z12, fVar, parcelableSnapshotMutableState), aVar4, new k(cVar3, aVar5, filter, list2, i0Var2, i0Var3, aVar3, r0Var2), g11, (i14 << 3) & 112, 0);
            g11.s(1055629294);
            if (cVar3 != null) {
                ns.e.a(null, cVar3.c().getValue(), z13, eVar2, g11, ((i14 >> 21) & ConstantsWs.HWFAILURE_ZERO) | 64 | ((i15 << 9) & 7168), 1);
            }
            v a13 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a13 != null) {
                a13.G(new l(i11, i12, i13, parcelableSnapshotMutableState, aVar4, filter, aVar5, cVar3, aVar3, i0Var2, list2, i0Var3, eVar2, fVar, qVar3, z12, z13));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}
