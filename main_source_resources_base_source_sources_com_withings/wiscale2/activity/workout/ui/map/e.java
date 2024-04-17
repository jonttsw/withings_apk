package com.withings.wiscale2.activity.workout.ui.map;

import ab0.k;
import java.util.List;
import kotlin.collections.x;
/* compiled from: WorkoutMapActivity.kt */
/* loaded from: classes4.dex */
public final class e implements k.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutMapActivity f49875a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(WorkoutMapActivity workoutMapActivity) {
        this.f49875a = workoutMapActivity;
    }

    @Override // ab0.k.a
    public final List<qf0.b> a(List<ab0.f> list) {
        float c11 = list.get(0).c();
        WorkoutMapActivity workoutMapActivity = this.f49875a;
        return x.W(WorkoutMapActivity.H3(workoutMapActivity, c11), WorkoutMapActivity.G3(workoutMapActivity, list.get(1).c()));
    }
}
