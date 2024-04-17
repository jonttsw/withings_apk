package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51744a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51745b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t5 f51746c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51747d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f51748e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(EcgActivationActivity ecgActivationActivity, r8.n nVar, t5 t5Var, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f51744a = ecgActivationActivity;
        this.f51745b = nVar;
        this.f51746c = t5Var;
        this.f51747d = aVar;
        this.f51748e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51748e | 1);
        t5 t5Var = this.f51746c;
        ym0.a<nm0.y> aVar2 = this.f51747d;
        EcgActivationActivity.L3(this.f51744a, this.f51745b, t5Var, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
