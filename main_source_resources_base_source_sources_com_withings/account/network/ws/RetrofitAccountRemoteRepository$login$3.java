package com.withings.account.network.ws;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "Lcom/withings/account/network/ws/AccountRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitAccountRemoteRepository$login$3", f = "RetrofitAccountRemoteRepository.kt", l = {ConstantsWs.WS_STATUS_SHARINGGETERROR}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$login$3 extends i implements p<AccountRetrofit2Api, d<? super AccountSession>, Object> {
    final /* synthetic */ String $authProvider;
    final /* synthetic */ String $clientId;
    final /* synthetic */ int $duration;
    final /* synthetic */ String $idToken;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $typeName;
    final /* synthetic */ String $uuid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitAccountRemoteRepository$login$3(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, String str8, d<? super RetrofitAccountRemoteRepository$login$3> dVar) {
        super(2, dVar);
        this.$authProvider = str;
        this.$idToken = str2;
        this.$uuid = str3;
        this.$duration = i11;
        this.$clientId = str4;
        this.$modelName = str5;
        this.$typeName = str6;
        this.$os = str7;
        this.$osVersion = str8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitAccountRemoteRepository$login$3 retrofitAccountRemoteRepository$login$3 = new RetrofitAccountRemoteRepository$login$3(this.$authProvider, this.$idToken, this.$uuid, this.$duration, this.$clientId, this.$modelName, this.$typeName, this.$os, this.$osVersion, dVar);
        retrofitAccountRemoteRepository$login$3.L$0 = obj;
        return retrofitAccountRemoteRepository$login$3;
    }

    @Override // ym0.p
    public final Object invoke(AccountRetrofit2Api accountRetrofit2Api, d<? super AccountSession> dVar) {
        return ((RetrofitAccountRemoteRepository$login$3) create(accountRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$authProvider;
            String str2 = this.$idToken;
            String str3 = this.$uuid;
            int i12 = this.$duration;
            String str4 = this.$clientId;
            String str5 = this.$modelName;
            String str6 = this.$typeName;
            String str7 = this.$os;
            String str8 = this.$osVersion;
            this.label = 1;
            obj = ((AccountRetrofit2Api) this.L$0).login(str, str2, str3, i12, str4, str5, str6, str7, str8, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
