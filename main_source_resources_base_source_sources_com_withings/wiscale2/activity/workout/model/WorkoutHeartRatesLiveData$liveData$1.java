package com.withings.wiscale2.activity.workout.model;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.o;
import nm0.y;
import xw.p;
import ym0.q;
/* compiled from: WorkoutHeartRatesLiveData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\r\u001a\u00020\n2B\u0010\u0007\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00060\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lxw/p;", "Lnm0/j;", "Lcom/withings/wiscale2/track/data/Track;", "Lcom/withings/workout/category/model/WorkoutCategory;", "", "Lcom/withings/vasistas/model/Vasistas;", "Lnm0/o;", "liveData", "workoutAndCategory", "pauseVasistas", "Lnm0/y;", "invoke", "(Lxw/p;Lnm0/j;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class WorkoutHeartRatesLiveData$liveData$1 extends w implements q<p<j<? extends Track, ? extends WorkoutCategory>, List<? extends Vasistas>, o<? extends Track, ? extends WorkoutCategory, ? extends List<? extends Vasistas>>>, j<? extends Track, ? extends WorkoutCategory>, List<? extends Vasistas>, y> {
    public static final WorkoutHeartRatesLiveData$liveData$1 INSTANCE = new WorkoutHeartRatesLiveData$liveData$1();

    WorkoutHeartRatesLiveData$liveData$1() {
        super(3);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>> liveData, j<Track, ? extends WorkoutCategory> workoutAndCategory, List<Vasistas> pauseVasistas) {
        u.j(liveData, "liveData");
        u.j(workoutAndCategory, "workoutAndCategory");
        u.j(pauseVasistas, "pauseVasistas");
        liveData.setValue(new o(workoutAndCategory.c(), workoutAndCategory.d(), pauseVasistas));
    }

    @Override // ym0.q
    public /* bridge */ /* synthetic */ y invoke(p<j<? extends Track, ? extends WorkoutCategory>, List<? extends Vasistas>, o<? extends Track, ? extends WorkoutCategory, ? extends List<? extends Vasistas>>> pVar, j<? extends Track, ? extends WorkoutCategory> jVar, List<? extends Vasistas> list) {
        invoke2((p<j<Track, WorkoutCategory>, List<Vasistas>, o<Track, WorkoutCategory, List<Vasistas>>>) pVar, (j<Track, ? extends WorkoutCategory>) jVar, (List<Vasistas>) list);
        return y.f85009a;
    }
}
