package com.withings.target.data;

import android.content.Context;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocalTargetRepository_Factory implements b<LocalTargetRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<TargetDataSource> dataSourceProvider;
    private final Provider<Integer> defaultHighHrThresholdProvider;
    private final Provider<Integer> defaultLowHrThresholdProvider;

    public LocalTargetRepository_Factory(Provider<Context> provider, Provider<TargetDataSource> provider2, Provider<Integer> provider3, Provider<Integer> provider4) {
        this.contextProvider = provider;
        this.dataSourceProvider = provider2;
        this.defaultLowHrThresholdProvider = provider3;
        this.defaultHighHrThresholdProvider = provider4;
    }

    public static LocalTargetRepository_Factory create(Provider<Context> provider, Provider<TargetDataSource> provider2, Provider<Integer> provider3, Provider<Integer> provider4) {
        return new LocalTargetRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static LocalTargetRepository newInstance(Context context, TargetDataSource targetDataSource, int i11, int i12) {
        return new LocalTargetRepository(context, targetDataSource, i11, i12);
    }

    @Override // javax.inject.Provider
    public LocalTargetRepository get() {
        return newInstance(this.contextProvider.get(), this.dataSourceProvider.get(), this.defaultLowHrThresholdProvider.get().intValue(), this.defaultHighHrThresholdProvider.get().intValue());
    }
}
