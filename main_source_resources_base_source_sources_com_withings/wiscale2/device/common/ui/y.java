package com.withings.wiscale2.device.common.ui;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class y implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceBondingActivity f54123a;

    public y(DeviceBondingActivity deviceBondingActivity) {
        this.f54123a = deviceBondingActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        kn.e c11 = kn.e.c();
        kotlin.jvm.internal.u.i(c11, "get(...)");
        ej.w w11 = ej.w.w();
        kotlin.jvm.internal.u.i(w11, "get(...)");
        return new v(c11, w11, u70.i.c(DeviceBondingActivity.z3(this.f54123a)));
    }
}
