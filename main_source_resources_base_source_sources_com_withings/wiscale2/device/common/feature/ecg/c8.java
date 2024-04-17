package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class c8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51254a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rq.e f51255b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51256c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f51257d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f51258e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f51259f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(WBS08EcgActivationActivity wBS08EcgActivationActivity, rq.e eVar, ym0.a<nm0.y> aVar, a aVar2, a aVar3, int i11) {
        super(2);
        this.f51254a = wBS08EcgActivationActivity;
        this.f51255b = eVar;
        this.f51256c = aVar;
        this.f51257d = aVar2;
        this.f51258e = aVar3;
        this.f51259f = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51259f | 1);
        a aVar2 = this.f51257d;
        a aVar3 = this.f51258e;
        WBS08EcgActivationActivity.I3(this.f51254a, this.f51255b, this.f51256c, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
