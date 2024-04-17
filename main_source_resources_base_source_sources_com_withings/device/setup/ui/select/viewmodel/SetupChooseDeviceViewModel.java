package com.withings.device.setup.ui.select.viewmodel;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase;
import com.withings.device.setup.ui.select.uc.SetupDeviceCategory;
import com.withings.device.setup.ui.select.viewmodel.a;
import fl.p;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kn.e;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
/* compiled from: SetupChooseDeviceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/ui/select/viewmodel/SetupChooseDeviceViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetupChooseDeviceViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37638a;

    /* renamed from: b  reason: collision with root package name */
    private final e f37639b;

    /* renamed from: c  reason: collision with root package name */
    private final p f37640c;

    /* renamed from: d  reason: collision with root package name */
    private final LoadOnDemandModuleUseCase f37641d;

    /* renamed from: e  reason: collision with root package name */
    private final rp.a f37642e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow f37643f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<com.withings.device.setup.ui.select.viewmodel.b> f37644g;

    /* renamed from: h  reason: collision with root package name */
    private final SharedFlow<Map<SetupDeviceCategory, List<rp.b>>> f37645h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<Object> f37646i;

    /* compiled from: SetupChooseDeviceViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$1", f = "SetupChooseDeviceViewModel.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37647a;

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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f37647a;
            SetupChooseDeviceViewModel setupChooseDeviceViewModel = SetupChooseDeviceViewModel.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                SharedFlow sharedFlow = setupChooseDeviceViewModel.f37645h;
                this.f37647a = 1;
                obj = FlowKt.first(sharedFlow, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            setupChooseDeviceViewModel.m0().setValue(new tp.c((Map) obj));
            return y.f85009a;
        }
    }

    /* compiled from: SetupChooseDeviceViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$postAction$1", f = "SetupChooseDeviceViewModel.kt", l = {63, 77, 81}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37649a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.withings.device.setup.ui.select.viewmodel.a f37651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.withings.device.setup.ui.select.viewmodel.a aVar, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f37651c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f37651c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f37649a;
            SetupChooseDeviceViewModel setupChooseDeviceViewModel = SetupChooseDeviceViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l.b(obj);
                    return y.f85009a;
                }
                l.b(obj);
            } else {
                l.b(obj);
                SharedFlow sharedFlow = setupChooseDeviceViewModel.f37645h;
                this.f37649a = 1;
                obj = FlowKt.first(sharedFlow, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Map map = (Map) obj;
            com.withings.device.setup.ui.select.viewmodel.a aVar = this.f37651c;
            if (aVar instanceof a.C0493a) {
                MutableStateFlow<Object> m02 = setupChooseDeviceViewModel.m0();
                SetupDeviceCategory a11 = ((a.C0493a) aVar).a();
                List list = (List) map.get(((a.C0493a) aVar).a());
                if (list == null) {
                    list = i0.f76187a;
                }
                m02.setValue(new tp.d(map, a11, list));
            } else if (aVar instanceof a.b) {
                if (((a.b) aVar).a().c()) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (((List) entry.getValue()).contains(((a.b) aVar).a())) {
                            setupChooseDeviceViewModel.m0().setValue(new tp.b(map, (SetupDeviceCategory) entry.getKey(), ((a.b) aVar).a()));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                } else if (((a.b) aVar).a().e()) {
                    rp.b a12 = ((a.b) aVar).a();
                    this.f37649a = 2;
                    if (SetupChooseDeviceViewModel.j0(setupChooseDeviceViewModel, a12, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (aVar instanceof a.c) {
                rp.b a13 = ((a.c) aVar).a();
                this.f37649a = 3;
                if (SetupChooseDeviceViewModel.j0(setupChooseDeviceViewModel, a13, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class c implements Flow<Map<SetupDeviceCategory, ? extends List<? extends rp.b>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f37652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SetupChooseDeviceViewModel f37653b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f37654a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SetupChooseDeviceViewModel f37655b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$special$$inlined$map$1$2", f = "SetupChooseDeviceViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0492a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f37656a;

                /* renamed from: b  reason: collision with root package name */
                int f37657b;

                public C0492a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f37656a = obj;
                    this.f37657b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, SetupChooseDeviceViewModel setupChooseDeviceViewModel) {
                this.f37654a = flowCollector;
                this.f37655b = setupChooseDeviceViewModel;
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
                    boolean r0 = r6 instanceof com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel.c.a.C0492a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$c$a$a r0 = (com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel.c.a.C0492a) r0
                    int r1 = r0.f37657b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f37657b = r1
                    goto L18
                L13:
                    com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$c$a$a r0 = new com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f37656a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f37657b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L4d
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel r6 = r4.f37655b
                    rp.a r6 = com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel.i0(r6)
                    java.util.LinkedHashMap r5 = r6.a(r5)
                    r0.f37657b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f37654a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel.c.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public c(SharedFlow sharedFlow, SetupChooseDeviceViewModel setupChooseDeviceViewModel) {
            this.f37652a = sharedFlow;
            this.f37653b = setupChooseDeviceViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Map<SetupDeviceCategory, ? extends List<? extends rp.b>>> flowCollector, qm0.d dVar) {
            Object collect = this.f37652a.collect(new a(flowCollector, this.f37653b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SetupChooseDeviceViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel$wsd01Count$1", f = "SetupChooseDeviceViewModel.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37659a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f37660b;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f37660b = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super y> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f37659a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                Integer num = new Integer(SetupChooseDeviceViewModel.this.f37639b.g(60).size());
                this.f37659a = 1;
                if (((FlowCollector) this.f37660b).emit(num, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public SetupChooseDeviceViewModel(Context context, e deviceManager, p pVar, LoadOnDemandModuleUseCase loadOnDemandModuleUseCase, rp.a aVar) {
        u.j(deviceManager, "deviceManager");
        this.f37638a = context;
        this.f37639b = deviceManager;
        this.f37640c = pVar;
        this.f37641d = loadOnDemandModuleUseCase;
        this.f37642e = aVar;
        Flow flowOn = FlowKt.flowOn(FlowKt.flow(new d(null)), Dispatchers.getIO());
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow shareIn = FlowKt.shareIn(flowOn, a11, companion.getLazily(), 1);
        this.f37643f = shareIn;
        this.f37644g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f37645h = FlowKt.shareIn(new c(shareIn, this), h1.a(this), companion.getEagerly(), 1);
        this.f37646i = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j0(com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel r12, rp.b r13, qm0.d r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel.j0(com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel, rp.b, qm0.d):java.lang.Object");
    }

    public final SharedFlow<com.withings.device.setup.ui.select.viewmodel.b> k0() {
        return FlowKt.asSharedFlow(this.f37644g);
    }

    public final MutableStateFlow<Object> m0() {
        return this.f37646i;
    }

    public final void p0(com.withings.device.setup.ui.select.viewmodel.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new b(aVar, null), 3, null);
    }
}
