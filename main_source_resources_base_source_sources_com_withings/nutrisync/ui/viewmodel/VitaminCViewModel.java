package com.withings.nutrisync.ui.viewmodel;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.graph.GraphPeriod;
import com.withings.graph.model.NormalityZoneUiModel;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import m10.b;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import ym0.p;
import ym0.q;
import ym0.r;
/* compiled from: VitaminCViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/nutrisync/ui/viewmodel/VitaminCViewModel;", "Landroidx/lifecycle/g1;", "Lpy/a;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VitaminCViewModel extends g1 implements py.a {

    /* renamed from: a  reason: collision with root package name */
    private final LearnMoreManager f43299a;

    /* renamed from: b  reason: collision with root package name */
    private final int f43300b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<Throwable> f43301c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<Throwable> f43302d;

    /* renamed from: e  reason: collision with root package name */
    private final String f43303e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<b.c.a> f43304f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<at.a> f43305g;

    /* renamed from: h  reason: collision with root package name */
    private final SharedFlow f43306h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow f43307i;

    /* renamed from: j  reason: collision with root package name */
    private final SharedFlow f43308j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedFlow f43309k;

    /* renamed from: l  reason: collision with root package name */
    private final Flow<b.d> f43310l;

    /* renamed from: m  reason: collision with root package name */
    private final Flow<b.c.C1280b> f43311m;

    /* renamed from: n  reason: collision with root package name */
    private final Flow<m10.b> f43312n;

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* compiled from: VitaminCViewModel.kt */
        /* renamed from: com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0582a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ sm0.a<Period> f43314a = sm0.b.a(Period.values());
        }

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            VitaminCViewModel vitaminCViewModel;
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            Iterator<E> it = C0582a.f43314a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                vitaminCViewModel = VitaminCViewModel.this;
                if (hasNext) {
                    obj2 = it.next();
                    if (((Period) obj2).ordinal() == vitaminCViewModel.f43300b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Period period = (Period) obj2;
            if (period == null) {
                period = Period.f43721f;
            }
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            b0.V(vitaminCViewModel, period, now);
            return y.f85009a;
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<Period> f43315a = sm0.b.a(Period.values());
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$barChartScrubberUiModel$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements p<FlowCollector<? super l10.a>, qm0.d<? super y>, Object> {
        c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super l10.a> flowCollector, qm0.d<? super y> dVar) {
            return ((c) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ParcelableSnapshotMutableState f11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            f11 = l0.f(null, v0.f8878a);
            new l10.a(f11, "");
            return y.f85009a;
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$barChartUiModel$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements p<FlowCollector<? super ws.a>, qm0.d<? super y>, Object> {
        d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super ws.a> flowCollector, qm0.d<? super y> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return y.f85009a;
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$learnMoreEntries$1", f = "VitaminCViewModel.kt", l = {56, 56}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements p<FlowCollector<? super b.c.a>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43316a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f43317b;

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f43317b = obj;
            return eVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super b.c.a> flowCollector, qm0.d<? super y> dVar) {
            return ((e) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            List<LearnMoreEntryTranslations> list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f43316a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f43317b;
                l.b(obj);
            } else {
                l.b(obj);
                flowCollector = (FlowCollector) this.f43317b;
                LearnMoreManager learnMoreManager = VitaminCViewModel.this.f43299a;
                this.f43317b = flowCollector;
                this.f43316a = 1;
                obj = learnMoreManager.getLearnMoreCategories(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
            if (learnMoreCategories == null || (list = learnMoreCategories.getCycleTracking()) == null) {
                list = i0.f76187a;
            }
            b.c.a aVar = new b.c.a(list);
            this.f43317b = null;
            this.f43316a = 2;
            if (flowCollector.emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$secondaryCardUiModel$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements q<ws.a, l10.a, qm0.d<? super b.d.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ ws.a f43319a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ l10.a f43320b;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$f] */
        @Override // ym0.q
        public final Object invoke(ws.a aVar, l10.a aVar2, qm0.d<? super b.d.a> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f43319a = aVar;
            iVar.f43320b = aVar2;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return new b.d.a(0, this.f43319a, this.f43320b);
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$sections$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements r<b.a, b.c.a, b.d, qm0.d<? super b.c.C1280b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ b.a f43321a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ b.c.a f43322b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ b.d f43323c;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$g] */
        @Override // ym0.r
        public final Object invoke(b.a aVar, b.c.a aVar2, b.d dVar, qm0.d<? super b.c.C1280b> dVar2) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(4, dVar2);
            iVar.f43321a = aVar;
            iVar.f43322b = aVar2;
            iVar.f43323c = dVar;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return new b.c.C1280b(this.f43322b, this.f43321a, this.f43323c);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class h implements Flow<b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f43324a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f43325a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$special$$inlined$map$1$2", f = "VitaminCViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0583a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f43326a;

                /* renamed from: b  reason: collision with root package name */
                int f43327b;

                public C0583a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f43326a = obj;
                    this.f43327b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f43325a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.nutrisync.ui.viewmodel.VitaminCViewModel.h.a.C0583a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$h$a$a r0 = (com.withings.nutrisync.ui.viewmodel.VitaminCViewModel.h.a.C0583a) r0
                    int r1 = r0.f43327b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f43327b = r1
                    goto L18
                L13:
                    com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$h$a$a r0 = new com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$h$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f43326a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f43327b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L46
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    at.a r5 = (at.a) r5
                    m10.b$a r5 = new m10.b$a
                    java.lang.String r6 = ""
                    r5.<init>(r6)
                    r0.f43327b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f43325a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.nutrisync.ui.viewmodel.VitaminCViewModel.h.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public h(MutableStateFlow mutableStateFlow) {
            this.f43324a = mutableStateFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super b.a> flowCollector, qm0.d dVar) {
            Object collect = this.f43324a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$stripPlotScrubberUiModel$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class i extends kotlin.coroutines.jvm.internal.i implements p<FlowCollector<? super l10.b>, qm0.d<? super y>, Object> {
        i() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super l10.b> flowCollector, qm0.d<? super y> dVar) {
            return ((i) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ParcelableSnapshotMutableState f11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            f11 = l0.f(null, v0.f8878a);
            new l10.b(f11, "");
            return y.f85009a;
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$stripPlotUiModel$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.i implements p<FlowCollector<? super ws.e>, qm0.d<? super y>, Object> {
        j() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super ws.e> flowCollector, qm0.d<? super y> dVar) {
            return ((j) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            new NormalityZoneUiModel(NormalityZoneUiModel.Status.f39968a, i0.f76187a, NormalityZoneUiModel.Type.f39972b);
            new Interval(DateTime.now(), DateTime.now());
            return y.f85009a;
        }
    }

    /* compiled from: VitaminCViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$uiState$1", f = "VitaminCViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.i implements r<b.c.C1280b, ws.e, l10.b, qm0.d<? super b.c>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ b.c.C1280b f43329a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ ws.e f43330b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ l10.b f43331c;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.nutrisync.ui.viewmodel.VitaminCViewModel$k] */
        @Override // ym0.r
        public final Object invoke(b.c.C1280b c1280b, ws.e eVar, l10.b bVar, qm0.d<? super b.c> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(4, dVar);
            iVar.f43329a = c1280b;
            iVar.f43330b = eVar;
            iVar.f43331c = bVar;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return new b.c(this.f43330b, this.f43331c, this.f43329a, kotlin.collections.l.z(new GraphPeriod[]{GraphPeriod.f39504d, GraphPeriod.f39505e, GraphPeriod.f39506f, GraphPeriod.f39507g}));
        }
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [kotlin.coroutines.jvm.internal.i, ym0.r] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.coroutines.jvm.internal.i, ym0.r] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public VitaminCViewModel(u0 savedStateHandle, xw.b dispatchers, LearnMoreManager learnMoreManager) {
        Object obj;
        GraphPeriod graphPeriod;
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatchers, "dispatchers");
        this.f43299a = learnMoreManager;
        if (((Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID)) != null) {
            Integer num = (Integer) savedStateHandle.c("period");
            if (num != null) {
                this.f43300b = num.intValue();
                MutableStateFlow<Throwable> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
                this.f43301c = MutableStateFlow;
                this.f43302d = FlowKt.asStateFlow(MutableStateFlow);
                this.f43303e = "vitamin_c";
                this.f43304f = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new e(null)), dispatchers.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 1);
                Iterator it = ((kotlin.collections.c) b.f43315a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Period) obj).ordinal() == this.f43300b) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Period period = (Period) obj;
                if (period != null) {
                    graphPeriod = h20.a.c(period);
                } else {
                    graphPeriod = GraphPeriod.f39502b;
                }
                DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                MutableStateFlow<at.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new at.a(graphPeriod, withTimeAtStartOfDay));
                this.f43305g = MutableStateFlow2;
                Flow flowOn = FlowKt.flowOn(FlowKt.flow(new kotlin.coroutines.jvm.internal.i(2, null)), dispatchers.a());
                CoroutineScope a11 = h1.a(this);
                SharingStarted.Companion companion = SharingStarted.Companion;
                SharedFlow shareIn = FlowKt.shareIn(flowOn, a11, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                this.f43306h = shareIn;
                SharedFlow shareIn2 = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new kotlin.coroutines.jvm.internal.i(2, null)), dispatchers.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                this.f43307i = shareIn2;
                SharedFlow shareIn3 = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new kotlin.coroutines.jvm.internal.i(2, null)), dispatchers.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                this.f43308j = shareIn3;
                SharedFlow shareIn4 = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new kotlin.coroutines.jvm.internal.i(2, null)), dispatchers.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                this.f43309k = shareIn4;
                Flow<b.d> combine = FlowKt.combine(shareIn, shareIn2, new kotlin.coroutines.jvm.internal.i(3, null));
                this.f43310l = combine;
                Flow<b.c.C1280b> combine2 = FlowKt.combine(new h(MutableStateFlow2), this.f43304f, combine, new kotlin.coroutines.jvm.internal.i(4, null));
                this.f43311m = combine2;
                this.f43312n = FlowKt.combine(combine2, shareIn4, shareIn3, new kotlin.coroutines.jvm.internal.i(4, null));
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(null), 3, null);
                return;
            }
            throw new Exception("period shouldn't be null");
        }
        throw new Exception("user id shouldn't be null");
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f43303e;
    }

    public final StateFlow<Throwable> i0() {
        return this.f43302d;
    }

    public final Flow<m10.b> j0() {
        return this.f43312n;
    }

    public final void k0(GraphPeriod newGraphPeriod, DateTime newDate) {
        u.j(newGraphPeriod, "newGraphPeriod");
        u.j(newDate, "newDate");
        Period a11 = newGraphPeriod.a();
        MutableStateFlow<at.a> mutableStateFlow = this.f43305g;
        if (a11 != mutableStateFlow.getValue().d().a()) {
            b0.V(this, a11, newDate);
        }
        mutableStateFlow.getValue().i(newGraphPeriod, newDate);
    }
}
