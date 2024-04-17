package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51286a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f51287b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51288c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f51289d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51290e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f51291f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(EcgActivationActivity ecgActivationActivity, int i11, int i12, int i13, ym0.a<nm0.y> aVar, int i14) {
        super(2);
        this.f51286a = ecgActivationActivity;
        this.f51287b = i11;
        this.f51288c = i12;
        this.f51289d = i13;
        this.f51290e = aVar;
        this.f51291f = i14;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51291f | 1);
        int i11 = this.f51289d;
        ym0.a<nm0.y> aVar2 = this.f51290e;
        EcgActivationActivity.D3(this.f51286a, this.f51287b, this.f51288c, i11, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
