package com.withings.account.network.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/account/network/ws/AccountRetrofit1Api;", "Lnm0/y;", "invoke", "(Lcom/withings/account/network/ws/AccountRetrofit1Api;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class RetrofitAccountRemoteRepository$deleteTotp$2 extends w implements l<AccountRetrofit1Api, y> {
    public static final RetrofitAccountRemoteRepository$deleteTotp$2 INSTANCE = new RetrofitAccountRemoteRepository$deleteTotp$2();

    RetrofitAccountRemoteRepository$deleteTotp$2() {
        super(1);
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(AccountRetrofit1Api accountRetrofit1Api) {
        invoke2(accountRetrofit1Api);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AccountRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        withApiForAccount.deleteTotp();
    }
}
