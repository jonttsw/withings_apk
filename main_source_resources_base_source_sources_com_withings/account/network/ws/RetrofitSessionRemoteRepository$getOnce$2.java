package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.Once;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/Once;", "Lcom/withings/account/network/ws/SessionRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$getOnce$2 extends w implements l<SessionRetrofit1Api, Once> {
    public static final RetrofitSessionRemoteRepository$getOnce$2 INSTANCE = new RetrofitSessionRemoteRepository$getOnce$2();

    RetrofitSessionRemoteRepository$getOnce$2() {
        super(1);
    }

    @Override // ym0.l
    public final Once invoke(SessionRetrofit1Api withApi) {
        u.j(withApi, "$this$withApi");
        return withApi.getOnce();
    }
}
