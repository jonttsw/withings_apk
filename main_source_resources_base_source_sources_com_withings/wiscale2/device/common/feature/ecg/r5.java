package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.ecg.webservices.WsStateCode;
/* compiled from: EcgActivationViewModel.kt */
/* loaded from: classes5.dex */
public final class r5 extends t5 {

    /* renamed from: a  reason: collision with root package name */
    private WsStateCode f51692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(WsStateCode wsStateCode) {
        super(0);
        kotlin.jvm.internal.u.j(wsStateCode, "wsStateCode");
        this.f51692a = wsStateCode;
    }

    public final WsStateCode a() {
        return this.f51692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r5) && kotlin.jvm.internal.u.e(this.f51692a, ((r5) obj).f51692a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51692a.hashCode();
    }

    public final String toString() {
        return "EcgUsState(wsStateCode=" + this.f51692a + ")";
    }
}
