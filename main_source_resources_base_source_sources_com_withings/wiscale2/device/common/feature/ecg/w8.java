package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class w8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52089a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f52090b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(WBS08EcgActivationActivity wBS08EcgActivationActivity, int i11) {
        super(2);
        this.f52089a = wBS08EcgActivationActivity;
        this.f52090b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52090b | 1);
        WBS08EcgActivationActivity.L3(this.f52089a, aVar, g11);
        return nm0.y.f85009a;
    }
}
