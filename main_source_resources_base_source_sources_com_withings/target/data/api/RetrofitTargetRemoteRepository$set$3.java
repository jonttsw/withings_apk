package com.withings.target.data.api;

import com.withings.target.data.api.model.TargetSeriesWS;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitTargetRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/target/data/api/model/TargetSeriesWS;", "Lcom/withings/target/data/api/TargetRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.data.api.RetrofitTargetRemoteRepository$set$3", f = "RetrofitTargetRemoteRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitTargetRemoteRepository$set$3 extends i implements p<TargetRetrofit2Api, d<? super TargetSeriesWS>, Object> {
    final /* synthetic */ String $targets;
    final /* synthetic */ long $userid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTargetRemoteRepository$set$3(long j5, String str, d<? super RetrofitTargetRemoteRepository$set$3> dVar) {
        super(2, dVar);
        this.$userid = j5;
        this.$targets = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitTargetRemoteRepository$set$3 retrofitTargetRemoteRepository$set$3 = new RetrofitTargetRemoteRepository$set$3(this.$userid, this.$targets, dVar);
        retrofitTargetRemoteRepository$set$3.L$0 = obj;
        return retrofitTargetRemoteRepository$set$3;
    }

    @Override // ym0.p
    public final Object invoke(TargetRetrofit2Api targetRetrofit2Api, d<? super TargetSeriesWS> dVar) {
        return ((RetrofitTargetRemoteRepository$set$3) create(targetRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$userid;
            String str = this.$targets;
            this.label = 1;
            obj = ((TargetRetrofit2Api) this.L$0).set(j5, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
