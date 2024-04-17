package com.withings.weight.ui.limbExplore;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class y implements Flow<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f47746a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f47747b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f47748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a0 f47749b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$special$$inlined$map$3$2", f = "SegmentalLimbExploreViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.weight.ui.limbExplore.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0657a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f47750a;

            /* renamed from: b  reason: collision with root package name */
            int f47751b;

            public C0657a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f47750a = obj;
                this.f47751b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, a0 a0Var) {
            this.f47748a = flowCollector;
            this.f47749b = a0Var;
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
                boolean r0 = r7 instanceof com.withings.weight.ui.limbExplore.y.a.C0657a
                if (r0 == 0) goto L13
                r0 = r7
                com.withings.weight.ui.limbExplore.y$a$a r0 = (com.withings.weight.ui.limbExplore.y.a.C0657a) r0
                int r1 = r0.f47751b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f47751b = r1
                goto L18
            L13:
                com.withings.weight.ui.limbExplore.y$a$a r0 = new com.withings.weight.ui.limbExplore.y$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f47750a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f47751b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r7)
                goto L53
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                nm0.l.b(r7)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                com.withings.weight.ui.limbExplore.p r7 = new com.withings.weight.ui.limbExplore.p
                r2 = 0
                androidx.compose.runtime.ParcelableSnapshotMutableState r2 = androidx.compose.runtime.l0.g(r2)
                com.withings.weight.ui.limbExplore.a0 r4 = r5.f47749b
                android.app.Application r4 = r4.getApplication()
                r7.<init>(r2, r4, r6)
                r0.f47751b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r5.f47748a
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L53
                return r1
            L53:
                nm0.y r6 = nm0.y.f85009a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.ui.limbExplore.y.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public y(SharedFlow sharedFlow, a0 a0Var) {
        this.f47746a = sharedFlow;
        this.f47747b = a0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super p> flowCollector, qm0.d dVar) {
        Object collect = this.f47746a.collect(new a(flowCollector, this.f47747b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
