package com.withings.wiscale2.activity.workout.model;

import android.os.Parcelable;
import androidx.activity.b0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.user.User;
import com.withings.vasistas.model.SwimVasistas;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.SwimWorkoutData;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import lj0.h0;
import lj0.w;
import m70.i;
import org.joda.time.DateTime;
/* compiled from: WorkoutDataBuilder.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b5\u00106J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "", "Lcom/withings/wiscale2/track/data/Track;", "workout", "", "Lcom/withings/vasistas/model/Vasistas;", "pauseVasistas", "", "pauseDuration", "Lcom/withings/workout/workoutdata/SwimWorkoutData;", "buildSwimWorkoutData", "(Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;I)Lcom/withings/workout/workoutdata/SwimWorkoutData;", "Lcom/withings/workout/workoutdata/WorkoutData;", "workoutData", "algoPauseDuration", "createUpdatedSwimData", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/workout/workoutdata/WorkoutData;Ljava/util/List;II)Lcom/withings/workout/workoutdata/SwimWorkoutData;", "Lcom/withings/vasistas/model/SwimVasistas;", "vasistasList", "getSwimType", "(Ljava/util/List;)I", "Lcom/withings/workout/workoutdata/StepWorkoutData;", "buildStepData", "(Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;I)Lcom/withings/workout/workoutdata/StepWorkoutData;", "", "shouldUpdateDeviceStartEnd", "buildWorkoutData", "(Lcom/withings/wiscale2/track/data/Track;Z)Lcom/withings/workout/workoutdata/WorkoutData;", "Llj0/h0;", "vasistasManager", "Llj0/h0;", "getVasistasManager", "()Llj0/h0;", "Llj0/w;", "swimVasistasRepository", "Llj0/w;", "getSwimVasistasRepository", "()Llj0/w;", "Lm70/i;", "userManager", "Lm70/i;", "getUserManager", "()Lm70/i;", "Lcom/withings/workout/category/model/WorkoutCategoryManager;", "workoutCategoryManager", "Lcom/withings/workout/category/model/WorkoutCategoryManager;", "getWorkoutCategoryManager", "()Lcom/withings/workout/category/model/WorkoutCategoryManager;", "Lka0/c;", "workoutAlgoPausesGenerator", "Lka0/c;", "getWorkoutAlgoPausesGenerator", "()Lka0/c;", "<init>", "(Llj0/h0;Llj0/w;Lm70/i;Lcom/withings/workout/category/model/WorkoutCategoryManager;Lka0/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutDataBuilder {
    public static final int $stable = 8;
    private final w swimVasistasRepository;
    private final i userManager;
    private final h0 vasistasManager;
    private final ka0.c workoutAlgoPausesGenerator;
    private final WorkoutCategoryManager workoutCategoryManager;

    public WorkoutDataBuilder(h0 vasistasManager, w swimVasistasRepository, i userManager, WorkoutCategoryManager workoutCategoryManager, ka0.c workoutAlgoPausesGenerator) {
        u.j(vasistasManager, "vasistasManager");
        u.j(swimVasistasRepository, "swimVasistasRepository");
        u.j(userManager, "userManager");
        u.j(workoutCategoryManager, "workoutCategoryManager");
        u.j(workoutAlgoPausesGenerator, "workoutAlgoPausesGenerator");
        this.vasistasManager = vasistasManager;
        this.swimVasistasRepository = swimVasistasRepository;
        this.userManager = userManager;
        this.workoutCategoryManager = workoutCategoryManager;
        this.workoutAlgoPausesGenerator = workoutAlgoPausesGenerator;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.Collection, java.util.ArrayList] */
    private final StepWorkoutData buildStepData(Track track, List<Vasistas> list, int i11) {
        StepWorkoutData stepWorkoutData;
        Iterator it;
        Iterator it2;
        p0 p0Var = new p0();
        p0Var.f76257a = this.vasistasManager.o(track.getUserId(), Vasistas.Category.MOTION, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        for (Vasistas vasistas : list) {
            T element = p0Var.f76257a;
            u.i(element, "element");
            ?? arrayList = new ArrayList();
            for (Object obj : (Iterable) element) {
                Vasistas vasistas2 = (Vasistas) obj;
                if (!b0.q(vasistas2.getStartDate(), vasistas.getStartDate(), vasistas.getEnd()) || !b0.q(vasistas2.getEnd(), vasistas.getStartDate(), vasistas.getEnd())) {
                    arrayList.add(obj);
                }
            }
            p0Var.f76257a = arrayList;
        }
        Parcelable data = track.getData();
        if (!(data instanceof WorkoutData)) {
            data = null;
        }
        if (data != null) {
            stepWorkoutData = new StepWorkoutData((WorkoutData) data);
        } else {
            stepWorkoutData = new StepWorkoutData();
        }
        T element2 = p0Var.f76257a;
        u.i(element2, "element");
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double d12 = 0.0d;
        for (Vasistas vasistas3 : (Iterable) element2) {
            d12 += vasistas3.getDistance();
        }
        stepWorkoutData.setDistance((int) d12);
        T element3 = p0Var.f76257a;
        u.i(element3, "element");
        int i12 = 0;
        for (Vasistas vasistas4 : (Iterable) element3) {
            i12 += vasistas4.getSteps();
        }
        stepWorkoutData.setSteps(i12);
        T element4 = p0Var.f76257a;
        u.i(element4, "element");
        double d13 = 0.0d;
        while (((Iterable) element4).iterator().hasNext()) {
            d13 += ((Vasistas) it.next()).getMet();
        }
        stepWorkoutData.setCumulMet((int) d13);
        T element5 = p0Var.f76257a;
        u.i(element5, "element");
        while (((Iterable) element5).iterator().hasNext()) {
            d11 += ((Vasistas) it2.next()).getMet();
        }
        stepWorkoutData.setAscent((int) d11);
        stepWorkoutData.setPauseDuration(i11);
        return stepWorkoutData;
    }

    private final SwimWorkoutData buildSwimWorkoutData(Track track, List<Vasistas> list, int i11) {
        List<Vasistas> o11 = this.vasistasManager.o(track.getUserId(), Vasistas.Category.SWIM, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        ka0.c cVar = this.workoutAlgoPausesGenerator;
        DateTime startDate = track.getStartDate();
        DateTime endDate = track.getEndDate();
        u.g(o11);
        cVar.getClass();
        int a11 = ka0.c.a(startDate, endDate, o11, list);
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
        return createUpdatedSwimData(track, (WorkoutData) data, list, i11, a11);
    }

    public static /* synthetic */ WorkoutData buildWorkoutData$default(WorkoutDataBuilder workoutDataBuilder, Track track, boolean z5, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z5 = false;
        }
        return workoutDataBuilder.buildWorkoutData(track, z5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.util.Collection, java.util.ArrayList] */
    private final SwimWorkoutData createUpdatedSwimData(Track track, WorkoutData workoutData, List<Vasistas> list, int i11, int i12) {
        Integer num;
        p0 p0Var = new p0();
        p0Var.f76257a = this.swimVasistasRepository.a(track.getUserId(), TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        for (Vasistas vasistas : list) {
            ?? arrayList = new ArrayList();
            for (Object obj : (Iterable) p0Var.f76257a) {
                SwimVasistas swimVasistas = (SwimVasistas) obj;
                if (!b0.q(swimVasistas.getStartDate(), vasistas.getStartDate(), vasistas.getEnd()) || !b0.q(swimVasistas.getEndDate(), vasistas.getStartDate(), vasistas.getEnd())) {
                    arrayList.add(obj);
                }
            }
            p0Var.f76257a = arrayList;
        }
        SwimWorkoutData swimWorkoutData = new SwimWorkoutData(workoutData);
        int i13 = 0;
        int i14 = 0;
        for (SwimVasistas swimVasistas2 : (Iterable) p0Var.f76257a) {
            i14 += swimVasistas2.getSwimLaps();
        }
        swimWorkoutData.setLaps(i14);
        for (SwimVasistas swimVasistas3 : (Iterable) p0Var.f76257a) {
            i13 += swimVasistas3.getSwimMovements();
        }
        swimWorkoutData.setMovements(i13);
        swimWorkoutData.setSwimType(getSwimType((List) p0Var.f76257a));
        SwimVasistas swimVasistas4 = (SwimVasistas) x.K((List) p0Var.f76257a);
        if (swimVasistas4 != null) {
            num = Integer.valueOf(swimVasistas4.getAlgoVersion());
        } else {
            num = null;
        }
        swimWorkoutData.setAlgoVersion(num);
        swimWorkoutData.setPoolLength(new PoolSizeSelector(WorkoutManager.Companion.get()).select(track.getUserId(), track.getEndDate()));
        swimWorkoutData.setPauseDuration(i11);
        swimWorkoutData.setAlgoPauseDuration(i12);
        return swimWorkoutData;
    }

    private final int getSwimType(List<SwimVasistas> list) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Integer valueOf = Integer.valueOf(((SwimVasistas) obj2).getSwimType());
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = com.google.android.gms.internal.mlkit_common.a.d(linkedHashMap, valueOf);
            }
            ((List) obj3).add(obj2);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long j5 = 0;
                for (SwimVasistas swimVasistas : (Iterable) ((Map.Entry) next).getValue()) {
                    j5 += swimVasistas.getDurationMillis();
                }
                do {
                    Object next2 = it.next();
                    long j11 = 0;
                    for (SwimVasistas swimVasistas2 : (Iterable) ((Map.Entry) next2).getValue()) {
                        j11 += swimVasistas2.getDurationMillis();
                    }
                    if (j5 < j11) {
                        next = next2;
                        j5 = j11;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getKey()).intValue();
        }
        return 9;
    }

    public final WorkoutData buildWorkoutData(Track workout) {
        u.j(workout, "workout");
        return buildWorkoutData$default(this, workout, false, 2, null);
    }

    public final w getSwimVasistasRepository() {
        return this.swimVasistasRepository;
    }

    public final i getUserManager() {
        return this.userManager;
    }

    public final h0 getVasistasManager() {
        return this.vasistasManager;
    }

    public final ka0.c getWorkoutAlgoPausesGenerator() {
        return this.workoutAlgoPausesGenerator;
    }

    public final WorkoutCategoryManager getWorkoutCategoryManager() {
        return this.workoutCategoryManager;
    }

    public final WorkoutData buildWorkoutData(Track workout, boolean z5) {
        WorkoutData buildStepData;
        u.j(workout, "workout");
        List<Vasistas> o11 = this.vasistasManager.o(workout.getUserId(), Vasistas.Category.PAUSE, TrackKt.getEffectiveStartDate(workout), TrackKt.getEffectiveEndDate(workout));
        u.g(o11);
        int i11 = 0;
        for (Vasistas vasistas : o11) {
            i11 += vasistas.getDurationMillis();
        }
        int i12 = i11 / 1000;
        if (workout.getCategory() == 7) {
            buildStepData = buildSwimWorkoutData(workout, o11, i12);
        } else {
            buildStepData = buildStepData(workout, o11, i12);
        }
        if (z5) {
            buildStepData.setDeviceStartDate(TrackKt.getEffectiveStartDate(workout));
            buildStepData.setDeviceEndDate(TrackKt.getEffectiveEndDate(workout));
        }
        h0 h0Var = this.vasistasManager;
        WorkoutCategoryManager workoutCategoryManager = this.workoutCategoryManager;
        i iVar = this.userManager;
        User e11 = iVar.e();
        u.i(e11, "getMainUser(...)");
        buildStepData.setCalories(new ba0.a(h0Var, workoutCategoryManager, iVar, e11, workout, TrackKt.getEffectiveStartDate(workout)).a(buildStepData.getIntensity(), TrackKt.getEffectiveDurationMillis(workout) - workout.getPauseDurationMillis()));
        return buildStepData;
    }
}
