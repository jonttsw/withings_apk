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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/AccountCreationResponse;", "Lcom/withings/account/network/ws/AccountRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitAccountRemoteRepository$createAccountWithToken$3", f = "RetrofitAccountRemoteRepository.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$createAccountWithToken$3 extends i implements p<AccountRetrofit2Api, d<? super AccountCreationResponse>, Object> {
    final /* synthetic */ String $authProvider;
    final /* synthetic */ int $duration;
    final /* synthetic */ String $email;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $prefLang;
    final /* synthetic */ String $token;
    final /* synthetic */ String $typeName;
    final /* synthetic */ String $uuid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitAccountRemoteRepository$createAccountWithToken$3(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, d<? super RetrofitAccountRemoteRepository$createAccountWithToken$3> dVar) {
        super(2, dVar);
        this.$email = str;
        this.$token = str2;
        this.$prefLang = str3;
        this.$uuid = str4;
        this.$duration = i11;
        this.$authProvider = str5;
        this.$modelName = str6;
        this.$typeName = str7;
        this.$os = str8;
        this.$osVersion = str9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitAccountRemoteRepository$createAccountWithToken$3 retrofitAccountRemoteRepository$createAccountWithToken$3 = new RetrofitAccountRemoteRepository$createAccountWithToken$3(this.$email, this.$token, this.$prefLang, this.$uuid, this.$duration, this.$authProvider, this.$modelName, this.$typeName, this.$os, this.$osVersion, dVar);
        retrofitAccountRemoteRepository$createAccountWithToken$3.L$0 = obj;
        return retrofitAccountRemoteRepository$createAccountWithToken$3;
    }

    @Override // ym0.p
    public final Object invoke(AccountRetrofit2Api accountRetrofit2Api, d<? super AccountCreationResponse> dVar) {
        return ((RetrofitAccountRemoteRepository$createAccountWithToken$3) create(accountRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
        String str2 = this.$token;
        String str3 = this.$prefLang;
        String str4 = this.$uuid;
        int i12 = this.$duration;
        String str5 = this.$authProvider;
        String str6 = this.$modelName;
        String str7 = this.$typeName;
        String str8 = this.$os;
        String str9 = this.$osVersion;
        this.label = 1;
        Object createAccountWithToken = ((AccountRetrofit2Api) this.L$0).createAccountWithToken(str, str2, str3, 1, 2, str4, i12, str5, str6, str7, str8, str9, this);
        if (createAccountWithToken == coroutineSingletons) {
            return coroutineSingletons;
        }
        return createAccountWithToken;
    }
}
