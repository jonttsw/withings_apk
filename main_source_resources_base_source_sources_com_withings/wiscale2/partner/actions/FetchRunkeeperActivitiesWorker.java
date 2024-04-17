package com.withings.wiscale2.partner.actions;

import android.content.Context;
import android.os.Parcelable;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.ws.PartnerRemoteRepository;
import com.withings.partner.ws.model.RunkeeperActivity;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.g;
import nm0.h;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import t10.e;
import ym0.p;
/* compiled from: FetchRunkeeperActivities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/partner/actions/FetchRunkeeperActivitiesWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lcom/withings/partner/ws/PartnerRemoteRepository;", "partnerRemoteRepository", "Lt10/e;", "partnerManager", "Lua0/a;", "computeTrackGpsSummary", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/withings/partner/ws/PartnerRemoteRepository;Lt10/e;Lua0/a;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FetchRunkeeperActivitiesWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final Context f58832a;

    /* renamed from: b  reason: collision with root package name */
    private final e f58833b;

    /* renamed from: c  reason: collision with root package name */
    private final ua0.a f58834c;

    /* renamed from: d  reason: collision with root package name */
    private final g f58835d;

    /* renamed from: e  reason: collision with root package name */
    private final g f58836e;

    /* renamed from: f  reason: collision with root package name */
    private final PartnerRemoteRepository f58837f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchRunkeeperActivities.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker", f = "FetchRunkeeperActivities.kt", l = {105}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f58838a;

        /* renamed from: c  reason: collision with root package name */
        int f58840c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58838a = obj;
            this.f58840c |= Integer.MIN_VALUE;
            return FetchRunkeeperActivitiesWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchRunkeeperActivities.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker$doWork$2", f = "FetchRunkeeperActivities.kt", l = {107, 107, 111}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        FetchRunkeeperActivitiesWorker f58841a;

        /* renamed from: b  reason: collision with root package name */
        PartnerRemoteRepository f58842b;

        /* renamed from: c  reason: collision with root package name */
        long f58843c;

        /* renamed from: d  reason: collision with root package name */
        int f58844d;

        /* compiled from: Comparisons.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(((Track) t12).getEndDate(), ((Track) t11).getEndDate());
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x0015, LOOP:0: B:28:0x007e->B:30:0x0084, LOOP_END, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0010, B:44:0x00f4, B:14:0x0022, B:27:0x0067, B:28:0x007e, B:30:0x0084, B:31:0x0092, B:32:0x00ab, B:34:0x00b1, B:35:0x00c8, B:37:0x00d8, B:39:0x00de, B:41:0x00e9, B:17:0x002c, B:24:0x0053, B:20:0x0038), top: B:52:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: all -> 0x0015, LOOP:1: B:32:0x00ab->B:34:0x00b1, LOOP_END, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0010, B:44:0x00f4, B:14:0x0022, B:27:0x0067, B:28:0x007e, B:30:0x0084, B:31:0x0092, B:32:0x00ab, B:34:0x00b1, B:35:0x00c8, B:37:0x00d8, B:39:0x00de, B:41:0x00e9, B:17:0x002c, B:24:0x0053, B:20:0x0038), top: B:52:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
        /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FetchRunkeeperActivities.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<Long> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(FetchRunkeeperActivitiesWorker.this.getInputData().e(HealthUserProfile.USER_PROFILE_KEY_USER_ID, -1L));
        }
    }

    /* compiled from: FetchRunkeeperActivities.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<String> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            return FetchRunkeeperActivitiesWorker.this.getInputData().g("partner_ws_code");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRunkeeperActivitiesWorker(Context context, WorkerParameters params, PartnerRemoteRepository partnerRemoteRepository, e partnerManager, ua0.a computeTrackGpsSummary) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(partnerRemoteRepository, "partnerRemoteRepository");
        u.j(partnerManager, "partnerManager");
        u.j(computeTrackGpsSummary, "computeTrackGpsSummary");
        this.f58832a = context;
        this.f58833b = partnerManager;
        this.f58834c = computeTrackGpsSummary;
        this.f58835d = h.b(new d());
        this.f58836e = h.b(new c());
        this.f58837f = partnerRemoteRepository.withSyncContext("fetchRunkeeperActivities");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker r4, qm0.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.withings.wiscale2.partner.actions.a
            if (r0 == 0) goto L16
            r0 = r5
            com.withings.wiscale2.partner.actions.a r0 = (com.withings.wiscale2.partner.actions.a) r0
            int r1 = r0.f58850c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f58850c = r1
            goto L1b
        L16:
            com.withings.wiscale2.partner.actions.a r0 = new com.withings.wiscale2.partner.actions.a
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f58848a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f58850c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r5)
            goto L4c
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            nm0.l.b(r5)
            nm0.g r5 = r4.f58835d
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L4f
            r0.f58850c = r3
            t10.e r2 = r4.f58833b
            android.content.Context r4 = r4.f58832a
            java.lang.Object r5 = r2.g(r4, r5, r0)
            if (r5 != r1) goto L4c
            goto L68
        L4c:
            com.withings.partner.model.Partner r5 = (com.withings.partner.model.Partner) r5
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 == 0) goto L61
            java.lang.Long r4 = r5.u()
            if (r4 == 0) goto L61
            long r4 = r4.longValue()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
            goto L63
        L61:
            r4 = 0
        L63:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker.t(com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker, qm0.d):java.lang.Object");
    }

    public static final long v(FetchRunkeeperActivitiesWorker fetchRunkeeperActivitiesWorker) {
        return ((Number) fetchRunkeeperActivitiesWorker.f58836e.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker r9, java.lang.Long r10, qm0.d r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof com.withings.wiscale2.partner.actions.b
            if (r0 == 0) goto L17
            r0 = r11
            com.withings.wiscale2.partner.actions.b r0 = (com.withings.wiscale2.partner.actions.b) r0
            int r1 = r0.f58855e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f58855e = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.withings.wiscale2.partner.actions.b r0 = new com.withings.wiscale2.partner.actions.b
            r0.<init>(r9, r11)
            goto L15
        L1d:
            java.lang.Object r11 = r6.f58853c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f58855e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            nm0.l.b(r11)
            goto L94
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            long r9 = r6.f58852b
            com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker r1 = r6.f58851a
            nm0.l.b(r11)
            r8 = r1
            r1 = r11
            r10 = r9
            r9 = r8
            goto L67
        L43:
            nm0.l.b(r11)
            if (r10 == 0) goto L94
            long r10 = r10.longValue()
            nm0.g r1 = r9.f58835d
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L94
            r6.f58851a = r9
            r6.f58852b = r10
            r6.f58855e = r3
            t10.e r3 = r9.f58833b
            android.content.Context r4 = r9.f58832a
            java.lang.Object r1 = r3.g(r4, r1, r6)
            if (r1 != r0) goto L67
            goto L96
        L67:
            r5 = r1
            com.withings.partner.model.Partner r5 = (com.withings.partner.model.Partner) r5
            if (r5 == 0) goto L94
            t10.e r1 = r9.f58833b
            nm0.g r3 = r9.f58836e
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r10)
            r5.S(r7)
            nm0.y r10 = nm0.y.f85009a
            r10 = 0
            r6.f58851a = r10
            r6.f58855e = r2
            android.content.Context r9 = r9.f58832a
            r2 = r3
            r4 = r9
            java.lang.Object r9 = r1.j(r2, r4, r5, r6)
            if (r9 != r0) goto L94
            goto L96
        L94:
            nm0.y r0 = nm0.y.f85009a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker.w(com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker, java.lang.Long, qm0.d):java.lang.Object");
    }

    public static final Track x(FetchRunkeeperActivitiesWorker fetchRunkeeperActivitiesWorker, RunkeeperActivity runkeeperActivity) {
        Parcelable a11;
        StepWorkoutData stepWorkoutData;
        fetchRunkeeperActivitiesWorker.getClass();
        Track track = new Track(null, null, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, false, 0, null, null, null, false, 0, null, null, false, null, null, null, null, null, null, 0, -1, null);
        track.setUserId(((Number) fetchRunkeeperActivitiesWorker.f58836e.getValue()).longValue());
        track.setStartDate(runkeeperActivity.getStartDate());
        DateTime plusSeconds = track.getStartDate().plusSeconds(runkeeperActivity.getDurationInSeconds());
        u.i(plusSeconds, "plusSeconds(...)");
        track.setEndDate(plusSeconds);
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        track.setModifiedDate(now);
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        u.i(dateTimeZone, "getDefault(...)");
        track.setTimeZone(dateTimeZone);
        String abstractDateTime = track.getStartDate().withZone(track.getDateTimeZone()).toString("yyyy-MM-dd");
        u.i(abstractDateTime, "toString(...)");
        track.setDay(abstractDateTime);
        track.setSyncedToWs(false);
        track.setCategory(runkeeperActivity.getSubCategory());
        track.setAttrib(2);
        track.setDeviceType(16);
        track.setDeviceModel(1053);
        track.setBrand(8);
        track.setGpsSummary(fetchRunkeeperActivitiesWorker.f58834c.c(track));
        if (track.getCategory() == 7) {
            Parcelable data = track.getData();
            u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            a11 = ba0.e.b((WorkoutData) data);
        } else {
            Parcelable data2 = track.getData();
            u.h(data2, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            a11 = ba0.e.a((WorkoutData) data2);
        }
        track.setData(a11);
        Integer distanceInMeter = runkeeperActivity.getDistanceInMeter();
        StepWorkoutData stepWorkoutData2 = null;
        if (distanceInMeter != null) {
            int intValue = distanceInMeter.intValue();
            Parcelable data3 = track.getData();
            if (data3 instanceof StepWorkoutData) {
                stepWorkoutData = (StepWorkoutData) data3;
            } else {
                stepWorkoutData = null;
            }
            if (stepWorkoutData != null) {
                stepWorkoutData.setManualDistance(intValue);
            }
        }
        Integer calories = runkeeperActivity.getCalories();
        if (calories != null) {
            int intValue2 = calories.intValue();
            Parcelable data4 = track.getData();
            if (data4 instanceof StepWorkoutData) {
                stepWorkoutData2 = (StepWorkoutData) data4;
            }
            if (stepWorkoutData2 != null) {
                stepWorkoutData2.setCalories(intValue2);
            }
        }
        return track;
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
            boolean r0 = r6 instanceof com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker$a r0 = (com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker.a) r0
            int r1 = r0.f58840c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58840c = r1
            goto L18
        L13:
            com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker$a r0 = new com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58838a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f58840c
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
            com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker$b r2 = new com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f58840c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker.doWork(qm0.d):java.lang.Object");
    }
}
