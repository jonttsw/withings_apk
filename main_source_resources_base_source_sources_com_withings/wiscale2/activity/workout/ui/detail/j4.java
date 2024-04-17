package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.activity.workout.model.WorkoutLocationsLiveData;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
/* compiled from: WorkoutHeader.kt */
/* loaded from: classes4.dex */
public final class j4 extends androidx.lifecycle.j0<c4> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49330a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<Track> f49331b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveData<WorkoutCategory> f49332c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<List<GpsLocation>> f49333d;

    /* renamed from: e  reason: collision with root package name */
    private final HasEnoughGpsLocations f49334e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.j0 f49335f;

    /* compiled from: WorkoutHeader.kt */
    /* loaded from: classes4.dex */
    static final class a implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f49336a;

        a(ym0.l lVar) {
            this.f49336a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f49336a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f49336a;
        }

        public final int hashCode() {
            return this.f49336a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49336a.invoke(obj);
        }
    }

    public j4(Context context, LiveData workout, androidx.lifecycle.k0 k0Var, WorkoutLocationsLiveData workoutLocationsLiveData, HasEnoughGpsLocations hasEnoughGpsLocations) {
        kotlin.jvm.internal.u.j(workout, "workout");
        kotlin.jvm.internal.u.j(hasEnoughGpsLocations, "hasEnoughGpsLocations");
        this.f49330a = context;
        this.f49331b = workout;
        this.f49332c = k0Var;
        this.f49333d = workoutLocationsLiveData;
        this.f49334e = hasEnoughGpsLocations;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(workoutLocationsLiveData, new i4(this));
        this.f49335f = c11;
        addSource(workout, new a(new d4(this)));
        addSource(k0Var, new a(new e4(this)));
        addSource(workoutLocationsLiveData, new a(new f4(this)));
        addSource(c11, new a(new g4(this)));
    }

    public static final void y(j4 j4Var) {
        cr.b.a(new nm0.o(j4Var.f49331b.getValue(), j4Var.f49332c.getValue(), j4Var.f49333d.getValue()), new k4(j4Var));
    }
}
