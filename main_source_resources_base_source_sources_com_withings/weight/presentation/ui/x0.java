package com.withings.weight.presentation.ui;

import com.withings.graph.GraphPeriod;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.joda.time.Interval;
/* compiled from: WeightExploreDataViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataViewModel$onAfterViewportChanged$1", f = "WeightExploreDataViewModel.kt", l = {102, 101, 105}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class x0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MutableStateFlow f47308a;

    /* renamed from: b  reason: collision with root package name */
    int f47309b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GraphPeriod f47310c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WeightExploreDataViewModel f47311d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Interval f47312e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(GraphPeriod graphPeriod, WeightExploreDataViewModel weightExploreDataViewModel, Interval interval, qm0.d<? super x0> dVar) {
        super(2, dVar);
        this.f47310c = graphPeriod;
        this.f47311d = weightExploreDataViewModel;
        this.f47312e = interval;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x0(this.f47310c, this.f47311d, this.f47312e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.flow.MutableSharedFlow] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f47309b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            nm0.l.b(r7)
            goto L5b
        L1c:
            kotlinx.coroutines.flow.MutableStateFlow r1 = r6.f47308a
            nm0.l.b(r7)
            goto L40
        L22:
            nm0.l.b(r7)
            com.withings.graph.GraphPeriod r7 = com.withings.graph.GraphPeriod.f39507g
            com.withings.graph.GraphPeriod r1 = r6.f47310c
            com.withings.weight.presentation.ui.WeightExploreDataViewModel r5 = r6.f47311d
            if (r1 != r7) goto L4c
            kotlinx.coroutines.flow.MutableStateFlow r1 = r5.r0()
            kotlinx.coroutines.flow.SharedFlow r7 = com.withings.weight.presentation.ui.WeightExploreDataViewModel.j0(r5)
            r6.f47308a = r1
            r6.f47309b = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.last(r7, r6)
            if (r7 != r0) goto L40
            return r0
        L40:
            r2 = 0
            r6.f47308a = r2
            r6.f47309b = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L5b
            return r0
        L4c:
            kotlinx.coroutines.flow.MutableStateFlow r7 = r5.r0()
            r6.f47309b = r2
            org.joda.time.Interval r1 = r6.f47312e
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L5b
            return r0
        L5b:
            nm0.y r7 = nm0.y.f85009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.ui.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
