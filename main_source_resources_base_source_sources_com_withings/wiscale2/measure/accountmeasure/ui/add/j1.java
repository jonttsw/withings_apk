package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_AddMeasureManuallyFragment.java */
/* loaded from: classes5.dex */
public abstract class j1 extends h0 implements ik0.b {

    /* renamed from: l  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f58207l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f58208m;

    /* renamed from: n  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f58209n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f58210o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f58211p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(int i11) {
        super(i11);
        this.f58210o = new Object();
        this.f58211p = false;
    }

    private void initializeComponentContext() {
        if (this.f58207l == null) {
            this.f58207l = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f58208m = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f58209n == null) {
            synchronized (this.f58210o) {
                try {
                    if (this.f58209n == null) {
                        this.f58209n = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f58209n.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f58208m) {
            return null;
        }
        initializeComponentContext();
        return this.f58207l;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (!this.f58211p) {
            this.f58211p = true;
            ((n0) generatedComponent()).o((j0) this);
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f58207l;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
