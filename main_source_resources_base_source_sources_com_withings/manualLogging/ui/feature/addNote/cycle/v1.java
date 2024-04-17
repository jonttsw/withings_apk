package com.withings.manualLogging.ui.feature.addNote.cycle;

import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLoggingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$1", f = "CycleManualLoggingViewModel.kt", l = {116, 119}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class v1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41286a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f41287b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$1$1$1", f = "CycleManualLoggingViewModel.kt", l = {121, 122}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Boolean, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41288a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f41289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CycleManualLoggingViewModel f41290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CycleManualLoggingViewModel cycleManualLoggingViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f41290c = cycleManualLoggingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f41290c, dVar);
            aVar.f41289b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(Boolean bool, qm0.d<? super nm0.y> dVar) {
            return ((a) create(bool, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r7.f41288a
                r2 = 2
                r3 = 1
                com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r4 = r7.f41290c
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                nm0.l.b(r8)
                goto L98
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f41289b
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                nm0.l.b(r8)
                goto L52
            L23:
                nm0.l.b(r8)
                java.lang.Object r8 = r7.f41289b
                r1 = r8
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                java.lang.String r8 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.y0(r4)
                java.lang.String r5 = "loading"
                boolean r8 = kotlin.jvm.internal.u.e(r8, r5)
                if (r8 == 0) goto L98
                xm.a r8 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.j0(r4)
                java.lang.Long r5 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.B0(r4)
                long r5 = r5.longValue()
                kotlinx.coroutines.flow.Flow r8 = r8.c(r5)
                r7.f41289b = r1
                r7.f41288a = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r8, r7)
                if (r8 != r0) goto L52
                return r0
            L52:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                if (r8 == 0) goto L5b
                boolean r8 = r8.booleanValue()
                goto L5c
            L5b:
                r8 = 0
            L5c:
                kotlinx.coroutines.flow.MutableStateFlow r3 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.G0(r4)
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                boolean r6 = kotlin.jvm.internal.u.e(r1, r5)
                if (r6 != 0) goto L6a
                if (r8 == 0) goto L79
            L6a:
                boolean r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.z0(r4)
                if (r6 != 0) goto L79
                java.lang.Long r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.k0(r4)
                if (r6 == 0) goto L79
                com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent r8 = com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent.f41118f
                goto L8c
            L79:
                boolean r1 = kotlin.jvm.internal.u.e(r1, r5)
                if (r1 != 0) goto L81
                if (r8 == 0) goto L8a
            L81:
                boolean r8 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.z0(r4)
                if (r8 != 0) goto L8a
                com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent r8 = com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent.f41117e
                goto L8c
            L8a:
                com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent r8 = com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent.f41115c
            L8c:
                r1 = 0
                r7.f41289b = r1
                r7.f41288a = r2
                java.lang.Object r8 = r3.emit(r8, r7)
                if (r8 != r0) goto L98
                return r0
            L98:
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.v1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(CycleManualLoggingViewModel cycleManualLoggingViewModel, qm0.d<? super v1> dVar) {
        super(2, dVar);
        this.f41287b = cycleManualLoggingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new v1(this.f41287b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((v1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r6 == null) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r5.f41286a
            r2 = 2
            r3 = 1
            com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r4 = r5.f41287b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            nm0.l.b(r6)
            goto L5e
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            nm0.l.b(r6)
            goto L45
        L1e:
            nm0.l.b(r6)
            java.lang.Integer r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.m0(r4)
            if (r6 == 0) goto L33
            java.lang.Long r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.B0(r4)
            if (r6 == 0) goto L33
            java.lang.Long r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.k0(r4)
            if (r6 != 0) goto L45
        L33:
            kotlinx.coroutines.flow.MutableSharedFlow r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.F0(r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            r5.f41286a = r3
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L45
            return r0
        L45:
            java.lang.Long r6 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.B0(r4)
            if (r6 == 0) goto L5e
            kotlinx.coroutines.flow.Flow r6 = r4.Y0()
            com.withings.manualLogging.ui.feature.addNote.cycle.v1$a r1 = new com.withings.manualLogging.ui.feature.addNote.cycle.v1$a
            r3 = 0
            r1.<init>(r4, r3)
            r5.f41286a = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5)
            if (r6 != r0) goto L5e
            return r0
        L5e:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
