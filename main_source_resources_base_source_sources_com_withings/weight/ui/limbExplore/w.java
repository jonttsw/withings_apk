package com.withings.weight.ui.limbExplore;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class w implements Flow<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f47734a;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f47735a;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$special$$inlined$map$1$2", f = "SegmentalLimbExploreViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.weight.ui.limbExplore.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0655a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f47736a;

            /* renamed from: b  reason: collision with root package name */
            int f47737b;

            public C0655a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f47736a = obj;
                this.f47737b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f47735a = flowCollector;
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
                boolean r0 = r6 instanceof com.withings.weight.ui.limbExplore.w.a.C0655a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.weight.ui.limbExplore.w$a$a r0 = (com.withings.weight.ui.limbExplore.w.a.C0655a) r0
                int r1 = r0.f47737b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f47737b = r1
                goto L18
            L13:
                com.withings.weight.ui.limbExplore.w$a$a r0 = new com.withings.weight.ui.limbExplore.w$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f47736a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f47737b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L4b
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                com.withings.user.core.models.User r5 = (com.withings.user.core.models.User) r5
                com.withings.user.core.models.User$BodyComp r5 = r5.getBodyComp()
                boolean r5 = r5.getInPercent()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r0.f47737b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f47735a
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.ui.limbExplore.w.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public w(Flow flow) {
        this.f47734a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
        Object collect = this.f47734a.collect(new a(flowCollector), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
