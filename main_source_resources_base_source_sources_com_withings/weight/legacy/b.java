package com.withings.weight.legacy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_WeightDetailFragment.java */
/* loaded from: classes4.dex */
public abstract class b extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f47031c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47032d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f47033e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f47034f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47035g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b() {
        super(C1987R.layout.fragment_measure_weight);
        this.f47034f = new Object();
        this.f47035g = false;
    }

    private void initializeComponentContext() {
        if (this.f47031c == null) {
            this.f47031c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f47032d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f47033e == null) {
            synchronized (this.f47034f) {
                try {
                    if (this.f47033e == null) {
                        this.f47033e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f47033e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f47032d) {
            return null;
        }
        initializeComponentContext();
        return this.f47031c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f47035g) {
            return;
        }
        this.f47035g = true;
        ((w) generatedComponent()).c0((n) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f47031c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f47035g) {
            return;
        }
        this.f47035g = true;
        ((w) generatedComponent()).c0((n) this);
    }
}
