package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class s8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51733a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51734b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51735c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f51736d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f51737e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f51738f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(WBS08EcgActivationActivity wBS08EcgActivationActivity, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, String str, int i11, int i12) {
        super(2);
        this.f51733a = wBS08EcgActivationActivity;
        this.f51734b = aVar;
        this.f51735c = aVar2;
        this.f51736d = str;
        this.f51737e = i11;
        this.f51738f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51737e | 1);
        this.f51733a.z3(g11, this.f51738f, aVar, this.f51736d, this.f51734b, this.f51735c);
        return nm0.y.f85009a;
    }
}
