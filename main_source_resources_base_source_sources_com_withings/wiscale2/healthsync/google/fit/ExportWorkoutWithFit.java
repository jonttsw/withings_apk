package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: SyncWorkoutsWithFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/ExportWorkoutWithFit;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExportWorkoutWithFit extends FitSyncWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncWorkoutsWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit", f = "SyncWorkoutsWithFit.kt", l = {114, 117}, m = "deleteWorkout")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56216a;

        /* renamed from: b  reason: collision with root package name */
        Throwable f56217b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56218c;

        /* renamed from: e  reason: collision with root package name */
        int f56220e;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56218c = obj;
            this.f56220e |= Integer.MIN_VALUE;
            return ExportWorkoutWithFit.this.A(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncWorkoutsWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit", f = "SyncWorkoutsWithFit.kt", l = {102, 103, 105, 106}, m = "doFitSync")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ExportWorkoutWithFit f56221a;

        /* renamed from: b  reason: collision with root package name */
        GoogleSignInAccount f56222b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56223c;

        /* renamed from: e  reason: collision with root package name */
        int f56225e;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56223c = obj;
            this.f56225e |= Integer.MIN_VALUE;
            return ExportWorkoutWithFit.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncWorkoutsWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit", f = "SyncWorkoutsWithFit.kt", l = {ConstantsWs.MEASURE_TYPE_PAUSE}, m = "insertWorkouts")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56226a;

        /* renamed from: c  reason: collision with root package name */
        int f56228c;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56226a = obj;
            this.f56228c |= Integer.MIN_VALUE;
            return ExportWorkoutWithFit.this.C(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncWorkoutsWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$insertWorkouts$2", f = "SyncWorkoutsWithFit.kt", l = {ConstantsWs.MEASURE_TYPE_HR_STATE, ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE, ConstantsWs.MEASURE_TYPE_LEUKOCYTES}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f56229a;

        /* renamed from: b  reason: collision with root package name */
        Object f56230b;

        /* renamed from: c  reason: collision with root package name */
        Iterator f56231c;

        /* renamed from: d  reason: collision with root package name */
        Object f56232d;

        /* renamed from: e  reason: collision with root package name */
        Throwable f56233e;

        /* renamed from: f  reason: collision with root package name */
        int f56234f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f56235g;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f56237i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SyncWorkoutsWithFit.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$insertWorkouts$2$tracksWithWorkoutCategory$1$1", f = "SyncWorkoutsWithFit.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super nm0.j<? extends Track, ? extends WorkoutCategory>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bj0.f f56238a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f56239b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(bj0.f fVar, long j5, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f56238a = fVar;
                this.f56239b = j5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f56238a, this.f56239b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.j<? extends Track, ? extends WorkoutCategory>> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                Track byId = this.f56238a.getById(this.f56239b);
                if (byId != null) {
                    return new nm0.j(byId, WorkoutCategoryManager.get().getWorkoutCategory(byId.getCategory()));
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(GoogleSignInAccount googleSignInAccount, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f56237i = googleSignInAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(this.f56237i, dVar);
            dVar2.f56235g = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:15|16|17|18|(1:20)(6:22|23|24|(1:26)|27|(2:29|(1:31)(5:32|7|8|9|(1:10)))(4:33|8|9|(1:10)))) */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x018c, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x018d, code lost:
            r10 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01cc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e1 -> B:27:0x00e4). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01c7 -> B:64:0x01c8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01cc -> B:66:0x01cd). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 473
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportWorkoutWithFit(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(com.google.android.gms.auth.api.signin.GoogleSignInAccount r14, qm0.d<? super androidx.work.o.a> r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.A(com.google.android.gms.auth.api.signin.GoogleSignInAccount, qm0.d):java.lang.Object");
    }

    private final DataSource B(DataType dataType, String str) {
        DataSource build = new DataSource.Builder().setAppPackageName(getApplicationContext().getPackageName()).setDataType(dataType).setStreamName(str).setType(1).build();
        u.i(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(com.google.android.gms.auth.api.signin.GoogleSignInAccount r5, qm0.d<? super androidx.work.o.a> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.c
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$c r0 = (com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.c) r0
            int r1 = r0.f56228c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56228c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$c r0 = new com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56226a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56228c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            nm0.l.b(r6)
            com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$d r6 = new com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$d
            r2 = 0
            r6.<init>(r5, r2)
            r0.f56228c = r3
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "coroutineScope(...)"
            kotlin.jvm.internal.u.i(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.C(com.google.android.gms.auth.api.signin.GoogleSignInAccount, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.fitness.request.SessionInsertRequest x(com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit r19, com.withings.wiscale2.track.data.Track r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.x(com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit, com.withings.wiscale2.track.data.Track, java.lang.String, java.lang.String):com.google.android.gms.fitness.request.SessionInsertRequest");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[RETURN] */
    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.withings.partner.model.Partner r10, qm0.d<? super androidx.work.o.a> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$b r0 = (com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.b) r0
            int r2 = r0.f56225e
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.f56225e = r2
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$b r0 = new com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f56223c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r3 = r0.f56225e
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L49
            if (r3 == r7) goto L45
            if (r3 == r6) goto L41
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            nm0.l.b(r11)
            goto Lb0
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r10 = r0.f56222b
            com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit r1 = r0.f56221a
            nm0.l.b(r11)
            goto La2
        L41:
            nm0.l.b(r11)
            goto L90
        L45:
            nm0.l.b(r11)
            goto L84
        L49:
            nm0.l.b(r11)
            androidx.work.f r11 = r9.getInputData()
            java.lang.String r3 = "type"
            int r11 = r11.c(r3, r1)
            v10.c$b r1 = v10.c.b.f103107c
            boolean r10 = r1.i(r10)
            android.content.Context r3 = r9.getApplicationContext()
            java.lang.String r8 = "getApplicationContext(...)"
            kotlin.jvm.internal.u.i(r3, r8)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.a(r3)
            if (r10 != 0) goto L71
            androidx.work.o$a$c r10 = new androidx.work.o$a$c
            r10.<init>()
            goto Lb6
        L71:
            if (r1 != 0) goto L79
            androidx.work.o$a$c r10 = new androidx.work.o$a$c
            r10.<init>()
            goto Lb6
        L79:
            if (r11 != r5) goto L85
            r0.f56225e = r7
            java.lang.Object r11 = r9.A(r1, r0)
            if (r11 != r2) goto L84
            return r2
        L84:
            return r11
        L85:
            if (r11 != r7) goto L91
            r0.f56225e = r6
            java.lang.Object r11 = r9.C(r1, r0)
            if (r11 != r2) goto L90
            return r2
        L90:
            return r11
        L91:
            if (r11 != r6) goto Lb1
            r0.f56221a = r9
            r0.f56222b = r1
            r0.f56225e = r5
            java.lang.Object r10 = r9.A(r1, r0)
            if (r10 != r2) goto La0
            return r2
        La0:
            r10 = r1
            r1 = r9
        La2:
            r11 = 0
            r0.f56221a = r11
            r0.f56222b = r11
            r0.f56225e = r4
            java.lang.Object r11 = r1.C(r10, r0)
            if (r11 != r2) goto Lb0
            return r2
        Lb0:
            return r11
        Lb1:
            androidx.work.o$a$a r10 = new androidx.work.o$a$a
            r10.<init>()
        Lb6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportWorkoutWithFit.t(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
