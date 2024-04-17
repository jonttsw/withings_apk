package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.session.AccountSession;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "Lcom/withings/account/network/ws/SessionRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitSessionRemoteRepository$loginFromAuthProvider$3", f = "RetrofitSessionRemoteRepository.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$loginFromAuthProvider$3 extends i implements p<SessionRetrofit2Api, d<? super AccountSession>, Object> {
    final /* synthetic */ String $appUUID;
    final /* synthetic */ String $authProvider;
    final /* synthetic */ String $authToken;
    final /* synthetic */ int $duration;
    final /* synthetic */ String $email;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $providerToken;
    final /* synthetic */ String $token;
    final /* synthetic */ String $typeName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$loginFromAuthProvider$3(String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8, String str9, String str10, d<? super RetrofitSessionRemoteRepository$loginFromAuthProvider$3> dVar) {
        super(2, dVar);
        this.$email = str;
        this.$authProvider = str2;
        this.$authToken = str3;
        this.$providerToken = str4;
        this.$appUUID = str5;
        this.$token = str6;
        this.$duration = i11;
        this.$modelName = str7;
        this.$typeName = str8;
        this.$os = str9;
        this.$osVersion = str10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSessionRemoteRepository$loginFromAuthProvider$3 retrofitSessionRemoteRepository$loginFromAuthProvider$3 = new RetrofitSessionRemoteRepository$loginFromAuthProvider$3(this.$email, this.$authProvider, this.$authToken, this.$providerToken, this.$appUUID, this.$token, this.$duration, this.$modelName, this.$typeName, this.$os, this.$osVersion, dVar);
        retrofitSessionRemoteRepository$loginFromAuthProvider$3.L$0 = obj;
        return retrofitSessionRemoteRepository$loginFromAuthProvider$3;
    }

    @Override // ym0.p
    public final Object invoke(SessionRetrofit2Api sessionRetrofit2Api, d<? super AccountSession> dVar) {
        return ((RetrofitSessionRemoteRepository$loginFromAuthProvider$3) create(sessionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
        String str2 = this.$authProvider;
        String str3 = this.$authToken;
        String str4 = this.$providerToken;
        String str5 = this.$appUUID;
        String str6 = this.$token;
        int i12 = this.$duration;
        String str7 = this.$modelName;
        String str8 = this.$typeName;
        String str9 = this.$os;
        String str10 = this.$osVersion;
        this.label = 1;
        Object loginFromAuthProvider = ((SessionRetrofit2Api) this.L$0).loginFromAuthProvider(str, str2, str3, str4, str5, str6, i12, str7, str8, str9, str10, this);
        if (loginFromAuthProvider == coroutineSingletons) {
            return coroutineSingletons;
        }
        return loginFromAuthProvider;
    }
}
