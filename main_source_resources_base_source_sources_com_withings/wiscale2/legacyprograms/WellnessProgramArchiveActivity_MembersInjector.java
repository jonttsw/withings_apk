package com.withings.wiscale2.legacyprograms;

import javax.inject.Provider;
/* loaded from: classes5.dex */
public final class WellnessProgramArchiveActivity_MembersInjector implements ak0.b<WellnessProgramArchiveActivity> {
    private final Provider<x30.a> getAllEnrolledProgramByUserUseCaseProvider;

    public WellnessProgramArchiveActivity_MembersInjector(Provider<x30.a> provider) {
        this.getAllEnrolledProgramByUserUseCaseProvider = provider;
    }

    public static ak0.b<WellnessProgramArchiveActivity> create(Provider<x30.a> provider) {
        return new WellnessProgramArchiveActivity_MembersInjector(provider);
    }

    public static void injectGetAllEnrolledProgramByUserUseCase(WellnessProgramArchiveActivity wellnessProgramArchiveActivity, x30.a aVar) {
        wellnessProgramArchiveActivity.getAllEnrolledProgramByUserUseCase = aVar;
    }

    public void injectMembers(WellnessProgramArchiveActivity wellnessProgramArchiveActivity) {
        injectGetAllEnrolledProgramByUserUseCase(wellnessProgramArchiveActivity, this.getAllEnrolledProgramByUserUseCaseProvider.get());
    }
}
