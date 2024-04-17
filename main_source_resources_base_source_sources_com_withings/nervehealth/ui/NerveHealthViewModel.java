package com.withings.nervehealth.ui;

import android.app.Application;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.graph.GraphPeriod;
import com.withings.graph.model.NormalityZoneUiModel;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.nervehealth.android.NeuropathyFeature;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.nervehealth.ui.models.resources.a;
import com.withings.nervehealth.ui.usecases.ComputeNerveHealthNormalityZoneUseCase;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: NerveHealthViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/nervehealth/ui/NerveHealthViewModel;", "Landroidx/lifecycle/b;", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NerveHealthViewModel extends androidx.lifecycle.b {
    private final SharedFlow<p00.a> A;
    private final SharedFlow<p00.b> B;
    private final g F;

    /* renamed from: a  reason: collision with root package name */
    private final cy.a f42401a;

    /* renamed from: b  reason: collision with root package name */
    private final i00.e f42402b;

    /* renamed from: c  reason: collision with root package name */
    private final com.withings.nervehealth.ui.usecases.a f42403c;

    /* renamed from: d  reason: collision with root package name */
    private final i00.f f42404d;

    /* renamed from: e  reason: collision with root package name */
    private final com.android.billingclient.api.v f42405e;

    /* renamed from: f  reason: collision with root package name */
    private final i00.a f42406f;

    /* renamed from: g  reason: collision with root package name */
    private final i00.b f42407g;

    /* renamed from: h  reason: collision with root package name */
    private final j00.f f42408h;

    /* renamed from: i  reason: collision with root package name */
    private final ComputeNerveHealthNormalityZoneUseCase f42409i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f42410j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f42411k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f42412l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f42413m;

    /* renamed from: n  reason: collision with root package name */
    private final SharedFlow<List<Long>> f42414n;

    /* renamed from: o  reason: collision with root package name */
    private final SharedFlow<List<Integer>> f42415o;

    /* renamed from: p  reason: collision with root package name */
    private final at.a f42416p;

    /* renamed from: q  reason: collision with root package name */
    private final SharedFlow<Boolean> f42417q;

    /* renamed from: r  reason: collision with root package name */
    private final xw.n<nm0.y> f42418r;

    /* renamed from: s  reason: collision with root package name */
    private final xw.n<nm0.j<Period, DateTime>> f42419s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableSharedFlow<l00.a> f42420t;

    /* renamed from: u  reason: collision with root package name */
    private final SharedFlow<l00.a> f42421u;

    /* renamed from: v  reason: collision with root package name */
    private final SharedFlow<List<LearnMoreEntryTranslations>> f42422v;

    /* renamed from: w  reason: collision with root package name */
    private final Flow<l00.b> f42423w;

    /* renamed from: x  reason: collision with root package name */
    private final SharedFlow<Boolean> f42424x;

    /* renamed from: y  reason: collision with root package name */
    private final SharedFlow<Interval> f42425y;

    /* renamed from: z  reason: collision with root package name */
    private final SharedFlow<NormalityZoneUiModel> f42426z;

    /* compiled from: NerveHealthViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$1", f = "NerveHealthViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            NerveHealthViewModel nerveHealthViewModel = NerveHealthViewModel.this;
            nerveHealthViewModel.f42401a.a(nerveHealthViewModel.F);
            nerveHealthViewModel.g1();
            xw.d.e(nerveHealthViewModel.W0(), new nm0.j(GraphPeriod.f39506f.a(), nerveHealthViewModel.F0()));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<MeasureCategory> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f42428a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u0 u0Var) {
            super(0);
            this.f42428a = u0Var;
        }

        @Override // ym0.a
        public final MeasureCategory invoke() {
            MeasureCategory measureCategory = (MeasureCategory) this.f42428a.c("measure_category");
            if (measureCategory == null) {
                return MeasureCategory.f42341c;
            }
            return measureCategory;
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f42429a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u0 u0Var) {
            super(0);
            this.f42429a = u0Var;
        }

        @Override // ym0.a
        public final DateTime invoke() {
            DateTime dateTime = (DateTime) this.f42429a.c("date");
            if (dateTime == null) {
                return DateTime.now();
            }
            return dateTime;
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$deviceIds$1", f = "NerveHealthViewModel.kt", l = {81}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends Long>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42430a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f42431b;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f42431b = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends Long>> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f42430a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                List<Long> a11 = NerveHealthViewModel.this.f42406f.a();
                this.f42430a = 1;
                if (((FlowCollector) this.f42431b).emit(a11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$deviceModels$1", f = "NerveHealthViewModel.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends Integer>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42433a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f42434b;

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f42434b = obj;
            return eVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends Integer>> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((e) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f42433a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                List<Integer> a11 = NerveHealthViewModel.this.f42407g.a();
                this.f42433a = 1;
                if (((FlowCollector) this.f42434b).emit(a11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$learnMoreCategories$1", f = "NerveHealthViewModel.kt", l = {108, 107}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends LearnMoreEntryTranslations>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42436a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f42437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LearnMoreManager f42438c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ NerveHealthViewModel f42439d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(LearnMoreManager learnMoreManager, NerveHealthViewModel nerveHealthViewModel, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f42438c = learnMoreManager;
            this.f42439d = nerveHealthViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            f fVar = new f(this.f42438c, this.f42439d, dVar);
            fVar.f42437b = obj;
            return fVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends LearnMoreEntryTranslations>> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((f) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
            if (r6 == null) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r5.f42436a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                nm0.l.b(r6)
                goto L6d
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.f42437b
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                nm0.l.b(r6)
                goto L35
            L20:
                nm0.l.b(r6)
                java.lang.Object r6 = r5.f42437b
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                r5.f42437b = r1
                r5.f42436a = r3
                com.withings.learnmore.adapter.LearnMoreManager r6 = r5.f42438c
                java.lang.Object r6 = r6.getLearnMoreCategories(r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                com.withings.learnmore.adapter.LearnMoreCategories r6 = (com.withings.learnmore.adapter.LearnMoreCategories) r6
                if (r6 == 0) goto L5f
                com.withings.nervehealth.ui.NerveHealthViewModel r4 = r5.f42439d
                com.withings.nervehealth.core.model.MeasureCategory r4 = com.withings.nervehealth.ui.NerveHealthViewModel.g0(r4)
                int r4 = r4.ordinal()
                if (r4 == 0) goto L59
                if (r4 == r3) goto L54
                if (r4 != r2) goto L4e
                java.util.List r6 = r6.getElectrochemicalSkinConductanceScore()
                goto L5d
            L4e:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            L54:
                java.util.List r6 = r6.getElectrodermalActivityScore()
                goto L5d
            L59:
                java.util.List r6 = r6.getNerveHealthScore()
            L5d:
                if (r6 != 0) goto L61
            L5f:
                kotlin.collections.i0 r6 = kotlin.collections.i0.f76187a
            L61:
                r3 = 0
                r5.f42437b = r3
                r5.f42436a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L6d
                return r0
            L6d:
                nm0.y r6 = nm0.y.f85009a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.NerveHealthViewModel.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class g implements ky.b {
        g() {
        }

        @Override // ky.b
        public final void b(long j5, ky.d measuresGroup) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            NerveHealthViewModel.this.g1();
        }

        @Override // ky.b
        public final void c(long j5, List<ky.d> list) {
            kotlin.jvm.internal.u.j(list, "list");
            NerveHealthViewModel.this.g1();
        }

        @Override // ky.b
        public final void d(long j5, ky.d measuresGroup, boolean z5) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            NerveHealthViewModel.this.g1();
        }

        @Override // ky.b
        public final void g(long j5, ky.d measuresGroup) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            NerveHealthViewModel.this.g1();
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$normalityZone$1", f = "NerveHealthViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.r<l00.a, Boolean, Interval, qm0.d<? super NormalityZoneUiModel>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ l00.a f42441a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f42442b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Interval f42443c;

        h(qm0.d<? super h> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(l00.a aVar, Boolean bool, Interval interval, qm0.d<? super NormalityZoneUiModel> dVar) {
            boolean booleanValue = bool.booleanValue();
            h hVar = new h(dVar);
            hVar.f42441a = aVar;
            hVar.f42442b = booleanValue;
            hVar.f42443c = interval;
            return hVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.i0] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ?? r22;
            List<j00.d> a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            l00.a aVar = this.f42441a;
            boolean z5 = this.f42442b;
            Interval interval = this.f42443c;
            if (z5) {
                DateTime start = interval.getStart();
                kotlin.jvm.internal.u.i(start, "getStart(...)");
                Interval withStart = interval.withStart(hn.a.t(start));
                DateTime end = interval.getEnd();
                kotlin.jvm.internal.u.i(end, "getEnd(...)");
                Interval withEnd = withStart.withEnd(hn.a.p(end));
                kotlin.jvm.internal.u.g(withEnd);
                if (aVar != null && (a11 = aVar.a()) != null) {
                    r22 = new ArrayList();
                    for (Object obj2 : a11) {
                        if (interval.contains(((j00.d) obj2).a())) {
                            r22.add(obj2);
                        }
                    }
                } else {
                    r22 = kotlin.collections.i0.f76187a;
                }
                return NerveHealthViewModel.f0(NerveHealthViewModel.this, withEnd, r22);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$refreshGraphData$1", f = "NerveHealthViewModel.kt", l = {203, 202}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        MutableSharedFlow f42445a;

        /* renamed from: b  reason: collision with root package name */
        int f42446b;

        i(qm0.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new i(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((i) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f42446b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableSharedFlow = this.f42445a;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                NerveHealthViewModel nerveHealthViewModel = NerveHealthViewModel.this;
                mutableSharedFlow = nerveHealthViewModel.f42420t;
                i00.e eVar = nerveHealthViewModel.f42402b;
                long q11 = nerveHealthViewModel.a1().q();
                MeasureCategory g02 = NerveHealthViewModel.g0(nerveHealthViewModel);
                DateTime f11 = nerveHealthViewModel.a1().f();
                this.f42445a = mutableSharedFlow;
                this.f42446b = 1;
                obj = eVar.a(q11, g02, f11, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f42445a = null;
            this.f42446b = 2;
            if (mutableSharedFlow.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class j implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f42448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NerveHealthViewModel f42449b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f42450a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NerveHealthViewModel f42451b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$special$$inlined$map$1$2", f = "NerveHealthViewModel.kt", l = {224, 223}, m = "emit")
            /* renamed from: com.withings.nervehealth.ui.NerveHealthViewModel$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0564a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f42452a;

                /* renamed from: b  reason: collision with root package name */
                int f42453b;

                /* renamed from: c  reason: collision with root package name */
                a f42454c;

                /* renamed from: e  reason: collision with root package name */
                FlowCollector f42456e;

                public C0564a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42452a = obj;
                    this.f42453b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, NerveHealthViewModel nerveHealthViewModel) {
                this.f42450a = flowCollector;
                this.f42451b = nerveHealthViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, qm0.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.withings.nervehealth.ui.NerveHealthViewModel.j.a.C0564a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.withings.nervehealth.ui.NerveHealthViewModel$j$a$a r0 = (com.withings.nervehealth.ui.NerveHealthViewModel.j.a.C0564a) r0
                    int r1 = r0.f42453b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42453b = r1
                    goto L18
                L13:
                    com.withings.nervehealth.ui.NerveHealthViewModel$j$a$a r0 = new com.withings.nervehealth.ui.NerveHealthViewModel$j$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f42452a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f42453b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3a
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    nm0.l.b(r7)
                    goto L7a
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    kotlinx.coroutines.flow.FlowCollector r6 = r0.f42456e
                    com.withings.nervehealth.ui.NerveHealthViewModel$j$a r2 = r0.f42454c
                    nm0.l.b(r7)
                    goto L56
                L3a:
                    nm0.l.b(r7)
                    java.util.List r6 = (java.util.List) r6
                    com.withings.nervehealth.ui.NerveHealthViewModel r7 = r5.f42451b
                    i00.f r7 = com.withings.nervehealth.ui.NerveHealthViewModel.r0(r7)
                    r0.f42454c = r5
                    kotlinx.coroutines.flow.FlowCollector r2 = r5.f42450a
                    r0.f42456e = r2
                    r0.f42453b = r4
                    java.lang.Boolean r7 = r7.a(r6)
                    if (r7 != r1) goto L54
                    return r1
                L54:
                    r6 = r2
                    r2 = r5
                L56:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    if (r7 == 0) goto L67
                    com.withings.nervehealth.ui.NerveHealthViewModel r7 = r2.f42451b
                    java.lang.String r7 = r7.Y0()
                    if (r7 == 0) goto L67
                    goto L68
                L67:
                    r4 = 0
                L68:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                    r2 = 0
                    r0.f42454c = r2
                    r0.f42456e = r2
                    r0.f42453b = r3
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L7a
                    return r1
                L7a:
                    nm0.y r6 = nm0.y.f85009a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.NerveHealthViewModel.j.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public j(SharedFlow sharedFlow, NerveHealthViewModel nerveHealthViewModel) {
            this.f42448a = sharedFlow;
            this.f42449b = nerveHealthViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f42448a.collect(new a(flowCollector, this.f42449b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class k implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f42457a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f42458a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$special$$inlined$map$2$2", f = "NerveHealthViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.nervehealth.ui.NerveHealthViewModel$k$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0565a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f42459a;

                /* renamed from: b  reason: collision with root package name */
                int f42460b;

                public C0565a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42459a = obj;
                    this.f42460b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f42458a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.nervehealth.ui.NerveHealthViewModel.k.a.C0565a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.nervehealth.ui.NerveHealthViewModel$k$a$a r0 = (com.withings.nervehealth.ui.NerveHealthViewModel.k.a.C0565a) r0
                    int r1 = r0.f42460b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42460b = r1
                    goto L18
                L13:
                    com.withings.nervehealth.ui.NerveHealthViewModel$k$a$a r0 = new com.withings.nervehealth.ui.NerveHealthViewModel$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f42459a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f42460b
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
                    l00.b r5 = (l00.b) r5
                    boolean r5 = r5.a()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f42460b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f42458a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.NerveHealthViewModel.k.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public k(Flow flow) {
            this.f42457a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f42457a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class l implements Flow<Interval> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f42462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NerveHealthViewModel f42463b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f42464a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NerveHealthViewModel f42465b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$special$$inlined$map$3$2", f = "NerveHealthViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.nervehealth.ui.NerveHealthViewModel$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0566a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f42466a;

                /* renamed from: b  reason: collision with root package name */
                int f42467b;

                public C0566a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42466a = obj;
                    this.f42467b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, NerveHealthViewModel nerveHealthViewModel) {
                this.f42464a = flowCollector;
                this.f42465b = nerveHealthViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, qm0.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.withings.nervehealth.ui.NerveHealthViewModel.l.a.C0566a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.withings.nervehealth.ui.NerveHealthViewModel$l$a$a r0 = (com.withings.nervehealth.ui.NerveHealthViewModel.l.a.C0566a) r0
                    int r1 = r0.f42467b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42467b = r1
                    goto L18
                L13:
                    com.withings.nervehealth.ui.NerveHealthViewModel$l$a$a r0 = new com.withings.nervehealth.ui.NerveHealthViewModel$l$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f42466a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f42467b
                    r3 = 1
                    if (r2 == 0) goto L30
                    if (r2 != r3) goto L28
                    nm0.l.b(r7)
                    goto La0
                L28:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L30:
                    nm0.l.b(r7)
                    l00.a r6 = (l00.a) r6
                    if (r6 == 0) goto L7f
                    java.util.List r6 = r6.a()
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.Iterator r6 = r6.iterator()
                    boolean r7 = r6.hasNext()
                    if (r7 != 0) goto L49
                    r6 = 0
                    goto L6c
                L49:
                    java.lang.Object r7 = r6.next()
                    j00.d r7 = (j00.d) r7
                    org.joda.time.DateTime r7 = r7.a()
                L53:
                    boolean r2 = r6.hasNext()
                    if (r2 == 0) goto L6b
                    java.lang.Object r2 = r6.next()
                    j00.d r2 = (j00.d) r2
                    org.joda.time.DateTime r2 = r2.a()
                    int r4 = r7.compareTo(r2)
                    if (r4 <= 0) goto L53
                    r7 = r2
                    goto L53
                L6b:
                    r6 = r7
                L6c:
                    if (r6 == 0) goto L6f
                    goto L75
                L6f:
                    com.withings.nervehealth.ui.NerveHealthViewModel r6 = r5.f42465b
                    org.joda.time.DateTime r6 = r6.F0()
                L75:
                    org.joda.time.DateTime r7 = org.joda.time.DateTime.now()
                    org.joda.time.Interval r2 = new org.joda.time.Interval
                    r2.<init>(r6, r7)
                    goto L95
                L7f:
                    org.joda.time.Interval r2 = new org.joda.time.Interval
                    org.joda.time.DateTime r6 = org.joda.time.DateTime.now()
                    java.lang.String r7 = "now(...)"
                    kotlin.jvm.internal.u.i(r6, r7)
                    org.joda.time.DateTime r6 = hn.a.t(r6)
                    org.joda.time.DateTime r7 = org.joda.time.DateTime.now()
                    r2.<init>(r6, r7)
                L95:
                    r0.f42467b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r5.f42464a
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto La0
                    return r1
                La0:
                    nm0.y r6 = nm0.y.f85009a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.NerveHealthViewModel.l.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public l(SharedFlow sharedFlow, NerveHealthViewModel nerveHealthViewModel) {
            this.f42462a = sharedFlow;
            this.f42463b = nerveHealthViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Interval> flowCollector, qm0.d dVar) {
            Object collect = this.f42462a.collect(new a(flowCollector, this.f42463b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class m implements Flow<p00.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f42469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NerveHealthViewModel f42470b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f42471a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NerveHealthViewModel f42472b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$special$$inlined$map$4$2", f = "NerveHealthViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.nervehealth.ui.NerveHealthViewModel$m$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0567a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f42473a;

                /* renamed from: b  reason: collision with root package name */
                int f42474b;

                public C0567a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42473a = obj;
                    this.f42474b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, NerveHealthViewModel nerveHealthViewModel) {
                this.f42471a = flowCollector;
                this.f42472b = nerveHealthViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.withings.nervehealth.ui.NerveHealthViewModel.m.a.C0567a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.withings.nervehealth.ui.NerveHealthViewModel$m$a$a r0 = (com.withings.nervehealth.ui.NerveHealthViewModel.m.a.C0567a) r0
                    int r1 = r0.f42474b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42474b = r1
                    goto L18
                L13:
                    com.withings.nervehealth.ui.NerveHealthViewModel$m$a$a r0 = new com.withings.nervehealth.ui.NerveHealthViewModel$m$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f42473a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f42474b
                    r3 = 1
                    if (r2 == 0) goto L30
                    if (r2 != r3) goto L28
                    nm0.l.b(r10)
                    goto La3
                L28:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L30:
                    nm0.l.b(r10)
                    l00.a r9 = (l00.a) r9
                    com.withings.nervehealth.ui.NerveHealthViewModel r10 = r8.f42472b
                    if (r9 == 0) goto L87
                    java.util.List r9 = r9.a()
                    if (r9 == 0) goto L87
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.Iterator r9 = r9.iterator()
                    boolean r2 = r9.hasNext()
                    if (r2 != 0) goto L4d
                    r9 = 0
                    goto L7a
                L4d:
                    java.lang.Object r2 = r9.next()
                    boolean r4 = r9.hasNext()
                    if (r4 != 0) goto L59
                L57:
                    r9 = r2
                    goto L7a
                L59:
                    r4 = r2
                    j00.d r4 = (j00.d) r4
                    org.joda.time.DateTime r4 = r4.a()
                L60:
                    java.lang.Object r5 = r9.next()
                    r6 = r5
                    j00.d r6 = (j00.d) r6
                    org.joda.time.DateTime r6 = r6.a()
                    int r7 = r4.compareTo(r6)
                    if (r7 >= 0) goto L73
                    r2 = r5
                    r4 = r6
                L73:
                    boolean r5 = r9.hasNext()
                    if (r5 != 0) goto L60
                    goto L57
                L7a:
                    j00.d r9 = (j00.d) r9
                    if (r9 == 0) goto L87
                    com.withings.nervehealth.ui.usecases.a r10 = com.withings.nervehealth.ui.NerveHealthViewModel.i0(r10)
                    p00.a r9 = r10.b(r9)
                    goto L98
                L87:
                    com.withings.nervehealth.ui.usecases.a r9 = com.withings.nervehealth.ui.NerveHealthViewModel.i0(r10)
                    org.joda.time.DateTime r10 = org.joda.time.DateTime.now()
                    java.lang.String r2 = "now(...)"
                    kotlin.jvm.internal.u.i(r10, r2)
                    p00.a r9 = r9.a(r10)
                L98:
                    r0.f42474b = r3
                    kotlinx.coroutines.flow.FlowCollector r10 = r8.f42471a
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto La3
                    return r1
                La3:
                    nm0.y r9 = nm0.y.f85009a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.NerveHealthViewModel.m.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public m(SharedFlow sharedFlow, NerveHealthViewModel nerveHealthViewModel) {
            this.f42469a = sharedFlow;
            this.f42470b = nerveHealthViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super p00.a> flowCollector, qm0.d dVar) {
            Object collect = this.f42469a.collect(new a(flowCollector, this.f42470b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class n implements Flow<p00.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f42476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NerveHealthViewModel f42477b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f42478a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NerveHealthViewModel f42479b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$special$$inlined$map$5$2", f = "NerveHealthViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.nervehealth.ui.NerveHealthViewModel$n$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0568a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f42480a;

                /* renamed from: b  reason: collision with root package name */
                int f42481b;

                public C0568a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42480a = obj;
                    this.f42481b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, NerveHealthViewModel nerveHealthViewModel) {
                this.f42478a = flowCollector;
                this.f42479b = nerveHealthViewModel;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
                if (hn.a.f(r9, r4) != false) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.withings.nervehealth.ui.NerveHealthViewModel.n.a.C0568a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.withings.nervehealth.ui.NerveHealthViewModel$n$a$a r0 = (com.withings.nervehealth.ui.NerveHealthViewModel.n.a.C0568a) r0
                    int r1 = r0.f42481b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42481b = r1
                    goto L18
                L13:
                    com.withings.nervehealth.ui.NerveHealthViewModel$n$a$a r0 = new com.withings.nervehealth.ui.NerveHealthViewModel$n$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f42480a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f42481b
                    r3 = 1
                    if (r2 == 0) goto L30
                    if (r2 != r3) goto L28
                    nm0.l.b(r10)
                    goto Le1
                L28:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L30:
                    nm0.l.b(r10)
                    l00.a r9 = (l00.a) r9
                    r10 = 0
                    if (r9 == 0) goto L8f
                    java.util.List r9 = r9.a()
                    if (r9 == 0) goto L8f
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.Iterator r9 = r9.iterator()
                    boolean r2 = r9.hasNext()
                    if (r2 != 0) goto L4c
                    r2 = r10
                    goto L77
                L4c:
                    java.lang.Object r2 = r9.next()
                    boolean r4 = r9.hasNext()
                    if (r4 != 0) goto L57
                    goto L77
                L57:
                    r4 = r2
                    j00.d r4 = (j00.d) r4
                    org.joda.time.DateTime r4 = r4.a()
                L5e:
                    java.lang.Object r5 = r9.next()
                    r6 = r5
                    j00.d r6 = (j00.d) r6
                    org.joda.time.DateTime r6 = r6.a()
                    int r7 = r4.compareTo(r6)
                    if (r7 >= 0) goto L71
                    r2 = r5
                    r4 = r6
                L71:
                    boolean r5 = r9.hasNext()
                    if (r5 != 0) goto L5e
                L77:
                    j00.d r2 = (j00.d) r2
                    if (r2 == 0) goto L8f
                    org.joda.time.DateTime r9 = r2.a()
                    org.joda.time.DateTime r4 = org.joda.time.DateTime.now()
                    java.lang.String r5 = "now(...)"
                    kotlin.jvm.internal.u.i(r4, r5)
                    boolean r9 = hn.a.f(r9, r4)
                    if (r9 == 0) goto L8f
                    goto L90
                L8f:
                    r2 = r10
                L90:
                    com.withings.nervehealth.ui.NerveHealthViewModel r9 = r8.f42479b
                    com.android.billingclient.api.v r9 = com.withings.nervehealth.ui.NerveHealthViewModel.y0(r9)
                    r9.getClass()
                    if (r2 != 0) goto L9e
                    com.withings.nervehealth.ui.models.NerveHealthPredictedState r9 = com.withings.nervehealth.ui.models.NerveHealthPredictedState.f42736a
                    goto Lac
                L9e:
                    boolean r9 = r2 instanceof j00.d.e
                    if (r9 == 0) goto La3
                    goto La7
                La3:
                    boolean r9 = r2 instanceof j00.d.a
                    if (r9 == 0) goto Laa
                La7:
                    com.withings.nervehealth.ui.models.NerveHealthPredictedState r9 = com.withings.nervehealth.ui.models.NerveHealthPredictedState.f42737b
                    goto Lac
                Laa:
                    com.withings.nervehealth.ui.models.NerveHealthPredictedState r9 = com.withings.nervehealth.ui.models.NerveHealthPredictedState.f42738c
                Lac:
                    if (r2 == 0) goto Lb4
                    org.joda.time.DateTime r4 = r2.a()
                    if (r4 != 0) goto Lb8
                Lb4:
                    org.joda.time.DateTime r4 = org.joda.time.DateTime.now()
                Lb8:
                    p00.b r5 = new p00.b
                    if (r2 == 0) goto Lc0
                    java.lang.Integer r10 = r2.c()
                Lc0:
                    kotlin.jvm.internal.u.g(r4)
                    org.joda.time.DateTime$Property r2 = r4.dayOfMonth()
                    int r2 = r2.get()
                    org.joda.time.DateTime$Property r4 = r4.dayOfMonth()
                    int r4 = r4.getMaximumValue()
                    r5.<init>(r10, r2, r4, r9)
                    r0.f42481b = r3
                    kotlinx.coroutines.flow.FlowCollector r9 = r8.f42478a
                    java.lang.Object r9 = r9.emit(r5, r0)
                    if (r9 != r1) goto Le1
                    return r1
                Le1:
                    nm0.y r9 = nm0.y.f85009a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.NerveHealthViewModel.n.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public n(SharedFlow sharedFlow, NerveHealthViewModel nerveHealthViewModel) {
            this.f42476a = sharedFlow;
            this.f42477b = nerveHealthViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super p00.b> flowCollector, qm0.d dVar) {
            Object collect = this.f42476a.collect(new a(flowCollector, this.f42477b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    /* loaded from: classes4.dex */
    static final class o extends kotlin.jvm.internal.w implements ym0.a<User> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m70.i f42484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(m70.i iVar) {
            super(0);
            this.f42484b = iVar;
        }

        @Override // ym0.a
        public final User invoke() {
            User user;
            Long A0 = NerveHealthViewModel.A0(NerveHealthViewModel.this);
            m70.i iVar = this.f42484b;
            if (A0 != null) {
                user = iVar.i(A0.longValue());
            } else {
                user = null;
            }
            if (user == null) {
                User e11 = iVar.e();
                kotlin.jvm.internal.u.i(e11, "getMainUser(...)");
                return e11;
            }
            return user;
        }
    }

    /* compiled from: NerveHealthViewModel.kt */
    /* loaded from: classes4.dex */
    static final class p extends kotlin.jvm.internal.w implements ym0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f42485a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(u0 u0Var) {
            super(0);
            this.f42485a = u0Var;
        }

        @Override // ym0.a
        public final Long invoke() {
            return (Long) this.f42485a.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public NerveHealthViewModel(Application application, u0 savedStateHandle, m70.i userManager, LearnMoreManager learnMoreManager, j00.c cVar, cy.a aVar, i00.e eVar, com.withings.nervehealth.ui.usecases.a aVar2, i00.f fVar, com.android.billingclient.api.v vVar, i00.a aVar3, i00.b bVar, j00.f fVar2, ComputeNerveHealthNormalityZoneUseCase computeNerveHealthNormalityZoneUseCase) {
        super(application);
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f42401a = aVar;
        this.f42402b = eVar;
        this.f42403c = aVar2;
        this.f42404d = fVar;
        this.f42405e = vVar;
        this.f42406f = aVar3;
        this.f42407g = bVar;
        this.f42408h = fVar2;
        this.f42409i = computeNerveHealthNormalityZoneUseCase;
        nm0.g b10 = nm0.h.b(new p(savedStateHandle));
        this.f42410j = b10;
        this.f42411k = nm0.h.b(new o(userManager));
        this.f42412l = nm0.h.b(new b(savedStateHandle));
        this.f42413m = nm0.h.b(new c(savedStateHandle));
        Flow flowOn = FlowKt.flowOn(FlowKt.flow(new d(null)), Dispatchers.getIO());
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<List<Long>> shareIn = FlowKt.shareIn(flowOn, a11, companion.getEagerly(), 1);
        this.f42414n = shareIn;
        this.f42415o = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new e(null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), 1);
        GraphPeriod graphPeriod = GraphPeriod.f39506f;
        DateTime F0 = F0();
        kotlin.jvm.internal.u.i(F0, "<get-defaultDate>(...)");
        this.f42416p = new at.a(graphPeriod, F0);
        this.f42417q = FlowKt.shareIn(FlowKt.flowOn(new j(shareIn, this), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), 1);
        xw.n<nm0.y> nVar = new xw.n<>();
        this.f42418r = nVar;
        this.f42419s = new xw.n<>();
        MutableSharedFlow<l00.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f42420t = MutableSharedFlow$default;
        SharedFlow<l00.a> asSharedFlow = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f42421u = asSharedFlow;
        this.f42422v = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new f(learnMoreManager, this, null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), 1);
        Flow<l00.b> a12 = cVar.a();
        this.f42423w = a12;
        SharedFlow<Boolean> shareIn2 = FlowKt.shareIn(new k(a12), h1.a(this), companion.getEagerly(), 1);
        this.f42424x = shareIn2;
        SharedFlow<Interval> shareIn3 = FlowKt.shareIn(FlowKt.flowOn(new l(asSharedFlow, this), Dispatchers.getDefault()), h1.a(this), companion.getEagerly(), 1);
        this.f42425y = shareIn3;
        this.f42426z = FlowKt.shareIn(FlowKt.flowOn(FlowKt.combine(asSharedFlow, shareIn2, shareIn3, new h(null)), Dispatchers.getDefault()), h1.a(this), companion.getEagerly(), 1);
        this.A = FlowKt.shareIn(FlowKt.flowOn(new m(asSharedFlow, this), Dispatchers.getDefault()), h1.a(this), companion.getEagerly(), 1);
        this.B = FlowKt.shareIn(FlowKt.flowOn(new n(asSharedFlow, this), Dispatchers.getDefault()), h1.a(this), companion.getEagerly(), 1);
        this.F = new g();
        if (((Long) b10.getValue()) != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
        } else {
            nVar.setValue(null);
        }
    }

    public static final Long A0(NerveHealthViewModel nerveHealthViewModel) {
        return (Long) nerveHealthViewModel.f42410j.getValue();
    }

    public static final NormalityZoneUiModel f0(NerveHealthViewModel nerveHealthViewModel, Interval interval, List list) {
        nerveHealthViewModel.getClass();
        NeuropathyFeature.f42330d.getClass();
        int b10 = NeuropathyFeature.a.a((MeasureCategory) nerveHealthViewModel.f42412l.getValue()).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer c11 = ((j00.d) it.next()).c();
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        nerveHealthViewModel.f42409i.getClass();
        return ComputeNerveHealthNormalityZoneUseCase.b(b10, interval, arrayList);
    }

    public static final MeasureCategory g0(NerveHealthViewModel nerveHealthViewModel) {
        return (MeasureCategory) nerveHealthViewModel.f42412l.getValue();
    }

    public final DateTime F0() {
        return (DateTime) this.f42413m.getValue();
    }

    public final SharedFlow<List<Integer>> G0() {
        return this.f42415o;
    }

    public final xw.n<nm0.y> K0() {
        return this.f42418r;
    }

    public final SharedFlow<l00.a> M0() {
        return this.f42421u;
    }

    public final SharedFlow<p00.a> O0() {
        return this.A;
    }

    public final SharedFlow<List<LearnMoreEntryTranslations>> R0() {
        return this.f42422v;
    }

    public final SharedFlow<Interval> T0() {
        return this.f42425y;
    }

    public final SharedFlow<NormalityZoneUiModel> U0() {
        return this.f42426z;
    }

    public final SharedFlow<p00.b> V0() {
        return this.B;
    }

    public final xw.n<nm0.j<Period, DateTime>> W0() {
        return this.f42419s;
    }

    public final SharedFlow<Boolean> X0() {
        return this.f42424x;
    }

    public final String Y0() {
        NeuropathyFeature.f42330d.getClass();
        return NeuropathyFeature.a.a((MeasureCategory) this.f42412l.getValue()).d();
    }

    public final int Z0() {
        com.withings.nervehealth.ui.models.resources.a aVar;
        MeasureCategory category = (MeasureCategory) this.f42412l.getValue();
        kotlin.jvm.internal.u.j(category, "category");
        int ordinal = category.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    aVar = a.C0573a.f42752d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aVar = a.c.f42754d;
            }
        } else {
            aVar = a.b.f42753d;
        }
        return aVar.c();
    }

    public final User a1() {
        return (User) this.f42411k.getValue();
    }

    public final at.a c1() {
        return this.f42416p;
    }

    public final SharedFlow<Boolean> d1() {
        return this.f42417q;
    }

    public final void e1(ws.f viewport) {
        kotlin.jvm.internal.u.j(viewport, "viewport");
        xw.d.e(this.f42419s, new nm0.j(viewport.b().a(), viewport.a()));
    }

    public final void g1() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new i(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f42401a.b(this.F);
        super.onCleared();
    }
}
