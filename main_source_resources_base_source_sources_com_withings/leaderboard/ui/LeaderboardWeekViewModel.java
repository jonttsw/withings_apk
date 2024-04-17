package com.withings.leaderboard.ui;

import androidx.lifecycle.g1;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import r70.c;
import t00.d;
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withings/leaderboard/ui/LeaderboardWeekViewModel;", "Landroidx/lifecycle/g1;", "", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "hackUserScoreWithLocalScore", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", "week", "Ljava/lang/String;", "Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "leaderboardSyncJobFactory", "Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "activityAggregateManager", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "Lt00/d;", "networkSyncManager", "Lt00/d;", "Lr70/c;", "userRepository", "Lr70/c;", "Lcom/withings/leaderboard/domain/LeaderboardManager;", "leaderboardManager", "Lcom/withings/leaderboard/domain/LeaderboardManager;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/withings/leaderboard/ui/UiState;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "getUiState$leaderboard_release", "()Lkotlinx/coroutines/flow/Flow;", "<init>", "(Ljava/lang/String;Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;Lcom/withings/core/data/aggregate/ActivityAggregateManager;Lt00/d;Lr70/c;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardWeekViewModel extends g1 {
    public static final int $stable = 8;
    private final ActivityAggregateManager activityAggregateManager;
    private final LeaderboardManager leaderboardManager;
    private final LeaderboardSyncJobFactory leaderboardSyncJobFactory;
    private final d networkSyncManager;
    private final Flow<UiState> uiState;
    private final c userRepository;
    private final String week;

    public LeaderboardWeekViewModel(String week, LeaderboardSyncJobFactory leaderboardSyncJobFactory, ActivityAggregateManager activityAggregateManager, d networkSyncManager, c userRepository) {
        u.j(week, "week");
        u.j(leaderboardSyncJobFactory, "leaderboardSyncJobFactory");
        u.j(activityAggregateManager, "activityAggregateManager");
        u.j(networkSyncManager, "networkSyncManager");
        u.j(userRepository, "userRepository");
        this.week = week;
        this.leaderboardSyncJobFactory = leaderboardSyncJobFactory;
        this.activityAggregateManager = activityAggregateManager;
        this.networkSyncManager = networkSyncManager;
        this.userRepository = userRepository;
        LeaderboardManager leaderboardManager = LeaderboardManager.Companion.get();
        this.leaderboardManager = leaderboardManager;
        final Flow<List<LeaderboardEntry>> leaderboardFlow = leaderboardManager.getLeaderboardFlow(week);
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends LeaderboardEntry>>() { // from class: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ LeaderboardWeekViewModel this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$1$2", f = "LeaderboardWeekPage.kt", l = {ConstantsWs.WS_STATUS_WRONGSHAREID, 227, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN, 223}, m = "emit")
                /* renamed from: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(qm0.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LeaderboardWeekViewModel leaderboardWeekViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = leaderboardWeekViewModel;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(10:19|20|21|22|(1:24)|25|26|(1:28)|14|15))(12:30|31|32|(1:34)|21|22|(0)|25|26|(0)|14|15))(4:35|36|37|38))(6:47|(2:49|(1:51)(1:52))|26|(0)|14|15)|39|(1:41)(11:42|32|(0)|21|22|(0)|25|26|(0)|14|15)))|54|6|7|(0)(0)|39|(0)(0)|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
                    r0 = th;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00ea A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0104 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0126 A[RETURN] */
                /* JADX WARN: Type inference failed for: r4v0, types: [int] */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v17 */
                /* JADX WARN: Type inference failed for: r4v18 */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v8 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r17, qm0.d r18) {
                    /*
                        Method dump skipped, instructions count: 298
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends LeaderboardEntry>> flowCollector, qm0.d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        });
        this.uiState = FlowKt.flowOn(FlowKt.onStart(new Flow<UiState>() { // from class: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ LeaderboardWeekViewModel this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2$2", f = "LeaderboardWeekPage.kt", l = {227, 223}, m = "emit")
                /* renamed from: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(qm0.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LeaderboardWeekViewModel leaderboardWeekViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = leaderboardWeekViewModel;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
                    if (r10 == null) goto L19;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
                /* JADX WARN: Type inference failed for: r10v12, types: [com.withings.leaderboard.ui.UiState$Leaderboard] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2$2$1 r0 = (com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2$2$1 r0 = new com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L40
                        if (r2 == r5) goto L34
                        if (r2 != r4) goto L2c
                        nm0.l.b(r10)
                        goto Lad
                    L2c:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L34:
                        java.lang.Object r9 = r0.L$1
                        java.util.List r9 = (java.util.List) r9
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        nm0.l.b(r10)
                        goto L89
                    L40:
                        nm0.l.b(r10)
                        kotlinx.coroutines.flow.FlowCollector r2 = r8.$this_unsafeFlow
                        java.util.List r9 = (java.util.List) r9
                        int r10 = r9.size()
                        if (r10 >= r4) goto L50
                        com.withings.leaderboard.ui.UiState$Empty r9 = com.withings.leaderboard.ui.UiState.Empty.INSTANCE
                        goto La0
                    L50:
                        org.joda.time.DateTime r10 = new org.joda.time.DateTime
                        com.withings.leaderboard.ui.LeaderboardWeekViewModel r6 = r8.this$0
                        java.lang.String r6 = com.withings.leaderboard.ui.LeaderboardWeekViewModel.access$getWeek$p(r6)
                        r10.<init>(r6)
                        org.joda.time.DateTime r10 = r10.withDayOfWeek(r5)
                        java.lang.String r6 = "withDayOfWeek(...)"
                        kotlin.jvm.internal.u.i(r10, r6)
                        org.joda.time.DateTime r7 = org.joda.time.DateTime.now()
                        org.joda.time.DateTime r7 = r7.withDayOfWeek(r5)
                        kotlin.jvm.internal.u.i(r7, r6)
                        boolean r10 = androidx.activity.b0.r(r10, r7)
                        if (r10 == 0) goto L77
                        r10 = r9
                        goto L78
                    L77:
                        r10 = r3
                    L78:
                        if (r10 == 0) goto L8e
                        com.withings.leaderboard.ui.LeaderboardWeekViewModel r6 = r8.this$0
                        r0.L$0 = r2
                        r0.L$1 = r9
                        r0.label = r5
                        java.lang.Object r10 = com.withings.leaderboard.ui.LeaderboardWeekViewModel.access$hackUserScoreWithLocalScore(r6, r10, r0)
                        if (r10 != r1) goto L89
                        return r1
                    L89:
                        java.util.List r10 = (java.util.List) r10
                        if (r10 == 0) goto L8e
                        goto L8f
                    L8e:
                        r10 = r9
                    L8f:
                        java.lang.Iterable r10 = (java.lang.Iterable) r10
                        com.withings.leaderboard.ui.LeaderboardWeekViewModel$uiState$lambda$4$$inlined$sortedByDescending$1 r9 = new com.withings.leaderboard.ui.LeaderboardWeekViewModel$uiState$lambda$4$$inlined$sortedByDescending$1
                        r9.<init>()
                        java.util.List r9 = kotlin.collections.x.D0(r10, r9)
                        com.withings.leaderboard.ui.UiState$Leaderboard r10 = new com.withings.leaderboard.ui.UiState$Leaderboard
                        r10.<init>(r9)
                        r9 = r10
                    La0:
                        r0.L$0 = r3
                        r0.L$1 = r3
                        r0.label = r4
                        java.lang.Object r9 = r2.emit(r9, r0)
                        if (r9 != r1) goto Lad
                        return r1
                    Lad:
                        nm0.y r9 = nm0.y.f85009a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.ui.LeaderboardWeekViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiState> flowCollector, qm0.d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        }, new LeaderboardWeekViewModel$uiState$3(null)), Dispatchers.getIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hackUserScoreWithLocalScore(java.util.List<com.withings.leaderboard.repositories.data.LeaderboardEntry> r21, qm0.d<? super java.util.List<com.withings.leaderboard.repositories.data.LeaderboardEntry>> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.withings.leaderboard.ui.LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1
            if (r2 == 0) goto L17
            r2 = r1
            com.withings.leaderboard.ui.LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1 r2 = (com.withings.leaderboard.ui.LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.withings.leaderboard.ui.LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1 r2 = new com.withings.leaderboard.ui.LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r3 = r2.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r2.L$0
            com.withings.leaderboard.ui.LeaderboardWeekViewModel r2 = (com.withings.leaderboard.ui.LeaderboardWeekViewModel) r2
            nm0.l.b(r1)
            goto L51
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            nm0.l.b(r1)
            r70.c r1 = r0.userRepository
            r2.L$0 = r0
            r4 = r21
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r1 = r70.d.e(r1, r2)
            if (r1 != r3) goto L4f
            return r3
        L4f:
            r2 = r0
            r3 = r4
        L51:
            com.withings.user.core.models.User r1 = (com.withings.user.core.models.User) r1
            if (r1 == 0) goto Lc7
            long r4 = r1.getId()
            java.util.Iterator r1 = r3.iterator()
            r6 = 0
            r7 = r6
        L5f:
            boolean r8 = r1.hasNext()
            r9 = -1
            if (r8 == 0) goto L78
            java.lang.Object r8 = r1.next()
            com.withings.leaderboard.repositories.data.LeaderboardEntry r8 = (com.withings.leaderboard.repositories.data.LeaderboardEntry) r8
            long r10 = r8.getUserid()
            int r8 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r8 != 0) goto L75
            goto L79
        L75:
            int r7 = r7 + 1
            goto L5f
        L78:
            r7 = r9
        L79:
            if (r7 != r9) goto L7c
            return r3
        L7c:
            java.lang.Object r1 = r3.get(r7)
            r8 = r1
            com.withings.leaderboard.repositories.data.LeaderboardEntry r8 = (com.withings.leaderboard.repositories.data.LeaderboardEntry) r8
            com.withings.core.data.aggregate.ActivityAggregateManager r1 = r2.activityAggregateManager
            org.joda.time.DateTime r2 = org.joda.time.DateTime.now()
            java.lang.String r9 = "now(...)"
            kotlin.jvm.internal.u.i(r2, r9)
            java.util.List r1 = r1.getAggregatesForWeek(r4, r2)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.ArrayList r2 = kotlin.collections.x.S0(r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r13 = r6
        L9f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r1.next()
            com.withings.core.data.aggregate.ActivityAggregate r3 = (com.withings.core.data.aggregate.ActivityAggregate) r3
            int r3 = r3.getSteps()
            int r13 = r13 + r3
            goto L9f
        Lb1:
            r16 = 0
            r17 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r18 = 247(0xf7, float:3.46E-43)
            r19 = 0
            com.withings.leaderboard.repositories.data.LeaderboardEntry r1 = com.withings.leaderboard.repositories.data.LeaderboardEntry.copy$default(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            r2.set(r7, r1)
            return r2
        Lc7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.ui.LeaderboardWeekViewModel.hackUserScoreWithLocalScore(java.util.List, qm0.d):java.lang.Object");
    }

    public final Flow<UiState> getUiState$leaderboard_release() {
        return this.uiState;
    }
}
