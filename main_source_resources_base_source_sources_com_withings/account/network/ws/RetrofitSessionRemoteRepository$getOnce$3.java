package com.withings.account.network.ws;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.withings.model.Once;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/Once;", "Lcom/withings/account/network/ws/SessionRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitSessionRemoteRepository$getOnce$3", f = "RetrofitSessionRemoteRepository.kt", l = {ConstantsWs.WS_STATUS_WRONGTZNAME}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$getOnce$3 extends i implements p<SessionRetrofit2Api, d<? super Once>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetrofitSessionRemoteRepository$getOnce$3(d<? super RetrofitSessionRemoteRepository$getOnce$3> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSessionRemoteRepository$getOnce$3 retrofitSessionRemoteRepository$getOnce$3 = new RetrofitSessionRemoteRepository$getOnce$3(dVar);
        retrofitSessionRemoteRepository$getOnce$3.L$0 = obj;
        return retrofitSessionRemoteRepository$getOnce$3;
    }

    @Override // ym0.p
    public final Object invoke(SessionRetrofit2Api sessionRetrofit2Api, d<? super Once> dVar) {
        return ((RetrofitSessionRemoteRepository$getOnce$3) create(sessionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            this.label = 1;
            obj = ((SessionRetrofit2Api) this.L$0).getOnce(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
