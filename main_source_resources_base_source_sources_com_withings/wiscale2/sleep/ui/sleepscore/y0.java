package com.withings.wiscale2.sleep.ui.sleepscore;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class y0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f61562a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(k0 k0Var) {
        this.f61562a = k0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        RecyclerView recyclerView;
        int i11;
        k0 k0Var = this.f61562a;
        recyclerView = k0Var.f61093x;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            i11 = k0Var.f61068j;
            k0Var.customScrollTo(i11);
            return;
        }
        kotlin.jvm.internal.u.s("statsRecyclerView");
        throw null;
    }
}
