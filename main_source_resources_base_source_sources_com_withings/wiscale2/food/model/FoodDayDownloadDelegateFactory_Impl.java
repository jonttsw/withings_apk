package com.withings.wiscale2.food.model;

import com.withings.user.User;
import dagger.internal.c;
import dagger.internal.d;
import javax.inject.Provider;
import qw.a;
/* loaded from: classes5.dex */
public final class FoodDayDownloadDelegateFactory_Impl implements FoodDayDownloadDelegateFactory {
    private final FoodDayDownloadDelegate_Factory delegateFactory;

    FoodDayDownloadDelegateFactory_Impl(FoodDayDownloadDelegate_Factory foodDayDownloadDelegate_Factory) {
        this.delegateFactory = foodDayDownloadDelegate_Factory;
    }

    public static d<FoodDayDownloadDelegateFactory> createFactoryProvider(FoodDayDownloadDelegate_Factory foodDayDownloadDelegate_Factory) {
        return c.a(new FoodDayDownloadDelegateFactory_Impl(foodDayDownloadDelegate_Factory));
    }

    @Override // com.withings.wiscale2.food.model.FoodDayDownloadDelegateFactory
    public FoodDayDownloadDelegate create(User user, a.c cVar) {
        return this.delegateFactory.get(user, cVar);
    }

    public static Provider<FoodDayDownloadDelegateFactory> create(FoodDayDownloadDelegate_Factory foodDayDownloadDelegate_Factory) {
        return c.a(new FoodDayDownloadDelegateFactory_Impl(foodDayDownloadDelegate_Factory));
    }
}
