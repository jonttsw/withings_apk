package com.withings.ecg.details;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_EcgDetailsFragment.java */
/* loaded from: classes3.dex */
public abstract class p2 extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f38288c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38289d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f38290e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f38291f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f38292g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p2() {
        super(C1987R.layout.fragment_ecg_details);
        this.f38291f = new Object();
        this.f38292g = false;
    }

    private void initializeComponentContext() {
        if (this.f38288c == null) {
            this.f38288c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f38289d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f38290e == null) {
            synchronized (this.f38291f) {
                try {
                    if (this.f38290e == null) {
                        this.f38290e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f38290e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f38289d) {
            return null;
        }
        initializeComponentContext();
        return this.f38288c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f38292g) {
            return;
        }
        this.f38292g = true;
        ((a0) generatedComponent()).k((g) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f38288c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f38292g) {
            return;
        }
        this.f38292g = true;
        ((a0) generatedComponent()).k((g) this);
    }
}
