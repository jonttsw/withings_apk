package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51380a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51381b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51382c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EcgActivationActivity ecgActivationActivity, r8.n nVar, int i11) {
        super(2);
        this.f51380a = ecgActivationActivity;
        this.f51381b = nVar;
        this.f51382c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51382c | 1);
        EcgActivationActivity.B3(this.f51380a, this.f51381b, aVar, g11);
        return nm0.y.f85009a;
    }
}
