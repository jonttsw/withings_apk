package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutListActivity.kt */
/* loaded from: classes4.dex */
final class q5 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutListActivity f49568a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(WorkoutListActivity workoutListActivity) {
        super(1);
        this.f49568a = workoutListActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        if (bool != null) {
            this.f49568a.finish();
        }
        return nm0.y.f85009a;
    }
}
