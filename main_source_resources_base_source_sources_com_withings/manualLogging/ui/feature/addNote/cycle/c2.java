package com.withings.manualLogging.ui.feature.addNote.cycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class c2 implements Flow<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f40951a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f40952b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f40953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleManualLoggingViewModel f40954b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$special$$inlined$mapNotNull$1$2", f = "CycleManualLoggingViewModel.kt", l = {228}, m = "emit")
        /* renamed from: com.withings.manualLogging.ui.feature.addNote.cycle.c2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0550a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f40955a;

            /* renamed from: b  reason: collision with root package name */
            int f40956b;

            public C0550a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40955a = obj;
                this.f40956b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, CycleManualLoggingViewModel cycleManualLoggingViewModel) {
            this.f40953a = flowCollector;
            this.f40954b = cycleManualLoggingViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
            if (r2 == null) goto L27;
         */
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
                boolean r0 = r7 instanceof com.withings.manualLogging.ui.feature.addNote.cycle.c2.a.C0550a
                if (r0 == 0) goto L13
                r0 = r7
                com.withings.manualLogging.ui.feature.addNote.cycle.c2$a$a r0 = (com.withings.manualLogging.ui.feature.addNote.cycle.c2.a.C0550a) r0
                int r1 = r0.f40956b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40956b = r1
                goto L18
            L13:
                com.withings.manualLogging.ui.feature.addNote.cycle.c2$a$a r0 = new com.withings.manualLogging.ui.feature.addNote.cycle.c2$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f40955a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f40956b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r7)
                goto L64
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                nm0.l.b(r7)
                com.withings.device.Device r6 = (com.withings.device.Device) r6
                com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r7 = r5.f40954b
                if (r6 == 0) goto L53
                int r6 = r6.getModelId()
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r6)
                java.lang.Integer r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.m0(r7)
                if (r6 != 0) goto L48
                goto L50
            L48:
                int r6 = r6.intValue()
                r4 = -1
                if (r6 != r4) goto L50
                goto L51
            L50:
                r2 = 0
            L51:
                if (r2 != 0) goto L57
            L53:
                java.lang.Integer r2 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.m0(r7)
            L57:
                if (r2 == 0) goto L64
                r0.f40956b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r5.f40953a
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L64
                return r1
            L64:
                nm0.y r6 = nm0.y.f85009a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.c2.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public c2(SharedFlow sharedFlow, CycleManualLoggingViewModel cycleManualLoggingViewModel) {
        this.f40951a = sharedFlow;
        this.f40952b = cycleManualLoggingViewModel;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Integer> flowCollector, qm0.d dVar) {
        Object collect = this.f40951a.collect(new a(flowCollector, this.f40952b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
