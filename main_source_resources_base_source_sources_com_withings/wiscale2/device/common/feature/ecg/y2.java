package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class y2 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52120a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f52120a = ecgActivationActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(1550515545);
        Object t11 = aVar2.t();
        a.C0060a.C0061a a11 = a.C0060a.a();
        EcgActivationActivity ecgActivationActivity = this.f52120a;
        if (t11 == a11) {
            t11 = ecgActivationActivity.U3().k1();
            aVar2.n(t11);
        }
        aVar2.J();
        rq.e eVar = (rq.e) ((k1.r0) t11).getValue();
        if (eVar != null) {
            EcgActivationActivity.J3(ecgActivationActivity, eVar, x2.f52102a, aVar2, ConstantsWs.WS_STATUS_NEW_PASSWORD_REQUIRED);
        }
        return nm0.y.f85009a;
    }
}
