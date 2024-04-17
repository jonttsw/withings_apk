package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitSignalRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/GetSignalsResponse;", "Lcom/withings/ecg/webservices/SignalRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitSignalRemoteRepository$getSignals$2 extends w implements l<SignalRetrofit1Api, GetSignalsResponse> {
    final /* synthetic */ Long $lastUpdate;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSignalRemoteRepository$getSignals$2(long j5, int i11, Long l5) {
        super(1);
        this.$userId = j5;
        this.$offset = i11;
        this.$lastUpdate = l5;
    }

    @Override // ym0.l
    public final GetSignalsResponse invoke(SignalRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getSignals(this.$userId, this.$offset, this.$lastUpdate);
    }
}
