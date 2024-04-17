package com.withings.wiscale2.device.common.feature.spo2;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SpO2ActivationActivity.kt */
/* loaded from: classes5.dex */
final class k extends w implements ym0.l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spo2ActivationActivity f52532a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Spo2ActivationActivity spo2ActivationActivity) {
        super(1);
        this.f52532a = spo2ActivationActivity;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        Spo2ActivationActivity.D3(this.f52532a, num.intValue());
        return y.f85009a;
    }
}
