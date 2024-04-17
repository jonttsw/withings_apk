package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WorkoutDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$createShouldCalculateVo2MaxNoGpsLiveData$1$1", f = "WorkoutDetailViewModel.kt", l = {584, 583}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class t3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49649a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49650b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ nj0.a f49651c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Track f49652d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ WorkoutCategory f49653e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(nj0.a aVar, Track track, WorkoutCategory workoutCategory, qm0.d<? super t3> dVar) {
        super(2, dVar);
        this.f49651c = aVar;
        this.f49652d = track;
        this.f49653e = workoutCategory;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        t3 t3Var = new t3(this.f49651c, this.f49652d, this.f49653e, dVar);
        t3Var.f49650b = obj;
        return t3Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((t3) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49649a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f49650b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f49650b;
            this.f49650b = h0Var;
            this.f49649a = 1;
            obj = this.f49651c.l(this.f49652d, this.f49653e, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f49650b = null;
        this.f49649a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
