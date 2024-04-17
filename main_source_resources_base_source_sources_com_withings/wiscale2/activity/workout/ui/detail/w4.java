package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.os.Parcelable;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: WorkoutHeartRate.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutHeartRateKt$createHeartRateZonesLiveData$1$1", f = "WorkoutHeartRate.kt", l = {ConstantsWs.WS_STATUS_WRONGTOKEN}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class w4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends com.withings.common.compose.component.u1>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49768a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49769b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Track f49770c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f49771d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Track track, Context context, qm0.d<? super w4> dVar) {
        super(2, dVar);
        this.f49770c = track;
        this.f49771d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        w4 w4Var = new w4(this.f49770c, this.f49771d, dVar);
        w4Var.f49769b = obj;
        return w4Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends com.withings.common.compose.component.u1>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((w4) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<com.withings.common.compose.component.u1> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49768a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f49769b;
            Track track = this.f49770c;
            if (track != null) {
                kj0.d dVar = kj0.d.f76061a;
                long userId = track.getUserId();
                DateTime startDate = track.getStartDate();
                DateTime endDate = track.getEndDate();
                dVar.getClass();
                kj0.d.a(userId, startDate, endDate);
                b5 b5Var = new b5(this.f49771d);
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
                list = b5Var.a((WorkoutData) data);
            } else {
                list = null;
            }
            this.f49768a = 1;
            if (h0Var.emit(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
