package com.withings.wiscale2.legacyprograms;

import javax.inject.Provider;
/* loaded from: classes5.dex */
public final class BrowseProgramActivity_MembersInjector implements ak0.b<BrowseProgramActivity> {
    private final Provider<BrowseProgramViewModelFactory> browseProgramViewModelFactoryProvider;

    public BrowseProgramActivity_MembersInjector(Provider<BrowseProgramViewModelFactory> provider) {
        this.browseProgramViewModelFactoryProvider = provider;
    }

    public static ak0.b<BrowseProgramActivity> create(Provider<BrowseProgramViewModelFactory> provider) {
        return new BrowseProgramActivity_MembersInjector(provider);
    }

    public static void injectBrowseProgramViewModelFactory(BrowseProgramActivity browseProgramActivity, BrowseProgramViewModelFactory browseProgramViewModelFactory) {
        browseProgramActivity.browseProgramViewModelFactory = browseProgramViewModelFactory;
    }

    public void injectMembers(BrowseProgramActivity browseProgramActivity) {
        injectBrowseProgramViewModelFactory(browseProgramActivity, this.browseProgramViewModelFactoryProvider.get());
    }
}
