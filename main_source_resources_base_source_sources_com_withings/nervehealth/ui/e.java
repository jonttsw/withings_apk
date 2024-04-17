package com.withings.nervehealth.ui;

import com.withings.graph.decorator.Decorator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class e implements Flow<List<? extends Decorator>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f42496a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42497b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f42498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NerveHealthActivity f42499b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthActivity$initFlows$$inlined$map$1$2", f = "NerveHealthActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.nervehealth.ui.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0569a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f42500a;

            /* renamed from: b  reason: collision with root package name */
            int f42501b;

            public C0569a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f42500a = obj;
                this.f42501b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, NerveHealthActivity nerveHealthActivity) {
            this.f42498a = flowCollector;
            this.f42499b = nerveHealthActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.withings.nervehealth.ui.e.a.C0569a
                if (r0 == 0) goto L13
                r0 = r8
                com.withings.nervehealth.ui.e$a$a r0 = (com.withings.nervehealth.ui.e.a.C0569a) r0
                int r1 = r0.f42501b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f42501b = r1
                goto L18
            L13:
                com.withings.nervehealth.ui.e$a$a r0 = new com.withings.nervehealth.ui.e$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f42500a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f42501b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r8)
                goto L71
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                nm0.l.b(r8)
                l00.a r7 = (l00.a) r7
                com.withings.nervehealth.ui.NerveHealthActivity r8 = r6.f42499b
                o00.a r8 = r8.f42366o
                r2 = 0
                if (r8 == 0) goto L74
                if (r7 == 0) goto L41
                java.util.List r2 = r7.a()
            L41:
                if (r2 != 0) goto L45
                kotlin.collections.i0 r2 = kotlin.collections.i0.f76187a
            L45:
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r2 = r2.iterator()
            L50:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L62
                java.lang.Object r4 = r2.next()
                boolean r5 = r4 instanceof j00.d.a
                if (r5 == 0) goto L50
                r7.add(r4)
                goto L50
            L62:
                java.util.ArrayList r7 = r8.a(r7)
                r0.f42501b = r3
                kotlinx.coroutines.flow.FlowCollector r8 = r6.f42498a
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L71
                return r1
            L71:
                nm0.y r7 = nm0.y.f85009a
                return r7
            L74:
                java.lang.String r7 = "createBackgroundZoneGraph"
                kotlin.jvm.internal.u.s(r7)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.e.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public e(SharedFlow sharedFlow, NerveHealthActivity nerveHealthActivity) {
        this.f42496a = sharedFlow;
        this.f42497b = nerveHealthActivity;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super List<? extends Decorator>> flowCollector, qm0.d dVar) {
        Object collect = this.f42496a.collect(new a(flowCollector, this.f42497b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
