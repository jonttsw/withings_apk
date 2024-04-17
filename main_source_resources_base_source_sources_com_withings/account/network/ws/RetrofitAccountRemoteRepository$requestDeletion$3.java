package com.withings.account.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/RequestDeletionResponse;", "Lcom/withings/account/network/ws/AccountRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitAccountRemoteRepository$requestDeletion$3", f = "RetrofitAccountRemoteRepository.kt", l = {476}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$requestDeletion$3 extends i implements p<AccountRetrofit2Api, d<? super RequestDeletionResponse>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetrofitAccountRemoteRepository$requestDeletion$3(d<? super RetrofitAccountRemoteRepository$requestDeletion$3> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitAccountRemoteRepository$requestDeletion$3 retrofitAccountRemoteRepository$requestDeletion$3 = new RetrofitAccountRemoteRepository$requestDeletion$3(dVar);
        retrofitAccountRemoteRepository$requestDeletion$3.L$0 = obj;
        return retrofitAccountRemoteRepository$requestDeletion$3;
    }

    @Override // ym0.p
    public final Object invoke(AccountRetrofit2Api accountRetrofit2Api, d<? super RequestDeletionResponse> dVar) {
        return ((RetrofitAccountRemoteRepository$requestDeletion$3) create(accountRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            obj = ((AccountRetrofit2Api) this.L$0).requestDeletion(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
