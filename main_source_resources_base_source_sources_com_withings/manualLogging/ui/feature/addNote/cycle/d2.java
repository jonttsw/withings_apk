package com.withings.manualLogging.ui.feature.addNote.cycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class d2 implements Flow<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f40976a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f40977b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f40978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleManualLoggingViewModel f40979b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$special$$inlined$mapNotNull$2$2", f = "CycleManualLoggingViewModel.kt", l = {228}, m = "emit")
        /* renamed from: com.withings.manualLogging.ui.feature.addNote.cycle.d2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0552a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f40980a;

            /* renamed from: b  reason: collision with root package name */
            int f40981b;

            public C0552a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40980a = obj;
                this.f40981b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, CycleManualLoggingViewModel cycleManualLoggingViewModel) {
            this.f40978a = flowCollector;
            this.f40979b = cycleManualLoggingViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
            if (r9 == null) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.withings.manualLogging.ui.feature.addNote.cycle.d2.a.C0552a
                if (r0 == 0) goto L13
                r0 = r10
                com.withings.manualLogging.ui.feature.addNote.cycle.d2$a$a r0 = (com.withings.manualLogging.ui.feature.addNote.cycle.d2.a.C0552a) r0
                int r1 = r0.f40981b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40981b = r1
                goto L18
            L13:
                com.withings.manualLogging.ui.feature.addNote.cycle.d2$a$a r0 = new com.withings.manualLogging.ui.feature.addNote.cycle.d2$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f40980a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f40981b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r10)
                goto L67
            L27:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L2f:
                nm0.l.b(r10)
                com.withings.device.Device r9 = (com.withings.device.Device) r9
                com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r10 = r8.f40979b
                if (r9 == 0) goto L56
                long r4 = r9.getId()
                java.lang.Long r9 = new java.lang.Long
                r9.<init>(r4)
                java.lang.Long r2 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.k0(r10)
                if (r2 != 0) goto L48
                goto L53
            L48:
                long r4 = r2.longValue()
                r6 = -1
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 != 0) goto L53
                goto L54
            L53:
                r9 = 0
            L54:
                if (r9 != 0) goto L5a
            L56:
                java.lang.Long r9 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.k0(r10)
            L5a:
                if (r9 == 0) goto L67
                r0.f40981b = r3
                kotlinx.coroutines.flow.FlowCollector r10 = r8.f40978a
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto L67
                return r1
            L67:
                nm0.y r9 = nm0.y.f85009a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.d2.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public d2(SharedFlow sharedFlow, CycleManualLoggingViewModel cycleManualLoggingViewModel) {
        this.f40976a = sharedFlow;
        this.f40977b = cycleManualLoggingViewModel;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Long> flowCollector, qm0.d dVar) {
        Object collect = this.f40976a.collect(new a(flowCollector, this.f40977b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
