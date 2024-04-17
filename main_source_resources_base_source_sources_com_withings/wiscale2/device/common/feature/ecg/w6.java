package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class w6 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f52084a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52085b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(2);
        this.f52084a = nVar;
        this.f52085b = wBS08EcgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n nVar = this.f52084a;
            androidx.navigation.compose.s.b(nVar, "Loading", null, null, null, null, null, null, null, new v6(nVar, this.f52085b), aVar2, 56, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        }
        return nm0.y.f85009a;
    }
}
