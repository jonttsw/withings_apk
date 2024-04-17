package com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas;

import android.content.Context;
import androidx.health.connect.client.records.Record;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.h;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import u10.q;
import ym0.p;
/* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
/* loaded from: classes5.dex */
public final class a implements q<Vasistas, Record> {

    /* renamed from: a  reason: collision with root package name */
    private final a20.b<Record, fn0.d<? extends Record>, Vasistas> f56758a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f56759b;

    /* renamed from: c  reason: collision with root package name */
    private final ExchangeVasistasWithHealthConnectWorker<Record>.a f56760c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<Record> f56761d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeVasistasWithHealthConnectRequest.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_FEET}, m = "delete")
    /* renamed from: com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0741a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56762a;

        /* renamed from: c  reason: collision with root package name */
        int f56764c;

        C0741a(qm0.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56762a = obj;
            this.f56764c |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker$exchangeRequest$2$1$delete$2$1", f = "ExchangeVasistasWithHealthConnectRequest.kt", l = {168}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends i implements ym0.q<Long, fn0.d<? extends Record>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56765a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ long f56766b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ fn0.d f56767c;

        /* JADX WARN: Type inference failed for: r4v2, types: [com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$b, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(Long l5, fn0.d<? extends Record> dVar, qm0.d<? super y> dVar2) {
            long longValue = l5.longValue();
            ?? iVar = new i(3, dVar2);
            iVar.f56766b = longValue;
            iVar.f56767c = dVar;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56765a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                long j5 = this.f56766b;
                fn0.d<? extends Record> dVar = this.f56767c;
                HealthConnect healthConnect = HealthConnect.f43375a;
                List<String> V = x.V(String.valueOf(j5));
                i0 i0Var = i0.f76187a;
                this.f56765a = 1;
                if (healthConnect.d(dVar, V, i0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeVasistasWithHealthConnectRequest.kt", l = {140, ConstantsWs.MEASURE_TYPE_HR_LEVEL, ConstantsWs.MEASURE_TYPE_LEUKOCYTES, ConstantsWs.MEASURE_TYPE_LEUKOCYTES}, m = "getSerializedVasistasToExport")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56768a;

        /* renamed from: b  reason: collision with root package name */
        Object f56769b;

        /* renamed from: c  reason: collision with root package name */
        List f56770c;

        /* renamed from: d  reason: collision with root package name */
        DateTime f56771d;

        /* renamed from: e  reason: collision with root package name */
        int f56772e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f56773f;

        /* renamed from: h  reason: collision with root package name */
        int f56775h;

        c(qm0.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56773f = obj;
            this.f56775h |= Integer.MIN_VALUE;
            return a.this.l(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements p<DateTime, List<? extends Integer>, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<Record> f56776a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ExchangeVasistasWithHealthConnectWorker<Record> exchangeVasistasWithHealthConnectWorker) {
            super(2);
            this.f56776a = exchangeVasistasWithHealthConnectWorker;
        }

        @Override // ym0.p
        public final y invoke(DateTime dateTime, List<? extends Integer> list) {
            DateTime lastUpdate = dateTime;
            List<? extends Integer> measureTypes = list;
            u.j(lastUpdate, "lastUpdate");
            u.j(measureTypes, "measureTypes");
            for (Number number : measureTypes) {
                this.f56776a.F(number.intValue(), 2, new DateTime(lastUpdate));
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeVasistasWithHealthConnectRequest.kt", l = {ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY, ConstantsWs.MEASURE_TYPE_R6_25KHZ_SEGMENT, 195, 201}, m = "read")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56777a;

        /* renamed from: b  reason: collision with root package name */
        fn0.d f56778b;

        /* renamed from: c  reason: collision with root package name */
        DateTime f56779c;

        /* renamed from: d  reason: collision with root package name */
        DateTime f56780d;

        /* renamed from: e  reason: collision with root package name */
        String f56781e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f56782f;

        /* renamed from: h  reason: collision with root package name */
        int f56784h;

        e(qm0.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56782f = obj;
            this.f56784h |= Integer.MIN_VALUE;
            return a.this.n(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeVasistasWithHealthConnectRequest.kt", l = {208, 209}, m = "read")
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        a f56785a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f56786b;

        /* renamed from: d  reason: collision with root package name */
        int f56788d;

        f(qm0.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56786b = obj;
            this.f56788d |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker$exchangeRequest$2$1$read$4", f = "ExchangeVasistasWithHealthConnectRequest.kt", l = {211, 213}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class g extends i implements ym0.q<DateTime, DateTime, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56789a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f56790b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ DateTime f56791c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<Record> f56793e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ExchangeVasistasWithHealthConnectWorker exchangeVasistasWithHealthConnectWorker, qm0.d dVar) {
            super(3, dVar);
            this.f56793e = exchangeVasistasWithHealthConnectWorker;
        }

        @Override // ym0.q
        public final Object invoke(DateTime dateTime, DateTime dateTime2, qm0.d<? super o.a> dVar) {
            g gVar = new g(this.f56793e, dVar);
            gVar.f56790b = dateTime;
            gVar.f56791c = dateTime2;
            return gVar.invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f56789a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L21
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                nm0.l.b(r9)
                goto L60
            L11:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L19:
                java.lang.Object r1 = r8.f56790b
                com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a r1 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a) r1
                nm0.l.b(r9)
                goto L4e
            L21:
                nm0.l.b(r9)
                java.lang.Object r9 = r8.f56790b
                org.joda.time.DateTime r9 = (org.joda.time.DateTime) r9
                org.joda.time.DateTime r1 = r8.f56791c
                com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a r5 = com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.this
                a20.b r6 = r5.getSerializer()
                java.util.Map r6 = r6.c()
                com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker<androidx.health.connect.client.records.Record> r7 = r8.f56793e
                com.withings.partner.model.capabilities.PartnerCapabilities r7 = r7.m()
                java.lang.Object r6 = r6.get(r7)
                fn0.d r6 = (fn0.d) r6
                if (r6 == 0) goto Lb5
                r8.f56790b = r5
                r8.f56789a = r3
                java.lang.Object r9 = com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.k(r5, r6, r9, r1, r8)
                if (r9 != r0) goto L4d
                return r0
            L4d:
                r1 = r5
            L4e:
                java.util.List r9 = (java.util.List) r9
                if (r9 == 0) goto L85
                r8.f56790b = r4
                r8.f56789a = r2
                r1.getClass()
                java.lang.Object r9 = u10.g.h(r1, r9, r8)
                if (r9 != r0) goto L60
                return r0
            L60:
                java.util.List r9 = (java.util.List) r9
                if (r9 == 0) goto L85
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r9 = r9.iterator()
            L6f:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L86
                java.lang.Object r1 = r9.next()
                com.withings.vasistas.model.Vasistas r1 = (com.withings.vasistas.model.Vasistas) r1
                java.lang.Long r1 = r1.getId()
                if (r1 == 0) goto L6f
                r0.add(r1)
                goto L6f
            L85:
                r0 = r4
            L86:
                nm0.j[] r9 = new nm0.j[r3]
                if (r0 == 0) goto L8e
                long[] r4 = kotlin.collections.x.R0(r0)
            L8e:
                nm0.j r0 = new nm0.j
                java.lang.String r1 = "result"
                r0.<init>(r1, r4)
                r1 = 0
                r9[r1] = r0
                androidx.work.f$a r0 = new androidx.work.f$a
                r0.<init>()
                r9 = r9[r1]
                java.lang.Object r1 = r9.c()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r9 = r9.d()
                r0.b(r9, r1)
                androidx.work.f r9 = r0.a()
                androidx.work.o$a$c r4 = new androidx.work.o$a$c
                r4.<init>(r9)
            Lb5:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, ExchangeVasistasWithHealthConnectWorker exchangeVasistasWithHealthConnectWorker) {
        this.f56761d = exchangeVasistasWithHealthConnectWorker;
        this.f56758a = exchangeVasistasWithHealthConnectWorker.L();
        this.f56759b = h.b(new com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.c(context, exchangeVasistasWithHealthConnectWorker));
        this.f56760c = new ExchangeVasistasWithHealthConnectWorker.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #2 {all -> 0x0072, blocks: (B:24:0x006e, B:33:0x0090, B:37:0x009b, B:39:0x009f), top: B:86:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:19:0x005d, B:43:0x00bc, B:45:0x00c0, B:54:0x00f5, B:48:0x00d3, B:49:0x00dd, B:51:0x00e3, B:56:0x00fc), top: B:83:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARN: Type inference failed for: r13v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r12, qm0.d<? super androidx.work.o.a> r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.l(int, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m(int r8, com.withings.partner.model.capabilities.PartnerCapabilities r9, qm0.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.b
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.b r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.b) r0
            int r1 = r0.f56798e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56798e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.b r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.b
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f56796c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56798e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.withings.partner.model.capabilities.PartnerCapabilities r9 = r0.f56795b
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a r8 = r0.f56794a
            nm0.l.b(r10)
            goto L46
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            nm0.l.b(r10)
            r0.f56794a = r7
            r0.f56795b = r9
            r0.f56798e = r3
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker<androidx.health.connect.client.records.Record> r10 = r7.f56761d
            java.io.Serializable r10 = r10.y(r8, r9, r0)
            if (r10 != r1) goto L45
            return r1
        L45:
            r8 = r7
        L46:
            nm0.j r10 = (nm0.j) r10
            java.lang.Object r0 = r10.a()
            r5 = r0
            org.joda.time.DateTime r5 = (org.joda.time.DateTime) r5
            java.lang.Object r10 = r10.b()
            r6 = r10
            org.joda.time.DateTime r6 = (org.joda.time.DateTime) r6
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker<androidx.health.connect.client.records.Record> r10 = r8.f56761d
            ig0.a r10 = r10.O()
            lj0.h0 r1 = r10.b()
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker<androidx.health.connect.client.records.Record> r8 = r8.f56761d
            com.withings.user.User r10 = r8.getUser()
            long r2 = r10.q()
            com.withings.vasistas.model.Vasistas$Category r4 = r8.N()
            java.util.List r10 = r1.o(r2, r4, r5, r6)
            java.lang.String r0 = "getVasistasBetween(...)"
            kotlin.jvm.internal.u.i(r10, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L82:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r10.next()
            r2 = r1
            com.withings.vasistas.model.Vasistas r2 = (com.withings.vasistas.model.Vasistas) r2
            org.joda.time.DateTime r2 = r2.getEnd()
            org.joda.time.DateTime r3 = r8.x()
            boolean r2 = r2.isAfter(r3)
            if (r2 == 0) goto L82
            r0.add(r1)
            goto L82
        La1:
            java.util.ArrayList r8 = ig0.b.a(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.m(int, com.withings.partner.model.capabilities.PartnerCapabilities, qm0.d):java.io.Serializable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
        if (r13.isEmpty() != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(fn0.d<? extends androidx.health.connect.client.records.Record> r12, org.joda.time.DateTime r13, org.joda.time.DateTime r14, qm0.d<? super java.util.List<androidx.health.connect.client.records.Record>> r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.n(fn0.d, org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    @Override // u10.g
    public final Object b(qm0.d<? super o.a> dVar) {
        return l(2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        r9 = nm0.l.a(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Type inference failed for: r9v10, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Override // u10.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(qm0.d<? super androidx.work.o.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.C0741a
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$a r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.C0741a) r0
            int r1 = r0.f56764c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56764c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$a r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f56762a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56764c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nm0.l.b(r9)     // Catch: java.lang.Throwable -> L27
            goto L66
        L27:
            r9 = move-exception
            goto L69
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            nm0.l.b(r9)
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker<androidx.health.connect.client.records.Record> r9 = r8.f56761d
            nm0.j r2 = new nm0.j     // Catch: java.lang.Throwable -> L27
            androidx.work.f r4 = r9.getInputData()     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "id"
            r6 = -1
            long r4 = r4.e(r5, r6)     // Catch: java.lang.Throwable -> L27
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Throwable -> L27
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L27
            a20.b<androidx.health.connect.client.records.Record, fn0.d<? extends androidx.health.connect.client.records.Record>, com.withings.vasistas.model.Vasistas> r4 = r8.f56758a     // Catch: java.lang.Throwable -> L27
            com.withings.partner.model.capabilities.PartnerCapabilities r9 = r9.m()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r4.t(r9)     // Catch: java.lang.Throwable -> L27
            r2.<init>(r6, r9)     // Catch: java.lang.Throwable -> L27
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$b r9 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$b     // Catch: java.lang.Throwable -> L27
            r4 = 3
            r5 = 0
            r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> L27
            r0.f56764c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = cr.a.b(r2, r9, r0)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L66
            return r1
        L66:
            nm0.y r9 = (nm0.y) r9     // Catch: java.lang.Throwable -> L27
            goto L6d
        L69:
            nm0.k$a r9 = nm0.l.a(r9)
        L6d:
            java.lang.Throwable r9 = nm0.k.b(r9)
            if (r9 == 0) goto L7c
            androidx.work.o$a$a r0 = new androidx.work.o$a$a
            r0.<init>()
            r9.printStackTrace()
            return r0
        L7c:
            androidx.work.o$a$c r9 = new androidx.work.o$a$c
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.c(qm0.d):java.lang.Object");
    }

    @Override // u10.g
    public final Object d(qm0.d<? super o.a> dVar) {
        return l(1, dVar);
    }

    @Override // u10.g
    public final u10.i e() {
        return this.f56760c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // u10.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(qm0.d<? super androidx.work.o.a> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.f
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$f r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.f) r0
            int r1 = r0.f56788d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56788d = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$f r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f56786b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56788d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a r2 = r0.f56785a
            nm0.l.b(r8)
            goto L4d
        L38:
            nm0.l.b(r8)
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker<androidx.health.connect.client.records.Record> r8 = r7.f56761d
            com.withings.partner.model.capabilities.PartnerCapabilities r2 = r8.m()
            r0.f56785a = r7
            r0.f56788d = r4
            java.io.Serializable r8 = r8.y(r4, r2, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r2 = r7
        L4d:
            nm0.j r8 = (nm0.j) r8
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$g r4 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a$g
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker<androidx.health.connect.client.records.Record> r5 = r2.f56761d
            r6 = 0
            r4.<init>(r5, r6)
            r0.f56785a = r6
            r0.f56788d = r3
            java.lang.Object r8 = cr.a.b(r8, r4, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            androidx.work.o$a r8 = (androidx.work.o.a) r8
            if (r8 != 0) goto L6b
            androidx.work.o$a$a r8 = new androidx.work.o$a$a
            r8.<init>()
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a.f(qm0.d):java.lang.Object");
    }

    @Override // u10.g
    public final u10.h g() {
        return (bg0.a) this.f56759b.getValue();
    }

    @Override // u10.g
    public final a20.b<Record, fn0.d<? extends Record>, Vasistas> getSerializer() {
        return this.f56758a;
    }
}
