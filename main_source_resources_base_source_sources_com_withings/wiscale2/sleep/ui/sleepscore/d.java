package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_SleepDayFragment.java */
/* loaded from: classes5.dex */
public abstract class d extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f60904c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60905d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f60906e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f60907f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f60908g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super(C1987R.layout.fragment_sleep_day);
        this.f60907f = new Object();
        this.f60908g = false;
    }

    private void initializeComponentContext() {
        if (this.f60904c == null) {
            this.f60904c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f60905d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f60906e == null) {
            synchronized (this.f60907f) {
                try {
                    if (this.f60906e == null) {
                        this.f60906e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f60906e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f60905d) {
            return null;
        }
        initializeComponentContext();
        return this.f60904c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f60908g) {
            return;
        }
        this.f60908g = true;
        ((d1) generatedComponent()).p((k0) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f60904c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f60908g) {
            return;
        }
        this.f60908g = true;
        ((d1) generatedComponent()).p((k0) this);
    }
}
