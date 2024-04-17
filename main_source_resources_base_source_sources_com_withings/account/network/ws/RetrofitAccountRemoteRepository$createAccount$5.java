package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.session.AccountSession;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "Lcom/withings/account/network/ws/AccountRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$createAccount$5 extends w implements l<AccountRetrofit1Api, AccountSession> {
    final /* synthetic */ String $authProvider;
    final /* synthetic */ String $clientId;
    final /* synthetic */ int $duration;
    final /* synthetic */ String $idToken;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $prefLang;
    final /* synthetic */ String $typeName;
    final /* synthetic */ String $uuid;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitAccountRemoteRepository$createAccount$5(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9) {
        super(1);
        this.$authProvider = str;
        this.$idToken = str2;
        this.$uuid = str3;
        this.$clientId = str4;
        this.$duration = i11;
        this.$prefLang = str5;
        this.$modelName = str6;
        this.$typeName = str7;
        this.$os = str8;
        this.$osVersion = str9;
    }

    @Override // ym0.l
    public final AccountSession invoke(AccountRetrofit1Api withApi) {
        u.j(withApi, "$this$withApi");
        return withApi.createAccount(this.$authProvider, this.$idToken, this.$uuid, this.$clientId, this.$duration, 2, 1, this.$prefLang, this.$modelName, this.$typeName, this.$os, this.$osVersion);
    }
}
