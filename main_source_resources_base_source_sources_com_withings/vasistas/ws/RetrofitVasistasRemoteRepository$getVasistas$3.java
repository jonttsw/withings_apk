package com.withings.vasistas.ws;

import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.y;
/* compiled from: RetrofitVasistasRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/vasistas/ws/WsVasistasSerie$Response;", "Lcom/withings/vasistas/ws/VasistasRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.vasistas.ws.RetrofitVasistasRemoteRepository$getVasistas$3", f = "RetrofitVasistasRemoteRepository.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitVasistasRemoteRepository$getVasistas$3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<VasistasRetrofit2Api, qm0.d<? super WsVasistasSerie.Response>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ long $endDate;
    final /* synthetic */ String $measureTypes;
    final /* synthetic */ long $startDate;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitVasistasRemoteRepository$getVasistas$3(long j5, long j11, long j12, String str, String str2, qm0.d<? super RetrofitVasistasRemoteRepository$getVasistas$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$startDate = j11;
        this.$endDate = j12;
        this.$category = str;
        this.$measureTypes = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        RetrofitVasistasRemoteRepository$getVasistas$3 retrofitVasistasRemoteRepository$getVasistas$3 = new RetrofitVasistasRemoteRepository$getVasistas$3(this.$userId, this.$startDate, this.$endDate, this.$category, this.$measureTypes, dVar);
        retrofitVasistasRemoteRepository$getVasistas$3.L$0 = obj;
        return retrofitVasistasRemoteRepository$getVasistas$3;
    }

    @Override // ym0.p
    public final Object invoke(VasistasRetrofit2Api vasistasRetrofit2Api, qm0.d<? super WsVasistasSerie.Response> dVar) {
        return ((RetrofitVasistasRemoteRepository$getVasistas$3) create(vasistasRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            long j5 = this.$userId;
            long j11 = this.$startDate;
            long j12 = this.$endDate;
            String str = this.$category;
            String str2 = this.$measureTypes;
            this.label = 1;
            obj = ((VasistasRetrofit2Api) this.L$0).getVasistas(j5, j11, j12, str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
