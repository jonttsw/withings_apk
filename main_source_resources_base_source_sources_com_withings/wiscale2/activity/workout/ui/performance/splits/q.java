package com.withings.wiscale2.activity.workout.ui.performance.splits;

import androidx.compose.foundation.layout.e1;
import java.util.List;
import k1.o1;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
final class q extends w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50033a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ok.a f50034b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<Boolean> f50035c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o1<nm0.j<List<b>, Integer>> f50036d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(WorkoutSplitsActivity workoutSplitsActivity, ok.a aVar, r0 r0Var, r0 r0Var2) {
        super(3);
        this.f50033a = workoutSplitsActivity;
        this.f50034b = aVar;
        this.f50035c = r0Var;
        this.f50036d = r0Var2;
    }

    @Override // ym0.q
    public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            boolean booleanValue = this.f50035c.getValue().booleanValue();
            WorkoutSplitsActivity workoutSplitsActivity = this.f50033a;
            if (booleanValue) {
                aVar2.s(-1710439900);
                workoutSplitsActivity.z3(aVar2, 8);
                aVar2.J();
            } else {
                aVar2.s(-1710439831);
                l0.p.a(this.f50036d.getValue(), androidx.compose.ui.input.nestedscroll.a.a(e1.d(androidx.compose.ui.e.f8927a), this.f50034b.a(), null), null, null, s1.b.b(aVar2, -663449724, new p(workoutSplitsActivity)), aVar2, 24584, 12);
                aVar2.J();
            }
        }
        return y.f85009a;
    }
}
