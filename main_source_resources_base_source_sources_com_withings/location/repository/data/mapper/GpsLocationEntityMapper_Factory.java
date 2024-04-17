package com.withings.location.repository.data.mapper;

import dagger.internal.b;
/* loaded from: classes4.dex */
public final class GpsLocationEntityMapper_Factory implements b<GpsLocationEntityMapper> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final GpsLocationEntityMapper_Factory INSTANCE = new GpsLocationEntityMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static GpsLocationEntityMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GpsLocationEntityMapper newInstance() {
        return new GpsLocationEntityMapper();
    }

    @Override // javax.inject.Provider
    public GpsLocationEntityMapper get() {
        return newInstance();
    }
}
