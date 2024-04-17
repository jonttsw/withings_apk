package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_SleepDisorderDayPagerFragment.java */
/* loaded from: classes5.dex */
public abstract class f extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f60931c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60932d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f60933e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f60934f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f60935g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        super(C1987R.layout.fragment_sleepdisorder_pager);
        this.f60934f = new Object();
        this.f60935g = false;
    }

    private void initializeComponentContext() {
        if (this.f60931c == null) {
            this.f60931c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f60932d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f60933e == null) {
            synchronized (this.f60934f) {
                try {
                    if (this.f60933e == null) {
                        this.f60933e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f60933e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f60932d) {
            return null;
        }
        initializeComponentContext();
        return this.f60931c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f60935g) {
            return;
        }
        this.f60935g = true;
        t1 t1Var = (t1) this;
        ((d2) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f60931c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f60935g) {
            return;
        }
        this.f60935g = true;
        t1 t1Var = (t1) this;
        ((d2) generatedComponent()).getClass();
    }
}
