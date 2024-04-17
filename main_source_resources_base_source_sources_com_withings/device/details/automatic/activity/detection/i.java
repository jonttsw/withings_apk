package com.withings.device.details.automatic.activity.detection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36712a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f36713b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f36714c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f36715d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(AutomaticActivityDetection automaticActivityDetection, boolean z5, ym0.l<? super Boolean, nm0.y> lVar, int i11) {
        super(2);
        this.f36712a = automaticActivityDetection;
        this.f36713b = z5;
        this.f36714c = lVar;
        this.f36715d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f36715d | 1);
        boolean z5 = this.f36713b;
        ym0.l<Boolean, nm0.y> lVar = this.f36714c;
        AutomaticActivityDetection.z3(this.f36712a, z5, lVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
