package com.withings.leaderboard.ui;

import com.withings.leaderboard.ui.UiState;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withings/leaderboard/ui/UiState;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.ui.LeaderboardWeekViewModel$uiState$3", f = "LeaderboardWeekPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LeaderboardWeekViewModel$uiState$3 extends i implements p<FlowCollector<? super UiState>, d<? super y>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LeaderboardWeekViewModel$uiState$3(d<? super LeaderboardWeekViewModel$uiState$3> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LeaderboardWeekViewModel$uiState$3(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            UiState.Loading loading = UiState.Loading.INSTANCE;
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super UiState> flowCollector, d<? super y> dVar) {
        return ((LeaderboardWeekViewModel$uiState$3) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
    }
}
