package com.withings.wiscale2.account.password;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_PasswordEditionFragment.java */
/* loaded from: classes4.dex */
public abstract class d extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f48137c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48138d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f48139e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f48140f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f48141g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super(C1987R.layout.fragment_password_edition);
        this.f48140f = new Object();
        this.f48141g = false;
    }

    private void initializeComponentContext() {
        if (this.f48137c == null) {
            this.f48137c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f48138d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f48139e == null) {
            synchronized (this.f48140f) {
                try {
                    if (this.f48139e == null) {
                        this.f48139e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f48139e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f48138d) {
            return null;
        }
        initializeComponentContext();
        return this.f48137c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f48141g) {
            return;
        }
        this.f48141g = true;
        k kVar = (k) this;
        ((n) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f48137c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f48141g) {
            return;
        }
        this.f48141g = true;
        k kVar = (k) this;
        ((n) generatedComponent()).getClass();
    }
}
