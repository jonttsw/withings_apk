package com.withings.wiscale2.profile;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_ProfileFragment.java */
/* loaded from: classes5.dex */
public abstract class j extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f59373c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59374d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f59375e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f59376f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f59377g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        super(C1987R.layout.fragment_profile);
        this.f59376f = new Object();
        this.f59377g = false;
    }

    private void initializeComponentContext() {
        if (this.f59373c == null) {
            this.f59373c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f59374d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f59375e == null) {
            synchronized (this.f59376f) {
                try {
                    if (this.f59375e == null) {
                        this.f59375e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f59375e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f59374d) {
            return null;
        }
        initializeComponentContext();
        return this.f59373c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f59377g) {
            return;
        }
        this.f59377g = true;
        ((u0) generatedComponent()).S((q) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f59373c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f59377g) {
            return;
        }
        this.f59377g = true;
        ((u0) generatedComponent()).S((q) this);
    }
}
