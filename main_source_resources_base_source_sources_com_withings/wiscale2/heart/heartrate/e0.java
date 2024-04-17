package com.withings.wiscale2.heart.heartrate;

import androidx.lifecycle.LiveData;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.vasistas.body.HRZonesAggregate;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayFragment.kt */
/* loaded from: classes5.dex */
public final class e0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f57584a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f57585b;

    /* renamed from: c  reason: collision with root package name */
    private final lj0.h0 f57586c;

    /* renamed from: d  reason: collision with root package name */
    private final ei0.q f57587d;

    /* renamed from: e  reason: collision with root package name */
    private final ActivityAggregateManager f57588e;

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f57589f;

    /* renamed from: g  reason: collision with root package name */
    private final fl.i f57590g;

    /* renamed from: h  reason: collision with root package name */
    private final fy.l f57591h;

    /* renamed from: i  reason: collision with root package name */
    private final mg0.c f57592i;

    /* renamed from: j  reason: collision with root package name */
    private final fy.b f57593j;

    /* renamed from: k  reason: collision with root package name */
    private final lj0.k f57594k;

    /* renamed from: l  reason: collision with root package name */
    private final t00.d f57595l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f57596m;

    /* renamed from: n  reason: collision with root package name */
    private final DateTime f57597n;

    /* renamed from: o  reason: collision with root package name */
    private final kj0.b f57598o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f57599p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57600q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57601r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57602s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57603t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57604u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57605v;

    /* renamed from: w  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57606w;

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Track f57607a;

        /* renamed from: b  reason: collision with root package name */
        private final Track f57608b;

        public a(Track track, Track track2) {
            this.f57607a = track;
            this.f57608b = track2;
        }

        public final Track a() {
            return this.f57608b;
        }

        public final Track b() {
            return this.f57607a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f57607a, aVar.f57607a) && kotlin.jvm.internal.u.e(this.f57608b, aVar.f57608b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i11 = 0;
            Track track = this.f57607a;
            if (track == null) {
                hashCode = 0;
            } else {
                hashCode = track.hashCode();
            }
            int i12 = hashCode * 31;
            Track track2 = this.f57608b;
            if (track2 != null) {
                i11 = track2.hashCode();
            }
            return i12 + i11;
        }

        public final String toString() {
            return "SleepTrackData(mostRelevantSleep=" + this.f57607a + ", lastSleepTrack=" + this.f57608b + ")";
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<ActivityAggregate>> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<ActivityAggregate> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new f0(e0.this, null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<List<Track>, LiveData<List<Vasistas>>> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<Vasistas>> invoke(List<Track> list) {
            List<Track> tracks = list;
            kotlin.jvm.internal.u.j(tracks, "tracks");
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new g0(e0.this, tracks, null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<PlatformFeature, LiveData<List<ky.d>>> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<ky.d>> invoke(PlatformFeature platformFeature) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new j0(platformFeature, e0.this, null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<List<MeasuresGroup>>> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<MeasuresGroup>> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new k0(e0.this, null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<nm0.j<ActivityAggregate, List<Vasistas>>, LiveData<HRZonesAggregate>> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<HRZonesAggregate> invoke(nm0.j<ActivityAggregate, List<Vasistas>> jVar) {
            nm0.j<ActivityAggregate, List<Vasistas>> jVar2 = jVar;
            List<Vasistas> b10 = jVar2.b();
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new l0(e0.this, b10, jVar2.a(), null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<ActivityAggregate, LiveData<LoadingState>> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<LoadingState> invoke(ActivityAggregate activityAggregate) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new m0(activityAggregate, e0.this, null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<PlatformFeature, LiveData<List<ky.d>>> {
        h() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<ky.d>> invoke(PlatformFeature platformFeature) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new n0(platformFeature, e0.this, null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<Track>, List<Vasistas>>, LiveData<List<Vasistas>>> {
        i() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<Vasistas>> invoke(nm0.j<List<Track>, List<Vasistas>> jVar) {
            nm0.j<List<Track>, List<Vasistas>> jVar2 = jVar;
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new o0(e0.this, jVar2.a(), jVar2.b(), null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.l<List<Track>, LiveData<a>> {
        j() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<a> invoke(List<Track> list) {
            List<Track> it = list;
            kotlin.jvm.internal.u.j(it, "it");
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new p0(e0.this, it, null), 2);
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.l<ActivityAggregate, LiveData<List<Track>>> {
        k() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<Track>> invoke(ActivityAggregate activityAggregate) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new q0(e0.this, null), 2);
        }
    }

    public e0(User user, DateTime startDate, lj0.h0 vasistasManager, ei0.q sleepTrackManager, ActivityAggregateManager activityAggregateManager, kn.e deviceManager, fl.i deviceModelRepository, fy.l lVar, mg0.c cVar, fy.b bVar, lj0.k kVar, t00.d networkSyncManager, PlatformFeatureRepository featureRepository) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(startDate, "startDate");
        kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
        kotlin.jvm.internal.u.j(sleepTrackManager, "sleepTrackManager");
        kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(deviceModelRepository, "deviceModelRepository");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        kotlin.jvm.internal.u.j(featureRepository, "featureRepository");
        this.f57584a = user;
        this.f57585b = startDate;
        this.f57586c = vasistasManager;
        this.f57587d = sleepTrackManager;
        this.f57588e = activityAggregateManager;
        this.f57589f = deviceManager;
        this.f57590g = deviceModelRepository;
        this.f57591h = lVar;
        this.f57592i = cVar;
        this.f57593j = bVar;
        this.f57594k = kVar;
        this.f57595l = networkSyncManager;
        this.f57597n = hn.a.m(startDate);
        this.f57598o = new kj0.b(user, 1, 1860000);
        androidx.lifecycle.k0<Boolean> k0Var = new androidx.lifecycle.k0<>(Boolean.TRUE);
        this.f57599p = k0Var;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(k0Var, new b());
        androidx.lifecycle.j0 c12 = androidx.lifecycle.e1.c(c11, new k());
        androidx.lifecycle.j0 c13 = androidx.lifecycle.e1.c(c12, new c());
        this.f57600q = androidx.lifecycle.e1.c(k0Var, new e());
        this.f57601r = androidx.lifecycle.e1.c(c11, new g());
        this.f57602s = androidx.lifecycle.e1.c(xw.a.b(new nm0.j(c12, c13)), new i());
        this.f57603t = androidx.lifecycle.e1.c(xw.a.b(new nm0.j(c11, c13)), new f());
        this.f57604u = androidx.lifecycle.e1.c(c12, new j());
        LiveData<PlatformFeature> featureLiveData = featureRepository.getFeatureLiveData(22);
        this.f57605v = androidx.lifecycle.e1.c(featureLiveData, new h());
        this.f57606w = androidx.lifecycle.e1.c(featureLiveData, new d());
    }

    public static final List A0(e0 e0Var, Vasistas.Category category) {
        return e0Var.f57586c.p(e0Var.f57584a.q(), category, e0Var.f57585b, e0Var.f57597n);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d1 -> B:32:0x00d2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.wiscale2.heart.heartrate.e0 r13, qm0.d r14) {
        /*
            r13.getClass()
            boolean r0 = r14 instanceof com.withings.wiscale2.heart.heartrate.i0
            if (r0 == 0) goto L16
            r0 = r14
            com.withings.wiscale2.heart.heartrate.i0 r0 = (com.withings.wiscale2.heart.heartrate.i0) r0
            int r1 = r0.f57667f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f57667f = r1
            goto L1b
        L16:
            com.withings.wiscale2.heart.heartrate.i0 r0 = new com.withings.wiscale2.heart.heartrate.i0
            r0.<init>(r13, r14)
        L1b:
            java.lang.Object r14 = r0.f57665d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f57667f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.util.Iterator r13 = r0.f57664c
            org.joda.time.DateTime r2 = r0.f57663b
            com.withings.wiscale2.heart.heartrate.e0 r4 = r0.f57662a
            nm0.l.b(r14)
            goto Ld2
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            nm0.l.b(r14)
            org.joda.time.DateTime r14 = r13.f57585b
            org.joda.time.DateTime r14 = hn.a.m(r14)
            org.joda.time.DateTime r2 = org.joda.time.DateTime.now()
            java.lang.String r4 = "now(...)"
            kotlin.jvm.internal.u.i(r2, r4)
            boolean r4 = r14.isAfter(r2)
            if (r4 == 0) goto L52
            r14 = r2
        L52:
            com.withings.vasistas.model.Vasistas$Category r2 = com.withings.vasistas.model.Vasistas.Category.MOTION
            com.withings.vasistas.model.Vasistas$Category r4 = com.withings.vasistas.model.Vasistas.Category.PAUSE
            com.withings.vasistas.model.Vasistas$Category[] r2 = new com.withings.vasistas.model.Vasistas.Category[]{r2, r4}
            java.util.ArrayList r2 = kotlin.collections.x.i0(r2)
            kn.e r4 = r13.f57589f
            r5 = 32
            java.util.List r4 = r4.h(r5)
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L72
            com.withings.vasistas.model.Vasistas$Category r4 = com.withings.vasistas.model.Vasistas.Category.BED
            r2.add(r4)
        L72:
            com.withings.user.User r4 = r13.f57584a
            long r4 = r4.q()
            fl.i r6 = r13.f57590g
            boolean r4 = r6.c(r4)
            if (r4 == 0) goto L85
            com.withings.vasistas.model.Vasistas$Category r4 = com.withings.vasistas.model.Vasistas.Category.BODY
            r2.add(r4)
        L85:
            java.util.Iterator r2 = r2.iterator()
            r12 = r14
            r14 = r13
            r13 = r2
            r2 = r12
        L8d:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto Ld4
            java.lang.Object r4 = r13.next()
            r10 = r4
            com.withings.vasistas.model.Vasistas$Category r10 = (com.withings.vasistas.model.Vasistas.Category) r10
            lj0.h0 r4 = r14.f57586c
            com.withings.user.User r11 = r14.f57584a
            long r5 = r11.q()
            org.joda.time.DateTime r8 = r14.f57585b
            r7 = r10
            r9 = r2
            java.util.List r4 = r4.o(r5, r7, r8, r9)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L8d
            long r5 = r11.q()
            org.joda.time.DateTime r8 = r14.f57585b
            lj0.k r4 = r14.f57594k
            r7 = r10
            r9 = r2
            com.withings.webservices.legacy.sync.ActionSyncJob r4 = r4.a(r5, r7, r8, r9)
            r0.f57662a = r14
            r0.f57663b = r2
            r0.f57664c = r13
            r0.f57667f = r3
            t00.d r5 = r14.f57595l
            java.lang.String r6 = "heart_day_download"
            java.lang.Object r4 = t00.g.a(r5, r4, r6, r0)
            if (r4 != r1) goto Ld1
            goto Ld9
        Ld1:
            r4 = r14
        Ld2:
            r14 = r4
            goto L8d
        Ld4:
            r14.V0()
            nm0.y r1 = nm0.y.f85009a
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.heartrate.e0.f0(com.withings.wiscale2.heart.heartrate.e0, qm0.d):java.lang.Object");
    }

    public static final void g0(e0 e0Var, HRZonesAggregate hRZonesAggregate, ActivityAggregate activityAggregate) {
        e0Var.getClass();
        if (activityAggregate != null) {
            if ((hRZonesAggregate.b() != 0 && hRZonesAggregate.b() != activityAggregate.getHrAverage()) || ((int) hRZonesAggregate.d()) != activityAggregate.getHrZoneLight() || ((int) hRZonesAggregate.g()) != activityAggregate.getHrZoneModerate() || ((int) hRZonesAggregate.c()) != activityAggregate.getHrZoneIntense() || ((int) hRZonesAggregate.h()) != activityAggregate.getHrZonePeak()) {
                activityAggregate.setHrZoneLight((int) hRZonesAggregate.d());
                activityAggregate.setHrZoneModerate((int) hRZonesAggregate.g());
                activityAggregate.setHrZoneIntense((int) hRZonesAggregate.c());
                activityAggregate.setHrZonePeak((int) hRZonesAggregate.h());
                activityAggregate.setHrAverage(hRZonesAggregate.b());
                activityAggregate.setSyncedToWs(false);
                e0Var.f57588e.insertOrUpdate(e0Var.f57584a, activityAggregate, false);
            }
        }
    }

    public final androidx.lifecycle.j0 G0() {
        return this.f57606w;
    }

    public final androidx.lifecycle.j0 K0() {
        return this.f57600q;
    }

    public final androidx.lifecycle.j0 M0() {
        return this.f57603t;
    }

    public final androidx.lifecycle.j0 O0() {
        return this.f57601r;
    }

    public final androidx.lifecycle.j0 R0() {
        return this.f57605v;
    }

    public final androidx.lifecycle.j0 T0() {
        return this.f57602s;
    }

    public final androidx.lifecycle.j0 U0() {
        return this.f57604u;
    }

    public final void V0() {
        this.f57599p.postValue(Boolean.TRUE);
    }
}
