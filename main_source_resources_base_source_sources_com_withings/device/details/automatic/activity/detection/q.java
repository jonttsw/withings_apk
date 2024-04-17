package com.withings.device.details.automatic.activity.detection;

import androidx.compose.material.t5;
import com.withings.library.authentication.api.ConstantsWs;
import n0.y0;
import n0.z0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36726a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AutomaticActivityDetection automaticActivityDetection) {
        super(2);
        this.f36726a = automaticActivityDetection;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            z0 b10 = y0.b(aVar2);
            AutomaticActivityDetection automaticActivityDetection = this.f36726a;
            t5.b(null, null, s1.b.b(aVar2, -2097864088, new m(automaticActivityDetection)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -320121521, new p(b10, automaticActivityDetection)), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
        }
        return nm0.y.f85009a;
    }
}
