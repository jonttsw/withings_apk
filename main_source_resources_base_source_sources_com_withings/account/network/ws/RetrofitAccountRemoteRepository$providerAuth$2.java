package com.withings.account.network.ws;

import com.withings.account.models.AccountPrefEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/AccountUser;", "Lcom/withings/account/network/ws/AccountRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$providerAuth$2 extends w implements l<AccountRetrofit1Api, AccountUser> {
    final /* synthetic */ int $duration;
    final /* synthetic */ String $email;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $osVersion;
    final /* synthetic */ String $shortCode;
    final /* synthetic */ String $typeName;
    final /* synthetic */ String $uuid;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitAccountRemoteRepository$providerAuth$2(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7) {
        super(1);
        this.$email = str;
        this.$shortCode = str2;
        this.$uuid = str3;
        this.$duration = i11;
        this.$modelName = str4;
        this.$typeName = str5;
        this.$os = str6;
        this.$osVersion = str7;
    }

    @Override // ym0.l
    public final AccountUser invoke(AccountRetrofit1Api withApi) {
        u.j(withApi, "$this$withApi");
        return withApi.providerAuth(this.$email, this.$shortCode, this.$uuid, this.$duration, AccountPrefEntity.PROVIDER_WITHINGS, this.$modelName, this.$typeName, this.$os, this.$osVersion);
    }
}
