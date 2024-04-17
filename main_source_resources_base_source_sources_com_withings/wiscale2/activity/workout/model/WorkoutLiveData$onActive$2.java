package com.withings.wiscale2.activity.workout.model;

import com.withings.wiscale2.track.data.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: WorkoutLiveData.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/wiscale2/track/data/Track;", "it", "Lnm0/y;", "invoke", "(Lcom/withings/wiscale2/track/data/Track;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class WorkoutLiveData$onActive$2 extends w implements l<Track, y> {
    final /* synthetic */ WorkoutLiveData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutLiveData$onActive$2(WorkoutLiveData workoutLiveData) {
        super(1);
        this.this$0 = workoutLiveData;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Track track) {
        invoke2(track);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Track track) {
        this.this$0.setValue(track);
    }
}
