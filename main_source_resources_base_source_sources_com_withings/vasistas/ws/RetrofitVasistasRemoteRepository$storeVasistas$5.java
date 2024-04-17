package com.withings.vasistas.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RetrofitVasistasRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/vasistas/ws/VasistasRetrofit1Api;", "Lnm0/y;", "invoke", "(Lcom/withings/vasistas/ws/VasistasRetrofit1Api;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class RetrofitVasistasRemoteRepository$storeVasistas$5 extends w implements ym0.l<VasistasRetrofit1Api, y> {
    final /* synthetic */ String $category;
    final /* synthetic */ int $deviceId;
    final /* synthetic */ long $userId;
    final /* synthetic */ String $vasistasSerie;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitVasistasRemoteRepository$storeVasistas$5(long j5, String str, String str2, int i11) {
        super(1);
        this.$userId = j5;
        this.$category = str;
        this.$vasistasSerie = str2;
        this.$deviceId = i11;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(VasistasRetrofit1Api vasistasRetrofit1Api) {
        invoke2(vasistasRetrofit1Api);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(VasistasRetrofit1Api withApiForAccount) {
        kotlin.jvm.internal.u.j(withApiForAccount, "$this$withApiForAccount");
        withApiForAccount.storeVasistas(this.$userId, this.$category, this.$vasistasSerie, this.$deviceId);
    }
}
