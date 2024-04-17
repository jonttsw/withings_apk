package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.session.AccountSession;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "Lcom/withings/account/network/ws/SessionRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$loginFromAuthProvider$2 extends w implements l<SessionRetrofit1Api, AccountSession> {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$loginFromAuthProvider$2(String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8, String str9, String str10) {
        super(1);
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

    @Override // ym0.l
    public final AccountSession invoke(SessionRetrofit1Api withApi) {
        u.j(withApi, "$this$withApi");
        return withApi.loginFromAuthProvider(this.$email, this.$authProvider, this.$authToken, this.$providerToken, this.$appUUID, this.$token, this.$duration, this.$modelName, this.$typeName, this.$os, this.$osVersion);
    }
}
