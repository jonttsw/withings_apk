package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class e6 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51300a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f51301b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f51302c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51303d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f51304e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(WBS08EcgActivationActivity wBS08EcgActivationActivity, boolean z5, r8.n nVar, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f51300a = wBS08EcgActivationActivity;
        this.f51301b = z5;
        this.f51302c = nVar;
        this.f51303d = aVar;
        this.f51304e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51304e | 1);
        r8.n nVar = this.f51302c;
        ym0.a<nm0.y> aVar2 = this.f51303d;
        WBS08EcgActivationActivity.A3(this.f51300a, this.f51301b, nVar, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
