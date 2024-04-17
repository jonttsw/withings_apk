package com.withings.wiscale2.food.ws;

import com.withings.wiscale2.food.model.MealNameResponse;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitFoodRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/food/model/MealNameResponse;", "Lcom/withings/wiscale2/food/ws/FoodRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.food.ws.RetrofitFoodRemoteRepository$getMealNames$3", f = "RetrofitFoodRemoteRepository.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetrofitFoodRemoteRepository$getMealNames$3 extends i implements p<FoodRetrofit2Api, d<? super MealNameResponse>, Object> {
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitFoodRemoteRepository$getMealNames$3(long j5, d<? super RetrofitFoodRemoteRepository$getMealNames$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitFoodRemoteRepository$getMealNames$3 retrofitFoodRemoteRepository$getMealNames$3 = new RetrofitFoodRemoteRepository$getMealNames$3(this.$userId, dVar);
        retrofitFoodRemoteRepository$getMealNames$3.L$0 = obj;
        return retrofitFoodRemoteRepository$getMealNames$3;
    }

    @Override // ym0.p
    public final Object invoke(FoodRetrofit2Api foodRetrofit2Api, d<? super MealNameResponse> dVar) {
        return ((RetrofitFoodRemoteRepository$getMealNames$3) create(foodRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$userId;
            this.label = 1;
            obj = ((FoodRetrofit2Api) this.L$0).getMealNames(j5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
