package com.withings.wiscale2.activity.model.builder;

import android.content.Context;
import androidx.camera.camera2.internal.o0;
import com.google.android.gms.common.util.GmsVersion;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.device.Device;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.model.builder.RecomputeAggregate;
import com.withings.wiscale2.activity.model.builder.e;
import com.withings.wiscale2.activity.workout.model.SwimWorkoutBuilder;
import com.withings.wiscale2.activity.workout.model.WorkoutDataBuilder;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.model.WorkoutRecognitionBuilder;
import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import com.withings.wiscale2.activity.workout.model.WorkoutVasistasRangeCalculator;
import com.withings.wiscale2.activity.workout.recognition.model.Classifier;
import com.withings.wiscale2.activity.workout.recognition.model.RecognitionManager;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.workout.workoutdata.WorkoutData;
import cp0.g;
import cp0.j0;
import cp0.n;
import ei0.q;
import ei0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.x;
import lj0.b;
import lj0.b0;
import lj0.g;
import lj0.h0;
import lj0.r;
import lj0.w;
import m70.i;
import nm0.k;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import ym0.l;
import zx.u;
/* compiled from: ActivityBuilder.kt */
/* loaded from: classes4.dex */
public final class b implements h0.a, WorkoutManager.Listener, SwimWorkoutBuilder.TimeZoneProvider, e.b, WorkoutRecognitionBuilder.TimeZoneProvider, w.a, r.a, g.a, b.a, u {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48488a;

    /* renamed from: b  reason: collision with root package name */
    private final i f48489b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f48490c;

    /* renamed from: d  reason: collision with root package name */
    private final cy.a f48491d;

    /* renamed from: e  reason: collision with root package name */
    private final WorkoutManager f48492e;

    /* renamed from: f  reason: collision with root package name */
    private final q f48493f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f48494g;

    /* renamed from: h  reason: collision with root package name */
    private final w f48495h;

    /* renamed from: i  reason: collision with root package name */
    private final r f48496i;

    /* renamed from: j  reason: collision with root package name */
    private final lj0.b f48497j;

    /* renamed from: k  reason: collision with root package name */
    private final g f48498k;

    /* renamed from: l  reason: collision with root package name */
    private final ua0.a f48499l;

    /* renamed from: m  reason: collision with root package name */
    private final b0 f48500m;

    /* renamed from: n  reason: collision with root package name */
    private final WorkoutDataBuilder f48501n;

    /* renamed from: o  reason: collision with root package name */
    private final com.withings.device.details.automatic.activity.detection.d f48502o;

    /* renamed from: p  reason: collision with root package name */
    private final WorkoutVasistasRangeCalculator f48503p;

    /* renamed from: q  reason: collision with root package name */
    private u70.i f48504q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements l<Track, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u70.i f48506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u70.i iVar) {
            super(1);
            this.f48506b = iVar;
        }

        @Override // ym0.l
        public final y invoke(Track track) {
            Track it = track;
            kotlin.jvm.internal.u.j(it, "it");
            x70.b.c(b.this, this.f48506b, "-> " + it, new Object[0]);
            return y.f85009a;
        }
    }

    public b(Context context, i userManager, h0 h0Var, cy.a aVar, WorkoutManager workoutManager, q sleepTrackManager, kn.e deviceManager, w swimVasistasRepository, r spo2VasistasRepository, lj0.b ahiVasistasRepository, g elevationVasistasRepository, ua0.a computeTrackGpsSummary, lj0.l lVar, WorkoutDataBuilder workoutDataBuilder, com.withings.device.details.automatic.activity.detection.d actirecCategoryDetectionRepository) {
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        kotlin.jvm.internal.u.j(sleepTrackManager, "sleepTrackManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(swimVasistasRepository, "swimVasistasRepository");
        kotlin.jvm.internal.u.j(spo2VasistasRepository, "spo2VasistasRepository");
        kotlin.jvm.internal.u.j(ahiVasistasRepository, "ahiVasistasRepository");
        kotlin.jvm.internal.u.j(elevationVasistasRepository, "elevationVasistasRepository");
        kotlin.jvm.internal.u.j(computeTrackGpsSummary, "computeTrackGpsSummary");
        kotlin.jvm.internal.u.j(actirecCategoryDetectionRepository, "actirecCategoryDetectionRepository");
        this.f48488a = context;
        this.f48489b = userManager;
        this.f48490c = h0Var;
        this.f48491d = aVar;
        this.f48492e = workoutManager;
        this.f48493f = sleepTrackManager;
        this.f48494g = deviceManager;
        this.f48495h = swimVasistasRepository;
        this.f48496i = spo2VasistasRepository;
        this.f48497j = ahiVasistasRepository;
        this.f48498k = elevationVasistasRepository;
        this.f48499l = computeTrackGpsSummary;
        this.f48500m = lVar;
        this.f48501n = workoutDataBuilder;
        this.f48502o = actirecCategoryDetectionRepository;
        this.f48503p = new WorkoutVasistasRangeCalculator(h0Var, workoutManager);
    }

    private final void A() {
        x70.b.c(this, this.f48504q, "Start listening", new Object[0]);
        this.f48491d.a(this);
        this.f48490c.x(this);
        this.f48492e.registerListener(this);
        this.f48495h.c(this);
        this.f48496i.b(this);
        this.f48497j.b(this);
        this.f48498k.b(this);
    }

    private final void B() {
        x70.b.c(this, this.f48504q, "Stop listening", new Object[0]);
        this.f48491d.b(this);
        this.f48490c.A(this);
        this.f48492e.unregisterListener(this);
        this.f48495h.d(this);
        this.f48496i.c(this);
        this.f48497j.c(this);
        this.f48498k.c(this);
    }

    public static void i(b this$0, long j5, DateTime fromDate, DateTime toDate) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(fromDate, "$fromDate");
        kotlin.jvm.internal.u.j(toDate, "$toDate");
        User i11 = this$0.f48489b.i(j5);
        kotlin.jvm.internal.u.i(i11, "getUserById(...)");
        synchronized (this$0) {
            this$0.w(i11, fromDate, toDate);
        }
    }

    public static void j(b this$0, long j5, DateTime fromDate, DateTime toDate) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(fromDate, "$fromDate");
        kotlin.jvm.internal.u.j(toDate, "$toDate");
        cp0.g h11 = n.h(x.t(this$0.f48492e.getWorkoutsForUserContainedBetween(j5, fromDate, toDate)), com.withings.wiscale2.activity.model.builder.a.f48487a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h11.iterator();
        while (true) {
            g.a aVar = (g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            linkedHashMap.put(next, WorkoutDataBuilder.buildWorkoutData$default(this$0.f48501n, (Track) next, false, 2, null));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!kotlin.jvm.internal.u.e(((Track) entry.getKey()).getData(), (WorkoutData) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Track track = (Track) entry2.getKey();
            track.setGpsSummary(this$0.f48499l.c(track));
            arrayList.add(track.setData((WorkoutData) entry2.getValue()));
        }
        WorkoutSaver.INSTANCE.save(x.Q0(arrayList));
    }

    public static void k(b this$0, long j5, DateTime fromDate, DateTime toDate, boolean z5) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(fromDate, "$fromDate");
        kotlin.jvm.internal.u.j(toDate, "$toDate");
        User i11 = this$0.f48489b.i(j5);
        if (i11 != null && z5) {
            u70.i iVar = this$0.f48504q;
            x70.b.c(this$0, iVar, "Activity builder : on elevation vasistas inserted from " + fromDate, new Object[0]);
            RecomputeAggregate.a.a(this$0.f48488a, i11.q(), fromDate, toDate, new int[]{4});
        }
    }

    public static void m(b this$0, long j5, DateTime fromDate, DateTime toDate) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(fromDate, "$fromDate");
        kotlin.jvm.internal.u.j(toDate, "$toDate");
        synchronized (this$0) {
            this$0.v(j5, fromDate);
            RecomputeAggregate.a.a(this$0.f48488a, j5, fromDate, toDate, new int[]{3});
        }
    }

    public static void n(Vasistas.Category vasistasCategory, b this$0, long j5, DateTime fromDate, DateTime toDate, boolean z5) {
        User user;
        int i11;
        int i12;
        int i13;
        WorkoutSaver workoutSaver;
        Vasistas vasistas;
        kotlin.jvm.internal.u.j(vasistasCategory, "$vasistasCategory");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(fromDate, "$fromDate");
        kotlin.jvm.internal.u.j(toDate, "$toDate");
        Vasistas.Category category = Vasistas.Category.MOTION;
        if (x.W(category, Vasistas.Category.PAUSE).contains(vasistasCategory)) {
            synchronized (this$0) {
                User i14 = this$0.f48489b.i(j5);
                if (i14 != null && z5) {
                    DateTime firstHoleBeforeStartDate = this$0.f48503p.getFirstHoleBeforeStartDate(fromDate, j5, category);
                    DateTime firstHoleAfterEndDate = this$0.f48503p.getFirstHoleAfterEndDate(toDate, j5, category);
                    List<Vasistas> o11 = this$0.f48490c.o(j5, category, firstHoleBeforeStartDate, firstHoleAfterEndDate);
                    kotlin.jvm.internal.u.g(o11);
                    u70.i iVar = null;
                    List<Vasistas> list = o11.isEmpty() ^ true ? o11 : null;
                    if (list != null && (vasistas = (Vasistas) x.I(list)) != null) {
                        Device d11 = this$0.f48494g.d(vasistas.getDeviceId());
                        if (d11 != null) {
                            iVar = d11.getMacAddress();
                        }
                    }
                    this$0.f48504q = iVar;
                    x70.b.c(this$0, iVar, "Activity builder instance : " + System.identityHashCode(this$0), new Object[0]);
                    x70.b.c(this$0, this$0.f48504q, "Activity builder : on motion vasistas inserted from " + fromDate + " to " + toDate + " : " + o11.size() + " vasistas inserted", new Object[0]);
                    u70.i iVar2 = this$0.f48504q;
                    StringBuilder sb2 = new StringBuilder("DeviceMacAddress : ");
                    sb2.append(iVar2);
                    x70.b.c(this$0, iVar2, sb2.toString(), new Object[0]);
                    x70.b.c(this$0, this$0.f48504q, "effectiveStartDate : " + firstHoleBeforeStartDate, new Object[0]);
                    x70.b.c(this$0, this$0.f48504q, "effectiveEndDate : " + firstHoleAfterEndDate, new Object[0]);
                    if (o11.isEmpty()) {
                        x70.b.c(this$0, this$0.f48504q, "Vasistas list is empty, abort mission !", new Object[0]);
                        return;
                    }
                    ArrayList q11 = this$0.q(i14, o11, category.getValue(), this$0.f48504q);
                    List<Track> r7 = this$0.r(j5, o11, this$0.f48504q);
                    List<Track> o12 = this$0.o(i14, o11, this$0.f48504q);
                    List<Track> y11 = this$0.y(j5, firstHoleBeforeStartDate, firstHoleAfterEndDate, this$0.f48504q);
                    this$0.B();
                    try {
                        workoutSaver = WorkoutSaver.INSTANCE;
                        workoutSaver.save(y11);
                        this$0.f48493f.I(q11);
                        user = i14;
                        i12 = 0;
                        i11 = 1;
                        i13 = 5;
                    } catch (Throwable th2) {
                        th = th2;
                        user = i14;
                        i11 = 1;
                        i12 = 0;
                        i13 = 5;
                    }
                    try {
                        workoutSaver.saveActivityRecoWorkouts(j5, r7, o12, firstHoleBeforeStartDate, firstHoleAfterEndDate);
                        y yVar = y.f85009a;
                    } catch (Throwable th3) {
                        th = th3;
                        nm0.l.a(th);
                        this$0.A();
                        RecomputeAggregate.a.a(this$0.f48488a, user.q(), fromDate, toDate, new int[]{i12, 2, i11, 4, i13});
                    }
                    this$0.A();
                    RecomputeAggregate.a.a(this$0.f48488a, user.q(), fromDate, toDate, new int[]{i12, 2, i11, 4, i13});
                }
            }
        } else if (vasistasCategory == Vasistas.Category.BODY) {
            User i15 = this$0.f48489b.i(j5);
            if (i15 == null || !z5) {
                return;
            }
            x70.b.c(this$0, this$0.f48504q, "Activity builder : on body vasistas inserted from " + fromDate, new Object[0]);
            kj0.d.f76061a.getClass();
            kj0.d.a(j5, fromDate, toDate);
            RecomputeAggregate.a.a(this$0.f48488a, i15.q(), fromDate, toDate, new int[]{1});
        } else if (vasistasCategory == Vasistas.Category.CORE_TEMPERATURE) {
            synchronized (this$0) {
                if (this$0.f48489b.i(j5) != null && z5) {
                    x70.b.c(this$0, this$0.f48504q, "Activity builder : on temperature vasistas inserted from " + fromDate, new Object[0]);
                    mj0.a.f82193a.getClass();
                    mj0.a.a(j5, fromDate, toDate);
                    RecomputeAggregate.a.a(this$0.f48488a, j5, fromDate, toDate, new int[]{5});
                }
            }
        }
    }

    private final List<Track> o(User user, List<Vasistas> list, u70.i iVar) {
        List<Track> list2;
        WorkoutRecognitionBuilder workoutRecognitionBuilder = new WorkoutRecognitionBuilder(this, this.f48501n, this.f48502o);
        Classifier classifierForUserId = RecognitionManager.get(this.f48488a).getClassifierForUserId(user.q());
        if (classifierForUserId != null) {
            list2 = workoutRecognitionBuilder.buildWorkoutByRecognition(list, user, classifierForUserId);
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = i0.f76187a;
        }
        x70.b.c(this, iVar, o0.a("Those vasistas generated ", list2.size(), " new activity recognition tracks"), new Object[0]);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            x70.b.c(this, iVar, "-> " + ((Track) it.next()), new Object[0]);
        }
        return list2;
    }

    private final synchronized void p(long j5, MeasuresGroup measuresGroup) {
        DateTime dateTime = new DateTime(measuresGroup.getDate());
        if (dateTime.isAfter(new DateTime(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, 1, 1, 0, 0))) {
            v(j5, dateTime);
            DateTime withTimeAtStartOfDay = dateTime.withTimeAtStartOfDay();
            kotlin.jvm.internal.u.g(withTimeAtStartOfDay);
            RecomputeAggregate.a.a(this.f48488a, j5, withTimeAtStartOfDay, hn.a.m(withTimeAtStartOfDay), new int[]{3});
        }
    }

    private final ArrayList q(User user, List list, int i11, u70.i iVar) {
        DateTime minusMillis = ((Vasistas) x.I(list)).getStartDate().minusMillis(GmsVersion.VERSION_PARMESAN);
        kotlin.jvm.internal.u.i(minusMillis, "minusMillis(...)");
        DateTime plusMillis = ((Vasistas) x.T(list)).getEnd().plusMillis(GmsVersion.VERSION_PARMESAN);
        kotlin.jvm.internal.u.i(plusMillis, "plusMillis(...)");
        List j5 = this.f48493f.j(user.q(), minusMillis, plusMillis, i11);
        x70.b.c(this, iVar, android.support.v4.media.a.a("Existing sleep tracks in this time range : ", ((ArrayList) j5).size()), new Object[0]);
        Iterator it = j5.iterator();
        while (it.hasNext()) {
            x70.b.c(this, iVar, "-> " + ((Track) it.next()), new Object[0]);
        }
        ArrayList b10 = new e(this, user).b(list, j5, iVar);
        SleepScoreRecalculator sleepScoreRecalculator = new SleepScoreRecalculator(user.q(), this.f48493f);
        Iterator it2 = b10.iterator();
        while (it2.hasNext()) {
            sleepScoreRecalculator.recalculateSleepScoreIfNecessary((Track) it2.next());
        }
        x70.b.c(this, iVar, o0.a("New and mofified Tracks to synchronize with the platform : ", b10.size(), " sleep tracks"), new Object[0]);
        Iterator it3 = b10.iterator();
        while (it3.hasNext()) {
            x70.b.c(this, iVar, "-> " + ((Track) it3.next()), new Object[0]);
        }
        return b10;
    }

    private final List<Track> r(long j5, List<Vasistas> list, u70.i iVar) {
        List<Track> build = new SwimWorkoutBuilder(j5, this, this.f48492e).build(list);
        x70.b.c(this, iVar, o0.a("Those vasistas generated ", build.size(), " swim tracks"), new Object[0]);
        Iterator<T> it = build.iterator();
        while (it.hasNext()) {
            x70.b.c(this, iVar, "-> " + ((Track) it.next()), new Object[0]);
        }
        return build;
    }

    private static DateTimeZone t(long j5, DateTime dateTime) {
        Object a11;
        String str;
        try {
            ActivityAggregate aggregateForTime = ActivityAggregateManager.Companion.get().getAggregateForTime(j5, dateTime);
            if (aggregateForTime != null) {
                str = aggregateForTime.getTimezone();
            } else {
                str = null;
            }
            a11 = DateTimeZone.forID(str);
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (k.b(a11) != null) {
            a11 = DateTimeZone.getDefault();
        }
        kotlin.jvm.internal.u.i(a11, "getOrElse(...)");
        return (DateTimeZone) a11;
    }

    private final void v(long j5, DateTime dateTime) {
        q qVar = this.f48493f;
        List<Track> E = qVar.E(j5, dateTime);
        for (Track track : E) {
            kotlin.jvm.internal.u.j(track, "<this>");
            new z().a(track);
            track.setSyncedToWs(false);
        }
        try {
            qVar.I(E);
            y yVar = y.f85009a;
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        A();
    }

    private final void w(User user, DateTime dateTime, DateTime dateTime2) {
        Object next;
        DateTime now;
        DateTime dateTime3;
        x70.b.c(this, this.f48504q, "Modify sleep tracks for average AHI from day " + dateTime + " to day : " + dateTime2, new Object[0]);
        long q11 = user.q();
        q qVar = this.f48493f;
        List<Track> i11 = qVar.i(q11, dateTime, dateTime2);
        x70.b.c(this, this.f48504q, android.support.v4.media.a.a("Sleep tracks for day ", ((ArrayList) i11).size()), new Object[0]);
        Iterator<T> it = i11.iterator();
        while (it.hasNext()) {
            x70.b.c(this, this.f48504q, "Sleep track: " + ((Track) it.next()), new Object[0]);
        }
        Iterator<T> it2 = i11.iterator();
        Object obj = null;
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                DateTime effectiveStartDate = TrackKt.getEffectiveStartDate((Track) next);
                do {
                    Object next2 = it2.next();
                    DateTime effectiveStartDate2 = TrackKt.getEffectiveStartDate((Track) next2);
                    if (effectiveStartDate.compareTo(effectiveStartDate2) > 0) {
                        next = next2;
                        effectiveStartDate = effectiveStartDate2;
                    }
                } while (it2.hasNext());
            }
        }
        Track track = (Track) next;
        if (track == null || (now = TrackKt.getEffectiveStartDate(track)) == null) {
            now = DateTime.now();
        }
        DateTime dateTime4 = now;
        Iterator<T> it3 = i11.iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                DateTime effectiveEndDate = TrackKt.getEffectiveEndDate((Track) obj);
                do {
                    Object next3 = it3.next();
                    DateTime effectiveEndDate2 = TrackKt.getEffectiveEndDate((Track) next3);
                    if (effectiveEndDate.compareTo(effectiveEndDate2) < 0) {
                        obj = next3;
                        effectiveEndDate = effectiveEndDate2;
                    }
                } while (it3.hasNext());
            }
        }
        Track track2 = (Track) obj;
        if (track2 == null || (dateTime3 = TrackKt.getEffectiveEndDate(track2)) == null) {
            dateTime3 = new DateTime(0L);
        }
        ArrayList arrayList = new ArrayList();
        for (Vasistas.Category category : x.W(Vasistas.Category.AHI, Vasistas.Category.BODY)) {
            List<Vasistas> o11 = this.f48490c.o(user.q(), category, dateTime4, dateTime3);
            kotlin.jvm.internal.u.i(o11, "getVasistasBetween(...)");
            x.n(o11, arrayList);
        }
        x70.b.c(this, this.f48504q, android.support.v4.media.a.a("AHI vasistas for day: ", arrayList.size()), new Object[0]);
        try {
            qVar.I(new e(this, user).b(arrayList, i11, this.f48504q));
            y yVar = y.f85009a;
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        A();
    }

    private final void x(long j5, DateTime dateTime, DateTime dateTime2, Track track) {
        if (track.getData() instanceof WorkoutData) {
            RecomputeAggregate.a.a(this.f48488a, j5, dateTime, dateTime2, new int[]{2});
        }
    }

    private final List<Track> y(long j5, DateTime dateTime, DateTime dateTime2, u70.i iVar) {
        List<Track> workoutsForUserContainedBetween = this.f48492e.getWorkoutsForUserContainedBetween(j5, dateTime, dateTime2);
        x70.b.c(this, iVar, o0.a("Already existing workout within time range : ", workoutsForUserContainedBetween.size(), " workout(s)"), new Object[0]);
        j0 v11 = n.v(x.t(workoutsForUserContainedBetween), new a(iVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = v11.iterator();
        while (true) {
            j0.a aVar = (j0.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            linkedHashMap.put(next, WorkoutDataBuilder.buildWorkoutData$default(this.f48501n, (Track) next, false, 2, null));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!kotlin.jvm.internal.u.e(((Track) entry.getKey()).getData(), (WorkoutData) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Track track = (Track) entry2.getKey();
            track.setGpsSummary(this.f48499l.c(track));
            arrayList.add(track.setData((WorkoutData) entry2.getValue()));
        }
        List<Track> Q0 = x.Q0(arrayList);
        x70.b.c(this, iVar, o0.a("Workouts to update in local database : ", Q0.size(), " workout(s)"), new Object[0]);
        Iterator<T> it2 = Q0.iterator();
        while (it2.hasNext()) {
            x70.b.c(this, iVar, "-> " + ((Track) it2.next()), new Object[0]);
        }
        return Q0;
    }

    @Override // lj0.h0.a
    public final void T(final long j5, final Vasistas.Category vasistasCategory, final DateTime fromDate, final DateTime toDate, final boolean z5) {
        kotlin.jvm.internal.u.j(vasistasCategory, "vasistasCategory");
        kotlin.jvm.internal.u.j(fromDate, "fromDate");
        kotlin.jvm.internal.u.j(toDate, "toDate");
        this.f48500m.post(new Runnable() { // from class: da0.e
            @Override // java.lang.Runnable
            public final void run() {
                com.withings.wiscale2.activity.model.builder.b.n(Vasistas.Category.this, this, j5, fromDate, toDate, z5);
            }
        });
    }

    @Override // lj0.g.a
    public final void a(final long j5, final DateTime dateTime, final DateTime dateTime2, final boolean z5) {
        if (z5) {
            this.f48500m.post(new Runnable() { // from class: da0.h
                @Override // java.lang.Runnable
                public final void run() {
                    com.withings.wiscale2.activity.model.builder.b.k(com.withings.wiscale2.activity.model.builder.b.this, j5, dateTime, dateTime2, z5);
                }
            });
        }
    }

    @Override // zx.u
    public final void a0(long j5, MeasuresGroup measuresGroup) {
        if (measuresGroup.hasMeasureForType(54)) {
            p(j5, measuresGroup);
        }
    }

    @Override // lj0.r.a
    public final void e(final long j5, final DateTime dateTime, final DateTime dateTime2, boolean z5) {
        if (z5) {
            this.f48500m.post(new Runnable() { // from class: da0.f
                @Override // java.lang.Runnable
                public final void run() {
                    com.withings.wiscale2.activity.model.builder.b.m(com.withings.wiscale2.activity.model.builder.b.this, j5, dateTime, dateTime2);
                }
            });
        }
    }

    @Override // lj0.b.a
    public final void f(final long j5, final DateTime dateTime, final DateTime dateTime2, boolean z5) {
        if (z5) {
            this.f48500m.post(new Runnable() { // from class: da0.g
                @Override // java.lang.Runnable
                public final void run() {
                    com.withings.wiscale2.activity.model.builder.b.i(com.withings.wiscale2.activity.model.builder.b.this, j5, dateTime, dateTime2);
                }
            });
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.SwimWorkoutBuilder.TimeZoneProvider
    public final DateTimeZone getTimezoneForUserAtDate(SwimWorkoutBuilder builder, long j5, DateTime dateTime) {
        kotlin.jvm.internal.u.j(builder, "builder");
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        return t(j5, dateTime);
    }

    @Override // lj0.w.a
    public final void h(final long j5, final DateTime dateTime, final DateTime dateTime2, boolean z5) {
        if (z5) {
            this.f48500m.post(new Runnable() { // from class: da0.i
                @Override // java.lang.Runnable
                public final void run() {
                    com.withings.wiscale2.activity.model.builder.b.j(com.withings.wiscale2.activity.model.builder.b.this, j5, dateTime, dateTime2);
                }
            });
        }
    }

    @Override // zx.u
    public final void l(long j5, MeasuresGroup measuresGroup) {
        if (measuresGroup.hasMeasureForType(54)) {
            p(j5, measuresGroup);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackDeleted(long j5, Track track, boolean z5) {
        kotlin.jvm.internal.u.j(track, "track");
        if (this.f48489b.i(j5) != null && !z5) {
            u70.i iVar = this.f48504q;
            x70.b.c(this, iVar, "Activity builder : on track deleted (fromLocal): " + track, new Object[0]);
            x(j5, track.getStartDate(), track.getEndDate(), track);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackInserted(long j5, Track track, boolean z5) {
        kotlin.jvm.internal.u.j(track, "track");
        if (this.f48489b.i(j5) != null && !z5) {
            u70.i iVar = this.f48504q;
            x70.b.c(this, iVar, "Activity builder : on track inserted (fromLocal): " + track, new Object[0]);
            kj0.d dVar = kj0.d.f76061a;
            DateTime startDate = track.getStartDate();
            DateTime endDate = track.getEndDate();
            dVar.getClass();
            kj0.d.a(j5, startDate, endDate);
            x(j5, track.getStartDate(), track.getEndDate(), track);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackUpdated(long j5, Track oldTrack, Track newTrack, boolean z5) {
        Track track;
        DateTime startDate;
        DateTime endDate;
        kotlin.jvm.internal.u.j(oldTrack, "oldTrack");
        kotlin.jvm.internal.u.j(newTrack, "newTrack");
        if (this.f48489b.i(j5) != null && !z5) {
            x70.b.c(this, this.f48504q, "Activity builder : on track Updated (fromLocal): " + newTrack, new Object[0]);
            if (!kotlin.jvm.internal.u.e(newTrack.getStartDate(), oldTrack.getStartDate()) || !kotlin.jvm.internal.u.e(newTrack.getEndDate(), oldTrack.getEndDate())) {
                kj0.d dVar = kj0.d.f76061a;
                long userId = oldTrack.getUserId();
                DateTime startDate2 = newTrack.getStartDate();
                DateTime endDate2 = newTrack.getEndDate();
                dVar.getClass();
                kj0.d.a(userId, startDate2, endDate2);
            }
            if (oldTrack.getStartDate().isBefore(newTrack.getStartDate())) {
                track = oldTrack;
            } else {
                track = null;
            }
            if (track == null || (startDate = track.getStartDate()) == null) {
                startDate = newTrack.getStartDate();
            }
            DateTime dateTime = startDate;
            if (!oldTrack.getEndDate().isAfter(newTrack.getEndDate())) {
                oldTrack = null;
            }
            if (oldTrack == null || (endDate = oldTrack.getEndDate()) == null) {
                endDate = newTrack.getEndDate();
            }
            x(j5, dateTime, endDate, newTrack);
        }
    }

    public final void u() {
        A();
    }

    @Override // com.withings.wiscale2.activity.model.builder.e.b
    public final DateTimeZone y1(e builder, long j5, DateTime dateTime) {
        kotlin.jvm.internal.u.j(builder, "builder");
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        return t(j5, dateTime);
    }

    @Override // zx.u
    public final void z(long j5, MeasuresGroup measuresGroup, boolean z5) {
        if (measuresGroup.hasMeasureForType(54) && !z5) {
            p(j5, measuresGroup);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutRecognitionBuilder.TimeZoneProvider
    public final DateTimeZone getTimezoneForUserAtDate(WorkoutRecognitionBuilder builder, long j5, DateTime dateTime) {
        kotlin.jvm.internal.u.j(builder, "builder");
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        return t(j5, dateTime);
    }
}
