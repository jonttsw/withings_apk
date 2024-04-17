package com.withings.ecg.details;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_EcgInReviewFragment.java */
/* loaded from: classes3.dex */
public abstract class q2 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f38296c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38297d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f38298e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f38299f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f38300g = false;

    private void initializeComponentContext() {
        if (this.f38296c == null) {
            this.f38296c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f38297d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f38298e == null) {
            synchronized (this.f38299f) {
                try {
                    if (this.f38298e == null) {
                        this.f38298e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f38298e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f38297d) {
            return null;
        }
        initializeComponentContext();
        return this.f38296c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f38300g) {
            return;
        }
        this.f38300g = true;
        ((d1) generatedComponent()).a0((a1) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f38296c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f38300g) {
            return;
        }
        this.f38300g = true;
        ((d1) generatedComponent()).a0((a1) this);
    }
}
