package com.withings.wiscale2.device.hwa11.ui;

import a3.g;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.withings.wiscale2.device.common.ui.h;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.managers.f;
import nd0.b;
import nd0.z;
/* compiled from: Hilt_Hwa11InfoFragment.java */
/* loaded from: classes5.dex */
public abstract class a extends h {

    /* renamed from: t  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f54634t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f54635u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f54636v = false;

    private void initializeComponentContext() {
        if (this.f54634t == null) {
            this.f54634t = f.b(super.getContext(), this);
            this.f54635u = dk0.a.a(super.getContext());
        }
    }

    @Override // com.withings.wiscale2.device.common.ui.m1, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f54635u) {
            return null;
        }
        initializeComponentContext();
        return this.f54634t;
    }

    @Override // com.withings.wiscale2.device.common.ui.m1
    protected final void inject() {
        if (!this.f54636v) {
            this.f54636v = true;
            ((z) generatedComponent()).G((b) this);
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
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f54634t;
        g.g(fragmentContextWrapper == null || f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
