package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hilt_HeartRateDetailFragment.java */
/* loaded from: classes5.dex */
public abstract class i1 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f57668c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57669d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f57670e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f57671f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f57672g = false;

    private void initializeComponentContext() {
        if (this.f57668c == null) {
            this.f57668c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f57669d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f57670e == null) {
            synchronized (this.f57671f) {
                try {
                    if (this.f57670e == null) {
                        this.f57670e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f57670e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f57669d) {
            return null;
        }
        initializeComponentContext();
        return this.f57668c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f57672g) {
            return;
        }
        this.f57672g = true;
        ((y0) generatedComponent()).f((x0) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f57668c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f57672g) {
            return;
        }
        this.f57672g = true;
        ((y0) generatedComponent()).f((x0) this);
    }
}
