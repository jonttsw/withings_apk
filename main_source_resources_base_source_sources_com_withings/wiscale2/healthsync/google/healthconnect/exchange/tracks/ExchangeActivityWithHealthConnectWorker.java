package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import lj0.h0;
import m70.i;
import nm0.g;
import nm0.h;
import nm0.j;
import ym0.l;
/* compiled from: ExchangeActivityWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/tracks/ExchangeActivityWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/tracks/ExchangeTracksWithHealthConnectWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lhg0/a;", "workerDependency", "Lkg0/a;", "getRelevantTrackDistanceUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lhg0/a;Lkg0/a;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeActivityWithHealthConnectWorker extends ExchangeTracksWithHealthConnectWorker {

    /* renamed from: o  reason: collision with root package name */
    private final hg0.a f56639o;

    /* renamed from: p  reason: collision with root package name */
    private final kg0.a f56640p;

    /* renamed from: q  reason: collision with root package name */
    private final PartnerCapabilities f56641q;

    /* renamed from: r  reason: collision with root package name */
    private final Vasistas.Category f56642r;

    /* renamed from: s  reason: collision with root package name */
    private final l<Track, ba0.a> f56643s;

    /* renamed from: t  reason: collision with root package name */
    private final g f56644t;

    /* renamed from: u  reason: collision with root package name */
    private final g f56645u;

    /* compiled from: ExchangeActivityWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements l<Track, ba0.a> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final ba0.a invoke(Track track) {
            Track track2 = track;
            u.j(track2, "track");
            ExchangeActivityWithHealthConnectWorker exchangeActivityWithHealthConnectWorker = ExchangeActivityWithHealthConnectWorker.this;
            h0 c11 = exchangeActivityWithHealthConnectWorker.R().c();
            WorkoutCategoryManager e11 = exchangeActivityWithHealthConnectWorker.R().e();
            i d11 = exchangeActivityWithHealthConnectWorker.z().d();
            User e12 = exchangeActivityWithHealthConnectWorker.z().d().e();
            u.i(e12, "getMainUser(...)");
            return new ba0.a(c11, e11, d11, e12, track2, TrackKt.getEffectiveStartDate(track2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeActivityWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker", f = "ExchangeActivityWithHealthConnectRequest.kt", l = {70, 71, 72, 74}, m = "performRequest")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ExchangeActivityWithHealthConnectWorker f56647a;

        /* renamed from: b  reason: collision with root package name */
        int f56648b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56649c;

        /* renamed from: e  reason: collision with root package name */
        int f56651e;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56649c = obj;
            this.f56651e |= Integer.MIN_VALUE;
            return ExchangeActivityWithHealthConnectWorker.this.D(0, this);
        }
    }

    /* compiled from: ExchangeActivityWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<xf0.d> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f56653b = context;
        }

        @Override // ym0.a
        public final xf0.d invoke() {
            ExchangeActivityWithHealthConnectWorker exchangeActivityWithHealthConnectWorker = ExchangeActivityWithHealthConnectWorker.this;
            User user = exchangeActivityWithHealthConnectWorker.getUser();
            kg0.d u11 = exchangeActivityWithHealthConnectWorker.u();
            kg0.a aVar = exchangeActivityWithHealthConnectWorker.f56640p;
            String packageName = this.f56653b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new xf0.d(user, u11, aVar, packageName, exchangeActivityWithHealthConnectWorker.p(), exchangeActivityWithHealthConnectWorker.f56643s);
        }
    }

    /* compiled from: ExchangeActivityWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.a> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.a invoke() {
            return new com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.a(ExchangeActivityWithHealthConnectWorker.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeActivityWithHealthConnectWorker(Context context, WorkerParameters parameters, hg0.a workerDependency, kg0.a getRelevantTrackDistanceUseCase) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        u.j(getRelevantTrackDistanceUseCase, "getRelevantTrackDistanceUseCase");
        this.f56639o = workerDependency;
        this.f56640p = getRelevantTrackDistanceUseCase;
        this.f56641q = PartnerCapabilities.f43547d;
        this.f56642r = Vasistas.Category.MOTION;
        this.f56643s = new a();
        this.f56644t = h.b(new c(context));
        this.f56645u = h.b(new d());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[PHI: r9 
      PHI: (r9v11 java.lang.Object) = (r9v10 java.lang.Object), (r9v1 java.lang.Object) binds: [B:30:0x0081, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.withings.wiscale2.healthsync.ExchangeWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(int r8, qm0.d<? super androidx.work.o.a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker.b
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker$b r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker.b) r0
            int r1 = r0.f56651e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56651e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker$b r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f56649c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56651e
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r3) goto L30
            nm0.l.b(r9)
            goto L8e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            nm0.l.b(r9)
            goto L84
        L3c:
            int r8 = r0.f56648b
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker r2 = r0.f56647a
            nm0.l.b(r9)
            goto L78
        L44:
            int r8 = r0.f56648b
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker r2 = r0.f56647a
            nm0.l.b(r9)
            goto L65
        L4c:
            nm0.l.b(r9)
            if (r8 != r6) goto L85
            java.lang.Class<androidx.health.connect.client.records.DistanceRecord> r9 = androidx.health.connect.client.records.DistanceRecord.class
            fn0.d r9 = kotlin.jvm.internal.q0.b(r9)
            r0.f56647a = r7
            r0.f56648b = r8
            r0.f56651e = r5
            java.lang.Object r9 = r7.L(r9, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r2 = r7
        L65:
            java.lang.Class<androidx.health.connect.client.records.TotalCaloriesBurnedRecord> r9 = androidx.health.connect.client.records.TotalCaloriesBurnedRecord.class
            fn0.d r9 = kotlin.jvm.internal.q0.b(r9)
            r0.f56647a = r2
            r0.f56648b = r8
            r0.f56651e = r4
            java.lang.Object r9 = r2.L(r9, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            r9 = 0
            r0.f56647a = r9
            r0.f56651e = r6
            java.lang.Object r9 = super.D(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            return r9
        L85:
            r0.f56651e = r3
            java.lang.Object r9 = super.D(r8, r0)
            if (r9 != r1) goto L8e
            return r1
        L8e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker.D(int, qm0.d):java.lang.Object");
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final a20.b O() {
        return (xf0.d) this.f56644t.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final u10.i<List<j<Track, List<Vasistas>>>> P() {
        return (u10.i) this.f56645u.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final Vasistas.Category Q() {
        return this.f56642r;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final hg0.a R() {
        return this.f56639o;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56641q;
    }
}
