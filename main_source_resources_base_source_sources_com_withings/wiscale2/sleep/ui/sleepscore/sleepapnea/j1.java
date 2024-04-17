package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import com.withings.periodsbar.Period;
import com.withings.user.core.models.User;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import ei0.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderPagerViewModel.kt */
/* loaded from: classes5.dex */
public final class j1 extends androidx.lifecycle.g1 implements q.a, py.a {

    /* renamed from: a  reason: collision with root package name */
    private final ei0.q f61355a;

    /* renamed from: b  reason: collision with root package name */
    private final User f61356b;

    /* renamed from: c  reason: collision with root package name */
    private final Period f61357c;

    /* renamed from: d  reason: collision with root package name */
    private final DateTime f61358d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f61359e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.k0<xw.c<Boolean>> f61360f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f61361g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f61362h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f61363i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61364j;

    /* renamed from: k  reason: collision with root package name */
    private final String f61365k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61366l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61367m;

    /* renamed from: n  reason: collision with root package name */
    private final xw.o f61368n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.k0<DateTime> f61369o;

    /* compiled from: SleepDisorderPagerViewModel.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.r<xw.o<List<? extends nm0.j<? extends Long, ? extends DateTime>>, Map<com.withings.date.android.a, ? extends List<? extends DatedValue>>, Map<Integer, ? extends List<? extends DatedValue>>, Integer>, List<? extends nm0.j<? extends Long, ? extends DateTime>>, Map<com.withings.date.android.a, ? extends List<? extends DatedValue>>, Map<Integer, ? extends List<? extends DatedValue>>, nm0.y> {
        a() {
            super(4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x009c, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00fe, code lost:
            continue;
         */
        @Override // ym0.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final nm0.y invoke(xw.o<java.util.List<? extends nm0.j<? extends java.lang.Long, ? extends org.joda.time.DateTime>>, java.util.Map<com.withings.date.android.a, ? extends java.util.List<? extends com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.DatedValue>>, java.util.Map<java.lang.Integer, ? extends java.util.List<? extends com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.DatedValue>>, java.lang.Integer> r9, java.util.List<? extends nm0.j<? extends java.lang.Long, ? extends org.joda.time.DateTime>> r10, java.util.Map<com.withings.date.android.a, ? extends java.util.List<? extends com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.DatedValue>> r11, java.util.Map<java.lang.Integer, ? extends java.util.List<? extends com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.DatedValue>> r12) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SleepDisorderPagerViewModel.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<List<Track>>> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<Track>> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new k1(j1.this, null), 2);
        }
    }

    /* compiled from: SleepDisorderPagerViewModel.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<List<Track>, List<nm0.j<Long, DateTime>>> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final List<nm0.j<Long, DateTime>> invoke(List<Track> list) {
            nm0.j jVar;
            List<Track> sleepTracks = list;
            kotlin.jvm.internal.u.j(sleepTracks, "sleepTracks");
            if (j1.this.f61357c != Period.f43721f) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Track track : sleepTracks) {
                Long id2 = track.getId();
                if (id2 != null) {
                    jVar = new nm0.j(Long.valueOf(id2.longValue()), TrackKt.getAwakeStartDate(track));
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: SleepDisorderPagerViewModel.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<List<DatedValue>, Map<com.withings.date.android.a, List<DatedValue>>> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final Map<com.withings.date.android.a, List<DatedValue>> invoke(List<DatedValue> list) {
            List<DatedValue> valuesFromTracks = list;
            kotlin.jvm.internal.u.j(valuesFromTracks, "valuesFromTracks");
            if (j1.this.f61357c == Period.f43724i) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : valuesFromTracks) {
                    DatedValue datedValue = (DatedValue) obj;
                    int year = datedValue.a().getYear();
                    DateTime a11 = datedValue.a();
                    kotlin.jvm.internal.u.j(a11, "<this>");
                    com.withings.date.android.a aVar = new com.withings.date.android.a(year, ((a11.getMonthOfYear() - 1) / 3) + 1);
                    Object obj2 = linkedHashMap.get(aVar);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(aVar, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return kotlin.collections.s0.t(linkedHashMap, pm0.a.a(l1.f61382a, m1.f61396a));
            }
            return null;
        }
    }

    /* compiled from: SleepDisorderPagerViewModel.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<List<DatedValue>, Map<Integer, List<DatedValue>>> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final Map<Integer, List<DatedValue>> invoke(List<DatedValue> list) {
            List<DatedValue> valuesFromTracks = list;
            kotlin.jvm.internal.u.j(valuesFromTracks, "valuesFromTracks");
            if (j1.this.f61357c == Period.f43725j) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : valuesFromTracks) {
                    Integer valueOf = Integer.valueOf(((DatedValue) obj).a().getYear());
                    Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = com.google.android.gms.internal.mlkit_common.a.d(linkedHashMap, valueOf);
                    }
                    ((List) obj2).add(obj);
                }
                return new TreeMap(linkedHashMap);
            }
            return null;
        }
    }

    /* compiled from: SleepDisorderPagerViewModel.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<List<Track>, List<DatedValue>> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final List<DatedValue> invoke(List<Track> list) {
            SleepTrackData sleepTrackData;
            Integer breathingEventProbability;
            SleepTrackData sleepTrackData2;
            List<Track> tracks = list;
            kotlin.jvm.internal.u.j(tracks, "tracks");
            ArrayList arrayList = new ArrayList();
            for (Track track : tracks) {
                DatedValue datedValue = null;
                if (j1.this.f61359e) {
                    Parcelable data = track.getData();
                    if (data instanceof SleepTrackData) {
                        sleepTrackData2 = (SleepTrackData) data;
                    } else {
                        sleepTrackData2 = null;
                    }
                    if (sleepTrackData2 != null) {
                        breathingEventProbability = sleepTrackData2.getApneaHypopneaIndex();
                    }
                    breathingEventProbability = null;
                } else {
                    Parcelable data2 = track.getData();
                    if (data2 instanceof SleepTrackData) {
                        sleepTrackData = (SleepTrackData) data2;
                    } else {
                        sleepTrackData = null;
                    }
                    if (sleepTrackData != null) {
                        breathingEventProbability = sleepTrackData.getBreathingEventProbability();
                    }
                    breathingEventProbability = null;
                }
                if (breathingEventProbability != null) {
                    datedValue = new DatedValue(TrackKt.getAwakeStartDate(track), breathingEventProbability.intValue());
                }
                if (datedValue != null) {
                    arrayList.add(datedValue);
                }
            }
            return arrayList;
        }
    }

    public j1(ei0.q qVar, User user, Period period, DateTime dateTime, boolean z5) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(period, "period");
        this.f61355a = qVar;
        this.f61356b = user;
        this.f61357c = period;
        this.f61358d = dateTime;
        this.f61359e = z5;
        qVar.b(this);
        this.f61360f = new androidx.lifecycle.k0<>();
        this.f61361g = xw.d.b(0);
        Boolean bool = Boolean.TRUE;
        this.f61362h = xw.d.b(bool);
        androidx.lifecycle.k0<Boolean> b10 = xw.d.b(bool);
        this.f61363i = b10;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(b10, new b());
        androidx.lifecycle.j0 b11 = androidx.lifecycle.e1.b(c11, new c());
        this.f61364j = b11;
        this.f61365k = "apnea";
        androidx.lifecycle.j0 b12 = androidx.lifecycle.e1.b(c11, new f());
        androidx.lifecycle.j0 b13 = androidx.lifecycle.e1.b(b12, new d());
        this.f61366l = b13;
        androidx.lifecycle.j0 b14 = androidx.lifecycle.e1.b(b12, new e());
        this.f61367m = b14;
        this.f61368n = new xw.o(b11, b13, b14, new a());
        this.f61369o = xw.d.b(dateTime);
    }

    public final androidx.lifecycle.j0 A0() {
        return this.f61367m;
    }

    public final void B0(int i11) {
        List list = (List) this.f61364j.getValue();
        androidx.lifecycle.k0<DateTime> k0Var = this.f61369o;
        Period period = this.f61357c;
        if (list != null) {
            DateTime dateTime = (DateTime) ((nm0.j) list.get(i11)).d();
            k0Var.setValue(dateTime);
            if (period == Period.f43721f) {
                com.withings.wiscale2.device.hwa08.postinstall.b0.V(this, period, dateTime);
            }
        }
        Map map = (Map) this.f61366l.getValue();
        if (map != null) {
            DateTime a11 = ((DatedValue) kotlin.collections.x.T((List) ((nm0.j) kotlin.collections.s0.o(map).get(i11)).d())).a();
            k0Var.setValue(a11);
            if (period == Period.f43724i) {
                com.withings.wiscale2.device.hwa08.postinstall.b0.V(this, period, a11);
            }
        }
        Map map2 = (Map) this.f61367m.getValue();
        if (map2 != null) {
            DateTime a12 = ((DatedValue) kotlin.collections.x.T((List) ((nm0.j) kotlin.collections.s0.o(map2).get(i11)).d())).a();
            k0Var.setValue(a12);
            if (period == Period.f43725j) {
                com.withings.wiscale2.device.hwa08.postinstall.b0.V(this, period, a12);
            }
        }
    }

    @Override // ei0.q.a
    public final void V(long j5, Track track) {
        kotlin.jvm.internal.u.j(track, "track");
    }

    @Override // ei0.q.a
    public final void Y(long j5, Track track) {
        kotlin.jvm.internal.u.j(track, "track");
        if (TrackKt.hasSleepApnea(track) || TrackKt.hasBreathingDisturbance(track)) {
            this.f61363i.postValue(Boolean.TRUE);
        }
    }

    @Override // ei0.q.a
    public final void d0(long j5, Track track) {
        boolean z5 = this.f61359e;
        if ((z5 && TrackKt.hasSleepApnea(track)) || (!z5 && TrackKt.hasBreathingDisturbance(track))) {
            this.f61360f.postValue(new xw.c<>(Boolean.TRUE));
        }
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f61365k;
    }

    public final androidx.lifecycle.k0<xw.c<Boolean>> m0() {
        return this.f61360f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f61355a.L(this);
    }

    public final xw.o p0() {
        return this.f61368n;
    }

    public final androidx.lifecycle.k0<Boolean> q0() {
        return this.f61362h;
    }

    public final androidx.lifecycle.k0<DateTime> r0() {
        return this.f61369o;
    }

    public final androidx.lifecycle.k0<Integer> t0() {
        return this.f61361g;
    }

    public final androidx.lifecycle.j0 y0() {
        return this.f61364j;
    }

    public final androidx.lifecycle.j0 z0() {
        return this.f61366l;
    }
}
