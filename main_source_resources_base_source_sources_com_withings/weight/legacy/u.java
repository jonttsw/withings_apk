package com.withings.weight.legacy;
/* compiled from: WeightDetailFragment.kt */
/* loaded from: classes4.dex */
final class u extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f47084a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(n nVar) {
        super(2);
        this.f47084a = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, 1172706585, new t(this.f47084a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
