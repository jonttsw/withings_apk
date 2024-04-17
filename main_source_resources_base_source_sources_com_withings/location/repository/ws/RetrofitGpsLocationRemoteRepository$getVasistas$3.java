package com.withings.location.repository.ws;

import com.withings.location.model.VasistasResponse;
import com.withings.location.repository.ws.api.LocationVasistasRetrofit2Api;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitGpsLocationRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/location/model/VasistasResponse;", "Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.repository.ws.RetrofitGpsLocationRemoteRepository$getVasistas$3", f = "RetrofitGpsLocationRemoteRepository.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitGpsLocationRemoteRepository$getVasistas$3 extends i implements p<LocationVasistasRetrofit2Api, d<? super VasistasResponse>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $defaultCategory;
    final /* synthetic */ long $endDate;
    final /* synthetic */ String $measureTypes;
    final /* synthetic */ long $startDate;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitGpsLocationRemoteRepository$getVasistas$3(long j5, long j11, long j12, String str, String str2, String str3, d<? super RetrofitGpsLocationRemoteRepository$getVasistas$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$startDate = j11;
        this.$endDate = j12;
        this.$measureTypes = str;
        this.$category = str2;
        this.$defaultCategory = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitGpsLocationRemoteRepository$getVasistas$3 retrofitGpsLocationRemoteRepository$getVasistas$3 = new RetrofitGpsLocationRemoteRepository$getVasistas$3(this.$userId, this.$startDate, this.$endDate, this.$measureTypes, this.$category, this.$defaultCategory, dVar);
        retrofitGpsLocationRemoteRepository$getVasistas$3.L$0 = obj;
        return retrofitGpsLocationRemoteRepository$getVasistas$3;
    }

    @Override // ym0.p
    public final Object invoke(LocationVasistasRetrofit2Api locationVasistasRetrofit2Api, d<? super VasistasResponse> dVar) {
        return ((RetrofitGpsLocationRemoteRepository$getVasistas$3) create(locationVasistasRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            LocationVasistasRetrofit2Api locationVasistasRetrofit2Api = (LocationVasistasRetrofit2Api) this.L$0;
            long j5 = this.$userId;
            long j11 = this.$startDate;
            long j12 = this.$endDate;
            String str = this.$measureTypes;
            String str2 = this.$category;
            if (str2 == null) {
                str2 = this.$defaultCategory;
            }
            this.label = 1;
            obj = locationVasistasRetrofit2Api.getVasistas(j5, j11, j12, str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
