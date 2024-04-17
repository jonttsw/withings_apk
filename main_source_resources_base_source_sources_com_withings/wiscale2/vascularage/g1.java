package com.withings.wiscale2.vascularage;

import com.withings.graph.GraphPeriod;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes5.dex */
public final class g1 implements Flow<List<? extends GraphPeriod>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f62301a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f62302b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f62303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0 f62304b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$special$$inlined$map$4$2", f = "VascularAgeViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.vascularage.g1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0793a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f62305a;

            /* renamed from: b  reason: collision with root package name */
            int f62306b;

            public C0793a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f62305a = obj;
                this.f62306b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, r0 r0Var) {
            this.f62303a = flowCollector;
            this.f62304b = r0Var;
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
                boolean r0 = r6 instanceof com.withings.wiscale2.vascularage.g1.a.C0793a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.wiscale2.vascularage.g1$a$a r0 = (com.withings.wiscale2.vascularage.g1.a.C0793a) r0
                int r1 = r0.f62306b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f62306b = r1
                goto L18
            L13:
                com.withings.wiscale2.vascularage.g1$a$a r0 = new com.withings.wiscale2.vascularage.g1$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f62305a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f62306b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L4c
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                org.joda.time.Interval r5 = (org.joda.time.Interval) r5
                com.withings.wiscale2.vascularage.r0 r6 = r4.f62304b
                ml.b r6 = com.withings.wiscale2.vascularage.r0.i0(r6)
                r6.getClass()
                om0.b r5 = ml.b.a(r5)
                r0.f62306b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f62303a
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L4c
                return r1
            L4c:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vascularage.g1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public g1(Flow flow, r0 r0Var) {
        this.f62301a = flow;
        this.f62302b = r0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super List<? extends GraphPeriod>> flowCollector, qm0.d dVar) {
        Object collect = this.f62301a.collect(new a(flowCollector, this.f62302b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
