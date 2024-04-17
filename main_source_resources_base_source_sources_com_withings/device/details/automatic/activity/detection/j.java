package com.withings.device.details.automatic.activity.detection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36716a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f36717b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AutomaticActivityDetection automaticActivityDetection, int i11) {
        super(2);
        this.f36716a = automaticActivityDetection;
        this.f36717b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f36717b | 1);
        AutomaticActivityDetection.A3(this.f36716a, aVar, g11);
        return nm0.y.f85009a;
    }
}
