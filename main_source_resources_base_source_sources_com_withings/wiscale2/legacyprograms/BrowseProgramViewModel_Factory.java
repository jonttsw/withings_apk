package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import com.withings.user.User;
import javax.inject.Provider;
import x30.h;
/* loaded from: classes5.dex */
public final class BrowseProgramViewModel_Factory {
    private final Provider<Context> contextProvider;
    private final Provider<j30.c> enrolledRepositoryProvider;
    private final Provider<v30.b> fetchTasksProgramByIdUseCaseProvider;
    private final Provider<x30.c> getAllProgramsByUserUseCaseProvider;
    private final Provider<h> getMostRecentEnrolledProgramLastUpdateUseCaseProvider;

    public BrowseProgramViewModel_Factory(Provider<Context> provider, Provider<x30.c> provider2, Provider<j30.c> provider3, Provider<h> provider4, Provider<v30.b> provider5) {
        this.contextProvider = provider;
        this.getAllProgramsByUserUseCaseProvider = provider2;
        this.enrolledRepositoryProvider = provider3;
        this.getMostRecentEnrolledProgramLastUpdateUseCaseProvider = provider4;
        this.fetchTasksProgramByIdUseCaseProvider = provider5;
    }

    public static BrowseProgramViewModel_Factory create(Provider<Context> provider, Provider<x30.c> provider2, Provider<j30.c> provider3, Provider<h> provider4, Provider<v30.b> provider5) {
        return new BrowseProgramViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static BrowseProgramViewModel newInstance(Context context, User user, x30.c cVar, j30.c cVar2, h hVar, v30.b bVar) {
        return new BrowseProgramViewModel(context, user, cVar, cVar2, hVar, bVar);
    }

    public BrowseProgramViewModel get(User user) {
        return newInstance(this.contextProvider.get(), user, this.getAllProgramsByUserUseCaseProvider.get(), this.enrolledRepositoryProvider.get(), this.getMostRecentEnrolledProgramLastUpdateUseCaseProvider.get(), this.fetchTasksProgramByIdUseCaseProvider.get());
    }
}
