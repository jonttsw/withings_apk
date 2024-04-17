package com.withings.wiscale2.device.common.screen.ui;

import android.app.Application;
import com.withings.device.Device;
import com.withings.devicescreens.model.CustomScreenMode;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.screen.model.DeviceScreen;
import com.withings.screen.model.DeviceScreensGroup;
import com.withings.screen.repository.DeviceScreensRepository;
import com.withings.wiscale2.device.common.screen.ui.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import sc0.b;
/* compiled from: ScreenSelectionViewModel.kt */
/* loaded from: classes5.dex */
public final class ScreenSelectionViewModel extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f53160a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f53161b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f53162c;

    /* renamed from: d  reason: collision with root package name */
    private final kn.e f53163d;

    /* renamed from: e  reason: collision with root package name */
    private final t10.e f53164e;

    /* renamed from: f  reason: collision with root package name */
    private final tc0.e f53165f;

    /* renamed from: g  reason: collision with root package name */
    private final tc0.i f53166g;

    /* renamed from: h  reason: collision with root package name */
    private final DeviceScreensRepository f53167h;

    /* renamed from: i  reason: collision with root package name */
    private final ej.w f53168i;

    /* renamed from: j  reason: collision with root package name */
    private final fl.p f53169j;

    /* renamed from: k  reason: collision with root package name */
    private final xw.n<nm0.y> f53170k;

    /* renamed from: l  reason: collision with root package name */
    private final xw.n<nm0.y> f53171l;

    /* renamed from: m  reason: collision with root package name */
    private final xw.n<CloseEvent> f53172m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f53173n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Integer> f53174o;

    /* renamed from: p  reason: collision with root package name */
    private final SharedFlow<Boolean> f53175p;

    /* renamed from: q  reason: collision with root package name */
    private final SharedFlow f53176q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableSharedFlow<List<DeviceScreensGroup>> f53177r;

    /* renamed from: s  reason: collision with root package name */
    private final SharedFlow f53178s;

    /* renamed from: t  reason: collision with root package name */
    private final j f53179t;

    /* renamed from: u  reason: collision with root package name */
    private final Flow<List<sc0.c>> f53180u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableSharedFlow<CustomScreenMode> f53181v;

    /* renamed from: w  reason: collision with root package name */
    private final Flow<y1> f53182w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenSelectionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/screen/ui/ScreenSelectionViewModel$CloseEvent;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class CloseEvent {

        /* renamed from: a  reason: collision with root package name */
        public static final CloseEvent f53183a;

        /* renamed from: b  reason: collision with root package name */
        public static final CloseEvent f53184b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ CloseEvent[] f53185c;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$CloseEvent, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$CloseEvent, java.lang.Enum] */
        static {
            ?? r02 = new Enum("WithSync", 0);
            f53183a = r02;
            ?? r12 = new Enum("WithoutSync", 1);
            f53184b = r12;
            CloseEvent[] closeEventArr = {r02, r12};
            f53185c = closeEventArr;
            sm0.b.a(closeEventArr);
        }

        private CloseEvent() {
            throw null;
        }

        public static CloseEvent valueOf(String str) {
            return (CloseEvent) Enum.valueOf(CloseEvent.class, str);
        }

        public static CloseEvent[] values() {
            return (CloseEvent[]) f53185c.clone();
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$1", f = "ScreenSelectionViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_FEET, 168, ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING, ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY, ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        List f53186a;

        /* renamed from: b  reason: collision with root package name */
        int f53187b;

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

        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x016e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$2", f = "ScreenSelectionViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_R6_25KHZ_SEGMENT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53189a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ScreenSelectionViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$2$2", f = "ScreenSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.q<Boolean, Boolean, qm0.d<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ boolean f53191a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ boolean f53192b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ScreenSelectionViewModel f53193c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ScreenSelectionViewModel screenSelectionViewModel, qm0.d<? super a> dVar) {
                super(3, dVar);
                this.f53193c = screenSelectionViewModel;
            }

            @Override // ym0.q
            public final Object invoke(Boolean bool, Boolean bool2, qm0.d<? super Boolean> dVar) {
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                a aVar = new a(this.f53193c, dVar);
                aVar.f53191a = booleanValue;
                aVar.f53192b = booleanValue2;
                return aVar.invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                boolean z5 = this.f53191a;
                boolean z11 = this.f53192b;
                Boolean valueOf = Boolean.valueOf(z11);
                if (z5 && !z11) {
                    ScreenSelectionViewModel screenSelectionViewModel = this.f53193c;
                    if (screenSelectionViewModel.f53161b.getType() != 16) {
                        screenSelectionViewModel.M0().postValue(null);
                    }
                }
                return valueOf;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* renamed from: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0711b implements Flow<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Flow f53194a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ScreenSelectionViewModel f53195b;

            /* compiled from: Emitters.kt */
            /* renamed from: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$b$b$a */
            /* loaded from: classes5.dex */
            public static final class a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f53196a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ScreenSelectionViewModel f53197b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$2$invokeSuspend$$inlined$map$1$2", f = "ScreenSelectionViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$b$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0712a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f53198a;

                    /* renamed from: b  reason: collision with root package name */
                    int f53199b;

                    public C0712a(qm0.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f53198a = obj;
                        this.f53199b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector, ScreenSelectionViewModel screenSelectionViewModel) {
                    this.f53196a = flowCollector;
                    this.f53197b = screenSelectionViewModel;
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
                        boolean r0 = r7 instanceof com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.b.C0711b.a.C0712a
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$b$b$a$a r0 = (com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.b.C0711b.a.C0712a) r0
                        int r1 = r0.f53199b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f53199b = r1
                        goto L18
                    L13:
                        com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$b$b$a$a r0 = new com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$b$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f53198a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.f53199b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r7)
                        goto L8f
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        nm0.l.b(r7)
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.Iterator r6 = r6.iterator()
                    L3f:
                        boolean r2 = r6.hasNext()
                        if (r2 == 0) goto L55
                        java.lang.Object r2 = r6.next()
                        sc0.c r2 = (sc0.c) r2
                        java.util.List r2 = r2.b()
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        kotlin.collections.x.n(r2, r7)
                        goto L3f
                    L55:
                        boolean r6 = r7.isEmpty()
                        r2 = 0
                        if (r6 == 0) goto L5d
                        goto L80
                    L5d:
                        java.util.Iterator r6 = r7.iterator()
                    L61:
                        boolean r7 = r6.hasNext()
                        if (r7 == 0) goto L80
                        java.lang.Object r7 = r6.next()
                        sc0.b r7 = (sc0.b) r7
                        com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel r4 = r5.f53197b
                        java.util.List r4 = com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.i0(r4)
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.lang.Integer r7 = r7.a()
                        boolean r7 = kotlin.collections.x.z(r4, r7)
                        if (r7 == 0) goto L61
                        r2 = r3
                    L80:
                        java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                        r0.f53199b = r3
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.f53196a
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L8f
                        return r1
                    L8f:
                        nm0.y r6 = nm0.y.f85009a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.b.C0711b.a.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            public C0711b(j jVar, ScreenSelectionViewModel screenSelectionViewModel) {
                this.f53194a = jVar;
                this.f53195b = screenSelectionViewModel;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
                Object collect = this.f53194a.collect(new a(flowCollector, this.f53195b), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return nm0.y.f85009a;
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53189a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ScreenSelectionViewModel screenSelectionViewModel = ScreenSelectionViewModel.this;
                C0711b c0711b = new C0711b(screenSelectionViewModel.f53179t, screenSelectionViewModel);
                a aVar = new a(screenSelectionViewModel, null);
                this.f53189a = 1;
                if (FlowKt.reduce(c0711b, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$defaultUiScreensPerCategory$1", f = "ScreenSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends DeviceScreensGroup>, Boolean, List<? extends sc0.a>, qm0.d<? super List<? extends sc0.c>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f53201a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f53202b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f53203c;

        c(qm0.d<? super c> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(List<? extends DeviceScreensGroup> list, Boolean bool, List<? extends sc0.a> list2, qm0.d<? super List<? extends sc0.c>> dVar) {
            boolean booleanValue = bool.booleanValue();
            c cVar = new c(dVar);
            cVar.f53201a = list;
            cVar.f53202b = booleanValue;
            cVar.f53203c = list2;
            return cVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f53201a;
            boolean z5 = this.f53202b;
            List list2 = this.f53203c;
            ScreenSelectionViewModel screenSelectionViewModel = ScreenSelectionViewModel.this;
            return screenSelectionViewModel.f53165f.a(screenSelectionViewModel.f53161b, list, list2, z5, com.withings.wiscale2.spo2.m.j(screenSelectionViewModel.f53161b));
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$hasTracker$1", f = "ScreenSelectionViewModel.kt", l = {102, 103}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        ScreenSelectionViewModel f53205a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f53206b;

        /* renamed from: c  reason: collision with root package name */
        boolean f53207c;

        /* renamed from: d  reason: collision with root package name */
        int f53208d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f53209e;

        /* compiled from: ScreenSelectionViewModel.kt */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ sm0.a<Partner> f53211a = sm0.b.a(Partner.values());
        }

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f53209e = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:25:0x00a5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r12.f53208d
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L1a
                if (r1 != r2) goto L12
                nm0.l.b(r13)
                goto Lcd
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                boolean r1 = r12.f53207c
                java.util.Iterator r5 = r12.f53206b
                com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel r6 = r12.f53205a
                java.lang.Object r7 = r12.f53209e
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                nm0.l.b(r13)
                goto La5
            L29:
                nm0.l.b(r13)
                java.lang.Object r13 = r12.f53209e
                kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
                com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel r1 = com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.this
                kn.e r5 = com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.m0(r1)
                long r6 = com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.F0(r1)
                r8 = 16
                java.util.ArrayList r5 = r5.k(r8, r6)
                boolean r5 = r5.isEmpty()
                r5 = r5 ^ r4
                sm0.a<com.withings.partner.model.Partner> r6 = com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.d.a.f53211a
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                kotlin.collections.c r6 = (kotlin.collections.c) r6
                java.util.Iterator r6 = r6.iterator()
            L52:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L6f
                java.lang.Object r8 = r6.next()
                r9 = r8
                com.withings.partner.model.Partner r9 = (com.withings.partner.model.Partner) r9
                java.util.List r9 = r9.h()
                com.withings.partner.model.capabilities.PartnerCapabilities r10 = com.withings.partner.model.capabilities.PartnerCapabilities.f43544a
                boolean r9 = r9.contains(r10)
                if (r9 == 0) goto L52
                r7.add(r8)
                goto L52
            L6f:
                boolean r6 = r7.isEmpty()
                if (r6 == 0) goto L77
                r1 = r3
                goto Lb4
            L77:
                java.util.Iterator r6 = r7.iterator()
                r7 = r13
                r11 = r6
                r6 = r1
                r1 = r5
                r5 = r11
            L80:
                boolean r13 = r5.hasNext()
                if (r13 == 0) goto Lb1
                java.lang.Object r13 = r5.next()
                com.withings.partner.model.Partner r13 = (com.withings.partner.model.Partner) r13
                t10.e r8 = com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.B0(r6)
                android.app.Application r9 = r6.getApplication()
                r12.f53209e = r7
                r12.f53205a = r6
                r12.f53206b = r5
                r12.f53207c = r1
                r12.f53208d = r4
                java.lang.Object r13 = r8.i(r9, r13, r12)
                if (r13 != r0) goto La5
                return r0
            La5:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L80
                r5 = r1
                r1 = r4
            Laf:
                r13 = r7
                goto Lb4
            Lb1:
                r5 = r1
                r1 = r3
                goto Laf
            Lb4:
                if (r5 != 0) goto Lb8
                if (r1 == 0) goto Lb9
            Lb8:
                r3 = r4
            Lb9:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                r3 = 0
                r12.f53209e = r3
                r12.f53205a = r3
                r12.f53206b = r3
                r12.f53208d = r2
                java.lang.Object r13 = r13.emit(r1, r12)
                if (r13 != r0) goto Lcd
                return r0
            Lcd:
                nm0.y r13 = nm0.y.f85009a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$modifiedUiScreensPerCategory$1", f = "ScreenSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends DeviceScreensGroup>, Boolean, List<? extends sc0.a>, qm0.d<? super List<? extends sc0.c>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f53212a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f53213b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f53214c;

        e(qm0.d<? super e> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(List<? extends DeviceScreensGroup> list, Boolean bool, List<? extends sc0.a> list2, qm0.d<? super List<? extends sc0.c>> dVar) {
            boolean booleanValue = bool.booleanValue();
            e eVar = new e(dVar);
            eVar.f53212a = list;
            eVar.f53213b = booleanValue;
            eVar.f53214c = list2;
            return eVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f53212a;
            boolean z5 = this.f53213b;
            List list2 = this.f53214c;
            ScreenSelectionViewModel screenSelectionViewModel = ScreenSelectionViewModel.this;
            return screenSelectionViewModel.f53166g.a(screenSelectionViewModel.f53161b, list, list2, z5, com.withings.wiscale2.spo2.m.j(screenSelectionViewModel.f53161b));
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            up.a aVar;
            ScreenSelectionViewModel screenSelectionViewModel = ScreenSelectionViewModel.this;
            fl.p pVar = screenSelectionViewModel.f53169j;
            Device device = screenSelectionViewModel.f53161b;
            kotlin.jvm.internal.u.j(pVar, "<this>");
            kotlin.jvm.internal.u.j(device, "device");
            fl.o g11 = pVar.g(device);
            if (g11 instanceof up.a) {
                aVar = (up.a) g11;
            } else {
                aVar = null;
            }
            boolean z5 = false;
            if (aVar != null && aVar.d(device.getFirmware())) {
                z5 = true;
            }
            return Boolean.valueOf(!z5);
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$screenSelectionUiState$1", f = "ScreenSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.s<CustomScreenMode, List<? extends sc0.c>, List<? extends sc0.c>, List<? extends sc0.c>, qm0.d<? super y1>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ CustomScreenMode f53217a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f53218b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f53219c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ List f53220d;

        /* compiled from: ScreenSelectionViewModel.kt */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f53221a;

            static {
                int[] iArr = new int[CustomScreenMode.values().length];
                try {
                    iArr[CustomScreenMode.CUSTOM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CustomScreenMode.RECOMMENDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CustomScreenMode.DRAGGABLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f53221a = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List<sc0.b> list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            CustomScreenMode customScreenMode = this.f53217a;
            List list2 = this.f53218b;
            List list3 = this.f53219c;
            List list4 = this.f53220d;
            int i11 = a.f53221a[customScreenMode.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        sc0.c cVar = (sc0.c) kotlin.collections.x.K(list3);
                        List<sc0.b> list5 = null;
                        if (cVar != null) {
                            list = cVar.b();
                        } else {
                            list = null;
                        }
                        List<sc0.b> list6 = kotlin.collections.i0.f76187a;
                        if (list == null) {
                            list = list6;
                        }
                        sc0.c cVar2 = (sc0.c) kotlin.collections.x.K(list4);
                        if (cVar2 != null) {
                            list5 = cVar2.b();
                        }
                        if (list5 != null) {
                            list6 = list5;
                        }
                        return new y1.b(list, list6);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new y1.d(list2);
            }
            return new y1.a(list3, list4);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$g] */
        @Override // ym0.s
        public final Object k(CustomScreenMode customScreenMode, List<? extends sc0.c> list, List<? extends sc0.c> list2, List<? extends sc0.c> list3, qm0.d<? super y1> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(5, dVar);
            iVar.f53217a = customScreenMode;
            iVar.f53218b = list;
            iVar.f53219c = list2;
            iVar.f53220d = list3;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$screenSelectionUiState$2", f = "ScreenSelectionViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_HR_ECG}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super y1>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53222a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f53223b;

        h() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$h, qm0.d<nm0.y>] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
            iVar.f53223b = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super y1> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((h) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53222a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                y1.c cVar = y1.c.f53487a;
                this.f53222a = 1;
                if (((FlowCollector) this.f53223b).emit(cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class i implements Flow<List<? extends sc0.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f53224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScreenSelectionViewModel f53225b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f53226a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ScreenSelectionViewModel f53227b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$special$$inlined$map$1$2", f = "ScreenSelectionViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0713a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f53228a;

                /* renamed from: b  reason: collision with root package name */
                int f53229b;

                public C0713a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f53228a = obj;
                    this.f53229b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, ScreenSelectionViewModel screenSelectionViewModel) {
                this.f53226a = flowCollector;
                this.f53227b = screenSelectionViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.i.a.C0713a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$i$a$a r0 = (com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.i.a.C0713a) r0
                    int r1 = r0.f53229b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f53229b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$i$a$a r0 = new com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$i$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f53228a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f53229b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r10)
                    goto L73
                L27:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L2f:
                    nm0.l.b(r10)
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.x.y(r9, r2)
                    r10.<init>(r2)
                    java.util.Iterator r9 = r9.iterator()
                L45:
                    boolean r2 = r9.hasNext()
                    if (r2 == 0) goto L68
                    java.lang.Object r2 = r9.next()
                    ur.a r2 = (ur.a) r2
                    sc0.a r4 = new sc0.a
                    int r5 = r2.c()
                    com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel r6 = r8.f53227b
                    long r6 = com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.F0(r6)
                    boolean r2 = r2.e(r6)
                    r4.<init>(r5, r2)
                    r10.add(r4)
                    goto L45
                L68:
                    r0.f53229b = r3
                    kotlinx.coroutines.flow.FlowCollector r9 = r8.f53226a
                    java.lang.Object r9 = r9.emit(r10, r0)
                    if (r9 != r1) goto L73
                    return r1
                L73:
                    nm0.y r9 = nm0.y.f85009a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.i.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public i(Flow flow, ScreenSelectionViewModel screenSelectionViewModel) {
            this.f53224a = flow;
            this.f53225b = screenSelectionViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends sc0.a>> flowCollector, qm0.d dVar) {
            Object collect = this.f53224a.collect(new a(flowCollector, this.f53225b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class j implements Flow<List<? extends sc0.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f53231a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f53232a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$special$$inlined$map$2$2", f = "ScreenSelectionViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0714a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f53233a;

                /* renamed from: b  reason: collision with root package name */
                int f53234b;

                public C0714a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f53233a = obj;
                    this.f53234b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f53232a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.j.a.C0714a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$j$a$a r0 = (com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.j.a.C0714a) r0
                    int r1 = r0.f53234b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f53234b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$j$a$a r0 = new com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$j$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f53233a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f53234b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r10)
                    goto L8e
                L27:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L2f:
                    nm0.l.b(r10)
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L3f:
                    boolean r2 = r9.hasNext()
                    if (r2 == 0) goto L83
                    java.lang.Object r2 = r9.next()
                    sc0.c r2 = (sc0.c) r2
                    java.util.List r4 = r2.b()
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r4 = r4.iterator()
                L5a:
                    boolean r6 = r4.hasNext()
                    if (r6 == 0) goto L71
                    java.lang.Object r6 = r4.next()
                    r7 = r6
                    sc0.b r7 = (sc0.b) r7
                    boolean r7 = r7.f()
                    if (r7 == 0) goto L5a
                    r5.add(r6)
                    goto L5a
                L71:
                    sc0.c r2 = sc0.c.a(r2, r5)
                    boolean r4 = r5.isEmpty()
                    if (r4 != 0) goto L7c
                    goto L7d
                L7c:
                    r2 = 0
                L7d:
                    if (r2 == 0) goto L3f
                    r10.add(r2)
                    goto L3f
                L83:
                    r0.f53234b = r3
                    kotlinx.coroutines.flow.FlowCollector r9 = r8.f53232a
                    java.lang.Object r9 = r9.emit(r10, r0)
                    if (r9 != r1) goto L8e
                    return r1
                L8e:
                    nm0.y r9 = nm0.y.f85009a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.j.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public j(SharedFlow sharedFlow) {
            this.f53231a = sharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends sc0.c>> flowCollector, qm0.d dVar) {
            Object collect = this.f53231a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class k implements Flow<List<? extends sc0.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f53236a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f53237a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$special$$inlined$map$3$2", f = "ScreenSelectionViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$k$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0715a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f53238a;

                /* renamed from: b  reason: collision with root package name */
                int f53239b;

                public C0715a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f53238a = obj;
                    this.f53239b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f53237a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.k.a.C0715a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$k$a$a r0 = (com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.k.a.C0715a) r0
                    int r1 = r0.f53239b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f53239b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$k$a$a r0 = new com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$k$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f53238a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f53239b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r10)
                    goto L8f
                L27:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L2f:
                    nm0.l.b(r10)
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L3f:
                    boolean r2 = r9.hasNext()
                    if (r2 == 0) goto L84
                    java.lang.Object r2 = r9.next()
                    sc0.c r2 = (sc0.c) r2
                    java.util.List r4 = r2.b()
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r4 = r4.iterator()
                L5a:
                    boolean r6 = r4.hasNext()
                    if (r6 == 0) goto L72
                    java.lang.Object r6 = r4.next()
                    r7 = r6
                    sc0.b r7 = (sc0.b) r7
                    boolean r7 = r7.f()
                    r7 = r7 ^ r3
                    if (r7 == 0) goto L5a
                    r5.add(r6)
                    goto L5a
                L72:
                    sc0.c r2 = sc0.c.a(r2, r5)
                    boolean r4 = r5.isEmpty()
                    if (r4 != 0) goto L7d
                    goto L7e
                L7d:
                    r2 = 0
                L7e:
                    if (r2 == 0) goto L3f
                    r10.add(r2)
                    goto L3f
                L84:
                    r0.f53239b = r3
                    kotlinx.coroutines.flow.FlowCollector r9 = r8.f53237a
                    java.lang.Object r9 = r9.emit(r10, r0)
                    if (r9 != r1) goto L8f
                    return r1
                L8f:
                    nm0.y r9 = nm0.y.f85009a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.k.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public k(SharedFlow sharedFlow) {
            this.f53236a = sharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends sc0.c>> flowCollector, qm0.d dVar) {
            Object collect = this.f53236a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$toggleScreenState$1", f = "ScreenSelectionViewModel.kt", l = {223, ConstantsWs.WS_STATUS_WRONGMEASTYPE}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53241a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ sc0.b f53243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(sc0.b bVar, qm0.d<? super l> dVar) {
            super(2, dVar);
            this.f53243c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new l(this.f53243c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object firstOrNull;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53241a;
            ScreenSelectionViewModel screenSelectionViewModel = ScreenSelectionViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
                firstOrNull = obj;
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = screenSelectionViewModel.f53177r;
                this.f53241a = 1;
                firstOrNull = FlowKt.firstOrNull(mutableSharedFlow, this);
                if (firstOrNull == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            List list = (List) firstOrNull;
            sc0.b bVar = this.f53243c;
            b.InterfaceC1611b d11 = bVar.d();
            if (list != null) {
                List<DeviceScreensGroup> list2 = list;
                int i12 = 10;
                ArrayList<DeviceScreensGroup> arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (DeviceScreensGroup deviceScreensGroup : list2) {
                    List<DeviceScreen> screens = deviceScreensGroup.getScreens();
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(screens, i12));
                    for (DeviceScreen deviceScreen : screens) {
                        if (deviceScreen.getWsId() == bVar.b()) {
                            deviceScreen = DeviceScreen.copy$default(deviceScreen, 0L, 0L, null, null, null, false, !deviceScreen.isActive(), 0, null, null, 959, null);
                        } else {
                            if (d11 instanceof b.InterfaceC1611b.h) {
                                screenSelectionViewModel.getClass();
                                List<b.a> a11 = ((b.InterfaceC1611b.h) d11).a();
                                if (!(a11 instanceof Collection) || !a11.isEmpty()) {
                                    for (b.a aVar : a11) {
                                        if (kotlin.collections.x.W(Long.valueOf(deviceScreen.getWsId()), deviceScreen.getEmbeddedId()).contains(Long.valueOf(aVar.a()))) {
                                            deviceScreen = DeviceScreen.copy$default(deviceScreen, 0L, 0L, null, null, null, false, !deviceScreen.isActive(), 0, null, null, 959, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (d11 instanceof b.InterfaceC1611b.e) {
                                screenSelectionViewModel.getClass();
                                if (kotlin.collections.x.W(Long.valueOf(deviceScreen.getWsId()), deviceScreen.getEmbeddedId()).contains(Long.valueOf(((b.InterfaceC1611b.e) d11).a().a()))) {
                                    deviceScreen = DeviceScreen.copy$default(deviceScreen, 0L, 0L, null, null, null, false, !deviceScreen.isActive(), 0, null, null, 959, null);
                                }
                            }
                        }
                        arrayList2.add(deviceScreen);
                    }
                    arrayList.add(DeviceScreensGroup.copy$default(deviceScreensGroup, 0L, null, arrayList2, null, 0L, 27, null));
                    i12 = 10;
                }
                int i13 = 0;
                for (DeviceScreensGroup deviceScreensGroup2 : arrayList) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : deviceScreensGroup2.getScreens()) {
                        if (((DeviceScreen) obj2).isActive()) {
                            arrayList3.add(obj2);
                        }
                    }
                    i13 += arrayList3.size();
                }
                if (i13 <= screenSelectionViewModel.R0()) {
                    MutableSharedFlow mutableSharedFlow2 = screenSelectionViewModel.f53177r;
                    this.f53241a = 2;
                    if (mutableSharedFlow2.emit(arrayList, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    screenSelectionViewModel.T0().postValue(null);
                    return nm0.y.f85009a;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v12, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.coroutines.jvm.internal.i, ym0.s] */
    public ScreenSelectionViewModel(Application application, long j5, Device device, boolean z5, kn.e deviceManager, t10.e partnerManager, tc0.e eVar, tc0.i iVar, vr.d featureTagsRepository, DeviceScreensRepository deviceScreensRepository, ej.w wVar, fl.p pVar) {
        super(application);
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(partnerManager, "partnerManager");
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        kotlin.jvm.internal.u.j(deviceScreensRepository, "deviceScreensRepository");
        this.f53160a = j5;
        this.f53161b = device;
        this.f53162c = z5;
        this.f53163d = deviceManager;
        this.f53164e = partnerManager;
        this.f53165f = eVar;
        this.f53166g = iVar;
        this.f53167h = deviceScreensRepository;
        this.f53168i = wVar;
        this.f53169j = pVar;
        this.f53170k = new xw.n<>();
        this.f53171l = new xw.n<>();
        this.f53172m = new xw.n<>();
        this.f53173n = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f53174o = kotlin.collections.x.W(1, 15, 14, 16, 22);
        Flow flowOn = FlowKt.flowOn(FlowKt.flow(new d(null)), Dispatchers.getIO());
        CoroutineScope a11 = androidx.lifecycle.h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<Boolean> shareIn = FlowKt.shareIn(flowOn, a11, companion.getLazily(), 1);
        this.f53175p = shareIn;
        i iVar2 = new i(featureTagsRepository.get(device.getId()), this);
        Flow<List<DeviceScreensGroup>> flow = deviceScreensRepository.get(device.getId(), Long.valueOf(j5));
        f fVar = new f();
        kotlin.jvm.internal.u.j(flow, "<this>");
        SharedFlow shareIn2 = FlowKt.shareIn(new vp.a(flow, fVar), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f53176q = shareIn2;
        MutableSharedFlow<List<DeviceScreensGroup>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f53177r = MutableSharedFlow$default;
        SharedFlow shareIn3 = FlowKt.shareIn(FlowKt.combine(MutableSharedFlow$default, shareIn, iVar2, new e(null)), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f53178s = shareIn3;
        j jVar = new j(shareIn3);
        this.f53179t = jVar;
        k kVar = new k(shareIn3);
        Flow<List<sc0.c>> combine = FlowKt.combine(shareIn2, shareIn, iVar2, new c(null));
        this.f53180u = combine;
        MutableSharedFlow<CustomScreenMode> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f53181v = MutableSharedFlow$default2;
        this.f53182w = FlowKt.onStart(FlowKt.combine(MutableSharedFlow$default2, combine, jVar, kVar, new kotlin.coroutines.jvm.internal.i(5, null)), new kotlin.coroutines.jvm.internal.i(2, null));
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new b(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel r34, qm0.d r35) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel.f0(com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel, qm0.d):java.lang.Object");
    }

    public final xw.n<nm0.y> M0() {
        return this.f53170k;
    }

    public final xw.n<CloseEvent> O0() {
        return this.f53172m;
    }

    public final int R0() {
        Integer valueOf = Integer.valueOf(this.f53161b.getMaxScreenCount());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 16;
    }

    public final xw.n<nm0.y> T0() {
        return this.f53171l;
    }

    public final Flow<y1> U0() {
        return this.f53182w;
    }

    public final MutableStateFlow<Boolean> V0() {
        return this.f53173n;
    }

    public final void W0() {
        this.f53173n.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new ScreenSelectionViewModel$save$1(this, null), 3, null);
    }

    public final void X0(sc0.b uiScreen) {
        kotlin.jvm.internal.u.j(uiScreen, "uiScreen");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new l(uiScreen, null), 3, null);
    }
}
