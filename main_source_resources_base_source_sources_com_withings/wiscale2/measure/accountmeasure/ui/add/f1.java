package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_AddHeartRateCameraFragment.java */
/* loaded from: classes5.dex */
public abstract class f1 extends h0 implements ik0.b {

    /* renamed from: l  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f58165l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f58166m;

    /* renamed from: n  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.f f58167n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f58168o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f58169p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1() {
        super(C1987R.layout.fragment_add_heart_rate_camera);
        this.f58168o = new Object();
        this.f58169p = false;
    }

    private void initializeComponentContext() {
        if (this.f58165l == null) {
            this.f58165l = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f58166m = dk0.a.a(super.getContext());
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f58167n == null) {
            synchronized (this.f58168o) {
                try {
                    if (this.f58167n == null) {
                        this.f58167n = new dagger.hilt.android.internal.managers.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f58167n.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f58166m) {
            return null;
        }
        initializeComponentContext();
        return this.f58165l;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        if (this.f58169p) {
            return;
        }
        this.f58169p = true;
        ((t) generatedComponent()).z((m) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f58165l;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        if (this.f58169p) {
            return;
        }
        this.f58169p = true;
        ((t) generatedComponent()).z((m) this);
    }
}
