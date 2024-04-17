package com.withings.device.details.scale;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_ScaleDetailFragment.java */
/* loaded from: classes3.dex */
public abstract class c extends com.withings.device.details.h {

    /* renamed from: p  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f36910p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f36911q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f36912r = false;

    private void initializeComponentContext() {
        if (this.f36910p == null) {
            this.f36910p = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f36911q = dk0.a.a(super.getContext());
        }
    }

    @Override // com.withings.device.details.d0, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f36911q) {
            return null;
        }
        initializeComponentContext();
        return this.f36910p;
    }

    @Override // com.withings.device.details.d0
    protected final void inject() {
        if (!this.f36912r) {
            this.f36912r = true;
            ((v) generatedComponent()).W((k) this);
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
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f36910p;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
