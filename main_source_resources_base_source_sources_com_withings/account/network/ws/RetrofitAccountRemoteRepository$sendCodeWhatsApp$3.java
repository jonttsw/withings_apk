package com.withings.account.network.ws;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/account/network/ws/AccountRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/account/network/ws/AccountRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.account.network.ws.RetrofitAccountRemoteRepository$sendCodeWhatsApp$3", f = "RetrofitAccountRemoteRepository.kt", l = {ConstantsWs.WS_STATUS_TOOMANYPUBLICKEYS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$sendCodeWhatsApp$3 extends i implements p<AccountRetrofit2Api, d<? super y>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetrofitAccountRemoteRepository$sendCodeWhatsApp$3(d<? super RetrofitAccountRemoteRepository$sendCodeWhatsApp$3> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitAccountRemoteRepository$sendCodeWhatsApp$3 retrofitAccountRemoteRepository$sendCodeWhatsApp$3 = new RetrofitAccountRemoteRepository$sendCodeWhatsApp$3(dVar);
        retrofitAccountRemoteRepository$sendCodeWhatsApp$3.L$0 = obj;
        return retrofitAccountRemoteRepository$sendCodeWhatsApp$3;
    }

    @Override // ym0.p
    public final Object invoke(AccountRetrofit2Api accountRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitAccountRemoteRepository$sendCodeWhatsApp$3) create(accountRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            if (((AccountRetrofit2Api) this.L$0).sendCode(RetrofitAccountRemoteRepository.CHANNEL_WHATSAPP, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
