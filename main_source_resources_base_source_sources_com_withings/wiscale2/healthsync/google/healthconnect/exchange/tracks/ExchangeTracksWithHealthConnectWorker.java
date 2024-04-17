package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcelable;
import androidx.health.connect.client.records.Record;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import com.withings.wiscale2.healthsync.ExchangeWorker;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import lj0.c0;
import nm0.j;
import org.joda.time.DateTime;
import u10.q;
import ym0.r;
/* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u0004\u0012\u00020\u00070\u00020\u00012\u00020\b2\u00020\tB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/tracks/ExchangeTracksWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/ExchangeWorker;", "Lu10/q;", "Lnm0/j;", "Lcom/withings/wiscale2/track/data/Track;", "", "Lcom/withings/vasistas/model/Vasistas;", "Landroidx/health/connect/client/records/Record;", "La20/d;", "Lvf0/a;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExchangeTracksWithHealthConnectWorker extends ExchangeWorker<q<j<? extends Track, ? extends List<? extends Vasistas>>, Record>> implements a20.d, vf0.a {

    /* renamed from: h  reason: collision with root package name */
    private final String f56663h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f56664i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f56665j;

    /* renamed from: k  reason: collision with root package name */
    private final r<User, DateTime, DateTime, PartnerCapabilities, List<Vasistas>> f56666k;

    /* renamed from: l  reason: collision with root package name */
    private final r<User, DateTime, DateTime, PartnerCapabilities, List<Track>> f56667l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f56668m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f56669n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker", f = "ExchangeTracksWithHealthConnectRequest.kt", l = {224, 227}, m = "deleteForRecordType")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        fn0.d f56670a;

        /* renamed from: b  reason: collision with root package name */
        ExchangeTracksWithHealthConnectWorker f56671b;

        /* renamed from: c  reason: collision with root package name */
        long f56672c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56673d;

        /* renamed from: f  reason: collision with root package name */
        int f56675f;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56673d = obj;
            this.f56675f |= Integer.MIN_VALUE;
            return ExchangeTracksWithHealthConnectWorker.this.L(null, this);
        }
    }

    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeTracksWithHealthConnectWorker f56676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker) {
            super(0);
            this.f56676a = exchangeTracksWithHealthConnectWorker;
            this.f56677b = context;
        }

        @Override // ym0.a
        public final com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c invoke() {
            return new com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c(this.f56677b, this.f56676a);
        }
    }

    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements r<User, DateTime, DateTime, PartnerCapabilities, List<? extends Vasistas>> {

        /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f56679a;

            static {
                int[] iArr = new int[PartnerCapabilities.values().length];
                try {
                    PartnerCapabilities partnerCapabilities = PartnerCapabilities.f43544a;
                    iArr[3] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f56679a = iArr;
            }
        }

        c() {
            super(4);
        }

        @Override // ym0.r
        public final List<? extends Vasistas> invoke(User user, DateTime dateTime, DateTime dateTime2, PartnerCapabilities partnerCapabilities) {
            User user2 = user;
            DateTime startDate = dateTime;
            DateTime endDate = dateTime2;
            PartnerCapabilities capability = partnerCapabilities;
            u.j(user2, "user");
            u.j(startDate, "startDate");
            u.j(endDate, "endDate");
            u.j(capability, "capability");
            if (a.f56679a[capability.ordinal()] == 1) {
                List<Vasistas> o11 = ExchangeTracksWithHealthConnectWorker.this.R().c().o(user2.q(), Vasistas.Category.PAUSE, startDate, endDate);
                u.i(o11, "getVasistasBetween(...)");
                return o11;
            }
            return i0.f76187a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker", f = "ExchangeTracksWithHealthConnectRequest.kt", l = {ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT}, m = "getRecords$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56680a;

        /* renamed from: c  reason: collision with root package name */
        int f56682c;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56680a = obj;
            this.f56682c |= Integer.MIN_VALUE;
            return ExchangeTracksWithHealthConnectWorker.N(ExchangeTracksWithHealthConnectWorker.this, null, null, this);
        }
    }

    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements r<User, DateTime, DateTime, PartnerCapabilities, List<? extends Track>> {
        e() {
            super(4);
        }

        @Override // ym0.r
        public final List<? extends Track> invoke(User user, DateTime dateTime, DateTime dateTime2, PartnerCapabilities partnerCapabilities) {
            User user2 = user;
            DateTime startDate = dateTime;
            DateTime endDate = dateTime2;
            PartnerCapabilities capability = partnerCapabilities;
            u.j(user2, "user");
            u.j(startDate, "startDate");
            u.j(endDate, "endDate");
            u.j(capability, "capability");
            int ordinal = capability.ordinal();
            ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker = ExchangeTracksWithHealthConnectWorker.this;
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return i0.f76187a;
                }
                return exchangeTracksWithHealthConnectWorker.R().b().i(user2.q(), startDate, endDate);
            }
            return exchangeTracksWithHealthConnectWorker.R().f().getWorkoutsForUserContainedBetween(user2.q(), startDate, endDate);
        }
    }

    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<kg0.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56684a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExchangeTracksWithHealthConnectWorker f56685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker) {
            super(0);
            this.f56684a = context;
            this.f56685b = exchangeTracksWithHealthConnectWorker;
        }

        @Override // ym0.a
        public final kg0.d invoke() {
            PackageManager packageManager = this.f56684a.getPackageManager();
            u.i(packageManager, "getPackageManager(...)");
            this.f56685b.getClass();
            return new kg0.d(packageManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker", f = "ExchangeTracksWithHealthConnectRequest.kt", l = {ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE, ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING, ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT, ConstantsWs.MEASURE_TYPE_IGLUCOSE_BLOOD_GLUCOSE}, m = "read")
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56686a;

        /* renamed from: b  reason: collision with root package name */
        fn0.d f56687b;

        /* renamed from: c  reason: collision with root package name */
        DateTime f56688c;

        /* renamed from: d  reason: collision with root package name */
        DateTime f56689d;

        /* renamed from: e  reason: collision with root package name */
        String f56690e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f56691f;

        /* renamed from: h  reason: collision with root package name */
        int f56693h;

        g(qm0.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56691f = obj;
            this.f56693h |= Integer.MIN_VALUE;
            return ExchangeTracksWithHealthConnectWorker.this.S(null, null, null, this);
        }
    }

    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.a<fn0.d<? extends Record>> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final fn0.d<? extends Record> invoke() {
            ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker = ExchangeTracksWithHealthConnectWorker.this;
            Object obj = exchangeTracksWithHealthConnectWorker.h().getSerializer().c().get(exchangeTracksWithHealthConnectWorker.m());
            u.h(obj, "null cannot be cast to non-null type kotlin.reflect.KClass<out androidx.health.connect.client.records.Record>");
            return (fn0.d) obj;
        }
    }

    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class i extends w implements ym0.a<c0> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final c0 invoke() {
            return new c0(ExchangeTracksWithHealthConnectWorker.this.R().c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeTracksWithHealthConnectWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        this.f56663h = context.getPackageName();
        this.f56664i = nm0.h.b(new i());
        this.f56665j = nm0.h.b(new f(context, this));
        this.f56666k = new c();
        this.f56667l = new e();
        this.f56668m = nm0.h.b(new h());
        this.f56669n = nm0.h.b(new b(context, this));
    }

    public static final fn0.d J(ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker) {
        return (fn0.d) exchangeTracksWithHealthConnectWorker.f56668m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object N(com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker r4, org.joda.time.DateTime r5, org.joda.time.DateTime r6, qm0.d<? super java.util.List<? extends androidx.health.connect.client.records.Record>> r7) {
        /*
            boolean r0 = r7 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker.d
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker$d r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker.d) r0
            int r1 = r0.f56682c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56682c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker$d r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f56680a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56682c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            nm0.l.b(r7)
            nm0.g r7 = r4.f56668m
            java.lang.Object r7 = r7.getValue()
            fn0.d r7 = (fn0.d) r7
            r0.f56682c = r3
            java.lang.Object r7 = r4.S(r7, r5, r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L49
            kotlin.collections.i0 r7 = kotlin.collections.i0.f76187a
        L49:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker.N(com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker, org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|8|(1:(1:(2:12|13)(2:15|16))(3:17|18|19))(6:37|38|39|40|(1:42)(1:46)|(1:44)(1:45))|20|21|22|(2:24|(1:26)(1:13))(3:27|28|(2:30|31)(2:32|33))))|52|6|7|8|(0)(0)|20|21|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
        r10 = nm0.l.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:13:0x0028, B:39:0x0087, B:41:0x008d, B:45:0x00ac, B:38:0x0082, B:25:0x0047), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {all -> 0x002d, blocks: (B:13:0x0028, B:39:0x0087, B:41:0x008d, B:45:0x00ac, B:38:0x0082, B:25:0x0047), top: B:58:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(fn0.d<? extends androidx.health.connect.client.records.Record> r10, qm0.d<? super androidx.work.o.a> r11) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker.L(fn0.d, qm0.d):java.lang.Object");
    }

    @Override // u10.n0
    /* renamed from: M */
    public final q<j<Track, List<Vasistas>>, Record> h() {
        return (q) this.f56669n.getValue();
    }

    public abstract a20.b<Record, fn0.d<? extends Record>, j<Track, List<Vasistas>>> O();

    public abstract u10.i<List<j<Track, List<Vasistas>>>> P();

    public abstract Vasistas.Category Q();

    public abstract hg0.a R();

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
        if (r13.isEmpty() != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object S(fn0.d<? extends androidx.health.connect.client.records.Record> r12, org.joda.time.DateTime r13, org.joda.time.DateTime r14, qm0.d<? super java.util.List<? extends androidx.health.connect.client.records.Record>> r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker.S(fn0.d, org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    public final void T(List<Track> list) {
        for (Track track : list) {
            Parcelable data = track.getData();
            if (data instanceof SleepTrackData) {
                R().b().H(track, null);
            } else if (data instanceof WorkoutData) {
                WorkoutSaver.save(track);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r5 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(java.util.List<? extends nm0.j<com.withings.wiscale2.track.data.Track, ? extends java.util.List<com.withings.vasistas.model.Vasistas>>> r22) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker.U(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kg0.d u() {
        return (kg0.d) this.f56665j.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.ExchangeWorker
    public final fg0.a z() {
        return R().a();
    }
}
