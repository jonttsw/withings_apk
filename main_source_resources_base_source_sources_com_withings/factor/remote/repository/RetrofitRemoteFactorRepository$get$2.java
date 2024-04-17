package com.withings.factor.remote.repository;

import com.withings.factor.remote.repository.api.FactorRetrofit1Api;
import hr.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitRemoteFactorRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/factor/remote/repository/api/FactorRetrofit1Api;", "Lhr/a;", "invoke", "(Lcom/withings/factor/remote/repository/api/FactorRetrofit1Api;)Lhr/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class RetrofitRemoteFactorRepository$get$2 extends w implements l<FactorRetrofit1Api, a> {
    final /* synthetic */ Long $lastUpdateInSeconds;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRemoteFactorRepository$get$2(long j5, Long l5) {
        super(1);
        this.$userId = j5;
        this.$lastUpdateInSeconds = l5;
    }

    @Override // ym0.l
    public final a invoke(FactorRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.get(this.$userId, this.$lastUpdateInSeconds);
    }
}
