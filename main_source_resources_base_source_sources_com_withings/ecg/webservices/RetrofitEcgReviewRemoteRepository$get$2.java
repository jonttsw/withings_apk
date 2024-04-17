package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitEcgReviewRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/GetEcgReviewResponse;", "Lcom/withings/ecg/webservices/EcgReviewRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitEcgReviewRemoteRepository$get$2 extends w implements l<EcgReviewRetrofit1Api, GetEcgReviewResponse> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitEcgReviewRemoteRepository$get$2(long j5, long j11) {
        super(1);
        this.$userId = j5;
        this.$deviceId = j11;
    }

    @Override // ym0.l
    public final GetEcgReviewResponse invoke(EcgReviewRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.get(this.$userId, this.$deviceId);
    }
}
