package com.withings.wiscale2.activity.logging.ui;

import android.content.Context;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.camera.core.y1;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import ba0.c;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.core.analytics.LocationStatusInfo;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.DistanceSelector;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.SwimWorkoutData;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
/* compiled from: EditWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class m0 extends g1 {
    private final xw.n<nm0.y> A;
    private final androidx.lifecycle.k0<xw.c<nm0.y>> B;
    private final DateTime F;
    private final DateTime G;
    private ba0.a M;

    /* renamed from: a  reason: collision with root package name */
    private final User f48361a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkoutCategory f48362b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f48363c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f48364d;

    /* renamed from: e  reason: collision with root package name */
    private final m70.i f48365e;

    /* renamed from: f  reason: collision with root package name */
    private final l70.w f48366f;

    /* renamed from: g  reason: collision with root package name */
    private final WorkoutManager f48367g;

    /* renamed from: h  reason: collision with root package name */
    private final WorkoutCategoryManager f48368h;

    /* renamed from: i  reason: collision with root package name */
    private final lj0.h0 f48369i;

    /* renamed from: j  reason: collision with root package name */
    private final ua0.a f48370j;

    /* renamed from: k  reason: collision with root package name */
    private final jm.a f48371k;

    /* renamed from: l  reason: collision with root package name */
    private final ba0.d f48372l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f48373m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f48374n;

    /* renamed from: o  reason: collision with root package name */
    private final u0 f48375o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.lifecycle.j0 f48376p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.j0 f48377q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.k0<xw.c<nm0.y>> f48378r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.k0<xw.c<nm0.y>> f48379s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.k0<xw.c<nm0.y>> f48380t;

    /* renamed from: u  reason: collision with root package name */
    private final xw.m<WorkoutCategory> f48381u;

    /* renamed from: v  reason: collision with root package name */
    private final xw.p<c, Boolean, nm0.j<c, Boolean>> f48382v;

    /* renamed from: w  reason: collision with root package name */
    private final androidx.lifecycle.j0 f48383w;

    /* renamed from: x  reason: collision with root package name */
    private final xw.n<Track> f48384x;

    /* renamed from: y  reason: collision with root package name */
    private final xw.n<Boolean> f48385y;

    /* renamed from: z  reason: collision with root package name */
    private final xw.n<nm0.y> f48386z;

    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$1", f = "EditWorkoutViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48387a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Long f48389c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditWorkoutViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$1$workout$1", f = "EditWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.activity.logging.ui.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0668a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0 f48390a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Long f48391b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0668a(m0 m0Var, Long l5, qm0.d<? super C0668a> dVar) {
                super(2, dVar);
                this.f48390a = m0Var;
                this.f48391b = l5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new C0668a(this.f48390a, this.f48391b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((C0668a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                return this.f48390a.f48367g.getWorkoutById(this.f48391b.longValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Long l5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f48389c = l5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f48389c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            nm0.y yVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48387a;
            m0 m0Var = m0.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0668a c0668a = new C0668a(m0Var, this.f48389c, null);
                this.f48387a = 1;
                obj = BuildersKt.withContext(io2, c0668a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Track track = (Track) obj;
            if (track != null) {
                WorkoutCategory workoutCategory = m0Var.f48362b;
                if (workoutCategory != null) {
                    m0.B0(m0Var, track, workoutCategory);
                    yVar = nm0.y.f85009a;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    m0Var.getClass();
                    BuildersKt__Builders_commonKt.launch$default(h1.a(m0Var), null, null, new p0(m0Var, track, null), 3, null);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final double f48392a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48393b;

        public b(double d11, String formattedCalories) {
            kotlin.jvm.internal.u.j(formattedCalories, "formattedCalories");
            this.f48392a = d11;
            this.f48393b = formattedCalories;
        }

        public final double a() {
            return this.f48392a;
        }

        public final String b() {
            return this.f48393b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Double.compare(this.f48392a, bVar.f48392a) == 0 && kotlin.jvm.internal.u.e(this.f48393b, bVar.f48393b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f48393b.hashCode() + (Double.hashCode(this.f48392a) * 31);
        }

        public final String toString() {
            return "CaloriesValues(caloriesValue=" + this.f48392a + ", formattedCalories=" + this.f48393b + ")";
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f48394a;

        /* renamed from: b  reason: collision with root package name */
        private final int f48395b;

        /* renamed from: c  reason: collision with root package name */
        private final double f48396c;

        /* renamed from: d  reason: collision with root package name */
        private final String f48397d;

        public c(double d11, int i11, int i12, String formattedDistance) {
            kotlin.jvm.internal.u.j(formattedDistance, "formattedDistance");
            this.f48394a = i11;
            this.f48395b = i12;
            this.f48396c = d11;
            this.f48397d = formattedDistance;
        }

        public final int a() {
            return this.f48394a;
        }

        public final double b() {
            return this.f48396c;
        }

        public final int c() {
            return this.f48395b;
        }

        public final String d() {
            return this.f48397d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f48394a == cVar.f48394a && this.f48395b == cVar.f48395b && Double.compare(this.f48396c, cVar.f48396c) == 0 && kotlin.jvm.internal.u.e(this.f48397d, cVar.f48397d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f48397d.hashCode() + androidx.camera.camera2.internal.l0.a(this.f48396c, androidx.appcompat.app.h.a(this.f48395b, Integer.hashCode(this.f48394a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DistanceValues(distanceKmValue=");
            sb2.append(this.f48394a);
            sb2.append(", distanceRemainingMeterValue=");
            sb2.append(this.f48395b);
            sb2.append(", distanceMilesValue=");
            sb2.append(this.f48396c);
            sb2.append(", formattedDistance=");
            return y1.e(sb2, this.f48397d, ")");
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final long f48398a;

        /* renamed from: b  reason: collision with root package name */
        private final long f48399b;

        /* renamed from: c  reason: collision with root package name */
        private final String f48400c;

        /* renamed from: d  reason: collision with root package name */
        private final String f48401d;

        public d(long j5, long j11, String str, String str2) {
            this.f48398a = j5;
            this.f48399b = j11;
            this.f48400c = str;
            this.f48401d = str2;
        }

        public final String a() {
            return this.f48401d;
        }

        public final String b() {
            return this.f48400c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f48398a == dVar.f48398a && this.f48399b == dVar.f48399b && kotlin.jvm.internal.u.e(this.f48400c, dVar.f48400c) && kotlin.jvm.internal.u.e(this.f48401d, dVar.f48401d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f48401d.hashCode() + defpackage.d.c(this.f48400c, androidx.activity.result.c.a(this.f48399b, Long.hashCode(this.f48398a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TimeValues(startDateValue=");
            sb2.append(this.f48398a);
            sb2.append(", endDateValue=");
            sb2.append(this.f48399b);
            sb2.append(", formattedStartDate=");
            sb2.append(this.f48400c);
            sb2.append(", formattedEndDate=");
            return y1.e(sb2, this.f48401d, ")");
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Track, b> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final b invoke(Track track) {
            double d11;
            Track track2 = track;
            Parcelable data = track2.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            int manualCalories = ((WorkoutData) data).getManualCalories();
            Parcelable data2 = track2.getData();
            kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            int calories = ((WorkoutData) data2).getCalories();
            if (manualCalories > 0) {
                d11 = manualCalories;
            } else {
                d11 = calories;
            }
            return new b(d11, m0.this.f48371k.f(d11, 48));
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<Track, d> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final d invoke(Track track) {
            Track track2 = track;
            long millis = track2.getStartDate().getMillis();
            long millis2 = track2.getEndDate().getMillis();
            m0 m0Var = m0.this;
            return new d(millis, millis2, m0.g0(m0Var, m0Var.f48364d, track2.getStartDate()), m0.g0(m0Var, m0Var.f48364d, track2.getEndDate()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$deleteWorkout$1$1", f = "EditWorkoutViewModel.kt", l = {219}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48404a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Track f48406c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditWorkoutViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$deleteWorkout$1$1$1", f = "EditWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0 f48407a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Track f48408b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var, Track track, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f48407a = m0Var;
                this.f48408b = track;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f48407a, this.f48408b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                m0 m0Var = this.f48407a;
                WorkoutManager workoutManager = m0Var.f48367g;
                long q11 = m0Var.f48361a.q();
                Track editedWorkout = this.f48408b;
                kotlin.jvm.internal.u.i(editedWorkout, "$editedWorkout");
                workoutManager.delete(q11, editedWorkout);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Track track, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f48406c = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f48406c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48404a;
            m0 m0Var = m0.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(m0Var, this.f48406c, null);
                this.f48404a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            m0Var.l1().setValue(null);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Track, WorkoutCategory>, c> {
        h() {
            super(1);
        }

        @Override // ym0.l
        public final c invoke(nm0.j<Track, WorkoutCategory> jVar) {
            Long id2;
            nm0.j<Track, WorkoutCategory> jVar2 = jVar;
            kotlin.jvm.internal.u.j(jVar2, "<name for destructuring parameter 0>");
            Track a11 = jVar2.a();
            WorkoutCategory b10 = jVar2.b();
            if (b10.isDistanceRelevant() && ((id2 = a11.getId()) == null || id2.longValue() != 7)) {
                Double select = new DistanceSelector().select(a11, b10);
                m0 m0Var = m0.this;
                if (select != null) {
                    double doubleValue = select.doubleValue();
                    String f11 = m0Var.f48371k.f(doubleValue, 31);
                    int i11 = (int) (doubleValue / 1000.0d);
                    int a12 = an0.a.a(doubleValue - (i11 * 1000.0d));
                    int i12 = k70.e.f75664c;
                    return new c(doubleValue / 1609.344d, i11, a12, f11);
                }
                return new c(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0, 0, m0Var.f48371k.f(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 31));
            }
            return null;
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$isInKm$1", f = "EditWorkoutViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PAUSE}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48410a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f48411b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditWorkoutViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.h0<Boolean> f48413a;

            a(androidx.lifecycle.h0<Boolean> h0Var) {
                this.f48413a = h0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                boolean z5;
                if (((l70.v) obj).b() == 6) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object emit = this.f48413a.emit(Boolean.valueOf(z5), dVar);
                if (emit != CoroutineSingletons.f76214a) {
                    return nm0.y.f85009a;
                }
                return emit;
            }
        }

        i(qm0.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            i iVar = new i(dVar);
            iVar.f48411b = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((i) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48410a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Flow<l70.v> flow = m0.this.f48366f.get();
                a aVar = new a((androidx.lifecycle.h0) this.f48411b);
                this.f48410a = 1;
                if (flow.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EditWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.l<Track, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f48414a = new kotlin.jvm.internal.w(1);

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1.getPoolLengthOrDefault() == 0) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // ym0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Integer invoke(com.withings.wiscale2.track.data.Track r4) {
            /*
                r3 = this;
                com.withings.wiscale2.track.data.Track r4 = (com.withings.wiscale2.track.data.Track) r4
                r0 = 0
                if (r4 == 0) goto L36
                bb0.g r1 = new bb0.g
                r1.<init>(r4)
                boolean r1 = r1.a()
                if (r1 == 0) goto L24
                android.os.Parcelable r1 = r4.getData()
                boolean r2 = r1 instanceof com.withings.workout.workoutdata.SwimWorkoutData
                if (r2 == 0) goto L1b
                com.withings.workout.workoutdata.SwimWorkoutData r1 = (com.withings.workout.workoutdata.SwimWorkoutData) r1
                goto L1c
            L1b:
                r1 = r0
            L1c:
                if (r1 == 0) goto L25
                int r1 = r1.getPoolLengthOrDefault()
                if (r1 != 0) goto L25
            L24:
                r4 = r0
            L25:
                if (r4 == 0) goto L36
                android.os.Parcelable r4 = r4.getData()
                java.lang.String r0 = "null cannot be cast to non-null type com.withings.workout.workoutdata.SwimWorkoutData"
                kotlin.jvm.internal.u.h(r4, r0)
                com.withings.workout.workoutdata.SwimWorkoutData r4 = (com.withings.workout.workoutdata.SwimWorkoutData) r4
                java.lang.Integer r0 = r4.getManualLapsOrLaps()
            L36:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.logging.ui.m0.j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$setWorkoutCategory$2$1", f = "EditWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f48416b;

        /* compiled from: EditWorkoutViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a implements c.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0 f48417a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Track f48418b;

            a(m0 m0Var, Track track) {
                this.f48417a = m0Var;
                this.f48418b = track;
            }

            @Override // ba0.c.a
            public final void a() {
                Track track = this.f48418b;
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
                int intensity = ((WorkoutData) data).getIntensity();
                m0 m0Var = this.f48417a;
                BuildersKt__Builders_commonKt.launch$default(h1.a(m0Var), Dispatchers.getIO(), null, new n0(null, m0Var, intensity, m0.m0(m0Var, track), null), 2, null);
            }

            public final void b(List<Vasistas> list) {
                Track track = this.f48418b;
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
                int intensity = ((WorkoutData) data).getIntensity();
                m0 m0Var = this.f48417a;
                BuildersKt__Builders_commonKt.launch$default(h1.a(m0Var), Dispatchers.getIO(), null, new n0(list, m0Var, intensity, m0.m0(m0Var, track), null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Track track, qm0.d<? super k> dVar) {
            super(2, dVar);
            this.f48416b = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new k(this.f48416b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((k) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m0 m0Var = m0.this;
            ba0.d dVar = m0Var.f48372l;
            User user = m0Var.f48361a;
            Track workout = this.f48416b;
            kotlin.jvm.internal.u.i(workout, "$workout");
            dVar.a(user, workout).a(Vasistas.Category.MOTION, new a(m0Var, workout));
            return nm0.y.f85009a;
        }
    }

    public m0(User user, Long l5, WorkoutCategory workoutCategory, Long l6, Context context, m70.i userManager, l70.w unitPreferencesRepository, WorkoutManager workoutManager, WorkoutCategoryManager workoutCategoryManager, lj0.h0 vasistasManager, ua0.a computeTrackGpsSummary, jm.a aVar, ba0.d vasistasGetFactory) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        kotlin.jvm.internal.u.j(workoutCategoryManager, "workoutCategoryManager");
        kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
        kotlin.jvm.internal.u.j(computeTrackGpsSummary, "computeTrackGpsSummary");
        kotlin.jvm.internal.u.j(vasistasGetFactory, "vasistasGetFactory");
        this.f48361a = user;
        this.f48362b = workoutCategory;
        this.f48363c = l6;
        this.f48364d = context;
        this.f48365e = userManager;
        this.f48366f = unitPreferencesRepository;
        this.f48367g = workoutManager;
        this.f48368h = workoutCategoryManager;
        this.f48369i = vasistasManager;
        this.f48370j = computeTrackGpsSummary;
        this.f48371k = aVar;
        this.f48372l = vasistasGetFactory;
        this.f48373m = new androidx.lifecycle.k0<>();
        androidx.lifecycle.k0<Boolean> k0Var = new androidx.lifecycle.k0<>();
        k0Var.setValue(Boolean.FALSE);
        this.f48374n = k0Var;
        u0 u0Var = new u0(h1.a(this), computeTrackGpsSummary);
        this.f48375o = u0Var;
        this.f48376p = e1.b(u0Var, new e());
        this.f48377q = e1.b(u0Var, new f());
        this.f48378r = new androidx.lifecycle.k0<>();
        this.f48379s = new androidx.lifecycle.k0<>();
        this.f48380t = new androidx.lifecycle.k0<>();
        xw.m<WorkoutCategory> mVar = new xw.m<>();
        this.f48381u = mVar;
        this.f48382v = xw.a.b(new nm0.j(e1.b(xw.a.b(new nm0.j(u0Var, mVar)), new h()), androidx.lifecycle.h.a(null, new i(null), 3)));
        this.f48383w = e1.b(u0Var, j.f48414a);
        this.f48384x = new xw.n<>();
        this.f48385y = new xw.n<>();
        this.f48386z = new xw.n<>();
        this.A = new xw.n<>();
        this.B = new androidx.lifecycle.k0<>();
        this.F = DateTime.now().minusMinutes(30);
        this.G = DateTime.now();
        if (l5 != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(l5, null), 3, null);
        } else {
            m1(workoutCategory);
        }
    }

    public static final void B0(m0 m0Var, Track track, WorkoutCategory workoutCategory) {
        m0Var.f48375o.v(track);
        m0Var.f48381u.setValue(workoutCategory);
        DateTime startDate = track.getStartDate();
        m0Var.M = new ba0.a(m0Var.f48369i, m0Var.f48368h, m0Var.f48365e, m0Var.f48361a, track, startDate);
        m0Var.f48373m.setValue(Boolean.TRUE);
    }

    public static final void F0(m0 m0Var, Track track) {
        Context context = m0Var.f48364d;
        Map j5 = kotlin.collections.s0.j(new nm0.j("gps_status", LocationStatusInfo.a(context)), new nm0.j("gps_accuracy", Boolean.valueOf(LocationStatusInfo.b(context))), new nm0.j("source", Integer.valueOf(track.getDeviceModel())), new nm0.j("duration", Double.valueOf(track.getDuration())), new nm0.j(WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME, Integer.valueOf(track.getCategory())), new nm0.j("isManual", Boolean.TRUE));
        x70.b.l(m0Var, "workout_created " + j5, new Object[0]);
    }

    public static final void G0(m0 m0Var, int i11) {
        u0 u0Var = m0Var.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Parcelable data = value.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            ((WorkoutData) data).setCalories(i11);
        } else {
            value = null;
        }
        u0Var.postValue(value);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.wiscale2.activity.logging.ui.m0 r6, qm0.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof com.withings.wiscale2.activity.logging.ui.o0
            if (r0 == 0) goto L16
            r0 = r7
            com.withings.wiscale2.activity.logging.ui.o0 r0 = (com.withings.wiscale2.activity.logging.ui.o0) r0
            int r1 = r0.f48429e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f48429e = r1
            goto L1b
        L16:
            com.withings.wiscale2.activity.logging.ui.o0 r0 = new com.withings.wiscale2.activity.logging.ui.o0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f48427c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f48429e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            com.withings.wiscale2.track.data.Track r6 = r0.f48426b
            com.withings.wiscale2.track.data.Track r0 = r0.f48425a
            nm0.l.b(r7)
            r1 = r0
            goto Lbe
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            nm0.l.b(r7)
            com.withings.wiscale2.activity.logging.ui.u0 r7 = r6.f48375o
            java.lang.Object r7 = r7.getValue()
            kotlin.jvm.internal.u.g(r7)
            com.withings.wiscale2.track.data.Track r7 = (com.withings.wiscale2.track.data.Track) r7
            org.joda.time.DateTime r2 = org.joda.time.DateTime.now()
            java.lang.String r4 = "now(...)"
            kotlin.jvm.internal.u.i(r2, r4)
            r7.setModifiedDate(r2)
            org.joda.time.DateTimeZone r2 = org.joda.time.DateTimeZone.getDefault()
            java.lang.String r4 = "getDefault(...)"
            kotlin.jvm.internal.u.i(r2, r4)
            r7.setTimeZone(r2)
            org.joda.time.DateTime r2 = r7.getStartDate()
            org.joda.time.DateTimeZone r4 = r7.getDateTimeZone()
            org.joda.time.DateTime r2 = r2.withZone(r4)
            java.lang.String r4 = "yyyy-MM-dd"
            java.lang.String r2 = r2.toString(r4)
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.u.i(r2, r4)
            r7.setDay(r2)
            xw.m<com.withings.workout.category.model.WorkoutCategory> r2 = r6.f48381u
            java.lang.Object r2 = r2.getValue()
            com.withings.workout.category.model.WorkoutCategory r2 = (com.withings.workout.category.model.WorkoutCategory) r2
            long r4 = r2.getId()
            int r2 = (int) r4
            r7.setCategory(r2)
            int r2 = r7.getAttrib()
            r4 = 7
            if (r2 == 0) goto La2
            int r2 = r7.getAttrib()
            if (r2 == r4) goto La2
            int r2 = r7.getAttrib()
            r5 = 3
            if (r2 != r5) goto L9d
            goto La2
        L9d:
            r2 = 2
            r7.setAttrib(r2)
            goto La5
        La2:
            r7.setAttrib(r4)
        La5:
            com.withings.workout.workoutdata.WorkoutData r2 = k1(r7)
            r7.setData(r2)
            r0.f48425a = r7
            r0.f48426b = r7
            r0.f48429e = r3
            ua0.a r6 = r6.f48370j
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r1) goto Lbb
            goto Lc3
        Lbb:
            r1 = r7
            r7 = r6
            r6 = r1
        Lbe:
            com.withings.wiscale2.track.data.GpsSummary r7 = (com.withings.wiscale2.track.data.GpsSummary) r7
            r6.setGpsSummary(r7)
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.logging.ui.m0.f0(com.withings.wiscale2.activity.logging.ui.m0, qm0.d):java.lang.Object");
    }

    public static final String g0(m0 m0Var, Context context, DateTime dateTime) {
        m0Var.getClass();
        if (kotlin.jvm.internal.u.e(dateTime.withTimeAtStartOfDay(), DateTime.now().withTimeAtStartOfDay())) {
            return String.format(w6.o.a(context.getString(C1987R.string._TODAY_), ", ", DateUtils.formatDateTime(context, dateTime.getMillis(), ConstantsWs.WS_STATUS_EXPIRED_CREATION_TOKEN)), Arrays.copyOf(new Object[0], 0));
        }
        String formatDateTime = DateUtils.formatDateTime(context, dateTime.getMillis(), ConstantsWs.WS_STATUS_INVALID_PASSWORD_NO_LOWERCASE);
        kotlin.jvm.internal.u.g(formatDateTime);
        return formatDateTime;
    }

    private static WorkoutData k1(Track track) {
        if (track.getCategory() == 7) {
            Parcelable data = track.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            return ba0.e.b((WorkoutData) data);
        }
        Parcelable data2 = track.getData();
        kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
        return ba0.e.a((WorkoutData) data2);
    }

    public static final long m0(m0 m0Var, Track track) {
        m0Var.getClass();
        if (track != null) {
            return new Duration(TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track)).getMillis();
        }
        return 1200000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(WorkoutCategory workoutCategory) {
        DateTime dateTime;
        Long l5 = this.f48363c;
        if (l5 != null) {
            dateTime = new DateTime(l5.longValue());
        } else {
            dateTime = this.F;
        }
        Track track = new Track(null, null, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, false, 0, null, null, null, false, 0, null, null, false, null, null, null, null, null, null, 0, -1, null);
        track.setData(k1(track));
        track.setUserId(this.f48361a.q());
        kotlin.jvm.internal.u.g(dateTime);
        track.setStartDate(dateTime);
        DateTime plus = dateTime.plus(1200000L);
        kotlin.jvm.internal.u.i(plus, "plus(...)");
        track.setEndDate(plus);
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        track.setModifiedDate(now);
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        kotlin.jvm.internal.u.i(dateTimeZone, "getDefault(...)");
        track.setTimeZone(dateTimeZone);
        String abstractDateTime = track.getStartDate().withZone(track.getDateTimeZone()).toString("yyyy-MM-dd");
        kotlin.jvm.internal.u.i(abstractDateTime, "toString(...)");
        track.setDay(abstractDateTime);
        track.setSyncedToWs(false);
        track.setAttrib(2);
        track.setDeviceType(16);
        track.setDeviceModel(1053);
        this.f48375o.v(track);
        this.f48373m.setValue(Boolean.FALSE);
        if (workoutCategory == null) {
            this.B.setValue(new xw.c<>(nm0.y.f85009a));
            return;
        }
        z1(workoutCategory);
    }

    public final void A1() {
        boolean z5;
        Track value = this.f48375o.getValue();
        if (value != null && value.getId() != null) {
            xw.n<Boolean> nVar = this.f48385y;
            if (value.getAttrib() != 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            nVar.setValue(Boolean.valueOf(z5));
        }
    }

    public final void C1(String userInputLaps) {
        int i11;
        kotlin.jvm.internal.u.j(userInputLaps, "userInputLaps");
        if (userInputLaps.length() > 0) {
            i11 = Integer.parseInt(userInputLaps);
        } else {
            i11 = 0;
        }
        if (i11 < 2) {
            this.f48378r.setValue(new xw.c<>(nm0.y.f85009a));
            return;
        }
        u0 u0Var = this.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Parcelable data = value.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.SwimWorkoutData");
            ((SwimWorkoutData) data).setManualLaps(Integer.valueOf(i11));
        } else {
            value = null;
        }
        u0Var.postValue(value);
    }

    public final void K0(Integer num) {
        Track value = this.f48375o.getValue();
        if (value != null) {
            value.setDeletionReason(num);
            dm.a.a(num);
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new g(value, null), 3, null);
        }
    }

    public final androidx.lifecycle.j0 M0() {
        return this.f48376p;
    }

    public final xw.m<WorkoutCategory> O0() {
        return this.f48381u;
    }

    public final androidx.lifecycle.j0 R0() {
        return this.f48377q;
    }

    public final xw.p<c, Boolean, nm0.j<c, Boolean>> T0() {
        return this.f48382v;
    }

    public final u0 U0() {
        return this.f48375o;
    }

    public final androidx.lifecycle.k0<xw.c<nm0.y>> V0() {
        return this.f48380t;
    }

    public final DateTime W0() {
        DateTime endDate;
        Track value = this.f48375o.getValue();
        if (value == null || (endDate = value.getEndDate()) == null) {
            DateTime defaultEndDate = this.G;
            kotlin.jvm.internal.u.i(defaultEndDate, "defaultEndDate");
            return defaultEndDate;
        }
        return endDate;
    }

    public final androidx.lifecycle.j0 X0() {
        return this.f48383w;
    }

    public final androidx.lifecycle.k0<xw.c<nm0.y>> Y0() {
        return this.f48378r;
    }

    public final xw.n<Track> Z0() {
        return this.f48384x;
    }

    public final xw.n<nm0.y> a1() {
        return this.A;
    }

    public final androidx.lifecycle.k0<xw.c<nm0.y>> c1() {
        return this.B;
    }

    public final androidx.lifecycle.k0<Boolean> d1() {
        return this.f48373m;
    }

    public final xw.n<Boolean> e1() {
        return this.f48385y;
    }

    public final DateTime g1() {
        DateTime startDate;
        Track value = this.f48375o.getValue();
        if (value == null || (startDate = value.getStartDate()) == null) {
            DateTime defaultStartDate = this.F;
            kotlin.jvm.internal.u.i(defaultStartDate, "defaultStartDate");
            return defaultStartDate;
        }
        return startDate;
    }

    public final androidx.lifecycle.k0<xw.c<nm0.y>> i1() {
        return this.f48379s;
    }

    public final xw.n<nm0.y> l1() {
        return this.f48386z;
    }

    public final androidx.lifecycle.k0<Boolean> n1() {
        return this.f48374n;
    }

    public final void o1() {
        u0 u0Var = this.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Parcelable data = value.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.SwimWorkoutData");
            ((SwimWorkoutData) data).setManualLaps(null);
        } else {
            value = null;
        }
        u0Var.postValue(value);
    }

    public final void q1() {
        Track value = this.f48375o.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new s0(this, value, null), 2, null);
        }
    }

    public final void r1(String inputKm, String inputM) {
        int parseDouble;
        kotlin.jvm.internal.u.j(inputKm, "inputKm");
        kotlin.jvm.internal.u.j(inputM, "inputM");
        if (inputKm.length() == 0) {
            parseDouble = 0;
        } else {
            int i11 = k70.c.f75663c;
            parseDouble = (int) (Double.parseDouble(inputKm) * 1000.0d);
        }
        if (inputM.length() > 0) {
            parseDouble += Integer.parseInt(inputM);
        }
        u0 u0Var = this.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Parcelable data = value.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.StepWorkoutData");
            ((StepWorkoutData) data).setManualDistance(parseDouble);
        } else {
            value = null;
        }
        u0Var.postValue(value);
    }

    public final void s1(String inputMiles) {
        kotlin.jvm.internal.u.j(inputMiles, "inputMiles");
        int i11 = 0;
        if (inputMiles.length() != 0) {
            double parseDouble = Double.parseDouble(dp0.j.O(inputMiles, ",", ".", false));
            int i12 = k70.e.f75664c;
            i11 = an0.a.a(parseDouble * 1609.344d);
        }
        u0 u0Var = this.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Parcelable data = value.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.StepWorkoutData");
            ((StepWorkoutData) data).setManualDistance(i11);
        } else {
            value = null;
        }
        u0Var.postValue(value);
    }

    public final void t1(DateTime dateTime) {
        boolean isAfterNow = dateTime.isAfterNow();
        Track track = null;
        u0 u0Var = this.f48375o;
        if (isAfterNow) {
            Track value = u0Var.getValue();
            if (value != null) {
                this.f48380t.setValue(new xw.c<>(nm0.y.f85009a));
                DateTime plusMinutes = value.getStartDate().plusMinutes(1);
                kotlin.jvm.internal.u.i(plusMinutes, "plusMinutes(...)");
                value.setEndDate(plusMinutes);
                track = value;
            }
            u0Var.postValue(track);
            return;
        }
        Track value2 = u0Var.getValue();
        if (value2 != null) {
            if (dateTime.isBefore(value2.getStartDate())) {
                DateTime plusMinutes2 = value2.getStartDate().plusMinutes(1);
                kotlin.jvm.internal.u.i(plusMinutes2, "plusMinutes(...)");
                value2.setEndDate(plusMinutes2);
            } else {
                value2.setEndDate(dateTime);
            }
            track = value2;
        }
        u0Var.postValue(track);
    }

    public final void v1(int i11) {
        u0 u0Var = this.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Parcelable data = value.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            ((WorkoutData) data).setIntensity(i11);
        } else {
            value = null;
        }
        u0Var.setValue(value);
        Track value2 = u0Var.getValue();
        if (value2 != null) {
            Parcelable data2 = value2.getData();
            kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            if (((WorkoutData) data2).getManualCalories() <= 0) {
                q1();
            }
        }
    }

    public final void w1(int i11) {
        u0 u0Var = this.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Parcelable data = value.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            ((WorkoutData) data).setManualCalories(i11);
        } else {
            value = null;
        }
        u0Var.postValue(value);
    }

    public final void y1(DateTime dateTime) {
        boolean isAfterNow = dateTime.isAfterNow();
        Track track = null;
        u0 u0Var = this.f48375o;
        if (isAfterNow) {
            Track value = u0Var.getValue();
            if (value != null) {
                this.f48379s.setValue(new xw.c<>(nm0.y.f85009a));
                DateTime minusHours = DateTime.now().minusHours(1);
                kotlin.jvm.internal.u.i(minusHours, "minusHours(...)");
                value.setStartDate(minusHours);
                DateTime plusMinutes = value.getStartDate().plusMinutes(1);
                kotlin.jvm.internal.u.i(plusMinutes, "plusMinutes(...)");
                value.setEndDate(plusMinutes);
                track = value;
            }
            u0Var.postValue(track);
            return;
        }
        Track value2 = u0Var.getValue();
        if (value2 != null) {
            value2.setStartDate(dateTime);
            if (dateTime.isAfter(value2.getEndDate())) {
                DateTime plusMinutes2 = dateTime.plusMinutes(1);
                kotlin.jvm.internal.u.i(plusMinutes2, "plusMinutes(...)");
                value2.setEndDate(plusMinutes2);
            }
            track = value2;
        }
        u0Var.postValue(track);
    }

    public final void z1(WorkoutCategory workoutCategory) {
        kotlin.jvm.internal.u.j(workoutCategory, "workoutCategory");
        this.f48381u.setValue(workoutCategory);
        u0 u0Var = this.f48375o;
        Track value = u0Var.getValue();
        if (value != null) {
            Track track = value;
            track.setCategory((int) workoutCategory.getId());
            track.setData(k1(track));
            u0Var.setValue(value);
        }
        Track value2 = u0Var.getValue();
        if (value2 != null) {
            DateTime startDate = value2.getStartDate();
            this.M = new ba0.a(this.f48369i, this.f48368h, this.f48365e, this.f48361a, value2, startDate);
            this.f48374n.postValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new k(value2, null), 2, null);
        }
    }
}
