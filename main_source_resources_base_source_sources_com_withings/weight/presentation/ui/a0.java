package com.withings.weight.presentation.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import m90.f;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class a0 implements Flow<f.b.e> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f47201a;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f47202a;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$getUiStateFlow$$inlined$map$1$2", f = "WeightActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.weight.presentation.ui.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0643a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f47203a;

            /* renamed from: b  reason: collision with root package name */
            int f47204b;

            public C0643a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f47203a = obj;
                this.f47204b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f47202a = flowCollector;
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
                boolean r0 = r6 instanceof com.withings.weight.presentation.ui.a0.a.C0643a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.weight.presentation.ui.a0$a$a r0 = (com.withings.weight.presentation.ui.a0.a.C0643a) r0
                int r1 = r0.f47204b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f47204b = r1
                goto L18
            L13:
                com.withings.weight.presentation.ui.a0$a$a r0 = new com.withings.weight.presentation.ui.a0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f47203a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f47204b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L44
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                java.util.List r5 = (java.util.List) r5
                m90.f$b$e r6 = new m90.f$b$e
                r6.<init>(r5)
                r0.f47204b = r3
                kotlinx.coroutines.flow.FlowCollector r5 = r4.f47202a
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.ui.a0.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public a0(SharedFlow sharedFlow) {
        this.f47201a = sharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super f.b.e> flowCollector, qm0.d dVar) {
        Object collect = this.f47201a.collect(new a(flowCollector), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
