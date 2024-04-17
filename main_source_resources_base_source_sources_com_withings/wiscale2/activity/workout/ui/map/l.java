package com.withings.wiscale2.activity.workout.ui.map;

import ab0.q;
import android.app.Application;
import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.LatLngBounds;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import l70.v;
import l70.w;
import lj0.h0;
import nm0.y;
import ym0.p;
import ym0.r;
/* compiled from: WorkoutMapActivity.kt */
/* loaded from: classes4.dex */
public final class l extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final Application f49883a;

    /* renamed from: b  reason: collision with root package name */
    private final long f49884b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f49885c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkoutManager f49886d;

    /* renamed from: e  reason: collision with root package name */
    private final GpsLocationRepository f49887e;

    /* renamed from: f  reason: collision with root package name */
    private final w f49888f;

    /* renamed from: g  reason: collision with root package name */
    private final WorkoutCategory f49889g;

    /* renamed from: h  reason: collision with root package name */
    private final jm.a f49890h;

    /* renamed from: i  reason: collision with root package name */
    private final ComputePace f49891i;

    /* renamed from: j  reason: collision with root package name */
    private final ComputeSpeed f49892j;

    /* renamed from: k  reason: collision with root package name */
    private final HasEnoughGpsLocations f49893k;

    /* renamed from: l  reason: collision with root package name */
    private final FilterGpsLocationWithPause f49894l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.f f49895m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f49896n;

    /* renamed from: o  reason: collision with root package name */
    private final SharedFlow<Track> f49897o;

    /* renamed from: p  reason: collision with root package name */
    private final j0 f49898p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.f f49899q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.f f49900r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.f f49901s;

    /* renamed from: t  reason: collision with root package name */
    private final j0 f49902t;

    /* renamed from: u  reason: collision with root package name */
    private final j0 f49903u;

    /* renamed from: v  reason: collision with root package name */
    private final int[] f49904v;

    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends s implements ym0.l<List<? extends GpsLocation>, Parcelable> {
        a(Object obj) {
            super(1, obj, l.class, "getBounds", "getBounds(Ljava/util/List;)Landroid/os/Parcelable;", 0);
        }

        @Override // ym0.l
        public final Parcelable invoke(List<? extends GpsLocation> list) {
            List<? extends GpsLocation> p02 = list;
            u.j(p02, "p0");
            ((l) this.receiver).getClass();
            if (mm.a.f82252a.a()) {
                LatLngBounds.Builder builder = new LatLngBounds.Builder();
                for (GpsLocation gpsLocation : p02) {
                    builder.include(vj0.f.g(gpsLocation));
                }
                LatLngBounds build = builder.build();
                u.i(build, "build(...)");
                LatLng latLng = build.northeast;
                double d11 = latLng.latitude;
                LatLng latLng2 = build.southwest;
                double d12 = (d11 - latLng2.latitude) * 0.1d;
                double d13 = (latLng.longitude - latLng2.longitude) * 0.1d;
                LatLng latLng3 = build.northeast;
                LatLngBounds including = build.including(new LatLng(latLng3.latitude + d12, latLng3.longitude + d13));
                u.i(including, "including(...)");
                LatLng latLng4 = including.southwest;
                return including.including(new LatLng(latLng4.latitude - d12, latLng4.longitude - d13));
            }
            LatLngBounds.Builder builder2 = new LatLngBounds.Builder();
            for (GpsLocation gpsLocation2 : p02) {
                builder2.include(vj0.f.h(gpsLocation2));
            }
            com.huawei.hms.maps.model.LatLngBounds build2 = builder2.build();
            com.huawei.hms.maps.model.LatLng latLng5 = build2.northeast;
            double d14 = latLng5.latitude;
            com.huawei.hms.maps.model.LatLng latLng6 = build2.southwest;
            double d15 = (d14 - latLng6.latitude) * 0.1d;
            double d16 = (latLng5.longitude - latLng6.longitude) * 0.1d;
            com.huawei.hms.maps.model.LatLng latLng7 = build2.northeast;
            com.huawei.hms.maps.model.LatLngBounds including2 = build2.including(new com.huawei.hms.maps.model.LatLng(latLng7.latitude + d15, latLng7.longitude + d16));
            com.huawei.hms.maps.model.LatLng latLng8 = including2.southwest;
            return including2.including(new com.huawei.hms.maps.model.LatLng(latLng8.latitude - d15, latLng8.longitude - d16));
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$distanceUnit$1", f = "WorkoutMapActivity.kt", l = {362}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements p<androidx.lifecycle.h0<Integer>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49905a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f49906b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WorkoutMapActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$distanceUnit$1$1", f = "WorkoutMapActivity.kt", l = {362}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements p<v, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f49908a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f49909b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.h0<Integer> f49910c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.lifecycle.h0<Integer> h0Var, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f49910c = h0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f49910c, dVar);
                aVar.f49909b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(v vVar, qm0.d<? super y> dVar) {
                return ((a) create(vVar, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f49908a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    Integer num = new Integer(((v) this.f49909b).b());
                    this.f49908a = 1;
                    if (this.f49910c.emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f49906b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Integer> h0Var, qm0.d<? super y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49905a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Flow<v> flow = l.this.f49888f.get();
                a aVar = new a((androidx.lifecycle.h0) this.f49906b, null);
                this.f49905a = 1;
                if (FlowKt.collectLatest(flow, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<List<GpsLocation>, GpsLocation> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f49911a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final GpsLocation invoke(List<GpsLocation> list) {
            List<GpsLocation> it = list;
            u.j(it, "it");
            return (GpsLocation) x.U(it);
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<GpsLocation>, List<Vasistas>>, LiveData<List<GpsLocation>>> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<GpsLocation>> invoke(nm0.j<List<GpsLocation>, List<Vasistas>> jVar) {
            nm0.j<List<GpsLocation>, List<Vasistas>> jVar2 = jVar;
            List<Vasistas> b10 = jVar2.b();
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new m(b10, l.this, jVar2.a(), null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutMapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$pauseVasistas$1$1", f = "WorkoutMapActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super List<Vasistas>>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f49914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Track track, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f49914b = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f49914b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<Vasistas>> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            h0 h0Var = l.this.f49885c;
            Track track = this.f49914b;
            return h0Var.o(track.getUserId(), Vasistas.Category.PAUSE, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$performance$1", f = "WorkoutMapActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements r<Track, nm0.j<? extends List<? extends GpsLocation>, ? extends List<Vasistas>>, Integer, qm0.d<? super ab0.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Track f49915a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ nm0.j f49916b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ int f49917c;

        f(qm0.d<? super f> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(Track track, nm0.j<? extends List<? extends GpsLocation>, ? extends List<Vasistas>> jVar, Integer num, qm0.d<? super ab0.i> dVar) {
            int intValue = num.intValue();
            f fVar = new f(dVar);
            fVar.f49915a = track;
            fVar.f49916b = jVar;
            fVar.f49917c = intValue;
            return fVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Track track = this.f49915a;
            nm0.j jVar = this.f49916b;
            int i11 = this.f49917c;
            List<GpsLocation> list = (List) jVar.a();
            List<Vasistas> list2 = (List) jVar.b();
            l lVar = l.this;
            bb0.m mVar = new bb0.m(lVar.getApplication());
            Context applicationContext = lVar.f49883a.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            q qVar = new q(applicationContext, i11, lVar.f49891i, lVar.f49893k, lVar.f49890h, mVar);
            WorkoutCategory workoutCategory = lVar.f49889g;
            u.g(list2);
            return qVar.d(track, workoutCategory, list, list2);
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$polylineData$1", f = "WorkoutMapActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.q<Track, List<? extends GpsLocation>, qm0.d<? super List<? extends vj0.c>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Track f49919a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f49920b;

        g(qm0.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Track track, List<? extends GpsLocation> list, qm0.d<? super List<? extends vj0.c>> dVar) {
            g gVar = new g(dVar);
            gVar.f49919a = track;
            gVar.f49920b = list;
            return gVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Track track = this.f49919a;
            l lVar = l.this;
            return l.r0(lVar, lVar.getApplication(), this.f49920b, track.getGpsSummary());
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$special$$inlined$flatMapLatest$1", f = "WorkoutMapActivity.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super List<? extends GpsLocation>>, Track, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49922a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f49923b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f49924c;

        public h(qm0.d dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super List<? extends GpsLocation>> flowCollector, Track track, qm0.d<? super y> dVar) {
            h hVar = new h(dVar);
            hVar.f49923b = flowCollector;
            hVar.f49924c = track;
            return hVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49922a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f49923b;
                Track track = (Track) this.f49924c;
                Flow<List<GpsLocation>> flow = l.this.f49887e.get(track.getUserId(), track.getStartDate(), track.getEndDate());
                this.f49922a = 1;
                if (FlowKt.emitAll(flowCollector, flow, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class i implements Flow<List<Vasistas>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f49926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f49927b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f49928a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f49929b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$special$$inlined$map$1$2", f = "WorkoutMapActivity.kt", l = {224, 223}, m = "emit")
            /* renamed from: com.withings.wiscale2.activity.workout.ui.map.l$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0675a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f49930a;

                /* renamed from: b  reason: collision with root package name */
                int f49931b;

                /* renamed from: c  reason: collision with root package name */
                FlowCollector f49932c;

                public C0675a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f49930a = obj;
                    this.f49931b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, l lVar) {
                this.f49928a = flowCollector;
                this.f49929b = lVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.withings.wiscale2.activity.workout.ui.map.l.i.a.C0675a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.withings.wiscale2.activity.workout.ui.map.l$i$a$a r0 = (com.withings.wiscale2.activity.workout.ui.map.l.i.a.C0675a) r0
                    int r1 = r0.f49931b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f49931b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.activity.workout.ui.map.l$i$a$a r0 = new com.withings.wiscale2.activity.workout.ui.map.l$i$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f49930a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f49931b
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L39
                    if (r2 == r5) goto L33
                    if (r2 != r4) goto L2b
                    nm0.l.b(r9)
                    goto L61
                L2b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L33:
                    kotlinx.coroutines.flow.FlowCollector r8 = r0.f49932c
                    nm0.l.b(r9)
                    goto L56
                L39:
                    nm0.l.b(r9)
                    com.withings.wiscale2.track.data.Track r8 = (com.withings.wiscale2.track.data.Track) r8
                    kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
                    com.withings.wiscale2.activity.workout.ui.map.l$e r2 = new com.withings.wiscale2.activity.workout.ui.map.l$e
                    com.withings.wiscale2.activity.workout.ui.map.l r6 = r7.f49929b
                    r2.<init>(r8, r3)
                    kotlinx.coroutines.flow.FlowCollector r8 = r7.f49928a
                    r0.f49932c = r8
                    r0.f49931b = r5
                    java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
                    if (r9 != r1) goto L56
                    return r1
                L56:
                    r0.f49932c = r3
                    r0.f49931b = r4
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L61
                    return r1
                L61:
                    nm0.y r8 = nm0.y.f85009a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.map.l.i.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public i(SharedFlow sharedFlow, l lVar) {
            this.f49926a = sharedFlow;
            this.f49927b = lVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<Vasistas>> flowCollector, qm0.d dVar) {
            Object collect = this.f49926a.collect(new a(flowCollector, this.f49927b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    /* loaded from: classes4.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.l<List<GpsLocation>, GpsLocation> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f49934a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final GpsLocation invoke(List<GpsLocation> list) {
            List<GpsLocation> it = list;
            u.j(it, "it");
            return (GpsLocation) x.K(it);
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$statBarContent$1", f = "WorkoutMapActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.q<Track, Integer, qm0.d<? super List<? extends xa0.a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Track f49935a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f49936b;

        k(qm0.d<? super k> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Track track, Integer num, qm0.d<? super List<? extends xa0.a>> dVar) {
            int intValue = num.intValue();
            k kVar = new k(dVar);
            kVar.f49935a = track;
            kVar.f49936b = intValue;
            return kVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Track track = this.f49935a;
            int i11 = this.f49936b;
            l lVar = l.this;
            return new xa0.b(lVar.getApplication(), i11, lVar.f49891i, lVar.f49892j).a(track, lVar.f49889g);
        }
    }

    /* compiled from: WorkoutMapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$track$1", f = "WorkoutMapActivity.kt", l = {367, 368}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.activity.workout.ui.map.l$l  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0676l extends kotlin.coroutines.jvm.internal.i implements p<FlowCollector<? super Track>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49938a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f49939b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WorkoutMapActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$track$1$track$1", f = "WorkoutMapActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.activity.workout.ui.map.l$l$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f49941a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f49941a = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f49941a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                l lVar = this.f49941a;
                return lVar.f49886d.getWorkoutById(lVar.f49884b);
            }
        }

        C0676l(qm0.d<? super C0676l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            C0676l c0676l = new C0676l(dVar);
            c0676l.f49939b = obj;
            return c0676l;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super Track> flowCollector, qm0.d<? super y> dVar) {
            return ((C0676l) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49938a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f49939b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                flowCollector = (FlowCollector) this.f49939b;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(l.this, null);
                this.f49939b = flowCollector;
                this.f49938a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Track track = (Track) obj;
            if (track != null) {
                this.f49939b = null;
                this.f49938a = 2;
                if (flowCollector.emit(track, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Application application, long j5, h0 h0Var, WorkoutManager workoutManager, GpsLocationRepository gpsLocationRepository, w wVar, WorkoutCategory category, jm.a measureFormatter, ComputePace computePace, ComputeSpeed computeSpeed, HasEnoughGpsLocations hasEnoughGpsLocations, FilterGpsLocationWithPause filterGpsLocationWithPause) {
        super(application);
        u.j(workoutManager, "workoutManager");
        u.j(category, "category");
        u.j(measureFormatter, "measureFormatter");
        this.f49883a = application;
        this.f49884b = j5;
        this.f49885c = h0Var;
        this.f49886d = workoutManager;
        this.f49887e = gpsLocationRepository;
        this.f49888f = wVar;
        this.f49889g = category;
        this.f49890h = measureFormatter;
        this.f49891i = computePace;
        this.f49892j = computeSpeed;
        this.f49893k = hasEnoughGpsLocations;
        this.f49894l = filterGpsLocationWithPause;
        androidx.lifecycle.f a11 = androidx.lifecycle.h.a(null, new b(null), 3);
        this.f49895m = a11;
        String[] features = category.getFeatures();
        u.i(features, "getFeatures(...)");
        this.f49896n = kotlin.collections.l.m(features, ConstantsWs.SUBCATEGORY_FEATURE_PACE);
        Flow flow = FlowKt.flow(new C0676l(null));
        CoroutineScope a12 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<Track> shareIn = FlowKt.shareIn(flow, a12, companion.getEagerly(), 1);
        this.f49897o = shareIn;
        androidx.lifecycle.f b10 = androidx.lifecycle.q.b(FlowKt.shareIn(new i(shareIn, this), h1.a(this), companion.getEagerly(), 1), null, 3);
        j0 c11 = e1.c(xw.a.d(new nm0.j(androidx.lifecycle.q.b(FlowKt.transformLatest(shareIn, new h(null)), null, 3), b10)), new d());
        this.f49898p = e1.b(c11, new a(this));
        this.f49899q = androidx.lifecycle.q.b(FlowKt.shareIn(FlowKt.flowOn(FlowKt.combine(shareIn, androidx.lifecycle.q.a(xw.a.d(new nm0.j(c11, b10))), androidx.lifecycle.q.a(a11), new f(null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), 1), null, 3);
        this.f49900r = androidx.lifecycle.q.b(FlowKt.combine(shareIn, androidx.lifecycle.q.a(c11), new g(null)), null, 3);
        this.f49901s = androidx.lifecycle.q.b(FlowKt.combine(shareIn, androidx.lifecycle.q.a(a11), new k(null)), null, 3);
        this.f49902t = e1.b(c11, j.f49934a);
        this.f49903u = e1.b(c11, c.f49911a);
        this.f49904v = ah.u.A(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r1.add(new vj0.c(kotlin.collections.x.i0(r3), r4, r6));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList r0(com.withings.wiscale2.activity.workout.ui.map.l r11, android.app.Application r12, java.util.List r13, com.withings.wiscale2.track.data.GpsSummary r14) {
        /*
            r11.getClass()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r0 = r13.iterator()
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 != 0) goto L12
            r0 = r2
            goto L35
        L12:
            java.lang.Object r1 = r0.next()
            com.withings.location.model.GpsLocation r1 = (com.withings.location.model.GpsLocation) r1
            float r1 = r1.getSpeed()
        L1c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r0.next()
            com.withings.location.model.GpsLocation r3 = (com.withings.location.model.GpsLocation) r3
            float r3 = r3.getSpeed()
            float r1 = java.lang.Math.max(r1, r3)
            goto L1c
        L31:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
        L35:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L3e:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lea
            java.lang.Object r3 = r13.next()
            com.withings.location.model.GpsLocation r3 = (com.withings.location.model.GpsLocation) r3
            if (r0 == 0) goto L68
            float r4 = r0.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L57
            r4 = r0
            goto L58
        L57:
            r4 = r2
        L58:
            if (r4 == 0) goto L68
            float r4 = r4.floatValue()
            float r6 = r3.getSpeed()
            float r5 = en0.r.b(r6, r5)
            float r5 = r5 / r4
            goto L6a
        L68:
            r5 = 1065353216(0x3f800000, float:1.0)
        L6a:
            java.lang.String r4 = "<this>"
            int[] r6 = r11.f49904v
            kotlin.jvm.internal.u.j(r6, r4)
            int r4 = r6.length
            r7 = 1
            int r4 = r4 - r7
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = an0.a.b(r5)
            r4 = r6[r4]
            int r4 = androidx.core.content.a.getColor(r12, r4)
            java.lang.Object r5 = kotlin.collections.x.U(r1)
            vj0.c r5 = (vj0.c) r5
            if (r14 == 0) goto L91
            double r8 = r14.getAverageSpeed()
            java.lang.Double r6 = java.lang.Double.valueOf(r8)
            goto L92
        L91:
            r6 = r2
        L92:
            if (r5 == 0) goto La1
            java.util.List r8 = r5.b()
            if (r8 == 0) goto La1
            java.lang.Object r8 = kotlin.collections.x.T(r8)
            com.withings.location.model.GpsLocation r8 = (com.withings.location.model.GpsLocation) r8
            goto La2
        La1:
            r8 = r2
        La2:
            boolean r6 = vj0.b.a(r6, r8, r3)
            if (r5 == 0) goto Lb8
            int r8 = r5.a()
            if (r8 != r4) goto Lb8
            if (r6 != 0) goto Lb8
            java.util.List r4 = r5.b()
            r4.add(r3)
            goto L3e
        Lb8:
            if (r5 != 0) goto Lcc
            vj0.c r5 = new vj0.c
            com.withings.location.model.GpsLocation[] r3 = new com.withings.location.model.GpsLocation[]{r3}
            java.util.ArrayList r3 = kotlin.collections.x.i0(r3)
            r5.<init>(r3, r4, r6)
            r1.add(r5)
            goto L3e
        Lcc:
            vj0.c r8 = new vj0.c
            r9 = 2
            com.withings.location.model.GpsLocation[] r9 = new com.withings.location.model.GpsLocation[r9]
            java.util.List r5 = r5.b()
            java.lang.Object r5 = kotlin.collections.x.T(r5)
            r10 = 0
            r9[r10] = r5
            r9[r7] = r3
            java.util.ArrayList r3 = kotlin.collections.x.i0(r9)
            r8.<init>(r3, r4, r6)
            r1.add(r8)
            goto L3e
        Lea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.map.l.r0(com.withings.wiscale2.activity.workout.ui.map.l, android.app.Application, java.util.List, com.withings.wiscale2.track.data.GpsSummary):java.util.ArrayList");
    }

    public final j0 B0() {
        return this.f49898p;
    }

    public final androidx.lifecycle.f F0() {
        return this.f49895m;
    }

    public final j0 G0() {
        return this.f49903u;
    }

    public final androidx.lifecycle.f K0() {
        return this.f49899q;
    }

    public final androidx.lifecycle.f M0() {
        return this.f49900r;
    }

    public final boolean O0() {
        return this.f49896n;
    }

    public final j0 R0() {
        return this.f49902t;
    }

    public final LiveData<List<xa0.a>> T0() {
        return this.f49901s;
    }
}
