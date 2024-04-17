package com.withings.wiscale2.device.common.notifications.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_DeviceNotificationSettingsFragment.java */
/* loaded from: classes5.dex */
public abstract class j1 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f52928c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52929d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f52930e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f52931f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f52932g = false;

    private void initializeComponentContext() {
        if (this.f52928c == null) {
            this.f52928c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f52929d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f52930e == null) {
            synchronized (this.f52931f) {
                try {
                    if (this.f52930e == null) {
                        this.f52930e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f52930e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f52929d) {
            return null;
        }
        initializeComponentContext();
        return this.f52928c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f52932g) {
            return;
        }
        this.f52932g = true;
        ((t0) generatedComponent()).n((m) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f52928c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f52932g) {
            return;
        }
        this.f52932g = true;
        ((t0) generatedComponent()).n((m) this);
    }
}
