package com.withings.account.network.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/account/network/ws/SessionRetrofit1Api;", "Lnm0/y;", "invoke", "(Lcom/withings/account/network/ws/SessionRetrofit1Api;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$logout$2 extends w implements l<SessionRetrofit1Api, y> {
    final /* synthetic */ String $authProvider;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $uuid;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$logout$2(String str, String str2, String str3) {
        super(1);
        this.$sessionId = str;
        this.$authProvider = str2;
        this.$uuid = str3;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(SessionRetrofit1Api sessionRetrofit1Api) {
        invoke2(sessionRetrofit1Api);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SessionRetrofit1Api withApi) {
        u.j(withApi, "$this$withApi");
        withApi.logout(this.$sessionId, this.$authProvider, this.$uuid);
    }
}
