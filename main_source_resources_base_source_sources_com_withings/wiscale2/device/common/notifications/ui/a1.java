package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$healthNotification$2", f = "DeviceNotificationSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends PlatformFeature>, qm0.d<? super h1>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f52832a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f52833b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(f1 f1Var, qm0.d<? super a1> dVar) {
        super(2, dVar);
        this.f52833b = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        a1 a1Var = new a1(this.f52833b, dVar);
        a1Var.f52832a = obj;
        return a1Var;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends PlatformFeature> list, qm0.d<? super h1> dVar) {
        return ((a1) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        fl.i iVar;
        Device device;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List list = (List) this.f52832a;
        f1 f1Var = this.f52833b;
        boolean K0 = f1.K0(f1Var, list, 14);
        boolean K02 = f1.K0(f1Var, list, 13);
        if (f1.K0(f1Var, list, 22)) {
            iVar = f1Var.f52877e;
            device = f1Var.f52874b;
            if (iVar.e(device, gl.c0.class)) {
                z5 = true;
                return new h1(K0, K02, z5);
            }
        }
        z5 = false;
        return new h1(K0, K02, z5);
    }
}
