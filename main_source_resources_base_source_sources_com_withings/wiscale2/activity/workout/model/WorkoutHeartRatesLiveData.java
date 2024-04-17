package com.withings.wiscale2.activity.workout.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.activity.workout.model.HeartRateVasistasCountChecker;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import lj0.d0;
import lj0.h0;
import nm0.j;
import nm0.o;
import nm0.y;
import xw.p;
/* compiled from: WorkoutHeartRatesLiveData.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001Ba\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0018\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060%0!\u0012\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020!\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a¢\u0006\u0004\b*\u0010+J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000e\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR2\u0010\u001f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#RR\u0010&\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001e0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutHeartRatesLiveData;", "Landroidx/lifecycle/j0;", "", "Lcom/withings/vasistas/model/Vasistas;", "Lcom/withings/wiscale2/track/data/Track;", "workout", "Lcom/withings/workout/category/model/WorkoutCategory;", "category", "pauseVasistas", "Lnm0/y;", "onWorkoutAndVasistasReceived", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/workout/category/model/WorkoutCategory;Ljava/util/List;)V", WsVasistasSerie.KEY_VASISTAS, "pauses", "onVasistasGot", "(Ljava/util/List;Ljava/util/List;Lcom/withings/wiscale2/track/data/Track;)V", "onInactive", "()V", "Llj0/h0;", "vasistasManager", "Llj0/h0;", "", NavigationArguments.USER_ID, "J", "getUserId", "()J", "Lkotlin/Function2;", "onNoVasistas", "Lym0/p;", "Landroidx/lifecycle/l0;", "Lnm0/o;", "observer", "Landroidx/lifecycle/l0;", "Landroidx/lifecycle/LiveData;", "heartRatesLiveData", "Landroidx/lifecycle/LiveData;", "Lxw/p;", "Lnm0/j;", "liveData", "Lxw/p;", "workoutAndCategoryLiveData", "pauseVasistasLiveData", "<init>", "(Llj0/h0;JLandroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lym0/p;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutHeartRatesLiveData extends j0<List<? extends Vasistas>> {
    public static final int $stable = 8;
    private LiveData<List<Vasistas>> heartRatesLiveData;
    private p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>> liveData;
    private final l0<o<Track, WorkoutCategory, List<Vasistas>>> observer;
    private ym0.p<? super WorkoutHeartRatesLiveData, ? super Track, y> onNoVasistas;
    private final long userId;
    private final h0 vasistasManager;

    public WorkoutHeartRatesLiveData(h0 vasistasManager, long j5, LiveData<j<Track, WorkoutCategory>> workoutAndCategoryLiveData, LiveData<List<Vasistas>> pauseVasistasLiveData, ym0.p<? super WorkoutHeartRatesLiveData, ? super Track, y> pVar) {
        u.j(vasistasManager, "vasistasManager");
        u.j(workoutAndCategoryLiveData, "workoutAndCategoryLiveData");
        u.j(pauseVasistasLiveData, "pauseVasistasLiveData");
        this.vasistasManager = vasistasManager;
        this.userId = j5;
        this.onNoVasistas = pVar;
        l0<o<Track, WorkoutCategory, List<Vasistas>>> l0Var = new l0() { // from class: com.withings.wiscale2.activity.workout.model.a
            @Override // androidx.lifecycle.l0
            public final void onChanged(Object obj) {
                WorkoutHeartRatesLiveData.observer$lambda$0(WorkoutHeartRatesLiveData.this, (o) obj);
            }
        };
        this.observer = l0Var;
        p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>> pVar2 = new p<>(workoutAndCategoryLiveData, pauseVasistasLiveData, WorkoutHeartRatesLiveData$liveData$1.INSTANCE);
        this.liveData = pVar2;
        pVar2.observeForever(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(WorkoutHeartRatesLiveData this$0, o it) {
        u.j(this$0, "this$0");
        u.j(it, "it");
        this$0.onWorkoutAndVasistasReceived((Track) it.d(), (WorkoutCategory) it.e(), (List) it.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVasistasGot(List<Vasistas> list, List<Vasistas> list2, Track track) {
        HeartRateVasistasCountChecker.Companion companion = HeartRateVasistasCountChecker.Companion;
        if (!companion.checkIfEnoughVasistas(list, track.getStartDate(), track.getEndDate())) {
            list = null;
        }
        List<Vasistas> filterVasistasOverlappingPauses = WorkoutVasistasFilter.INSTANCE.filterVasistasOverlappingPauses(list, list2);
        if (!companion.checkIfEnoughVasistas(filterVasistasOverlappingPauses, track.getStartDate(), track.getEndDate())) {
            filterVasistasOverlappingPauses = null;
        }
        if (filterVasistasOverlappingPauses == null) {
            filterVasistasOverlappingPauses = i0.f76187a;
        }
        setValue(filterVasistasOverlappingPauses);
        if (filterVasistasOverlappingPauses.isEmpty()) {
            ym0.p<? super WorkoutHeartRatesLiveData, ? super Track, y> pVar = this.onNoVasistas;
            if (pVar != null) {
                pVar.invoke(this, track);
            }
            this.onNoVasistas = null;
        }
    }

    private final void onWorkoutAndVasistasReceived(Track track, WorkoutCategory workoutCategory, List<Vasistas> list) {
        LiveData<List<Vasistas>> liveData = this.heartRatesLiveData;
        if (liveData != null) {
            removeSource(liveData);
        }
        String[] features = workoutCategory.getFeatures();
        u.i(features, "getFeatures(...)");
        if (l.m(features, "hr")) {
            d0 l5 = this.vasistasManager.l(this.userId, Vasistas.Category.BODY, null, track.getStartDate(), track.getEndDate());
            addSource(l5, new WorkoutHeartRatesLiveData$sam$androidx_lifecycle_Observer$0(new WorkoutHeartRatesLiveData$onWorkoutAndVasistasReceived$2$1(this, list, track)));
            this.heartRatesLiveData = l5;
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
}
