package com.withings.webradio.ui;

import a3.g;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.f;
/* loaded from: classes4.dex */
abstract class Hilt_WebRadioListFragment extends WebRadioAbstractFragment implements ik0.b {
    private ContextWrapper componentContext;
    private volatile f componentManager;
    private boolean disableGetContextFix;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = f.b(super.getContext(), this);
            this.disableGetContextFix = dk0.a.a(super.getContext());
        }
    }

    protected f createComponentManager() {
        return new f(this);
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        return m35componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((WebRadioListFragment_GeneratedInjector) generatedComponent()).injectWebRadioListFragment((WebRadioListFragment) this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(f.c(onGetLayoutInflater, this));
    }

    /* renamed from: componentManager */
    public final f m35componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        g.g(contextWrapper == null || f.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
