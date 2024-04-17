package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WorkoutListActivity.kt */
/* loaded from: classes4.dex */
public final class v5 extends androidx.lifecycle.b implements WorkoutManager.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final WorkoutManager f49742a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkoutCategoryManager f49743b;

    /* renamed from: c  reason: collision with root package name */
    private final User f49744c;

    /* renamed from: d  reason: collision with root package name */
    private Long f49745d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f49746e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.j0 f49747f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.j0 f49748g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f49749h;

    /* renamed from: i  reason: collision with root package name */
    private final xw.n<Boolean> f49750i;

    /* compiled from: WorkoutListActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Integer, LiveData<WorkoutCategory>> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<WorkoutCategory> invoke(Integer num) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new u5(num, v5.this, null), 2);
        }
    }

    /* compiled from: WorkoutListActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f49752a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Application application) {
            super(1);
            this.f49752a = application;
        }

        @Override // ym0.l
        public final String invoke(WorkoutCategory workoutCategory) {
            String str;
            WorkoutCategory workoutCategory2 = workoutCategory;
            Application application = this.f49752a;
            if (workoutCategory2 != null) {
                str = workoutCategory2.getName(application);
            } else {
                str = null;
            }
            if (str == null) {
                String string = application.getString(C1987R.string._ACTIVITY_);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                return string;
            }
            return str;
        }
    }

    /* compiled from: WorkoutListActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, LiveData<g5>> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<g5> invoke(WorkoutCategory workoutCategory) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new w5(v5.this, workoutCategory, null), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(Application application, WorkoutManager workoutManager, WorkoutCategoryManager workoutCategoryManager, User user, Integer num, Long l5) {
        super(application);
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        kotlin.jvm.internal.u.j(user, "user");
        this.f49742a = workoutManager;
        this.f49743b = workoutCategoryManager;
        this.f49744c = user;
        this.f49745d = l5;
        androidx.lifecycle.k0<Integer> b10 = xw.d.b(num);
        this.f49746e = b10;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(b10, new a());
        this.f49747f = androidx.lifecycle.e1.b(c11, new b(application));
        this.f49748g = androidx.lifecycle.e1.c(c11, new c());
        this.f49749h = new androidx.lifecycle.k0<>();
        this.f49750i = new xw.n<>();
        workoutManager.registerListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final g5 g0(v5 v5Var, WorkoutCategory workoutCategory) {
        ?? allWorkoutsForUser;
        int i11;
        int M;
        long j5;
        WorkoutManager workoutManager = v5Var.f49742a;
        User user = v5Var.f49744c;
        if (workoutCategory != null) {
            long q11 = user.q();
            Long l5 = v5Var.f49745d;
            if (l5 != null) {
                j5 = l5.longValue();
            } else {
                j5 = 0;
            }
            long j11 = j5;
            long id2 = workoutCategory.getId();
            allWorkoutsForUser = new ArrayList();
            for (Object obj : v5Var.f49742a.getWorkoutsAround(q11, j11, id2, "100")) {
                if (workoutManager.shouldBeDisplayed((Track) obj)) {
                    allWorkoutsForUser.add(obj);
                }
            }
        } else {
            allWorkoutsForUser = workoutManager.getAllWorkoutsForUser(user.q());
        }
        ListIterator listIterator = allWorkoutsForUser.listIterator(allWorkoutsForUser.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (kotlin.jvm.internal.u.e(((Track) listIterator.previous()).getId(), v5Var.f49745d)) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (i11 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            M = valueOf.intValue();
        } else {
            M = kotlin.collections.x.M(allWorkoutsForUser);
        }
        Iterable<Track> iterable = (Iterable) allWorkoutsForUser;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(iterable, 10));
        for (Track track : iterable) {
            arrayList.add(new t1(track, v5Var.getApplication(), workoutCategory));
        }
        return new g5(arrayList, M);
    }

    private final boolean p0(Long l5) {
        List<t1> list;
        g5 g5Var = (g5) this.f49748g.getValue();
        if (g5Var != null) {
            list = g5Var.c();
        } else {
            list = null;
        }
        if (list == null) {
            list = kotlin.collections.i0.f76187a;
        }
        List<t1> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (t1 t1Var : list2) {
            long d11 = t1Var.d();
            if (l5 != null && d11 == l5.longValue()) {
                return true;
            }
        }
        return false;
    }

    public final xw.n<Boolean> i0() {
        return this.f49750i;
    }

    public final androidx.lifecycle.k0<Integer> j0() {
        return this.f49749h;
    }

    public final androidx.lifecycle.j0 k0() {
        return this.f49747f;
    }

    public final androidx.lifecycle.j0 m0() {
        return this.f49748g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        super.onCleared();
        this.f49742a.unregisterListener(this);
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackDeleted(long j5, Track track, boolean z5) {
        kotlin.jvm.internal.u.j(track, "track");
        if (p0(track.getId())) {
            this.f49750i.postValue(Boolean.TRUE);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackInserted(long j5, Track track, boolean z5) {
        kotlin.jvm.internal.u.j(track, "track");
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackUpdated(long j5, Track oldTrack, Track newTrack, boolean z5) {
        kotlin.jvm.internal.u.j(oldTrack, "oldTrack");
        kotlin.jvm.internal.u.j(newTrack, "newTrack");
        if (newTrack.getCategory() != oldTrack.getCategory() && p0(newTrack.getId())) {
            this.f49745d = newTrack.getId();
            this.f49746e.postValue(Integer.valueOf(newTrack.getCategory()));
        }
    }
}
