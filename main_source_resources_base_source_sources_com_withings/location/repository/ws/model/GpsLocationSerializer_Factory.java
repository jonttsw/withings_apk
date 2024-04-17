package com.withings.location.repository.ws.model;

import dagger.internal.b;
/* loaded from: classes4.dex */
public final class GpsLocationSerializer_Factory implements b<GpsLocationSerializer> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final GpsLocationSerializer_Factory INSTANCE = new GpsLocationSerializer_Factory();

        private InstanceHolder() {
        }
    }

    public static GpsLocationSerializer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GpsLocationSerializer newInstance() {
        return new GpsLocationSerializer();
    }

    @Override // javax.inject.Provider
    public GpsLocationSerializer get() {
        return newInstance();
    }
}
