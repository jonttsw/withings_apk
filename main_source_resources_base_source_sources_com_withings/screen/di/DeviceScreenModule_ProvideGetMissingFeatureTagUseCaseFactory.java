package com.withings.screen.di;

import ah.p;
import com.withings.screen.domain.uc.GetMissingFeatureTagUseCase;
import dagger.internal.b;
/* loaded from: classes4.dex */
public final class DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory implements b<GetMissingFeatureTagUseCase> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory INSTANCE = new DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory();

        private InstanceHolder() {
        }
    }

    public static DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GetMissingFeatureTagUseCase provideGetMissingFeatureTagUseCase() {
        GetMissingFeatureTagUseCase provideGetMissingFeatureTagUseCase = DeviceScreenModule.INSTANCE.provideGetMissingFeatureTagUseCase();
        p.d(provideGetMissingFeatureTagUseCase);
        return provideGetMissingFeatureTagUseCase;
    }

    @Override // javax.inject.Provider
    public GetMissingFeatureTagUseCase get() {
        return provideGetMissingFeatureTagUseCase();
    }
}
