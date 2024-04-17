package com.withings.wiscale2.vo2max;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.impl.n0;
import androidx.work.o;
import androidx.work.r;
import androidx.work.w;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fy.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import m70.i;
import nm0.g;
import nm0.h;
import nm0.j;
import nm0.y;
import ym0.p;
/* compiled from: Vo2MaxGenerator.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withings/wiscale2/vo2max/ComputeVo2Max;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lnj0/e;", "vo2MaxComputer", "La10/a;", "notificationRepository", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lcom/withings/workout/category/model/WorkoutCategoryManager;", "workoutCategoryManager", "Lkn/e;", "deviceManager", "Lm70/i;", "userManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnj0/e;La10/a;Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;Lcom/withings/workout/category/model/WorkoutCategoryManager;Lkn/e;Lm70/i;)V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ComputeVo2Max extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final Context f62584a;

    /* renamed from: b  reason: collision with root package name */
    private final nj0.e f62585b;

    /* renamed from: c  reason: collision with root package name */
    private final a10.a f62586c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkoutManager f62587d;

    /* renamed from: e  reason: collision with root package name */
    private final WorkoutCategoryManager f62588e;

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f62589f;

    /* renamed from: g  reason: collision with root package name */
    private final i f62590g;

    /* renamed from: h  reason: collision with root package name */
    private final g f62591h;

    /* renamed from: i  reason: collision with root package name */
    private final g f62592i;

    /* compiled from: Vo2MaxGenerator.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static void a(Context context, long j5, Track newTrack, boolean z5) {
            u.j(context, "context");
            u.j(newTrack, "newTrack");
            w.a aVar = new w.a(ComputeVo2Max.class);
            j[] jVarArr = {new j(NavigationArguments.USER_ID, Long.valueOf(j5)), new j("newTrackId", newTrack.getId()), new j("isUpdate", Boolean.valueOf(z5))};
            f.a aVar2 = new f.a();
            for (int i11 = 0; i11 < 3; i11++) {
                j jVar = jVarArr[i11];
                aVar2.b(jVar.d(), (String) jVar.c());
            }
            n0.n(context).e("ComputeVo2Max", ExistingWorkPolicy.f19033d, ((r.a) aVar.j(aVar2.a())).b());
        }
    }

    /* compiled from: Vo2MaxGenerator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/vo2max/ComputeVo2Max$b;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface b {
        o T();

        n20.j v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2MaxGenerator.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.ComputeVo2Max", f = "Vo2MaxGenerator.kt", l = {196}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f62593a;

        /* renamed from: c  reason: collision with root package name */
        int f62595c;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62593a = obj;
            this.f62595c |= Integer.MIN_VALUE;
            return ComputeVo2Max.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2MaxGenerator.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.ComputeVo2Max$doWork$2", f = "Vo2MaxGenerator.kt", l = {200, 203, 209, 211}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        ComputeVo2Max f62596a;

        /* renamed from: b  reason: collision with root package name */
        Object f62597b;

        /* renamed from: c  reason: collision with root package name */
        Track f62598c;

        /* renamed from: d  reason: collision with root package name */
        long f62599d;

        /* renamed from: e  reason: collision with root package name */
        int f62600e;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
            if (wr.b.c(com.withings.features.FeatureFlag.f39114k) == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
            r4 = r6.f62585b;
            r20.f62596a = null;
            r20.f62597b = null;
            r20.f62598c = null;
            r20.f62600e = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
            if (r4.i(r1, r3, r20) != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
            r4 = r6.f62585b;
            r20.f62596a = null;
            r20.f62597b = null;
            r20.f62598c = null;
            r20.f62600e = 4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
            if (r4.j(r1, r3, r20) != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.ComputeVo2Max.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Vo2MaxGenerator.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<b> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            return (b) ah.o.c(ComputeVo2Max.this.getContext(), b.class);
        }
    }

    /* compiled from: Vo2MaxGenerator.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<nj0.a> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final nj0.a invoke() {
            ComputeVo2Max computeVo2Max = ComputeVo2Max.this;
            return new nj0.a(computeVo2Max.f62588e, computeVo2Max.f62589f, computeVo2Max.f62590g, ComputeVo2Max.t(computeVo2Max).T(), ComputeVo2Max.t(computeVo2Max).v());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComputeVo2Max(Context context, WorkerParameters params, nj0.e vo2MaxComputer, a10.a notificationRepository, WorkoutManager workoutManager, WorkoutCategoryManager workoutCategoryManager, kn.e deviceManager, i userManager) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(vo2MaxComputer, "vo2MaxComputer");
        u.j(notificationRepository, "notificationRepository");
        u.j(workoutManager, "workoutManager");
        u.j(workoutCategoryManager, "workoutCategoryManager");
        u.j(deviceManager, "deviceManager");
        u.j(userManager, "userManager");
        this.f62584a = context;
        this.f62585b = vo2MaxComputer;
        this.f62586c = notificationRepository;
        this.f62587d = workoutManager;
        this.f62588e = workoutCategoryManager;
        this.f62589f = deviceManager;
        this.f62590g = userManager;
        this.f62591h = h.b(new e());
        this.f62592i = h.b(new f());
    }

    public static final boolean A(ComputeVo2Max computeVo2Max, long j5, Track track) {
        Map<Long, WorkoutCategory> allCategory = computeVo2Max.f62588e.getAllCategory();
        u.g(allCategory);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, WorkoutCategory> entry : allCategory.entrySet()) {
            String[] features = entry.getValue().getFeatures();
            if (features != null && l.m(features, ConstantsWs.SUBCATEGORY_FEATURE_VO2MAX)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Track mostRecentWorkoutRelevantForVo2MaxComputing = computeVo2Max.f62587d.getMostRecentWorkoutRelevantForVo2MaxComputing(j5, x.R0(linkedHashMap.keySet()));
        if (mostRecentWorkoutRelevantForVo2MaxComputing != null && u.e(mostRecentWorkoutRelevantForVo2MaxComputing.getId(), track.getId())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(com.withings.wiscale2.vo2max.ComputeVo2Max r8, long r9, long r11, qm0.d r13) {
        /*
            r8.getClass()
            boolean r0 = r13 instanceof com.withings.wiscale2.vo2max.a
            if (r0 == 0) goto L16
            r0 = r13
            com.withings.wiscale2.vo2max.a r0 = (com.withings.wiscale2.vo2max.a) r0
            int r1 = r0.f62621e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f62621e = r1
            goto L1b
        L16:
            com.withings.wiscale2.vo2max.a r0 = new com.withings.wiscale2.vo2max.a
            r0.<init>(r8, r13)
        L1b:
            java.lang.Object r13 = r0.f62619c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f62621e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            nm0.l.b(r13)
            goto L8a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            long r9 = r0.f62618b
            com.withings.wiscale2.vo2max.ComputeVo2Max r8 = r0.f62617a
            nm0.l.b(r13)
            goto L79
        L3e:
            nm0.l.b(r13)
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            long r11 = r13.longValue()
            r6 = -1
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 != 0) goto L51
            r13 = r3
        L51:
            if (r13 == 0) goto L8a
            long r11 = r13.longValue()
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "VO2MAX-track:"
            r11.<init>(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r0.f62617a = r8
            r0.f62618b = r9
            r0.f62621e = r5
            a10.a r12 = r8.f62586c
            java.lang.Object r13 = r12.g(r9, r11, r0)
            if (r13 != r1) goto L79
            goto L8c
        L79:
            c10.c r13 = (c10.c) r13
            if (r13 == 0) goto L8a
            a10.a r8 = r8.f62586c
            r0.f62617a = r3
            r0.f62621e = r4
            java.lang.Object r8 = r8.c(r9, r13, r0)
            if (r8 != r1) goto L8a
            goto L8c
        L8a:
            nm0.y r1 = nm0.y.f85009a
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.ComputeVo2Max.B(com.withings.wiscale2.vo2max.ComputeVo2Max, long, long, qm0.d):java.lang.Object");
    }

    public static final b t(ComputeVo2Max computeVo2Max) {
        return (b) computeVo2Max.f62591h.getValue();
    }

    public static final nj0.a w(ComputeVo2Max computeVo2Max) {
        return (nj0.a) computeVo2Max.f62592i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.vo2max.ComputeVo2Max.c
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.vo2max.ComputeVo2Max$c r0 = (com.withings.wiscale2.vo2max.ComputeVo2Max.c) r0
            int r1 = r0.f62595c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62595c = r1
            goto L18
        L13:
            com.withings.wiscale2.vo2max.ComputeVo2Max$c r0 = new com.withings.wiscale2.vo2max.ComputeVo2Max$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f62593a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f62595c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.vo2max.ComputeVo2Max$d r2 = new com.withings.wiscale2.vo2max.ComputeVo2Max$d
            r4 = 0
            r2.<init>(r4)
            r0.f62595c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.ComputeVo2Max.doWork(qm0.d):java.lang.Object");
    }

    public final Context getContext() {
        return this.f62584a;
    }
}
