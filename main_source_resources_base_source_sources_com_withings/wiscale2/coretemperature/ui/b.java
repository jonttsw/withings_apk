package com.withings.wiscale2.coretemperature.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ExploreCoreTemperatureActivity.kt */
/* loaded from: classes4.dex */
final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreCoreTemperatureActivity f50424a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExploreCoreTemperatureActivity exploreCoreTemperatureActivity) {
        super(2);
        this.f50424a = exploreCoreTemperatureActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ExploreCoreTemperatureActivity exploreCoreTemperatureActivity = this.f50424a;
            e.a(ExploreCoreTemperatureActivity.A3(exploreCoreTemperatureActivity), new a(exploreCoreTemperatureActivity), aVar2, 8);
        }
        return y.f85009a;
    }
}
