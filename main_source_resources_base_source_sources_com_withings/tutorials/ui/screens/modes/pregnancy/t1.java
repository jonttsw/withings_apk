package com.withings.tutorials.ui.screens.modes.pregnancy;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class t1 implements Flow<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f46138a;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f46139a;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$special$$inlined$map$1$2", f = "PregnancyModeViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.tutorials.ui.screens.modes.pregnancy.t1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0633a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f46140a;

            /* renamed from: b  reason: collision with root package name */
            int f46141b;

            public C0633a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f46140a = obj;
                this.f46141b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f46139a = flowCollector;
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
                boolean r0 = r7 instanceof com.withings.tutorials.ui.screens.modes.pregnancy.t1.a.C0633a
                if (r0 == 0) goto L13
                r0 = r7
                com.withings.tutorials.ui.screens.modes.pregnancy.t1$a$a r0 = (com.withings.tutorials.ui.screens.modes.pregnancy.t1.a.C0633a) r0
                int r1 = r0.f46141b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f46141b = r1
                goto L18
            L13:
                com.withings.tutorials.ui.screens.modes.pregnancy.t1$a$a r0 = new com.withings.tutorials.ui.screens.modes.pregnancy.t1$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f46140a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f46141b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r7)
                goto L49
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                nm0.l.b(r7)
                org.joda.time.DateTime r6 = (org.joda.time.DateTime) r6
                long r6 = r6.getMillis()
                r2 = 6
                r4 = 0
                java.lang.String r6 = ah.q.a(r6, r4, r2)
                r0.f46141b = r3
                kotlinx.coroutines.flow.FlowCollector r7 = r5.f46139a
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L49
                return r1
            L49:
                nm0.y r6 = nm0.y.f85009a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.t1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public t1(MutableStateFlow mutableStateFlow) {
        this.f46138a = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super String> flowCollector, qm0.d dVar) {
        Object collect = this.f46138a.collect(new a(flowCollector), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
