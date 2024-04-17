package com.withings.clinicalstudy.repository;

import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class RoomPatientSessionRepository_Factory implements b<RoomPatientSessionRepository> {
    private final Provider<PatientSessionDao> roomPatientSessionDaoProvider;

    public RoomPatientSessionRepository_Factory(Provider<PatientSessionDao> provider) {
        this.roomPatientSessionDaoProvider = provider;
    }

    public static RoomPatientSessionRepository_Factory create(Provider<PatientSessionDao> provider) {
        return new RoomPatientSessionRepository_Factory(provider);
    }

    public static RoomPatientSessionRepository newInstance(PatientSessionDao patientSessionDao) {
        return new RoomPatientSessionRepository(patientSessionDao);
    }

    @Override // javax.inject.Provider
    public RoomPatientSessionRepository get() {
        return newInstance(this.roomPatientSessionDaoProvider.get());
    }
}
