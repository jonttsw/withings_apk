package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51350a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51351b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51352c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(EcgActivationActivity ecgActivationActivity, r8.n nVar, int i11) {
        super(2);
        this.f51350a = ecgActivationActivity;
        this.f51351b = nVar;
        this.f51352c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51352c | 1);
        EcgActivationActivity.E3(this.f51350a, this.f51351b, aVar, g11);
        return nm0.y.f85009a;
    }
}
