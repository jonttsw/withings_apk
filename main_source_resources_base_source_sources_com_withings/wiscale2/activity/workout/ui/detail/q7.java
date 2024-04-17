package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.user.User;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPreviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$allWorkoutsFlow$1", f = "WorkoutPreviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class q7 extends kotlin.coroutines.jvm.internal.i implements ym0.q<Integer, Long, qm0.d<? super Flow<? extends List<? extends Track>>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ int f49570a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ long f49571b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WorkoutManager f49572c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f49573d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(WorkoutManager workoutManager, User user, qm0.d<? super q7> dVar) {
        super(3, dVar);
        this.f49572c = workoutManager;
        this.f49573d = user;
    }

    @Override // ym0.q
    public final Object invoke(Integer num, Long l5, qm0.d<? super Flow<? extends List<? extends Track>>> dVar) {
        int intValue = num.intValue();
        long longValue = l5.longValue();
        q7 q7Var = new q7(this.f49572c, this.f49573d, dVar);
        q7Var.f49570a = intValue;
        q7Var.f49571b = longValue;
        return q7Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        int i11 = this.f49570a;
        long j5 = this.f49571b;
        int i12 = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
        User user = this.f49573d;
        if (i12 == 0) {
            return this.f49572c.getLastWorkoutsForUserOrderDescending(user.q(), i11);
        }
        return this.f49572c.getLastWorkoutsForUserOrderDescending(user.q(), j5, i11);
    }
}
