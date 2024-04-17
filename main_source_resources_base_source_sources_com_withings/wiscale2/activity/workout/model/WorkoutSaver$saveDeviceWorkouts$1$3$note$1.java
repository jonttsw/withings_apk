package com.withings.wiscale2.activity.workout.model;

import com.withings.wiscale2.track.data.Track;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSaver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.model.WorkoutSaver$saveDeviceWorkouts$1$3$note$1", f = "WorkoutSaver.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class WorkoutSaver$saveDeviceWorkouts$1$3$note$1 extends i implements p<CoroutineScope, qm0.d<? super String>, Object> {
    final /* synthetic */ String $email;
    final /* synthetic */ Track $track;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutSaver$saveDeviceWorkouts$1$3$note$1(Track track, String str, qm0.d<? super WorkoutSaver$saveDeviceWorkouts$1$3$note$1> dVar) {
        super(2, dVar);
        this.$track = track;
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WorkoutSaver$saveDeviceWorkouts$1$3$note$1(this.$track, this.$email, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pi.f getNewPatientSessionWorkoutNote;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            getNewPatientSessionWorkoutNote = WorkoutSaver.INSTANCE.getGetNewPatientSessionWorkoutNote();
            long userId = this.$track.getUserId();
            String str = this.$email;
            DateTime startDate = this.$track.getStartDate();
            this.label = 1;
            obj = getNewPatientSessionWorkoutNote.c(userId, startDate, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
        return ((WorkoutSaver$saveDeviceWorkouts$1$3$note$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
