package com.withings.account.network.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/RenewResponse;", "Lcom/withings/account/network/ws/SessionRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$renewWithTotp$2 extends w implements l<SessionRetrofit1Api, RenewResponse> {
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $totpCode;
    final /* synthetic */ String $typeName;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$renewWithTotp$2(String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.$sessionId = str;
        this.$totpCode = str2;
        this.$modelName = str3;
        this.$typeName = str4;
        this.$os = str5;
    }

    @Override // ym0.l
    public final RenewResponse invoke(SessionRetrofit1Api withApi) {
        u.j(withApi, "$this$withApi");
        return withApi.renewWithTotp(this.$sessionId, this.$totpCode, false, this.$modelName, this.$typeName, this.$os);
    }
}
