package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class r7 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51693a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51694b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f51695c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f51696d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51697e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51698f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f51699g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, boolean z5, boolean z11, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f51693a = wBS08EcgActivationActivity;
        this.f51694b = nVar;
        this.f51695c = z5;
        this.f51696d = z11;
        this.f51697e = aVar;
        this.f51698f = aVar2;
        this.f51699g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51699g | 1);
        ym0.a<nm0.y> aVar2 = this.f51697e;
        ym0.a<nm0.y> aVar3 = this.f51698f;
        WBS08EcgActivationActivity.H3(this.f51693a, this.f51694b, this.f51695c, this.f51696d, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
