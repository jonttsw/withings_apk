package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f52895a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar) {
        super(3);
        this.f52895a = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        r0.a0 LabelSwitchCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelSwitchCell, "$this$LabelSwitchCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e n11 = androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, 30);
            a aVar3 = this.f52895a;
            n0.z.a(x9.n.a(aVar3.b(), aVar2, 8), aVar3.a(), n11, null, null, 0.0f, null, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 120);
        }
        return nm0.y.f85009a;
    }
}
