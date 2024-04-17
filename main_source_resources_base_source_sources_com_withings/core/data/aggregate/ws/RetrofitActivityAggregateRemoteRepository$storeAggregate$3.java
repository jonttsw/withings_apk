package com.withings.core.data.aggregate.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitActivityAggregateRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/core/data/aggregate/ws/StoreAggregateResponse;", "Lcom/withings/core/data/aggregate/ws/ActivityAggregateRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.core.data.aggregate.ws.RetrofitActivityAggregateRemoteRepository$storeAggregate$3", f = "RetrofitActivityAggregateRemoteRepository.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitActivityAggregateRemoteRepository$storeAggregate$3 extends i implements p<ActivityAggregateRetrofit2Api, d<? super StoreAggregateResponse>, Object> {
    final /* synthetic */ String $aggregateJson;
    final /* synthetic */ int $model;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitActivityAggregateRemoteRepository$storeAggregate$3(long j5, String str, int i11, d<? super RetrofitActivityAggregateRemoteRepository$storeAggregate$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$aggregateJson = str;
        this.$model = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitActivityAggregateRemoteRepository$storeAggregate$3 retrofitActivityAggregateRemoteRepository$storeAggregate$3 = new RetrofitActivityAggregateRemoteRepository$storeAggregate$3(this.$userId, this.$aggregateJson, this.$model, dVar);
        retrofitActivityAggregateRemoteRepository$storeAggregate$3.L$0 = obj;
        return retrofitActivityAggregateRemoteRepository$storeAggregate$3;
    }

    @Override // ym0.p
    public final Object invoke(ActivityAggregateRetrofit2Api activityAggregateRetrofit2Api, d<? super StoreAggregateResponse> dVar) {
        return ((RetrofitActivityAggregateRemoteRepository$storeAggregate$3) create(activityAggregateRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$aggregateJson;
            int i12 = this.$model;
            this.label = 1;
            obj = ((ActivityAggregateRetrofit2Api) this.L$0).storeAggregate(j5, str, i12, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
