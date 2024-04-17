package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f52075a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52076b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(2);
        this.f52075a = nVar;
        this.f52076b = ecgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n nVar = this.f52075a;
            androidx.navigation.compose.s.b(nVar, "Loading", null, null, null, i.f51407a, j.f51434a, null, null, new v(nVar, this.f52076b), aVar2, 1769528, 412);
        }
        return nm0.y.f85009a;
    }
}
