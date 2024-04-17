package com.withings.wiscale2.food.ws;

import com.withings.wiscale2.food.model.MealResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitFoodRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/food/model/MealResponse;", "Lcom/withings/wiscale2/food/ws/FoodRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RetrofitFoodRemoteRepository$getMeals$2 extends w implements l<FoodRetrofit1Api, MealResponse> {
    final /* synthetic */ String $endDate;
    final /* synthetic */ int $range;
    final /* synthetic */ String $startDate;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitFoodRemoteRepository$getMeals$2(long j5, String str, String str2, int i11) {
        super(1);
        this.$userId = j5;
        this.$startDate = str;
        this.$endDate = str2;
        this.$range = i11;
    }

    @Override // ym0.l
    public final MealResponse invoke(FoodRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getMeals(this.$userId, this.$startDate, this.$endDate, this.$range);
    }
}
