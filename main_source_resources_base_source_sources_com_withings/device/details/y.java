package com.withings.device.details;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f37359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h hVar) {
        super(2);
        this.f37359a = hVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, 1077081870, new x(this.f37359a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
