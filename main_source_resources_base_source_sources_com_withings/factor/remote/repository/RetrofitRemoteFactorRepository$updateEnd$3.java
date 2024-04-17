package com.withings.factor.remote.repository;

import com.withings.factor.remote.repository.api.FactorRetrofit2Api;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitRemoteFactorRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/factor/remote/repository/api/FactorRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/factor/remote/repository/api/FactorRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$updateEnd$3", f = "RetrofitRemoteFactorRepository.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitRemoteFactorRepository$updateEnd$3 extends i implements p<FactorRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ long $endDateInSeconds;
    final /* synthetic */ long $factorId;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRemoteFactorRepository$updateEnd$3(long j5, long j11, long j12, d<? super RetrofitRemoteFactorRepository$updateEnd$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$factorId = j11;
        this.$endDateInSeconds = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitRemoteFactorRepository$updateEnd$3 retrofitRemoteFactorRepository$updateEnd$3 = new RetrofitRemoteFactorRepository$updateEnd$3(this.$userId, this.$factorId, this.$endDateInSeconds, dVar);
        retrofitRemoteFactorRepository$updateEnd$3.L$0 = obj;
        return retrofitRemoteFactorRepository$updateEnd$3;
    }

    @Override // ym0.p
    public final Object invoke(FactorRetrofit2Api factorRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitRemoteFactorRepository$updateEnd$3) create(factorRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            FactorRetrofit2Api factorRetrofit2Api = (FactorRetrofit2Api) this.L$0;
            long j5 = this.$userId;
            long j11 = this.$factorId;
            Long l5 = new Long(this.$endDateInSeconds);
            this.label = 1;
            if (factorRetrofit2Api.updateEnd(j5, j11, l5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
