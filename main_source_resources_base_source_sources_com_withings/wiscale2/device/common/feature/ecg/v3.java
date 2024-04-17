package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class v3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52062a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52063b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ xb.b f52064c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(EcgActivationActivity ecgActivationActivity, r8.n nVar, xb.b bVar) {
        super(2);
        this.f52062a = ecgActivationActivity;
        this.f52063b = nVar;
        this.f52064c = bVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            EcgActivationActivity ecgActivationActivity = this.f52062a;
            e.j.a(0, 1, aVar2, new u3(ecgActivationActivity), false);
            EcgActivationActivity.C3(ecgActivationActivity, this.f52063b, this.f52064c, aVar2, 584);
        }
        return nm0.y.f85009a;
    }
}
