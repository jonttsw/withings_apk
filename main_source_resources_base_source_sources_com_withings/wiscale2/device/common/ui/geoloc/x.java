package com.withings.wiscale2.device.common.ui.geoloc;

import com.withings.common.compose.component.ButtonSize;
/* compiled from: WeatherAirQualityScreen.kt */
/* loaded from: classes5.dex */
final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53931a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ym0.a<nm0.y> aVar) {
        super(2);
        this.f53931a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, "Change", null, false, null, ButtonSize.f33303e, false, this.f53931a, aVar2, 196656, 93);
        }
        return nm0.y.f85009a;
    }
}
