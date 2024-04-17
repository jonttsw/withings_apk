package com.withings.nervehealth.ui.guidedscan;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanScreen.kt */
/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42603a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42604b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42605c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f42603a = aVar;
        this.f42604b = aVar2;
        this.f42605c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42605c | 1);
        v.e(this.f42603a, this.f42604b, aVar, g11);
        return nm0.y.f85009a;
    }
}
