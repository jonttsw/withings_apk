package com.withings.fever.ui;

import android.content.Context;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v0;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.h1;
import com.withings.common.compose.component.n4;
import com.withings.common.compose.component.p4;
import com.withings.common.compose.component.y3;
import com.withings.fever.core.model.FeverLevel;
import com.withings.fever.ui.e0;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreScreensKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k1.o1;
import kotlin.NotImplementedError;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(0);
            this.f39322a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f39322a.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39324b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f39323a = aVar;
            this.f39324b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f39324b | 1);
            m.a(this.f39323a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<bs.b> f39325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<bs.b> list) {
            super(3);
            this.f39325a = list;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h SecondaryCard = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SecondaryCard, "$this$SecondaryCard");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                List<bs.b> list = this.f39325a;
                if (!list.isEmpty()) {
                    List<bs.b> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (bs.b bVar : list2) {
                            if (!bVar.a().isEmpty()) {
                                aVar2.s(-357634469);
                                m.g(null, list, aVar2, 64, 1);
                                aVar2.J();
                                break;
                            }
                        }
                    }
                }
                aVar2.s(-357634525);
                m.h(null, aVar2, 0, 1);
                aVar2.J();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<bs.b> f39326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<bs.b> list, int i11) {
            super(2);
            this.f39326a = list;
            this.f39327b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f39327b | 1);
            m.b(this.f39326a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<nm0.y> aVar) {
            super(0);
            this.f39328a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f39328a.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<nm0.y> aVar) {
            super(3);
            this.f39329a = aVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            r0.a0 DataVizScreen = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(DataVizScreen, "$this$DataVizScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(1909889819);
                ym0.a<nm0.y> aVar3 = this.f39329a;
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new s(aVar3);
                    aVar2.n(t11);
                }
                aVar2.J();
                ks.g.d((ym0.a) t11, null, 0, aVar2, 0, 6);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<ws.f, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<ws.f, nm0.y> f39330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ym0.l<? super ws.f, nm0.y> lVar) {
            super(1);
            this.f39330a = lVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(ws.f fVar) {
            ws.f timeGraphViewport = fVar;
            kotlin.jvm.internal.u.j(timeGraphViewport, "timeGraphViewport");
            this.f39330a.invoke(timeGraphViewport);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.l<GraphPeriod, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.p0<k1.r0<Boolean>> f39331a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ at.a f39332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.jvm.internal.p0<k1.r0<Boolean>> p0Var, at.a aVar) {
            super(1);
            this.f39331a = p0Var;
            this.f39332b = aVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(GraphPeriod graphPeriod) {
            boolean z5;
            GraphPeriod it = graphPeriod;
            kotlin.jvm.internal.u.j(it, "it");
            k1.r0<Boolean> r0Var = this.f39331a.f76257a;
            at.a aVar = this.f39332b;
            if (it != aVar.d() && it == GraphPeriod.f39502b) {
                z5 = true;
            } else {
                z5 = false;
            }
            r0Var.setValue(Boolean.valueOf(z5));
            aVar.f(it);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at.a f39333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.p0<k1.r0<Boolean>> f39334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<List<as.h>> f39335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k1.r0 r0Var, at.a aVar, kotlin.jvm.internal.p0 p0Var) {
            super(2);
            this.f39333a = aVar;
            this.f39334b = p0Var;
            this.f39335c = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                at.a aVar3 = this.f39333a;
                if (aVar3.d() == GraphPeriod.f39502b) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                l0.g.e(z5, null, androidx.compose.animation.p.h(null, 0.0f, 3).c(androidx.compose.animation.p.q(m0.k.d(1000, 0, null, 6), null, 2)), androidx.compose.animation.p.i(null, 3).c(androidx.compose.animation.p.s()), null, s1.b.b(aVar2, 1332132808, new u(this.f39335c, aVar3, this.f39334b)), aVar2, 200064, 18);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at.a f39336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.p0<k1.r0<Boolean>> f39337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1<Interval> f39338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<List<as.h>> f39339d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39340e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(at.a aVar, kotlin.jvm.internal.p0<k1.r0<Boolean>> p0Var, o1<Interval> o1Var, k1.r0<List<as.h>> r0Var, ym0.a<nm0.y> aVar2) {
            super(2);
            this.f39336a = aVar;
            this.f39337b = p0Var;
            this.f39338c = o1Var;
            this.f39339d = r0Var;
            this.f39340e = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            boolean z11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                kotlin.jvm.internal.p0<k1.r0<Boolean>> p0Var = this.f39337b;
                at.a aVar3 = this.f39336a;
                y yVar = new y(p0Var, aVar3);
                YearMonth of2 = YearMonth.of(aVar3.c().getYear(), aVar3.c().getMonthOfYear());
                if (aVar3.d() == GraphPeriod.f39504d) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                l0.g.e(z5, null, androidx.compose.animation.p.h(m0.k.d(1000, 0, null, 6), 0.0f, 2), null, null, s1.b.b(aVar2, 916805991, new v(of2, yVar, this.f39338c, this.f39339d)), aVar2, 196992, 26);
                if (aVar3.d() == GraphPeriod.f39502b) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l0.g.e(z11, null, androidx.compose.animation.p.h(m0.k.d(1000, 0, null, 6), 0.0f, 2), null, null, s1.b.b(aVar2, -1652166114, new x(this.f39340e, yVar, this.f39337b, this.f39336a, this.f39339d)), aVar2, 196992, 26);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at.a f39341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<bs.b> f39342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f39343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f39344d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39345e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(at.a aVar, List<bs.b> list, List<LearnMoreEntryTranslations> list2, boolean z5, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f39341a = aVar;
            this.f39342b = list;
            this.f39343c = list2;
            this.f39344d = z5;
            this.f39345e = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h DataVizScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(DataVizScreen, "$this$DataVizScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a0.f(0, 0, 28, 0L, aVar2, x0.j(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.y(), 0.0f, yk.h.h(), 4), null, ay.b.u(C1987R.string._HY_RESULT_DETAILS_TITLE_, aVar2));
                aVar2.s(1909894277);
                if (this.f39341a.d() == GraphPeriod.f39504d) {
                    m.b(this.f39342b, aVar2, 8);
                }
                aVar2.J();
                LearnMoreScreensKt.SectionLearnMore(ay.b.u(C1987R.string.weight_about_title, aVar2), this.f39343c, aVar2, 64);
                m.f(0, aVar2, this.f39345e, this.f39344d);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<ws.f, nm0.y> f39346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<as.h> f39347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f39348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<GraphPeriod> f39349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39350e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f39351f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39352g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39353h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List<bs.b> f39354i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f39355j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ym0.l<? super ws.f, nm0.y> lVar, List<as.h> list, List<LearnMoreEntryTranslations> list2, List<? extends GraphPeriod> list3, ym0.a<nm0.y> aVar, boolean z5, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, List<bs.b> list4, int i11) {
            super(2);
            this.f39346a = lVar;
            this.f39347b = list;
            this.f39348c = list2;
            this.f39349d = list3;
            this.f39350e = aVar;
            this.f39351f = z5;
            this.f39352g = aVar2;
            this.f39353h = aVar3;
            this.f39354i = list4;
            this.f39355j = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f39355j | 1);
            ym0.a<nm0.y> aVar2 = this.f39353h;
            List<bs.b> list = this.f39354i;
            m.c(this.f39346a, this.f39347b, this.f39348c, this.f39349d, this.f39350e, this.f39351f, this.f39352g, aVar2, list, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* renamed from: com.withings.fever.ui.m$m  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0513m extends kotlin.jvm.internal.w implements ym0.a<Interval> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<DateTime> f39356a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0513m(k1.r0<DateTime> r0Var) {
            super(0);
            this.f39356a = r0Var;
        }

        @Override // ym0.a
        public final Interval invoke() {
            return new Interval(this.f39356a.getValue(), DateTime.now());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.l<ws.f, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0 f39357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(o0 o0Var) {
            super(1);
            this.f39357a = o0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(ws.f fVar) {
            ws.f timeGraphViewport = fVar;
            kotlin.jvm.internal.u.j(timeGraphViewport, "timeGraphViewport");
            com.withings.fever.ui.b bVar = new com.withings.fever.ui.b(timeGraphViewport);
            o0 o0Var = this.f39357a;
            o0Var.getClass();
            if (!kotlin.jvm.internal.u.e(bVar, com.withings.fever.ui.a.f39217a)) {
                if (!kotlin.jvm.internal.u.e(bVar, com.withings.fever.ui.c.f39221a)) {
                    BuildersKt__Builders_commonKt.launch$default(h1.a(o0Var), null, null, new g0(o0Var, bVar.a(), null), 3, null);
                    return nm0.y.f85009a;
                }
                throw new NotImplementedError();
            }
            throw new NotImplementedError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0 f39358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39360c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f39361d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f39362e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(o0 o0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
            super(2);
            this.f39358a = o0Var;
            this.f39359b = aVar;
            this.f39360c = aVar2;
            this.f39361d = aVar3;
            this.f39362e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f39362e | 1);
            ym0.a<nm0.y> aVar2 = this.f39360c;
            ym0.a<nm0.y> aVar3 = this.f39361d;
            m.d(this.f39358a, this.f39359b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeverLevel f39363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(FeverLevel feverLevel) {
            super(3);
            this.f39363a = feverLevel;
        }

        @Override // ym0.q
        public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
            p4 listOf = p4Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(listOf, "$this$listOf");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.hwa09_usOnboarding_status_title, aVar2);
                FeverLevel feverLevel = this.f39363a;
                n4.b(null, u11, null, ay.b.u(r0.d(feverLevel), aVar2), r0.b(feverLevel, aVar2), false, aVar2, 196608, 5);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Double f39364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeverLevel f39365b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Double d11, FeverLevel feverLevel) {
            super(3);
            this.f39364a = d11;
            this.f39365b = feverLevel;
        }

        @Override // ym0.q
        public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
            Object c11;
            p4 listOf = p4Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(listOf, "$this$listOf");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.segmentalBodyComp_result_highest_title, aVar2);
                aVar2.s(-864386566);
                Double d11 = this.f39364a;
                if (d11 == null) {
                    c11 = null;
                } else {
                    c11 = jm.a.c((jm.a) aVar2.D(com.withings.core.ui.b.b()), 71, d11.doubleValue(), 0, 0, 60);
                }
                aVar2.J();
                if (c11 == null) {
                    c11 = "-";
                }
                n4.b(null, u11, null, String.valueOf(c11), r0.b(this.f39365b, aVar2), false, aVar2, 0, 37);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureScreen.kt */
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeverLevel f39366a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Double f39367b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39368c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f39369d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(FeverLevel feverLevel, Double d11, int i11, int i12) {
            super(2);
            this.f39366a = feverLevel;
            this.f39367b = d11;
            this.f39368c = i11;
            this.f39369d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f39368c | 1);
            m.e(this.f39366a, this.f39367b, aVar, g11, this.f39369d);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onBackPressed, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        int i13;
        kotlin.jvm.internal.u.j(onBackPressed, "onBackPressed");
        androidx.compose.runtime.b g11 = aVar.g(92280824);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackPressed)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            String u11 = ay.b.u(C1987R.string._TEMPERATURE_, g11);
            g11.s(153529060);
            if ((i12 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new a(onBackPressed);
                g11.n(t11);
            }
            g11.J();
            ks.g.a(null, u11, 0, false, (ym0.a) t11, null, null, g11, 3072, 101);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(onBackPressed, i11));
        }
    }

    public static final void b(List<bs.b> symptoms, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(symptoms, "symptoms");
        androidx.compose.runtime.b g11 = aVar.g(44877173);
        bk.m.b(ay.b.u(C1987R.string.cycleTracking_mostFrequentLogs_title, g11), androidx.compose.foundation.c.b(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), ((i1) g11.D(j1.e())).a(), x0.h.b(yk.h.h())), false, false, null, null, s1.b.b(g11, 19863256, new c(symptoms)), g11, 1572864, 60);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(symptoms, i11));
        }
    }

    /* JADX WARN: Type inference failed for: r11v23, types: [T, k1.r0] */
    public static final void c(ym0.l<? super ws.f, nm0.y> onAfterViewPortChange, List<as.h> data, List<LearnMoreEntryTranslations> article, List<? extends GraphPeriod> periods, ym0.a<nm0.y> onBackPressed, boolean z5, ym0.a<nm0.y> onAddManualMeasurement, ym0.a<nm0.y> onMenuClick, List<bs.b> symptoms, androidx.compose.runtime.a aVar, int i11) {
        DateTime a11;
        DateTime a12;
        DateTime dateTime;
        Object obj;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.u.j(onAfterViewPortChange, "onAfterViewPortChange");
        kotlin.jvm.internal.u.j(data, "data");
        kotlin.jvm.internal.u.j(article, "article");
        kotlin.jvm.internal.u.j(periods, "periods");
        kotlin.jvm.internal.u.j(onBackPressed, "onBackPressed");
        kotlin.jvm.internal.u.j(onAddManualMeasurement, "onAddManualMeasurement");
        kotlin.jvm.internal.u.j(onMenuClick, "onMenuClick");
        kotlin.jvm.internal.u.j(symptoms, "symptoms");
        androidx.compose.runtime.b g11 = aVar.g(-995232944);
        g11.s(-25003673);
        boolean K = g11.K(data);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            Iterator<T> it = data.iterator();
            if (!it.hasNext()) {
                a11 = null;
            } else {
                a11 = ((as.h) it.next()).a();
                while (it.hasNext()) {
                    DateTime a13 = ((as.h) it.next()).a();
                    if (a11.compareTo(a13) < 0) {
                        a11 = a13;
                    }
                }
            }
            t11 = androidx.compose.runtime.l0.f(a11, v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        g11.J();
        g11.s(-25003566);
        boolean K2 = g11.K(data);
        Object t12 = g11.t();
        if (K2 || t12 == a.C0060a.a()) {
            Iterator<T> it2 = data.iterator();
            if (!it2.hasNext()) {
                a12 = null;
            } else {
                a12 = ((as.h) it2.next()).a();
                while (it2.hasNext()) {
                    DateTime a14 = ((as.h) it2.next()).a();
                    if (a12.compareTo(a14) > 0) {
                        a12 = a14;
                    }
                }
            }
            if (a12 != null) {
                dateTime = a12.minusMonths(6);
            } else {
                dateTime = null;
            }
            t12 = androidx.compose.runtime.l0.f(dateTime, v0.f8878a);
            g11.n(t12);
        }
        k1.r0 r0Var2 = (k1.r0) t12;
        g11.J();
        g11.s(-25003446);
        boolean K3 = g11.K(data);
        Object t13 = g11.t();
        if (K3 || t13 == a.C0060a.a()) {
            DateTime dateTime2 = (DateTime) r0Var2.getValue();
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            ArrayList arrayList = new ArrayList();
            if (dateTime2 != null) {
                while (hn.a.b(dateTime2, now)) {
                    Iterator<T> it3 = data.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (hn.a.e(((as.h) obj).a(), dateTime2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    as.h hVar = (as.h) obj;
                    if (hVar == null) {
                        arrayList.add(new as.h(dateTime2, kotlin.collections.i0.f76187a, FeverLevel.f39199d, false, false));
                    } else {
                        arrayList.add(hVar);
                    }
                    dateTime2 = dateTime2.plusDays(1);
                    kotlin.jvm.internal.u.i(dateTime2, "plusDays(...)");
                }
            }
            t13 = androidx.compose.runtime.l0.f(arrayList, v0.f8878a);
            g11.n(t13);
        }
        k1.r0 r0Var3 = (k1.r0) t13;
        g11.J();
        GraphPeriod graphPeriod = GraphPeriod.f39502b;
        DateTime dateTime3 = (DateTime) r0Var.getValue();
        if (dateTime3 == null) {
            dateTime3 = DateTime.now();
        }
        kotlin.jvm.internal.u.g(dateTime3);
        at.a a15 = at.c.a(graphPeriod, dateTime3, g11);
        g11.s(-25003155);
        boolean K4 = g11.K((DateTime) r0Var2.getValue());
        Object t14 = g11.t();
        if (K4 || t14 == a.C0060a.a()) {
            t14 = androidx.compose.runtime.l0.e(new C0513m(r0Var2));
            g11.n(t14);
        }
        o1 o1Var = (o1) t14;
        g11.J();
        kotlin.jvm.internal.p0 p0Var = new kotlin.jvm.internal.p0();
        g11.s(-25002939);
        Object t15 = g11.t();
        if (t15 == a.C0060a.a()) {
            t15 = androidx.compose.runtime.l0.f(Boolean.FALSE, v0.f8878a);
            g11.n(t15);
        }
        g11.J();
        p0Var.f76257a = (k1.r0) t15;
        androidx.compose.ui.e p11 = ah.k.p(e1.d(androidx.compose.ui.e.f8927a));
        String u11 = ay.b.u(C1987R.string._TEMPERATURE_, g11);
        Interval interval = (Interval) o1Var.getValue();
        ys.d dVar = new ys.d(new ys.f());
        g11.s(-25002696);
        if ((((57344 & i11) ^ 24576) > 16384 && g11.K(onBackPressed)) || (i11 & 24576) == 16384) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object t16 = g11.t();
        if (z11 || t16 == a.C0060a.a()) {
            t16 = new e(onBackPressed);
            g11.n(t16);
        }
        ym0.a aVar2 = (ym0.a) t16;
        g11.J();
        s1.a b10 = s1.b.b(g11, -1904226788, new f(onMenuClick));
        g11.s(-25002569);
        if ((((i11 & 14) ^ 6) > 4 && g11.K(onAfterViewPortChange)) || (i11 & 6) == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        Object t17 = g11.t();
        if (z12 || t17 == a.C0060a.a()) {
            t17 = new g(onAfterViewPortChange);
            g11.n(t17);
        }
        g11.J();
        h hVar2 = new h(p0Var, a15);
        s1.a b11 = s1.b.b(g11, 425897712, new i(r0Var3, a15, p0Var));
        s1.a b12 = s1.b.b(g11, 10570895, new j(a15, p0Var, o1Var, r0Var3, onAddManualMeasurement));
        s1.a aVar3 = q0.f39403a;
        s1.a b13 = s1.b.b(g11, -926853978, new k(a15, symptoms, article, z5, onAddManualMeasurement));
        int i12 = at.a.f19549d;
        ks.g.b(u11, p11, a15, periods, interval, null, null, null, dVar, null, null, null, aVar2, b10, false, (ym0.l) t17, hVar2, b11, b12, aVar3, null, null, b13, g11, 134254592, 918580224, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 3149536);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(onAfterViewPortChange, data, article, periods, onBackPressed, z5, onAddManualMeasurement, onMenuClick, symptoms, i11));
        }
    }

    public static final void d(o0 viewModel, ym0.a<nm0.y> onBackPressed, ym0.a<nm0.y> addMeasurementIntent, ym0.a<nm0.y> showHistory, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onBackPressed, "onBackPressed");
        kotlin.jvm.internal.u.j(addMeasurementIntent, "addMeasurementIntent");
        kotlin.jvm.internal.u.j(showHistory, "showHistory");
        androidx.compose.runtime.b g11 = aVar.g(-1727417518);
        k1.r0 b10 = androidx.compose.runtime.l0.b(viewModel.y0(), g11);
        e0 e0Var = (e0) b10.getValue();
        if (e0Var instanceof e0.b) {
            g11.s(70670310);
            e0 e0Var2 = (e0) b10.getValue();
            kotlin.jvm.internal.u.h(e0Var2, "null cannot be cast to non-null type com.withings.fever.ui.BodyTemperatureState.Ready");
            e0.b bVar = (e0.b) e0Var2;
            List<as.h> b11 = bVar.b();
            List<GraphPeriod> c11 = bVar.c();
            List X = kotlin.collections.x.X(bVar.d());
            int i12 = i11 << 12;
            c(new n(viewModel), b11, bVar.a(), c11, onBackPressed, !bVar.e(), addMeasurementIntent, showHistory, X, g11, ((i11 << 9) & 57344) | 134222400 | (3670016 & i12) | (i12 & 29360128));
            g11.J();
        } else if (e0Var instanceof e0.a) {
            g11.s(70671142);
            a(onBackPressed, g11, (i11 >> 3) & 14);
            g11.J();
        } else {
            g11.s(70671195);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new o(viewModel, onBackPressed, addMeasurementIntent, showHistory, i11));
        }
    }

    public static final void e(FeverLevel feverLevel, Double d11, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(feverLevel, "feverLevel");
        androidx.compose.runtime.b g11 = aVar.g(-71362794);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(feverLevel)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.K(d11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            if (i16 != 0) {
                d11 = null;
            }
            n4.a(null, 0.0f, 0.0f, kotlin.collections.x.W(s1.b.b(g11, -1719598570, new p(feverLevel)), s1.b.b(g11, 918362485, new q(d11, feverLevel))), false, null, g11, 3072, 55);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new r(feverLevel, d11, i11, i12));
        }
    }

    public static final void f(int i11, androidx.compose.runtime.a aVar, ym0.a onAddManualMeasurement, boolean z5) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onAddManualMeasurement, "onAddManualMeasurement");
        androidx.compose.runtime.b g11 = aVar.g(527727356);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onAddManualMeasurement)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            Context context = (Context) g11.D(u0.d());
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e h11 = x0.h(aVar2, 0.0f, yk.h.y(), 1);
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(h11);
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
                nk.a0.f(0, 0, 28, 0L, g11, x0.j(x0.h(aVar2, og.y.a(0, c11, k1.j1.a(g11), g11, 2058660585), 0.0f, 2), 0.0f, 0.0f, 0.0f, yk.h.h(), 7), null, ay.b.u(C1987R.string.options, g11));
                y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, -923801194, new a0(context)), g11, 1572864, 63);
                g11.s(1837531666);
                if (z5) {
                    y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, -458859663, new c0(onAddManualMeasurement)), g11, 1572864, 63);
                }
                androidx.compose.material3.d.c(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d0(i11, onAddManualMeasurement, z5));
        }
    }

    public static final void g(ym0.a aVar, List list, androidx.compose.runtime.a aVar2, int i11, int i12) {
        com.withings.fever.ui.n nVar;
        androidx.compose.runtime.b g11 = aVar2.g(640269913);
        if ((i12 & 1) != 0) {
            nVar = com.withings.fever.ui.n.f39370a;
        } else {
            nVar = aVar;
        }
        g11.s(-483455358);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
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
            ym0.a aVar4 = nVar;
            int i13 = -1323940314;
            nk.a.d(null, "**The logs you made most over the month.", 0L, null, 0, 0, null, g11, 48, 125);
            androidx.compose.ui.e j5 = x0.j(aVar3, 0.0f, 0.0f, 0.0f, yk.h.h(), 7);
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b12 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a12 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(j5);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b13 = com.withings.authentication.e.b(g11, b12, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                }
                int i14 = 0;
                dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                g11.s(-2014634125);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bs.b bVar = (bs.b) it.next();
                    Integer a13 = bVar.b().a();
                    g11.s(715155673);
                    if (a13 != null) {
                        int intValue = a13.intValue();
                        androidx.compose.ui.e j11 = x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.d(), 0.0f, 0.0f, 13);
                        String upperCase = ay.b.u(intValue, g11).toUpperCase(Locale.ROOT);
                        kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                        nk.a0.b(0, 0, 26, 0L, g11, j11, null, upperCase);
                        nm0.y yVar = nm0.y.f85009a;
                    }
                    g11.J();
                    androidx.compose.ui.e j12 = x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.b(), 0.0f, yk.h.b(), 5);
                    int i15 = androidx.compose.foundation.layout.e.f4229i;
                    e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.b());
                    e.h o12 = androidx.compose.foundation.layout.e.o(yk.h.b());
                    g11.s(1098475987);
                    androidx.compose.ui.layout.l0 f11 = androidx.compose.foundation.layout.q.f(o12, o11, Integer.MAX_VALUE, g11);
                    g11.s(i13);
                    int G3 = g11.G();
                    k1.v0 l11 = g11.l();
                    androidx.compose.ui.node.g.D.getClass();
                    ym0.a a14 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(j12);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a14);
                        } else {
                            g11.m();
                        }
                        ym0.p b14 = com.withings.authentication.e.b(g11, f11, g11, l11);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G3))) {
                            androidx.camera.camera2.internal.l0.d(G3, g11, G3, b14);
                        }
                        char c14 = 43753;
                        dq.x.b(i14, c13, k1.j1.a(g11), g11, 2058660585);
                        r0.p pVar = r0.p.f94295a;
                        g11.s(715156222);
                        for (bs.a aVar5 : bVar.a()) {
                            xj.b.a(androidx.compose.ui.e.f8927a, s2.b.a(aVar5.a().a(), g11), s1.b.b(g11, 1798246448, new com.withings.fever.ui.o(aVar5)), null, false, s2.b.a(aVar5.a().b(), g11), s1.b.b(g11, -794485964, new com.withings.fever.ui.p(aVar5)), null, g11, 14156166, 24);
                            i13 = i13;
                            c14 = c14;
                            i14 = i14;
                        }
                        androidx.compose.material3.d.c(g11);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                }
                g11.J();
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
                    o02.G(new com.withings.fever.ui.q(aVar4, list, i11, i12));
                    return;
                }
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    public static final void h(androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(1814667419);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(eVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            if (i15 != 0) {
                eVar = androidx.compose.ui.e.f8927a;
            }
            g11.s(-483455358);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
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
                nk.a.d(null, "** No logs this months.", 0L, null, 0, 0, null, g11, 48, 125);
                n0.z.a(s2.d.a(2131231262, g11), null, androidx.compose.foundation.c.b(x0.h(e1.e(eVar, 1.0f), 0.0f, yk.h.B(), 1), ((i1) g11.D(j1.e())).a(), x0.h.b(yk.h.h())), null, null, 0.0f, null, g11, 56, 120);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.fever.ui.r(eVar, i11, i12));
        }
    }
}
