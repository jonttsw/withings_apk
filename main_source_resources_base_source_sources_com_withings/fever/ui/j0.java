package com.withings.fever.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class j0 implements Flow<bs.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f39307a;

    /* compiled from: Emitters.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f39308a;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$special$$inlined$map$2$2", f = "BodyTemperatureViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.fever.ui.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0512a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f39309a;

            /* renamed from: b  reason: collision with root package name */
            int f39310b;

            public C0512a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f39309a = obj;
                this.f39310b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f39308a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.withings.fever.ui.j0.a.C0512a
                if (r0 == 0) goto L13
                r0 = r9
                com.withings.fever.ui.j0$a$a r0 = (com.withings.fever.ui.j0.a.C0512a) r0
                int r1 = r0.f39310b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f39310b = r1
                goto L18
            L13:
                com.withings.fever.ui.j0$a$a r0 = new com.withings.fever.ui.j0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f39309a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f39310b
                r3 = 1
                if (r2 == 0) goto L30
                if (r2 != r3) goto L28
                nm0.l.b(r9)
                goto Ld6
            L28:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L30:
                nm0.l.b(r9)
                java.util.List r8 = (java.util.List) r8
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
                r9.<init>()
                java.util.Iterator r8 = r8.iterator()
            L40:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L65
                java.lang.Object r2 = r8.next()
                r4 = r2
                fx.f r4 = (fx.f) r4
                java.lang.String r4 = r4.l()
                java.lang.Object r5 = r9.get(r4)
                if (r5 != 0) goto L5f
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r9.put(r4, r5)
            L5f:
                java.util.List r5 = (java.util.List) r5
                r5.add(r2)
                goto L40
            L65:
                java.util.Collection r8 = r9.values()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                com.withings.fever.ui.m0 r9 = new com.withings.fever.ui.m0
                r9.<init>()
                java.util.List r8 = kotlin.collections.x.D0(r8, r9)
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                r9 = 6
                java.util.List r8 = kotlin.collections.x.H0(r8, r9)
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r9 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.x.y(r8, r2)
                r9.<init>(r2)
                java.util.Iterator r8 = r8.iterator()
            L8c:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto Lc4
                java.lang.Object r2 = r8.next()
                java.util.List r2 = (java.util.List) r2
                bs.a r4 = new bs.a
                java.lang.Object r5 = kotlin.collections.x.K(r2)
                fx.f r5 = (fx.f) r5
                java.lang.String r6 = ""
                if (r5 == 0) goto Laa
                java.lang.String r5 = r5.b()
                if (r5 != 0) goto Lab
            Laa:
                r5 = r6
            Lab:
                java.lang.Object r2 = kotlin.collections.x.K(r2)
                fx.f r2 = (fx.f) r2
                if (r2 == 0) goto Lbb
                java.lang.String r2 = r2.c()
                if (r2 != 0) goto Lba
                goto Lbb
            Lba:
                r6 = r2
            Lbb:
                com.withings.fever.ui.inputLogs.LogsCategoryColor r2 = com.withings.fever.ui.inputLogs.LogsCategoryColor.f39301d
                r4.<init>(r5, r6)
                r9.add(r4)
                goto L8c
            Lc4:
                bs.b r8 = new bs.b
                com.withings.fever.ui.inputLogs.BodyTemperatureLogsType r2 = com.withings.fever.ui.inputLogs.BodyTemperatureLogsType.f39298b
                r8.<init>(r2, r9)
                r0.f39310b = r3
                kotlinx.coroutines.flow.FlowCollector r9 = r7.f39308a
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto Ld6
                return r1
            Ld6:
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.fever.ui.j0.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public j0(Flow flow) {
        this.f39307a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super bs.b> flowCollector, qm0.d dVar) {
        Object collect = this.f39307a.collect(new a(flowCollector), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
