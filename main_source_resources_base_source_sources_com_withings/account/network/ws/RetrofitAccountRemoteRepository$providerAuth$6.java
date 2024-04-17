package com.withings.account.network.ws;

import com.withings.account.models.AccountPrefEntity;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/AccountUser;", "Lcom/withings/account/network/ws/AccountRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitAccountRemoteRepository$providerAuth$6", f = "RetrofitAccountRemoteRepository.kt", l = {458}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$providerAuth$6 extends i implements p<AccountRetrofit2Api, d<? super AccountUser>, Object> {
    final /* synthetic */ int $duration;
    final /* synthetic */ String $jwt;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $typeName;
    final /* synthetic */ String $uuid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitAccountRemoteRepository$providerAuth$6(String str, String str2, int i11, String str3, String str4, String str5, String str6, d<? super RetrofitAccountRemoteRepository$providerAuth$6> dVar) {
        super(2, dVar);
        this.$jwt = str;
        this.$uuid = str2;
        this.$duration = i11;
        this.$modelName = str3;
        this.$typeName = str4;
        this.$os = str5;
        this.$osVersion = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitAccountRemoteRepository$providerAuth$6 retrofitAccountRemoteRepository$providerAuth$6 = new RetrofitAccountRemoteRepository$providerAuth$6(this.$jwt, this.$uuid, this.$duration, this.$modelName, this.$typeName, this.$os, this.$osVersion, dVar);
        retrofitAccountRemoteRepository$providerAuth$6.L$0 = obj;
        return retrofitAccountRemoteRepository$providerAuth$6;
    }

    @Override // ym0.p
    public final Object invoke(AccountRetrofit2Api accountRetrofit2Api, d<? super AccountUser> dVar) {
        return ((RetrofitAccountRemoteRepository$providerAuth$6) create(accountRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$jwt;
            String str2 = this.$uuid;
            int i12 = this.$duration;
            String str3 = this.$modelName;
            String str4 = this.$typeName;
            String str5 = this.$os;
            String str6 = this.$osVersion;
            this.label = 1;
            obj = ((AccountRetrofit2Api) this.L$0).providerAuth(str, str2, i12, AccountPrefEntity.PROVIDER_WITHINGS, str3, str4, str5, str6, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
