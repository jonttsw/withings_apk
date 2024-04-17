package com.withings.tutorials.ui.screens.modes.pregnancy;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class u1 implements Flow<Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f46153a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f46154b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f46155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PregnancyModeViewModel f46156b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$special$$inlined$map$2$2", f = "PregnancyModeViewModel.kt", l = {224, 223}, m = "emit")
        /* renamed from: com.withings.tutorials.ui.screens.modes.pregnancy.u1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0634a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f46157a;

            /* renamed from: b  reason: collision with root package name */
            int f46158b;

            /* renamed from: c  reason: collision with root package name */
            FlowCollector f46159c;

            public C0634a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f46157a = obj;
                this.f46158b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, PregnancyModeViewModel pregnancyModeViewModel) {
            this.f46155a = flowCollector;
            this.f46156b = pregnancyModeViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, qm0.d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.withings.tutorials.ui.screens.modes.pregnancy.u1.a.C0634a
                if (r0 == 0) goto L13
                r0 = r12
                com.withings.tutorials.ui.screens.modes.pregnancy.u1$a$a r0 = (com.withings.tutorials.ui.screens.modes.pregnancy.u1.a.C0634a) r0
                int r1 = r0.f46158b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f46158b = r1
                goto L18
            L13:
                com.withings.tutorials.ui.screens.modes.pregnancy.u1$a$a r0 = new com.withings.tutorials.ui.screens.modes.pregnancy.u1$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f46157a
                kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r0.f46158b
                r8 = 2
                r2 = 1
                if (r1 == 0) goto L38
                if (r1 == r2) goto L32
                if (r1 != r8) goto L2a
                nm0.l.b(r12)
                goto L65
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L32:
                kotlinx.coroutines.flow.FlowCollector r11 = r0.f46159c
                nm0.l.b(r12)
                goto L59
            L38:
                nm0.l.b(r12)
                r4 = r11
                org.joda.time.DateTime r4 = (org.joda.time.DateTime) r4
                com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel r11 = r10.f46156b
                w60.b r1 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.q0(r11)
                long r11 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.t0(r11)
                kotlinx.coroutines.flow.FlowCollector r9 = r10.f46155a
                r0.f46159c = r9
                r0.f46158b = r2
                r5 = 0
                r2 = r11
                r6 = r0
                java.lang.Object r12 = r1.b(r2, r4, r5, r6)
                if (r12 != r7) goto L58
                return r7
            L58:
                r11 = r9
            L59:
                r1 = 0
                r0.f46159c = r1
                r0.f46158b = r8
                java.lang.Object r11 = r11.emit(r12, r0)
                if (r11 != r7) goto L65
                return r7
            L65:
                nm0.y r11 = nm0.y.f85009a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.u1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public u1(MutableStateFlow mutableStateFlow, PregnancyModeViewModel pregnancyModeViewModel) {
        this.f46153a = mutableStateFlow;
        this.f46154b = pregnancyModeViewModel;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Double> flowCollector, qm0.d dVar) {
        Object collect = this.f46153a.collect(new a(flowCollector, this.f46154b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
