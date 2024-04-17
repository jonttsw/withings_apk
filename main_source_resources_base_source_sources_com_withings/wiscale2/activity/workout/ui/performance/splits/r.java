package com.withings.wiscale2.activity.workout.ui.performance.splits;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material.t5;
import androidx.compose.runtime.l0;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
final class r extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50037a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(WorkoutSplitsActivity workoutSplitsActivity) {
        super(2);
        this.f50037a = workoutSplitsActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            WorkoutSplitsActivity workoutSplitsActivity = this.f50037a;
            r0 a11 = t1.d.a(WorkoutSplitsActivity.E3(workoutSplitsActivity).k0(), aVar2);
            r0 a12 = l0.a(WorkoutSplitsActivity.E3(workoutSplitsActivity).m0(), Boolean.TRUE, null, aVar2, 2);
            ok.a o11 = ah.u.o(aVar2);
            t5.b(e1.d(androidx.compose.ui.e.f8927a), null, s1.b.b(aVar2, 1015511784, new o(workoutSplitsActivity, o11)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -2068926065, new q(workoutSplitsActivity, o11, a12, a11)), aVar2, 390, 12582912, 131066);
        }
        return y.f85009a;
    }
}
