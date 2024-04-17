package com.withings.manualLogging.data.webservice.healthAttribute;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitHealthAttributeRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.manualLogging.data.webservice.healthAttribute.RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3", f = "RetrofitHealthAttributeRemoteRepository.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3 extends i implements p<HealthAttributeRetrofit2Api, d<? super GetHealthAttributeResponse>, Object> {
    final /* synthetic */ Long $lastUpdate;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3(long j5, Long l5, int i11, d<? super RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$lastUpdate = l5;
        this.$offset = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3 retrofitHealthAttributeRemoteRepository$getUsersMedicines$3 = new RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3(this.$userId, this.$lastUpdate, this.$offset, dVar);
        retrofitHealthAttributeRemoteRepository$getUsersMedicines$3.L$0 = obj;
        return retrofitHealthAttributeRemoteRepository$getUsersMedicines$3;
    }

    @Override // ym0.p
    public final Object invoke(HealthAttributeRetrofit2Api healthAttributeRetrofit2Api, d<? super GetHealthAttributeResponse> dVar) {
        return ((RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3) create(healthAttributeRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            Long l5 = this.$lastUpdate;
            int i12 = this.$offset;
            this.label = 1;
            obj = ((HealthAttributeRetrofit2Api) this.L$0).getUsersMedicines(j5, l5, i12, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
