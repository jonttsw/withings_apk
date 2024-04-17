package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitEcgReviewRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/ListStateCodeResponse;", "Lcom/withings/ecg/webservices/EcgReviewRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitEcgReviewRemoteRepository$getStatesList$2 extends w implements l<EcgReviewRetrofit1Api, ListStateCodeResponse> {
    public static final RetrofitEcgReviewRemoteRepository$getStatesList$2 INSTANCE = new RetrofitEcgReviewRemoteRepository$getStatesList$2();

    RetrofitEcgReviewRemoteRepository$getStatesList$2() {
        super(1);
    }

    @Override // ym0.l
    public final ListStateCodeResponse invoke(EcgReviewRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getStatesList();
    }
}
