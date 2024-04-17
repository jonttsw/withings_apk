package com.withings.target.data.api;

import com.withings.target.data.api.model.TargetSingleWS;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitTargetRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/target/data/api/model/TargetSingleWS;", "Lcom/withings/target/data/api/TargetRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitTargetRemoteRepository$unset$2 extends w implements l<TargetRetrofit1Api, TargetSingleWS> {
    final /* synthetic */ int $measureType;
    final /* synthetic */ Integer $range;
    final /* synthetic */ int $type;
    final /* synthetic */ long $userid;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTargetRemoteRepository$unset$2(long j5, int i11, Integer num, int i12) {
        super(1);
        this.$userid = j5;
        this.$type = i11;
        this.$range = num;
        this.$measureType = i12;
    }

    @Override // ym0.l
    public final TargetSingleWS invoke(TargetRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.unset(this.$userid, this.$type, this.$range, this.$measureType);
    }
}
