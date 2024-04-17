package com.withings.learnmore.adapter;

import android.content.Context;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class LearnMoreManager_Factory implements b<LearnMoreManager> {
    private final Provider<Context> contextProvider;

    public LearnMoreManager_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static LearnMoreManager_Factory create(Provider<Context> provider) {
        return new LearnMoreManager_Factory(provider);
    }

    public static LearnMoreManager newInstance(Context context) {
        return new LearnMoreManager(context);
    }

    @Override // javax.inject.Provider
    public LearnMoreManager get() {
        return newInstance(this.contextProvider.get());
    }
}
