package com.withings.location.repository.ws;

import com.withings.location.repository.ws.api.LocationVasistasRetrofit1Api;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitGpsLocationRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitGpsLocationRemoteRepository$storeVasistas$2 extends w implements l<LocationVasistasRetrofit1Api, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $defaultCategory;
    final /* synthetic */ long $userId;
    final /* synthetic */ String $vasistasSeries;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitGpsLocationRemoteRepository$storeVasistas$2(long j5, String str, String str2, String str3) {
        super(1);
        this.$userId = j5;
        this.$vasistasSeries = str;
        this.$category = str2;
        this.$defaultCategory = str3;
    }

    @Override // ym0.l
    public final Object invoke(LocationVasistasRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        long j5 = this.$userId;
        String str = this.$vasistasSeries;
        String str2 = this.$category;
        if (str2 == null) {
            str2 = this.$defaultCategory;
        }
        return withApiForAccount.storeVasistas(j5, str, str2);
    }
}
