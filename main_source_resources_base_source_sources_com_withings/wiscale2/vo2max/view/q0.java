package com.withings.wiscale2.vo2max.view;

import android.view.View;
import android.widget.TextView;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.vo2max.view.r0;
/* compiled from: Vo2MaxImprovement.kt */
/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.d0 f62800a;

    /* renamed from: b  reason: collision with root package name */
    private final View f62801b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f62802c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f62803d;

    /* renamed from: e  reason: collision with root package name */
    private r0 f62804e;

    public q0(View parentView, androidx.lifecycle.d0 lifeCycleOwner) {
        kotlin.jvm.internal.u.j(lifeCycleOwner, "lifeCycleOwner");
        kotlin.jvm.internal.u.j(parentView, "parentView");
        this.f62800a = lifeCycleOwner;
        this.f62801b = parentView;
        nm0.h.b(new o0(this));
        this.f62802c = nm0.h.b(new p0(this));
        this.f62803d = nm0.h.b(new j0(this));
    }

    public static final void a(q0 q0Var, int i11) {
        HorizontalScaleView horizontalScaleView = (HorizontalScaleView) q0Var.f62803d.getValue();
        horizontalScaleView.setHighlightedCursorTitle(String.valueOf(i11));
        horizontalScaleView.setHighlightedCursorValue(i11 * 10);
        horizontalScaleView.n();
    }

    public static final void b(q0 q0Var, int i11) {
        HorizontalScaleView horizontalScaleView = (HorizontalScaleView) q0Var.f62803d.getValue();
        horizontalScaleView.setCursorTitle(horizontalScaleView.getContext().getString(C1987R.string.vo2MaxDetails_improvement_now));
        horizontalScaleView.setCursorValue(i11 * 10);
        horizontalScaleView.n();
    }

    public static final void c(q0 q0Var, HorizontalScaleView.e eVar) {
        HorizontalScaleView horizontalScaleView = (HorizontalScaleView) q0Var.f62803d.getValue();
        horizontalScaleView.setScale(eVar);
        horizontalScaleView.setSecondaryScale(eVar);
        horizontalScaleView.setDelegate(new m6.y(5));
        horizontalScaleView.setSecondaryDelegate(new m6.a(10));
        horizontalScaleView.n();
    }

    public static final TextView e(q0 q0Var) {
        return (TextView) q0Var.f62802c.getValue();
    }

    public final void f(r0 r0Var) {
        this.f62804e = r0Var;
        xw.o<r0.a, Integer, Integer, String> p02 = r0Var.p0();
        k0 k0Var = new k0(this);
        androidx.lifecycle.d0 d0Var = this.f62800a;
        xw.d.c(d0Var, p02, k0Var);
        r0 r0Var2 = this.f62804e;
        if (r0Var2 != null) {
            xw.d.c(d0Var, r0Var2.m0(), new l0(this));
            r0 r0Var3 = this.f62804e;
            if (r0Var3 != null) {
                xw.d.c(d0Var, r0Var3.k0(), new m0(this));
                r0 r0Var4 = this.f62804e;
                if (r0Var4 != null) {
                    xw.d.c(d0Var, r0Var4.q0(), new n0(this));
                    return;
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
