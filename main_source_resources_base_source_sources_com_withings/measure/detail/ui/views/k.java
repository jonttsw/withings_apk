package com.withings.measure.detail.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
/* compiled from: Hilt_AddDetailsView.java */
/* loaded from: classes4.dex */
public abstract class k extends ConstraintLayout implements ik0.b {

    /* renamed from: t  reason: collision with root package name */
    private ViewComponentManager f41850t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f41851u;

    k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.f41851u) {
            return;
        }
        this.f41851u = true;
        ((e) generatedComponent()).a((AddDetailsView) this);
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f41850t == null) {
            this.f41850t = new ViewComponentManager(this);
        }
        return this.f41850t.generatedComponent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        if (this.f41851u) {
            return;
        }
        this.f41851u = true;
        ((e) generatedComponent()).a((AddDetailsView) this);
    }
}
