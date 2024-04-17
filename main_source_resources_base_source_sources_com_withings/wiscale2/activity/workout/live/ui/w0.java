package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.device.Device;
import java.util.List;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class w0 extends kotlin.jvm.internal.w implements ym0.a<dj.t> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f48943a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 z0Var) {
        super(0);
        this.f48943a = z0Var;
    }

    @Override // ym0.a
    public final dj.t invoke() {
        kn.e eVar;
        m70.i iVar;
        ej.w wVar;
        z0 z0Var = this.f48943a;
        eVar = z0Var.f48950b;
        iVar = z0Var.f48951c;
        List<Device> i11 = eVar.i(iVar.e().q());
        kotlin.jvm.internal.u.i(i11, "getByUserId(...)");
        for (Device device : i11) {
            if (kotlin.jvm.internal.u.e(device.getMacAddress().toString(), z0Var.c1().getDeviceMacAddress())) {
                wVar = z0Var.f48952d;
                return wVar.E(device.getMacAddress());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
