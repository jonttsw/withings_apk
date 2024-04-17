package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.AccountCreation;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/AccountCreation;", "Lcom/withings/account/network/ws/AccountRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitAccountRemoteRepository$createAccount$3", f = "RetrofitAccountRemoteRepository.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$createAccount$3 extends i implements p<AccountRetrofit2Api, d<? super AccountCreation>, Object> {
    final /* synthetic */ int $duration;
    final /* synthetic */ String $email;
    final /* synthetic */ String $hash;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $prefLang;
    final /* synthetic */ String $typeName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitAccountRemoteRepository$createAccount$3(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, d<? super RetrofitAccountRemoteRepository$createAccount$3> dVar) {
        super(2, dVar);
        this.$email = str;
        this.$hash = str2;
        this.$prefLang = str3;
        this.$duration = i11;
        this.$modelName = str4;
        this.$typeName = str5;
        this.$os = str6;
        this.$osVersion = str7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitAccountRemoteRepository$createAccount$3 retrofitAccountRemoteRepository$createAccount$3 = new RetrofitAccountRemoteRepository$createAccount$3(this.$email, this.$hash, this.$prefLang, this.$duration, this.$modelName, this.$typeName, this.$os, this.$osVersion, dVar);
        retrofitAccountRemoteRepository$createAccount$3.L$0 = obj;
        return retrofitAccountRemoteRepository$createAccount$3;
    }

    @Override // ym0.p
    public final Object invoke(AccountRetrofit2Api accountRetrofit2Api, d<? super AccountCreation> dVar) {
        return ((RetrofitAccountRemoteRepository$createAccount$3) create(accountRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l.b(obj);
        String str = this.$email;
        String str2 = this.$hash;
        String str3 = this.$prefLang;
        int i12 = this.$duration;
        String str4 = this.$modelName;
        String str5 = this.$typeName;
        String str6 = this.$os;
        String str7 = this.$osVersion;
        this.label = 1;
        Object createAccount = ((AccountRetrofit2Api) this.L$0).createAccount(str, str2, str3, i12, 1, 2, str4, str5, str6, str7, this);
        if (createAccount == coroutineSingletons) {
            return coroutineSingletons;
        }
        return createAccount;
    }
}
