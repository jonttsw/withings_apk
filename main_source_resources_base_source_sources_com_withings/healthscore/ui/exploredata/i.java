package com.withings.healthscore.ui.exploredata;

import com.withings.graph.GraphPeriod;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import org.joda.time.Interval;
import ym0.p;
/* compiled from: HealthScoreExploreDataViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$onAfterViewportChanged$1", f = "HealthScoreExploreDataViewModel.kt", l = {82, 86}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GraphPeriod f40578b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HealthScoreExploreDataViewModel f40579c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Interval f40580d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GraphPeriod graphPeriod, HealthScoreExploreDataViewModel healthScoreExploreDataViewModel, Interval interval, qm0.d<? super i> dVar) {
        super(2, dVar);
        this.f40578b = graphPeriod;
        this.f40579c = healthScoreExploreDataViewModel;
        this.f40580d = interval;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new i(this.f40578b, this.f40579c, this.f40580d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r5.f40577a
            com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel r2 = r5.f40579c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            nm0.l.b(r6)
            goto L4a
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            nm0.l.b(r6)
            goto L34
        L1e:
            nm0.l.b(r6)
            com.withings.graph.GraphPeriod r6 = com.withings.graph.GraphPeriod.f39507g
            com.withings.graph.GraphPeriod r1 = r5.f40578b
            if (r1 != r6) goto L3b
            kotlinx.coroutines.flow.SharedFlow r6 = r2.k0()
            r5.f40577a = r4
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.last(r6, r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            wv.c r6 = (wv.c) r6
            org.joda.time.Interval r6 = r6.a()
            goto L3d
        L3b:
            org.joda.time.Interval r6 = r5.f40580d
        L3d:
            kotlinx.coroutines.flow.MutableStateFlow r1 = r2.i0()
            r5.f40577a = r3
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L4a
            return r0
        L4a:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.healthscore.ui.exploredata.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
