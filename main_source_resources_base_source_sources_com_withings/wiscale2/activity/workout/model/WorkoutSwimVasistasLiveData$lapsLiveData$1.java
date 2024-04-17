package com.withings.wiscale2.activity.workout.model;

import androidx.lifecycle.LiveData;
import com.withings.vasistas.model.SwimVasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.w;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSwimVasistasLiveData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/withings/wiscale2/track/data/Track;", "workout", "Landroidx/lifecycle/LiveData;", "", "Lcom/withings/vasistas/model/SwimVasistas;", "invoke", "(Lcom/withings/wiscale2/track/data/Track;)Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutSwimVasistasLiveData$lapsLiveData$1 extends w implements l<Track, LiveData<List<SwimVasistas>>> {
    final /* synthetic */ WorkoutSwimVasistasLiveData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutSwimVasistasLiveData$lapsLiveData$1(WorkoutSwimVasistasLiveData workoutSwimVasistasLiveData) {
        super(1);
        this.this$0 = workoutSwimVasistasLiveData;
    }

    @Override // ym0.l
    public final LiveData<List<SwimVasistas>> invoke(Track track) {
        lj0.w wVar;
        if (track != null) {
            wVar = this.this$0.swimVasistasRepository;
            return wVar.b(track.getUserId(), TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        }
        return xw.d.a(i0.f76187a);
    }
}
