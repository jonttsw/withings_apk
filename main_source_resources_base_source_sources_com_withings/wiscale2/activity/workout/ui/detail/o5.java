package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutListActivity.kt */
/* loaded from: classes4.dex */
final class o5 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutListActivity f49512a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(WorkoutListActivity workoutListActivity) {
        super(1);
        this.f49512a = workoutListActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        this.f49512a.setTitle(it);
        return nm0.y.f85009a;
    }
}
