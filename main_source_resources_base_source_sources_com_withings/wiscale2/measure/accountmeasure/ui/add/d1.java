package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_AddBloodPressureFragment.java */
/* loaded from: classes5.dex */
public abstract class d1 extends j0 {

    /* renamed from: w  reason: collision with root package name */
    private ViewComponentManager.FragmentContextWrapper f58157w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f58158x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f58159y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1() {
        super(C1987R.layout.fragment_add_blood_pressure);
        this.f58159y = false;
    }

    private void initializeComponentContext() {
        if (this.f58157w == null) {
            this.f58157w = dagger.hilt.android.internal.managers.f.b(super.getContext(), this);
            this.f58158x = dk0.a.a(super.getContext());
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j1, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f58158x) {
            return null;
        }
        initializeComponentContext();
        return this.f58157w;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j1
    protected final void inject() {
        if (!this.f58159y) {
            this.f58159y = true;
            ((f) generatedComponent()).P((a) this);
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0, com.withings.wiscale2.measure.accountmeasure.ui.add.j1, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j1, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.f.c(onGetLayoutInflater, this));
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j1, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f58157w;
        a3.g.g(fragmentContextWrapper == null || dagger.hilt.android.internal.managers.f.d(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
