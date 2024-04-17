package com.withings.wiscale2.food.ui.display;

import com.withings.user.User;
import com.withings.wiscale2.food.model.FoodManager;
import com.withings.wiscale2.food.model.FoodWeekData;
import com.withings.wiscale2.food.model.MealName;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
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
/* compiled from: FoodWeekFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/food/ui/display/FoodWeekDataHolder;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.food.ui.display.FoodWeekFragment$loadAndShowData$1$dataHolder$1", f = "FoodWeekFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FoodWeekFragment$loadAndShowData$1$dataHolder$1 extends i implements p<CoroutineScope, d<? super FoodWeekDataHolder>, Object> {
    int label;
    final /* synthetic */ FoodWeekFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodWeekFragment$loadAndShowData$1$dataHolder$1(FoodWeekFragment foodWeekFragment, d<? super FoodWeekFragment$loadAndShowData$1$dataHolder$1> dVar) {
        super(2, dVar);
        this.this$0 = foodWeekFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new FoodWeekFragment$loadAndShowData$1$dataHolder$1(this.this$0, dVar);
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
            DateTime minus = day.withTimeAtStartOfDay().plusHours(24).minus(1L);
            u.i(minus, "minus(...)");
            FoodWeekData foodWeekData = foodManager.getFoodWeekData(user, minus);
            user2 = this.this$0.getUser();
            List<MealName> mealNamesForUser = foodManager.getMealNamesForUser(user2);
            x.D0(mealNamesForUser, new Comparator() { // from class: com.withings.wiscale2.food.ui.display.FoodWeekFragment$loadAndShowData$1$dataHolder$1$invokeSuspend$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return pm0.a.b(Double.valueOf(((MealName) t11).getRank()), Double.valueOf(((MealName) t12).getRank()));
                }
            });
            return new FoodWeekDataHolder(foodWeekData, mealNamesForUser);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super FoodWeekDataHolder> dVar) {
        return ((FoodWeekFragment$loadAndShowData$1$dataHolder$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
