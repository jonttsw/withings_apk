package com.withings.webradio.network;

import com.withings.webradio.model.WsAirableWebRadioResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitWebRadiosRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/webradio/model/WsAirableWebRadioResponse;", "Lcom/withings/webradio/network/WebRadiosRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitWebRadiosRemoteRepository$getAirableWebRadios$2 extends w implements l<WebRadiosRetrofit1Api, WsAirableWebRadioResponse> {
    final /* synthetic */ String $path;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitWebRadiosRemoteRepository$getAirableWebRadios$2(String str) {
        super(1);
        this.$path = str;
    }

    @Override // ym0.l
    public final WsAirableWebRadioResponse invoke(WebRadiosRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getAirableWebRadios(this.$path);
    }
}
