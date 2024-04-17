package com.withings.wiscale2.device.common.ui;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class e0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceInfoActivity f53796a;

    public e0(DeviceInfoActivity deviceInfoActivity) {
        this.f53796a = deviceInfoActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        DeviceInfoActivity deviceInfoActivity = this.f53796a;
        h0 h0Var = deviceInfoActivity.f53681g;
        if (h0Var != null) {
            return h0Var.a(DeviceInfoActivity.z3(deviceInfoActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
