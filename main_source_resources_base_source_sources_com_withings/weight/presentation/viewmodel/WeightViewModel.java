package com.withings.weight.presentation.viewmodel;

import androidx.activity.b0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.common.compose.component.m4;
import com.withings.graph.GraphPeriod;
import com.withings.graph.filters.Filter;
import com.withings.graph.model.NormalityZoneUiModel;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.weight.presentation.ui.model.SecondaryGraphUnit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import m90.f;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import q80.a;
import ws.c;
/* compiled from: WeightViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/presentation/viewmodel/WeightViewModel;", "Landroidx/lifecycle/g1;", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WeightViewModel extends g1 {
    private final MutableStateFlow<Integer> A;
    private final SharedFlow<List<ws.c>> B;
    private final SharedFlow<List<LearnMoreEntryTranslations>> F;
    private final q G;
    private final SharedFlow<nm0.j<m4, m4>> M;
    private final Flow<List<a.C1539a>> P;
    private final SharedFlow<List<a.C1539a>> Q;
    private final SharedFlow<m90.h<m90.a>> R;
    private final SharedFlow<NormalityZoneUiModel> S;
    private final SharedFlow<f90.d> T;
    private final t W;
    private final SharedFlow<List<m90.b>> X;
    private final SharedFlow<m90.h<m90.b>> Y;
    private final SharedFlow<f90.d> Z;

    /* renamed from: a  reason: collision with root package name */
    private final iy.e f47468a;

    /* renamed from: b  reason: collision with root package name */
    private final ky.c f47469b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.b f47470c;

    /* renamed from: d  reason: collision with root package name */
    private final g90.b f47471d;

    /* renamed from: e  reason: collision with root package name */
    private final mo.a f47472e;

    /* renamed from: f  reason: collision with root package name */
    private final n90.v f47473f;

    /* renamed from: g  reason: collision with root package name */
    private final n90.h f47474g;

    /* renamed from: h  reason: collision with root package name */
    private final n90.a f47475h;

    /* renamed from: i  reason: collision with root package name */
    private final n90.c f47476i;

    /* renamed from: j  reason: collision with root package name */
    private final cy.a f47477j;

    /* renamed from: k  reason: collision with root package name */
    private final LearnMoreManager f47478k;

    /* renamed from: l  reason: collision with root package name */
    private final j90.h f47479l;

    /* renamed from: l0  reason: collision with root package name */
    private final i f47480l0;

    /* renamed from: m  reason: collision with root package name */
    private final n90.b f47481m;

    /* renamed from: n  reason: collision with root package name */
    private final bj0.d f47482n;

    /* renamed from: o  reason: collision with root package name */
    private final ks.t f47483o;

    /* renamed from: p  reason: collision with root package name */
    private final User f47484p;

    /* renamed from: q  reason: collision with root package name */
    private final MutableSharedFlow<nm0.j<Period, DateTime>> f47485q;

    /* renamed from: r  reason: collision with root package name */
    private final Flow<nm0.j<Period, DateTime>> f47486r;

    /* renamed from: s  reason: collision with root package name */
    private final at.a f47487s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableSharedFlow<Interval> f47488t;

    /* renamed from: u  reason: collision with root package name */
    private final MutableSharedFlow<Interval> f47489u;

    /* renamed from: v  reason: collision with root package name */
    private final SharedFlow<Interval> f47490v;

    /* renamed from: w  reason: collision with root package name */
    private final MutableSharedFlow<List<GraphPeriod>> f47491w;

    /* renamed from: x  reason: collision with root package name */
    private final SharedFlow<List<GraphPeriod>> f47492x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableSharedFlow<f90.e> f47493y;

    /* renamed from: z  reason: collision with root package name */
    private final SharedFlow<f90.e> f47494z;

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$1", f = "WeightViewModel.kt", l = {ConstantsWs.WS_STATUS_MEASUPDATEERROR, ConstantsWs.WS_STATUS_ASSOCUPDATEERROR, ConstantsWs.WS_STATUS_WRONGVERSION, ConstantsWs.WS_STATUS_WRONGAPPLICATIONTYPE, ConstantsWs.WS_STATUS_WRONGAPPLICATIONCTX, ConstantsWs.WS_STATUS_TOOMANYSHARINGS}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f47495a;

        /* renamed from: b  reason: collision with root package name */
        Serializable f47496b;

        /* renamed from: c  reason: collision with root package name */
        DateTime f47497c;

        /* renamed from: d  reason: collision with root package name */
        int f47498d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u0 f47499e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ WeightViewModel f47500f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v90.g f47501g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ml.b f47502h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0 u0Var, WeightViewModel weightViewModel, v90.g gVar, ml.b bVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f47499e = u0Var;
            this.f47500f = weightViewModel;
            this.f47501g = gVar;
            this.f47502h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f47499e, this.f47500f, this.f47501g, this.f47502h, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ea A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x011e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$_visibleBmiGraphData$1", f = "WeightViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends a.C1539a>, Interval, qm0.d<? super List<? extends a.C1539a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47503a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47504b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.presentation.viewmodel.WeightViewModel$b, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(List<? extends a.C1539a> list, Interval interval, qm0.d<? super List<? extends a.C1539a>> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f47503a = list;
            iVar.f47504b = interval;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Interval interval = this.f47504b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.f47503a) {
                if (interval.contains(((a.C1539a) obj2).b())) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$bmiCardUiModel$1", f = "WeightViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends a.C1539a>, Interval, j90.g, qm0.d<? super f90.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47505a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47506b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ j90.g f47507c;

        c(qm0.d<? super c> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(List<? extends a.C1539a> list, Interval interval, j90.g gVar, qm0.d<? super f90.d> dVar) {
            c cVar = new c(dVar);
            cVar.f47505a = list;
            cVar.f47506b = interval;
            cVar.f47507c = gVar;
            return cVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Interval interval = this.f47506b;
            j90.g gVar = this.f47507c;
            WeightViewModel weightViewModel = WeightViewModel.this;
            ks.t tVar = weightViewModel.f47483o;
            List<a.C1539a> list = this.f47505a;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (a.C1539a c1539a : list) {
                arrayList.add(new nm0.j(c1539a.b(), c1539a));
            }
            Duration duration = interval.toDuration();
            kotlin.jvm.internal.u.i(duration, "toDuration(...)");
            ArrayList a11 = tVar.a(arrayList, duration);
            ArrayList arrayList2 = new ArrayList(x.y(a11, 10));
            Iterator it = a11.iterator();
            while (it.hasNext()) {
                nm0.j jVar = (nm0.j) it.next();
                DateTime dateTime = (DateTime) jVar.a();
                List<a.C1539a> list2 = (List) jVar.b();
                ArrayList arrayList3 = new ArrayList(x.y(list2, 10));
                for (a.C1539a c1539a2 : list2) {
                    arrayList3.add(new Double(c1539a2.a()));
                }
                arrayList2.add(new a.C1539a(x.u(arrayList3), dateTime));
            }
            return new f90.d(!arrayList2.isEmpty(), gVar.c(), weightViewModel.f47475h.a(arrayList2));
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$bmiGraphUiModel$1", f = "WeightViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends a.C1539a>, Interval, qm0.d<? super m90.h<m90.a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47509a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47510b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.presentation.viewmodel.WeightViewModel$d, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(List<? extends a.C1539a> list, Interval interval, qm0.d<? super m90.h<m90.a>> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f47509a = list;
            iVar.f47510b = interval;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Interval interval = this.f47510b;
            List<a.C1539a> list = this.f47509a;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (a.C1539a datum : list) {
                kotlin.jvm.internal.u.j(datum, "datum");
                arrayList.add(new m90.a((float) datum.a(), datum.b()));
            }
            return new m90.h(interval, arrayList, SecondaryGraphUnit.f47266e);
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$bmiNormalityZoneUiModel$1", f = "WeightViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.s<List<? extends a.C1539a>, List<? extends a.C1539a>, Boolean, Interval, qm0.d<? super NormalityZoneUiModel>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47511a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f47512b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ boolean f47513c;

        e(qm0.d<? super e> dVar) {
            super(5, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f47511a;
            List list2 = this.f47512b;
            if (this.f47513c && (!list.isEmpty())) {
                WeightViewModel weightViewModel = WeightViewModel.this;
                n90.b bVar = weightViewModel.f47481m;
                bj0.d dVar = weightViewModel.f47482n;
                DateTime b10 = ((a.C1539a) x.I(list)).b();
                DateTime b11 = ((a.C1539a) x.T(list)).b();
                dVar.getClass();
                return bVar.a(list2, bj0.d.h(b10, b11));
            }
            return null;
        }

        @Override // ym0.s
        public final Object k(List<? extends a.C1539a> list, List<? extends a.C1539a> list2, Boolean bool, Interval interval, qm0.d<? super NormalityZoneUiModel> dVar) {
            boolean booleanValue = bool.booleanValue();
            e eVar = new e(dVar);
            eVar.f47511a = list;
            eVar.f47512b = list2;
            eVar.f47513c = booleanValue;
            return eVar.invokeSuspend(y.f85009a);
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$bmrCardUiModel$1", f = "WeightViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends m90.b>, Interval, qm0.d<? super f90.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47515a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47516b;

        f(qm0.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(List<? extends m90.b> list, Interval interval, qm0.d<? super f90.d> dVar) {
            f fVar = new f(dVar);
            fVar.f47515a = list;
            fVar.f47516b = interval;
            return fVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Interval interval = this.f47516b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.f47515a) {
                if (interval.contains(((m90.b) obj2).a())) {
                    arrayList.add(obj2);
                }
            }
            WeightViewModel weightViewModel = WeightViewModel.this;
            ks.t tVar = weightViewModel.f47483o;
            ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m90.b bVar = (m90.b) it.next();
                arrayList2.add(new nm0.j(bVar.a(), bVar));
            }
            Duration duration = interval.toDuration();
            kotlin.jvm.internal.u.i(duration, "toDuration(...)");
            ArrayList a11 = tVar.a(arrayList2, duration);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = a11.iterator();
            while (it2.hasNext()) {
                nm0.j jVar = (nm0.j) it2.next();
                DateTime dateTime = (DateTime) jVar.a();
                List<m90.b> list = (List) jVar.b();
                ArrayList arrayList4 = new ArrayList(x.y(list, 10));
                for (m90.b bVar2 : list) {
                    arrayList4.add(new Float(bVar2.getValue()));
                }
                Double d11 = new Double(x.v(arrayList4));
                nm0.j jVar2 = null;
                if (Double.isNaN(d11.doubleValue())) {
                    d11 = null;
                }
                if (d11 != null) {
                    jVar2 = new nm0.j(dateTime, new Double(d11.doubleValue()));
                }
                if (jVar2 != null) {
                    arrayList3.add(jVar2);
                }
            }
            return new f90.d(!arrayList3.isEmpty(), false, weightViewModel.f47476i.a(arrayList3));
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$bmrGraphUiModel$1", f = "WeightViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends m90.b>, Interval, qm0.d<? super m90.h<m90.b>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47518a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47519b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.presentation.viewmodel.WeightViewModel$g, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(List<? extends m90.b> list, Interval interval, qm0.d<? super m90.h<m90.b>> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f47518a = list;
            iVar.f47519b = interval;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return new m90.h(this.f47519b, this.f47518a, SecondaryGraphUnit.f47269h);
        }
    }

    /* compiled from: WeightViewModel.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class h extends kotlin.jvm.internal.a implements ym0.r<List<? extends ky.a>, Interval, Integer, qm0.d<? super List<? extends ws.c>>, Object> {
        @Override // ym0.r
        public final Object invoke(List<? extends ky.a> list, Interval interval, Integer num, qm0.d<? super List<? extends ws.c>> dVar) {
            return WeightViewModel.R0((WeightViewModel) this.f76230a, list, interval, num);
        }
    }

    /* compiled from: WeightViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class i implements ky.b {
        i() {
        }

        @Override // ky.b
        public final void b(long j5, ky.d measuresGroup) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            WeightViewModel.T0(WeightViewModel.this);
        }

        @Override // ky.b
        public final void c(long j5, List<ky.d> list) {
            kotlin.jvm.internal.u.j(list, "list");
            WeightViewModel.T0(WeightViewModel.this);
        }

        @Override // ky.b
        public final void d(long j5, ky.d measuresGroup, boolean z5) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            WeightViewModel.T0(WeightViewModel.this);
        }

        @Override // ky.b
        public final void g(long j5, ky.d measuresGroup) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            WeightViewModel.T0(WeightViewModel.this);
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$onOptionSelected$1", f = "WeightViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGLASTUSEDDATE}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f47522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeightViewModel f47523c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ws.c f47524d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z5, WeightViewModel weightViewModel, ws.c cVar, qm0.d<? super j> dVar) {
            super(2, dVar);
            this.f47522b = z5;
            this.f47523c = weightViewModel;
            this.f47524d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new j(this.f47522b, this.f47523c, this.f47524d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47521a;
            Integer num = null;
            WeightViewModel weightViewModel = this.f47523c;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                if (this.f47522b) {
                    SharedFlow<List<ws.c>> d12 = weightViewModel.d1();
                    this.f47521a = 1;
                    obj = FlowKt.first(d12, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    weightViewModel.A.setValue(null);
                    return y.f85009a;
                }
            }
            MutableStateFlow mutableStateFlow = weightViewModel.A;
            Integer num2 = new Integer(((List) obj).indexOf(this.f47524d));
            if (num2.intValue() >= 0) {
                num = num2;
            }
            mutableStateFlow.setValue(num);
            return y.f85009a;
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$onViewportChange$1", f = "WeightViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGMFGID, ConstantsWs.WS_STATUS_WRONGSTARTMACADDRESS}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47525a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ws.f f47527c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ws.f fVar, qm0.d<? super k> dVar) {
            super(2, dVar);
            this.f47527c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new k(this.f47527c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((k) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47525a;
            WeightViewModel weightViewModel = WeightViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = weightViewModel.f47489u;
                this.f47525a = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Interval interval = (Interval) obj;
            MutableSharedFlow mutableSharedFlow2 = weightViewModel.f47488t;
            ws.f fVar = this.f47527c;
            Interval interval2 = new Interval(b0.n(fVar, interval), b0.l(fVar, interval));
            this.f47525a = 2;
            if (mutableSharedFlow2.emit(interval2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$saveCurrentZoomGranularity$1", f = "WeightViewModel.kt", l = {304}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47528a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WeightViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<j90.g, j90.g> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GraphPeriod f47530a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GraphPeriod graphPeriod) {
                super(1);
                this.f47530a = graphPeriod;
            }

            @Override // ym0.l
            public final j90.g invoke(j90.g gVar) {
                j90.g it = gVar;
                kotlin.jvm.internal.u.j(it, "it");
                return j90.g.a(it, false, this.f47530a.b(), 3);
            }
        }

        l(qm0.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new l(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((l) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47528a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                WeightViewModel weightViewModel = WeightViewModel.this;
                GraphPeriod d11 = weightViewModel.a1().d();
                j90.h hVar = weightViewModel.f47479l;
                a aVar = new a(d11);
                this.f47528a = 1;
                if (hVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$setShowNormalityZones$1", f = "WeightViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGFILTER}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47531a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f47533c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WeightViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<j90.g, j90.g> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f47534a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z5) {
                super(1);
                this.f47534a = z5;
            }

            @Override // ym0.l
            public final j90.g invoke(j90.g gVar) {
                j90.g it = gVar;
                kotlin.jvm.internal.u.j(it, "it");
                return j90.g.a(it, this.f47534a, 0, 6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z5, qm0.d<? super m> dVar) {
            super(2, dVar);
            this.f47533c = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new m(this.f47533c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((m) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47531a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                j90.h hVar = WeightViewModel.this.f47479l;
                a aVar = new a(this.f47533c);
                this.f47531a = 1;
                if (hVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$flatMapLatest$1", f = "WeightViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super ky.d>, Interval, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47535a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f47536b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f47537c;

        public n(qm0.d dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super ky.d> flowCollector, Interval interval, qm0.d<? super y> dVar) {
            n nVar = new n(dVar);
            nVar.f47536b = flowCollector;
            nVar.f47537c = interval;
            return nVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47535a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f47536b;
                Interval interval = (Interval) this.f47537c;
                WeightViewModel weightViewModel = WeightViewModel.this;
                Flow f11 = iy.a.f(weightViewModel.f47468a, weightViewModel.f47469b, weightViewModel.f47484p.q(), 227, new Long(interval.getStartMillis()), new Long(interval.getEndMillis()), false, 840);
                this.f47535a = 1;
                if (FlowKt.emitAll(flowCollector, f11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class o implements Flow<List<? extends ky.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47539a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47540a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$map$1$2", f = "WeightViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.WeightViewModel$o$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0648a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47541a;

                /* renamed from: b  reason: collision with root package name */
                int f47542b;

                public C0648a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47541a = obj;
                    this.f47542b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47540a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.viewmodel.WeightViewModel.o.a.C0648a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.viewmodel.WeightViewModel$o$a$a r0 = (com.withings.weight.presentation.viewmodel.WeightViewModel.o.a.C0648a) r0
                    int r1 = r0.f47542b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47542b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.WeightViewModel$o$a$a r0 = new com.withings.weight.presentation.viewmodel.WeightViewModel$o$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47541a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47542b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    f90.e r5 = (f90.e) r5
                    java.util.List r5 = r5.f()
                    r0.f47542b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47540a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.o.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public o(MutableSharedFlow mutableSharedFlow) {
            this.f47539a = mutableSharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends ky.a>> flowCollector, qm0.d dVar) {
            Object collect = this.f47539a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class p implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47544a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47545a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$map$2$2", f = "WeightViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.WeightViewModel$p$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0649a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47546a;

                /* renamed from: b  reason: collision with root package name */
                int f47547b;

                public C0649a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47546a = obj;
                    this.f47547b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47545a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.viewmodel.WeightViewModel.p.a.C0649a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.viewmodel.WeightViewModel$p$a$a r0 = (com.withings.weight.presentation.viewmodel.WeightViewModel.p.a.C0649a) r0
                    int r1 = r0.f47547b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47547b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.WeightViewModel$p$a$a r0 = new com.withings.weight.presentation.viewmodel.WeightViewModel$p$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47546a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47547b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L47
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    j90.g r5 = (j90.g) r5
                    boolean r5 = r5.c()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f47547b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47545a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.p.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public p(Flow flow) {
            this.f47544a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f47544a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class q implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47549a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47550a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$map$3$2", f = "WeightViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.WeightViewModel$q$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0650a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47551a;

                /* renamed from: b  reason: collision with root package name */
                int f47552b;

                public C0650a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47551a = obj;
                    this.f47552b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47550a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.viewmodel.WeightViewModel.q.a.C0650a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.viewmodel.WeightViewModel$q$a$a r0 = (com.withings.weight.presentation.viewmodel.WeightViewModel.q.a.C0650a) r0
                    int r1 = r0.f47552b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47552b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.WeightViewModel$q$a$a r0 = new com.withings.weight.presentation.viewmodel.WeightViewModel$q$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47551a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47552b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L54
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L44
                    com.withings.features.FeatureFlag r5 = com.withings.features.FeatureFlag.f39134u0
                    boolean r5 = wr.b.c(r5)
                    if (r5 == 0) goto L44
                    r5 = r3
                    goto L45
                L44:
                    r5 = 0
                L45:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f47552b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47550a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L54
                    return r1
                L54:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.q.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public q(p pVar) {
            this.f47549a = pVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f47549a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class r implements Flow<List<? extends ky.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47554a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47555a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$map$4$2", f = "WeightViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.WeightViewModel$r$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0651a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47556a;

                /* renamed from: b  reason: collision with root package name */
                int f47557b;

                public C0651a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47556a = obj;
                    this.f47557b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47555a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.viewmodel.WeightViewModel.r.a.C0651a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.viewmodel.WeightViewModel$r$a$a r0 = (com.withings.weight.presentation.viewmodel.WeightViewModel.r.a.C0651a) r0
                    int r1 = r0.f47557b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47557b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.WeightViewModel$r$a$a r0 = new com.withings.weight.presentation.viewmodel.WeightViewModel$r$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47556a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47557b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    f90.e r5 = (f90.e) r5
                    java.util.List r5 = r5.f()
                    r0.f47557b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47555a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.r.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public r(MutableSharedFlow mutableSharedFlow) {
            this.f47554a = mutableSharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends ky.a>> flowCollector, qm0.d dVar) {
            Object collect = this.f47554a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class s implements Flow<List<? extends a.C1539a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47559a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47560a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$map$5$2", f = "WeightViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.WeightViewModel$s$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0652a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47561a;

                /* renamed from: b  reason: collision with root package name */
                int f47562b;

                public C0652a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47561a = obj;
                    this.f47562b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47560a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.viewmodel.WeightViewModel.s.a.C0652a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.viewmodel.WeightViewModel$s$a$a r0 = (com.withings.weight.presentation.viewmodel.WeightViewModel.s.a.C0652a) r0
                    int r1 = r0.f47562b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47562b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.WeightViewModel$s$a$a r0 = new com.withings.weight.presentation.viewmodel.WeightViewModel$s$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47561a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47562b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    f90.e r5 = (f90.e) r5
                    java.util.List r5 = r5.a()
                    r0.f47562b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47560a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.s.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public s(MutableSharedFlow mutableSharedFlow) {
            this.f47559a = mutableSharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends a.C1539a>> flowCollector, qm0.d dVar) {
            Object collect = this.f47559a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class t implements Flow<f.b.C1298b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeightViewModel f47565b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47566a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ WeightViewModel f47567b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$map$6$2", f = "WeightViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.WeightViewModel$t$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0653a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47568a;

                /* renamed from: b  reason: collision with root package name */
                int f47569b;

                public C0653a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47568a = obj;
                    this.f47569b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, WeightViewModel weightViewModel) {
                this.f47566a = flowCollector;
                this.f47567b = weightViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, qm0.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.withings.weight.presentation.viewmodel.WeightViewModel.t.a.C0653a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.withings.weight.presentation.viewmodel.WeightViewModel$t$a$a r0 = (com.withings.weight.presentation.viewmodel.WeightViewModel.t.a.C0653a) r0
                    int r1 = r0.f47569b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47569b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.WeightViewModel$t$a$a r0 = new com.withings.weight.presentation.viewmodel.WeightViewModel$t$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f47568a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47569b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r7)
                    goto L6d
                L27:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L2f:
                    nm0.l.b(r7)
                    ky.d r6 = (ky.d) r6
                    if (r6 == 0) goto L61
                    r7 = 227(0xe3, float:3.18E-43)
                    double r6 = ly.a.f(r7, r6)
                    int r6 = (int) r6
                    m90.f$b$b r7 = new m90.f$b$b
                    com.withings.weight.presentation.viewmodel.WeightViewModel r2 = r5.f47567b
                    com.withings.user.User r4 = com.withings.weight.presentation.viewmodel.WeightViewModel.B0(r2)
                    int r4 = r4.d()
                    if (r4 <= r6) goto L4e
                    com.withings.weight.core.model.BasalMetabolicRateStatus r2 = com.withings.weight.core.model.BasalMetabolicRateStatus.f46959c
                    goto L5d
                L4e:
                    com.withings.user.User r2 = com.withings.weight.presentation.viewmodel.WeightViewModel.B0(r2)
                    int r2 = r2.d()
                    if (r2 != r6) goto L5b
                    com.withings.weight.core.model.BasalMetabolicRateStatus r2 = com.withings.weight.core.model.BasalMetabolicRateStatus.f46958b
                    goto L5d
                L5b:
                    com.withings.weight.core.model.BasalMetabolicRateStatus r2 = com.withings.weight.core.model.BasalMetabolicRateStatus.f46957a
                L5d:
                    r7.<init>(r6, r2)
                    goto L62
                L61:
                    r7 = 0
                L62:
                    r0.f47569b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r5.f47566a
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L6d
                    return r1
                L6d:
                    nm0.y r6 = nm0.y.f85009a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.t.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public t(Flow flow, WeightViewModel weightViewModel) {
            this.f47564a = flow;
            this.f47565b = weightViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super f.b.C1298b> flowCollector, qm0.d dVar) {
            Object collect = this.f47564a.collect(new a(flowCollector, this.f47565b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class u implements Flow<List<? extends m90.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47571a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47572a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$special$$inlined$map$7$2", f = "WeightViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.WeightViewModel$u$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0654a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47573a;

                /* renamed from: b  reason: collision with root package name */
                int f47574b;

                public C0654a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47573a = obj;
                    this.f47574b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47572a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.withings.weight.presentation.viewmodel.WeightViewModel.u.a.C0654a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.withings.weight.presentation.viewmodel.WeightViewModel$u$a$a r0 = (com.withings.weight.presentation.viewmodel.WeightViewModel.u.a.C0654a) r0
                    int r1 = r0.f47574b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47574b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.WeightViewModel$u$a$a r0 = new com.withings.weight.presentation.viewmodel.WeightViewModel$u$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f47573a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47574b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r8)
                    goto L75
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    nm0.l.b(r8)
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.x.y(r7, r2)
                    r8.<init>(r2)
                    java.util.Iterator r7 = r7.iterator()
                L45:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L6a
                    java.lang.Object r2 = r7.next()
                    ky.d r2 = (ky.d) r2
                    java.lang.String r4 = "from"
                    kotlin.jvm.internal.u.j(r2, r4)
                    r4 = 226(0xe2, float:3.17E-43)
                    double r4 = ly.a.f(r4, r2)
                    float r4 = (float) r4
                    org.joda.time.DateTime r2 = r2.c()
                    m90.b r5 = new m90.b
                    r5.<init>(r4, r2)
                    r8.add(r5)
                    goto L45
                L6a:
                    r0.f47574b = r3
                    kotlinx.coroutines.flow.FlowCollector r7 = r6.f47572a
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L75
                    return r1
                L75:
                    nm0.y r7 = nm0.y.f85009a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.WeightViewModel.u.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public u(Flow flow) {
            this.f47571a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends m90.b>> flowCollector, qm0.d dVar) {
            Object collect = this.f47571a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$weightLearnMoreEntries$1", f = "WeightViewModel.kt", l = {124, 124}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends LearnMoreEntryTranslations>>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47576a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f47577b;

        v(qm0.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            v vVar = new v(dVar);
            vVar.f47577b = obj;
            return vVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends LearnMoreEntryTranslations>> flowCollector, qm0.d<? super y> dVar) {
            return ((v) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            List<LearnMoreEntryTranslations> list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47576a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f47577b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                flowCollector = (FlowCollector) this.f47577b;
                LearnMoreManager learnMoreManager = WeightViewModel.this.f47478k;
                this.f47577b = flowCollector;
                this.f47576a = 1;
                obj = learnMoreManager.getLearnMoreCategories(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
            if (learnMoreCategories == null || (list = learnMoreCategories.getWeight()) == null) {
                list = i0.f76187a;
            }
            this.f47577b = null;
            this.f47576a = 2;
            if (flowCollector.emit(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* compiled from: WeightViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$weightStatusHeaderStates$2", f = "WeightViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class w extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends ky.a>, Interval, qm0.d<? super nm0.j<? extends m4, ? extends m4>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47579a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47580b;

        w(qm0.d<? super w> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(List<? extends ky.a> list, Interval interval, qm0.d<? super nm0.j<? extends m4, ? extends m4>> dVar) {
            w wVar = new w(dVar);
            wVar.f47579a = list;
            wVar.f47580b = interval;
            return wVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Float f11;
            Object obj2;
            Object obj3;
            Float f12;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Interval interval = this.f47580b;
            WeightViewModel weightViewModel = WeightViewModel.this;
            ks.t tVar = weightViewModel.f47483o;
            List<ky.a> list = this.f47579a;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (ky.a aVar : list) {
                arrayList.add(new nm0.j(aVar.b(), aVar));
            }
            Duration duration = interval.toDuration();
            kotlin.jvm.internal.u.i(duration, "toDuration(...)");
            ArrayList a11 = tVar.a(arrayList, duration);
            DateTime start = interval.getStart();
            DateTime end = interval.getEnd();
            Iterator it = a11.iterator();
            while (true) {
                f11 = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    kotlin.jvm.internal.u.g(start);
                    kotlin.jvm.internal.u.g(end);
                    if (hn.a.c((DateTime) ((nm0.j) obj2).a(), start, end)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            nm0.j jVar = (nm0.j) obj2;
            ListIterator listIterator = a11.listIterator(a11.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj3 = listIterator.previous();
                    kotlin.jvm.internal.u.g(start);
                    kotlin.jvm.internal.u.g(end);
                    if (hn.a.c((DateTime) ((nm0.j) obj3).a(), start, end)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            nm0.j jVar2 = (nm0.j) obj3;
            if (jVar != null && jVar2 != null) {
                mo.a aVar2 = weightViewModel.f47472e;
                Iterable<ky.a> iterable = (Iterable) jVar.d();
                ArrayList arrayList2 = new ArrayList(x.y(iterable, 10));
                for (ky.a aVar3 : iterable) {
                    arrayList2.add(new Double(aVar3.f()));
                }
                Float f13 = new Float((float) x.u(arrayList2));
                Iterable<ky.a> iterable2 = (Iterable) jVar2.d();
                ArrayList arrayList3 = new ArrayList(x.y(iterable2, 10));
                for (ky.a aVar4 : iterable2) {
                    arrayList3.add(new Double(aVar4.f()));
                }
                Float f14 = new Float((float) x.u(arrayList3));
                aVar2.getClass();
                float floatValue = (f14.floatValue() - f13.floatValue()) / f13.floatValue();
                f12 = new Float(Math.signum(floatValue) * en0.r.b(Math.abs(floatValue), 0.01f));
            } else {
                f12 = null;
            }
            if (jVar != null && jVar2 != null) {
                mo.a aVar5 = weightViewModel.f47472e;
                Iterable<ky.a> iterable3 = (Iterable) jVar.d();
                ArrayList arrayList4 = new ArrayList(x.y(iterable3, 10));
                for (ky.a aVar6 : iterable3) {
                    arrayList4.add(new Double(aVar6.f()));
                }
                Float f15 = new Float((float) x.u(arrayList4));
                Iterable<ky.a> iterable4 = (Iterable) jVar2.d();
                ArrayList arrayList5 = new ArrayList(x.y(iterable4, 10));
                for (ky.a aVar7 : iterable4) {
                    arrayList5.add(new Double(aVar7.f()));
                }
                Float f16 = new Float((float) x.u(arrayList5));
                aVar5.getClass();
                f11 = new Float(mo.a.e(f15, f16));
            }
            return new nm0.j(weightViewModel.f47474g.e(f12), weightViewModel.f47474g.c(f11));
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [kotlin.jvm.internal.a, ym0.r] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public WeightViewModel(u0 savedStateHandle, m70.i userManager, ml.b bVar, v90.g gVar, iy.e measuresGroupRepositoryV2, ky.c measureListenerManagerInterface, xw.b dispatchers, g90.b bVar2, mo.a aVar, n90.v vVar, n90.h hVar, n90.a aVar2, n90.c cVar, cy.a aVar3, LearnMoreManager learnMoreManager, j90.h weightOptionsRepository, n90.b bVar3, bj0.d dVar, ks.t tVar) {
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        kotlin.jvm.internal.u.j(weightOptionsRepository, "weightOptionsRepository");
        this.f47468a = measuresGroupRepositoryV2;
        this.f47469b = measureListenerManagerInterface;
        this.f47470c = dispatchers;
        this.f47471d = bVar2;
        this.f47472e = aVar;
        this.f47473f = vVar;
        this.f47474g = hVar;
        this.f47475h = aVar2;
        this.f47476i = cVar;
        this.f47477j = aVar3;
        this.f47478k = learnMoreManager;
        this.f47479l = weightOptionsRepository;
        this.f47481m = bVar3;
        this.f47482n = dVar;
        this.f47483o = tVar;
        User user = (User) savedStateHandle.c(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        if (user == null) {
            user = userManager.e();
            kotlin.jvm.internal.u.i(user, "getMainUser(...)");
        }
        User user2 = user;
        this.f47484p = user2;
        MutableSharedFlow<nm0.j<Period, DateTime>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f47485q = MutableSharedFlow$default;
        this.f47486r = FlowKt.distinctUntilChanged(FlowKt.asSharedFlow(MutableSharedFlow$default));
        GraphPeriod graphPeriod = GraphPeriod.f39504d;
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        this.f47487s = new at.a(graphPeriod, now);
        MutableSharedFlow<Interval> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f47488t = MutableSharedFlow$default2;
        MutableSharedFlow<Interval> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f47489u = MutableSharedFlow$default3;
        SharedFlow<Interval> asSharedFlow = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        this.f47490v = asSharedFlow;
        MutableSharedFlow<List<GraphPeriod>> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f47491w = MutableSharedFlow$default4;
        this.f47492x = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<f90.e> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f47493y = MutableSharedFlow$default5;
        this.f47494z = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.A = MutableStateFlow;
        Flow combine = FlowKt.combine(new o(MutableSharedFlow$default5), MutableSharedFlow$default2, MutableStateFlow, new kotlin.jvm.internal.a(4, this, WeightViewModel.class, "computeGraphOptions", "computeGraphOptions(Ljava/util/List;Lorg/joda/time/Interval;Ljava/lang/Integer;)Ljava/util/List;", 4));
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.B = FlowKt.shareIn(combine, a11, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.F = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new v(null)), dispatchers.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        p pVar = new p(weightOptionsRepository.get());
        this.G = new q(pVar);
        this.M = FlowKt.shareIn(FlowKt.combine(new r(MutableSharedFlow$default5), MutableSharedFlow$default2, new w(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        Flow<List<a.C1539a>> distinctUntilChanged = FlowKt.distinctUntilChanged(new s(MutableSharedFlow$default5));
        this.P = distinctUntilChanged;
        SharedFlow<List<a.C1539a>> shareIn = FlowKt.shareIn(FlowKt.combine(distinctUntilChanged, MutableSharedFlow$default2, new kotlin.coroutines.jvm.internal.i(3, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.Q = shareIn;
        this.R = FlowKt.shareIn(FlowKt.combine(distinctUntilChanged, asSharedFlow, new kotlin.coroutines.jvm.internal.i(3, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.S = FlowKt.shareIn(FlowKt.combine(distinctUntilChanged, shareIn, pVar, MutableSharedFlow$default2, new e(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.T = FlowKt.shareIn(FlowKt.combine(shareIn, MutableSharedFlow$default2, weightOptionsRepository.get(), new c(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.W = new t(FlowKt.transformLatest(MutableSharedFlow$default2, new n(null)), this);
        SharedFlow<List<m90.b>> shareIn2 = FlowKt.shareIn(new u(iy.a.c(measuresGroupRepositoryV2, measureListenerManagerInterface, user2.q(), 226, null, null, null, true, false, null, 1400)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.X = shareIn2;
        this.Y = FlowKt.shareIn(FlowKt.combine(shareIn2, asSharedFlow, new kotlin.coroutines.jvm.internal.i(3, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.Z = FlowKt.shareIn(FlowKt.combine(shareIn2, MutableSharedFlow$default2, new f(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        i iVar = new i();
        this.f47480l0 = iVar;
        aVar3.a(iVar);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new com.withings.weight.presentation.viewmodel.b(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), dispatchers.a(), null, new a(savedStateHandle, this, gVar, bVar, null), 2, null);
    }

    public static final ArrayList R0(WeightViewModel weightViewModel, List list, Interval interval, Integer num) {
        weightViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            DateTime b10 = ((ky.a) obj).b();
            DateTime start = interval.getStart();
            kotlin.jvm.internal.u.i(start, "getStart(...)");
            DateTime end = interval.getEnd();
            kotlin.jvm.internal.u.i(end, "getEnd(...)");
            if (hn.a.c(b10, start, end)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ky.a aVar = (ky.a) it.next();
            arrayList2.add(new nm0.j(aVar.b(), aVar));
        }
        Duration duration = interval.toDuration();
        kotlin.jvm.internal.u.i(duration, "toDuration(...)");
        ArrayList a11 = weightViewModel.f47483o.a(arrayList2, duration);
        ArrayList arrayList3 = new ArrayList(x.y(a11, 10));
        Iterator it2 = a11.iterator();
        while (it2.hasNext()) {
            nm0.j jVar = (nm0.j) it2.next();
            Instant instant = ((DateTime) jVar.a()).toInstant();
            List<ky.a> list2 = (List) jVar.b();
            ArrayList arrayList4 = new ArrayList(x.y(list2, 10));
            for (ky.a aVar2 : list2) {
                arrayList4.add(Double.valueOf(aVar2.f()));
            }
            arrayList3.add(new nm0.j(instant, Double.valueOf(x.u(arrayList4))));
        }
        Filter filter = Filter.f39920d;
        n90.v vVar = weightViewModel.f47473f;
        ArrayList S0 = x.S0(kotlin.collections.l.z(new c.a[]{n90.v.a(vVar, arrayList3, filter), n90.v.a(vVar, arrayList3, Filter.f39921e)}));
        if (num != null) {
            S0.set(num.intValue(), c.a.e((c.a) S0.get(num.intValue())));
        }
        return S0;
    }

    public static final void T0(WeightViewModel weightViewModel) {
        weightViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(weightViewModel), null, null, new com.withings.weight.presentation.viewmodel.b(weightViewModel, null), 3, null);
    }

    public final SharedFlow<List<GraphPeriod>> U0() {
        return this.f47492x;
    }

    public final SharedFlow<f90.d> V0() {
        return this.T;
    }

    public final SharedFlow<m90.h<m90.a>> W0() {
        return this.R;
    }

    public final SharedFlow<NormalityZoneUiModel> X0() {
        return this.S;
    }

    public final SharedFlow<f90.d> Y0() {
        return this.Z;
    }

    public final SharedFlow<m90.h<m90.b>> Z0() {
        return this.Y;
    }

    public final at.a a1() {
        return this.f47487s;
    }

    public final SharedFlow<Interval> c1() {
        return this.f47490v;
    }

    public final SharedFlow<List<ws.c>> d1() {
        return this.B;
    }

    public final t e1() {
        return this.W;
    }

    public final Flow<nm0.j<Period, DateTime>> g1() {
        return this.f47486r;
    }

    public final q i1() {
        return this.G;
    }

    public final SharedFlow<f90.e> k1() {
        return this.f47494z;
    }

    public final SharedFlow<List<LearnMoreEntryTranslations>> l1() {
        return this.F;
    }

    public final SharedFlow<nm0.j<m4, m4>> m1() {
        return this.M;
    }

    public final void n1(ws.c option, boolean z5) {
        kotlin.jvm.internal.u.j(option, "option");
        if (option instanceof c.a) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new j(z5, this, option, null), 3, null);
        }
    }

    public final void o1(ws.f viewport) {
        kotlin.jvm.internal.u.j(viewport, "viewport");
        this.f47485q.tryEmit(new nm0.j<>(viewport.b().a(), viewport.a()));
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new k(viewport, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f47477j.b(this.f47480l0);
        super.onCleared();
    }

    public final void q1() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f47470c.a(), null, new l(null), 2, null);
    }

    public final void r1(boolean z5) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new m(z5, null), 3, null);
    }
}
