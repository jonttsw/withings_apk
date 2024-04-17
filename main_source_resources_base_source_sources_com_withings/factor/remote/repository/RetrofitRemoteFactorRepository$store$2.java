package com.withings.factor.remote.repository;

import com.withings.factor.remote.repository.api.FactorRetrofit1Api;
import hr.b;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitRemoteFactorRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/factor/remote/repository/api/FactorRetrofit1Api;", "Lhr/b;", "invoke", "(Lcom/withings/factor/remote/repository/api/FactorRetrofit1Api;)Lhr/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class RetrofitRemoteFactorRepository$store$2 extends w implements l<FactorRetrofit1Api, b> {
    final /* synthetic */ Long $endDateInSeconds;
    final /* synthetic */ int $factorType;
    final /* synthetic */ Integer $numberOfPills;
    final /* synthetic */ long $startDateInSeconds;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRemoteFactorRepository$store$2(long j5, int i11, long j11, Long l5, Integer num) {
        super(1);
        this.$userId = j5;
        this.$factorType = i11;
        this.$startDateInSeconds = j11;
        this.$endDateInSeconds = l5;
        this.$numberOfPills = num;
    }

    @Override // ym0.l
    public final b invoke(FactorRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.store(this.$userId, this.$factorType, this.$startDateInSeconds, this.$endDateInSeconds, this.$numberOfPills);
    }
}
