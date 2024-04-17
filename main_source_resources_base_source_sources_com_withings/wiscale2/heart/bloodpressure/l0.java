package com.withings.wiscale2.heart.bloodpressure;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_BloodPressureHistoryFragment.java */
/* loaded from: classes5.dex */
public abstract class l0 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f57430c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57431d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f57432e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f57433f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f57434g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0() {
        super(C1987R.layout.fragment_blood_pressure_history_detail);
        this.f57433f = new Object();
        this.f57434g = false;
    }

    private void initializeComponentContext() {
        if (this.f57430c == null) {
            this.f57430c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f57431d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f57432e == null) {
            synchronized (this.f57433f) {
                try {
                    if (this.f57432e == null) {
                        this.f57432e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f57432e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f57431d) {
            return null;
        }
        initializeComponentContext();
        return this.f57430c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f57434g) {
            return;
        }
        this.f57434g = true;
        ((q) generatedComponent()).Q((k) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f57430c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f57434g) {
            return;
        }
        this.f57434g = true;
        ((q) generatedComponent()).Q((k) this);
    }
}
