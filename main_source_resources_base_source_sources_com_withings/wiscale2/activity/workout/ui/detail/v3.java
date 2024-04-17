package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WorkoutDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$createVo2MaxLiveData$1$1", f = "WorkoutDetailViewModel.kt", l = {631, 630}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class v3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<MeasuresGroup>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49735a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49736b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j3 f49737c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Track f49738d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(j3 j3Var, Track track, qm0.d<? super v3> dVar) {
        super(2, dVar);
        this.f49737c = j3Var;
        this.f49738d = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        v3 v3Var = new v3(this.f49737c, this.f49738d, dVar);
        v3Var.f49736b = obj;
        return v3Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<MeasuresGroup> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((v3) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        fy.l lVar;
        MeasuresGroup measuresGroup;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49735a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f49736b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f49736b;
            j3 j3Var = this.f49737c;
            lVar = j3Var.f49260k;
            long q11 = j3Var.f49250a.q();
            Track track = this.f49738d;
            this.f49736b = h0Var;
            this.f49735a = 1;
            obj = fy.l.c(lVar, q11, new Long(track.getStartDate().minusMinutes(1).getMillis()), new Long(track.getStartDate().plusMinutes(1).getMillis()), false, new int[]{123}, this, 24);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ky.d dVar = (ky.d) kotlin.collections.x.K((List) obj);
        if (dVar != null) {
            measuresGroup = hy.g.e(dVar);
        } else {
            measuresGroup = null;
        }
        this.f49736b = null;
        this.f49735a = 2;
        if (h0Var.emit(measuresGroup, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
