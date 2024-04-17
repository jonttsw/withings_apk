package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Session;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import ei0.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import lj0.c0;
import lj0.h0;
import nm0.y;
import org.joda.time.DateTime;
import v10.c;
import ym0.p;
/* compiled from: SyncSleepWithFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/ImportSleepFromFit;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImportSleepFromFit extends FitSyncWorker {

    /* renamed from: f  reason: collision with root package name */
    private final c.n f56247f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f56248g;

    /* renamed from: h  reason: collision with root package name */
    private final int f56249h;

    /* renamed from: i  reason: collision with root package name */
    private final Vasistas.Category f56250i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f56251j;

    /* compiled from: SyncSleepWithFit.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<dh0.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56252a = new w(0);

        @Override // ym0.a
        public final dh0.a invoke() {
            q qVar = q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    return new dh0.a(qVar);
                }
                u.s("instance");
                throw null;
            }
            u.s("instance");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncSleepWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit", f = "SyncSleepWithFit.kt", l = {ConstantsWs.WS_STATUS_WRONGUSERID}, m = "importSleepVasistas")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56253a;

        /* renamed from: c  reason: collision with root package name */
        int f56255c;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56253a = obj;
            this.f56255c |= Integer.MIN_VALUE;
            return ImportSleepFromFit.this.C(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncSleepWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit$importSleepVasistas$2", f = "SyncSleepWithFit.kt", l = {ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT, ConstantsWs.WS_STATUS_WRONGSESSIONTYPE, ConstantsWs.WS_STATUS_WRONGRELATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f56256a;

        /* renamed from: b  reason: collision with root package name */
        int f56257b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f56258c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f56260e;

        /* compiled from: Comparisons.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return pm0.a.b(Long.valueOf(((Session) t11).getEndTime(timeUnit)), Long.valueOf(((Session) t12).getEndTime(timeUnit)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(GoogleSignInAccount googleSignInAccount, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f56260e = googleSignInAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(this.f56260e, dVar);
            cVar.f56258c = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:(1:(1:(4:6|7|8|9)(2:11|12))(11:13|14|15|16|17|18|(8:20|(4:23|(3:25|26|27)(1:29)|28|21)|30|31|(2:32|(1:34)(1:35))|36|(3:38|(4:41|(3:43|44|45)(1:47)|46|39)|48)|(1:50))|51|(2:53|(1:55)(2:56|7))|8|9))(1:60))(2:80|(2:82|(1:84)(1:85))(2:86|87))|61|(2:64|62)|65|66|(2:69|67)|70|71|72|73|(1:75)(8:76|17|18|(0)|51|(0)|8|9)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
            r5 = r8;
            r8 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01ec  */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 531
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SyncSleepWithFit.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f56261a = new w(0);

        @Override // ym0.a
        public final c0 invoke() {
            h0 e11 = h0.e();
            u.i(e11, "get(...)");
            return new c0(e11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportSleepFromFit(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f56247f = c.n.f103151c;
        this.f56248g = nm0.h.b(d.f56261a);
        this.f56249h = ConstantsWs.DEVICE_MODEL_STEP_COUNTER_GOOGLE;
        this.f56250i = Vasistas.Category.MOTION;
        this.f56251j = nm0.h.b(a.f56252a);
    }

    public static final void B(ImportSleepFromFit importSleepFromFit, long j5, long j11, List list) {
        List<Vasistas> V;
        dh0.a.a((dh0.a) importSleepFromFit.f56251j.getValue(), importSleepFromFit.getUser().q(), new DateTime(j5), new DateTime(j11), 0, 1002, ConstantsWs.DEVICE_MODEL_STEP_COUNTER_GOOGLE, 8);
        DataType TYPE_SLEEP_SEGMENT = DataType.TYPE_SLEEP_SEGMENT;
        u.i(TYPE_SLEEP_SEGMENT, "TYPE_SLEEP_SEGMENT");
        List<DataPoint> a11 = com.withings.wiscale2.healthsync.google.fit.c.a(list, TYPE_SLEEP_SEGMENT);
        DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
        u.i(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
        List<DataPoint> a12 = com.withings.wiscale2.healthsync.google.fit.c.a(list, TYPE_HEART_RATE_BPM);
        if (!a11.isEmpty()) {
            V = cp0.n.A(cp0.n.t(cp0.n.h(x.t(a11), f.f56444a), new g(importSleepFromFit)));
        } else {
            V = x.V(new Vasistas(new DateTime(j5), null, Long.valueOf(importSleepFromFit.getUser().q()), (int) (j11 - j5), Vasistas.VasistasType.SLEEP, null, importSleepFromFit.f56250i, 0.0f, 0.0f, 0.0f, SleepLevel.Unspecified.getVasistasType(), 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, importSleepFromFit.f56249h, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -8389728, 2047, null));
        }
        List<Vasistas> list2 = V;
        nm0.g gVar = importSleepFromFit.f56248g;
        ((c0) gVar.getValue()).a(importSleepFromFit.getUser().q(), list2, importSleepFromFit.f56250i, null);
        if (!a12.isEmpty()) {
            List<DataPoint> list3 = a12;
            ArrayList arrayList = new ArrayList(x.y(list3, 10));
            for (DataPoint dataPoint : list3) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                arrayList.add(new Vasistas(new DateTime(dataPoint.getStartTime(timeUnit)), null, Long.valueOf(importSleepFromFit.getUser().q()), (int) (dataPoint.getEndTime(timeUnit) - dataPoint.getStartTime(timeUnit)), Vasistas.VasistasType.SLEEP, null, Vasistas.Category.BODY, 0.0f, 0.0f, 0.0f, 0, 0, 0, (int) dataPoint.getValue(Field.FIELD_BPM).asFloat(), 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, importSleepFromFit.f56249h, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 2, null, null, null, null, false, null, -8396896, 2023, null));
            }
            ((c0) gVar.getValue()).a(importSleepFromFit.getUser().q(), arrayList, Vasistas.Category.BODY, null);
        }
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
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit.b
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit$b r0 = (com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit.b) r0
            int r1 = r0.f56255c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56255c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit$b r0 = new com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56253a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56255c
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
            com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit$c r6 = new com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit$c
            r2 = 0
            r6.<init>(r5, r2)
            r0.f56255c = r3
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "coroutineScope(...)"
            kotlin.jvm.internal.u.i(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportSleepFromFit.C(com.google.android.gms.auth.api.signin.GoogleSignInAccount, qm0.d):java.lang.Object");
    }

    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    public final Object t(Partner partner, qm0.d<? super o.a> dVar) {
        c.n nVar = this.f56247f;
        boolean i11 = nVar.i(partner);
        Context applicationContext = getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        GoogleSignInAccount a11 = nVar.a(applicationContext);
        if (i11 && a11 != null) {
            return C(a11, dVar);
        }
        return new o.a.c();
    }
}
