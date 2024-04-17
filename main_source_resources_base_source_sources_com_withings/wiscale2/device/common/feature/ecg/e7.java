package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class e7 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51305a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f51306b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51307c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f51308d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51309e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a f51310f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ a f51311g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f51312h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f51313i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(WBS08EcgActivationActivity wBS08EcgActivationActivity, int i11, int i12, int i13, ym0.a<nm0.y> aVar, a aVar2, a aVar3, int i14, int i15) {
        super(2);
        this.f51305a = wBS08EcgActivationActivity;
        this.f51306b = i11;
        this.f51307c = i12;
        this.f51308d = i13;
        this.f51309e = aVar;
        this.f51310f = aVar2;
        this.f51311g = aVar3;
        this.f51312h = i14;
        this.f51313i = i15;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51312h | 1);
        a aVar2 = this.f51310f;
        a aVar3 = this.f51311g;
        WBS08EcgActivationActivity.F3(this.f51305a, this.f51306b, this.f51307c, this.f51308d, this.f51309e, aVar2, aVar3, aVar, g11, this.f51313i);
        return nm0.y.f85009a;
    }
}
