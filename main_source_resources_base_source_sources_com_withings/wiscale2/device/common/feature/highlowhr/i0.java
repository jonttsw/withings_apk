package com.withings.wiscale2.device.common.feature.highlowhr;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.device.Device;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
/* compiled from: HighLowHrActivationViewModel.kt */
/* loaded from: classes5.dex */
public final class i0 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f52277a;

    /* renamed from: b  reason: collision with root package name */
    private final vr.d f52278b;

    /* renamed from: c  reason: collision with root package name */
    private final ng0.b f52279c;

    /* renamed from: d  reason: collision with root package name */
    private final zo.a f52280d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<ur.a> f52281e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<Boolean> f52282f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<Boolean> f52283g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HighLowHrActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHrActivationViewModel", f = "HighLowHrActivationViewModel.kt", l = {54, 56}, m = "acceptFeature")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        i0 f52284a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f52285b;

        /* renamed from: d  reason: collision with root package name */
        int f52287d;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52285b = obj;
            this.f52287d |= Integer.MIN_VALUE;
            return i0.this.f0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HighLowHrActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHrActivationViewModel$acceptFeature$2", f = "HighLowHrActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
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
            nm0.l.b(obj);
            i0 i0Var = i0.this;
            i0Var.f52279c.c(i0Var.f52277a, true);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HighLowHrActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHrActivationViewModel$featureTag$1", f = "HighLowHrActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends ur.a>, qm0.d<? super ur.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f52289a;

        c() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.wiscale2.device.common.feature.highlowhr.i0$c, qm0.d<nm0.y>] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
            iVar.f52289a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends ur.a> list, qm0.d<? super ur.a> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            for (Object obj2 : (List) this.f52289a) {
                if (((ur.a) obj2).c() == 22) {
                    return obj2;
                }
            }
            return null;
        }
    }

    /* compiled from: HighLowHrActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHrActivationViewModel$isFeatureActivated$1", f = "HighLowHrActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<ur.a, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f52290a;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f52290a = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(ur.a aVar, qm0.d<? super Boolean> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            ur.a aVar = (ur.a) this.f52290a;
            boolean z5 = false;
            if (aVar != null && aVar.e(i0.this.f52277a)) {
                z5 = true;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: HighLowHrActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHrActivationViewModel$isFeatureExists$1", f = "HighLowHrActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<ur.a, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f52292a;

        e() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>, com.withings.wiscale2.device.common.feature.highlowhr.i0$e] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
            iVar.f52292a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(ur.a aVar, qm0.d<? super Boolean> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            if (((ur.a) this.f52292a) != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    public i0(long j5, Device device, vr.d featureTagsRepository, ng0.b bVar, ej.w wVar) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        this.f52277a = j5;
        this.f52278b = featureTagsRepository;
        this.f52279c = bVar;
        this.f52280d = new zo.a(device, wVar, h1.a(this).getCoroutineContext());
        Flow mapLatest = FlowKt.mapLatest(featureTagsRepository.get(device.getId()), new kotlin.coroutines.jvm.internal.i(2, null));
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<ur.a> shareIn = FlowKt.shareIn(mapLatest, a11, companion.getEagerly(), 1);
        this.f52281e = shareIn;
        this.f52282f = FlowKt.shareIn(FlowKt.mapLatest(shareIn, new kotlin.coroutines.jvm.internal.i(2, null)), h1.a(this), companion.getEagerly(), 1);
        this.f52283g = FlowKt.shareIn(FlowKt.mapLatest(shareIn, new d(null)), h1.a(this), companion.getEagerly(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(qm0.d<? super nm0.y> r12) {
        /*
            r11 = this;
            r0 = 2
            boolean r1 = r12 instanceof com.withings.wiscale2.device.common.feature.highlowhr.i0.a
            if (r1 == 0) goto L14
            r1 = r12
            com.withings.wiscale2.device.common.feature.highlowhr.i0$a r1 = (com.withings.wiscale2.device.common.feature.highlowhr.i0.a) r1
            int r2 = r1.f52287d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f52287d = r2
            goto L19
        L14:
            com.withings.wiscale2.device.common.feature.highlowhr.i0$a r1 = new com.withings.wiscale2.device.common.feature.highlowhr.i0$a
            r1.<init>(r12)
        L19:
            java.lang.Object r12 = r1.f52285b
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r3 = r1.f52287d
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 == r4) goto L34
            if (r3 != r0) goto L2c
            com.withings.wiscale2.device.common.feature.highlowhr.i0 r1 = r1.f52284a
            nm0.l.b(r12)
            goto L5f
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            com.withings.wiscale2.device.common.feature.highlowhr.i0 r3 = r1.f52284a
            nm0.l.b(r12)
            goto L4b
        L3a:
            nm0.l.b(r12)
            r1.f52284a = r11
            r1.f52287d = r4
            kotlinx.coroutines.flow.SharedFlow<ur.a> r12 = r11.f52281e
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.first(r12, r1)
            if (r12 != r2) goto L4a
            return r2
        L4a:
            r3 = r11
        L4b:
            ur.a r12 = (ur.a) r12
            if (r12 == 0) goto L7b
            vr.d r5 = r3.f52278b
            r1.f52284a = r3
            r1.f52287d = r0
            long r6 = r3.f52277a
            java.lang.Object r12 = r5.a(r12, r6, r1)
            if (r12 != r2) goto L5e
            return r2
        L5e:
            r1 = r3
        L5f:
            long[] r12 = new long[r0]
            r12 = {x007e: FILL_ARRAY_DATA  , data: [3, 2} // fill-array
            zo.a r0 = r1.f52280d
            r0.y(r4, r12)
            kotlinx.coroutines.GlobalScope r5 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.device.common.feature.highlowhr.i0$b r8 = new com.withings.wiscale2.device.common.feature.highlowhr.i0$b
            r12 = 0
            r8.<init>(r12)
            r10 = 0
            r7 = 0
            r9 = 2
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
        L7b:
            nm0.y r12 = nm0.y.f85009a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.highlowhr.i0.f0(qm0.d):java.lang.Object");
    }

    public final SharedFlow<Boolean> j0() {
        return this.f52283g;
    }

    public final SharedFlow<Boolean> k0() {
        return this.f52282f;
    }
}
