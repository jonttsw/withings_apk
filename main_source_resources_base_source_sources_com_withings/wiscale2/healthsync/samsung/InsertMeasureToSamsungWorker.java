package com.withings.wiscale2.healthsync.samsung;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.r;
import androidx.work.w;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.healthdata.HealthData;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.j;
import nm0.y;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import y10.a;
/* compiled from: ExportMeasureToSamsung.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/withings/wiscale2/healthsync/samsung/InsertMeasureToSamsungWorker;", "Lcom/withings/wiscale2/healthsync/samsung/SHealthWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Liy/c;", "measureGroupRepository", "Liy/e;", "measuresGroupRepositoryV2", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Liy/c;Liy/e;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InsertMeasureToSamsungWorker extends SHealthWorker {

    /* renamed from: f  reason: collision with root package name */
    private final iy.c f56898f;

    /* renamed from: g  reason: collision with root package name */
    private final iy.e f56899g;

    /* compiled from: ExportMeasureToSamsung.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static r a(long j5, int... types) {
            u.j(types, "types");
            j[] jVarArr = {new j(DeliveryReceiptRequest.ELEMENT, 1), new j(NavigationArguments.USER_ID, Long.valueOf(j5)), new j(WsVasistasSerie.KEY_TYPES, types)};
            f.a aVar = new f.a();
            for (int i11 = 0; i11 < 3; i11++) {
                j jVar = jVarArr[i11];
                aVar.b(jVar.d(), (String) jVar.c());
            }
            return ((r.a) new w.a(InsertMeasureToSamsungWorker.class).j(aVar.a())).i(5L, TimeUnit.SECONDS).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportMeasureToSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker", f = "ExportMeasureToSamsung.kt", l = {225, 226}, m = "doSHealthSync")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56900a;

        /* renamed from: c  reason: collision with root package name */
        int f56902c;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56900a = obj;
            this.f56902c |= Integer.MIN_VALUE;
            return InsertMeasureToSamsungWorker.this.v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportMeasureToSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker", f = "ExportMeasureToSamsung.kt", l = {ConstantsWs.WS_STATUS_WRONGMACADDRESS, ConstantsWs.WS_STATUS_WRONGACCOUNTID}, m = "exportWithDateBounds")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        InsertMeasureToSamsungWorker f56903a;

        /* renamed from: b  reason: collision with root package name */
        Partner f56904b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56905c;

        /* renamed from: e  reason: collision with root package name */
        int f56907e;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56905c = obj;
            this.f56907e |= Integer.MIN_VALUE;
            return InsertMeasureToSamsungWorker.this.E(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportMeasureToSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker", f = "ExportMeasureToSamsung.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICEID, ConstantsWs.WS_STATUS_WRONGUSERID}, m = "exportWithMeasureIds")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        InsertMeasureToSamsungWorker f56908a;

        /* renamed from: b  reason: collision with root package name */
        Partner f56909b;

        /* renamed from: c  reason: collision with root package name */
        List f56910c;

        /* renamed from: d  reason: collision with root package name */
        Iterator f56911d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f56912e;

        /* renamed from: g  reason: collision with root package name */
        int f56914g;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56912e = obj;
            this.f56914g |= Integer.MIN_VALUE;
            return InsertMeasureToSamsungWorker.this.F(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportMeasureToSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker", f = "ExportMeasureToSamsung.kt", l = {89}, m = "processMeasure")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56915a;

        /* renamed from: c  reason: collision with root package name */
        int f56917c;

        e(qm0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56915a = obj;
            this.f56917c |= Integer.MIN_VALUE;
            return InsertMeasureToSamsungWorker.this.H(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsertMeasureToSamsungWorker(Context context, WorkerParameters params, iy.c measureGroupRepository, iy.e measuresGroupRepositoryV2) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(measureGroupRepository, "measureGroupRepository");
        u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        this.f56898f = measureGroupRepository;
        this.f56899g = measuresGroupRepositoryV2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:23|24))(6:25|(2:28|26)|29|30|31|(2:33|34))|12|13|(1:15)|16|(1:18)|19|20))|37|6|7|(0)(0)|12|13|(0)|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        r9 = nm0.l.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r5, y10.a r6, java.util.List r7, com.samsung.android.sdk.healthdata.HealthDataResolver r8, qm0.d r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof com.withings.wiscale2.healthsync.samsung.e
            if (r0 == 0) goto L16
            r0 = r9
            com.withings.wiscale2.healthsync.samsung.e r0 = (com.withings.wiscale2.healthsync.samsung.e) r0
            int r1 = r0.f56977d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56977d = r1
            goto L1b
        L16:
            com.withings.wiscale2.healthsync.samsung.e r0 = new com.withings.wiscale2.healthsync.samsung.e
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.f56975b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56977d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r5 = r0.f56974a
            nm0.l.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L7d
        L2c:
            r6 = move-exception
            goto L80
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            nm0.l.b(r9)
            com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest$Builder r9 = new com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest$Builder
            r9.<init>()
            java.lang.String r2 = r6.a()
            com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest$Builder r9 = r9.setDataType(r2)
            com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest r9 = r9.build()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.x.y(r7, r4)
            r2.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
        L5b:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r7.next()
            jg0.a r4 = (jg0.a) r4
            com.samsung.android.sdk.healthdata.HealthData r4 = I(r4, r6)
            r2.add(r4)
            goto L5b
        L6f:
            r9.addHealthData(r2)
            r0.f56974a = r5     // Catch: java.lang.Throwable -> L2c
            r0.f56977d = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = y10.d.a(r8, r9, r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r1) goto L7d
            goto La5
        L7d:
            com.samsung.android.sdk.healthdata.HealthResultHolder$BaseResult r9 = (com.samsung.android.sdk.healthdata.HealthResultHolder.BaseResult) r9     // Catch: java.lang.Throwable -> L2c
            goto L84
        L80:
            nm0.k$a r9 = nm0.l.a(r6)
        L84:
            boolean r6 = r9 instanceof nm0.k.a
            r6 = r6 ^ r3
            r7 = 0
            if (r6 == 0) goto L94
            r6 = r9
            com.samsung.android.sdk.healthdata.HealthResultHolder$BaseResult r6 = (com.samsung.android.sdk.healthdata.HealthResultHolder.BaseResult) r6
            java.lang.String r6 = "insertChunk success"
            java.lang.Object[] r8 = new java.lang.Object[r7]
            x70.b.b(r5, r6, r8)
        L94:
            java.lang.Throwable r6 = nm0.k.b(r9)
            if (r6 == 0) goto La3
            java.lang.String r6 = r6.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[r7]
            x70.b.d(r5, r6, r7)
        La3:
            nm0.y r1 = nm0.y.f85009a
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.B(com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker, y10.a, java.util.List, com.samsung.android.sdk.healthdata.HealthDataResolver, qm0.d):java.lang.Object");
    }

    public static final /* synthetic */ HealthData D(InsertMeasureToSamsungWorker insertMeasureToSamsungWorker, jg0.a aVar, y10.a aVar2) {
        insertMeasureToSamsungWorker.getClass();
        return I(aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[LOOP:0: B:27:0x00c1->B:29:0x00c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(com.withings.partner.model.Partner r22, qm0.d<? super nm0.y> r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.E(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(long[] r12, com.withings.partner.model.Partner r13, qm0.d<? super nm0.y> r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.F(long[], com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }

    private final Object G(y10.a aVar, List<jg0.a> list, Partner partner, qm0.d<? super y> dVar) {
        int c11 = getInputData().c(DeliveryReceiptRequest.ELEMENT, Integer.MIN_VALUE);
        if (c11 != 1) {
            if (c11 == 2) {
                Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new g(this, aVar, partner, list, null), dVar);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                if (withContext != coroutineSingletons) {
                    withContext = y.f85009a;
                }
                if (withContext == coroutineSingletons) {
                    return withContext;
                }
                return y.f85009a;
            }
            throw new IllegalStateException("You should provide a request input");
        }
        Object withContext2 = BuildersKt.withContext(Dispatchers.getMain(), new com.withings.wiscale2.healthsync.samsung.d(this, aVar, partner, list, null), dVar);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f76214a;
        if (withContext2 != coroutineSingletons2) {
            withContext2 = y.f85009a;
        }
        if (withContext2 == coroutineSingletons2) {
            return withContext2;
        }
        return y.f85009a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.String r5, java.util.List<jg0.a> r6, com.withings.partner.model.Partner r7, qm0.d<? super androidx.work.o.a> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.e
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$e r0 = (com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.e) r0
            int r1 = r0.f56917c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56917c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$e r0 = new com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f56915a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56917c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r8)     // Catch: java.lang.Exception -> L45
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            nm0.l.b(r8)
            y10.a r5 = b50.b.a(r5)
            r0.f56917c = r3     // Catch: java.lang.Exception -> L45
            java.lang.Object r5 = r4.G(r5, r6, r7, r0)     // Catch: java.lang.Exception -> L45
            if (r5 != r1) goto L3f
            return r1
        L3f:
            androidx.work.o$a$c r5 = new androidx.work.o$a$c     // Catch: java.lang.Exception -> L45
            r5.<init>()     // Catch: java.lang.Exception -> L45
            goto L4a
        L45:
            androidx.work.o$a$a r5 = new androidx.work.o$a$a
            r5.<init>()
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.H(java.lang.String, java.util.List, com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }

    private static HealthData I(jg0.a aVar, y10.a aVar2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        HealthData healthData = new HealthData();
        healthData.setSourceDevice("-Withings-");
        healthData.putLong("start_time", aVar.b());
        healthData.putLong("time_offset", TimeZone.getDefault().getOffset(aVar.b()));
        Object obj6 = null;
        if (u.e(aVar2, a.c.f108298d)) {
            Iterator<T> it = aVar.c().iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (((Number) jVar.c()).intValue() == 1) {
                    healthData.putFloat("weight", ((Number) jVar.d()).floatValue());
                    Iterator<T> it2 = aVar.c().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((Number) ((j) obj).c()).intValue() == 5) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    j jVar2 = (j) obj;
                    if (jVar2 != null) {
                        healthData.putFloat(HealthConstants.Weight.FAT_FREE_MASS, ((Number) jVar2.d()).floatValue());
                    }
                    Iterator<T> it3 = aVar.c().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((Number) ((j) obj2).c()).intValue() == 6) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    j jVar3 = (j) obj2;
                    if (jVar3 != null) {
                        healthData.putFloat("body_fat", ((Number) jVar3.d()).floatValue());
                    }
                    Iterator<T> it4 = aVar.c().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            if (((Number) ((j) obj3).c()).intValue() == 8) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    j jVar4 = (j) obj3;
                    if (jVar4 != null) {
                        healthData.putFloat(HealthConstants.Weight.BODY_FAT_MASS, ((Number) jVar4.d()).floatValue());
                    }
                    Iterator<T> it5 = aVar.c().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj4 = it5.next();
                            if (((Number) ((j) obj4).c()).intValue() == 76) {
                                break;
                            }
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    j jVar5 = (j) obj4;
                    if (jVar5 != null) {
                        healthData.putFloat(HealthConstants.Weight.MUSCLE_MASS, ((Number) jVar5.d()).floatValue());
                    }
                    Iterator<T> it6 = aVar.c().iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj5 = it6.next();
                            if (((Number) ((j) obj5).c()).intValue() == 77) {
                                break;
                            }
                        } else {
                            obj5 = null;
                            break;
                        }
                    }
                    j jVar6 = (j) obj5;
                    if (jVar6 != null) {
                        healthData.putFloat(HealthConstants.Weight.TOTAL_BODY_WATER, ((Number) jVar6.d()).floatValue());
                    }
                    Iterator<T> it7 = aVar.c().iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        Object next = it7.next();
                        if (((Number) ((j) next).c()).intValue() == 122) {
                            obj6 = next;
                            break;
                        }
                    }
                    j jVar7 = (j) obj6;
                    if (jVar7 != null) {
                        healthData.putFloat(HealthConstants.Weight.FAT_FREE, ((Number) jVar7.d()).floatValue());
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } else if (u.e(aVar2, a.b.f108296d)) {
            healthData.putLong("start_time", aVar.b());
            healthData.putLong(HealthConstants.SessionMeasurement.END_TIME, aVar.b());
            Iterator<T> it8 = aVar.c().iterator();
            while (it8.hasNext()) {
                j jVar8 = (j) it8.next();
                if (((Number) jVar8.c()).intValue() == 54) {
                    healthData.putFloat("spo2", ((Number) jVar8.d()).floatValue());
                    Iterator<T> it9 = aVar.c().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            break;
                        }
                        Object next2 = it9.next();
                        if (((Number) ((j) next2).c()).intValue() == 11) {
                            obj6 = next2;
                            break;
                        }
                    }
                    j jVar9 = (j) obj6;
                    if (jVar9 != null) {
                        healthData.putFloat("heart_rate", ((Number) jVar9.d()).floatValue());
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } else if (u.e(aVar2, a.C1908a.f108294d)) {
            Iterator<T> it10 = aVar.c().iterator();
            while (it10.hasNext()) {
                j jVar10 = (j) it10.next();
                if (((Number) jVar10.c()).intValue() == 9) {
                    float floatValue = ((Number) jVar10.d()).floatValue();
                    Iterator<T> it11 = aVar.c().iterator();
                    while (it11.hasNext()) {
                        j jVar11 = (j) it11.next();
                        if (((Number) jVar11.c()).intValue() == 10) {
                            float floatValue2 = ((Number) jVar11.d()).floatValue();
                            healthData.putFloat(HealthConstants.BloodPressure.DIASTOLIC, floatValue);
                            healthData.putFloat(HealthConstants.BloodPressure.SYSTOLIC, floatValue2);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } else {
            u.e(aVar2, a.d.f108300d);
        }
        return healthData;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:3|(15:5|6|7|(1:(2:10|11)(2:39|40))(3:41|42|(2:44|45))|12|(1:14)(1:38)|(1:37)(1:18)|19|(1:21)|22|(1:24)|25|(1:27)(2:31|(1:33)(2:34|35))|28|29))|48|6|7|(0)(0)|12|(0)(0)|(1:16)|37|19|(0)|22|(0)|25|(0)(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        r10 = nm0.l.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r7, com.samsung.android.sdk.healthdata.HealthDataResolver r8, y10.a r9, qm0.d r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof com.withings.wiscale2.healthsync.samsung.c
            if (r0 == 0) goto L16
            r0 = r10
            com.withings.wiscale2.healthsync.samsung.c r0 = (com.withings.wiscale2.healthsync.samsung.c) r0
            int r1 = r0.f56964d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56964d = r1
            goto L1b
        L16:
            com.withings.wiscale2.healthsync.samsung.c r0 = new com.withings.wiscale2.healthsync.samsung.c
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f56962b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56964d
            r3 = 0
            r4 = 0
            java.lang.String r5 = "start_time"
            r6 = 1
            if (r2 == 0) goto L3a
            if (r2 != r6) goto L32
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r7 = r0.f56961a
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            nm0.l.b(r10)
            com.samsung.android.sdk.healthdata.HealthDataResolver$ReadRequest$Builder r10 = new com.samsung.android.sdk.healthdata.HealthDataResolver$ReadRequest$Builder
            r10.<init>()
            java.lang.String r2 = "-Withings-"
            java.util.List r2 = kotlin.collections.x.V(r2)
            com.samsung.android.sdk.healthdata.HealthDataResolver$ReadRequest$Builder r10 = r10.setSourceDevices(r2)
            java.lang.String r9 = r9.a()
            com.samsung.android.sdk.healthdata.HealthDataResolver$ReadRequest$Builder r9 = r10.setDataType(r9)
            com.samsung.android.sdk.healthdata.HealthDataResolver$SortOrder r10 = com.samsung.android.sdk.healthdata.HealthDataResolver.SortOrder.DESC
            com.samsung.android.sdk.healthdata.HealthDataResolver$ReadRequest$Builder r9 = r9.setSort(r5, r10)
            com.samsung.android.sdk.healthdata.HealthDataResolver$ReadRequest$Builder r9 = r9.setResultCount(r4, r6)
            com.samsung.android.sdk.healthdata.HealthDataResolver$ReadRequest r9 = r9.build()
            kotlin.jvm.internal.u.g(r9)     // Catch: java.lang.Throwable -> L30
            r0.f56961a = r7     // Catch: java.lang.Throwable -> L30
            r0.f56964d = r6     // Catch: java.lang.Throwable -> L30
            java.lang.Object r10 = y10.d.b(r8, r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r10 != r1) goto L70
            goto Lc6
        L70:
            com.samsung.android.sdk.healthdata.HealthDataResolver$ReadResult r10 = (com.samsung.android.sdk.healthdata.HealthDataResolver.ReadResult) r10     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r8 = r10.iterator()     // Catch: java.lang.Throwable -> L30
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L7d
            goto L7e
        L7d:
            r8 = r3
        L7e:
            if (r8 == 0) goto L92
            java.lang.Object r8 = r8.next()     // Catch: java.lang.Throwable -> L30
            com.samsung.android.sdk.healthdata.HealthData r8 = (com.samsung.android.sdk.healthdata.HealthData) r8     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L92
            long r8 = r8.getLong(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r10 = new java.lang.Long     // Catch: java.lang.Throwable -> L30
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L30
            goto L98
        L92:
            r10 = r3
            goto L98
        L94:
            nm0.k$a r10 = nm0.l.a(r8)
        L98:
            java.lang.Throwable r8 = nm0.k.b(r10)
            if (r8 == 0) goto La7
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r9 = new java.lang.Object[r4]
            x70.b.d(r7, r8, r9)
        La7:
            boolean r8 = r10 instanceof nm0.k.a
            if (r8 == 0) goto Lac
            r10 = r3
        Lac:
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto Lb5
            long r7 = r10.longValue()
            goto Lc1
        Lb5:
            com.withings.user.User r7 = r7.f56925c
            if (r7 == 0) goto Lc7
            org.joda.time.DateTime r7 = r7.h()
            long r7 = r7.getMillis()
        Lc1:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r7)
        Lc6:
            return r1
        Lc7:
            java.lang.String r7 = "user"
            kotlin.jvm.internal.u.s(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.z(com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker, com.samsung.android.sdk.healthdata.HealthDataResolver, y10.a, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // com.withings.wiscale2.healthsync.samsung.SHealthWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.withings.partner.model.Partner r6, qm0.d<? super androidx.work.o.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.b
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$b r0 = (com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.b) r0
            int r1 = r0.f56902c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56902c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$b r0 = new com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f56900a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56902c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            nm0.l.b(r7)
            goto L54
        L33:
            nm0.l.b(r7)
            androidx.work.f r7 = r5.getInputData()
            java.lang.String r2 = "measureIds"
            long[] r7 = r7.f(r2)
            if (r7 == 0) goto L4b
            r0.f56902c = r4
            java.lang.Object r6 = r5.F(r7, r6, r0)
            if (r6 != r1) goto L54
            return r1
        L4b:
            r0.f56902c = r3
            java.lang.Object r6 = r5.E(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            androidx.work.o$a$c r6 = new androidx.work.o$a$c
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.v(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
