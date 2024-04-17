package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51711a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f51712b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51713c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f51714d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51715e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f51716f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(EcgActivationActivity ecgActivationActivity, String str, int i11, int i12, ym0.a<nm0.y> aVar, int i13) {
        super(2);
        this.f51711a = ecgActivationActivity;
        this.f51712b = str;
        this.f51713c = i11;
        this.f51714d = i12;
        this.f51715e = aVar;
        this.f51716f = i13;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51716f | 1);
        int i11 = this.f51714d;
        ym0.a<nm0.y> aVar2 = this.f51715e;
        EcgActivationActivity.H3(this.f51711a, this.f51712b, this.f51713c, i11, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
