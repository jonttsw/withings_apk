package com.withings.wiscale2.activity.workout.model;

import androidx.activity.m;
import androidx.activity.o;
import com.withings.clinicalstudy.repository.PatientSessionRepository;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import m70.i;
import nm0.g;
import nm0.h;
import nm0.j;
import org.joda.time.DateTime;
/* compiled from: WorkoutSaver.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJA\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nR\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010)R\u001b\u0010-\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutSaver;", "", "Lcom/withings/wiscale2/track/data/Track;", "workout", "Lnm0/y;", "save", "(Lcom/withings/wiscale2/track/data/Track;)V", "", "workouts", "saveDeviceWorkouts", "(Ljava/util/List;)V", "", NavigationArguments.USER_ID, "trackerSwimWorkout", "Lorg/joda/time/DateTime;", "from", "to", "saveActivityRecoWorkouts", "(JLjava/util/List;Ljava/util/List;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "Lm70/i;", "userManager$delegate", "Lnm0/g;", "getUserManager", "()Lm70/i;", "userManager", "Lvf/c;", "accountManager$delegate", "getAccountManager", "()Lvf/c;", "accountManager", "Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "workoutDataBuilder$delegate", "getWorkoutDataBuilder", "()Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "workoutDataBuilder", "Lcom/withings/wiscale2/activity/workout/model/WorkoutComputationDispatcher;", "dispatcher", "Lcom/withings/wiscale2/activity/workout/model/WorkoutComputationDispatcher;", "Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "patientSessionRepository$delegate", "getPatientSessionRepository", "()Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "patientSessionRepository", "Lpi/i;", "isForClinicalStudy$delegate", "isForClinicalStudy", "()Lpi/i;", "Lpi/f;", "getNewPatientSessionWorkoutNote$delegate", "getGetNewPatientSessionWorkoutNote", "()Lpi/f;", "getNewPatientSessionWorkoutNote", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutSaver {
    public static final WorkoutSaver INSTANCE = new WorkoutSaver();
    private static final g userManager$delegate = h.b(WorkoutSaver$userManager$2.INSTANCE);
    private static final g accountManager$delegate = h.b(WorkoutSaver$accountManager$2.INSTANCE);
    private static final g workoutDataBuilder$delegate = h.b(WorkoutSaver$workoutDataBuilder$2.INSTANCE);
    private static final WorkoutComputationDispatcher dispatcher = new HandlerThreadWorkoutComputationDispatcher();
    private static final g patientSessionRepository$delegate = h.b(WorkoutSaver$patientSessionRepository$2.INSTANCE);
    private static final g isForClinicalStudy$delegate = h.b(WorkoutSaver$isForClinicalStudy$2.INSTANCE);
    private static final g getNewPatientSessionWorkoutNote$delegate = h.b(WorkoutSaver$getNewPatientSessionWorkoutNote$2.INSTANCE);
    public static final int $stable = 8;

    private WorkoutSaver() {
    }

    public final vf.c getAccountManager() {
        return (vf.c) accountManager$delegate.getValue();
    }

    public final pi.f getGetNewPatientSessionWorkoutNote() {
        return (pi.f) getNewPatientSessionWorkoutNote$delegate.getValue();
    }

    public final PatientSessionRepository getPatientSessionRepository() {
        return (PatientSessionRepository) patientSessionRepository$delegate.getValue();
    }

    public final i getUserManager() {
        Object value = userManager$delegate.getValue();
        u.i(value, "getValue(...)");
        return (i) value;
    }

    private final WorkoutDataBuilder getWorkoutDataBuilder() {
        return (WorkoutDataBuilder) workoutDataBuilder$delegate.getValue();
    }

    public final pi.i isForClinicalStudy() {
        return (pi.i) isForClinicalStudy$delegate.getValue();
    }

    public static final void save$lambda$6(List workouts) {
        u.j(workouts, "$workouts");
        WorkoutManager.Companion.get().saveAll(workouts);
    }

    public static final void save$lambda$7(Track workout) {
        u.j(workout, "$workout");
        WorkoutManager.Companion.get().save(workout);
    }

    public static final void saveActivityRecoWorkouts$lambda$5(long j5, DateTime from, DateTime to, List trackerSwimWorkout, List workouts) {
        u.j(from, "$from");
        u.j(to, "$to");
        u.j(trackerSwimWorkout, "$trackerSwimWorkout");
        u.j(workouts, "$workouts");
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        ArrayList arrayList = new ArrayList();
        for (Object obj : workoutManager.getWorkoutsForUserContainedBetween(j5, from, to)) {
            if (!l.m(new Integer[]{20000}, Integer.valueOf(((Track) obj).getAttrib()))) {
                arrayList.add(obj);
            }
        }
        WorkoutSaver workoutSaver = INSTANCE;
        new RecognizedWorkoutSaver(workoutManager, workoutSaver.getWorkoutDataBuilder(), workoutSaver.getAccountManager(), workoutSaver.getGetNewPatientSessionWorkoutNote(), j5).save(trackerSwimWorkout, workouts, arrayList);
    }

    public static final void saveDeviceWorkouts$lambda$3(List workouts) {
        Object runBlocking$default;
        u.j(workouts, "$workouts");
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        j<List<Track>, List<Track>> resolveConflicts = new DeviceWorkoutConflictResolver(workoutManager, INSTANCE.getWorkoutDataBuilder()).resolveConflicts(workouts);
        List<Track> a11 = resolveConflicts.a();
        for (Track track : resolveConflicts.b()) {
            workoutManager.delete(track.getUserId(), track);
        }
        ArrayList<Track> arrayList = new ArrayList();
        for (Object obj : a11) {
            if (((Track) obj).getCategory() != 272) {
                arrayList.add(obj);
            }
        }
        for (Track track2 : arrayList) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new WorkoutSaver$saveDeviceWorkouts$1$3$note$1(track2, INSTANCE.getAccountManager().h().b(), null), 1, null);
            String str = (String) runBlocking$default;
            if (str != null) {
                track2.setNote(str);
            }
        }
        workoutManager.saveAll(a11);
    }

    public final void save(List<Track> workouts) {
        u.j(workouts, "workouts");
        dispatcher.post(new m(workouts, 6));
    }

    public final void saveActivityRecoWorkouts(final long j5, final List<Track> trackerSwimWorkout, final List<Track> workouts, final DateTime from, final DateTime to) {
        u.j(trackerSwimWorkout, "trackerSwimWorkout");
        u.j(workouts, "workouts");
        u.j(from, "from");
        u.j(to, "to");
        dispatcher.post(new Runnable() { // from class: com.withings.wiscale2.activity.workout.model.f
            @Override // java.lang.Runnable
            public final void run() {
                WorkoutSaver.saveActivityRecoWorkouts$lambda$5(j5, from, to, trackerSwimWorkout, workouts);
            }
        });
    }

    public final void saveDeviceWorkouts(List<Track> workouts) {
        u.j(workouts, "workouts");
        dispatcher.post(new o(workouts, 7));
    }

    public static final void save(Track workout) {
        u.j(workout, "workout");
        dispatcher.post(new k7.c(workout, 3));
    }
}
