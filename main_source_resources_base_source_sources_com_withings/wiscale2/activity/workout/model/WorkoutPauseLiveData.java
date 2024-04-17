package com.withings.wiscale2.activity.workout.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import com.withings.ecg.live.r;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import lj0.d0;
import lj0.h0;
import nm0.y;
import xw.h;
import xw.i;
import ym0.l;
/* compiled from: WorkoutPauseLiveData.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001BE\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040!\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutPauseLiveData;", "Landroidx/lifecycle/j0;", "", "Lcom/withings/vasistas/model/Vasistas;", "Lcom/withings/wiscale2/track/data/Track;", "workout", "Lnm0/y;", "onWorkoutPauseReceived", "(Lcom/withings/wiscale2/track/data/Track;)V", "getVasistasPause", "(Lcom/withings/wiscale2/track/data/Track;)Ljava/util/List;", "onInactive", "()V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Llj0/h0;", "vasistasManager", "Llj0/h0;", "", NavigationArguments.USER_ID, "J", "getUserId", "()J", "Lkotlin/Function1;", "onNoVasistasPause", "Lym0/l;", "Landroidx/lifecycle/l0;", "observer", "Landroidx/lifecycle/l0;", "Lxw/h;", "ifChangedWorkout", "Lxw/h;", "Landroidx/lifecycle/LiveData;", "workoutLiveData", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Llj0/h0;JLandroidx/lifecycle/LiveData;Lym0/l;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutPauseLiveData extends j0<List<? extends Vasistas>> {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private h<Track> ifChangedWorkout;
    private final l0<Track> observer;
    private l<? super Track, y> onNoVasistasPause;
    private final long userId;
    private final h0 vasistasManager;

    public WorkoutPauseLiveData(CoroutineScope coroutineScope, h0 vasistasManager, long j5, LiveData<Track> workoutLiveData, l<? super Track, y> lVar) {
        u.j(coroutineScope, "coroutineScope");
        u.j(vasistasManager, "vasistasManager");
        u.j(workoutLiveData, "workoutLiveData");
        this.coroutineScope = coroutineScope;
        this.vasistasManager = vasistasManager;
        this.userId = j5;
        this.onNoVasistasPause = lVar;
        r rVar = new r(this, 1);
        this.observer = rVar;
        h<Track> a11 = i.a(workoutLiveData, WorkoutPauseLiveData$ifChangedWorkout$1.INSTANCE);
        this.ifChangedWorkout = a11;
        a11.observeForever(rVar);
    }

    public final List<Vasistas> getVasistasPause(Track track) {
        List<Vasistas> o11 = this.vasistasManager.o(track.getUserId(), Vasistas.Category.PAUSE, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        if (o11.isEmpty()) {
            l<? super Track, y> lVar = this.onNoVasistasPause;
            if (lVar != null) {
                lVar.invoke(track);
            }
            return i0.f76187a;
        }
        return o11;
    }

    public static final void observer$lambda$1(WorkoutPauseLiveData this$0, Track track) {
        u.j(this$0, "this$0");
        if (track != null) {
            this$0.onWorkoutPauseReceived(track);
        }
    }

    private final void onWorkoutPauseReceived(Track track) {
        d0 l5 = this.vasistasManager.l(track.getUserId(), Vasistas.Category.PAUSE, null, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        addSource(l5, new WorkoutPauseLiveData$sam$androidx_lifecycle_Observer$0(new WorkoutPauseLiveData$onWorkoutPauseReceived$1(this, l5)));
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new WorkoutPauseLiveData$onWorkoutPauseReceived$2(this, track, null), 2, null);
    }

    public final long getUserId() {
        return this.userId;
    }

    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public void onInactive() {
        this.ifChangedWorkout.removeObserver(this.observer);
        super.onInactive();
    }
}
