package com.withings.wiscale2.food.ui.display;

import com.withings.user.User;
import com.withings.wiscale2.food.model.FoodDayData;
import com.withings.wiscale2.food.model.FoodManager;
import com.withings.wiscale2.food.model.MealName;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* compiled from: FoodDayFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001R\u00020\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/food/ui/display/FoodDayFragment$FoodDayDataHolder;", "Lcom/withings/wiscale2/food/ui/display/FoodDayFragment;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.food.ui.display.FoodDayFragment$loadAndShowData$1$dataHolder$1", f = "FoodDayFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FoodDayFragment$loadAndShowData$1$dataHolder$1 extends i implements p<CoroutineScope, d<? super FoodDayFragment.FoodDayDataHolder>, Object> {
    int label;
    final /* synthetic */ FoodDayFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodDayFragment$loadAndShowData$1$dataHolder$1(FoodDayFragment foodDayFragment, d<? super FoodDayFragment$loadAndShowData$1$dataHolder$1> dVar) {
        super(2, dVar);
        this.this$0 = foodDayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new FoodDayFragment$loadAndShowData$1$dataHolder$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        User user;
        DateTime day;
        User user2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            FoodManager foodManager = FoodManager.Companion.get();
            user = this.this$0.getUser();
            day = this.this$0.getDay();
            DateTime minus = day.withTimeAtStartOfDay().plusDays(1).minus(1L);
            u.i(minus, "minus(...)");
            FoodDayData foodDayData = foodManager.getFoodDayData(user, minus);
            user2 = this.this$0.getUser();
            List<MealName> mealNamesForUser = foodManager.getMealNamesForUser(user2);
            Collections.sort(mealNamesForUser, new MealName.MealNameComparator());
            return new FoodDayFragment.FoodDayDataHolder(this.this$0, foodDayData, mealNamesForUser);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super FoodDayFragment.FoodDayDataHolder> dVar) {
        return ((FoodDayFragment$loadAndShowData$1$dataHolder$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
