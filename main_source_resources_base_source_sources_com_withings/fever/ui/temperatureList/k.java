package com.withings.fever.ui.temperatureList;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TemperatureListActivity.kt */
/* loaded from: classes3.dex */
final class k extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TemperatureListActivity f39438a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TemperatureListActivity temperatureListActivity) {
        super(2);
        this.f39438a = temperatureListActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.core.ui.b.a(s1.b.b(aVar2, -190109708, new j(this.f39438a)), aVar2, 6);
        }
        return y.f85009a;
    }
}
