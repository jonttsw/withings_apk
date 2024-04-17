package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.health.connect.client.records.Record;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.h;
import nm0.j;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00040\u00032\u00020\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeMeasuresGroupWithHealthConnectWorker;", "Landroidx/health/connect/client/records/Record;", "PartnerType", "Lcom/withings/wiscale2/healthsync/model/measuresgroup/ExchangeMeasuresGroupWorker;", "Lfn0/d;", "Lvf0/a;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType extends Record> extends ExchangeMeasuresGroupWorker<PartnerType, fn0.d<? extends Record>> implements vf0.a {

    /* renamed from: m  reason: collision with root package name */
    private static final List<PartnerCapabilities> f56532m = x.V(PartnerCapabilities.f43558o);

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f56533j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f56534k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f56535l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker", f = "ExchangeMeasureGroupsWithHealthConnectRequest.kt", l = {88, 92}, m = "delete$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class a<PartnerType extends Record> extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ExchangeMeasuresGroupWithHealthConnectWorker f56536a;

        /* renamed from: b  reason: collision with root package name */
        fn0.d f56537b;

        /* renamed from: c  reason: collision with root package name */
        long f56538c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56539d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> f56540e;

        /* renamed from: f  reason: collision with root package name */
        int f56541f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker, qm0.d<? super a> dVar) {
            super(dVar);
            this.f56540e = exchangeMeasuresGroupWithHealthConnectWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56539d = obj;
            this.f56541f |= Integer.MIN_VALUE;
            return ExchangeMeasuresGroupWithHealthConnectWorker.Y(this.f56540e, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker", f = "ExchangeMeasureGroupsWithHealthConnectRequest.kt", l = {97}, m = "isUpToDate")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ExchangeMeasuresGroupWithHealthConnectWorker f56542a;

        /* renamed from: b  reason: collision with root package name */
        ky.d f56543b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56544c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> f56545d;

        /* renamed from: e  reason: collision with root package name */
        int f56546e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker, qm0.d<? super b> dVar) {
            super(dVar);
            this.f56545d = exchangeMeasuresGroupWithHealthConnectWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56544c = obj;
            this.f56546e |= Integer.MIN_VALUE;
            return this.f56545d.b0(null, this);
        }
    }

    /* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<zf0.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> f56547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ExchangeMeasuresGroupWithHealthConnectWorker exchangeMeasuresGroupWithHealthConnectWorker) {
            super(0);
            this.f56547a = exchangeMeasuresGroupWithHealthConnectWorker;
            this.f56548b = context;
        }

        @Override // ym0.a
        public final zf0.a invoke() {
            ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker = this.f56547a;
            User user = exchangeMeasuresGroupWithHealthConnectWorker.getUser();
            String packageName = this.f56548b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new zf0.a(user, packageName, exchangeMeasuresGroupWithHealthConnectWorker.x(), x.V(exchangeMeasuresGroupWithHealthConnectWorker.m()), exchangeMeasuresGroupWithHealthConnectWorker.U().d());
        }
    }

    /* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<kg0.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56549a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> f56550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker) {
            super(0);
            this.f56549a = context;
            this.f56550b = exchangeMeasuresGroupWithHealthConnectWorker;
        }

        @Override // ym0.a
        public final kg0.d invoke() {
            PackageManager packageManager = this.f56549a.getPackageManager();
            u.i(packageManager, "getPackageManager(...)");
            this.f56550b.getClass();
            return new kg0.d(packageManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker", f = "ExchangeMeasureGroupsWithHealthConnectRequest.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX, ConstantsWs.MEASURE_TYPE_HR_LEVEL, ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY, ConstantsWs.MEASURE_TYPE_HR_RMS_SD}, m = "read$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class e<PartnerType extends Record> extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56551a;

        /* renamed from: b  reason: collision with root package name */
        fn0.d f56552b;

        /* renamed from: c  reason: collision with root package name */
        DateTime f56553c;

        /* renamed from: d  reason: collision with root package name */
        DateTime f56554d;

        /* renamed from: e  reason: collision with root package name */
        String f56555e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f56556f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> f56557g;

        /* renamed from: h  reason: collision with root package name */
        int f56558h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker, qm0.d<? super e> dVar) {
            super(dVar);
            this.f56557g = exchangeMeasuresGroupWithHealthConnectWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56556f = obj;
            this.f56558h |= Integer.MIN_VALUE;
            return ExchangeMeasuresGroupWithHealthConnectWorker.c0(this.f56557g, null, null, null, this);
        }
    }

    /* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<fn0.d<? extends Record>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> f56559a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker) {
            super(0);
            this.f56559a = exchangeMeasuresGroupWithHealthConnectWorker;
        }

        @Override // ym0.a
        public final fn0.d<? extends Record> invoke() {
            ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker = this.f56559a;
            Object obj = exchangeMeasuresGroupWithHealthConnectWorker.R().c().get(exchangeMeasuresGroupWithHealthConnectWorker.m());
            u.h(obj, "null cannot be cast to non-null type kotlin.reflect.KClass<out androidx.health.connect.client.records.Record>");
            return (fn0.d) obj;
        }
    }

    /* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> f56560a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeMeasuresGroupWithHealthConnectWorker) {
            super(0);
            this.f56560a = exchangeMeasuresGroupWithHealthConnectWorker;
        }

        @Override // ym0.a
        public final String invoke() {
            String lowerCase = this.f56560a.m().name().toLowerCase(Locale.ROOT);
            u.i(lowerCase, "toLowerCase(...)");
            return "add_" + lowerCase + "_from_health_connect";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeMeasuresGroupWithHealthConnectWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        this.f56533j = h.b(new g(this));
        this.f56534k = h.b(new d(context, this));
        h.b(new f(this));
        this.f56535l = h.b(new c(context, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|8|(1:(1:(2:12|13)(2:15|16))(2:17|18))(4:32|33|(1:35)(1:38)|(1:37))|19|20|21|(2:23|(1:25)(1:13))(2:26|(2:28|29)(1:30))))|41|6|7|8|(0)(0)|19|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        r12 = nm0.l.a(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <PartnerType extends androidx.health.connect.client.records.Record> java.lang.Object Y(com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> r8, long r9, fn0.d<? extends androidx.health.connect.client.records.Record> r11, qm0.d<? super androidx.work.o.a> r12) {
        /*
            boolean r0 = r12 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.a
            if (r0 == 0) goto L14
            r0 = r12
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker$a r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.a) r0
            int r1 = r0.f56541f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f56541f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker$a r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker$a
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f56539d
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f56541f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            nm0.l.b(r12)
            goto L98
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            long r9 = r7.f56538c
            fn0.d r11 = r7.f56537b
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker r8 = r7.f56536a
            nm0.l.b(r12)     // Catch: java.lang.Throwable -> L3f
            goto L67
        L3f:
            r12 = move-exception
            goto L6f
        L41:
            nm0.l.b(r12)
            r7.f56536a = r8     // Catch: java.lang.Throwable -> L3f
            r7.f56537b = r11     // Catch: java.lang.Throwable -> L3f
            r7.f56538c = r9     // Catch: java.lang.Throwable -> L3f
            r7.f56541f = r3     // Catch: java.lang.Throwable -> L3f
            r8.getClass()     // Catch: java.lang.Throwable -> L3f
            com.withings.partner.exchanges.google.healthconnect.HealthConnect r12 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L3f
            java.util.List r1 = kotlin.collections.x.V(r1)     // Catch: java.lang.Throwable -> L3f
            kotlin.collections.i0 r3 = kotlin.collections.i0.f76187a     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r12 = r12.d(r11, r3, r1, r7)     // Catch: java.lang.Throwable -> L3f
            if (r12 != r0) goto L62
            goto L64
        L62:
            nm0.y r12 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L3f
        L64:
            if (r12 != r0) goto L67
            return r0
        L67:
            androidx.work.o$a$c r12 = new androidx.work.o$a$c     // Catch: java.lang.Throwable -> L3f
            r12.<init>()     // Catch: java.lang.Throwable -> L3f
        L6c:
            r1 = r8
            r4 = r11
            goto L74
        L6f:
            nm0.k$a r12 = nm0.l.a(r12)
            goto L6c
        L74:
            java.lang.Throwable r8 = nm0.k.b(r12)
            if (r8 == 0) goto L99
            x70.b.n(r8)
            org.joda.time.DateTime r5 = r1.x()
            zf0.b r8 = r1.M()
            java.lang.String r6 = r8.getPackageName()
            r8 = 0
            r7.f56536a = r8
            r7.f56537b = r8
            r7.f56541f = r2
            r2 = r9
            java.lang.Object r12 = vf0.a.i(r1, r2, r4, r5, r6, r7)
            if (r12 != r0) goto L98
            return r0
        L98:
            return r12
        L99:
            androidx.work.o$a$a r8 = new androidx.work.o$a$a
            r8.<init>()
            boolean r9 = r12 instanceof nm0.k.a
            if (r9 == 0) goto La3
            r12 = r8
        La3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.Y(com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker, long, fn0.d, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(ky.d r9, qm0.d<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.b
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker$b r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.b) r0
            int r1 = r0.f56546e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56546e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker$b r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker$b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f56544c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56546e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ky.d r9 = r0.f56543b
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker r0 = r0.f56542a
            nm0.l.b(r10)
            goto L66
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            nm0.l.b(r10)
            zf0.b r10 = r8.M()
            org.joda.time.DateTime r2 = r9.c()
            org.joda.time.DateTime r2 = r2.minusMinutes(r3)
            java.lang.String r4 = "minusMinutes(...)"
            kotlin.jvm.internal.u.i(r2, r4)
            org.joda.time.DateTime r4 = r9.c()
            org.joda.time.DateTime r4 = r4.plusMinutes(r3)
            java.lang.String r5 = "plusMinutes(...)"
            kotlin.jvm.internal.u.i(r4, r5)
            com.withings.partner.model.capabilities.PartnerCapabilities r5 = r8.m()
            r0.f56542a = r8
            r0.f56543b = r9
            r0.f56546e = r3
            java.lang.Object r10 = r10.c(r2, r4, r5, r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r0 = r8
        L66:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r1 = r10 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L7a
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7a
        L78:
            r3 = r2
            goto Lcf
        L7a:
            java.util.Iterator r10 = r10.iterator()
        L7e:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r10.next()
            androidx.health.connect.client.records.Record r1 = (androidx.health.connect.client.records.Record) r1
            r0.getClass()
            java.util.Map r4 = a20.a.a()
            com.withings.partner.model.capabilities.PartnerCapabilities r5 = r0.m()
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Laa
            java.lang.Object r4 = kotlin.collections.x.K(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto Laa
        La5:
            int r4 = r4.intValue()
            goto Lb7
        Laa:
            java.util.ArrayList r4 = ly.a.a(r9)
            java.lang.Object r4 = kotlin.collections.x.K(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L7e
            goto La5
        Lb7:
            com.withings.partner.exchanges.google.healthconnect.HealthConnect r5 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
            double r6 = ly.a.f(r4, r9)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            org.joda.time.DateTime r7 = r9.c()
            r5.getClass()
            r5 = 0
            boolean r1 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.i(r1, r4, r6, r7, r5)
            if (r1 == 0) goto L7e
        Lcf:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.b0(ky.d, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <PartnerType extends androidx.health.connect.client.records.Record> java.lang.Object c0(com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> r11, fn0.d<? extends androidx.health.connect.client.records.Record> r12, org.joda.time.DateTime r13, org.joda.time.DateTime r14, qm0.d<? super java.util.List<? extends PartnerType>> r15) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.c0(com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker, fn0.d, org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final Object J(long j5, fn0.d<? extends Record> dVar, qm0.d dVar2) {
        return Y(this, j5, dVar, dVar2);
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final Object Q(qm0.d<? super j<? extends List<? extends PartnerType>, DateTime>> dVar) {
        if (!f56532m.contains(m())) {
            return new j(i0.f76187a, null);
        }
        return Z(getInputData().e("id", -1L), dVar);
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public boolean S() {
        return false;
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public String T() {
        return (String) this.f56533j.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final Object V(int i11, List<? extends PartnerType> list, qm0.d<? super y> dVar) {
        HealthConnect healthConnect = HealthConnect.f43375a;
        if (i11 == 1) {
            Object h11 = healthConnect.h(list, dVar);
            if (h11 == CoroutineSingletons.f76214a) {
                return h11;
            }
        } else {
            Object n11 = healthConnect.n(list, dVar);
            if (n11 != CoroutineSingletons.f76214a) {
                y yVar = y.f85009a;
            } else {
                return n11;
            }
        }
        return y.f85009a;
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final Object W(fn0.d<? extends Record> dVar, DateTime dateTime, DateTime dateTime2, qm0.d dVar2) {
        return c0(this, dVar, dateTime, dateTime2, dVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Z(long r11, qm0.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.a
            if (r0 == 0) goto L13
            r0 = r13
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.a r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.a) r0
            int r1 = r0.f56615e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56615e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.a r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.a
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f56613c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56615e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L52
            if (r2 == r6) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r11 = r0.f56612b
            java.lang.Object r12 = r0.f56611a
            ky.d r12 = (ky.d) r12
            nm0.l.b(r13)
            goto La2
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            java.lang.Object r11 = r0.f56612b
            ky.d r11 = (ky.d) r11
            java.lang.Object r12 = r0.f56611a
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker r12 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker) r12
            nm0.l.b(r13)
            goto L88
        L49:
            java.lang.Object r11 = r0.f56611a
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker r11 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker) r11
            nm0.l.b(r13)
            r12 = r11
            goto L70
        L52:
            nm0.l.b(r13)
            r7 = -1
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L5c
            return r5
        L5c:
            gg0.c r13 = r10.U()
            fy.j r13 = r13.c()
            r0.f56611a = r10
            r0.f56615e = r6
            java.lang.Object r13 = r13.b(r11, r0)
            if (r13 != r1) goto L6f
            return r1
        L6f:
            r12 = r10
        L70:
            ky.d r13 = (ky.d) r13
            if (r13 == 0) goto Lbb
            java.util.List r11 = kotlin.collections.x.V(r13)
            r0.f56611a = r12
            r0.f56612b = r13
            r0.f56615e = r4
            java.io.Serializable r11 = r12.O(r11, r0)
            if (r11 != r1) goto L85
            return r1
        L85:
            r9 = r13
            r13 = r11
            r11 = r9
        L88:
            nm0.j r13 = (nm0.j) r13
            java.lang.Object r13 = r13.c()
            r2 = r13
            java.util.List r2 = (java.util.List) r2
            r0.f56611a = r11
            r0.f56612b = r13
            r0.f56615e = r3
            java.lang.Object r12 = r12.b0(r11, r0)
            if (r12 != r1) goto L9e
            return r1
        L9e:
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r9
        La2:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto Lab
            r5 = r11
        Lab:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto Lb1
            kotlin.collections.i0 r5 = kotlin.collections.i0.f76187a
        Lb1:
            nm0.j r11 = new nm0.j
            org.joda.time.DateTime r12 = r12.g()
            r11.<init>(r5, r12)
            r5 = r11
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker.Z(long, qm0.d):java.io.Serializable");
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    /* renamed from: a0 */
    public zf0.b M() {
        return (zf0.b) this.f56535l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kg0.d u() {
        return (kg0.d) this.f56534k.getValue();
    }
}
