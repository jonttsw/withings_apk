package com.withings.location.repository.ws;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.location.repository.ws.RetrofitGpsLocationRemoteRepository$storeVasistas$3", f = "RetrofitGpsLocationRemoteRepository.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitGpsLocationRemoteRepository$storeVasistas$3 extends i implements p<LocationVasistasRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $defaultCategory;
    final /* synthetic */ long $userId;
    final /* synthetic */ String $vasistasSeries;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitGpsLocationRemoteRepository$storeVasistas$3(long j5, String str, String str2, String str3, d<? super RetrofitGpsLocationRemoteRepository$storeVasistas$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$vasistasSeries = str;
        this.$category = str2;
        this.$defaultCategory = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitGpsLocationRemoteRepository$storeVasistas$3 retrofitGpsLocationRemoteRepository$storeVasistas$3 = new RetrofitGpsLocationRemoteRepository$storeVasistas$3(this.$userId, this.$vasistasSeries, this.$category, this.$defaultCategory, dVar);
        retrofitGpsLocationRemoteRepository$storeVasistas$3.L$0 = obj;
        return retrofitGpsLocationRemoteRepository$storeVasistas$3;
    }

    @Override // ym0.p
    public final Object invoke(LocationVasistasRetrofit2Api locationVasistasRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitGpsLocationRemoteRepository$storeVasistas$3) create(locationVasistasRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$vasistasSeries;
            String str2 = this.$category;
            if (str2 == null) {
                str2 = this.$defaultCategory;
            }
            this.label = 1;
            if (locationVasistasRetrofit2Api.storeVasistas(j5, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
