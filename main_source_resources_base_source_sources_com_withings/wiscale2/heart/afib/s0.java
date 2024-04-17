package com.withings.wiscale2.heart.afib;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_AFibMonthFragment.java */
/* loaded from: classes5.dex */
public abstract class s0 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f57236c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57237d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f57238e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f57239f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f57240g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0() {
        super(C1987R.layout.fragment_afib_month);
        this.f57239f = new Object();
        this.f57240g = false;
    }

    private void initializeComponentContext() {
        if (this.f57236c == null) {
            this.f57236c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f57237d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f57238e == null) {
            synchronized (this.f57239f) {
                try {
                    if (this.f57238e == null) {
                        this.f57238e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f57238e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f57237d) {
            return null;
        }
        initializeComponentContext();
        return this.f57236c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f57240g) {
            return;
        }
        this.f57240g = true;
        ((e0) generatedComponent()).b((y) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f57236c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f57240g) {
            return;
        }
        this.f57240g = true;
        ((e0) generatedComponent()).b((y) this);
    }
}
