package com.withings.nervehealth.ui.guidedscan;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanScreen.kt */
/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceWithVideoMedia.a f42707a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(DeviceWithVideoMedia.a aVar) {
        super(2);
        this.f42707a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e a11 = w0.a(e1.d(androidx.compose.ui.e.f8927a), 1.0f);
            DeviceWithVideoMedia.a aVar3 = this.f42707a;
            pk.a.a(a11, ay.b.u(aVar3.b(), aVar2), s2.d.a(aVar3.a(), aVar2), null, aVar2, ConstantsWs.WS_STATUS_ERROR_SYNCHROTIME, 8);
        }
        return nm0.y.f85009a;
    }
}
