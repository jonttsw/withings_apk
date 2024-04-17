package com.withings.screen.repository.data;

import dagger.internal.b;
/* loaded from: classes4.dex */
public final class UpdateScreensStateAndOrder_Factory implements b<UpdateScreensStateAndOrder> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final UpdateScreensStateAndOrder_Factory INSTANCE = new UpdateScreensStateAndOrder_Factory();

        private InstanceHolder() {
        }
    }

    public static UpdateScreensStateAndOrder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UpdateScreensStateAndOrder newInstance() {
        return new UpdateScreensStateAndOrder();
    }

    @Override // javax.inject.Provider
    public UpdateScreensStateAndOrder get() {
        return newInstance();
    }
}
