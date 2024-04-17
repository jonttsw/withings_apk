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
@e(c = "com.withings.account.network.ws.RetrofitSessionRemoteRepository$login$3", f = "RetrofitSessionRemoteRepository.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$login$3 extends i implements p<SessionRetrofit2Api, d<? super AccountSession>, Object> {
    final /* synthetic */ int $duration;
    final /* synthetic */ String $email;
    final /* synthetic */ String $hash;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $passwordClear;
    final /* synthetic */ String $providerAuth;
    final /* synthetic */ String $token;
    final /* synthetic */ String $typeName;
    final /* synthetic */ String $uuid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$login$3(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, String str10, d<? super RetrofitSessionRemoteRepository$login$3> dVar) {
        super(2, dVar);
        this.$email = str;
        this.$providerAuth = str2;
        this.$hash = str3;
        this.$passwordClear = str4;
        this.$duration = i11;
        this.$uuid = str5;
        this.$token = str6;
        this.$modelName = str7;
        this.$typeName = str8;
        this.$os = str9;
        this.$osVersion = str10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSessionRemoteRepository$login$3 retrofitSessionRemoteRepository$login$3 = new RetrofitSessionRemoteRepository$login$3(this.$email, this.$providerAuth, this.$hash, this.$passwordClear, this.$duration, this.$uuid, this.$token, this.$modelName, this.$typeName, this.$os, this.$osVersion, dVar);
        retrofitSessionRemoteRepository$login$3.L$0 = obj;
        return retrofitSessionRemoteRepository$login$3;
    }

    @Override // ym0.p
    public final Object invoke(SessionRetrofit2Api sessionRetrofit2Api, d<? super AccountSession> dVar) {
        return ((RetrofitSessionRemoteRepository$login$3) create(sessionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
        String str2 = this.$providerAuth;
        String str3 = this.$hash;
        String str4 = this.$passwordClear;
        int i12 = this.$duration;
        String str5 = this.$uuid;
        String str6 = this.$token;
        String str7 = this.$modelName;
        String str8 = this.$typeName;
        String str9 = this.$os;
        String str10 = this.$osVersion;
        this.label = 1;
        Object login = ((SessionRetrofit2Api) this.L$0).login(str, str2, str3, str4, i12, str5, str6, str7, str8, str9, str10, this);
        if (login == coroutineSingletons) {
            return coroutineSingletons;
        }
        return login;
    }
}
