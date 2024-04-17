package com.withings.location.repository.ws;

import dagger.internal.b;
/* loaded from: classes4.dex */
public final class PartitionOneLocationPerSeconds_Factory implements b<PartitionOneLocationPerSeconds> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final PartitionOneLocationPerSeconds_Factory INSTANCE = new PartitionOneLocationPerSeconds_Factory();

        private InstanceHolder() {
        }
    }

    public static PartitionOneLocationPerSeconds_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PartitionOneLocationPerSeconds newInstance() {
        return new PartitionOneLocationPerSeconds();
    }

    @Override // javax.inject.Provider
    public PartitionOneLocationPerSeconds get() {
        return newInstance();
    }
}
