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
/* compiled from: RecognizedWorkoutSaver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.model.RecognizedWorkoutSaver$getWorkoutNoteIfNecessary$1", f = "RecognizedWorkoutSaver.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RecognizedWorkoutSaver$getWorkoutNoteIfNecessary$1 extends i implements p<CoroutineScope, qm0.d<? super String>, Object> {
    final /* synthetic */ Track $track;
    int label;
    final /* synthetic */ RecognizedWorkoutSaver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognizedWorkoutSaver$getWorkoutNoteIfNecessary$1(RecognizedWorkoutSaver recognizedWorkoutSaver, Track track, qm0.d<? super RecognizedWorkoutSaver$getWorkoutNoteIfNecessary$1> dVar) {
        super(2, dVar);
        this.this$0 = recognizedWorkoutSaver;
        this.$track = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new RecognizedWorkoutSaver$getWorkoutNoteIfNecessary$1(this.this$0, this.$track, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pi.f fVar;
        long j5;
        vf.c cVar;
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
            fVar = this.this$0.getNewPatientSessionWorkoutNote;
            j5 = this.this$0.userId;
            cVar = this.this$0.accountManager;
            String b10 = cVar.h().b();
            DateTime startDate = this.$track.getStartDate();
            this.label = 1;
            obj = fVar.c(j5, startDate, b10, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
        return ((RecognizedWorkoutSaver$getWorkoutNoteIfNecessary$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
