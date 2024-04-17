package com.withings.wiscale2.food.model;

import com.withings.user.User;
import com.withings.wiscale2.food.ws.FoodRemoteRepository;
import javax.inject.Provider;
import qw.a;
/* loaded from: classes5.dex */
public final class FoodDayDownloadDelegate_Factory {
    private final Provider<FoodManager> foodManagerProvider;
    private final Provider<FoodRemoteRepository> foodRemoteRepositoryProvider;

    public FoodDayDownloadDelegate_Factory(Provider<FoodManager> provider, Provider<FoodRemoteRepository> provider2) {
        this.foodManagerProvider = provider;
        this.foodRemoteRepositoryProvider = provider2;
    }

    public static FoodDayDownloadDelegate_Factory create(Provider<FoodManager> provider, Provider<FoodRemoteRepository> provider2) {
        return new FoodDayDownloadDelegate_Factory(provider, provider2);
    }

    public static FoodDayDownloadDelegate newInstance(User user, a.c cVar, FoodManager foodManager, FoodRemoteRepository foodRemoteRepository) {
        return new FoodDayDownloadDelegate(user, cVar, foodManager, foodRemoteRepository);
    }

    public FoodDayDownloadDelegate get(User user, a.c cVar) {
        return newInstance(user, cVar, this.foodManagerProvider.get(), this.foodRemoteRepositoryProvider.get());
    }
}
