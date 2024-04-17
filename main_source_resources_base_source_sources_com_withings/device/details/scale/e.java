package com.withings.device.details.scale;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_ScaleSharingFragment.java */
/* loaded from: classes3.dex */
public abstract class e extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f36928c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36929d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f36930e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f36931f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f36932g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super(C1987R.layout.fragment_scale_sharing);
        this.f36931f = new Object();
        this.f36932g = false;
    }

    private void initializeComponentContext() {
        if (this.f36928c == null) {
            this.f36928c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f36929d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f36930e == null) {
            synchronized (this.f36931f) {
                try {
                    if (this.f36930e == null) {
                        this.f36930e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f36930e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f36929d) {
            return null;
        }
        initializeComponentContext();
        return this.f36928c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f36932g) {
            return;
        }
        this.f36932g = true;
        ((f0) generatedComponent()).b0((c0) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f36928c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f36932g) {
            return;
        }
        this.f36932g = true;
        ((f0) generatedComponent()).b0((c0) this);
    }
}
