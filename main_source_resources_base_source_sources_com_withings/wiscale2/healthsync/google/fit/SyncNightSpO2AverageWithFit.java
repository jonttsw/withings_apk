package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.material.g6;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.o;
import androidx.work.r;
import androidx.work.w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.HealthDataTypes;
import com.google.android.gms.fitness.data.HealthFields;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import ei0.q;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import org.joda.time.DateTime;
import v10.c;
/* compiled from: SyncNightSpO2AverageWithFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/SyncNightSpO2AverageWithFit;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SyncNightSpO2AverageWithFit extends FitSyncWorker {

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f56391f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f56392g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f56393h;

    /* renamed from: i  reason: collision with root package name */
    private final DataType f56394i;

    /* renamed from: j  reason: collision with root package name */
    private final String f56395j;

    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static r a(long j5, Track track) {
            return d(j5, track, 3);
        }

        public static r b(long j5, Track track) {
            u.j(track, "track");
            return d(j5, track, 1);
        }

        public static r c(long j5, Track track) {
            u.j(track, "track");
            return d(j5, track, 2);
        }

        private static r d(long j5, Track track, int i11) {
            w.a aVar = new w.a(InsertSleepToFitWorker.class);
            nm0.j[] jVarArr = {new nm0.j(DeliveryReceiptRequest.ELEMENT, Integer.valueOf(i11)), new nm0.j(NavigationArguments.USER_ID, Long.valueOf(j5)), new nm0.j("track_end_timestamp", Long.valueOf(TrackKt.getEffectiveEndDate(track).getMillis()))};
            f.a aVar2 = new f.a();
            for (int i12 = 0; i12 < 3; i12++) {
                nm0.j jVar = jVarArr[i12];
                aVar2.b(jVar.d(), (String) jVar.c());
            }
            return ((r.a) aVar.j(aVar2.a())).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit", f = "SyncNightSpO2AverageWithFit.kt", l = {123, 126}, m = "deleteDataSet")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56396a;

        /* renamed from: b  reason: collision with root package name */
        Throwable f56397b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56398c;

        /* renamed from: e  reason: collision with root package name */
        int f56400e;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56398c = obj;
            this.f56400e |= Integer.MIN_VALUE;
            return SyncNightSpO2AverageWithFit.this.D(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit", f = "SyncNightSpO2AverageWithFit.kt", l = {81, 82, 83}, m = "executeRequest")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56401a;

        /* renamed from: c  reason: collision with root package name */
        int f56403c;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56401a = obj;
            this.f56403c |= Integer.MIN_VALUE;
            return SyncNightSpO2AverageWithFit.this.E(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit", f = "SyncNightSpO2AverageWithFit.kt", l = {95, 98}, m = "insertDataSet")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56404a;

        /* renamed from: b  reason: collision with root package name */
        Throwable f56405b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56406c;

        /* renamed from: e  reason: collision with root package name */
        int f56408e;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56406c = obj;
            this.f56408e |= Integer.MIN_VALUE;
            return SyncNightSpO2AverageWithFit.this.G(null, 0L, 0.0f, this);
        }
    }

    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Track> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Track invoke() {
            SyncNightSpO2AverageWithFit syncNightSpO2AverageWithFit = SyncNightSpO2AverageWithFit.this;
            q z5 = SyncNightSpO2AverageWithFit.z(syncNightSpO2AverageWithFit);
            long q11 = syncNightSpO2AverageWithFit.getUser().q();
            DateTime dateTime = new DateTime(SyncNightSpO2AverageWithFit.A(syncNightSpO2AverageWithFit));
            z5.getClass();
            Track C = z5.C(q11, dateTime, null);
            if (C == null || C.isInProgress()) {
                return null;
            }
            return C;
        }
    }

    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<q> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f56410a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final q invoke() {
            q qVar = q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    return qVar;
                }
                u.s("instance");
                throw null;
            }
            u.s("instance");
            throw null;
        }
    }

    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Long> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(SyncNightSpO2AverageWithFit.this.getInputData().e("track_end_timestamp", 0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncNightSpO2AverageWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit", f = "SyncNightSpO2AverageWithFit.kt", l = {106, 109}, m = "updateDataSet")
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56412a;

        /* renamed from: b  reason: collision with root package name */
        Throwable f56413b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56414c;

        /* renamed from: e  reason: collision with root package name */
        int f56416e;

        h(qm0.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56414c = obj;
            this.f56416e |= Integer.MIN_VALUE;
            return SyncNightSpO2AverageWithFit.this.H(null, 0L, 0.0f, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncNightSpO2AverageWithFit(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f56391f = nm0.h.b(f.f56410a);
        this.f56392g = nm0.h.b(new g());
        this.f56393h = nm0.h.b(new e());
        DataType TYPE_OXYGEN_SATURATION = HealthDataTypes.TYPE_OXYGEN_SATURATION;
        u.i(TYPE_OXYGEN_SATURATION, "TYPE_OXYGEN_SATURATION");
        this.f56394i = TYPE_OXYGEN_SATURATION;
        this.f56395j = g6.i(TYPE_OXYGEN_SATURATION.getName(), "-Withings");
    }

    public static final long A(SyncNightSpO2AverageWithFit syncNightSpO2AverageWithFit) {
        return ((Number) syncNightSpO2AverageWithFit.f56392g.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(com.google.android.gms.auth.api.signin.GoogleSignInAccount r12, long r13, qm0.d<? super nm0.y> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.b
            if (r0 == 0) goto L13
            r0 = r15
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$b r0 = (com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.b) r0
            int r1 = r0.f56400e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56400e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$b r0 = new com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f56398c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56400e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Throwable r12 = r0.f56397b
            nm0.l.b(r15)
            goto Lb8
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            java.lang.Object r12 = r0.f56396a
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit r12 = (com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit) r12
            nm0.l.b(r15)     // Catch: java.lang.Throwable -> L3d
            goto L81
        L3d:
            r13 = move-exception
            goto L86
        L3f:
            nm0.l.b(r15)
            com.google.android.gms.fitness.request.DataDeleteRequest$Builder r15 = new com.google.android.gms.fitness.request.DataDeleteRequest$Builder
            r15.<init>()
            com.google.android.gms.fitness.data.DataType r2 = r11.f56394i
            com.google.android.gms.fitness.request.DataDeleteRequest$Builder r5 = r15.addDataType(r2)
            r15 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r15
            long r8 = r13 - r6
            long r13 = r13 + r6
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6 = r8
            r8 = r13
            com.google.android.gms.fitness.request.DataDeleteRequest$Builder r13 = r5.setTimeInterval(r6, r8, r10)
            com.google.android.gms.fitness.request.DataDeleteRequest r13 = r13.build()
            java.lang.String r14 = "build(...)"
            kotlin.jvm.internal.u.i(r13, r14)
            android.content.Context r14 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.fitness.HistoryClient r12 = com.google.android.gms.fitness.Fitness.getHistoryClient(r14, r12)     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.tasks.Task r12 = r12.deleteData(r13)     // Catch: java.lang.Throwable -> L84
            java.lang.String r13 = "deleteData(...)"
            kotlin.jvm.internal.u.i(r12, r13)     // Catch: java.lang.Throwable -> L84
            r0.f56396a = r11     // Catch: java.lang.Throwable -> L84
            r0.f56400e = r4     // Catch: java.lang.Throwable -> L84
            java.lang.Object r15 = kotlinx.coroutines.tasks.TasksKt.await(r12, r0)     // Catch: java.lang.Throwable -> L84
            if (r15 != r1) goto L80
            return r1
        L80:
            r12 = r11
        L81:
            java.lang.Void r15 = (java.lang.Void) r15     // Catch: java.lang.Throwable -> L3d
            goto L8a
        L84:
            r13 = move-exception
            r12 = r11
        L86:
            nm0.k$a r15 = nm0.l.a(r13)
        L8a:
            boolean r13 = r15 instanceof nm0.k.a
            r13 = r13 ^ r4
            r14 = 0
            if (r13 == 0) goto L9a
            r13 = r15
            java.lang.Void r13 = (java.lang.Void) r13
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.String r2 = "DataSet delete was successful!"
            x70.b.l(r12, r2, r13)
        L9a:
            java.lang.Throwable r13 = nm0.k.b(r15)
            if (r13 == 0) goto Lbb
            t10.e r2 = r12.w()
            android.content.Context r12 = r12.getContext()
            com.withings.partner.model.Partner r4 = com.withings.partner.model.Partner.f43456n
            r0.f56396a = r15
            r0.f56397b = r13
            r0.f56400e = r3
            java.lang.Object r12 = r2.l(r12, r4, r0, r14)
            if (r12 != r1) goto Lb7
            return r1
        Lb7:
            r12 = r13
        Lb8:
            x70.b.n(r12)
        Lbb:
            nm0.y r12 = nm0.y.f85009a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.D(com.google.android.gms.auth.api.signin.GoogleSignInAccount, long, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(com.google.android.gms.auth.api.signin.GoogleSignInAccount r9, float r10, org.joda.time.DateTime r11, qm0.d<? super androidx.work.o.a> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L14
            r0 = r12
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$c r0 = (com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.c) r0
            int r2 = r0.f56403c
            r3 = r2 & r1
            if (r3 == 0) goto L14
            int r2 = r2 - r1
            r0.f56403c = r2
        L12:
            r7 = r0
            goto L1a
        L14:
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$c r0 = new com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$c
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f56401a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r7.f56403c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L2b
            if (r2 == r4) goto L2b
            if (r2 != r3) goto L31
        L2b:
            nm0.l.b(r12)     // Catch: java.lang.Exception -> L2f
            goto L83
        L2f:
            r9 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            nm0.l.b(r12)
            androidx.work.f r12 = r8.getInputData()     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "request"
            int r12 = r12.c(r2, r1)     // Catch: java.lang.Exception -> L2f
            if (r12 == r5) goto L72
            if (r12 == r4) goto L61
            if (r12 != r3) goto L59
            long r10 = r11.getMillis()     // Catch: java.lang.Exception -> L2f
            r7.f56403c = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r8.D(r9, r10, r7)     // Catch: java.lang.Exception -> L2f
            if (r9 != r0) goto L83
            return r0
        L59:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L2f
            java.lang.String r10 = "You should provide a request input"
            r9.<init>(r10)     // Catch: java.lang.Exception -> L2f
            throw r9     // Catch: java.lang.Exception -> L2f
        L61:
            long r11 = r11.getMillis()     // Catch: java.lang.Exception -> L2f
            r7.f56403c = r4     // Catch: java.lang.Exception -> L2f
            r2 = r8
            r3 = r9
            r4 = r11
            r6 = r10
            java.lang.Object r9 = r2.H(r3, r4, r6, r7)     // Catch: java.lang.Exception -> L2f
            if (r9 != r0) goto L83
            return r0
        L72:
            long r11 = r11.getMillis()     // Catch: java.lang.Exception -> L2f
            r7.f56403c = r5     // Catch: java.lang.Exception -> L2f
            r2 = r8
            r3 = r9
            r4 = r11
            r6 = r10
            java.lang.Object r9 = r2.G(r3, r4, r6, r7)     // Catch: java.lang.Exception -> L2f
            if (r9 != r0) goto L83
            return r0
        L83:
            androidx.work.o$a$c r9 = new androidx.work.o$a$c     // Catch: java.lang.Exception -> L2f
            r9.<init>()     // Catch: java.lang.Exception -> L2f
            goto L91
        L89:
            x70.b.n(r9)
            androidx.work.o$a$a r9 = new androidx.work.o$a$a
            r9.<init>()
        L91:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.E(com.google.android.gms.auth.api.signin.GoogleSignInAccount, float, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    private final DataSet F(long j5, float f11) {
        DataSource build = new DataSource.Builder().setAppPackageName(getApplicationContext()).setDataType(this.f56394i).setStreamName(this.f56395j).setType(0).build();
        u.i(build, "build(...)");
        DataPoint.Builder timestamp = DataPoint.builder(build).setTimestamp(j5, TimeUnit.MILLISECONDS);
        timestamp.setField(HealthFields.FIELD_OXYGEN_SATURATION, f11);
        timestamp.setField(HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE, 0.0f);
        DataPoint build2 = timestamp.build();
        u.i(build2, "build(...)");
        DataSet build3 = DataSet.builder(build).add(build2).build();
        u.i(build3, "build(...)");
        return build3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.google.android.gms.auth.api.signin.GoogleSignInAccount r6, long r7, float r9, qm0.d<? super nm0.y> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.d
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$d r0 = (com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.d) r0
            int r1 = r0.f56408e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56408e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$d r0 = new com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f56406c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56408e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Throwable r6 = r0.f56405b
            nm0.l.b(r10)
            goto L9a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.f56404a
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit r6 = (com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit) r6
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L3d
            goto L63
        L3d:
            r7 = move-exception
            goto L68
        L3f:
            nm0.l.b(r10)
            com.google.android.gms.fitness.data.DataSet r7 = r5.F(r7, r9)
            android.content.Context r8 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.fitness.HistoryClient r6 = com.google.android.gms.fitness.Fitness.getHistoryClient(r8, r6)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.tasks.Task r6 = r6.insertData(r7)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = "insertData(...)"
            kotlin.jvm.internal.u.i(r6, r7)     // Catch: java.lang.Throwable -> L66
            r0.f56404a = r5     // Catch: java.lang.Throwable -> L66
            r0.f56408e = r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.await(r6, r0)     // Catch: java.lang.Throwable -> L66
            if (r10 != r1) goto L62
            return r1
        L62:
            r6 = r5
        L63:
            java.lang.Void r10 = (java.lang.Void) r10     // Catch: java.lang.Throwable -> L3d
            goto L6c
        L66:
            r7 = move-exception
            r6 = r5
        L68:
            nm0.k$a r10 = nm0.l.a(r7)
        L6c:
            boolean r7 = r10 instanceof nm0.k.a
            r7 = r7 ^ r4
            r8 = 0
            if (r7 == 0) goto L7c
            r7 = r10
            java.lang.Void r7 = (java.lang.Void) r7
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r9 = "DataSet insert was successful!"
            x70.b.l(r6, r9, r7)
        L7c:
            java.lang.Throwable r7 = nm0.k.b(r10)
            if (r7 == 0) goto L9d
            t10.e r9 = r6.w()
            android.content.Context r6 = r6.getContext()
            com.withings.partner.model.Partner r2 = com.withings.partner.model.Partner.f43456n
            r0.f56404a = r10
            r0.f56405b = r7
            r0.f56408e = r3
            java.lang.Object r6 = r9.l(r6, r2, r0, r8)
            if (r6 != r1) goto L99
            return r1
        L99:
            r6 = r7
        L9a:
            x70.b.n(r6)
        L9d:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.G(com.google.android.gms.auth.api.signin.GoogleSignInAccount, long, float, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(com.google.android.gms.auth.api.signin.GoogleSignInAccount r6, long r7, float r9, qm0.d<? super nm0.y> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.h
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$h r0 = (com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.h) r0
            int r1 = r0.f56416e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56416e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$h r0 = new com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f56414c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56416e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Throwable r6 = r0.f56413b
            nm0.l.b(r10)
            goto Lac
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.f56412a
            com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit r6 = (com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit) r6
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L3d
            goto L75
        L3d:
            r7 = move-exception
            goto L7a
        L3f:
            nm0.l.b(r10)
            com.google.android.gms.fitness.data.DataSet r7 = r5.F(r7, r9)
            com.google.android.gms.fitness.request.DataUpdateRequest$Builder r8 = new com.google.android.gms.fitness.request.DataUpdateRequest$Builder
            r8.<init>()
            com.google.android.gms.fitness.request.DataUpdateRequest$Builder r7 = r8.setDataSet(r7)
            com.google.android.gms.fitness.request.DataUpdateRequest r7 = r7.build()
            java.lang.String r8 = "build(...)"
            kotlin.jvm.internal.u.i(r7, r8)
            android.content.Context r8 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.fitness.HistoryClient r6 = com.google.android.gms.fitness.Fitness.getHistoryClient(r8, r6)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.tasks.Task r6 = r6.updateData(r7)     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = "updateData(...)"
            kotlin.jvm.internal.u.i(r6, r7)     // Catch: java.lang.Throwable -> L78
            r0.f56412a = r5     // Catch: java.lang.Throwable -> L78
            r0.f56416e = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.await(r6, r0)     // Catch: java.lang.Throwable -> L78
            if (r10 != r1) goto L74
            return r1
        L74:
            r6 = r5
        L75:
            java.lang.Void r10 = (java.lang.Void) r10     // Catch: java.lang.Throwable -> L3d
            goto L7e
        L78:
            r7 = move-exception
            r6 = r5
        L7a:
            nm0.k$a r10 = nm0.l.a(r7)
        L7e:
            boolean r7 = r10 instanceof nm0.k.a
            r7 = r7 ^ r4
            r8 = 0
            if (r7 == 0) goto L8e
            r7 = r10
            java.lang.Void r7 = (java.lang.Void) r7
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r9 = "DataSet update was successful!"
            x70.b.l(r6, r9, r7)
        L8e:
            java.lang.Throwable r7 = nm0.k.b(r10)
            if (r7 == 0) goto Laf
            t10.e r9 = r6.w()
            android.content.Context r6 = r6.getContext()
            com.withings.partner.model.Partner r2 = com.withings.partner.model.Partner.f43456n
            r0.f56412a = r10
            r0.f56413b = r7
            r0.f56416e = r3
            java.lang.Object r6 = r9.l(r6, r2, r0, r8)
            if (r6 != r1) goto Lab
            return r1
        Lab:
            r6 = r7
        Lac:
            x70.b.n(r6)
        Laf:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.SyncNightSpO2AverageWithFit.H(com.google.android.gms.auth.api.signin.GoogleSignInAccount, long, float, qm0.d):java.lang.Object");
    }

    public static final q z(SyncNightSpO2AverageWithFit syncNightSpO2AverageWithFit) {
        return (q) syncNightSpO2AverageWithFit.f56391f.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    public final Object t(Partner partner, qm0.d<? super o.a> dVar) {
        Parcelable parcelable;
        SleepTrackData sleepTrackData;
        Float f11;
        c.i iVar = c.i.f103130c;
        boolean i11 = iVar.i(partner);
        Context applicationContext = getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        GoogleSignInAccount a11 = iVar.a(applicationContext);
        nm0.g gVar = this.f56393h;
        Track track = (Track) gVar.getValue();
        DateTime dateTime = null;
        if (track != null) {
            parcelable = track.getData();
        } else {
            parcelable = null;
        }
        if (parcelable instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) parcelable;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData != null) {
            f11 = sleepTrackData.getAverageSpo2();
        } else {
            f11 = null;
        }
        Track track2 = (Track) gVar.getValue();
        if (track2 != null) {
            dateTime = track2.getEndDate();
        }
        if (!i11) {
            return new o.a.c();
        }
        if (a11 != null && f11 != null && dateTime != null) {
            return E(a11, f11.floatValue(), dateTime, dVar);
        }
        return new o.a.c();
    }
}
