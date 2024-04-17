package com.withings.measurements.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_MeasurementsFragment.java */
/* loaded from: classes4.dex */
public abstract class r1 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f42128c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42129d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f42130e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f42131f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f42132g = false;

    private void initializeComponentContext() {
        if (this.f42128c == null) {
            this.f42128c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f42129d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f42130e == null) {
            synchronized (this.f42131f) {
                try {
                    if (this.f42130e == null) {
                        this.f42130e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f42130e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f42129d) {
            return null;
        }
        initializeComponentContext();
        return this.f42128c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f42132g) {
            return;
        }
        this.f42132g = true;
        ((j2) generatedComponent()).H((i2) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f42128c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f42132g) {
            return;
        }
        this.f42132g = true;
        ((j2) generatedComponent()).H((i2) this);
    }
}
