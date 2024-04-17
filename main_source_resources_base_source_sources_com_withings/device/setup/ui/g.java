package com.withings.device.setup.ui;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: SetupChooseDeviceActivity.kt */
/* loaded from: classes3.dex */
final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceActivity f37543a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        super(2);
        this.f37543a = setupChooseDeviceActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            SetupChooseDeviceActivity setupChooseDeviceActivity = this.f37543a;
            qp.l.a(null, null, SetupChooseDeviceActivity.C3(setupChooseDeviceActivity), new d(setupChooseDeviceActivity), new e(setupChooseDeviceActivity), new f(setupChooseDeviceActivity), aVar2, 0, 3);
        }
        return y.f85009a;
    }
}
