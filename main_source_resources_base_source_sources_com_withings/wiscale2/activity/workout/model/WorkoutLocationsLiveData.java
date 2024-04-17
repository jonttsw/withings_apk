package com.withings.wiscale2.activity.workout.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.q;
import com.withings.ecg.details.w1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.ktx.FilterGpsLocationWithPauseKt;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.o;
import nm0.y;
import xw.i;
import xw.p;
/* compiled from: WorkoutLocationsLiveData.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001Ba\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060(0$\u0012\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020$\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a¢\u0006\u0004\b-\u0010.J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR2\u0010\"\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&RR\u0010)\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020!0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutLocationsLiveData;", "Landroidx/lifecycle/j0;", "", "Lcom/withings/location/model/GpsLocation;", "Lcom/withings/wiscale2/track/data/Track;", "workout", "Lcom/withings/workout/category/model/WorkoutCategory;", "workoutCategory", "Lcom/withings/vasistas/model/Vasistas;", "pauseVasistas", "Lnm0/y;", "onWorkoutAndVasistasReceived", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/workout/category/model/WorkoutCategory;Ljava/util/List;)V", "locations", "onLocationsGot", "(Ljava/util/List;Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;)V", "onInactive", "()V", "Lcom/withings/location/repository/GpsLocationRepository;", "gpsLocationRepository", "Lcom/withings/location/repository/GpsLocationRepository;", "", NavigationArguments.USER_ID, "J", "getUserId", "()J", "Lkotlin/Function2;", "onNoLocations", "Lym0/p;", "Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "filterGpsLocationWithPause", "Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "Landroidx/lifecycle/l0;", "Lnm0/o;", "observer", "Landroidx/lifecycle/l0;", "Landroidx/lifecycle/LiveData;", "gpsLocationsLiveData", "Landroidx/lifecycle/LiveData;", "Lxw/p;", "Lnm0/j;", "liveData", "Lxw/p;", "workoutAndCategory", "pauseVasistasLiveData", "<init>", "(Lcom/withings/location/repository/GpsLocationRepository;JLandroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lym0/p;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutLocationsLiveData extends j0<List<? extends GpsLocation>> {
    public static final int $stable = 8;
    private final FilterGpsLocationWithPause filterGpsLocationWithPause;
    private final GpsLocationRepository gpsLocationRepository;
    private LiveData<List<GpsLocation>> gpsLocationsLiveData;
    private p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>> liveData;
    private final l0<o<Track, WorkoutCategory, List<Vasistas>>> observer;
    private ym0.p<? super WorkoutLocationsLiveData, ? super Track, y> onNoLocations;
    private final long userId;

    public WorkoutLocationsLiveData(GpsLocationRepository gpsLocationRepository, long j5, LiveData<j<Track, WorkoutCategory>> workoutAndCategory, LiveData<List<Vasistas>> pauseVasistasLiveData, ym0.p<? super WorkoutLocationsLiveData, ? super Track, y> pVar) {
        u.j(gpsLocationRepository, "gpsLocationRepository");
        u.j(workoutAndCategory, "workoutAndCategory");
        u.j(pauseVasistasLiveData, "pauseVasistasLiveData");
        this.gpsLocationRepository = gpsLocationRepository;
        this.userId = j5;
        this.onNoLocations = pVar;
        this.filterGpsLocationWithPause = new FilterGpsLocationWithPause();
        w1 w1Var = new w1(this, 1);
        this.observer = w1Var;
        p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>> pVar2 = new p<>(i.a(workoutAndCategory, WorkoutLocationsLiveData$ifChangedWorkoutAndCategory$1.INSTANCE), pauseVasistasLiveData, AnonymousClass1.INSTANCE);
        this.liveData = pVar2;
        pVar2.observeForever(w1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(WorkoutLocationsLiveData this$0, o it) {
        u.j(this$0, "this$0");
        u.j(it, "it");
        this$0.onWorkoutAndVasistasReceived((Track) it.d(), (WorkoutCategory) it.e(), (List) it.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLocationsGot(List<GpsLocation> list, Track track, List<Vasistas> list2) {
        List<Vasistas> list3 = list2;
        ArrayList arrayList = new ArrayList(x.y(list3, 10));
        for (Vasistas vasistas : list3) {
            arrayList.add(new Pause(vasistas.getStartDate(), vasistas.getEnd()));
        }
        FilterGpsLocationWithPause filterGpsLocationWithPause = this.filterGpsLocationWithPause;
        if (list == null) {
            list = i0.f76187a;
        }
        List<GpsLocation> filter = FilterGpsLocationWithPauseKt.filter(filterGpsLocationWithPause, list, arrayList);
        setValue(filter);
        if (filter.isEmpty() && track.getGpsSummary() != null) {
            ym0.p<? super WorkoutLocationsLiveData, ? super Track, y> pVar = this.onNoLocations;
            if (pVar != null) {
                pVar.invoke(this, track);
            }
            this.onNoLocations = null;
        }
    }

    private final void onWorkoutAndVasistasReceived(Track track, WorkoutCategory workoutCategory, List<Vasistas> list) {
        LiveData<List<GpsLocation>> liveData = this.gpsLocationsLiveData;
        if (liveData != null) {
            removeSource(liveData);
        }
        if (workoutCategory.isDistanceRelevant() && !workoutCategory.isIndoor()) {
            androidx.lifecycle.f b10 = q.b(this.gpsLocationRepository.get(this.userId, track.getStartDate(), track.getEndDate()), null, 3);
            addSource(b10, new WorkoutLocationsLiveData$sam$androidx_lifecycle_Observer$0(new WorkoutLocationsLiveData$onWorkoutAndVasistasReceived$2$1(this, track, list)));
            this.gpsLocationsLiveData = b10;
            return;
        }
        setValue(i0.f76187a);
    }

    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public void onInactive() {
        this.liveData.removeObserver(this.observer);
        super.onInactive();
    }

    /* compiled from: WorkoutLocationsLiveData.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00020\u000b2V\u0010\b\u001aR\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00070\u00002&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lxw/p;", "Lnm0/j;", "Lcom/withings/wiscale2/track/data/Track;", "Lcom/withings/workout/category/model/WorkoutCategory;", "kotlin.jvm.PlatformType", "", "Lcom/withings/vasistas/model/Vasistas;", "Lnm0/o;", "liveData", "pairWorkoutCategory", "pauseVasistas", "Lnm0/y;", "invoke", "(Lxw/p;Lnm0/j;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.wiscale2.activity.workout.model.WorkoutLocationsLiveData$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends w implements ym0.q<p<j<? extends Track, ? extends WorkoutCategory>, List<? extends Vasistas>, o<? extends Track, ? extends WorkoutCategory, ? extends List<? extends Vasistas>>>, j<? extends Track, ? extends WorkoutCategory>, List<? extends Vasistas>, y> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>> liveData, j<Track, ? extends WorkoutCategory> jVar, List<Vasistas> pauseVasistas) {
            u.j(liveData, "liveData");
            u.j(pauseVasistas, "pauseVasistas");
            liveData.setValue(new o(jVar.c(), jVar.d(), pauseVasistas));
        }

        @Override // ym0.q
        public /* bridge */ /* synthetic */ y invoke(p<j<? extends Track, ? extends WorkoutCategory>, List<? extends Vasistas>, o<? extends Track, ? extends WorkoutCategory, ? extends List<? extends Vasistas>>> pVar, j<? extends Track, ? extends WorkoutCategory> jVar, List<? extends Vasistas> list) {
            invoke2((p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>>) pVar, (j<Track, ? extends WorkoutCategory>) jVar, (List<Vasistas>) list);
            return y.f85009a;
        }
    }
}
