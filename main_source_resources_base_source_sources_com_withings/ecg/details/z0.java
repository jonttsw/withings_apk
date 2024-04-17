package com.withings.ecg.details;
/* compiled from: EcgInReviewFragment.kt */
/* loaded from: classes3.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a1 f38366a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var) {
        super(2);
        this.f38366a = a1Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            b1.b(null, new y0(this.f38366a), aVar2, 0, 1);
        }
        return nm0.y.f85009a;
    }
}
