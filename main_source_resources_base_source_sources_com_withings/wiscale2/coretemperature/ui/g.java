package com.withings.wiscale2.coretemperature.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import nm0.y;
import org.joda.time.Interval;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class g implements Flow<Interval> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f50437a;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f50438a;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureActivityKt$rememberExploreDataState$lambda$4$$inlined$map$1$2", f = "ExploreCoreTemperatureActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.coretemperature.ui.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0681a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f50439a;

            /* renamed from: b  reason: collision with root package name */
            int f50440b;

            public C0681a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f50439a = obj;
                this.f50440b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f50438a = flowCollector;
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
                boolean r0 = r6 instanceof com.withings.wiscale2.coretemperature.ui.g.a.C0681a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.wiscale2.coretemperature.ui.g$a$a r0 = (com.withings.wiscale2.coretemperature.ui.g.a.C0681a) r0
                int r1 = r0.f50440b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f50440b = r1
                goto L18
            L13:
                com.withings.wiscale2.coretemperature.ui.g$a$a r0 = new com.withings.wiscale2.coretemperature.ui.g$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f50439a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f50440b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L64
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                com.withings.wiscale2.coretemperature.ui.n$b r5 = (com.withings.wiscale2.coretemperature.ui.n.b) r5
                org.joda.time.Interval r6 = new org.joda.time.Interval
                java.util.List r2 = r5.a()
                java.lang.Object r2 = kotlin.collections.x.I(r2)
                nm0.j r2 = (nm0.j) r2
                java.lang.Object r2 = r2.c()
                org.joda.time.ReadableInstant r2 = (org.joda.time.ReadableInstant) r2
                java.util.List r5 = r5.a()
                java.lang.Object r5 = kotlin.collections.x.T(r5)
                nm0.j r5 = (nm0.j) r5
                java.lang.Object r5 = r5.c()
                org.joda.time.ReadableInstant r5 = (org.joda.time.ReadableInstant) r5
                r6.<init>(r2, r5)
                r0.f50440b = r3
                kotlinx.coroutines.flow.FlowCollector r5 = r4.f50438a
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L64
                return r1
            L64:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.coretemperature.ui.g.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public g(SharedFlow sharedFlow) {
        this.f50437a = sharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Interval> flowCollector, qm0.d dVar) {
        Object collect = this.f50437a.collect(new a(flowCollector), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return y.f85009a;
    }
}
