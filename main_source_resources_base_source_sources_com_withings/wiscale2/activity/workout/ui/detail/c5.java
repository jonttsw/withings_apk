package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: WorkoutHeartRateZonesView.kt */
/* loaded from: classes4.dex */
final class c5 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<com.withings.common.compose.component.u1> f49148a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(List<com.withings.common.compose.component.u1> list) {
        super(2);
        this.f49148a = list;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            uj.q.a(null, ay.b.u(C1987R.string._HEART_RATE_ZONES_, aVar2), null, this.f49148a, aVar2, 4096, 5);
        }
        return nm0.y.f85009a;
    }
}
