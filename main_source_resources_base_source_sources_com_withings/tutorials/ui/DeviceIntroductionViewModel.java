package com.withings.tutorials.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.device.Device;
import com.withings.scalesmodes.core.ScalesModes;
import com.withings.tutorials.core.FeatureTutorial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.StateFlow;
import l70.w;
/* compiled from: DeviceIntroductionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/DeviceIntroductionViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeviceIntroductionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final fl.p f44606a;

    /* renamed from: b  reason: collision with root package name */
    private final m70.i f44607b;

    /* renamed from: c  reason: collision with root package name */
    private final kn.e f44608c;

    /* renamed from: d  reason: collision with root package name */
    private final long f44609d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableSharedFlow<Device> f44610e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<Device> f44611f;

    /* renamed from: g  reason: collision with root package name */
    private final Flow<List<o60.f>> f44612g;

    /* renamed from: h  reason: collision with root package name */
    private final Flow<Boolean> f44613h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow f44614i;

    /* renamed from: j  reason: collision with root package name */
    private final Flow<Integer> f44615j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedFlow f44616k;

    /* renamed from: l  reason: collision with root package name */
    private final Flow<List<ur.a>> f44617l;

    /* renamed from: m  reason: collision with root package name */
    private final i f44618m;

    /* renamed from: n  reason: collision with root package name */
    private final Flow<List<o60.d>> f44619n;

    /* renamed from: o  reason: collision with root package name */
    private final Flow<List<o60.h>> f44620o;

    /* compiled from: DeviceIntroductionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$1", f = "DeviceIntroductionViewModel.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44621a;

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
            int i11 = this.f44621a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                DeviceIntroductionViewModel deviceIntroductionViewModel = DeviceIntroductionViewModel.this;
                MutableSharedFlow mutableSharedFlow = deviceIntroductionViewModel.f44610e;
                Device d11 = deviceIntroductionViewModel.f44608c.d(deviceIntroductionViewModel.f44609d);
                kotlin.jvm.internal.u.i(d11, "getById(...)");
                this.f44621a = 1;
                if (mutableSharedFlow.emit(d11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceIntroductionViewModel.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<FeatureTutorial> f44623a = sm0.b.a(FeatureTutorial.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceIntroductionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$availableFeaturesForDevice$1$1", f = "DeviceIntroductionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends ur.a>, qm0.d<? super List<? extends ur.a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f44624a;

        /* compiled from: DeviceIntroductionViewModel.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ sm0.a<FeatureTutorial> f44625a = sm0.b.a(FeatureTutorial.values());
        }

        c() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.tutorials.ui.DeviceIntroductionViewModel$c, qm0.d<nm0.y>] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
            iVar.f44624a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends ur.a> list, qm0.d<? super List<? extends ur.a>> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.f44624a) {
                ur.a aVar = (ur.a) obj2;
                sm0.a<FeatureTutorial> aVar2 = a.f44625a;
                if (!(aVar2 instanceof Collection) || !aVar2.isEmpty()) {
                    Iterator<E> it = aVar2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (aVar.c() == o60.e.a((FeatureTutorial) it.next())) {
                                arrayList.add(obj2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* compiled from: DeviceIntroductionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$featureCards$1", f = "DeviceIntroductionViewModel.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends ur.a>, Device, qm0.d<? super List<? extends o60.d>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Collection f44626a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f44627b;

        /* renamed from: c  reason: collision with root package name */
        ur.a f44628c;

        /* renamed from: d  reason: collision with root package name */
        Device f44629d;

        /* renamed from: e  reason: collision with root package name */
        DeviceIntroductionViewModel f44630e;

        /* renamed from: f  reason: collision with root package name */
        int f44631f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f44632g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f44633h;

        d(qm0.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(List<? extends ur.a> list, Device device, qm0.d<? super List<? extends o60.d>> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f44632g = list;
            dVar2.f44633h = device;
            return dVar2.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00ab A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007b -> B:15:0x0081). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 496
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.DeviceIntroductionViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DeviceIntroductionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$hasModes$1", f = "DeviceIntroductionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends ur.a>, Device, Boolean, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f44635a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Device f44636b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ boolean f44637c;

        e(qm0.d<? super e> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(List<? extends ur.a> list, Device device, Boolean bool, qm0.d<? super Boolean> dVar) {
            boolean booleanValue = bool.booleanValue();
            e eVar = new e(dVar);
            eVar.f44635a = list;
            eVar.f44636b = device;
            eVar.f44637c = booleanValue;
            return eVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            gl.d0 d0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f44635a;
            Device device = this.f44636b;
            boolean z5 = this.f44637c;
            fl.o d11 = DeviceIntroductionViewModel.this.f44606a.d(device.getModelId());
            if (d11 instanceof gl.d0) {
                d0Var = (gl.d0) d11;
            } else {
                d0Var = null;
            }
            boolean z11 = false;
            if (d0Var != null && d0Var.f(device.getFirmware())) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ScalesModes h11 = df.d.h(((ur.a) it.next()).c());
                        if (h11 != null && com.withings.common.device.s.f(h11)) {
                            if (!z5) {
                                z11 = true;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$special$$inlined$flatMapLatest$1", f = "DeviceIntroductionViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super List<? extends ur.a>>, Device, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44639a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f44640b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f44641c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ vr.d f44642d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(qm0.d dVar, vr.d dVar2) {
            super(3, dVar);
            this.f44642d = dVar2;
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super List<? extends ur.a>> flowCollector, Device device, qm0.d<? super nm0.y> dVar) {
            f fVar = new f(dVar, this.f44642d);
            fVar.f44640b = flowCollector;
            fVar.f44641c = device;
            return fVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44639a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f44640b;
                Flow mapLatest = FlowKt.mapLatest(this.f44642d.get(((Device) this.f44641c).getId()), new kotlin.coroutines.jvm.internal.i(2, null));
                this.f44639a = 1;
                if (FlowKt.emitAll(flowCollector, mapLatest, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class g implements Flow<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f44643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceIntroductionViewModel f44644b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f44645a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DeviceIntroductionViewModel f44646b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$special$$inlined$map$1$2", f = "DeviceIntroductionViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.tutorials.ui.DeviceIntroductionViewModel$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0615a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f44647a;

                /* renamed from: b  reason: collision with root package name */
                int f44648b;

                public C0615a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f44647a = obj;
                    this.f44648b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, DeviceIntroductionViewModel deviceIntroductionViewModel) {
                this.f44645a = flowCollector;
                this.f44646b = deviceIntroductionViewModel;
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
                    boolean r0 = r6 instanceof com.withings.tutorials.ui.DeviceIntroductionViewModel.g.a.C0615a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.tutorials.ui.DeviceIntroductionViewModel$g$a$a r0 = (com.withings.tutorials.ui.DeviceIntroductionViewModel.g.a.C0615a) r0
                    int r1 = r0.f44648b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f44648b = r1
                    goto L18
                L13:
                    com.withings.tutorials.ui.DeviceIntroductionViewModel$g$a$a r0 = new com.withings.tutorials.ui.DeviceIntroductionViewModel$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f44647a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f44648b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L59
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.device.Device r5 = (com.withings.device.Device) r5
                    java.lang.Long r5 = r5.getUserId()
                    if (r5 != 0) goto L4e
                    com.withings.tutorials.ui.DeviceIntroductionViewModel r5 = r4.f44646b
                    m70.i r5 = com.withings.tutorials.ui.DeviceIntroductionViewModel.j0(r5)
                    com.withings.user.User r5 = r5.e()
                    long r5 = r5.q()
                    java.lang.Long r2 = new java.lang.Long
                    r2.<init>(r5)
                    r5 = r2
                L4e:
                    r0.f44648b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f44645a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.DeviceIntroductionViewModel.g.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public g(MutableSharedFlow mutableSharedFlow, DeviceIntroductionViewModel deviceIntroductionViewModel) {
            this.f44643a = mutableSharedFlow;
            this.f44644b = deviceIntroductionViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Long> flowCollector, qm0.d dVar) {
            Object collect = this.f44643a.collect(new a(flowCollector, this.f44644b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class h implements Flow<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f44650a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceIntroductionViewModel f44651b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f44652a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DeviceIntroductionViewModel f44653b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$special$$inlined$map$2$2", f = "DeviceIntroductionViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.tutorials.ui.DeviceIntroductionViewModel$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0616a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f44654a;

                /* renamed from: b  reason: collision with root package name */
                int f44655b;

                public C0616a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f44654a = obj;
                    this.f44655b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, DeviceIntroductionViewModel deviceIntroductionViewModel) {
                this.f44652a = flowCollector;
                this.f44653b = deviceIntroductionViewModel;
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
                    boolean r0 = r6 instanceof com.withings.tutorials.ui.DeviceIntroductionViewModel.h.a.C0616a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.tutorials.ui.DeviceIntroductionViewModel$h$a$a r0 = (com.withings.tutorials.ui.DeviceIntroductionViewModel.h.a.C0616a) r0
                    int r1 = r0.f44655b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f44655b = r1
                    goto L18
                L13:
                    com.withings.tutorials.ui.DeviceIntroductionViewModel$h$a$a r0 = new com.withings.tutorials.ui.DeviceIntroductionViewModel$h$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f44654a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f44655b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L56
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.device.Device r5 = (com.withings.device.Device) r5
                    com.withings.tutorials.ui.DeviceIntroductionViewModel r6 = r4.f44653b
                    fl.p r6 = com.withings.tutorials.ui.DeviceIntroductionViewModel.i0(r6)
                    fl.o r6 = r6.g(r5)
                    java.lang.String r5 = r5.getColor()
                    int r5 = r6.I(r5)
                    java.lang.Integer r6 = new java.lang.Integer
                    r6.<init>(r5)
                    r0.f44655b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f44652a
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L56
                    return r1
                L56:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.DeviceIntroductionViewModel.h.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public h(Flow flow, DeviceIntroductionViewModel deviceIntroductionViewModel) {
            this.f44650a = flow;
            this.f44651b = deviceIntroductionViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Integer> flowCollector, qm0.d dVar) {
            Object collect = this.f44650a.collect(new a(flowCollector, this.f44651b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class i implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f44657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceIntroductionViewModel f44658b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f44659a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DeviceIntroductionViewModel f44660b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$special$$inlined$map$3$2", f = "DeviceIntroductionViewModel.kt", l = {224, 223}, m = "emit")
            /* renamed from: com.withings.tutorials.ui.DeviceIntroductionViewModel$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0617a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f44661a;

                /* renamed from: b  reason: collision with root package name */
                int f44662b;

                /* renamed from: c  reason: collision with root package name */
                FlowCollector f44663c;

                /* renamed from: e  reason: collision with root package name */
                List f44665e;

                public C0617a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f44661a = obj;
                    this.f44662b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, DeviceIntroductionViewModel deviceIntroductionViewModel) {
                this.f44659a = flowCollector;
                this.f44660b = deviceIntroductionViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, qm0.d r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.withings.tutorials.ui.DeviceIntroductionViewModel.i.a.C0617a
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.withings.tutorials.ui.DeviceIntroductionViewModel$i$a$a r0 = (com.withings.tutorials.ui.DeviceIntroductionViewModel.i.a.C0617a) r0
                    int r1 = r0.f44662b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f44662b = r1
                    goto L18
                L13:
                    com.withings.tutorials.ui.DeviceIntroductionViewModel$i$a$a r0 = new com.withings.tutorials.ui.DeviceIntroductionViewModel$i$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f44661a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f44662b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3d
                    if (r2 == r4) goto L33
                    if (r2 != r3) goto L2b
                    nm0.l.b(r12)
                    goto Lb6
                L2b:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L33:
                    java.util.List r11 = r0.f44665e
                    java.util.List r11 = (java.util.List) r11
                    kotlinx.coroutines.flow.FlowCollector r2 = r0.f44663c
                    nm0.l.b(r12)
                    goto L5a
                L3d:
                    nm0.l.b(r12)
                    java.util.List r11 = (java.util.List) r11
                    com.withings.tutorials.ui.DeviceIntroductionViewModel r12 = r10.f44660b
                    kotlinx.coroutines.flow.SharedFlow r12 = r12.z0()
                    kotlinx.coroutines.flow.FlowCollector r2 = r10.f44659a
                    r0.f44663c = r2
                    r5 = r11
                    java.util.List r5 = (java.util.List) r5
                    r0.f44665e = r5
                    r0.f44662b = r4
                    java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.first(r12, r0)
                    if (r12 != r1) goto L5a
                    return r1
                L5a:
                    java.lang.Number r12 = (java.lang.Number) r12
                    long r5 = r12.longValue()
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.ArrayList r12 = new java.util.ArrayList
                    r12.<init>()
                    java.util.Iterator r11 = r11.iterator()
                L6b:
                    boolean r7 = r11.hasNext()
                    if (r7 == 0) goto L84
                    java.lang.Object r7 = r11.next()
                    r8 = r7
                    ur.a r8 = (ur.a) r8
                    int r8 = r8.c()
                    r9 = 66
                    if (r8 == r9) goto L6b
                    r12.add(r7)
                    goto L6b
                L84:
                    boolean r11 = r12.isEmpty()
                    r7 = 0
                    if (r11 == 0) goto L8d
                L8b:
                    r4 = r7
                    goto La4
                L8d:
                    java.util.Iterator r11 = r12.iterator()
                L91:
                    boolean r12 = r11.hasNext()
                    if (r12 == 0) goto L8b
                    java.lang.Object r12 = r11.next()
                    ur.a r12 = (ur.a) r12
                    boolean r12 = r12.f(r5)
                    r12 = r12 ^ r4
                    if (r12 == 0) goto L91
                La4:
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
                    r12 = 0
                    r0.f44663c = r12
                    r0.f44665e = r12
                    r0.f44662b = r3
                    java.lang.Object r11 = r2.emit(r11, r0)
                    if (r11 != r1) goto Lb6
                    return r1
                Lb6:
                    nm0.y r11 = nm0.y.f85009a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.DeviceIntroductionViewModel.i.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public i(Flow flow, DeviceIntroductionViewModel deviceIntroductionViewModel) {
            this.f44657a = flow;
            this.f44658b = deviceIntroductionViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f44657a.collect(new a(flowCollector, this.f44658b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceIntroductionViewModel.kt */
    /* loaded from: classes4.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<l70.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f44666a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final l70.w invoke() {
            return w.a.a();
        }
    }

    /* compiled from: DeviceIntroductionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionViewModel$utilitiesCards$1", f = "DeviceIntroductionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.q<Device, Boolean, qm0.d<? super List<? extends o60.h>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Device f44667a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f44668b;

        k(qm0.d<? super k> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Device device, Boolean bool, qm0.d<? super List<? extends o60.h>> dVar) {
            boolean booleanValue = bool.booleanValue();
            k kVar = new k(dVar);
            kVar.f44667a = device;
            kVar.f44668b = booleanValue;
            return kVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[LOOP:0: B:11:0x0048->B:13:0x004e, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                nm0.l.b(r5)
                com.withings.device.Device r5 = r4.f44667a
                boolean r0 = r4.f44668b
                int r1 = r5.getModelId()
                r2 = 10
                if (r1 == r2) goto L2d
                switch(r1) {
                    case 15: goto L2d;
                    case 16: goto L2d;
                    case 17: goto L17;
                    case 18: goto L2d;
                    default: goto L14;
                }
            L14:
                kotlin.collections.i0 r0 = kotlin.collections.i0.f76187a
                goto L39
            L17:
                if (r0 == 0) goto L20
                com.withings.tutorials.core.UtilityIntroduction r0 = com.withings.tutorials.core.UtilityIntroduction.f44578b
                java.util.List r0 = kotlin.collections.x.V(r0)
                goto L39
            L20:
                com.withings.tutorials.core.UtilityIntroduction r0 = com.withings.tutorials.core.UtilityIntroduction.f44578b
                com.withings.tutorials.core.UtilityIntroduction r1 = com.withings.tutorials.core.UtilityIntroduction.f44577a
                com.withings.tutorials.core.UtilityIntroduction[] r0 = new com.withings.tutorials.core.UtilityIntroduction[]{r0, r1}
                java.util.List r0 = kotlin.collections.x.W(r0)
                goto L39
            L2d:
                com.withings.tutorials.core.UtilityIntroduction r0 = com.withings.tutorials.core.UtilityIntroduction.f44578b
                com.withings.tutorials.core.UtilityIntroduction r1 = com.withings.tutorials.core.UtilityIntroduction.f44577a
                com.withings.tutorials.core.UtilityIntroduction[] r0 = new com.withings.tutorials.core.UtilityIntroduction[]{r0, r1}
                java.util.List r0 = kotlin.collections.x.W(r0)
            L39:
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = kotlin.collections.x.y(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L48:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L62
                java.lang.Object r2 = r0.next()
                com.withings.tutorials.core.UtilityIntroduction r2 = (com.withings.tutorials.core.UtilityIntroduction) r2
                com.withings.tutorials.ui.DeviceIntroductionViewModel r3 = com.withings.tutorials.ui.DeviceIntroductionViewModel.this
                r3.getClass()
                o60.h r3 = new o60.h
                r3.<init>(r5, r2)
                r1.add(r3)
                goto L48
            L62:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.DeviceIntroductionViewModel.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public DeviceIntroductionViewModel(fl.p pVar, vr.d featureTagsRepository, u0 savedStateHandle, m70.i userManager, kn.e deviceManager, il.a isB2BDeviceUseCase, h70.c getSetupTutorialForDeviceModel) {
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(isB2BDeviceUseCase, "isB2BDeviceUseCase");
        kotlin.jvm.internal.u.j(getSetupTutorialForDeviceModel, "getSetupTutorialForDeviceModel");
        this.f44606a = pVar;
        this.f44607b = userManager;
        this.f44608c = deviceManager;
        Object c11 = savedStateHandle.c("extra_device_id");
        kotlin.jvm.internal.u.g(c11);
        long longValue = ((Number) c11).longValue();
        this.f44609d = longValue;
        MutableSharedFlow<Device> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f44610e = MutableSharedFlow$default;
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f44611f = FlowKt.stateIn(MutableSharedFlow$default, a11, companion.getLazily(), null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
        this.f44612g = getSetupTutorialForDeviceModel.a(longValue);
        this.f44613h = FlowKt.combine(featureTagsRepository.get(longValue), MutableSharedFlow$default, isB2BDeviceUseCase.a(longValue), new e(null));
        this.f44614i = FlowKt.shareIn(FlowKt.flowOn(new g(MutableSharedFlow$default, this), Dispatchers.getIO()), h1.a(this), companion.getLazily(), 1);
        this.f44615j = FlowKt.flowOn(new h(FlowKt.filterNotNull(MutableSharedFlow$default), this), Dispatchers.getIO());
        this.f44616k = FlowKt.shareIn(((l70.w) nm0.h.b(j.f44666a).getValue()).get(), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        Flow<List<ur.a>> flowOn = FlowKt.flowOn(FlowKt.transformLatest(FlowKt.filterNotNull(MutableSharedFlow$default), new f(null, featureTagsRepository)), Dispatchers.getIO());
        this.f44617l = flowOn;
        this.f44618m = new i(flowOn, this);
        this.f44619n = FlowKt.flowCombine(flowOn, MutableSharedFlow$default, new d(null));
        this.f44620o = FlowKt.flowCombine(MutableSharedFlow$default, isB2BDeviceUseCase.a(longValue), new k(null));
    }

    public final Flow<List<o60.h>> A0() {
        return this.f44620o;
    }

    public final i B0() {
        return this.f44618m;
    }

    public final Flow<Integer> m0() {
        return this.f44615j;
    }

    public final StateFlow<Device> p0() {
        return this.f44611f;
    }

    public final Flow<List<o60.d>> q0() {
        return this.f44619n;
    }

    public final Flow<Boolean> r0() {
        return this.f44613h;
    }

    public final Flow<List<o60.f>> t0() {
        return this.f44612g;
    }

    public final SharedFlow y0() {
        return this.f44616k;
    }

    public final SharedFlow z0() {
        return this.f44614i;
    }
}
