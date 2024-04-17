package com.withings.wiscale2.partner.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_PartnerIntroFragment.java */
/* loaded from: classes5.dex */
public abstract class n extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f59163c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59164d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f59165e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f59166f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f59167g = false;

    private void initializeComponentContext() {
        if (this.f59163c == null) {
            this.f59163c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f59164d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f59165e == null) {
            synchronized (this.f59166f) {
                try {
                    if (this.f59165e == null) {
                        this.f59165e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f59165e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f59164d) {
            return null;
        }
        initializeComponentContext();
        return this.f59163c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f59167g) {
            return;
        }
        this.f59167g = true;
        ((b2) generatedComponent()).A((k1) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f59163c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f59167g) {
            return;
        }
        this.f59167g = true;
        ((b2) generatedComponent()).A((k1) this);
    }
}
