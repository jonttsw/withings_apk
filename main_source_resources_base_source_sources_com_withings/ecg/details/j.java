package com.withings.ecg.details;

import android.view.View;
import androidx.core.widget.NestedScrollView;
/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class j implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38240a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NestedScrollView f38241b;

    public j(g gVar, NestedScrollView nestedScrollView) {
        this.f38240a = gVar;
        this.f38241b = nestedScrollView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Integer value;
        view.removeOnLayoutChangeListener(this);
        androidx.lifecycle.k0<Integer> K1 = this.f38240a.K1();
        if (K1 != null && (value = K1.getValue()) != null) {
            this.f38241b.setScrollY(value.intValue());
        }
    }
}
