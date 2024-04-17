package com.withings.medicalreport.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_PdfPreviewFragment.java */
/* loaded from: classes4.dex */
public abstract class p extends Fragment implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f42264c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42265d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f42266e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f42267f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f42268g;

    p() {
        this.f42267f = new Object();
        this.f42268g = false;
    }

    private void initializeComponentContext() {
        if (this.f42264c == null) {
            this.f42264c = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f42265d = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f42266e == null) {
            synchronized (this.f42267f) {
                try {
                    if (this.f42266e == null) {
                        this.f42266e = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f42266e.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f42265d) {
            return null;
        }
        initializeComponentContext();
        return this.f42264c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f42268g) {
            return;
        }
        this.f42268g = true;
        ((w) generatedComponent()).t((PdfPreviewFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(int i11) {
        super(i11);
        this.f42267f = new Object();
        this.f42268g = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f42264c;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f42268g) {
            return;
        }
        this.f42268g = true;
        ((w) generatedComponent()).t((PdfPreviewFragment) this);
    }
}
