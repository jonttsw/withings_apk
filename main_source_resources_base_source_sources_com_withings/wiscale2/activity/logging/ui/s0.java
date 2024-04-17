package com.withings.wiscale2.activity.logging.ui;

import android.os.Parcelable;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.WorkoutData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$setCaloriesAuto$1$1", f = "EditWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m0 f48451a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f48452b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(m0 m0Var, Track track, qm0.d<? super s0> dVar) {
        super(2, dVar);
        this.f48451a = m0Var;
        this.f48452b = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s0(this.f48451a, this.f48452b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ba0.a aVar;
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m0 m0Var = this.f48451a;
        int i11 = 0;
        m0Var.w1(0);
        aVar = m0Var.M;
        if (aVar != null) {
            Track track = this.f48452b;
            Parcelable data = track.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            num = new Integer(aVar.a(((WorkoutData) data).getIntensity(), m0.m0(m0Var, track)));
        } else {
            num = null;
        }
        if (num != null) {
            i11 = num.intValue();
        }
        m0.G0(m0Var, i11);
        return nm0.y.f85009a;
    }
}
