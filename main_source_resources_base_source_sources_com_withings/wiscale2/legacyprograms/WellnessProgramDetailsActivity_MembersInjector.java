package com.withings.wiscale2.legacyprograms;

import javax.inject.Provider;
import x30.h;
import x30.j;
import x30.l;
/* loaded from: classes5.dex */
public final class WellnessProgramDetailsActivity_MembersInjector implements ak0.b<WellnessProgramDetailsActivity> {
    private final Provider<j30.c> enrolledRepositoryProvider;
    private final Provider<h> getMostRecentEnrolledProgramLastUpdateUseCaseProvider;
    private final Provider<j> getProgramByIdUseCaseProvider;
    private final Provider<l> isProgramRunningUseCaseProvider;

    public WellnessProgramDetailsActivity_MembersInjector(Provider<j> provider, Provider<l> provider2, Provider<h> provider3, Provider<j30.c> provider4) {
        this.getProgramByIdUseCaseProvider = provider;
        this.isProgramRunningUseCaseProvider = provider2;
        this.getMostRecentEnrolledProgramLastUpdateUseCaseProvider = provider3;
        this.enrolledRepositoryProvider = provider4;
    }

    public static ak0.b<WellnessProgramDetailsActivity> create(Provider<j> provider, Provider<l> provider2, Provider<h> provider3, Provider<j30.c> provider4) {
        return new WellnessProgramDetailsActivity_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectEnrolledRepository(WellnessProgramDetailsActivity wellnessProgramDetailsActivity, j30.c cVar) {
        wellnessProgramDetailsActivity.enrolledRepository = cVar;
    }

    public static void injectGetMostRecentEnrolledProgramLastUpdateUseCase(WellnessProgramDetailsActivity wellnessProgramDetailsActivity, h hVar) {
        wellnessProgramDetailsActivity.getMostRecentEnrolledProgramLastUpdateUseCase = hVar;
    }

    public static void injectGetProgramByIdUseCase(WellnessProgramDetailsActivity wellnessProgramDetailsActivity, j jVar) {
        wellnessProgramDetailsActivity.getProgramByIdUseCase = jVar;
    }

    public static void injectIsProgramRunningUseCase(WellnessProgramDetailsActivity wellnessProgramDetailsActivity, l lVar) {
        wellnessProgramDetailsActivity.isProgramRunningUseCase = lVar;
    }

    public void injectMembers(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        injectGetProgramByIdUseCase(wellnessProgramDetailsActivity, this.getProgramByIdUseCaseProvider.get());
        injectIsProgramRunningUseCase(wellnessProgramDetailsActivity, this.isProgramRunningUseCaseProvider.get());
        injectGetMostRecentEnrolledProgramLastUpdateUseCase(wellnessProgramDetailsActivity, this.getMostRecentEnrolledProgramLastUpdateUseCaseProvider.get());
        injectEnrolledRepository(wellnessProgramDetailsActivity, this.enrolledRepositoryProvider.get());
    }
}
