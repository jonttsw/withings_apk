package com.withings.vasistas.ws;

import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: RetrofitVasistasRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/vasistas/ws/WsVasistasSerie$Response;", "Lcom/withings/vasistas/ws/VasistasRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitVasistasRemoteRepository$getVasistas$2 extends w implements ym0.l<VasistasRetrofit1Api, WsVasistasSerie.Response> {
    final /* synthetic */ String $category;
    final /* synthetic */ long $endDate;
    final /* synthetic */ String $measureTypes;
    final /* synthetic */ long $startDate;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitVasistasRemoteRepository$getVasistas$2(long j5, long j11, long j12, String str, String str2) {
        super(1);
        this.$userId = j5;
        this.$startDate = j11;
        this.$endDate = j12;
        this.$category = str;
        this.$measureTypes = str2;
    }

    @Override // ym0.l
    public final WsVasistasSerie.Response invoke(VasistasRetrofit1Api withApiForAccount) {
        kotlin.jvm.internal.u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getVasistas(this.$userId, this.$startDate, this.$endDate, this.$category, this.$measureTypes);
    }
}
