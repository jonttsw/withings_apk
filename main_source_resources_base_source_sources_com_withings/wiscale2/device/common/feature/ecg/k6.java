package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class k6 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51468a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51469b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51470c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f51471d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(WBS08EcgActivationActivity wBS08EcgActivationActivity, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f51468a = wBS08EcgActivationActivity;
        this.f51469b = aVar;
        this.f51470c = aVar2;
        this.f51471d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51471d | 1);
        ym0.a<nm0.y> aVar2 = this.f51469b;
        ym0.a<nm0.y> aVar3 = this.f51470c;
        WBS08EcgActivationActivity.D3(this.f51468a, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
