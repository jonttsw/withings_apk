package com.withings.target.domain;

import com.withings.target.data.TargetRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class SaveTargetFromServerUseCase_Factory implements b<SaveTargetFromServerUseCase> {
    private final Provider<TargetRepository> targetRepositoryProvider;

    public SaveTargetFromServerUseCase_Factory(Provider<TargetRepository> provider) {
        this.targetRepositoryProvider = provider;
    }

    public static SaveTargetFromServerUseCase_Factory create(Provider<TargetRepository> provider) {
        return new SaveTargetFromServerUseCase_Factory(provider);
    }

    public static SaveTargetFromServerUseCase newInstance(TargetRepository targetRepository) {
        return new SaveTargetFromServerUseCase(targetRepository);
    }

    @Override // javax.inject.Provider
    public SaveTargetFromServerUseCase get() {
        return newInstance(this.targetRepositoryProvider.get());
    }
}
