package com.withings.wiscale2.sleep.ui.sleepscore;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class x3 extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    private final int f61559a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61560b;

    public x3(int i11, int i12) {
        this.f61559a = i11;
        this.f61560b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void f(Rect outRect, View view, RecyclerView parent, RecyclerView.v state) {
        kotlin.jvm.internal.u.j(outRect, "outRect");
        kotlin.jvm.internal.u.j(view, "view");
        kotlin.jvm.internal.u.j(parent, "parent");
        kotlin.jvm.internal.u.j(state, "state");
        int T = RecyclerView.T(view) % 2;
        int i11 = this.f61560b;
        if (T != 0) {
            outRect.left = i11;
        } else {
            outRect.right = i11;
        }
        if (RecyclerView.T(view) < parent.getChildCount()) {
            outRect.bottom = this.f61559a;
        }
    }
}
