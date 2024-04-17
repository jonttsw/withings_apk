package com.withings.wiscale2.activity.workout.model;

import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPauseLiveData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.model.WorkoutPauseLiveData$onWorkoutPauseReceived$2", f = "WorkoutPauseLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class WorkoutPauseLiveData$onWorkoutPauseReceived$2 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    final /* synthetic */ Track $workout;
    int label;
    final /* synthetic */ WorkoutPauseLiveData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutPauseLiveData$onWorkoutPauseReceived$2(WorkoutPauseLiveData workoutPauseLiveData, Track track, qm0.d<? super WorkoutPauseLiveData$onWorkoutPauseReceived$2> dVar) {
        super(2, dVar);
        this.this$0 = workoutPauseLiveData;
        this.$workout = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WorkoutPauseLiveData$onWorkoutPauseReceived$2(this.this$0, this.$workout, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List vasistasPause;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            WorkoutPauseLiveData workoutPauseLiveData = this.this$0;
            vasistasPause = workoutPauseLiveData.getVasistasPause(this.$workout);
            workoutPauseLiveData.postValue(vasistasPause);
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((WorkoutPauseLiveData$onWorkoutPauseReceived$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
