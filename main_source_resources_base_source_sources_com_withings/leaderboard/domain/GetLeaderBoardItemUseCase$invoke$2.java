package com.withings.leaderboard.domain;

import com.withings.leaderboard.ui.screen.LeaderBoardUiEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetLeaderBoardItemUseCase.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/withings/leaderboard/ui/screen/LeaderBoardUiEntry;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.domain.GetLeaderBoardItemUseCase$invoke$2", f = "GetLeaderBoardItemUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class GetLeaderBoardItemUseCase$invoke$2 extends i implements p<FlowCollector<? super List<? extends LeaderBoardUiEntry>>, d<? super y>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetLeaderBoardItemUseCase$invoke$2(d<? super GetLeaderBoardItemUseCase$invoke$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetLeaderBoardItemUseCase$invoke$2(dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends LeaderBoardUiEntry>> flowCollector, d<? super y> dVar) {
        return invoke2((FlowCollector<? super List<LeaderBoardUiEntry>>) flowCollector, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<LeaderBoardUiEntry>> flowCollector, d<? super y> dVar) {
        return ((GetLeaderBoardItemUseCase$invoke$2) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
    }
}
