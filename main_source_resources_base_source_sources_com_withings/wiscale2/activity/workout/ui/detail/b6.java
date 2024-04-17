package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.target.data.TargetRepository;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: WorkoutNotification.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutNotificationKt$createGoalNotificationLiveData$1$1", f = "WorkoutNotification.kt", l = {ConstantsWs.MEASURE_TYPE_PAUSE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class b6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<x5>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49128a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49129b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Track f49130c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TargetRepository f49131d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f49132e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ WorkoutManager f49133f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Context f49134g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ WorkoutCategory f49135h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(Track track, TargetRepository targetRepository, long j5, WorkoutManager workoutManager, Context context, WorkoutCategory workoutCategory, qm0.d<? super b6> dVar) {
        super(2, dVar);
        this.f49130c = track;
        this.f49131d = targetRepository;
        this.f49132e = j5;
        this.f49133f = workoutManager;
        this.f49134g = context;
        this.f49135h = workoutCategory;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        b6 b6Var = new b6(this.f49130c, this.f49131d, this.f49132e, this.f49133f, this.f49134g, this.f49135h, dVar);
        b6Var.f49129b = obj;
        return b6Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<x5> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((b6) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        nm0.j jVar;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f49128a;
        if (i12 != 0) {
            if (i12 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f49129b;
            Track track = this.f49130c;
            DateTime withDayOfWeek = track.getStartDate().withTimeAtStartOfDay().withDayOfWeek(1);
            Target lastActiveWorkoutTarget = this.f49131d.getLastActiveWorkoutTarget(this.f49132e, track.getCategory());
            kotlin.jvm.internal.u.g(withDayOfWeek);
            int size = ah.q.b(kotlin.collections.x.m0(track, this.f49133f.getForUserBetweenDate(this.f49132e, withDayOfWeek, track.getStartDate(), track.getCategory())), track.getStartDate()).size();
            Context context = this.f49134g;
            if (lastActiveWorkoutTarget != null && lastActiveWorkoutTarget.getMantissa() != 0) {
                jVar = new nm0.j(String.format("%d/%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(size), Integer.valueOf(lastActiveWorkoutTarget.getMantissa()), context.getString(C1987R.string._WEEKLY_GOAL_)}, 3)), context.getString(C1987R.string.workoutNotification_GoalDescription));
            } else {
                jVar = new nm0.j(context.getString(C1987R.string.workoutNotification_noGoalForActivity), context.getString(C1987R.string._SET__s_SESSION_GOAL_QUESTION_, this.f49135h.getName(context)));
            }
            String str = (String) jVar.a();
            String str2 = (String) jVar.b();
            if (lastActiveWorkoutTarget != null) {
                i11 = C1987R.color.statusGood;
            } else {
                i11 = C1987R.color.statusInfo;
            }
            n1 n1Var = new n1(0, C1987R.string.glyph_star2, i11, str, str2, false);
            this.f49128a = 1;
            if (h0Var.emit(n1Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
