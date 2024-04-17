package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class x1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52100a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f52101b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(EcgActivationActivity ecgActivationActivity, int i11) {
        super(2);
        this.f52100a = ecgActivationActivity;
        this.f52101b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52101b | 1);
        EcgActivationActivity.M3(this.f52100a, aVar, g11);
        return nm0.y.f85009a;
    }
}
