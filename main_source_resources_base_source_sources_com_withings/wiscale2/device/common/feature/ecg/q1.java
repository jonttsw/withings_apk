package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class q1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51657a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51658b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51659c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(EcgActivationActivity ecgActivationActivity, r8.n nVar, int i11) {
        super(2);
        this.f51657a = ecgActivationActivity;
        this.f51658b = nVar;
        this.f51659c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51659c | 1);
        EcgActivationActivity.K3(this.f51657a, this.f51658b, aVar, g11);
        return nm0.y.f85009a;
    }
}
