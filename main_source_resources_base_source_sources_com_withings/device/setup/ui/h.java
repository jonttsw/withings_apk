package com.withings.device.setup.ui;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: SetupChooseDeviceActivity.kt */
/* loaded from: classes3.dex */
final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceActivity f37544a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        super(2);
        this.f37544a = setupChooseDeviceActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            int i11 = e.m.f64583b;
            SetupChooseDeviceActivity setupChooseDeviceActivity = this.f37544a;
            androidx.compose.runtime.j.a(e.m.b(setupChooseDeviceActivity), s1.b.b(aVar2, 1111823341, new g(setupChooseDeviceActivity)), aVar2, 56);
        }
        return y.f85009a;
    }
}
