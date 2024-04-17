package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52138a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52139b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ xb.b f52140c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f52141d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(EcgActivationActivity ecgActivationActivity, r8.n nVar, xb.b bVar, int i11) {
        super(2);
        this.f52138a = ecgActivationActivity;
        this.f52139b = nVar;
        this.f52140c = bVar;
        this.f52141d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52141d | 1);
        r8.n nVar = this.f52139b;
        xb.b bVar = this.f52140c;
        EcgActivationActivity.C3(this.f52138a, nVar, bVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
