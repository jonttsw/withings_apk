package com.withings.wiscale2.device.hwa09.ui;

import a3.g;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.withings.wiscale2.device.common.ui.h;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.managers.f;
import jd0.a0;
import jd0.b;
/* compiled from: Hilt_Hwa09InfoFragment.java */
/* loaded from: classes5.dex */
public abstract class a extends h {

    /* renamed from: t  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f54554t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f54555u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f54556v = false;

    private void initializeComponentContext() {
        if (this.f54554t == null) {
            this.f54554t = f.b(super.getContext(), this);
            this.f54555u = dk0.a.a(super.getContext());
        }
    }

    @Override // com.withings.wiscale2.device.common.ui.m1, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f54555u) {
            return null;
        }
        initializeComponentContext();
        return this.f54554t;
    }

    @Override // com.withings.wiscale2.device.common.ui.m1
    protected final void inject() {
        if (!this.f54556v) {
            this.f54556v = true;
            ((a0) generatedComponent()).O((b) this);
        }
    }

    @Override // com.withings.wiscale2.device.common.ui.h, com.withings.wiscale2.device.common.ui.m1, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // com.withings.wiscale2.device.common.ui.m1, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(f.c(onGetLayoutInflater, this));
    }

    @Override // com.withings.wiscale2.device.common.ui.m1, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f54554t;
        g.g(fragmentContextWrapper == null || f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
