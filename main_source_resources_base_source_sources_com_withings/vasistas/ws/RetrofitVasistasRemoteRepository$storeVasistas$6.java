package com.withings.vasistas.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.y;
/* compiled from: RetrofitVasistasRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/vasistas/ws/VasistasRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/vasistas/ws/VasistasRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.vasistas.ws.RetrofitVasistasRemoteRepository$storeVasistas$6", f = "RetrofitVasistasRemoteRepository.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitVasistasRemoteRepository$storeVasistas$6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<VasistasRetrofit2Api, qm0.d<? super y>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ int $deviceId;
    final /* synthetic */ long $userId;
    final /* synthetic */ String $vasistasSerie;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitVasistasRemoteRepository$storeVasistas$6(long j5, String str, String str2, int i11, qm0.d<? super RetrofitVasistasRemoteRepository$storeVasistas$6> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$category = str;
        this.$vasistasSerie = str2;
        this.$deviceId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        RetrofitVasistasRemoteRepository$storeVasistas$6 retrofitVasistasRemoteRepository$storeVasistas$6 = new RetrofitVasistasRemoteRepository$storeVasistas$6(this.$userId, this.$category, this.$vasistasSerie, this.$deviceId, dVar);
        retrofitVasistasRemoteRepository$storeVasistas$6.L$0 = obj;
        return retrofitVasistasRemoteRepository$storeVasistas$6;
    }

    @Override // ym0.p
    public final Object invoke(VasistasRetrofit2Api vasistasRetrofit2Api, qm0.d<? super y> dVar) {
        return ((RetrofitVasistasRemoteRepository$storeVasistas$6) create(vasistasRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$category;
            String str2 = this.$vasistasSerie;
            int i12 = this.$deviceId;
            this.label = 1;
            if (((VasistasRetrofit2Api) this.L$0).storeVasistas(j5, str, str2, i12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
