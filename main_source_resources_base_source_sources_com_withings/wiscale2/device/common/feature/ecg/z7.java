package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class z7 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f52159a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(a aVar) {
        super(2);
        this.f52159a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            a aVar3 = this.f52159a;
            com.withings.common.compose.component.l.a(null, ay.b.u(aVar3.c(), aVar2), null, aVar3.a(), null, null, false, aVar3.b(), aVar2, 0, 117);
        }
        return nm0.y.f85009a;
    }
}