package com.withings.wiscale2.food.ui.display;

import com.withings.wiscale2.food.ui.display.FoodActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: FoodActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayOnPageChangeListener;", "Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FoodActivity$dayOnPageChangeListener$2 extends w implements ym0.a<FoodActivity.DayOnPageChangeListener> {
    final /* synthetic */ FoodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodActivity$dayOnPageChangeListener$2(FoodActivity foodActivity) {
        super(0);
        this.this$0 = foodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final FoodActivity.DayOnPageChangeListener invoke() {
        FoodActivity.DayPagerAdapter dayPagerAdapter;
        FoodActivity foodActivity = this.this$0;
        dayPagerAdapter = foodActivity.dayPagerAdapter;
        if (dayPagerAdapter != null) {
            return new FoodActivity.DayOnPageChangeListener(foodActivity, foodActivity, dayPagerAdapter);
        }
        u.s("dayPagerAdapter");
        throw null;
    }
}
