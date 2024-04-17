package com.withings.location.repository.ws;

import com.withings.location.repository.data.uc.GetLastGpsLocationSyncedDate;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetLastLocationVasistas_Factory implements b<GetLastLocationVasistas> {
    private final Provider<GetLastGpsLocationSyncedDate> getLastSyncProvider;
    private final Provider<GetLocationVasistas> getLocationVasistasProvider;

    public GetLastLocationVasistas_Factory(Provider<GetLastGpsLocationSyncedDate> provider, Provider<GetLocationVasistas> provider2) {
        this.getLastSyncProvider = provider;
        this.getLocationVasistasProvider = provider2;
    }

    public static GetLastLocationVasistas_Factory create(Provider<GetLastGpsLocationSyncedDate> provider, Provider<GetLocationVasistas> provider2) {
        return new GetLastLocationVasistas_Factory(provider, provider2);
    }

    public static GetLastLocationVasistas newInstance(GetLastGpsLocationSyncedDate getLastGpsLocationSyncedDate, GetLocationVasistas getLocationVasistas) {
        return new GetLastLocationVasistas(getLastGpsLocationSyncedDate, getLocationVasistas);
    }

    @Override // javax.inject.Provider
    public GetLastLocationVasistas get() {
        return newInstance(this.getLastSyncProvider.get(), this.getLocationVasistasProvider.get());
    }
}
