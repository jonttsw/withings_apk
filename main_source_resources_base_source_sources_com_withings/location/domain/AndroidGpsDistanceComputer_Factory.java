package com.withings.location.domain;

import dagger.internal.b;
/* loaded from: classes4.dex */
public final class AndroidGpsDistanceComputer_Factory implements b<AndroidGpsDistanceComputer> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final AndroidGpsDistanceComputer_Factory INSTANCE = new AndroidGpsDistanceComputer_Factory();

        private InstanceHolder() {
        }
    }

    public static AndroidGpsDistanceComputer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AndroidGpsDistanceComputer newInstance() {
        return new AndroidGpsDistanceComputer();
    }

    @Override // javax.inject.Provider
    public AndroidGpsDistanceComputer get() {
        return newInstance();
    }
}
