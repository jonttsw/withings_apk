package com.withings.wiscale2.activity;

import android.os.Parcelable;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.model.VasistasKt;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import ym0.l;
/* compiled from: ActiveDurationCalculator.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f48254a;

    /* compiled from: ActiveDurationCalculator.kt */
    /* renamed from: com.withings.wiscale2.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0666a {

        /* renamed from: a  reason: collision with root package name */
        private final long f48255a;

        /* renamed from: b  reason: collision with root package name */
        private final long f48256b;

        /* renamed from: c  reason: collision with root package name */
        private final long f48257c;

        public C0666a(long j5, long j11, long j12) {
            this.f48255a = j5;
            this.f48256b = j11;
            this.f48257c = j12;
        }

        public final long a() {
            return this.f48257c;
        }

        public final long b() {
            return this.f48256b;
        }

        public final long c() {
            return this.f48255a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0666a)) {
                return false;
            }
            C0666a c0666a = (C0666a) obj;
            if (this.f48255a == c0666a.f48255a && this.f48256b == c0666a.f48256b && this.f48257c == c0666a.f48257c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f48257c) + androidx.activity.result.c.a(this.f48256b, Long.hashCode(this.f48255a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActiveDuration(softDuration=");
            sb2.append(this.f48255a);
            sb2.append(", moderateDuration=");
            sb2.append(this.f48256b);
            sb2.append(", intenseDuration=");
            return android.support.v4.media.session.c.c(sb2, this.f48257c, ")");
        }
    }

    /* compiled from: ActiveDurationCalculator.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<Map<Long, WorkoutCategory>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WorkoutCategoryManager f48258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(WorkoutCategoryManager workoutCategoryManager) {
            super(0);
            this.f48258a = workoutCategoryManager;
        }

        @Override // ym0.a
        public final Map<Long, WorkoutCategory> invoke() {
            return this.f48258a.getAllCategory();
        }
    }

    /* compiled from: ActiveDurationCalculator.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements l<j<? extends Vasistas, ? extends Float>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f48259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Track track) {
            super(1);
            this.f48259a = track;
        }

        @Override // ym0.l
        public final Boolean invoke(j<? extends Vasistas, ? extends Float> jVar) {
            j<? extends Vasistas, ? extends Float> jVar2 = jVar;
            u.j(jVar2, "<name for destructuring parameter 0>");
            DateTime startDate = jVar2.a().getStartDate();
            Track track = this.f48259a;
            return Boolean.valueOf(hn.a.c(startDate, track.getStartDate(), track.getEndDate()));
        }
    }

    public a(WorkoutCategoryManager workoutCategoryManager) {
        u.j(workoutCategoryManager, "workoutCategoryManager");
        this.f48254a = nm0.h.b(new b(workoutCategoryManager));
    }

    public final C0666a a(List<Vasistas> list, List<Track> workouts) {
        int i11;
        j jVar;
        StepWorkoutData stepWorkoutData;
        float f11;
        Float f12;
        float floatValue;
        Float f13;
        WorkoutData workoutData;
        int i12;
        float f14;
        u.j(workouts, "workouts");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Vasistas) obj).getType() == Vasistas.VasistasType.DAY) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Vasistas vasistas = (Vasistas) it.next();
            float speedInKmH = VasistasKt.getSpeedInKmH(vasistas);
            if (vasistas.getActivityType() == Vasistas.ActivityType.RUN) {
                i11 = 1;
            }
            if (i11 != 0) {
                f14 = 1.0f;
            } else {
                f14 = 0.5f;
            }
            arrayList2.add(new j(vasistas, Float.valueOf((f14 * speedInKmH) + 1.0f)));
        }
        ArrayList S0 = x.S0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Track track : workouts) {
            Parcelable data = track.getData();
            j jVar2 = null;
            if (data instanceof StepWorkoutData) {
                stepWorkoutData = (StepWorkoutData) data;
            } else {
                stepWorkoutData = null;
            }
            float f15 = 0.0f;
            if (stepWorkoutData != null) {
                f11 = stepWorkoutData.getCumulMet() / ((float) (track.getDuration() / ((long) DateTimeConstants.MILLIS_PER_MINUTE)));
            } else {
                f11 = 0.0f;
            }
            WorkoutCategory workoutCategory = (WorkoutCategory) ((Map) this.f48254a.getValue()).get(Long.valueOf(track.getCategory()));
            if (workoutCategory != null) {
                f12 = workoutCategory.getMinMet();
            } else {
                f12 = null;
            }
            if (f12 == null) {
                floatValue = 0.0f;
            } else {
                floatValue = f12.floatValue();
            }
            if (workoutCategory != null) {
                f13 = workoutCategory.getMaxMet();
            } else {
                f13 = null;
            }
            if (f13 != null) {
                f15 = f13.floatValue();
            }
            float f16 = f15 - floatValue;
            Parcelable data2 = track.getData();
            if (data2 instanceof WorkoutData) {
                workoutData = (WorkoutData) data2;
            } else {
                workoutData = null;
            }
            if (workoutData != null) {
                i12 = workoutData.getIntensity();
            } else {
                i12 = 30;
            }
            float f17 = ((f16 * i12) / 100) + floatValue;
            Float valueOf = Float.valueOf(f17);
            if (f17 <= f11) {
                valueOf = null;
            }
            if (valueOf != null) {
                jVar2 = new j(track, Float.valueOf(valueOf.floatValue()));
            }
            if (jVar2 != null) {
                arrayList3.add(jVar2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            b0.j(S0, new c((Track) ((j) it2.next()).a()));
        }
        ArrayList arrayList4 = new ArrayList(x.y(S0, 10));
        Iterator it3 = S0.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new j(Long.valueOf(((Vasistas) jVar.a()).getDurationMillis()), Float.valueOf(((Number) ((j) it3.next()).b()).floatValue())));
        }
        ArrayList arrayList5 = new ArrayList(x.y(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            j jVar3 = (j) it4.next();
            arrayList5.add(new j(Long.valueOf(((Track) jVar3.a()).getDuration()), Float.valueOf(((Number) jVar3.b()).floatValue())));
        }
        ArrayList l02 = x.l0(arrayList5, arrayList4);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : l02) {
            float floatValue2 = ((Number) ((j) obj2).b()).floatValue();
            if (floatValue2 >= 1.0f && floatValue2 < 3.0f) {
                arrayList6.add(obj2);
            }
        }
        Iterator it5 = arrayList6.iterator();
        int i13 = 0;
        while (it5.hasNext()) {
            i13 += (int) ((Number) ((j) it5.next()).a()).longValue();
        }
        long j5 = i13;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : l02) {
            float floatValue3 = ((Number) ((j) obj3).b()).floatValue();
            if (floatValue3 >= 3.0f && floatValue3 <= 6.0f) {
                arrayList7.add(obj3);
            }
        }
        Iterator it6 = arrayList7.iterator();
        int i14 = 0;
        while (it6.hasNext()) {
            i14 += (int) ((Number) ((j) it6.next()).a()).longValue();
        }
        long j11 = i14;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj4 : l02) {
            if (((Number) ((j) obj4).b()).floatValue() > 6.0f) {
                arrayList8.add(obj4);
            }
        }
        Iterator it7 = arrayList8.iterator();
        while (it7.hasNext()) {
            i11 += (int) ((Number) ((j) it7.next()).a()).longValue();
        }
        return new C0666a(j5, j11, i11);
    }
}
