package com.withings.wiscale2.activity.workout.model;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import xw.p;
import ym0.q;
/* compiled from: WorkoutSwimVasistasLiveData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b22\u0010\u0005\u001a.\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00040\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lxw/p;", "Lcom/withings/wiscale2/track/data/Track;", "", "Lcom/withings/vasistas/model/Vasistas;", "Lnm0/j;", "liveData", "workout", "pauseVasistas", "Lnm0/y;", "invoke", "(Lxw/p;Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class WorkoutSwimVasistasLiveData$workoutAndPausesLiveData$1 extends w implements q<p<Track, List<? extends Vasistas>, j<? extends Track, ? extends List<? extends Vasistas>>>, Track, List<? extends Vasistas>, y> {
    public static final WorkoutSwimVasistasLiveData$workoutAndPausesLiveData$1 INSTANCE = new WorkoutSwimVasistasLiveData$workoutAndPausesLiveData$1();

    WorkoutSwimVasistasLiveData$workoutAndPausesLiveData$1() {
        super(3);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(p<Track, List<Vasistas>, j<Track, List<Vasistas>>> liveData, Track track, List<Vasistas> pauseVasistas) {
        u.j(liveData, "liveData");
        u.j(pauseVasistas, "pauseVasistas");
        if (track != null) {
            liveData.setValue(new j(track, pauseVasistas));
        }
    }

    @Override // ym0.q
    public /* bridge */ /* synthetic */ y invoke(p<Track, List<? extends Vasistas>, j<? extends Track, ? extends List<? extends Vasistas>>> pVar, Track track, List<? extends Vasistas> list) {
        invoke2((p<Track, List<Vasistas>, j<Track, List<Vasistas>>>) pVar, track, (List<Vasistas>) list);
        return y.f85009a;
    }
}
