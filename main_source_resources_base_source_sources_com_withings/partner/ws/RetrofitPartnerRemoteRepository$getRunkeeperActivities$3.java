package com.withings.partner.ws;

import com.withings.partner.ws.model.RunkeeperActivities;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitPartnerRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/partner/ws/model/RunkeeperActivities;", "Lcom/withings/partner/ws/PartnerRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.partner.ws.RetrofitPartnerRemoteRepository$getRunkeeperActivities$3", f = "RetrofitPartnerRemoteRepository.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitPartnerRemoteRepository$getRunkeeperActivities$3 extends i implements p<PartnerRetrofit2Api, d<? super RunkeeperActivities>, Object> {
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitPartnerRemoteRepository$getRunkeeperActivities$3(long j5, long j11, d<? super RetrofitPartnerRemoteRepository$getRunkeeperActivities$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$lastUpdate = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitPartnerRemoteRepository$getRunkeeperActivities$3 retrofitPartnerRemoteRepository$getRunkeeperActivities$3 = new RetrofitPartnerRemoteRepository$getRunkeeperActivities$3(this.$userId, this.$lastUpdate, dVar);
        retrofitPartnerRemoteRepository$getRunkeeperActivities$3.L$0 = obj;
        return retrofitPartnerRemoteRepository$getRunkeeperActivities$3;
    }

    @Override // ym0.p
    public final Object invoke(PartnerRetrofit2Api partnerRetrofit2Api, d<? super RunkeeperActivities> dVar) {
        return ((RetrofitPartnerRemoteRepository$getRunkeeperActivities$3) create(partnerRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            this.label = 1;
            obj = ((PartnerRetrofit2Api) this.L$0).getRunkeeperActivities(j5, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
