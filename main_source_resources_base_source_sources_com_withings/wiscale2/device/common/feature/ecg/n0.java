package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51526a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f51527b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(EcgActivationActivity ecgActivationActivity, int i11) {
        super(2);
        this.f51526a = ecgActivationActivity;
        this.f51527b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51527b | 1);
        EcgActivationActivity.G3(this.f51526a, aVar, g11);
        return nm0.y.f85009a;
    }
}
