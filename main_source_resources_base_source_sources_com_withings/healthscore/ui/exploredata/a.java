package com.withings.healthscore.ui.exploredata;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import nm0.y;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class a implements Flow<ts.e> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f40556a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HealthScoreExploreDataActivity f40557b;

    /* compiled from: Emitters.kt */
    /* renamed from: com.withings.healthscore.ui.exploredata.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0544a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f40558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HealthScoreExploreDataActivity f40559b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataActivity$initFlows$$inlined$map$1$2", f = "HealthScoreExploreDataActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.healthscore.ui.exploredata.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0545a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f40560a;

            /* renamed from: b  reason: collision with root package name */
            int f40561b;

            public C0545a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40560a = obj;
                this.f40561b |= Integer.MIN_VALUE;
                return C0544a.this.emit(null, this);
            }
        }

        public C0544a(FlowCollector flowCollector, HealthScoreExploreDataActivity healthScoreExploreDataActivity) {
            this.f40558a = flowCollector;
            this.f40559b = healthScoreExploreDataActivity;
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
                boolean r0 = r6 instanceof com.withings.healthscore.ui.exploredata.a.C0544a.C0545a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.healthscore.ui.exploredata.a$a$a r0 = (com.withings.healthscore.ui.exploredata.a.C0544a.C0545a) r0
                int r1 = r0.f40561b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40561b = r1
                goto L18
            L13:
                com.withings.healthscore.ui.exploredata.a$a$a r0 = new com.withings.healthscore.ui.exploredata.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f40560a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f40561b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L51
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                wv.c r5 = (wv.c) r5
                com.withings.healthscore.ui.exploredata.HealthScoreExploreDataActivity r6 = r4.f40559b
                xv.a r6 = r6.f40516f
                if (r6 == 0) goto L54
                java.util.List r2 = r5.b()
                com.withings.measurement.model.MeasurementsVertical r5 = r5.c()
                ts.e r5 = r6.a(r2, r5)
                r0.f40561b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f40558a
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L51
                return r1
            L51:
                nm0.y r5 = nm0.y.f85009a
                return r5
            L54:
                java.lang.String r5 = "createHealthScoreGraphFromAnyHealthScore"
                kotlin.jvm.internal.u.s(r5)
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.healthscore.ui.exploredata.a.C0544a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public a(SharedFlow sharedFlow, HealthScoreExploreDataActivity healthScoreExploreDataActivity) {
        this.f40556a = sharedFlow;
        this.f40557b = healthScoreExploreDataActivity;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super ts.e> flowCollector, qm0.d dVar) {
        Object collect = this.f40556a.collect(new C0544a(flowCollector, this.f40557b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return y.f85009a;
    }
}
