package com.withings.wiscale2.activity.workout.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.SwimVasistas;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import lj0.w;
import nm0.j;
import nm0.y;
import xw.h;
import xw.i;
import ym0.l;
import ym0.p;
import ym0.q;
/* compiled from: WorkoutSwimVasistasLiveData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001BO\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u0014\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutSwimVasistasLiveData;", "Landroidx/lifecycle/j0;", "", "Lcom/withings/vasistas/model/SwimVasistas;", "Lcom/withings/wiscale2/track/data/Track;", "workout", "Lcom/withings/vasistas/model/Vasistas;", "pauses", ConstantsWs.SUBCATEGORY_FEATURE_LAPS, "Lnm0/y;", "onSwimVasistasGot", "(Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;Ljava/util/List;)V", "onInactive", "()V", "Llj0/w;", "swimVasistasRepository", "Llj0/w;", "Lkotlin/Function2;", "onNoSwimVasistas", "Lym0/p;", "Landroidx/lifecycle/LiveData;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutAndPausesAndLaps;", "workoutAndPausesAndLapsLiveData", "Landroidx/lifecycle/LiveData;", "workoutLiveData", "pauseVasistasLiveData", "<init>", "(Llj0/w;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lym0/p;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutSwimVasistasLiveData extends j0<List<? extends SwimVasistas>> {
    public static final int $stable = 8;
    private p<? super WorkoutSwimVasistasLiveData, ? super Track, y> onNoSwimVasistas;
    private final w swimVasistasRepository;
    private LiveData<WorkoutAndPausesAndLaps> workoutAndPausesAndLapsLiveData;

    /* compiled from: WorkoutSwimVasistasLiveData.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutAndPausesAndLaps;", "kotlin.jvm.PlatformType", "it", "Lnm0/y;", "invoke", "(Lcom/withings/wiscale2/activity/workout/model/WorkoutAndPausesAndLaps;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.wiscale2.activity.workout.model.WorkoutSwimVasistasLiveData$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass2 extends kotlin.jvm.internal.w implements l<WorkoutAndPausesAndLaps, y> {
        AnonymousClass2() {
            super(1);
        }

        @Override // ym0.l
        public /* bridge */ /* synthetic */ y invoke(WorkoutAndPausesAndLaps workoutAndPausesAndLaps) {
            invoke2(workoutAndPausesAndLaps);
            return y.f85009a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WorkoutAndPausesAndLaps workoutAndPausesAndLaps) {
            WorkoutSwimVasistasLiveData.this.onSwimVasistasGot(workoutAndPausesAndLaps.getWorkout(), workoutAndPausesAndLaps.getPauses(), workoutAndPausesAndLaps.getLaps());
        }
    }

    public WorkoutSwimVasistasLiveData(w swimVasistasRepository, LiveData<Track> workoutLiveData, LiveData<List<Vasistas>> pauseVasistasLiveData, p<? super WorkoutSwimVasistasLiveData, ? super Track, y> pVar) {
        u.j(swimVasistasRepository, "swimVasistasRepository");
        u.j(workoutLiveData, "workoutLiveData");
        u.j(pauseVasistasLiveData, "pauseVasistasLiveData");
        this.swimVasistasRepository = swimVasistasRepository;
        this.onNoSwimVasistas = pVar;
        h a11 = i.a(workoutLiveData, WorkoutSwimVasistasLiveData$workoutAndCategoryLiveData$1.INSTANCE);
        xw.p pVar2 = new xw.p(new xw.p(a11, pauseVasistasLiveData, WorkoutSwimVasistasLiveData$workoutAndPausesLiveData$1.INSTANCE), e1.c(a11, new WorkoutSwimVasistasLiveData$lapsLiveData$1(this)), AnonymousClass1.INSTANCE);
        this.workoutAndPausesAndLapsLiveData = pVar2;
        addSource(pVar2, new WorkoutSwimVasistasLiveData$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSwimVasistasGot(Track track, List<Vasistas> list, List<SwimVasistas> list2) {
        List<SwimVasistas> filterSwimVasistasOverlappingPauses = WorkoutVasistasFilter.INSTANCE.filterSwimVasistasOverlappingPauses(list2, list);
        if (filterSwimVasistasOverlappingPauses.size() < 2) {
            filterSwimVasistasOverlappingPauses = null;
        }
        if (filterSwimVasistasOverlappingPauses == null) {
            filterSwimVasistasOverlappingPauses = i0.f76187a;
        }
        setValue(filterSwimVasistasOverlappingPauses);
        if (!filterSwimVasistasOverlappingPauses.isEmpty()) {
            filterSwimVasistasOverlappingPauses = null;
        }
        if (filterSwimVasistasOverlappingPauses != null) {
            p<? super WorkoutSwimVasistasLiveData, ? super Track, y> pVar = this.onNoSwimVasistas;
            if (pVar != null) {
                pVar.invoke(this, track);
            }
            this.onNoSwimVasistas = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public void onInactive() {
        removeSource(this.workoutAndPausesAndLapsLiveData);
        super.onInactive();
    }

    /* compiled from: WorkoutSwimVasistasLiveData.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\r\u001a\u00020\n20\u0010\u0007\u001a,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00060\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lxw/p;", "Lnm0/j;", "Lcom/withings/wiscale2/track/data/Track;", "", "Lcom/withings/vasistas/model/Vasistas;", "Lcom/withings/vasistas/model/SwimVasistas;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutAndPausesAndLaps;", "liveData", "workoutAndPauses", ConstantsWs.SUBCATEGORY_FEATURE_LAPS, "Lnm0/y;", "invoke", "(Lxw/p;Lnm0/j;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.wiscale2.activity.workout.model.WorkoutSwimVasistasLiveData$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends kotlin.jvm.internal.w implements q<xw.p<j<? extends Track, ? extends List<? extends Vasistas>>, List<? extends SwimVasistas>, WorkoutAndPausesAndLaps>, j<? extends Track, ? extends List<? extends Vasistas>>, List<? extends SwimVasistas>, y> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(xw.p<j<Track, List<Vasistas>>, List<SwimVasistas>, WorkoutAndPausesAndLaps> liveData, j<Track, ? extends List<Vasistas>> workoutAndPauses, List<SwimVasistas> laps) {
            u.j(liveData, "liveData");
            u.j(workoutAndPauses, "workoutAndPauses");
            u.j(laps, "laps");
            liveData.setValue(new WorkoutAndPausesAndLaps(workoutAndPauses.c(), workoutAndPauses.d(), laps));
        }

        @Override // ym0.q
        public /* bridge */ /* synthetic */ y invoke(xw.p<j<? extends Track, ? extends List<? extends Vasistas>>, List<? extends SwimVasistas>, WorkoutAndPausesAndLaps> pVar, j<? extends Track, ? extends List<? extends Vasistas>> jVar, List<? extends SwimVasistas> list) {
            invoke2((xw.p<j<Track, List<Vasistas>>, List<SwimVasistas>, WorkoutAndPausesAndLaps>) pVar, (j<Track, ? extends List<Vasistas>>) jVar, (List<SwimVasistas>) list);
            return y.f85009a;
        }
    }
}
