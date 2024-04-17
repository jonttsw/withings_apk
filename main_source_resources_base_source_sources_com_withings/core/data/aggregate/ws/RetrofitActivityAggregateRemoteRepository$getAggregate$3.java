package com.withings.core.data.aggregate.ws;

import com.withings.core.data.aggregate.ws.WsAggregate;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitActivityAggregateRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/core/data/aggregate/ws/WsAggregate$Response;", "Lcom/withings/core/data/aggregate/ws/ActivityAggregateRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.core.data.aggregate.ws.RetrofitActivityAggregateRemoteRepository$getAggregate$3", f = "RetrofitActivityAggregateRemoteRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitActivityAggregateRemoteRepository$getAggregate$3 extends i implements p<ActivityAggregateRetrofit2Api, d<? super WsAggregate.Response>, Object> {
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitActivityAggregateRemoteRepository$getAggregate$3(long j5, long j11, int i11, d<? super RetrofitActivityAggregateRemoteRepository$getAggregate$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$lastUpdate = j11;
        this.$offset = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitActivityAggregateRemoteRepository$getAggregate$3 retrofitActivityAggregateRemoteRepository$getAggregate$3 = new RetrofitActivityAggregateRemoteRepository$getAggregate$3(this.$userId, this.$lastUpdate, this.$offset, dVar);
        retrofitActivityAggregateRemoteRepository$getAggregate$3.L$0 = obj;
        return retrofitActivityAggregateRemoteRepository$getAggregate$3;
    }

    @Override // ym0.p
    public final Object invoke(ActivityAggregateRetrofit2Api activityAggregateRetrofit2Api, d<? super WsAggregate.Response> dVar) {
        return ((RetrofitActivityAggregateRemoteRepository$getAggregate$3) create(activityAggregateRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            long j5 = this.$userId;
            long j11 = this.$lastUpdate;
            int i12 = this.$offset;
            this.label = 1;
            obj = ((ActivityAggregateRetrofit2Api) this.L$0).getAggregate(j5, j11, i12, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
