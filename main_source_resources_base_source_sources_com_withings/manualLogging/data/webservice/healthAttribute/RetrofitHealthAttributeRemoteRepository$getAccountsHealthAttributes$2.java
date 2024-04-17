package com.withings.manualLogging.data.webservice.healthAttribute;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitHealthAttributeRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitHealthAttributeRemoteRepository$getAccountsHealthAttributes$2 extends w implements l<HealthAttributeRetrofit1Api, GetHealthAttributeResponse> {
    final /* synthetic */ Long $lastUpdate;
    final /* synthetic */ int $offset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthAttributeRemoteRepository$getAccountsHealthAttributes$2(Long l5, int i11) {
        super(1);
        this.$lastUpdate = l5;
        this.$offset = i11;
    }

    @Override // ym0.l
    public final GetHealthAttributeResponse invoke(HealthAttributeRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getAccountsHealthAttributes(this.$lastUpdate, this.$offset);
    }
}
