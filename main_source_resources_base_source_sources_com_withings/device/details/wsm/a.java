package com.withings.device.details.wsm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import ao.s;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_WsmDetailFragment.java */
/* loaded from: classes3.dex */
public abstract class a extends com.withings.device.details.h {

    /* renamed from: p  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f37311p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f37312q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f37313r = false;

    private void initializeComponentContext() {
        if (this.f37311p == null) {
            this.f37311p = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f37312q = dk0.a.a(super.getContext());
        }
    }

    @Override // com.withings.device.details.d0, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f37312q) {
            return null;
        }
        initializeComponentContext();
        return this.f37311p;
    }

    @Override // com.withings.device.details.d0
    protected final void inject() {
        if (!this.f37313r) {
            this.f37313r = true;
            ((s) generatedComponent()).g((ao.p) this);
        }
    }

    @Override // com.withings.device.details.h, com.withings.device.details.d0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // com.withings.device.details.d0, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // com.withings.device.details.d0, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f37311p;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
