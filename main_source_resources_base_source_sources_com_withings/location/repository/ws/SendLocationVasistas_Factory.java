package com.withings.location.repository.ws;

import com.withings.location.repository.GpsLocationRemoteRepository;
import com.withings.location.repository.data.uc.DeleteGpsLocations;
import com.withings.location.repository.data.uc.GetFirstAndLastGpsLocationNotSyncedDates;
import com.withings.location.repository.data.uc.GetGpsLocationsNotSynced;
import com.withings.location.repository.data.uc.SaveGpsLocations;
import com.withings.location.repository.ws.model.GpsLocationSerializer;
import dagger.internal.b;
import javax.inject.Provider;
import s00.c;
/* loaded from: classes4.dex */
public final class SendLocationVasistas_Factory implements b<SendLocationVasistas> {
    private final Provider<DeleteGpsLocations> deleteGpsLocationsProvider;
    private final Provider<GetFirstAndLastGpsLocationNotSyncedDates> getFirstAndLastNotSyncedDatesForUserProvider;
    private final Provider<GetGpsLocationsNotSynced> getGpsLocationsNotSyncedProvider;
    private final Provider<GpsLocationRemoteRepository> gpsLocationRemoteRepositoryProvider;
    private final Provider<GpsLocationSerializer> gpsLocationSerializerProvider;
    private final Provider<c> gsonHandlerProvider;
    private final Provider<PartitionOneLocationPerSeconds> partitionOneLocationPerSecondsProvider;
    private final Provider<SaveGpsLocations> saveGpsLocationsProvider;

    public SendLocationVasistas_Factory(Provider<GetFirstAndLastGpsLocationNotSyncedDates> provider, Provider<GetGpsLocationsNotSynced> provider2, Provider<SaveGpsLocations> provider3, Provider<DeleteGpsLocations> provider4, Provider<GpsLocationSerializer> provider5, Provider<GpsLocationRemoteRepository> provider6, Provider<c> provider7, Provider<PartitionOneLocationPerSeconds> provider8) {
        this.getFirstAndLastNotSyncedDatesForUserProvider = provider;
        this.getGpsLocationsNotSyncedProvider = provider2;
        this.saveGpsLocationsProvider = provider3;
        this.deleteGpsLocationsProvider = provider4;
        this.gpsLocationSerializerProvider = provider5;
        this.gpsLocationRemoteRepositoryProvider = provider6;
        this.gsonHandlerProvider = provider7;
        this.partitionOneLocationPerSecondsProvider = provider8;
    }

    public static SendLocationVasistas_Factory create(Provider<GetFirstAndLastGpsLocationNotSyncedDates> provider, Provider<GetGpsLocationsNotSynced> provider2, Provider<SaveGpsLocations> provider3, Provider<DeleteGpsLocations> provider4, Provider<GpsLocationSerializer> provider5, Provider<GpsLocationRemoteRepository> provider6, Provider<c> provider7, Provider<PartitionOneLocationPerSeconds> provider8) {
        return new SendLocationVasistas_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static SendLocationVasistas newInstance(GetFirstAndLastGpsLocationNotSyncedDates getFirstAndLastGpsLocationNotSyncedDates, GetGpsLocationsNotSynced getGpsLocationsNotSynced, SaveGpsLocations saveGpsLocations, DeleteGpsLocations deleteGpsLocations, GpsLocationSerializer gpsLocationSerializer, GpsLocationRemoteRepository gpsLocationRemoteRepository, c cVar, PartitionOneLocationPerSeconds partitionOneLocationPerSeconds) {
        return new SendLocationVasistas(getFirstAndLastGpsLocationNotSyncedDates, getGpsLocationsNotSynced, saveGpsLocations, deleteGpsLocations, gpsLocationSerializer, gpsLocationRemoteRepository, cVar, partitionOneLocationPerSeconds);
    }

    @Override // javax.inject.Provider
    public SendLocationVasistas get() {
        return newInstance(this.getFirstAndLastNotSyncedDatesForUserProvider.get(), this.getGpsLocationsNotSyncedProvider.get(), this.saveGpsLocationsProvider.get(), this.deleteGpsLocationsProvider.get(), this.gpsLocationSerializerProvider.get(), this.gpsLocationRemoteRepositoryProvider.get(), this.gsonHandlerProvider.get(), this.partitionOneLocationPerSecondsProvider.get());
    }
}
