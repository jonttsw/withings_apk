package com.withings.leaderboard.domain;

import com.withings.leaderboard.ui.screen.LeaderBoardUiEntry;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
import qm0.d;
/* compiled from: GetUserPositionRankingUseCase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/leaderboard/domain/GetUserPositionRankingUseCase;", "", "getLeaderBoardItemUseCase", "Lcom/withings/leaderboard/domain/GetLeaderBoardItemUseCase;", "(Lcom/withings/leaderboard/domain/GetLeaderBoardItemUseCase;)V", "getUserPositionRanking", "Lkotlinx/coroutines/flow/Flow;", "", "date", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetUserPositionRankingUseCase {
    public static final int $stable = 8;
    private final GetLeaderBoardItemUseCase getLeaderBoardItemUseCase;

    @Inject
    public GetUserPositionRankingUseCase(GetLeaderBoardItemUseCase getLeaderBoardItemUseCase) {
        u.j(getLeaderBoardItemUseCase, "getLeaderBoardItemUseCase");
        this.getLeaderBoardItemUseCase = getLeaderBoardItemUseCase;
    }

    public final Flow<String> getUserPositionRanking(String date) {
        u.j(date, "date");
        final Flow<List<LeaderBoardUiEntry>> invoke = this.getLeaderBoardItemUseCase.invoke(date);
        return new Flow<String>() { // from class: com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1$2", f = "GetUserPositionRankingUseCase.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        boolean r0 = r7 instanceof com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1$2$1 r0 = (com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1$2$1 r0 = new com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r7)
                        goto L77
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        nm0.l.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.Iterator r6 = r6.iterator()
                    L3c:
                        boolean r2 = r6.hasNext()
                        if (r2 == 0) goto L50
                        java.lang.Object r2 = r6.next()
                        r4 = r2
                        com.withings.leaderboard.ui.screen.LeaderBoardUiEntry r4 = (com.withings.leaderboard.ui.screen.LeaderBoardUiEntry) r4
                        boolean r4 = r4.isMainUser()
                        if (r4 == 0) goto L3c
                        goto L51
                    L50:
                        r2 = 0
                    L51:
                        com.withings.leaderboard.ui.screen.LeaderBoardUiEntry r2 = (com.withings.leaderboard.ui.screen.LeaderBoardUiEntry) r2
                        if (r2 == 0) goto L5a
                        int r6 = r2.getPosition()
                        goto L5b
                    L5a:
                        r6 = 0
                    L5b:
                        if (r6 >= r3) goto L5e
                        r6 = r3
                    L5e:
                        java.util.Locale r2 = java.util.Locale.getDefault()
                        hb.c r2 = hb.c.a(r2)
                        java.lang.String r2 = r2.b(r6)
                        java.lang.String r6 = a1.x.b(r6, r2)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L77
                        return r1
                    L77:
                        nm0.y r6 = nm0.y.f85009a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.domain.GetUserPositionRankingUseCase$getUserPositionRanking$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }
}
