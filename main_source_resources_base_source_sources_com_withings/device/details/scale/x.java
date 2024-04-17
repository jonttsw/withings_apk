package com.withings.device.details.scale;

import com.withings.device.Device;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScaleDetailViewModel.kt */
/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.l<Device, nn.k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f37040a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar) {
        super(1);
        this.f37040a = wVar;
    }

    @Override // ym0.l
    public final nn.k invoke(Device device) {
        gl.a0 a0Var;
        boolean z5;
        Device device2 = device;
        kotlin.jvm.internal.u.j(device2, "device");
        fl.o d11 = this.f37040a.f37021r.d(device2.getModelId());
        if (d11 instanceof gl.a0) {
            a0Var = (gl.a0) d11;
        } else {
            a0Var = null;
        }
        if (a0Var != null && a0Var.V(device2) && mm.a.f82252a.c()) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new nn.k(device2, z5);
    }
}
