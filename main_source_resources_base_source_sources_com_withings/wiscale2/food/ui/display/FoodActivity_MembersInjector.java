package com.withings.wiscale2.food.ui.display;

import com.withings.wiscale2.food.model.FoodDayDownloadDelegateFactory;
import javax.inject.Provider;
/* loaded from: classes5.dex */
public final class FoodActivity_MembersInjector implements ak0.b<FoodActivity> {
    private final Provider<FoodDayDownloadDelegateFactory> foodDayDownloadDelegateFactoryProvider;

    public FoodActivity_MembersInjector(Provider<FoodDayDownloadDelegateFactory> provider) {
        this.foodDayDownloadDelegateFactoryProvider = provider;
    }

    public static ak0.b<FoodActivity> create(Provider<FoodDayDownloadDelegateFactory> provider) {
        return new FoodActivity_MembersInjector(provider);
    }

    public static void injectFoodDayDownloadDelegateFactory(FoodActivity foodActivity, FoodDayDownloadDelegateFactory foodDayDownloadDelegateFactory) {
        foodActivity.foodDayDownloadDelegateFactory = foodDayDownloadDelegateFactory;
    }

    public void injectMembers(FoodActivity foodActivity) {
        injectFoodDayDownloadDelegateFactory(foodActivity, this.foodDayDownloadDelegateFactoryProvider.get());
    }
}
