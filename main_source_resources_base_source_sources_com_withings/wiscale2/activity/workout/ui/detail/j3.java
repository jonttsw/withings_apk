package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import androidx.lifecycle.LiveData;
import com.withings.amazon.model.AmazonPictureInfo;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.domain.uc.ComputeElevation;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.location.repository.ws.GetLocationVasistas;
import com.withings.target.Target;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.v2.model.CoreTemperatureVasistas;
import com.withings.vasistas.v2.repository.VasistasRepository;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import com.withings.webservices.legacy.sync.SerialSyncJob;
import com.withings.wiscale2.activity.workout.model.DistanceSelector;
import com.withings.wiscale2.activity.workout.model.WorkoutHeartRatesLiveData;
import com.withings.wiscale2.activity.workout.model.WorkoutLocationsLiveData;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.model.WorkoutPauseLiveData;
import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import com.withings.wiscale2.activity.workout.model.WorkoutSwimVasistasLiveData;
import com.withings.wiscale2.activity.workout.model.temperature.TemperatureData;
import com.withings.wiscale2.activity.workout.model.temperature.TemperatureZoneKt;
import com.withings.wiscale2.activity.workout.model.temperature.WorkoutTemperatureGraphData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import va0.d;
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class j3 extends androidx.lifecycle.g1 {
    private final j4 A;
    private final androidx.lifecycle.j0 B;
    private final androidx.lifecycle.j0 F;
    private final androidx.lifecycle.j0 G;
    private final androidx.lifecycle.j0 M;
    private final androidx.lifecycle.j0 P;
    private final androidx.lifecycle.f Q;
    private final androidx.lifecycle.j0 R;
    private final androidx.lifecycle.j0 S;
    private final androidx.lifecycle.f T;
    private final androidx.lifecycle.j0 W;
    private final t6 X;
    private final androidx.lifecycle.j0 Y;
    private final androidx.lifecycle.k0<xw.c<Boolean>> Z;

    /* renamed from: a  reason: collision with root package name */
    private final User f49250a;

    /* renamed from: b  reason: collision with root package name */
    private final va0.d f49251b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f49252c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkoutManager f49253d;

    /* renamed from: e  reason: collision with root package name */
    private final GetLocationVasistas f49254e;

    /* renamed from: f  reason: collision with root package name */
    private final HasEnoughGpsLocations f49255f;

    /* renamed from: g  reason: collision with root package name */
    private final ComputePace f49256g;

    /* renamed from: h  reason: collision with root package name */
    private final ComputeSpeed f49257h;

    /* renamed from: i  reason: collision with root package name */
    private final ComputeSplits f49258i;

    /* renamed from: j  reason: collision with root package name */
    private final jm.a f49259j;

    /* renamed from: k  reason: collision with root package name */
    private final fy.l f49260k;

    /* renamed from: l  reason: collision with root package name */
    private final VasistasRepository f49261l;

    /* renamed from: l0  reason: collision with root package name */
    private final androidx.lifecycle.k0<xw.c<nm0.y>> f49262l0;

    /* renamed from: m  reason: collision with root package name */
    private final cb0.a f49263m;

    /* renamed from: n  reason: collision with root package name */
    private final fl.i f49264n;

    /* renamed from: o  reason: collision with root package name */
    private final ComputeElevation f49265o;

    /* renamed from: p  reason: collision with root package name */
    private final t00.d f49266p;

    /* renamed from: q  reason: collision with root package name */
    private final lj0.k f49267q;

    /* renamed from: r  reason: collision with root package name */
    private final l70.u f49268r;

    /* renamed from: s  reason: collision with root package name */
    private final LiveData<Track> f49269s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.k0 f49270t;

    /* renamed from: u  reason: collision with root package name */
    private final xw.p f49271u;

    /* renamed from: v  reason: collision with root package name */
    private final WorkoutPauseLiveData f49272v;

    /* renamed from: w  reason: collision with root package name */
    private final xw.p f49273w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f49274x;

    /* renamed from: y  reason: collision with root package name */
    private ab0.q f49275y;

    /* renamed from: z  reason: collision with root package name */
    private final bb0.y0 f49276z;

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Track, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f49277a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final String invoke(Track track) {
            Track track2 = track;
            if (track2 != null) {
                return track2.getNote();
            }
            return null;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Track, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Track track) {
            Track workout = track;
            kotlin.jvm.internal.u.j(workout, "workout");
            j3.R0(j3.this, workout);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<xw.p<Track, WorkoutCategory, nm0.j<? extends Track, ? extends WorkoutCategory>>, Track, WorkoutCategory, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f49279a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(xw.p<Track, WorkoutCategory, nm0.j<? extends Track, ? extends WorkoutCategory>> pVar, Track track, WorkoutCategory workoutCategory) {
            xw.p<Track, WorkoutCategory, nm0.j<? extends Track, ? extends WorkoutCategory>> liveData = pVar;
            Track track2 = track;
            WorkoutCategory workoutCategory2 = workoutCategory;
            kotlin.jvm.internal.u.j(liveData, "liveData");
            kotlin.jvm.internal.u.j(workoutCategory2, "workoutCategory");
            if (track2 != null) {
                liveData.setValue(new nm0.j(track2, workoutCategory2));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.p<WorkoutLocationsLiveData, Track, nm0.y> {
        d() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(WorkoutLocationsLiveData workoutLocationsLiveData, Track track) {
            Track workout = track;
            kotlin.jvm.internal.u.j(workoutLocationsLiveData, "<anonymous parameter 0>");
            kotlin.jvm.internal.u.j(workout, "workout");
            j3.O0(j3.this, workout);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.q<xw.p<nm0.j<? extends Track, ? extends WorkoutCategory>, List<? extends GpsLocation>, nm0.o<? extends Track, ? extends WorkoutCategory, ? extends List<? extends GpsLocation>>>, nm0.j<? extends Track, ? extends WorkoutCategory>, List<? extends GpsLocation>, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f49281a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(xw.p<nm0.j<? extends Track, ? extends WorkoutCategory>, List<? extends GpsLocation>, nm0.o<? extends Track, ? extends WorkoutCategory, ? extends List<? extends GpsLocation>>> pVar, nm0.j<? extends Track, ? extends WorkoutCategory> jVar, List<? extends GpsLocation> list) {
            xw.p<nm0.j<? extends Track, ? extends WorkoutCategory>, List<? extends GpsLocation>, nm0.o<? extends Track, ? extends WorkoutCategory, ? extends List<? extends GpsLocation>>> liveData = pVar;
            nm0.j<? extends Track, ? extends WorkoutCategory> jVar2 = jVar;
            kotlin.jvm.internal.u.j(liveData, "liveData");
            liveData.setValue(new nm0.o(jVar2.a(), jVar2.b(), list));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.p<WorkoutHeartRatesLiveData, Track, nm0.y> {
        f() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(WorkoutHeartRatesLiveData workoutHeartRatesLiveData, Track track) {
            Track workout = track;
            kotlin.jvm.internal.u.j(workoutHeartRatesLiveData, "<anonymous parameter 0>");
            kotlin.jvm.internal.u.j(workout, "workout");
            j3.M0(j3.this, workout);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.q<xw.p<Track, List<? extends Vasistas>, nm0.j<? extends Track, ? extends List<? extends Vasistas>>>, Track, List<? extends Vasistas>, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f49283a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(xw.p<Track, List<? extends Vasistas>, nm0.j<? extends Track, ? extends List<? extends Vasistas>>> pVar, Track track, List<? extends Vasistas> list) {
            xw.p<Track, List<? extends Vasistas>, nm0.j<? extends Track, ? extends List<? extends Vasistas>>> liveData = pVar;
            Track track2 = track;
            List<? extends Vasistas> list2 = list;
            kotlin.jvm.internal.u.j(liveData, "liveData");
            if (track2 != null) {
                liveData.setValue(new nm0.j(track2, list2));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<ab0.i, LiveData<List<ab0.n>>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f49285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11) {
            super(1);
            this.f49285b = i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
        @Override // ym0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.lifecycle.LiveData<java.util.List<ab0.n>> invoke(ab0.i r12) {
            /*
                r11 = this;
                ab0.i r12 = (ab0.i) r12
                r0 = 0
                if (r12 == 0) goto Le
                ab0.h r12 = r12.a()
                if (r12 == 0) goto Le
                java.util.List<rs.e> r12 = r12.f66439a
                goto Lf
            Le:
                r12 = r0
            Lf:
                if (r12 == 0) goto L4d
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.Iterator r12 = r12.iterator()
                boolean r1 = r12.hasNext()
                if (r1 != 0) goto L1f
                r1 = r0
                goto L46
            L1f:
                java.lang.Object r1 = r12.next()
                boolean r2 = r12.hasNext()
                if (r2 != 0) goto L2a
                goto L46
            L2a:
                r2 = r1
                rs.e r2 = (rs.e) r2
                float r2 = r2.f95617b
            L2f:
                java.lang.Object r3 = r12.next()
                r4 = r3
                rs.e r4 = (rs.e) r4
                float r4 = r4.f95617b
                int r5 = java.lang.Float.compare(r2, r4)
                if (r5 >= 0) goto L40
                r1 = r3
                r2 = r4
            L40:
                boolean r3 = r12.hasNext()
                if (r3 != 0) goto L2f
            L46:
                rs.e r1 = (rs.e) r1
                if (r1 == 0) goto L4d
                java.lang.Object r12 = r1.f95625j
                goto L4e
            L4d:
                r12 = r0
            L4e:
                boolean r1 = r12 instanceof java.util.List
                if (r1 == 0) goto L55
                java.util.List r12 = (java.util.List) r12
                goto L56
            L55:
                r12 = r0
            L56:
                if (r12 == 0) goto L5d
                java.lang.Object r12 = kotlin.collections.x.K(r12)
                goto L5e
            L5d:
                r12 = r0
            L5e:
                boolean r1 = r12 instanceof ab0.f
                if (r1 == 0) goto L65
                r0 = r12
                ab0.f r0 = (ab0.f) r0
            L65:
                if (r0 == 0) goto L6e
                float r12 = r0.c()
                double r0 = (double) r12
            L6c:
                r4 = r0
                goto L71
            L6e:
                r0 = 0
                goto L6c
            L71:
                com.withings.wiscale2.activity.workout.ui.detail.j3 r12 = com.withings.wiscale2.activity.workout.ui.detail.j3.this
                jm.a r2 = com.withings.wiscale2.activity.workout.ui.detail.j3.y0(r12)
                r7 = 0
                r8 = 60
                r3 = 72
                r6 = 0
                android.text.SpannableStringBuilder r0 = jm.a.c(r2, r3, r4, r6, r7, r8)
                java.lang.String r10 = r0.toString()
                android.content.Context r1 = com.withings.wiscale2.activity.workout.ui.detail.j3.f0(r12)
                xw.p r3 = com.withings.wiscale2.activity.workout.ui.detail.j3.G0(r12)
                com.withings.wiscale2.activity.workout.model.WorkoutPauseLiveData r4 = com.withings.wiscale2.activity.workout.ui.detail.j3.z0(r12)
                com.withings.location.domain.uc.HasEnoughGpsLocations r5 = com.withings.wiscale2.activity.workout.ui.detail.j3.t0(r12)
                com.withings.location.domain.uc.ComputePace r6 = com.withings.wiscale2.activity.workout.ui.detail.j3.i0(r12)
                com.withings.location.domain.uc.ComputeSpeed r7 = com.withings.wiscale2.activity.workout.ui.detail.j3.j0(r12)
                com.withings.location.domain.uc.ComputeElevation r8 = com.withings.wiscale2.activity.workout.ui.detail.j3.g0(r12)
                com.withings.location.domain.uc.ComputeSplits r9 = com.withings.wiscale2.activity.workout.ui.detail.j3.k0(r12)
                int r2 = r11.f49285b
                androidx.lifecycle.j0 r12 = ab0.z.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.detail.j3.h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$8$1", f = "WorkoutDetailViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.s<List<? extends CoreTemperatureVasistas>, List<? extends Vasistas>, Target, q4, qm0.d<? super WorkoutTemperatureGraphData>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f49286a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f49287b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Target f49288c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ q4 f49289d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ WorkoutCategory f49291f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Track f49292g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(WorkoutCategory workoutCategory, Track track, qm0.d<? super i> dVar) {
            super(5, dVar);
            this.f49291f = workoutCategory;
            this.f49292g = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f49286a;
            List list2 = this.f49287b;
            Target target = this.f49288c;
            q4 q4Var = this.f49289d;
            j3 j3Var = j3.this;
            double a11 = z3.a(j3Var.f49268r, (float) target.getAsDouble());
            if (!list.isEmpty()) {
                List<rs.e> mainDatumList = q4Var.a().f66439a;
                kotlin.jvm.internal.u.i(mainDatumList, "mainDatumList");
                if (!mainDatumList.isEmpty()) {
                    String[] features = this.f49291f.getFeatures();
                    kotlin.jvm.internal.u.i(features, "getFeatures(...)");
                    if (kotlin.collections.l.m(features, ConstantsWs.SUBCATEGORY_FEATURE_BODY_TEMPERATURE)) {
                        DateTime startDate = ((CoreTemperatureVasistas) list.get(0)).getStartDate();
                        j3Var.f49263m.getClass();
                        return new WorkoutTemperatureGraphData(list, list2, startDate, this.f49292g, TemperatureZoneKt.getWarningZone(cb0.a.a(), j3Var.f49268r, a11), a11);
                    }
                }
            }
            return null;
        }

        @Override // ym0.s
        public final Object k(List<? extends CoreTemperatureVasistas> list, List<? extends Vasistas> list2, Target target, q4 q4Var, qm0.d<? super WorkoutTemperatureGraphData> dVar) {
            i iVar = new i(this.f49291f, this.f49292g, dVar);
            iVar.f49286a = list;
            iVar.f49287b = list2;
            iVar.f49288c = target;
            iVar.f49289d = q4Var;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$9", f = "WorkoutDetailViewModel.kt", l = {443}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<Track, qm0.d<? super List<? extends com.withings.common.compose.component.u1>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49293a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f49294b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Flow<List<CoreTemperatureVasistas>> f49295c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j3 f49296d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TargetRepository f49297e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f49298f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WorkoutDetailViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$9$1$1", f = "WorkoutDetailViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends CoreTemperatureVasistas>, List<? extends Vasistas>, Target, qm0.d<? super List<? extends com.withings.common.compose.component.u1>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ List f49299a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ List f49300b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Target f49301c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Context f49302d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ j3 f49303e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, j3 j3Var, qm0.d<? super a> dVar) {
                super(4, dVar);
                this.f49302d = context;
                this.f49303e = j3Var;
            }

            @Override // ym0.r
            public final Object invoke(List<? extends CoreTemperatureVasistas> list, List<? extends Vasistas> list2, Target target, qm0.d<? super List<? extends com.withings.common.compose.component.u1>> dVar) {
                a aVar = new a(this.f49302d, this.f49303e, dVar);
                aVar.f49299a = list;
                aVar.f49300b = list2;
                aVar.f49301c = target;
                return aVar.invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                List list = this.f49300b;
                Target target = this.f49301c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : this.f49299a) {
                    CoreTemperatureVasistas coreTemperatureVasistas = (CoreTemperatureVasistas) obj2;
                    List<Vasistas> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (Vasistas vasistas : list2) {
                            int minuteOfDay = vasistas.getStartDate().getMinuteOfDay();
                            int durationMillis = (vasistas.getDurationMillis() / DateTimeConstants.MILLIS_PER_MINUTE) + vasistas.getStartDate().getMinuteOfDay();
                            int minuteOfDay2 = coreTemperatureVasistas.getStartDate().getMinuteOfDay();
                            if (minuteOfDay > minuteOfDay2 || minuteOfDay2 > durationMillis) {
                            }
                        }
                    }
                    arrayList.add(obj2);
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CoreTemperatureVasistas coreTemperatureVasistas2 = (CoreTemperatureVasistas) it.next();
                    arrayList2.add(new TemperatureData(coreTemperatureVasistas2.getDuration(), coreTemperatureVasistas2.getCoreTemperatureInCelsius()));
                }
                if (!arrayList2.isEmpty()) {
                    j3 j3Var = this.f49303e;
                    za0.g gVar = new za0.g(this.f49302d, j3Var.f49268r);
                    j3Var.f49263m.getClass();
                    return gVar.c(cb0.a.a(), arrayList2, z3.a(j3Var.f49268r, (float) target.getAsDouble()));
                }
                return kotlin.collections.i0.f76187a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Flow<? extends List<CoreTemperatureVasistas>> flow, j3 j3Var, TargetRepository targetRepository, Context context, qm0.d<? super j> dVar) {
            super(2, dVar);
            this.f49295c = flow;
            this.f49296d = j3Var;
            this.f49297e = targetRepository;
            this.f49298f = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            j jVar = new j(this.f49295c, this.f49296d, this.f49297e, this.f49298f, dVar);
            jVar.f49294b = obj;
            return jVar;
        }

        @Override // ym0.p
        public final Object invoke(Track track, qm0.d<? super List<? extends com.withings.common.compose.component.u1>> dVar) {
            return ((j) create(track, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49293a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Track track = (Track) this.f49294b;
                if (track != null) {
                    j3 j3Var = this.f49296d;
                    Flow a11 = androidx.lifecycle.q.a(j3Var.f49272v);
                    long q11 = j3Var.f49250a.q();
                    DateTime minus = track.getStartDate().withTimeAtStartOfDay().plusDays(1).minus(1L);
                    kotlin.jvm.internal.u.i(minus, "minus(...)");
                    Flow combine = FlowKt.combine(this.f49295c, a11, this.f49297e.getTemperatureTargetOrDefaultFlow(q11, minus), new a(this.f49298f, j3Var, null));
                    this.f49293a = 1;
                    obj = FlowKt.first(combine, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return kotlin.collections.i0.f76187a;
            }
            List list = (List) obj;
            if (list != null) {
                return list;
            }
            return kotlin.collections.i0.f76187a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f49305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Track track) {
            super(0);
            this.f49305b = track;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            WorkoutManager workoutManager = j3.this.f49253d;
            Track track = this.f49305b;
            workoutManager.delete(track.getUserId(), track);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$distanceUnit$1", f = "WorkoutDetailViewModel.kt", l = {ConstantsWs.WS_STATUS_USERCREATEERROR}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Integer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l70.w f49307b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(l70.w wVar, qm0.d<? super l> dVar) {
            super(2, dVar);
            this.f49307b = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new l(this.f49307b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Integer> dVar) {
            return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49306a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f49306a = 1;
                obj = ah.g.q(this.f49307b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new Integer(((l70.v) obj).b());
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.l<nm0.o<Track, WorkoutCategory, List<GpsLocation>>, Boolean> {
        m() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(nm0.o<Track, WorkoutCategory, List<GpsLocation>> oVar) {
            nm0.o<Track, WorkoutCategory, List<GpsLocation>> oVar2 = oVar;
            Track a11 = oVar2.a();
            return Boolean.valueOf(j3.this.f49255f.forPerformance(oVar2.c(), a11.getStartDate(), a11.getEndDate()));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class n implements Flow<List<? extends CoreTemperatureVasistas>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f49309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j3 f49310b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f49311a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j3 f49312b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$lambda$3$lambda$2$$inlined$map$1$2", f = "WorkoutDetailViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.activity.workout.ui.detail.j3$n$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0672a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f49313a;

                /* renamed from: b  reason: collision with root package name */
                int f49314b;

                public C0672a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f49313a = obj;
                    this.f49314b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, j3 j3Var) {
                this.f49311a = flowCollector;
                this.f49312b = j3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, qm0.d r15) {
                /*
                    r13 = this;
                    boolean r0 = r15 instanceof com.withings.wiscale2.activity.workout.ui.detail.j3.n.a.C0672a
                    if (r0 == 0) goto L13
                    r0 = r15
                    com.withings.wiscale2.activity.workout.ui.detail.j3$n$a$a r0 = (com.withings.wiscale2.activity.workout.ui.detail.j3.n.a.C0672a) r0
                    int r1 = r0.f49314b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f49314b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.activity.workout.ui.detail.j3$n$a$a r0 = new com.withings.wiscale2.activity.workout.ui.detail.j3$n$a$a
                    r0.<init>(r15)
                L18:
                    java.lang.Object r15 = r0.f49313a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f49314b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r15)
                    goto L7b
                L27:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r15)
                    throw r14
                L2f:
                    nm0.l.b(r15)
                    java.util.List r14 = (java.util.List) r14
                    java.lang.Iterable r14 = (java.lang.Iterable) r14
                    java.util.ArrayList r15 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.x.y(r14, r2)
                    r15.<init>(r2)
                    java.util.Iterator r14 = r14.iterator()
                L45:
                    boolean r2 = r14.hasNext()
                    if (r2 == 0) goto L70
                    java.lang.Object r2 = r14.next()
                    r4 = r2
                    com.withings.vasistas.v2.model.CoreTemperatureVasistas r4 = (com.withings.vasistas.v2.model.CoreTemperatureVasistas) r4
                    com.withings.wiscale2.activity.workout.ui.detail.j3 r2 = r13.f49312b
                    l70.u r2 = com.withings.wiscale2.activity.workout.ui.detail.j3.A0(r2)
                    float r5 = r4.getCoreTemperatureInCelsius()
                    float r10 = com.withings.wiscale2.activity.workout.ui.detail.z3.a(r2, r5)
                    r11 = 15
                    r12 = 0
                    r5 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    com.withings.vasistas.v2.model.CoreTemperatureVasistas r2 = com.withings.vasistas.v2.model.CoreTemperatureVasistas.copy$default(r4, r5, r7, r8, r9, r10, r11, r12)
                    r15.add(r2)
                    goto L45
                L70:
                    r0.f49314b = r3
                    kotlinx.coroutines.flow.FlowCollector r14 = r13.f49311a
                    java.lang.Object r14 = r14.emit(r15, r0)
                    if (r14 != r1) goto L7b
                    return r1
                L7b:
                    nm0.y r14 = nm0.y.f85009a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.detail.j3.n.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public n(Flow flow, j3 j3Var) {
            this.f49309a = flow;
            this.f49310b = j3Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends CoreTemperatureVasistas>> flowCollector, qm0.d dVar) {
            Object collect = this.f49309a.collect(new a(flowCollector, this.f49310b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class o implements d.a {
        o() {
        }

        @Override // va0.d.a
        public final void M(Uri uri) {
            j3 j3Var = j3.this;
            j3Var.U0(uri);
            j3Var.Y0().setValue(new xw.c<>(nm0.y.f85009a));
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f49317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Track track) {
            super(0);
            this.f49317a = track;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            Track it = this.f49317a;
            kotlin.jvm.internal.u.i(it, "$it");
            WorkoutSaver.save(it);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$special$$inlined$flatMapLatest$1", f = "WorkoutDetailViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super List<? extends CoreTemperatureVasistas>>, Track, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49318a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f49319b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f49320c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j3 f49321d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(qm0.d dVar, j3 j3Var) {
            super(3, dVar);
            this.f49321d = j3Var;
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super List<? extends CoreTemperatureVasistas>> flowCollector, Track track, qm0.d<? super nm0.y> dVar) {
            q qVar = new q(dVar, this.f49321d);
            qVar.f49319b = flowCollector;
            qVar.f49320c = track;
            return qVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Flow flowOf;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49318a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f49319b;
                Track track = (Track) this.f49320c;
                if (track != null) {
                    j3 j3Var = this.f49321d;
                    flowOf = new n(j3Var.f49261l.get(CoreTemperatureVasistas.class, j3Var.f49250a.q(), track.getStartDate(), track.getEndDate()), j3Var);
                } else {
                    flowOf = FlowKt.flowOf(kotlin.collections.i0.f76187a);
                }
                this.f49318a = 1;
                if (FlowKt.emitAll(flowCollector, flowOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$special$$inlined$flatMapLatest$2", f = "WorkoutDetailViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super WorkoutTemperatureGraphData>, nm0.j<? extends Track, ? extends WorkoutCategory>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49322a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f49323b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f49324c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Flow f49325d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j3 f49326e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TargetRepository f49327f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(qm0.d dVar, Flow flow, j3 j3Var, TargetRepository targetRepository) {
            super(3, dVar);
            this.f49325d = flow;
            this.f49326e = j3Var;
            this.f49327f = targetRepository;
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super WorkoutTemperatureGraphData> flowCollector, nm0.j<? extends Track, ? extends WorkoutCategory> jVar, qm0.d<? super nm0.y> dVar) {
            r rVar = new r(dVar, this.f49325d, this.f49326e, this.f49327f);
            rVar.f49323b = flowCollector;
            rVar.f49324c = jVar;
            return rVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49322a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f49323b;
                nm0.j jVar = (nm0.j) this.f49324c;
                Track track = (Track) jVar.a();
                j3 j3Var = this.f49326e;
                Flow a11 = androidx.lifecycle.q.a(j3Var.f49272v);
                long q11 = j3Var.f49250a.q();
                DateTime minus = track.getStartDate().withTimeAtStartOfDay().plusDays(1).minus(1L);
                kotlin.jvm.internal.u.i(minus, "minus(...)");
                Flow combine = FlowKt.combine(this.f49325d, a11, this.f49327f.getTemperatureTargetOrDefaultFlow(q11, minus), androidx.lifecycle.q.a(j3Var.g1()), new i((WorkoutCategory) jVar.b(), track, null));
                this.f49322a = 1;
                if (FlowKt.emitAll(flowCollector, combine, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class s extends kotlin.jvm.internal.w implements ym0.p<WorkoutSwimVasistasLiveData, Track, nm0.y> {
        s() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(WorkoutSwimVasistasLiveData workoutSwimVasistasLiveData, Track track) {
            Track workout = track;
            kotlin.jvm.internal.u.j(workoutSwimVasistasLiveData, "<anonymous parameter 0>");
            kotlin.jvm.internal.u.j(workout, "workout");
            j3.T0(j3.this, workout);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutDetailViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f49329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Track track) {
            super(0);
            this.f49329a = track;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            WorkoutSaver.save(this.f49329a);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, ka0.c] */
    public j3(User user, long j5, WorkoutCategory workoutCategory, PowerManager powerManager, va0.d dVar, Context context, Context context2, WorkoutManager workoutManager, GetLocationVasistas getLocationVasistas, HasEnoughGpsLocations hasEnoughGpsLocations, ComputePace computePace, ComputeSpeed computeSpeed, ComputeSplits computeSplits, jm.a aVar, fy.l lVar, VasistasRepository vasistasRepository, cb0.a aVar2, fl.i deviceModelRepository, ComputeElevation computeElevation, t00.d networkSyncManager, lj0.k kVar, l70.w unitPreferencesRepository, kn.e deviceManager, WorkoutCategoryManager workoutCategoryManager, GpsLocationRepository gpsLocationRepository, lj0.h0 vasistasManager, TargetRepository targetRepository, fl.p pVar, nj0.a aVar3, iy.e measuresGroupRepositoryV2) {
        Object runBlocking$default;
        LiveData a11;
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        kotlin.jvm.internal.u.j(hasEnoughGpsLocations, "hasEnoughGpsLocations");
        kotlin.jvm.internal.u.j(computePace, "computePace");
        kotlin.jvm.internal.u.j(computeSpeed, "computeSpeed");
        kotlin.jvm.internal.u.j(computeSplits, "computeSplits");
        kotlin.jvm.internal.u.j(vasistasRepository, "vasistasRepository");
        kotlin.jvm.internal.u.j(deviceModelRepository, "deviceModelRepository");
        kotlin.jvm.internal.u.j(computeElevation, "computeElevation");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(workoutCategoryManager, "workoutCategoryManager");
        kotlin.jvm.internal.u.j(gpsLocationRepository, "gpsLocationRepository");
        kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        this.f49250a = user;
        this.f49251b = dVar;
        this.f49252c = context2;
        this.f49253d = workoutManager;
        this.f49254e = getLocationVasistas;
        this.f49255f = hasEnoughGpsLocations;
        this.f49256g = computePace;
        this.f49257h = computeSpeed;
        this.f49258i = computeSplits;
        this.f49259j = aVar;
        this.f49260k = lVar;
        this.f49261l = vasistasRepository;
        this.f49263m = aVar2;
        this.f49264n = deviceModelRepository;
        this.f49265o = computeElevation;
        this.f49266p = networkSyncManager;
        this.f49267q = kVar;
        lj0.w wVar = lj0.w.f79924c;
        if (wVar != null) {
            this.f49268r = aVar.g(71);
            LiveData<Track> liveWorkoutById = workoutManager.getLiveWorkoutById(j5);
            this.f49269s = liveWorkoutById;
            androidx.lifecycle.k0<Boolean> b10 = xw.d.b(Boolean.valueOf(androidx.core.content.a.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION") == 0 && !(Build.VERSION.SDK_INT >= 29 && androidx.core.content.a.checkSelfPermission(context2, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0)));
            this.f49274x = b10;
            this.Z = new androidx.lifecycle.k0<>();
            this.f49262l0 = new androidx.lifecycle.k0<>();
            androidx.lifecycle.k0 a12 = workoutCategory != null ? xw.d.a(workoutCategory) : androidx.lifecycle.e1.c(liveWorkoutById, new l3(workoutCategoryManager));
            this.f49270t = a12;
            WorkoutPauseLiveData workoutPauseLiveData = new WorkoutPauseLiveData(androidx.lifecycle.h1.a(this), vasistasManager, user.q(), liveWorkoutById, new b());
            this.f49272v = workoutPauseLiveData;
            xw.p pVar2 = new xw.p(liveWorkoutById, a12, c.f49279a);
            this.f49271u = pVar2;
            WorkoutLocationsLiveData workoutLocationsLiveData = new WorkoutLocationsLiveData(gpsLocationRepository, user.q(), pVar2, workoutPauseLiveData, new d());
            xw.p pVar3 = new xw.p(pVar2, workoutLocationsLiveData, e.f49281a);
            this.f49273w = pVar3;
            androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(liveWorkoutById, new p3(pVar, this, deviceManager));
            WorkoutHeartRatesLiveData workoutHeartRatesLiveData = new WorkoutHeartRatesLiveData(vasistasManager, user.q(), pVar2, workoutPauseLiveData, new f());
            xw.p pVar4 = new xw.p(liveWorkoutById, workoutHeartRatesLiveData, g.f49283a);
            androidx.lifecycle.j0 c12 = androidx.lifecycle.e1.c(pVar2, new s3(aVar3));
            androidx.lifecycle.j0 c13 = androidx.lifecycle.e1.c(pVar2, new u3(aVar3));
            androidx.lifecycle.j0 c14 = androidx.lifecycle.e1.c(pVar4, new w3(this));
            this.A = new j4(context2, liveWorkoutById, a12, workoutLocationsLiveData, hasEnoughGpsLocations);
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new l(unitPreferencesRepository, null), 1, null);
            int intValue = ((Number) runBlocking$default).intValue();
            bb0.m mVar = new bb0.m(context);
            ab0.q qVar = new ab0.q(context, intValue, computePace, hasEnoughGpsLocations, aVar, mVar);
            this.f49275y = qVar;
            bb0.h hVar = new bb0.h(context);
            this.f49276z = new bb0.y0(context, user.q(), new bb0.k(context), new bb0.j(context2, hVar), new DistanceSelector(), hVar, mVar, new Object(), qVar, pVar2, new WorkoutSwimVasistasLiveData(wVar, liveWorkoutById, workoutPauseLiveData, new s()), workoutPauseLiveData);
            this.B = xa0.d.a(context2, intValue, pVar2, computePace, computeSpeed);
            androidx.lifecycle.j0 c15 = androidx.lifecycle.e1.c(workoutPauseLiveData, new o3(this));
            this.F = c15;
            this.G = androidx.lifecycle.e1.c(c15, new h(intValue));
            this.M = ab0.z.a(intValue, liveWorkoutById, workoutLocationsLiveData, a12, workoutPauseLiveData, computeSplits);
            this.P = androidx.lifecycle.e1.c(workoutPauseLiveData, new v4(pVar4, context, user));
            Flow transformLatest = FlowKt.transformLatest(androidx.lifecycle.q.a(liveWorkoutById), new q(null, this));
            this.Q = androidx.lifecycle.q.b(FlowKt.transformLatest(androidx.lifecycle.q.a(pVar2), new r(null, transformLatest, this, targetRepository)), null, 3);
            this.R = androidx.lifecycle.e1.b(liveWorkoutById, new t4(aVar));
            this.S = androidx.lifecycle.e1.c(liveWorkoutById, new x4(context));
            this.T = androidx.lifecycle.q.b(FlowKt.mapLatest(androidx.lifecycle.q.a(liveWorkoutById), new j(transformLatest, this, targetRepository, context, null)), null, 3);
            this.W = androidx.lifecycle.e1.b(liveWorkoutById, a7.f49116a);
            androidx.lifecycle.j0 b11 = androidx.lifecycle.e1.b(pVar3, new m());
            SharedPreferences sharedPreferences = context2.getSharedPreferences("withings-library-temp", 0);
            kotlin.jvm.internal.u.i(sharedPreferences, "getSharedPreferences(...)");
            v7 v7Var = new v7(liveWorkoutById, sharedPreferences);
            LiveData[] liveDataArr = new LiveData[7];
            liveDataArr[0] = androidx.lifecycle.e1.c(pVar2, new c6(targetRepository, user.q(), workoutManager, context));
            liveDataArr[1] = androidx.lifecycle.e1.b(new xw.o(liveWorkoutById, workoutHeartRatesLiveData, v7Var, i6.f49242a), new j6(context, pVar));
            liveDataArr[2] = androidx.lifecycle.e1.c(pVar3, new e6(hasEnoughGpsLocations, c11, context));
            liveDataArr[3] = androidx.lifecycle.e1.c(a12, new h6(b10, c11, context));
            if (powerManager.isPowerSaveMode()) {
                a11 = androidx.lifecycle.e1.b(b11, new a6(context));
            } else {
                a11 = xw.d.a(null);
            }
            liveDataArr[4] = a11;
            liveDataArr[5] = androidx.lifecycle.e1.c(c12, new o6(c14, context, measuresGroupRepositoryV2, user));
            liveDataArr[6] = androidx.lifecycle.e1.c(liveWorkoutById, new m6(c13, c14, context));
            this.X = new t6(kotlin.collections.x.W(liveDataArr));
            this.Y = androidx.lifecycle.e1.b(liveWorkoutById, a.f49277a);
            return;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    public static final void M0(j3 j3Var, Track track) {
        j3Var.f49266p.d(j3Var.f49267q.a(j3Var.f49250a.q(), Vasistas.Category.BODY, track.getStartDate(), track.getEndDate()), "workout_on_no_heart_rate_vasistas", null);
    }

    public static final void O0(j3 j3Var, Track track) {
        j3Var.getClass();
        j3Var.f49266p.d(new ActionSyncJob(new x3(j3Var, track)), "getFromWorkoutView", null);
    }

    public static final void R0(j3 j3Var, Track track) {
        j3Var.f49266p.d(j3Var.f49267q.a(j3Var.f49250a.q(), Vasistas.Category.PAUSE, track.getStartDate(), track.getEndDate()), "workout_on_no_pause_vasistas", null);
    }

    public static final void T0(j3 j3Var, Track track) {
        j3Var.getClass();
        j3Var.f49266p.d(new SerialSyncJob(j3Var.f49267q.a(track.getUserId(), Vasistas.Category.BODY, track.getStartDate(), track.getEndDate()), j3Var.f49267q.a(track.getUserId(), Vasistas.Category.PAUSE, track.getStartDate(), track.getEndDate()), j3Var.f49267q.a(track.getUserId(), Vasistas.Category.SWIM, track.getStartDate(), track.getEndDate())), "workout_on_no_swim_vasistas", null);
    }

    public final void A1(String note) {
        kotlin.jvm.internal.u.j(note, "note");
        if (!kotlin.jvm.internal.u.e(note, this.Y.getValue())) {
            x70.b.b(this, "note changed : ".concat(note), new Object[0]);
            Track value = this.f49269s.getValue();
            if (value != null) {
                value.setNote(note);
                DateTime now = DateTime.now();
                kotlin.jvm.internal.u.i(now, "now(...)");
                value.setModifiedDate(now);
                value.setSyncedToWs(false);
                int i11 = vh.h.f103738e;
                vh.h.d(new p(value));
            }
        }
    }

    public final void C1(w0 photoItem) {
        kotlin.jvm.internal.u.j(photoItem, "photoItem");
        Track value = this.f49269s.getValue();
        if (value == null) {
            return;
        }
        Object b10 = photoItem.b();
        if (ah.c0.c(value, b10)) {
            value.setCoverPictureUrl(null);
            value.setCoverPictureUri(null);
        } else if (b10 instanceof AmazonPictureInfo) {
            value.setCoverPictureUrl(((AmazonPictureInfo) b10).b().b());
            value.setCoverPictureUri(null);
        } else if (b10 instanceof String) {
            value.setCoverPictureUrl(null);
            value.setCoverPictureUri((String) b10);
        }
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        value.setModifiedDate(now);
        value.setSyncedToWs(false);
        int i11 = vh.h.f103738e;
        vh.h.d(new t(value));
    }

    public final void U0(Uri uri) {
        Track value = this.f49269s.getValue();
        if (value != null) {
            TrackKt.addPhoto(value, uri);
        }
        dm.a.f63977a.b();
    }

    public final void V0(Integer num) {
        int i11;
        Track value = this.f49269s.getValue();
        if (value != null) {
            value.setDeletionReason(num);
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = -1;
            }
            dm.a.a(Integer.valueOf(i11));
            int i12 = vh.h.f103738e;
            vh.h.d(new k(value));
        }
    }

    public final androidx.lifecycle.k0 W0() {
        return this.f49270t;
    }

    public final androidx.lifecycle.k0<xw.c<Boolean>> X0() {
        return this.Z;
    }

    public final androidx.lifecycle.k0<xw.c<nm0.y>> Y0() {
        return this.f49262l0;
    }

    public final androidx.lifecycle.j0 Z0() {
        return this.F;
    }

    public final androidx.lifecycle.j0 a1() {
        return this.M;
    }

    public final androidx.lifecycle.j0 c1() {
        return this.G;
    }

    public final j4 d1() {
        return this.A;
    }

    public final androidx.lifecycle.j0 e1() {
        return this.R;
    }

    public final androidx.lifecycle.j0 g1() {
        return this.P;
    }

    public final androidx.lifecycle.j0 i1() {
        return this.S;
    }

    public final androidx.lifecycle.j0 k1() {
        return this.Y;
    }

    public final t6 l1() {
        return this.X;
    }

    public final androidx.lifecycle.j0 m1() {
        return this.W;
    }

    public final LiveData<List<xa0.a>> n1() {
        return this.B;
    }

    public final bb0.y0 o1() {
        return this.f49276z;
    }

    public final androidx.lifecycle.f q1() {
        return this.Q;
    }

    public final androidx.lifecycle.f r1() {
        return this.T;
    }

    public final xw.p s1() {
        return this.f49271u;
    }

    public final void t1(int i11, int i12, Intent intent) {
        if (i11 == 1717) {
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 29) {
                arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            boolean z5 = false;
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            int length = strArr.length;
            int i13 = 0;
            while (true) {
                if (i13 < length) {
                    if (androidx.core.content.a.checkSelfPermission(this.f49252c, strArr[i13]) != 0) {
                        break;
                    }
                    i13++;
                } else {
                    z5 = true;
                    break;
                }
            }
            this.f49274x.setValue(Boolean.valueOf(z5));
            return;
        }
        this.f49251b.b(i11, i12, intent);
    }

    public final void v1(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        if (i11 == 1717) {
            int length = grantResults.length;
            boolean z5 = false;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (grantResults[i12] != 0) {
                        break;
                    }
                    i12++;
                } else {
                    z5 = true;
                    break;
                }
            }
            this.f49274x.setValue(Boolean.valueOf(z5));
            return;
        }
        this.f49251b.c(i11, permissions, grantResults);
    }

    public final boolean w1() {
        return this.f49264n.d(kotlin.jvm.internal.q0.b(gl.y.class));
    }

    public final void y1() {
        Track value = this.f49269s.getValue();
        if (value != null) {
            if (value.getId() == null) {
                V0(null);
                return;
            }
            int attrib = value.getAttrib();
            androidx.lifecycle.k0<xw.c<Boolean>> k0Var = this.Z;
            if (attrib == 2) {
                k0Var.setValue(new xw.c<>(Boolean.FALSE));
            } else {
                k0Var.setValue(new xw.c<>(Boolean.TRUE));
            }
        }
    }

    public final void z1() {
        this.f49251b.f(new o());
    }
}
