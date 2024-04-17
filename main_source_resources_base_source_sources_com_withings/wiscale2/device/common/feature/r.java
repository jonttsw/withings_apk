package com.withings.wiscale2.device.common.feature;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_FeatureActivationDocumentFragment.java */
/* loaded from: classes5.dex */
public abstract class r extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f52409c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52410d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f52411e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f52412f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52413g;

    r() {
        this.f52412f = new Object();
        this.f52413g = false;
    }

    private void initializeComponentContext() {
        if (this.f52409c == null) {
            this.f52409c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f52410d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f52411e == null) {
            synchronized (this.f52412f) {
                try {
                    if (this.f52411e == null) {
                        this.f52411e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f52411e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f52410d) {
            return null;
        }
        initializeComponentContext();
        return this.f52409c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f52413g) {
            return;
        }
        this.f52413g = true;
        ((i) generatedComponent()).F((FeatureActivationDocumentFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(int i11) {
        super(i11);
        this.f52412f = new Object();
        this.f52413g = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f52409c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f52413g) {
            return;
        }
        this.f52413g = true;
        ((i) generatedComponent()).F((FeatureActivationDocumentFragment) this);
    }
}
