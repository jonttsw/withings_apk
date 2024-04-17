package com.withings.wiscale2.activity.model.builder;

import android.content.Context;
import androidx.camera.core.v;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.impl.n0;
import androidx.work.o;
import androidx.work.r;
import androidx.work.w;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.v2.repository.VasistasRepository;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.workout.category.model.WorkoutCategoryManager;
import ei0.q;
import fy.l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import lj0.g;
import lj0.h0;
import lj0.r;
import m70.i;
import nm0.j;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: RecomputeAggregate.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eBu\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/withings/wiscale2/activity/model/builder/RecomputeAggregate;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lkn/e;", "deviceManager", "Lm70/i;", "userManager", "Llj0/h0;", "vasistasManager", "Lcom/withings/vasistas/v2/repository/VasistasRepository;", "vasistasRepository", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lei0/q;", "sleepTrackManager", "Llj0/r;", "spO2VasistasRepository", "Llj0/g;", "elevationVasistasRepository", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "activityAggregateManager", "Lfy/l;", "getMeasureGroupWithAllTypesBetweenUseCase", "Lcom/withings/workout/category/model/WorkoutCategoryManager;", "workoutCategoryManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkn/e;Lm70/i;Llj0/h0;Lcom/withings/vasistas/v2/repository/VasistasRepository;Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;Lei0/q;Llj0/r;Llj0/g;Lcom/withings/core/data/aggregate/ActivityAggregateManager;Lfy/l;Lcom/withings/workout/category/model/WorkoutCategoryManager;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RecomputeAggregate extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final kn.e f48467a;

    /* renamed from: b  reason: collision with root package name */
    private final i f48468b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f48469c;

    /* renamed from: d  reason: collision with root package name */
    private final VasistasRepository f48470d;

    /* renamed from: e  reason: collision with root package name */
    private final WorkoutManager f48471e;

    /* renamed from: f  reason: collision with root package name */
    private final q f48472f;

    /* renamed from: g  reason: collision with root package name */
    private final r f48473g;

    /* renamed from: h  reason: collision with root package name */
    private final g f48474h;

    /* renamed from: i  reason: collision with root package name */
    private final ActivityAggregateManager f48475i;

    /* renamed from: j  reason: collision with root package name */
    private final l f48476j;

    /* renamed from: k  reason: collision with root package name */
    private final com.withings.wiscale2.activity.a f48477k;

    /* renamed from: l  reason: collision with root package name */
    private DateTime f48478l;

    /* renamed from: m  reason: collision with root package name */
    private DateTime f48479m;

    /* renamed from: n  reason: collision with root package name */
    private User f48480n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f48481o;

    /* compiled from: RecomputeAggregate.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static void a(Context context, long j5, DateTime from, DateTime until, int[] iArr) {
            u.j(context, "context");
            u.j(from, "from");
            u.j(until, "until");
            long millis = from.getMillis();
            long millis2 = until.getMillis();
            String K = kotlin.collections.l.K(iArr, "|");
            StringBuilder e11 = v.e("RecomputeAggregate-", j5, "-");
            e11.append(millis);
            androidx.work.impl.g.d(e11, "-", millis2, "-");
            e11.append(K);
            String sb2 = e11.toString();
            w.a aVar = new w.a(RecomputeAggregate.class);
            j[] jVarArr = {new j(NavigationArguments.USER_ID, Long.valueOf(j5)), new j("startDateMillis", Long.valueOf(from.getMillis())), new j("endDateMillis", Long.valueOf(until.getMillis())), new j("builderInputs", iArr)};
            f.a aVar2 = new f.a();
            for (int i11 = 0; i11 < 4; i11++) {
                j jVar = jVarArr[i11];
                aVar2.b(jVar.d(), (String) jVar.c());
            }
            n0.n(context).e(sb2, ExistingWorkPolicy.f19031b, ((r.a) aVar.j(aVar2.a())).a("recompute-aggregate").b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecomputeAggregate.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.model.builder.RecomputeAggregate", f = "RecomputeAggregate.kt", l = {125}, m = "doWork")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f48482a;

        /* renamed from: c  reason: collision with root package name */
        int f48484c;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f48482a = obj;
            this.f48484c |= Integer.MIN_VALUE;
            return RecomputeAggregate.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecomputeAggregate.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.model.builder.RecomputeAggregate$doWork$2", f = "RecomputeAggregate.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48485a;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48485a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f48485a = 1;
                if (RecomputeAggregate.t(RecomputeAggregate.this, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new o.a.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomputeAggregate(Context context, WorkerParameters params, kn.e deviceManager, i userManager, h0 vasistasManager, VasistasRepository vasistasRepository, WorkoutManager workoutManager, q sleepTrackManager, lj0.r spO2VasistasRepository, g elevationVasistasRepository, ActivityAggregateManager activityAggregateManager, l getMeasureGroupWithAllTypesBetweenUseCase, WorkoutCategoryManager workoutCategoryManager) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(deviceManager, "deviceManager");
        u.j(userManager, "userManager");
        u.j(vasistasManager, "vasistasManager");
        u.j(vasistasRepository, "vasistasRepository");
        u.j(workoutManager, "workoutManager");
        u.j(sleepTrackManager, "sleepTrackManager");
        u.j(spO2VasistasRepository, "spO2VasistasRepository");
        u.j(elevationVasistasRepository, "elevationVasistasRepository");
        u.j(activityAggregateManager, "activityAggregateManager");
        u.j(getMeasureGroupWithAllTypesBetweenUseCase, "getMeasureGroupWithAllTypesBetweenUseCase");
        u.j(workoutCategoryManager, "workoutCategoryManager");
        this.f48467a = deviceManager;
        this.f48468b = userManager;
        this.f48469c = vasistasManager;
        this.f48470d = vasistasRepository;
        this.f48471e = workoutManager;
        this.f48472f = sleepTrackManager;
        this.f48473g = spO2VasistasRepository;
        this.f48474h = elevationVasistasRepository;
        this.f48475i = activityAggregateManager;
        this.f48476j = getMeasureGroupWithAllTypesBetweenUseCase;
        this.f48477k = new com.withings.wiscale2.activity.a(workoutCategoryManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:22:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(com.withings.wiscale2.activity.model.builder.RecomputeAggregate r12, qm0.d r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.model.builder.RecomputeAggregate.t(com.withings.wiscale2.activity.model.builder.RecomputeAggregate, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
        if (kotlin.collections.l.l(r5, 2) != false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0300 A[LOOP:0: B:97:0x02fa->B:99:0x0300, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable v(com.withings.user.User r32, org.joda.time.DateTime r33, qm0.d r34) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.model.builder.RecomputeAggregate.v(com.withings.user.User, org.joda.time.DateTime, qm0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.model.builder.RecomputeAggregate.doWork(qm0.d):java.lang.Object");
    }
}
