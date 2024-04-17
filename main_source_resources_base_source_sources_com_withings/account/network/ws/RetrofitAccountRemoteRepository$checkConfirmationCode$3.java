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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/account/network/ws/AccountRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/account/network/ws/AccountRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.account.network.ws.RetrofitAccountRemoteRepository$checkConfirmationCode$3", f = "RetrofitAccountRemoteRepository.kt", l = {376}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$checkConfirmationCode$3 extends i implements p<AccountRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $token;
    final /* synthetic */ String $typeName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitAccountRemoteRepository$checkConfirmationCode$3(String str, String str2, String str3, String str4, String str5, String str6, d<? super RetrofitAccountRemoteRepository$checkConfirmationCode$3> dVar) {
        super(2, dVar);
        this.$code = str;
        this.$token = str2;
        this.$modelName = str3;
        this.$typeName = str4;
        this.$os = str5;
        this.$osVersion = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitAccountRemoteRepository$checkConfirmationCode$3 retrofitAccountRemoteRepository$checkConfirmationCode$3 = new RetrofitAccountRemoteRepository$checkConfirmationCode$3(this.$code, this.$token, this.$modelName, this.$typeName, this.$os, this.$osVersion, dVar);
        retrofitAccountRemoteRepository$checkConfirmationCode$3.L$0 = obj;
        return retrofitAccountRemoteRepository$checkConfirmationCode$3;
    }

    @Override // ym0.p
    public final Object invoke(AccountRetrofit2Api accountRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitAccountRemoteRepository$checkConfirmationCode$3) create(accountRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$code;
            String str2 = this.$token;
            String str3 = this.$modelName;
            String str4 = this.$typeName;
            String str5 = this.$os;
            String str6 = this.$osVersion;
            this.label = 1;
            if (((AccountRetrofit2Api) this.L$0).checkConfirmationCode(str, str2, str3, str4, str5, str6, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
