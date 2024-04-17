package com.withings.wiscale2.device.wpm.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_Wpm02ResultScreenFragment.java */
/* loaded from: classes5.dex */
public abstract class b extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f55681c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f55682d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f55683e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f55684f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f55685g = false;

    private void initializeComponentContext() {
        if (this.f55681c == null) {
            this.f55681c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f55682d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f55683e == null) {
            synchronized (this.f55684f) {
                try {
                    if (this.f55683e == null) {
                        this.f55683e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f55683e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f55682d) {
            return null;
        }
        initializeComponentContext();
        return this.f55681c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f55685g) {
            return;
        }
        this.f55685g = true;
        ((i0) generatedComponent()).q((c0) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f55681c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f55685g) {
            return;
        }
        this.f55685g = true;
        ((i0) generatedComponent()).q((c0) this);
    }
}
