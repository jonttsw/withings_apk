package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_SleepDisorderDetailsFragment.java */
/* loaded from: classes5.dex */
public abstract class c extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f61283c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f61284d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f61285e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f61286f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f61287g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        super(C1987R.layout.fragment_details_sleep_disorder);
        this.f61286f = new Object();
        this.f61287g = false;
    }

    private void initializeComponentContext() {
        if (this.f61283c == null) {
            this.f61283c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f61284d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f61285e == null) {
            synchronized (this.f61286f) {
                try {
                    if (this.f61285e == null) {
                        this.f61285e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f61285e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f61284d) {
            return null;
        }
        initializeComponentContext();
        return this.f61283c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f61287g) {
            return;
        }
        this.f61287g = true;
        ((f0) generatedComponent()).J((s) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f61283c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f61287g) {
            return;
        }
        this.f61287g = true;
        ((f0) generatedComponent()).J((s) this);
    }
}
