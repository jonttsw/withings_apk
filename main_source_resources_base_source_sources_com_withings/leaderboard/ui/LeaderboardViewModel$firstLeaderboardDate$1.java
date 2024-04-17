package com.withings.leaderboard.ui;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lorg/joda/time/DateTime;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.ui.LeaderboardViewModel$firstLeaderboardDate$1", f = "LeaderboardActivity.kt", l = {ConstantsWs.WS_STATUS_DEACTIVATED_DEVUSER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LeaderboardViewModel$firstLeaderboardDate$1 extends i implements p<FlowCollector<? super DateTime>, d<? super y>, Object> {
    final /* synthetic */ ActivityAggregateManager $activityAggregateManager;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardViewModel$firstLeaderboardDate$1(ActivityAggregateManager activityAggregateManager, d<? super LeaderboardViewModel$firstLeaderboardDate$1> dVar) {
        super(2, dVar);
        this.$activityAggregateManager = activityAggregateManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        LeaderboardViewModel$firstLeaderboardDate$1 leaderboardViewModel$firstLeaderboardDate$1 = new LeaderboardViewModel$firstLeaderboardDate$1(this.$activityAggregateManager, dVar);
        leaderboardViewModel$firstLeaderboardDate$1.L$0 = obj;
        return leaderboardViewModel$firstLeaderboardDate$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ActivityAggregate firstAggregate = this.$activityAggregateManager.getFirstAggregate(m70.i.b().e().q());
            if (firstAggregate != null) {
                str = firstAggregate.getDay();
            } else {
                str = null;
            }
            DateTime dateTime = new DateTime(str);
            this.label = 1;
            if (flowCollector.emit(dateTime, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super DateTime> flowCollector, d<? super y> dVar) {
        return ((LeaderboardViewModel$firstLeaderboardDate$1) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
    }
}
