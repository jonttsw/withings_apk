package com.withings.weight.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: FragmentActivity.kt */
/* loaded from: classes4.dex */
public final class t implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity f47799a;

    public t(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity) {
        this.f47799a = segmentalBodyCompositionActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        SegmentalBodyCompositionActivity segmentalBodyCompositionActivity = this.f47799a;
        a0 a0Var = segmentalBodyCompositionActivity.f47596h;
        if (a0Var != null) {
            return a0Var.a(SegmentalBodyCompositionActivity.A3(segmentalBodyCompositionActivity), Long.valueOf(SegmentalBodyCompositionActivity.z3(segmentalBodyCompositionActivity)));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
