package com.withings.wiscale2.mydevices;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_MyDevicesFragment.java */
/* loaded from: classes5.dex */
public abstract class b extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f58640c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f58641d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f58642e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f58643f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f58644g = false;

    private void initializeComponentContext() {
        if (this.f58640c == null) {
            this.f58640c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f58641d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f58642e == null) {
            synchronized (this.f58643f) {
                try {
                    if (this.f58642e == null) {
                        this.f58642e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f58642e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f58641d) {
            return null;
        }
        initializeComponentContext();
        return this.f58640c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f58644g) {
            return;
        }
        this.f58644g = true;
        ((lh0.e) generatedComponent()).s((q) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f58640c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f58644g) {
            return;
        }
        this.f58644g = true;
        ((lh0.e) generatedComponent()).s((q) this);
    }
}
