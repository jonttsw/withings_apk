package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class l3 extends kotlin.jvm.internal.w implements ym0.l<Track, LiveData<WorkoutCategory>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutCategoryManager f49405a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(WorkoutCategoryManager workoutCategoryManager) {
        super(1);
        this.f49405a = workoutCategoryManager;
    }

    @Override // ym0.l
    public final LiveData<WorkoutCategory> invoke(Track track) {
        Track track2 = track;
        if (track2 == null) {
            return null;
        }
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new k3(this.f49405a, track2, null), 2);
    }
}
