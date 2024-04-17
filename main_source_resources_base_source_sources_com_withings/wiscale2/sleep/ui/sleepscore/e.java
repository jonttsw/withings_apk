package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_SleepDayPagerFragment.java */
/* loaded from: classes5.dex */
public abstract class e extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f60914c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60915d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f60916e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f60917f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f60918g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super(C1987R.layout.fragment_sleep_pager);
        this.f60917f = new Object();
        this.f60918g = false;
    }

    private void initializeComponentContext() {
        if (this.f60914c == null) {
            this.f60914c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f60915d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f60916e == null) {
            synchronized (this.f60917f) {
                try {
                    if (this.f60916e == null) {
                        this.f60916e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f60916e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f60915d) {
            return null;
        }
        initializeComponentContext();
        return this.f60914c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f60918g) {
            return;
        }
        this.f60918g = true;
        ((i1) generatedComponent()).M((f1) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f60914c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f60918g) {
            return;
        }
        this.f60918g = true;
        ((i1) generatedComponent()).M((f1) this);
    }
}
