package com.withings.wiscale2.activity.workout.model;

import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutLocationsLiveData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnm0/j;", "Lcom/withings/wiscale2/track/data/Track;", "Lcom/withings/workout/category/model/WorkoutCategory;", "oldValue", "newValue", "", "invoke", "(Lnm0/j;Lnm0/j;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutLocationsLiveData$ifChangedWorkoutAndCategory$1 extends w implements p<j<? extends Track, ? extends WorkoutCategory>, j<? extends Track, ? extends WorkoutCategory>, Boolean> {
    public static final WorkoutLocationsLiveData$ifChangedWorkoutAndCategory$1 INSTANCE = new WorkoutLocationsLiveData$ifChangedWorkoutAndCategory$1();

    WorkoutLocationsLiveData$ifChangedWorkoutAndCategory$1() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(j<Track, ? extends WorkoutCategory> oldValue, j<Track, ? extends WorkoutCategory> newValue) {
        u.j(oldValue, "oldValue");
        u.j(newValue, "newValue");
        Track a11 = oldValue.a();
        WorkoutCategory b10 = oldValue.b();
        Track a12 = newValue.a();
        return Boolean.valueOf((u.e(a11.getStartDate(), a12.getStartDate()) && u.e(a11.getEndDate(), a12.getEndDate()) && u.e(b10, newValue.b())) ? false : true);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Boolean invoke(j<? extends Track, ? extends WorkoutCategory> jVar, j<? extends Track, ? extends WorkoutCategory> jVar2) {
        return invoke2((j<Track, ? extends WorkoutCategory>) jVar, (j<Track, ? extends WorkoutCategory>) jVar2);
    }
}
