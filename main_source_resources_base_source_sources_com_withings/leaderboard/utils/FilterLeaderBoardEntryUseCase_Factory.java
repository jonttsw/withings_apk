package com.withings.leaderboard.utils;
/* loaded from: classes3.dex */
public final class FilterLeaderBoardEntryUseCase_Factory implements dagger.internal.b<FilterLeaderBoardEntryUseCase> {

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final FilterLeaderBoardEntryUseCase_Factory INSTANCE = new FilterLeaderBoardEntryUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static FilterLeaderBoardEntryUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FilterLeaderBoardEntryUseCase newInstance() {
        return new FilterLeaderBoardEntryUseCase();
    }

    @Override // javax.inject.Provider
    public FilterLeaderBoardEntryUseCase get() {
        return newInstance();
    }
}
