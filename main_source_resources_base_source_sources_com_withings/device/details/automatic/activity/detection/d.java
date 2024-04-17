package com.withings.device.details.automatic.activity.detection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ActirecCategoryDetectionRepository.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final b f36690a;

    /* compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.ActirecCategoryDetectionRepository$listStates$$inlined$transform$1", f = "ActirecCategoryDetectionRepository.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends com.withings.device.details.automatic.activity.detection.a>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36691a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f36692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Flow f36693c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f36694d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f36695e;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.device.details.automatic.activity.detection.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0481a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector<List<? extends com.withings.device.details.automatic.activity.detection.a>> f36696a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f36697b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f36698c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.ActirecCategoryDetectionRepository$listStates$$inlined$transform$1$1", f = "ActirecCategoryDetectionRepository.kt", l = {226}, m = "emit")
            /* renamed from: com.withings.device.details.automatic.activity.detection.d$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0482a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f36699a;

                /* renamed from: b  reason: collision with root package name */
                int f36700b;

                public C0482a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f36699a = obj;
                    this.f36700b |= Integer.MIN_VALUE;
                    return C0481a.this.emit(null, this);
                }
            }

            public C0481a(FlowCollector flowCollector, d dVar, long j5) {
                this.f36697b = dVar;
                this.f36698c = j5;
                this.f36696a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, qm0.d<? super nm0.y> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.device.details.automatic.activity.detection.d.a.C0481a.C0482a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.device.details.automatic.activity.detection.d$a$a$a r0 = (com.withings.device.details.automatic.activity.detection.d.a.C0481a.C0482a) r0
                    int r1 = r0.f36700b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36700b = r1
                    goto L18
                L13:
                    com.withings.device.details.automatic.activity.detection.d$a$a$a r0 = new com.withings.device.details.automatic.activity.detection.d$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f36699a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f36700b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L55
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    boolean r6 = r5.isEmpty()
                    if (r6 == 0) goto L4a
                    com.withings.device.details.automatic.activity.detection.d r5 = r4.f36697b
                    com.withings.device.details.automatic.activity.detection.b r6 = com.withings.device.details.automatic.activity.detection.d.b(r5)
                    long r0 = r4.f36698c
                    java.util.ArrayList r5 = com.withings.device.details.automatic.activity.detection.d.a(r5, r0)
                    r6.b(r5)
                    goto L55
                L4a:
                    r0.f36700b = r3
                    kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends com.withings.device.details.automatic.activity.detection.a>> r6 = r4.f36696a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.automatic.activity.detection.d.a.C0481a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, qm0.d dVar, d dVar2, long j5) {
            super(2, dVar);
            this.f36693c = flow;
            this.f36694d = dVar2;
            this.f36695e = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f36693c, dVar, this.f36694d, this.f36695e);
            aVar.f36692b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends com.withings.device.details.automatic.activity.detection.a>> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((a) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f36691a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                C0481a c0481a = new C0481a((FlowCollector) this.f36692b, this.f36694d, this.f36695e);
                this.f36691a = 1;
                if (this.f36693c.collect(c0481a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    public d(b dao) {
        kotlin.jvm.internal.u.j(dao, "dao");
        this.f36690a = dao;
    }

    public static final /* synthetic */ ArrayList a(d dVar, long j5) {
        dVar.getClass();
        return c(j5);
    }

    private static ArrayList c(long j5) {
        int[] iArr = {1, 6, 2, 7, 36};
        ArrayList arrayList = new ArrayList(5);
        for (int i11 = 0; i11 < 5; i11++) {
            arrayList.add(new com.withings.device.details.automatic.activity.detection.a(j5, iArr[i11], true));
        }
        return arrayList;
    }

    public final Map<Long, Boolean> d(long j5) {
        LinkedHashMap e11 = this.f36690a.e(j5);
        if (e11.isEmpty()) {
            ArrayList c11 = c(j5);
            int h11 = s0.h(kotlin.collections.x.y(c11, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            e11 = new LinkedHashMap(h11);
            Iterator it = c11.iterator();
            while (it.hasNext()) {
                com.withings.device.details.automatic.activity.detection.a aVar = (com.withings.device.details.automatic.activity.detection.a) it.next();
                nm0.j jVar = new nm0.j(Long.valueOf(aVar.c()), Boolean.valueOf(aVar.a()));
                e11.put(jVar.c(), jVar.d());
            }
        }
        return e11;
    }

    public final Flow<List<com.withings.device.details.automatic.activity.detection.a>> e(long j5) {
        return FlowKt.flowOn(FlowKt.flow(new a(this.f36690a.d(j5), null, this, j5)), Dispatchers.getIO());
    }
}
