package com.withings.wiscale2.heart.bloodpressure;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hilt_BloodPressureDetailFragment.java */
/* loaded from: classes5.dex */
public abstract class k0 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f57424c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57425d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f57426e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f57427f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f57428g = false;

    private void initializeComponentContext() {
        if (this.f57424c == null) {
            this.f57424c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f57425d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f57426e == null) {
            synchronized (this.f57427f) {
                try {
                    if (this.f57426e == null) {
                        this.f57426e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f57426e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f57425d) {
            return null;
        }
        initializeComponentContext();
        return this.f57424c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f57428g) {
            return;
        }
        this.f57428g = true;
        ((h) generatedComponent()).h((g) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f57424c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f57428g) {
            return;
        }
        this.f57428g = true;
        ((h) generatedComponent()).h((g) this);
    }
}
