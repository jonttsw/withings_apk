package com.withings.weight.presentation.ui;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class r0 implements Flow<List<? extends ts.d>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f47285a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WeightExploreDataActivity f47286b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f47287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeightExploreDataActivity f47288b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataActivity$initFlows$$inlined$map$1$2", f = "WeightExploreDataActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.weight.presentation.ui.r0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0645a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f47289a;

            /* renamed from: b  reason: collision with root package name */
            int f47290b;

            public C0645a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f47289a = obj;
                this.f47290b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, WeightExploreDataActivity weightExploreDataActivity) {
            this.f47287a = flowCollector;
            this.f47288b = weightExploreDataActivity;
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
                boolean r0 = r6 instanceof com.withings.weight.presentation.ui.r0.a.C0645a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.weight.presentation.ui.r0$a$a r0 = (com.withings.weight.presentation.ui.r0.a.C0645a) r0
                int r1 = r0.f47290b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f47290b = r1
                goto L18
            L13:
                com.withings.weight.presentation.ui.r0$a$a r0 = new com.withings.weight.presentation.ui.r0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f47289a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f47290b
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
                f90.e r5 = (f90.e) r5
                com.withings.weight.presentation.ui.WeightExploreDataActivity r6 = r4.f47288b
                n90.n r6 = r6.f47164f
                if (r6 == 0) goto L50
                java.util.List r5 = r5.f()
                om0.b r5 = r6.a(r5)
                r0.f47290b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f47287a
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L4d
                return r1
            L4d:
                nm0.y r5 = nm0.y.f85009a
                return r5
            L50:
                java.lang.String r5 = "createExploreDataWeightGraphs"
                kotlin.jvm.internal.u.s(r5)
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.ui.r0.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public r0(SharedFlow sharedFlow, WeightExploreDataActivity weightExploreDataActivity) {
        this.f47285a = sharedFlow;
        this.f47286b = weightExploreDataActivity;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super List<? extends ts.d>> flowCollector, qm0.d dVar) {
        Object collect = this.f47285a.collect(new a(flowCollector, this.f47286b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
