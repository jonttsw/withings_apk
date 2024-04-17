package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: Emitters.kt */
/* loaded from: classes5.dex */
public final class d5<T> implements FlowCollector {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FlowCollector f51276a;

    /* compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$stateItems$1$invokeSuspend$$inlined$map$1$2", f = "EcgActivationViewModel.kt", l = {223}, m = "emit")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f51277a;

        /* renamed from: b  reason: collision with root package name */
        int f51278b;

        public a(qm0.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f51277a = obj;
            this.f51278b |= Integer.MIN_VALUE;
            return d5.this.emit(null, this);
        }
    }

    public d5(FlowCollector flowCollector) {
        this.f51276a = flowCollector;
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
            boolean r0 = r7 instanceof com.withings.wiscale2.device.common.feature.ecg.d5.a
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.wiscale2.device.common.feature.ecg.d5$a r0 = (com.withings.wiscale2.device.common.feature.ecg.d5.a) r0
            int r1 = r0.f51278b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51278b = r1
            goto L18
        L13:
            com.withings.wiscale2.device.common.feature.ecg.d5$a r0 = new com.withings.wiscale2.device.common.feature.ecg.d5$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51277a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f51278b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r7)
            goto L65
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            nm0.l.b(r7)
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.x.y(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r6.next()
            com.withings.ecg.webservices.WsStateCode r2 = (com.withings.ecg.webservices.WsStateCode) r2
            com.withings.wiscale2.device.common.feature.ecg.r5 r4 = new com.withings.wiscale2.device.common.feature.ecg.r5
            r4.<init>(r2)
            r7.add(r4)
            goto L45
        L5a:
            r0.f51278b = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r5.f51276a
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.d5.emit(java.lang.Object, qm0.d):java.lang.Object");
    }
}
