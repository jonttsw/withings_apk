package com.withings.wiscale2.activity.workout.model;

import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import lj0.h0;
import m70.i;
/* compiled from: WorkoutSaver.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WorkoutSaver$workoutDataBuilder$2 extends w implements ym0.a<WorkoutDataBuilder> {
    public static final WorkoutSaver$workoutDataBuilder$2 INSTANCE = new WorkoutSaver$workoutDataBuilder$2();

    WorkoutSaver$workoutDataBuilder$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ka0.c] */
    @Override // ym0.a
    public final WorkoutDataBuilder invoke() {
        i userManager;
        h0 e11 = h0.e();
        u.i(e11, "get(...)");
        lj0.w wVar = lj0.w.f79924c;
        if (wVar != null) {
            userManager = WorkoutSaver.INSTANCE.getUserManager();
            WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
            u.i(workoutCategoryManager, "get(...)");
            return new WorkoutDataBuilder(e11, wVar, userManager, workoutCategoryManager, new Object());
        }
        u.s("instance");
        throw null;
    }
}
