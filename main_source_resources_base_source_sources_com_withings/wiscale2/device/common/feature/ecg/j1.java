package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51436a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rq.e f51437b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51438c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f51439d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(EcgActivationActivity ecgActivationActivity, rq.e eVar, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f51436a = ecgActivationActivity;
        this.f51437b = eVar;
        this.f51438c = aVar;
        this.f51439d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51439d | 1);
        rq.e eVar = this.f51437b;
        ym0.a<nm0.y> aVar2 = this.f51438c;
        EcgActivationActivity.J3(this.f51436a, eVar, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
