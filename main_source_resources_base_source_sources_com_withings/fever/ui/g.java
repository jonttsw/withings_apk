package com.withings.fever.ui;
/* compiled from: BodyTemperatureActivity.kt */
/* loaded from: classes3.dex */
final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyTemperatureActivity f39238a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BodyTemperatureActivity bodyTemperatureActivity) {
        super(2);
        this.f39238a = bodyTemperatureActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            BodyTemperatureActivity bodyTemperatureActivity = this.f39238a;
            m.d(BodyTemperatureActivity.B3(bodyTemperatureActivity), new d(bodyTemperatureActivity), new e(bodyTemperatureActivity), new f(bodyTemperatureActivity), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
