package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class z8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52160a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52161b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f52162c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, int i11) {
        super(2);
        this.f52160a = wBS08EcgActivationActivity;
        this.f52161b = nVar;
        this.f52162c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52162c | 1);
        WBS08EcgActivationActivity.M3(this.f52160a, this.f52161b, aVar, g11);
        return nm0.y.f85009a;
    }
}
