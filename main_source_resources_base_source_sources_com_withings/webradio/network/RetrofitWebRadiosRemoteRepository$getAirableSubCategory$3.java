package com.withings.webradio.network;

import com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategoryList;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitWebRadiosRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableSubCategoryList;", "Lcom/withings/webradio/network/WebRadiosRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.webradio.network.RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3", f = "RetrofitWebRadiosRemoteRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3 extends i implements p<WebRadiosRetrofit2Api, d<? super WsAirableSubCategoryList>, Object> {
    final /* synthetic */ String $path;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3(String str, d<? super RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3> dVar) {
        super(2, dVar);
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3 retrofitWebRadiosRemoteRepository$getAirableSubCategory$3 = new RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3(this.$path, dVar);
        retrofitWebRadiosRemoteRepository$getAirableSubCategory$3.L$0 = obj;
        return retrofitWebRadiosRemoteRepository$getAirableSubCategory$3;
    }

    @Override // ym0.p
    public final Object invoke(WebRadiosRetrofit2Api webRadiosRetrofit2Api, d<? super WsAirableSubCategoryList> dVar) {
        return ((RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3) create(webRadiosRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$path;
            this.label = 1;
            obj = ((WebRadiosRetrofit2Api) this.L$0).getAirableSubCategory(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
