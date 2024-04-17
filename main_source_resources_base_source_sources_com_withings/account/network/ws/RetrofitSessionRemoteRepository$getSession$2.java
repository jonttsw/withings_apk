package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.session.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/session/Session;", "Lcom/withings/account/network/ws/SessionRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$getSession$2 extends w implements l<SessionRetrofit1Api, Session> {
    final /* synthetic */ String $duration;
    final /* synthetic */ String $hash;
    final /* synthetic */ String $login;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$getSession$2(String str, String str2, String str3) {
        super(1);
        this.$login = str;
        this.$hash = str2;
        this.$duration = str3;
    }

    @Override // ym0.l
    public final Session invoke(SessionRetrofit1Api withApi) {
        u.j(withApi, "$this$withApi");
        return withApi.getSession(this.$login, this.$hash, this.$duration);
    }
}
