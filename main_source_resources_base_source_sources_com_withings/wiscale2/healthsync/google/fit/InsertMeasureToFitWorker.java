package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.HealthDataTypes;
import com.google.android.gms.fitness.data.HealthFields;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import ym0.p;
/* compiled from: SyncMeasureWithFit.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/InsertMeasureToFitWorker;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lgg0/c;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InsertMeasureToFitWorker extends FitSyncWorker {

    /* renamed from: f  reason: collision with root package name */
    private final gg0.c f56305f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker", f = "SyncMeasureWithFit.kt", l = {ConstantsWs.MEASURE_TYPE_LEUKOCYTES, ConstantsWs.MEASURE_TYPE_HR_SD_NN}, m = "doFitSync")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56306a;

        /* renamed from: c  reason: collision with root package name */
        int f56308c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56306a = obj;
            this.f56308c |= Integer.MIN_VALUE;
            return InsertMeasureToFitWorker.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker", f = "SyncMeasureWithFit.kt", l = {ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD, ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "exportWithDateBounds")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        InsertMeasureToFitWorker f56309a;

        /* renamed from: b  reason: collision with root package name */
        Partner f56310b;

        /* renamed from: c  reason: collision with root package name */
        t10.e f56311c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56312d;

        /* renamed from: f  reason: collision with root package name */
        int f56314f;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56312d = obj;
            this.f56314f |= Integer.MIN_VALUE;
            return InsertMeasureToFitWorker.this.E(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$exportWithDateBounds$measureIds$1", f = "SyncMeasureWithFit.kt", l = {ConstantsWs.MEASURE_TYPE_HR_BCGIPG}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super long[]>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56315a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f56317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j5, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f56317c = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f56317c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super long[]> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56315a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                InsertMeasureToFitWorker insertMeasureToFitWorker = InsertMeasureToFitWorker.this;
                this.f56315a = 1;
                obj = insertMeasureToFitWorker.f56305f.e().a(insertMeasureToFitWorker.getUser().q(), new Long(this.f56317c), true, null, new int[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (ky.d dVar : (Iterable) obj) {
                Long l5 = new Long(dVar.d());
                if (l5.longValue() == -1) {
                    l5 = null;
                }
                if (l5 != null) {
                    arrayList.add(l5);
                }
            }
            return x.R0(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker", f = "SyncMeasureWithFit.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_WALKING_DOUBLE_SUPPORT, ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT}, m = "exportWithMeasureIds")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        InsertMeasureToFitWorker f56318a;

        /* renamed from: b  reason: collision with root package name */
        Partner f56319b;

        /* renamed from: c  reason: collision with root package name */
        t10.e f56320c;

        /* renamed from: d  reason: collision with root package name */
        List f56321d;

        /* renamed from: e  reason: collision with root package name */
        Iterator f56322e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f56323f;

        /* renamed from: h  reason: collision with root package name */
        int f56325h;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56323f = obj;
            this.f56325h |= Integer.MIN_VALUE;
            return InsertMeasureToFitWorker.this.F(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker", f = "SyncMeasureWithFit.kt", l = {ConstantsWs.WS_STATUS_WRONGACCOUNTID, ConstantsWs.WS_STATUS_WRONGASSOCID}, m = "insertDataSet")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56326a;

        /* renamed from: b  reason: collision with root package name */
        Object f56327b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56328c;

        /* renamed from: e  reason: collision with root package name */
        int f56330e;

        e(qm0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56328c = obj;
            this.f56330e |= Integer.MIN_VALUE;
            return InsertMeasureToFitWorker.this.H(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker", f = "SyncMeasureWithFit.kt", l = {205}, m = "processMeasure")
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56331a;

        /* renamed from: c  reason: collision with root package name */
        int f56333c;

        f(qm0.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56331a = obj;
            this.f56333c |= Integer.MIN_VALUE;
            return InsertMeasureToFitWorker.this.I(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$processMeasure$2", f = "SyncMeasureWithFit.kt", l = {214}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsertMeasureToFitWorker f56335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DataType f56336c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Partner f56337d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<tf0.b> f56338e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t10.e f56339f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(DataType dataType, t10.e eVar, Partner partner, InsertMeasureToFitWorker insertMeasureToFitWorker, List list, qm0.d dVar) {
            super(2, dVar);
            this.f56335b = insertMeasureToFitWorker;
            this.f56336c = dataType;
            this.f56337d = partner;
            this.f56338e = list;
            this.f56339f = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            List<tf0.b> list = this.f56338e;
            return new g(this.f56336c, this.f56339f, this.f56337d, this.f56335b, list, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DataType dataType;
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56334a;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    InsertMeasureToFitWorker insertMeasureToFitWorker = this.f56335b;
                    insertMeasureToFitWorker.getClass();
                    Iterator<T> it = v10.d.b().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        dataType = this.f56336c;
                        if (hasNext) {
                            obj2 = it.next();
                            if (u.e(dataType, ((v10.c) obj2).m())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    v10.c cVar = (v10.c) obj2;
                    if (cVar != null) {
                        boolean i12 = cVar.i(this.f56337d);
                        Context applicationContext = insertMeasureToFitWorker.getApplicationContext();
                        u.i(applicationContext, "getApplicationContext(...)");
                        GoogleSignInAccount a11 = cVar.a(applicationContext);
                        if (!i12) {
                            return new o.a.c();
                        }
                        if (a11 == null) {
                            return new o.a.c();
                        }
                        InsertMeasureToFitWorker insertMeasureToFitWorker2 = this.f56335b;
                        List<tf0.b> list = this.f56338e;
                        DataType dataType2 = this.f56336c;
                        t10.e eVar = this.f56339f;
                        this.f56334a = 1;
                        if (InsertMeasureToFitWorker.B(insertMeasureToFitWorker2, a11, list, dataType2, eVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        throw new IllegalArgumentException("Fit dataType " + dataType + " is not yet supported for export to Google Fit");
                    }
                }
                return new o.a.c();
            } catch (Exception e11) {
                x70.b.n(e11);
                return new o.a.C0176a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker", f = "SyncMeasureWithFit.kt", l = {ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED, 256}, m = "updateDataSet")
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56340a;

        /* renamed from: b  reason: collision with root package name */
        Object f56341b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56342c;

        /* renamed from: e  reason: collision with root package name */
        int f56344e;

        h(qm0.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56342c = obj;
            this.f56344e |= Integer.MIN_VALUE;
            return InsertMeasureToFitWorker.this.J(null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsertMeasureToFitWorker(Context context, WorkerParameters params, gg0.c workerDependency) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(workerDependency, "workerDependency");
        this.f56305f = workerDependency;
    }

    public static final Object B(InsertMeasureToFitWorker insertMeasureToFitWorker, GoogleSignInAccount googleSignInAccount, List list, DataType dataType, t10.e eVar, qm0.d dVar) {
        int c11 = insertMeasureToFitWorker.getInputData().c(DeliveryReceiptRequest.ELEMENT, Integer.MIN_VALUE);
        if (c11 != 1) {
            if (c11 == 2) {
                Object J = insertMeasureToFitWorker.J(googleSignInAccount, list, dataType, eVar, dVar);
                if (J != CoroutineSingletons.f76214a) {
                    return y.f85009a;
                }
                return J;
            }
            throw new IllegalStateException("You should provide a request input");
        }
        Object H = insertMeasureToFitWorker.H(googleSignInAccount, list, dataType, eVar, dVar);
        if (H != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(com.withings.partner.model.Partner r9, t10.e r10, qm0.d<? super nm0.y> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.b
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$b r0 = (com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.b) r0
            int r1 = r0.f56314f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56314f = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$b r0 = new com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f56312d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56314f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            nm0.l.b(r11)
            goto L8a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            t10.e r10 = r0.f56311c
            com.withings.partner.model.Partner r9 = r0.f56310b
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker r2 = r0.f56309a
            nm0.l.b(r11)
            goto L79
        L3d:
            nm0.l.b(r11)
            androidx.work.f r11 = r8.getInputData()
            java.lang.String r2 = "types"
            int[] r11 = r11.d(r2)
            if (r11 == 0) goto L93
            u10.a0 r2 = u10.a0.f101222d
            if (r2 == 0) goto L8d
            int r6 = r8.v()
            int r11 = kotlin.collections.l.A(r11)
            org.joda.time.DateTime r11 = r2.d(r6, r11)
            long r6 = r11.getMillis()
            kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$c r2 = new com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$c
            r2.<init>(r6, r3)
            r0.f56309a = r8
            r0.f56310b = r9
            r0.f56311c = r10
            r0.f56314f = r5
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0)
            if (r11 != r1) goto L78
            return r1
        L78:
            r2 = r8
        L79:
            long[] r11 = (long[]) r11
            r0.f56309a = r3
            r0.f56310b = r3
            r0.f56311c = r3
            r0.f56314f = r4
            java.lang.Object r9 = r2.F(r11, r9, r10, r0)
            if (r9 != r1) goto L8a
            return r1
        L8a:
            nm0.y r9 = nm0.y.f85009a
            return r9
        L8d:
            java.lang.String r9 = "instance"
            kotlin.jvm.internal.u.s(r9)
            throw r3
        L93:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "You should provide a list of types to export"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.E(com.withings.partner.model.Partner, t10.e, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(long[] r20, com.withings.partner.model.Partner r21, t10.e r22, qm0.d<? super nm0.y> r23) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.F(long[], com.withings.partner.model.Partner, t10.e, qm0.d):java.lang.Object");
    }

    private final DataSet G(List<tf0.b> list, DataType dataType) {
        DataSource.Builder dataType2 = new DataSource.Builder().setAppPackageName(getApplicationContext()).setDataType(dataType);
        String name = dataType.getName();
        DataSource build = dataType2.setStreamName(name + "-Withings").setType(0).build();
        u.i(build, "build(...)");
        DataSet.Builder builder = DataSet.builder(build);
        List<tf0.b> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (tf0.b bVar : list2) {
            DataPoint.Builder timestamp = DataPoint.builder(build).setTimestamp(bVar.c(), TimeUnit.MILLISECONDS);
            if (u.e(dataType, DataType.TYPE_WEIGHT)) {
                Iterator<T> it = bVar.d().iterator();
                while (it.hasNext()) {
                    nm0.j jVar = (nm0.j) it.next();
                    if (((Number) jVar.c()).intValue() == 1) {
                        timestamp.setField(Field.FIELD_WEIGHT, ((Number) jVar.d()).floatValue());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else if (u.e(dataType, DataType.TYPE_BODY_FAT_PERCENTAGE)) {
                Iterator<T> it2 = bVar.d().iterator();
                while (it2.hasNext()) {
                    nm0.j jVar2 = (nm0.j) it2.next();
                    if (((Number) jVar2.c()).intValue() == 6) {
                        timestamp.setField(Field.FIELD_PERCENTAGE, ((Number) jVar2.d()).floatValue());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else if (u.e(dataType, HealthDataTypes.TYPE_OXYGEN_SATURATION)) {
                Iterator<T> it3 = bVar.d().iterator();
                while (it3.hasNext()) {
                    nm0.j jVar3 = (nm0.j) it3.next();
                    if (((Number) jVar3.c()).intValue() == 54) {
                        timestamp.setField(HealthFields.FIELD_OXYGEN_SATURATION, ((Number) jVar3.d()).floatValue());
                        timestamp.setField(HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE, 0.0f);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else if (u.e(dataType, DataType.TYPE_HEART_RATE_BPM)) {
                Iterator<T> it4 = bVar.d().iterator();
                while (it4.hasNext()) {
                    nm0.j jVar4 = (nm0.j) it4.next();
                    if (((Number) jVar4.c()).intValue() == 11) {
                        timestamp.setField(Field.FIELD_BPM, ((Number) jVar4.d()).floatValue());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else if (u.e(dataType, HealthDataTypes.TYPE_BLOOD_PRESSURE)) {
                Iterator<T> it5 = bVar.d().iterator();
                while (it5.hasNext()) {
                    nm0.j jVar5 = (nm0.j) it5.next();
                    if (((Number) jVar5.c()).intValue() == 10) {
                        float floatValue = ((Number) jVar5.d()).floatValue();
                        Iterator<T> it6 = bVar.d().iterator();
                        while (it6.hasNext()) {
                            nm0.j jVar6 = (nm0.j) it6.next();
                            if (((Number) jVar6.c()).intValue() == 9) {
                                float floatValue2 = ((Number) jVar6.d()).floatValue();
                                timestamp.setField(HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC, floatValue);
                                timestamp.setField(HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC, floatValue2);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else if (u.e(dataType, HealthDataTypes.TYPE_BODY_TEMPERATURE)) {
                Iterator<T> it7 = bVar.d().iterator();
                while (it7.hasNext()) {
                    nm0.j jVar7 = (nm0.j) it7.next();
                    if (((Number) jVar7.c()).intValue() == 71) {
                        timestamp.setField(HealthFields.FIELD_BODY_TEMPERATURE, ((Number) jVar7.d()).floatValue());
                        if (bVar.b() instanceof r) {
                            timestamp.setField(HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION, 3);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else {
                continue;
            }
            DataPoint build2 = timestamp.build();
            u.i(build2, "build(...)");
            arrayList.add(build2);
        }
        DataSet build3 = builder.addAll(arrayList).build();
        u.i(build3, "build(...)");
        return build3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(com.google.android.gms.auth.api.signin.GoogleSignInAccount r6, java.util.List<tf0.b> r7, com.google.android.gms.fitness.data.DataType r8, t10.e r9, qm0.d<? super nm0.y> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.e
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$e r0 = (com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.e) r0
            int r1 = r0.f56330e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56330e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$e r0 = new com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f56328c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56330e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f56327b
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            nm0.l.b(r10)
            goto L9f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.f56327b
            r9 = r6
            t10.e r9 = (t10.e) r9
            java.lang.Object r6 = r0.f56326a
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker r6 = (com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker) r6
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L44
            goto L6c
        L44:
            r7 = move-exception
            goto L71
        L46:
            nm0.l.b(r10)
            android.content.Context r10 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.fitness.HistoryClient r6 = com.google.android.gms.fitness.Fitness.getHistoryClient(r10, r6)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.fitness.data.DataSet r7 = r5.G(r7, r8)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.tasks.Task r6 = r6.insertData(r7)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r7 = "insertData(...)"
            kotlin.jvm.internal.u.i(r6, r7)     // Catch: java.lang.Throwable -> L6f
            r0.f56326a = r5     // Catch: java.lang.Throwable -> L6f
            r0.f56327b = r9     // Catch: java.lang.Throwable -> L6f
            r0.f56330e = r4     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.await(r6, r0)     // Catch: java.lang.Throwable -> L6f
            if (r10 != r1) goto L6b
            return r1
        L6b:
            r6 = r5
        L6c:
            java.lang.Void r10 = (java.lang.Void) r10     // Catch: java.lang.Throwable -> L44
            goto L75
        L6f:
            r7 = move-exception
            r6 = r5
        L71:
            nm0.k$a r10 = nm0.l.a(r7)
        L75:
            boolean r7 = r10 instanceof nm0.k.a
            r7 = r7 ^ r4
            r8 = 0
            if (r7 == 0) goto L85
            r7 = r10
            java.lang.Void r7 = (java.lang.Void) r7
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r2 = "DataSet insert was successful!"
            x70.b.l(r6, r2, r7)
        L85:
            java.lang.Throwable r7 = nm0.k.b(r10)
            if (r7 == 0) goto La2
            android.content.Context r6 = r6.getContext()
            com.withings.partner.model.Partner r2 = com.withings.partner.model.Partner.f43456n
            r0.f56326a = r10
            r0.f56327b = r7
            r0.f56330e = r3
            java.lang.Object r6 = r9.l(r6, r2, r0, r8)
            if (r6 != r1) goto L9e
            return r1
        L9e:
            r6 = r7
        L9f:
            x70.b.n(r6)
        La2:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.H(com.google.android.gms.auth.api.signin.GoogleSignInAccount, java.util.List, com.google.android.gms.fitness.data.DataType, t10.e, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(com.google.android.gms.fitness.data.DataType r13, java.util.List<tf0.b> r14, com.withings.partner.model.Partner r15, t10.e r16, qm0.d<? super androidx.work.o.a> r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.f
            if (r1 == 0) goto L16
            r1 = r0
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$f r1 = (com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.f) r1
            int r2 = r1.f56333c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f56333c = r2
            r9 = r12
            goto L1c
        L16:
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$f r1 = new com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$f
            r9 = r12
            r1.<init>(r0)
        L1c:
            java.lang.Object r0 = r1.f56331a
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r1.f56333c
            r11 = 1
            if (r2 == 0) goto L33
            if (r2 != r11) goto L2b
            nm0.l.b(r0)
            goto L4c
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            nm0.l.b(r0)
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$g r0 = new com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$g
            r8 = 0
            r2 = r0
            r3 = r13
            r4 = r16
            r5 = r15
            r6 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.f56333c = r11
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            if (r0 != r10) goto L4c
            return r10
        L4c:
            java.lang.String r1 = "coroutineScope(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.I(com.google.android.gms.fitness.data.DataType, java.util.List, com.withings.partner.model.Partner, t10.e, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(com.google.android.gms.auth.api.signin.GoogleSignInAccount r15, java.util.List<tf0.b> r16, com.google.android.gms.fitness.data.DataType r17, t10.e r18, qm0.d<? super nm0.y> r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.J(com.google.android.gms.auth.api.signin.GoogleSignInAccount, java.util.List, com.google.android.gms.fitness.data.DataType, t10.e, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.withings.partner.model.Partner r12, qm0.d<? super androidx.work.o.a> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.a
            if (r0 == 0) goto L13
            r0 = r13
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$a r0 = (com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.a) r0
            int r1 = r0.f56308c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56308c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$a r0 = new com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f56306a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56308c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2f
            if (r2 != r4) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            nm0.l.b(r13)
            goto L7c
        L33:
            nm0.l.b(r13)
            androidx.work.f r13 = r11.getInputData()
            java.lang.String r2 = "measureIds"
            long[] r13 = r13.f(r2)
            if (r13 == 0) goto L5f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r5 = r13.length
            r6 = 0
        L49:
            if (r6 >= r5) goto L5a
            r7 = r13[r6]
            r9 = -1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L54
            goto L57
        L54:
            androidx.compose.material.w7.k(r7, r2)
        L57:
            int r6 = r6 + 1
            goto L49
        L5a:
            long[] r13 = kotlin.collections.x.R0(r2)
            goto L60
        L5f:
            r13 = 0
        L60:
            if (r13 == 0) goto L6f
            t10.e r2 = r11.w()
            r0.f56308c = r3
            java.lang.Object r12 = r11.F(r13, r12, r2, r0)
            if (r12 != r1) goto L7c
            return r1
        L6f:
            t10.e r13 = r11.w()
            r0.f56308c = r4
            java.lang.Object r12 = r11.E(r12, r13, r0)
            if (r12 != r1) goto L7c
            return r1
        L7c:
            androidx.work.o$a$c r12 = new androidx.work.o$a$c
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker.t(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
