package com.withings.location.repository.ws;

import com.withings.location.repository.GpsLocationRemoteRepository;
import com.withings.location.repository.data.uc.SaveGpsLocations;
import com.withings.location.repository.ws.model.GpsLocationSerializer;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetLocationVasistas_Factory implements b<GetLocationVasistas> {
    private final Provider<GpsLocationRemoteRepository> gpsLocationRemoteRepositoryProvider;
    private final Provider<GpsLocationSerializer> gpsLocationSerializerProvider;
    private final Provider<SaveGpsLocations> saveGpsLocationsProvider;

    public GetLocationVasistas_Factory(Provider<SaveGpsLocations> provider, Provider<GpsLocationSerializer> provider2, Provider<GpsLocationRemoteRepository> provider3) {
        this.saveGpsLocationsProvider = provider;
        this.gpsLocationSerializerProvider = provider2;
        this.gpsLocationRemoteRepositoryProvider = provider3;
    }

    public static GetLocationVasistas_Factory create(Provider<SaveGpsLocations> provider, Provider<GpsLocationSerializer> provider2, Provider<GpsLocationRemoteRepository> provider3) {
        return new GetLocationVasistas_Factory(provider, provider2, provider3);
    }

    public static GetLocationVasistas newInstance(SaveGpsLocations saveGpsLocations, GpsLocationSerializer gpsLocationSerializer, GpsLocationRemoteRepository gpsLocationRemoteRepository) {
        return new GetLocationVasistas(saveGpsLocations, gpsLocationSerializer, gpsLocationRemoteRepository);
    }

    @Override // javax.inject.Provider
    public GetLocationVasistas get() {
        return newInstance(this.saveGpsLocationsProvider.get(), this.gpsLocationSerializerProvider.get(), this.gpsLocationRemoteRepositoryProvider.get());
    }
}
