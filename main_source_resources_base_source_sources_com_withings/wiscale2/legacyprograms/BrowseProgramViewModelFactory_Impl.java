package com.withings.wiscale2.legacyprograms;

import com.withings.user.User;
import javax.inject.Provider;
/* loaded from: classes5.dex */
public final class BrowseProgramViewModelFactory_Impl implements BrowseProgramViewModelFactory {
    private final BrowseProgramViewModel_Factory delegateFactory;

    BrowseProgramViewModelFactory_Impl(BrowseProgramViewModel_Factory browseProgramViewModel_Factory) {
        this.delegateFactory = browseProgramViewModel_Factory;
    }

    public static dagger.internal.d<BrowseProgramViewModelFactory> createFactoryProvider(BrowseProgramViewModel_Factory browseProgramViewModel_Factory) {
        return dagger.internal.c.a(new BrowseProgramViewModelFactory_Impl(browseProgramViewModel_Factory));
    }

    @Override // com.withings.wiscale2.legacyprograms.BrowseProgramViewModelFactory
    public BrowseProgramViewModel create(User user) {
        return this.delegateFactory.get(user);
    }

    public static Provider<BrowseProgramViewModelFactory> create(BrowseProgramViewModel_Factory browseProgramViewModel_Factory) {
        return dagger.internal.c.a(new BrowseProgramViewModelFactory_Impl(browseProgramViewModel_Factory));
    }
}
