package com.withings.leaderboard.domain;

import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.ui.screen.LeaderBoardUiEntry;
import com.withings.leaderboard.utils.FilterLeaderBoardEntryUseCase;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import m70.i;
import nm0.y;
import qm0.d;
/* compiled from: GetLeaderBoardItemUseCase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/withings/leaderboard/domain/GetLeaderBoardItemUseCase;", "", "", "date", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/withings/leaderboard/ui/screen/LeaderBoardUiEntry;", "invoke", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/withings/leaderboard/domain/LeaderboardManager;", "leaderboardManager", "Lcom/withings/leaderboard/domain/LeaderboardManager;", "Lm70/i;", "userManager", "Lm70/i;", "Lcom/withings/leaderboard/utils/FilterLeaderBoardEntryUseCase;", "filterLeaderBoardEntryUseCase", "Lcom/withings/leaderboard/utils/FilterLeaderBoardEntryUseCase;", "<init>", "(Lcom/withings/leaderboard/domain/LeaderboardManager;Lm70/i;Lcom/withings/leaderboard/utils/FilterLeaderBoardEntryUseCase;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetLeaderBoardItemUseCase {
    public static final int $stable = 8;
    private final FilterLeaderBoardEntryUseCase filterLeaderBoardEntryUseCase;
    private final LeaderboardManager leaderboardManager;
    private final i userManager;

    @Inject
    public GetLeaderBoardItemUseCase(LeaderboardManager leaderboardManager, i userManager, FilterLeaderBoardEntryUseCase filterLeaderBoardEntryUseCase) {
        u.j(leaderboardManager, "leaderboardManager");
        u.j(userManager, "userManager");
        u.j(filterLeaderBoardEntryUseCase, "filterLeaderBoardEntryUseCase");
        this.leaderboardManager = leaderboardManager;
        this.userManager = userManager;
        this.filterLeaderBoardEntryUseCase = filterLeaderBoardEntryUseCase;
    }

    public final Flow<List<LeaderBoardUiEntry>> invoke(final String date) {
        u.j(date, "date");
        final Flow<List<LeaderboardEntry>> leaderboardFlow = this.leaderboardManager.getLeaderboardFlow(date);
        return FlowKt.distinctUntilChanged(FlowKt.flowOn(FlowKt.onStart(new Flow<List<? extends LeaderBoardUiEntry>>() { // from class: com.withings.leaderboard.domain.GetLeaderBoardItemUseCase$invoke$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.leaderboard.domain.GetLeaderBoardItemUseCase$invoke$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $date$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ GetLeaderBoardItemUseCase this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.leaderboard.domain.GetLeaderBoardItemUseCase$invoke$$inlined$map$1$2", f = "GetLeaderBoardItemUseCase.kt", l = {226, 223}, m = "emit")
                /* renamed from: com.withings.leaderboard.domain.GetLeaderBoardItemUseCase$invoke$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    Object L$1;
                    Object L$2;
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

                public AnonymousClass2(FlowCollector flowCollector, GetLeaderBoardItemUseCase getLeaderBoardItemUseCase, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = getLeaderBoardItemUseCase;
                    this.$date$inlined = str;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(14:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:42|43|(1:45)(1:46))|19|(3:22|(3:24|(2:26|27)(2:29|30)|28)(3:31|32|33)|20)|34|35|36|(1:38)|39|(1:41)|12|13))|49|6|7|(0)(0)|19|(1:20)|34|35|36|(0)|39|(0)|12|13) */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
                    r0 = nm0.l.a(r0);
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:16:0x0044, B:25:0x0072, B:26:0x0084, B:28:0x008a, B:30:0x0092, B:34:0x00af, B:35:0x00e0, B:36:0x00e3, B:37:0x00e4, B:21:0x0054), top: B:48:0x0025 }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r22, qm0.d r23) {
                    /*
                        Method dump skipped, instructions count: 262
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.domain.GetLeaderBoardItemUseCase$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends LeaderBoardUiEntry>> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, date), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        }, new GetLeaderBoardItemUseCase$invoke$2(null)), Dispatchers.getIO()));
    }
}
