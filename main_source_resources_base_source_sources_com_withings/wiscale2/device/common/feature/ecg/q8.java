package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class q8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51669a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51670b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t5 f51671c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51672d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51673e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51674f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f51675g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, t5 t5Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
        super(2);
        this.f51669a = wBS08EcgActivationActivity;
        this.f51670b = nVar;
        this.f51671c = t5Var;
        this.f51672d = aVar;
        this.f51673e = aVar2;
        this.f51674f = aVar3;
        this.f51675g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51675g | 1);
        ym0.a<nm0.y> aVar2 = this.f51673e;
        ym0.a<nm0.y> aVar3 = this.f51674f;
        WBS08EcgActivationActivity.K3(this.f51669a, this.f51670b, this.f51671c, this.f51672d, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
