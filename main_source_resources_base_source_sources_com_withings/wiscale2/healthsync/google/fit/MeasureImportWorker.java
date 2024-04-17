package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.camera.camera2.internal.o0;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.HealthDataTypes;
import com.google.android.gms.fitness.data.HealthFields;
import com.google.android.gms.fitness.result.DataReadResponse;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import ky.a;
import ky.d;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: MeasureImportWorker.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/MeasureImportWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lny/a;", "batchInsertMeasureGroupUseCase", "Liy/d;", "measuresGroupRemoteRepository", "Lm70/i;", "userManager", "Lt10/e;", "partnerManager", "Liy/e;", "measuresGroupRepositoryV2", "Lsw/a;", "measureDao", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lny/a;Liy/d;Lm70/i;Lt10/e;Liy/e;Lsw/a;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MeasureImportWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final Context f56357a;

    /* renamed from: b  reason: collision with root package name */
    private final ny.a f56358b;

    /* renamed from: c  reason: collision with root package name */
    private final iy.d f56359c;

    /* renamed from: d  reason: collision with root package name */
    private final m70.i f56360d;

    /* renamed from: e  reason: collision with root package name */
    private final t10.e f56361e;

    /* renamed from: f  reason: collision with root package name */
    private final iy.e f56362f;

    /* renamed from: g  reason: collision with root package name */
    private final sw.a f56363g;

    /* renamed from: h  reason: collision with root package name */
    private final int f56364h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f56365i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeasureImportWorker.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker", f = "MeasureImportWorker.kt", l = {88}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56366a;

        /* renamed from: c  reason: collision with root package name */
        int f56368c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56366a = obj;
            this.f56368c |= Integer.MIN_VALUE;
            return MeasureImportWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeasureImportWorker.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$doWork$2", f = "MeasureImportWorker.kt", l = {89, 95}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Partner f56369a;

        /* renamed from: b  reason: collision with root package name */
        int f56370b;

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

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Partner partner;
            Object obj2;
            Partner partner2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56370b;
            MeasureImportWorker measureImportWorker = MeasureImportWorker.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        partner2 = this.f56369a;
                        nm0.l.b(obj);
                        partner = partner2;
                        t10.h.c(measureImportWorker.getContext(), partner);
                        return new o.a.c();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                t10.e eVar = measureImportWorker.f56361e;
                Context context = measureImportWorker.getContext();
                int i12 = measureImportWorker.f56364h;
                this.f56370b = 1;
                obj = eVar.f(context, i12, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            partner = (Partner) obj;
            if (partner == null) {
                return new o.a.c();
            }
            int c11 = measureImportWorker.getInputData().c("measureType", Integer.MIN_VALUE);
            Iterator it = v10.d.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    Integer w11 = ((v10.c) obj2).w();
                    if (w11 != null && c11 == w11.intValue()) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            v10.c cVar = (v10.c) obj2;
            if (cVar != null) {
                boolean i13 = cVar.i(partner);
                Context applicationContext = measureImportWorker.getApplicationContext();
                u.i(applicationContext, "getApplicationContext(...)");
                GoogleSignInAccount a11 = cVar.a(applicationContext);
                if (i13 && a11 != null) {
                    DataType m11 = cVar.m();
                    if (m11 != null) {
                        this.f56369a = partner;
                        this.f56370b = 2;
                        Object coroutineScope = CoroutineScopeKt.coroutineScope(new l(c11, a11, m11, measureImportWorker, null), this);
                        if (coroutineScope != CoroutineSingletons.f76214a) {
                            coroutineScope = y.f85009a;
                        }
                        if (coroutineScope == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        partner2 = partner;
                        partner = partner2;
                    }
                    t10.h.c(measureImportWorker.getContext(), partner);
                }
                return new o.a.c();
            }
            throw new IllegalArgumentException(o0.a("Measure type ", c11, " is not yet supported for insertion from Google Fit"));
        }
    }

    /* compiled from: MeasureImportWorker.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<User> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            MeasureImportWorker measureImportWorker = MeasureImportWorker.this;
            return measureImportWorker.f56360d.i(measureImportWorker.getInputData().e(NavigationArguments.USER_ID, Long.MIN_VALUE));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasureImportWorker(Context context, WorkerParameters params, ny.a batchInsertMeasureGroupUseCase, iy.d measuresGroupRemoteRepository, m70.i userManager, t10.e partnerManager, iy.e measuresGroupRepositoryV2, sw.a measureDao) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(batchInsertMeasureGroupUseCase, "batchInsertMeasureGroupUseCase");
        u.j(measuresGroupRemoteRepository, "measuresGroupRemoteRepository");
        u.j(userManager, "userManager");
        u.j(partnerManager, "partnerManager");
        u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        u.j(measureDao, "measureDao");
        this.f56357a = context;
        this.f56358b = batchInsertMeasureGroupUseCase;
        this.f56359c = measuresGroupRemoteRepository;
        this.f56360d = userManager;
        this.f56361e = partnerManager;
        this.f56362f = measuresGroupRepositoryV2;
        this.f56363g = measureDao;
        this.f56364h = 15;
        this.f56365i = nm0.h.b(new c());
    }

    public static final User B(MeasureImportWorker measureImportWorker) {
        return (User) measureImportWorker.f56365i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker r5, java.util.ArrayList r6, qm0.d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.withings.wiscale2.healthsync.google.fit.m
            if (r0 == 0) goto L16
            r0 = r7
            com.withings.wiscale2.healthsync.google.fit.m r0 = (com.withings.wiscale2.healthsync.google.fit.m) r0
            int r1 = r0.f56478c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56478c = r1
            goto L1b
        L16:
            com.withings.wiscale2.healthsync.google.fit.m r0 = new com.withings.wiscale2.healthsync.google.fit.m
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f56476a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56478c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r7)
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            nm0.l.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.healthsync.google.fit.n r2 = new com.withings.wiscale2.healthsync.google.fit.n
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f56478c = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L48
            goto L4e
        L48:
            nm0.k r7 = (nm0.k) r7
            java.lang.Object r1 = r7.c()
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker.D(com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker, java.util.ArrayList, qm0.d):java.lang.Object");
    }

    public static final ky.d o(MeasureImportWorker measureImportWorker, DataPoint dataPoint) {
        List V;
        measureImportWorker.getClass();
        DateTime dateTime = new DateTime(dataPoint.getTimestamp(TimeUnit.MILLISECONDS));
        long q11 = ((User) measureImportWorker.f56365i.getValue()).q();
        DataType dataType = dataPoint.getDataType();
        if (u.e(dataType, DataType.TYPE_WEIGHT)) {
            V = x.V(new ky.a(dataPoint.getValue(Field.FIELD_WEIGHT).asFloat(), 1, dateTime, null, new a.C1236a(-4, null, null, null, null, null)));
        } else if (u.e(dataType, HealthDataTypes.TYPE_BLOOD_PRESSURE)) {
            V = x.W(new ky.a(dataPoint.getValue(HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC).asFloat(), 9, dateTime, null, new a.C1236a(0, null, null, null, null, null)), new ky.a(dataPoint.getValue(HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC).asFloat(), 10, dateTime, null, new a.C1236a(0, null, null, null, null, null)));
        } else if (u.e(dataType, HealthDataTypes.TYPE_OXYGEN_SATURATION)) {
            V = x.W(new ky.a(dataPoint.getValue(HealthFields.FIELD_OXYGEN_SATURATION).asFloat(), 54, dateTime, null, new a.C1236a(0, null, null, null, null, null)), new ky.a(100.0d, 89, dateTime, null, new a.C1236a(0, null, null, null, null, null)));
        } else if (u.e(dataType, HealthDataTypes.TYPE_BODY_TEMPERATURE)) {
            V = x.V(new ky.a(dataPoint.getValue(HealthFields.FIELD_BODY_TEMPERATURE).asFloat(), 71, dateTime, null, new a.C1236a(0, null, null, null, null, null)));
        } else {
            DataType dataType2 = dataPoint.getDataType();
            throw new IllegalStateException("Measure import does not handle this type of dataType:" + dataType2);
        }
        List list = V;
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        return new ky.d(-1L, -1L, q11, list, dateTime, null, now, false, new d.a(0, 1002, null, null, measureImportWorker.f56364h));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    public static final ArrayList t(MeasureImportWorker measureImportWorker, DataReadResponse dataReadResponse, List list) {
        measureImportWorker.getClass();
        List<DataSet> dataSets = dataReadResponse.getDataSets();
        u.i(dataSets, "getDataSets(...)");
        ArrayList arrayList = new ArrayList();
        for (DataSet dataSet : dataSets) {
            List<DataPoint> dataPoints = dataSet.getDataPoints();
            u.i(dataPoints, "getDataPoints(...)");
            x.o(arrayList, cp0.n.t(cp0.n.i(cp0.n.i(cp0.n.i(cp0.n.y(x.t(dataPoints), new Object()), d.f56442a), e.f56443a), new j(list)), new k(measureImportWorker)));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        r5 = hy.g.e(ky.d.a((ky.d) r7, 0, r5.b(), 0, null, null, new org.joda.time.DateTime(org.joda.time.Instant.ofEpochSecond(r3)), false, null, 445));
        r22.f56363g.d(r5.getWsId(), r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker r22, java.util.List r23, java.util.List r24) {
        /*
            r22.getClass()
            com.withings.wiscale2.data.WiscaleDBH r1 = com.withings.wiscale2.data.WiscaleDBH.f()
            r1.j()
            r0 = r23
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8d
        L12:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L8d
            my.a r2 = (my.a) r2     // Catch: java.lang.Throwable -> L8d
            long r3 = r2.a()     // Catch: java.lang.Throwable -> L8d
            java.util.List r2 = r2.b()     // Catch: java.lang.Throwable -> L8d
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8d
        L2c:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L8d
            my.a$a r5 = (my.a.C1329a) r5     // Catch: java.lang.Throwable -> L8d
            r6 = r24
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L8d
        L40:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r7 == 0) goto L92
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L8d
            r8 = r7
            ky.d r8 = (ky.d) r8     // Catch: java.lang.Throwable -> L8d
            long r8 = r8.d()     // Catch: java.lang.Throwable -> L8d
            long r10 = r5.a()     // Catch: java.lang.Throwable -> L8d
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L8f
            r9 = r7
            ky.d r9 = (ky.d) r9     // Catch: java.lang.Throwable -> L8d
            long r12 = r5.b()     // Catch: java.lang.Throwable -> L8d
            org.joda.time.DateTime r5 = new org.joda.time.DateTime     // Catch: java.lang.Throwable -> L8d
            org.joda.time.Instant r6 = org.joda.time.Instant.ofEpochSecond(r3)     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 445(0x1bd, float:6.24E-43)
            r10 = 0
            r14 = 0
            r18 = r5
            ky.d r5 = ky.d.a(r9, r10, r12, r14, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L8d
            com.withings.library.measure.MeasuresGroup r5 = hy.g.e(r5)     // Catch: java.lang.Throwable -> L8d
            r7 = r22
            sw.a r6 = r7.f56363g     // Catch: java.lang.Throwable -> L8d
            long r8 = r5.getWsId()     // Catch: java.lang.Throwable -> L8d
            r6.d(r8, r5)     // Catch: java.lang.Throwable -> L8d
            goto L2c
        L8d:
            r0 = move-exception
            goto La5
        L8f:
            r7 = r22
            goto L40
        L92:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L9a:
            r7 = r22
            goto L12
        L9e:
            r1.o()     // Catch: java.lang.Throwable -> L8d
            r1.p()
            return
        La5:
            r1.p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker.v(com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker, java.util.List, java.util.List):void");
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
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$a r0 = (com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker.a) r0
            int r1 = r0.f56368c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56368c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$a r0 = new com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56366a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56368c
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
            com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$b r2 = new com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f56368c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker.doWork(qm0.d):java.lang.Object");
    }

    public final Context getContext() {
        return this.f56357a;
    }
}
