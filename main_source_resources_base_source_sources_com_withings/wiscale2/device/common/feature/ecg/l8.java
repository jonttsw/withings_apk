package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class l8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51499a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51500b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f51501c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51502d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51503e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f51504f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f51499a = wBS08EcgActivationActivity;
        this.f51500b = nVar;
        this.f51501c = z5;
        this.f51502d = aVar;
        this.f51503e = aVar2;
        this.f51504f = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51504f | 1);
        ym0.a<nm0.y> aVar2 = this.f51502d;
        ym0.a<nm0.y> aVar3 = this.f51503e;
        WBS08EcgActivationActivity.J3(this.f51499a, this.f51500b, this.f51501c, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
