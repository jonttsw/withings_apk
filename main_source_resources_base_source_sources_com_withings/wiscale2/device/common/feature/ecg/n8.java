package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class n8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t5 f51540a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51541b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(t5 t5Var, ym0.a<nm0.y> aVar) {
        super(2);
        this.f51540a = t5Var;
        this.f51541b = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string._CONFIRM_YES_, aVar2);
            if (this.f51540a != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            com.withings.common.compose.component.l.a(null, u11, null, z5, null, null, false, this.f51541b, aVar2, 0, 117);
        }
        return nm0.y.f85009a;
    }
}
