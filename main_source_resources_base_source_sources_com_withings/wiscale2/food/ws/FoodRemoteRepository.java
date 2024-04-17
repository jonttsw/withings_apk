package com.withings.wiscale2.food.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.food.model.MealNameResponse;
import com.withings.wiscale2.food.model.MealResponse;
import kotlin.Metadata;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import qm0.d;
/* compiled from: FoodRemoteRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "", NavigationArguments.USER_ID, "Lcom/withings/wiscale2/food/model/MealNameResponse;", "getMealNames", "(JLqm0/d;)Ljava/lang/Object;", "startDate", "endDate", "", ValidateElement.RangeValidateElement.METHOD, "Lcom/withings/wiscale2/food/model/MealResponse;", "getMeals", "(JLjava/lang/String;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface FoodRemoteRepository {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int RANGE_DAYS = 1;

    /* compiled from: FoodRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/food/ws/FoodRemoteRepository$Companion;", "", "()V", "RANGE_DAYS", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int RANGE_DAYS = 1;

        private Companion() {
        }
    }

    Object getMealNames(long j5, d<? super MealNameResponse> dVar);

    Object getMeals(long j5, String str, String str2, int i11, d<? super MealResponse> dVar);

    FoodRemoteRepository withSyncContext(String str);
}
