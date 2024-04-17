package com.withings.wiscale2.device.common.ui;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.device.Device;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class h1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y0 f53954a;

    public h1(y0 y0Var) {
        this.f53954a = y0Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        y0 y0Var = this.f53954a;
        Application application = y0Var.requireActivity().getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        Device t12 = y0.t1(y0Var);
        ej.w w11 = ej.w.w();
        kotlin.jvm.internal.u.i(w11, "get(...)");
        return new i1(application, t12, w11);
    }
}
