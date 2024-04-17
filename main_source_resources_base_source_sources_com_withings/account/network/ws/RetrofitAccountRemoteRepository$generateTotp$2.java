package com.withings.account.network.ws;

import com.withings.account.models.TotpResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/account/models/TotpResponse;", "Lcom/withings/account/network/ws/AccountRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$generateTotp$2 extends w implements l<AccountRetrofit1Api, TotpResponse> {
    public static final RetrofitAccountRemoteRepository$generateTotp$2 INSTANCE = new RetrofitAccountRemoteRepository$generateTotp$2();

    RetrofitAccountRemoteRepository$generateTotp$2() {
        super(1);
    }

    @Override // ym0.l
    public final TotpResponse invoke(AccountRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.generateTotp();
    }
}
