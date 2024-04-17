package com.withings.wiscale2.vo2max.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_Vo2maxFragment.java */
/* loaded from: classes5.dex */
public abstract class c extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f62695c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62696d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f62697e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f62698f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f62699g = false;

    private void initializeComponentContext() {
        if (this.f62695c == null) {
            this.f62695c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f62696d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f62697e == null) {
            synchronized (this.f62698f) {
                try {
                    if (this.f62697e == null) {
                        this.f62697e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f62697e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f62696d) {
            return null;
        }
        initializeComponentContext();
        return this.f62695c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f62699g) {
            return;
        }
        this.f62699g = true;
        ((q1) generatedComponent()).L((i1) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f62695c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f62699g) {
            return;
        }
        this.f62699g = true;
        ((q1) generatedComponent()).L((i1) this);
    }
}
