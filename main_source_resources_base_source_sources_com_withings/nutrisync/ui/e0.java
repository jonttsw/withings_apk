package com.withings.nutrisync.ui;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.g6;
import androidx.compose.material3.o7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.huawei.hms.analytics.instance.CallBack;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.common.compose.component.x4;
import com.withings.common.compose.component.z4;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreScreensKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.nutrisync.ui.viewmodel.VitaminCViewModel;
import com.withings.wiscale2.C1987R;
import i6.a;
import java.util.List;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import m10.b;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import x1.b;
import x1.d;
/* compiled from: VitaminCScreen.kt */
/* loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.VitaminCScreenKt$VitaminCDatavizScreen$1", f = "VitaminCScreen.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VitaminCViewModel f43230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Throwable, nm0.y> f43231c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VitaminCScreen.kt */
        /* renamed from: com.withings.nutrisync.ui.e0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0579a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.l<Throwable, nm0.y> f43232a;

            /* JADX WARN: Multi-variable type inference failed */
            C0579a(ym0.l<? super Throwable, nm0.y> lVar) {
                this.f43232a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    this.f43232a.invoke(th2);
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(VitaminCViewModel vitaminCViewModel, ym0.l<? super Throwable, nm0.y> lVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f43230b = vitaminCViewModel;
            this.f43231c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f43230b, this.f43231c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f43229a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                StateFlow<Throwable> i02 = this.f43230b.i0();
                C0579a c0579a = new C0579a(this.f43231c);
                this.f43229a = 1;
                if (i02.collect(c0579a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.s implements ym0.p<GraphPeriod, DateTime, nm0.y> {
        b(VitaminCViewModel vitaminCViewModel) {
            super(2, vitaminCViewModel, VitaminCViewModel.class, "onAfterViewportChanged", "onAfterViewportChanged$ui_release(Lcom/withings/graph/GraphPeriod;Lorg/joda/time/DateTime;)V", 0);
        }

        @Override // ym0.p
        public final nm0.y invoke(GraphPeriod graphPeriod, DateTime dateTime) {
            GraphPeriod p02 = graphPeriod;
            DateTime p12 = dateTime;
            kotlin.jvm.internal.u.j(p02, "p0");
            kotlin.jvm.internal.u.j(p12, "p1");
            ((VitaminCViewModel) this.receiver).k0(p02, p12);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VitaminCViewModel f43233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Throwable, nm0.y> f43234b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43235c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f43236d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43237e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43238f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f43239g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f43240h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(VitaminCViewModel vitaminCViewModel, ym0.l<? super Throwable, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar2, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11, int i12) {
            super(2);
            this.f43233a = vitaminCViewModel;
            this.f43234b = lVar;
            this.f43235c = aVar;
            this.f43236d = lVar2;
            this.f43237e = aVar2;
            this.f43238f = aVar3;
            this.f43239g = i11;
            this.f43240h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43239g | 1);
            ym0.a<nm0.y> aVar2 = this.f43237e;
            ym0.a<nm0.y> aVar3 = this.f43238f;
            e0.a(this.f43233a, this.f43234b, this.f43235c, this.f43236d, aVar2, aVar3, aVar, g11, this.f43240h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<ws.f, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<GraphPeriod, DateTime, nm0.y> f43241a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar) {
            super(1);
            this.f43241a = pVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(ws.f fVar) {
            ws.f timeGraphViewport = fVar;
            kotlin.jvm.internal.u.j(timeGraphViewport, "timeGraphViewport");
            this.f43241a.invoke(timeGraphViewport.b(), timeGraphViewport.a());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.c f43242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b.c cVar) {
            super(2);
            this.f43242a = cVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                k10.a.a(false, this.f43242a.b().a(), aVar2, 6);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.c f43243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ at.a f43244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b.c cVar, at.a aVar) {
            super(2);
            this.f43243a = cVar;
            this.f43244b = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                at.a dataVizViewportState = this.f43244b;
                new f0(dataVizViewportState);
                ws.e uiState = this.f43243a.c();
                kotlin.jvm.internal.u.j(uiState, "uiState");
                kotlin.jvm.internal.u.j(dataVizViewportState, "dataVizViewportState");
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.c f43245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43246b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f43247c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> f43248d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> f43249e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<GraphPeriod, DateTime, nm0.y> f43250f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f43251g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f43252h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(b.c cVar, ym0.a<nm0.y> aVar, z4 z4Var, ym0.q<? super r0.a0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, ym0.q<? super r0.h, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar2, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, int i11, int i12) {
            super(2);
            this.f43245a = cVar;
            this.f43246b = aVar;
            this.f43247c = z4Var;
            this.f43248d = qVar;
            this.f43249e = qVar2;
            this.f43250f = pVar;
            this.f43251g = i11;
            this.f43252h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43251g | 1);
            ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> qVar = this.f43249e;
            ym0.p<GraphPeriod, DateTime, nm0.y> pVar = this.f43250f;
            e0.b(this.f43245a, this.f43246b, this.f43247c, this.f43248d, qVar, pVar, aVar, g11, this.f43252h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43253a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<nm0.y> aVar) {
            super(3);
            this.f43253a = aVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            r0.a0 VitaminCDatavizScreen = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(VitaminCDatavizScreen, "$this$VitaminCDatavizScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                ks.g.d(this.f43253a, null, 0, aVar2, 0, 6);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m10.b f43254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f43255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(m10.b bVar, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar, ym0.a<nm0.y> aVar) {
            super(3);
            this.f43254a = bVar;
            this.f43255b = lVar;
            this.f43256c = aVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h VitaminCDatavizScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(VitaminCDatavizScreen, "$this$VitaminCDatavizScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e0.d(this.f43254a, this.f43255b, this.f43256c, aVar2, 64);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VitaminCScreen.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m10.b f43257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z4 f43258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43259c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<GraphPeriod, DateTime, nm0.y> f43260d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f43261e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43262f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43263g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f43264h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f43265i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(m10.b bVar, z4 z4Var, ym0.a<nm0.y> aVar, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11, int i12) {
            super(2);
            this.f43257a = bVar;
            this.f43258b = z4Var;
            this.f43259c = aVar;
            this.f43260d = pVar;
            this.f43261e = lVar;
            this.f43262f = aVar2;
            this.f43263g = aVar3;
            this.f43264h = i11;
            this.f43265i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43264h | 1);
            ym0.a<nm0.y> aVar2 = this.f43262f;
            ym0.a<nm0.y> aVar3 = this.f43263g;
            e0.c(this.f43257a, this.f43258b, this.f43259c, this.f43260d, this.f43261e, aVar2, aVar3, aVar, g11, this.f43265i);
            return nm0.y.f85009a;
        }
    }

    public static final void a(VitaminCViewModel vitaminCViewModel, ym0.l<? super Throwable, nm0.y> onError, ym0.a<nm0.y> onBackClick, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> onShareHealthReport, ym0.a<nm0.y> onMenuClick, ym0.a<nm0.y> onSecondaryCardHelpClicked, androidx.compose.runtime.a aVar, int i11, int i12) {
        VitaminCViewModel vitaminCViewModel2;
        int i13;
        i6.a aVar2;
        kotlin.jvm.internal.u.j(onError, "onError");
        kotlin.jvm.internal.u.j(onBackClick, "onBackClick");
        kotlin.jvm.internal.u.j(onShareHealthReport, "onShareHealthReport");
        kotlin.jvm.internal.u.j(onMenuClick, "onMenuClick");
        kotlin.jvm.internal.u.j(onSecondaryCardHelpClicked, "onSecondaryCardHelpClicked");
        androidx.compose.runtime.b g11 = aVar.g(-726321760);
        if ((i12 & 1) != 0) {
            g11.s(1890788296);
            n1 a11 = j6.a.a(g11);
            if (a11 != null) {
                fk0.c a12 = e6.a.a(a11, g11);
                g11.s(1729797275);
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a13 = j6.b.a(VitaminCViewModel.class, a11, null, a12, aVar2, g11);
                g11.J();
                g11.J();
                i13 = i11 & (-15);
                vitaminCViewModel2 = (VitaminCViewModel) a13;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            vitaminCViewModel2 = vitaminCViewModel;
            i13 = i11;
        }
        r0 a14 = h6.b.a(vitaminCViewModel2.j0(), b.C1279b.f81040a, g11, 56);
        k1.y.f("collect-error", new a(vitaminCViewModel2, onError, null), g11);
        VitaminCViewModel vitaminCViewModel3 = vitaminCViewModel2;
        c((m10.b) a14.getValue(), x4.b(g11), onBackClick, new b(vitaminCViewModel2), onShareHealthReport, onSecondaryCardHelpClicked, onMenuClick, g11, (i13 & ConstantsWs.HWFAILURE_ZERO) | Utils.MAX_EVENT_SIZE | (458752 & i13) | ((i13 << 6) & 3670016), 0);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(vitaminCViewModel3, onError, onBackClick, onShareHealthReport, onMenuClick, onSecondaryCardHelpClicked, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AutoboxingStateCreation"})
    public static final void b(b.c cVar, ym0.a<nm0.y> aVar, z4 z4Var, ym0.q<? super r0.a0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, ym0.q<? super r0.h, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar2, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, androidx.compose.runtime.a aVar2, int i11, int i12) {
        z4 z4Var2;
        int i13;
        Interval e11;
        boolean z5;
        androidx.compose.runtime.b g11 = aVar2.g(272638547);
        if ((i12 & 4) != 0) {
            i13 = i11 & (-897);
            z4Var2 = x4.b(g11);
        } else {
            z4Var2 = z4Var;
            i13 = i11;
        }
        DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        kotlin.jvm.internal.u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        at.a a11 = at.c.a((GraphPeriod) kotlin.collections.x.I(cVar.a()), withTimeAtStartOfDay, g11);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e p11 = ah.k.p(e1.d(aVar3));
        String u11 = ay.b.u(C1987R.string.Cycle_Tracking_feature_title, g11);
        List<GraphPeriod> a12 = cVar.a();
        ws.e c11 = cVar.c();
        if (c11 == null || (e11 = c11.a()) == null) {
            e11 = ks.g.e();
        }
        Interval interval = e11;
        ys.d dVar = new ys.d(new ys.f());
        g11.s(-378722632);
        if ((((458752 & i11) ^ 196608) > 131072 && g11.K(pVar)) || (i11 & 196608) == 131072) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object t11 = g11.t();
        if (z5 || t11 == a.C0060a.a()) {
            t11 = new d(pVar);
            g11.n(t11);
        }
        g11.J();
        s1.a b10 = s1.b.b(g11, 2134626995, new e(cVar));
        s1.a b11 = s1.b.b(g11, 1173001780, new f(cVar, a11));
        s1.a aVar4 = com.withings.nutrisync.ui.a.f43214a;
        int i14 = at.a.f19549d;
        int i15 = i13 >> 6;
        ks.g.b(u11, p11, a11, a12, interval, null, null, null, dVar, null, null, null, aVar, qVar, false, (ym0.l) t11, null, b10, b11, aVar4, null, null, qVar2, g11, 134254592, ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO) | 918552576 | (i13 & 7168), i15 & ConstantsWs.HWFAILURE_ZERO, 3231456);
        androidx.compose.ui.e s11 = ah.k.s(e1.e(aVar3, 1.0f));
        g11.s(733328855);
        l0 d11 = g6.d(false, g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(s11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            ym0.p b12 = com.withings.authentication.e.b(g11, d11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
            }
            dq.x.b(0, c12, j1.a(g11), g11, 2058660585);
            x4.a(z4Var2, x0.f(androidx.compose.foundation.layout.m.f4307a.g(aVar3, b.a.m()), yk.h.b()), g11, i15 & 14, 0);
            g11.J();
            g11.o();
            g11.J();
            g11.J();
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new g(cVar, aVar, z4Var2, qVar, qVar2, pVar, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(m10.b bVar, z4 z4Var, ym0.a<nm0.y> aVar, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, androidx.compose.runtime.a aVar4, int i11, int i12) {
        z4 z4Var2;
        int i13;
        androidx.compose.runtime.b g11 = aVar4.g(-1853569917);
        if ((i12 & 2) != 0) {
            z4 b10 = x4.b(g11);
            i13 = i11 & CallBack.OAID_TRACKING_OFF;
            z4Var2 = b10;
        } else {
            z4Var2 = z4Var;
            i13 = i11;
        }
        if (bVar instanceof b.c) {
            g11.s(-1100862151);
            b((b.c) bVar, aVar, z4Var2, s1.b.b(g11, 1678881341, new h(aVar3)), s1.b.b(g11, 35236148, new i(bVar, lVar, aVar2)), pVar, g11, ((i13 >> 3) & 112) | 27656 | ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO) | ((i13 << 6) & 458752), 0);
            g11.J();
        } else if (bVar instanceof b.C1279b) {
            g11.s(-1100861519);
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            e.b b11 = androidx.compose.foundation.layout.e.b();
            d.a g12 = b.a.g();
            g11.s(-483455358);
            l0 a11 = androidx.compose.foundation.layout.n.a(b11, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
                }
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                o7.a(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                androidx.camera.camera2.internal.l0.e(g11);
            } else {
                a3.g.s();
                throw null;
            }
        } else {
            g11.s(-1100861280);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(bVar, z4Var2, aVar, pVar, lVar, aVar2, aVar3, i11, i12));
        }
    }

    public static final void d(m10.b bVar, ym0.l lVar, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        b.c cVar;
        b.c.C1280b c1280b;
        b.d dVar;
        b.c.a b10;
        androidx.compose.runtime.b g11 = aVar2.g(284760152);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        List<LearnMoreEntryTranslations> list = null;
        if (bVar instanceof b.c) {
            cVar = (b.c) bVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            c1280b = cVar.b();
        } else {
            c1280b = null;
        }
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        l0 a12 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, a12, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            if (c1280b != null) {
                dVar = c1280b.c();
            } else {
                dVar = null;
            }
            k10.e.a(bVar instanceof b.C1279b, dVar, aVar, null, g11, i11 & ConstantsWs.HWFAILURE_ZERO, 8);
            String u11 = ay.b.u(C1987R.string.detailView_education_title, g11);
            if (c1280b != null && (b10 = c1280b.b()) != null) {
                list = b10.a();
            }
            if (list == null) {
                list = i0.f76187a;
            }
            LearnMoreScreensKt.SectionLearnMore(u11, list, g11, 64);
            k10.d.a(new c0(a11, lVar), g11, 0);
            g11.J();
            g11.o();
            g11.J();
            g11.J();
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new d0(bVar, lVar, aVar, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}
