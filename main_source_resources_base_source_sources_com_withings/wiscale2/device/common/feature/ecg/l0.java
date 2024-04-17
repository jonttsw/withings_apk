package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51481a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51482b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i5 f51483c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f51484d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51485e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51486f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f51487g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f51488h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(EcgActivationActivity ecgActivationActivity, r8.n nVar, i5 i5Var, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11, int i12) {
        super(2);
        this.f51481a = ecgActivationActivity;
        this.f51482b = nVar;
        this.f51483c = i5Var;
        this.f51484d = z5;
        this.f51485e = aVar;
        this.f51486f = aVar2;
        this.f51487g = i11;
        this.f51488h = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51487g | 1);
        ym0.a<nm0.y> aVar2 = this.f51485e;
        ym0.a<nm0.y> aVar3 = this.f51486f;
        EcgActivationActivity.F3(this.f51481a, this.f51482b, this.f51483c, this.f51484d, aVar2, aVar3, aVar, g11, this.f51488h);
        return nm0.y.f85009a;
    }
}
