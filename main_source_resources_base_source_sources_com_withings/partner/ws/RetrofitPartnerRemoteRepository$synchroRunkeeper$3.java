package com.withings.partner.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitPartnerRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/partner/ws/PartnerRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/partner/ws/PartnerRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.partner.ws.RetrofitPartnerRemoteRepository$synchroRunkeeper$3", f = "RetrofitPartnerRemoteRepository.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitPartnerRemoteRepository$synchroRunkeeper$3 extends i implements p<PartnerRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitPartnerRemoteRepository$synchroRunkeeper$3(long j5, d<? super RetrofitPartnerRemoteRepository$synchroRunkeeper$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitPartnerRemoteRepository$synchroRunkeeper$3 retrofitPartnerRemoteRepository$synchroRunkeeper$3 = new RetrofitPartnerRemoteRepository$synchroRunkeeper$3(this.$userId, dVar);
        retrofitPartnerRemoteRepository$synchroRunkeeper$3.L$0 = obj;
        return retrofitPartnerRemoteRepository$synchroRunkeeper$3;
    }

    @Override // ym0.p
    public final Object invoke(PartnerRetrofit2Api partnerRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitPartnerRemoteRepository$synchroRunkeeper$3) create(partnerRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            this.label = 1;
            if (((PartnerRetrofit2Api) this.L$0).synchroRunkeeper(j5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
