package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: RetrofitEcgReviewRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/ecg/webservices/EcgReviewRetrofit1Api;", "Lnm0/y;", "invoke", "(Lcom/withings/ecg/webservices/EcgReviewRetrofit1Api;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class RetrofitEcgReviewRemoteRepository$checkCode$2 extends w implements l<EcgReviewRetrofit1Api, y> {
    final /* synthetic */ String $code;
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitEcgReviewRemoteRepository$checkCode$2(long j5, long j11, String str) {
        super(1);
        this.$userId = j5;
        this.$deviceId = j11;
        this.$code = str;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(EcgReviewRetrofit1Api ecgReviewRetrofit1Api) {
        invoke2(ecgReviewRetrofit1Api);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(EcgReviewRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        withApiForAccount.checkCode(this.$userId, this.$deviceId, this.$code);
    }
}
