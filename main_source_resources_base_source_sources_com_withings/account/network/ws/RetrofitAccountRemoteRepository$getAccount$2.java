package com.withings.account.network.ws;

import com.withings.account.network.ws.WsAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/WsAccount$Response;", "Lcom/withings/account/network/ws/AccountRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$getAccount$2 extends w implements l<AccountRetrofit1Api, WsAccount.Response> {
    public static final RetrofitAccountRemoteRepository$getAccount$2 INSTANCE = new RetrofitAccountRemoteRepository$getAccount$2();

    RetrofitAccountRemoteRepository$getAccount$2() {
        super(1);
    }

    @Override // ym0.l
    public final WsAccount.Response invoke(AccountRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getAccount(20);
    }
}
