package com.withings.overview.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
import r10.d0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class k implements Flow<d0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f43367a;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f43368a;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.overview.ui.StartTrackingViewModel$special$$inlined$map$2$2", f = "StartTrackingViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.overview.ui.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0585a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f43369a;

            /* renamed from: b  reason: collision with root package name */
            int f43370b;

            public C0585a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43369a = obj;
                this.f43370b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f43368a = flowCollector;
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
                boolean r0 = r6 instanceof com.withings.overview.ui.k.a.C0585a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.overview.ui.k$a$a r0 = (com.withings.overview.ui.k.a.C0585a) r0
                int r1 = r0.f43370b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43370b = r1
                goto L18
            L13:
                com.withings.overview.ui.k$a$a r0 = new com.withings.overview.ui.k$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f43369a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43370b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L49
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                s10.c r5 = (s10.c) r5
                if (r5 == 0) goto L3c
                r10.d0$c r6 = new r10.d0$c
                r6.<init>(r5)
                goto L3e
            L3c:
                r10.d0$a r6 = r10.d0.a.f94391a
            L3e:
                r0.f43370b = r3
                kotlinx.coroutines.flow.FlowCollector r5 = r4.f43368a
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L49
                return r1
            L49:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.overview.ui.k.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public k(j jVar) {
        this.f43367a = jVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super d0> flowCollector, qm0.d dVar) {
        Object collect = this.f43367a.collect(new a(flowCollector), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return y.f85009a;
    }
}
