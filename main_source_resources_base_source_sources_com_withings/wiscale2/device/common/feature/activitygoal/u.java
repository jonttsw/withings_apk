package com.withings.wiscale2.device.common.feature.activitygoal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_FitnessAndStepsGoalSettingsFragment.java */
/* loaded from: classes5.dex */
public abstract class u extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f50961c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50962d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f50963e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f50964f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f50965g;

    u() {
        this.f50964f = new Object();
        this.f50965g = false;
    }

    private void initializeComponentContext() {
        if (this.f50961c == null) {
            this.f50961c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f50962d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f50963e == null) {
            synchronized (this.f50964f) {
                try {
                    if (this.f50963e == null) {
                        this.f50963e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f50963e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f50962d) {
            return null;
        }
        initializeComponentContext();
        return this.f50961c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f50965g) {
            return;
        }
        this.f50965g = true;
        ((t) generatedComponent()).I((FitnessAndStepsGoalSettingsFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(int i11) {
        super(i11);
        this.f50964f = new Object();
        this.f50965g = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f50961c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f50965g) {
            return;
        }
        this.f50965g = true;
        ((t) generatedComponent()).I((FitnessAndStepsGoalSettingsFragment) this);
    }
}
