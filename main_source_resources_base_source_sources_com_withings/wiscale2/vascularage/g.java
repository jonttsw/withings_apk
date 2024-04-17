package com.withings.wiscale2.vascularage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_VascularAgeQuarterFragment.java */
/* loaded from: classes5.dex */
public abstract class g extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f62295c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62296d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f62297e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f62298f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f62299g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        super(C1987R.layout.fragment_vascular_age_quarter);
        this.f62298f = new Object();
        this.f62299g = false;
    }

    private void initializeComponentContext() {
        if (this.f62295c == null) {
            this.f62295c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f62296d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f62297e == null) {
            synchronized (this.f62298f) {
                try {
                    if (this.f62297e == null) {
                        this.f62297e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f62297e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f62296d) {
            return null;
        }
        initializeComponentContext();
        return this.f62295c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f62299g) {
            return;
        }
        this.f62299g = true;
        ((j0) generatedComponent()).K((y) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f62295c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f62299g) {
            return;
        }
        this.f62299g = true;
        ((j0) generatedComponent()).K((y) this);
    }
}
