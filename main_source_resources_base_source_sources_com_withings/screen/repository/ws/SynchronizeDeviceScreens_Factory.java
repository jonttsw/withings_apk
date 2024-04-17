package com.withings.screen.repository.ws;

import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class SynchronizeDeviceScreens_Factory implements b<SynchronizeDeviceScreens> {
    private final Provider<GetDeviceScreensContents> getDeviceScreensContentsProvider;
    private final Provider<GetDeviceScreens> getDeviceScreensProvider;
    private final Provider<SendDeviceScreens> sendDeviceScreensProvider;

    public SynchronizeDeviceScreens_Factory(Provider<GetDeviceScreens> provider, Provider<GetDeviceScreensContents> provider2, Provider<SendDeviceScreens> provider3) {
        this.getDeviceScreensProvider = provider;
        this.getDeviceScreensContentsProvider = provider2;
        this.sendDeviceScreensProvider = provider3;
    }

    public static SynchronizeDeviceScreens_Factory create(Provider<GetDeviceScreens> provider, Provider<GetDeviceScreensContents> provider2, Provider<SendDeviceScreens> provider3) {
        return new SynchronizeDeviceScreens_Factory(provider, provider2, provider3);
    }

    public static SynchronizeDeviceScreens newInstance(GetDeviceScreens getDeviceScreens, GetDeviceScreensContents getDeviceScreensContents, SendDeviceScreens sendDeviceScreens) {
        return new SynchronizeDeviceScreens(getDeviceScreens, getDeviceScreensContents, sendDeviceScreens);
    }

    @Override // javax.inject.Provider
    public SynchronizeDeviceScreens get() {
        return newInstance(this.getDeviceScreensProvider.get(), this.getDeviceScreensContentsProvider.get(), this.sendDeviceScreensProvider.get());
    }
}
