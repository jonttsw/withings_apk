package com.withings.wiscale2.dashboard;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_DashboardFragment.java */
/* loaded from: classes4.dex */
public abstract class s extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f50603c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50604d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f50605e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f50606f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f50607g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s() {
        super(C1987R.layout.fragment_all_metrics);
        this.f50606f = new Object();
        this.f50607g = false;
    }

    private void initializeComponentContext() {
        if (this.f50603c == null) {
            this.f50603c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f50604d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f50605e == null) {
            synchronized (this.f50606f) {
                try {
                    if (this.f50605e == null) {
                        this.f50605e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f50605e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f50604d) {
            return null;
        }
        initializeComponentContext();
        return this.f50603c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f50607g) {
            return;
        }
        this.f50607g = true;
        i iVar = (i) this;
        ((m) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f50603c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f50607g) {
            return;
        }
        this.f50607g = true;
        i iVar = (i) this;
        ((m) generatedComponent()).getClass();
    }
}
