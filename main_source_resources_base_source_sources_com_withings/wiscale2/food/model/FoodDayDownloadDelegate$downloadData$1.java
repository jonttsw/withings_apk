package com.withings.wiscale2.food.model;

import com.withings.user.User;
import com.withings.wiscale2.food.model.Meal;
import com.withings.wiscale2.food.ws.FoodRemoteRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.a;
import ym0.p;
/* compiled from: FoodDayDownloadDelegate.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class FoodDayDownloadDelegate$downloadData$1 extends w implements a<y> {
    final /* synthetic */ DateTime $end;
    final /* synthetic */ DateTime $start;
    final /* synthetic */ FoodDayDownloadDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodDayDownloadDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.wiscale2.food.model.FoodDayDownloadDelegate$downloadData$1$1", f = "FoodDayDownloadDelegate.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.food.model.FoodDayDownloadDelegate$downloadData$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        final /* synthetic */ String $endDate;
        final /* synthetic */ List<MealName> $mealNames;
        final /* synthetic */ String $startDate;
        int label;
        final /* synthetic */ FoodDayDownloadDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FoodDayDownloadDelegate foodDayDownloadDelegate, String str, String str2, List<MealName> list, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = foodDayDownloadDelegate;
            this.$startDate = str;
            this.$endDate = str2;
            this.$mealNames = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$startDate, this.$endDate, this.$mealNames, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FoodRemoteRepository foodRemoteRepository;
            User user;
            FoodManager foodManager;
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
                foodRemoteRepository = this.this$0.foodRemoteRepository;
                user = this.this$0.user;
                long q11 = user.q();
                String startDate = this.$startDate;
                u.i(startDate, "$startDate");
                String endDate = this.$endDate;
                u.i(endDate, "$endDate");
                this.label = 1;
                obj = foodRemoteRepository.getMeals(q11, startDate, endDate, 1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            List<MealName> list = this.$mealNames;
            ArrayList<Meal> arrayList = new ArrayList();
            for (Object obj2 : ((MealResponse) obj).getData()) {
                Meal meal = (Meal) obj2;
                List<MealName> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((MealName) it.next()).getId() == meal.getMealNameId()) {
                                arrayList.add(obj2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            FoodDayDownloadDelegate foodDayDownloadDelegate = this.this$0;
            for (Meal meal2 : arrayList) {
                foodManager = foodDayDownloadDelegate.foodManager;
                foodManager.insertOrUpdateMeal(meal2);
            }
            return y.f85009a;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodDayDownloadDelegate$downloadData$1(DateTime dateTime, DateTime dateTime2, FoodDayDownloadDelegate foodDayDownloadDelegate) {
        super(0);
        this.$start = dateTime;
        this.$end = dateTime2;
        this.this$0 = foodDayDownloadDelegate;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FoodManager foodManager;
        User user;
        DateTime dateTime = this.$start;
        Meal.Companion companion = Meal.Companion;
        String abstractDateTime = dateTime.toString(companion.getDAY_FORMAT());
        String abstractDateTime2 = this.$end.toString(companion.getDAY_FORMAT());
        foodManager = this.this$0.foodManager;
        user = this.this$0.user;
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(this.this$0, abstractDateTime, abstractDateTime2, foodManager.getMealNamesForUser(user), null), 1, null);
    }
}
