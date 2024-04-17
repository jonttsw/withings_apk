package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitSignalRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/GetSignalResponse;", "Lcom/withings/ecg/webservices/SignalRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitSignalRemoteRepository$getSignal$2 extends w implements l<SignalRetrofit1Api, GetSignalResponse> {
    final /* synthetic */ long $signalId;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSignalRemoteRepository$getSignal$2(long j5, long j11) {
        super(1);
        this.$userId = j5;
        this.$signalId = j11;
    }

    @Override // ym0.l
    public final GetSignalResponse invoke(SignalRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getSignal(this.$userId, this.$signalId);
    }
}
