package com.withings.wiscale2.activity.workout.ui.performance.splits;

import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import s0.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
public final class m extends w implements ym0.l<i0, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ nm0.j<List<b>, Integer> f50025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50026b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(nm0.j<? extends List<b>, Integer> jVar, WorkoutSplitsActivity workoutSplitsActivity) {
        super(1);
        this.f50025a = jVar;
        this.f50026b = workoutSplitsActivity;
    }

    @Override // ym0.l
    public final y invoke(i0 i0Var) {
        i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        List<b> c11 = this.f50025a.c();
        LazyColumn.c(c11.size(), null, new k(c11), new s1.a(true, -1091073711, new l(c11, this.f50026b)));
        return y.f85009a;
    }
}
