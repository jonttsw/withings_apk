package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Application;
import android.content.Context;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.user.User;
import com.withings.wiscale2.activity.workout.model.DistanceSelector;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import pm.e;
/* compiled from: WorkoutPreviewViewModel.kt */
/* loaded from: classes4.dex */
public final class o7 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f49517a;

    /* renamed from: b  reason: collision with root package name */
    private final n7 f49518b;

    /* renamed from: c  reason: collision with root package name */
    private final Flow<List<WorkoutCategory>> f49519c;

    /* renamed from: d  reason: collision with root package name */
    private final Flow<List<a>> f49520d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Long> f49521e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableStateFlow<Integer> f49522f;

    /* renamed from: g  reason: collision with root package name */
    private final Flow<List<Track>> f49523g;

    /* renamed from: h  reason: collision with root package name */
    private final Flow<List<l7>> f49524h;

    /* compiled from: WorkoutPreviewViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final WorkoutCategory f49525a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49526b;

        public a(WorkoutCategory workoutCategory, int i11) {
            this.f49525a = workoutCategory;
            this.f49526b = i11;
        }

        public final WorkoutCategory a() {
            return this.f49525a;
        }

        public final int b() {
            return this.f49526b;
        }

        public final int c() {
            return this.f49526b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f49525a, aVar.f49525a) && this.f49526b == aVar.f49526b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f49526b) + (this.f49525a.hashCode() * 31);
        }

        public final String toString() {
            return "WorkoutCountByCategory(category=" + this.f49525a + ", count=" + this.f49526b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    public o7(Application application, User user, jm.a aVar, DistanceSelector distanceSelector, e.a aVar2, WorkoutManager workoutManager, WorkoutCategoryManager workoutCategoryManager, HasEnoughGpsLocations hasEnoughGpsLocations, ComputePace computePace, ComputeSpeed computeSpeed, GpsLocationRepository gpsLocationRepository) {
        super(application);
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        this.f49517a = 100;
        Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
        this.f49518b = new n7(applicationContext, user, aVar, distanceSelector, aVar2, workoutManager, workoutCategoryManager, hasEnoughGpsLocations, computePace, computeSpeed, gpsLocationRepository);
        Flow<List<WorkoutCategory>> flowOn = FlowKt.flowOn(FlowKt.flow(new p7(workoutCategoryManager, null)), Dispatchers.getIO());
        this.f49519c = flowOn;
        this.f49520d = FlowKt.conflate(FlowKt.flowOn(FlowKt.combine(flowOn, workoutManager.getWorkoutCountByCategory(user.q()), new kotlin.coroutines.jvm.internal.i(3, null)), Dispatchers.getIO()));
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(-1L);
        this.f49521e = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(100);
        this.f49522f = MutableStateFlow2;
        Flow<List<Track>> flowOn2 = FlowKt.flowOn(w70.b.b(MutableStateFlow2, MutableStateFlow, new q7(workoutManager, user, null)), Dispatchers.getIO());
        this.f49523g = flowOn2;
        this.f49524h = FlowKt.flowOn(FlowKt.mapLatest(flowOn2, new u7(workoutManager, this, null)), Dispatchers.getIO());
    }

    public final Flow<List<a>> m0() {
        return this.f49520d;
    }

    public final Flow<List<l7>> p0() {
        return this.f49524h;
    }
}
