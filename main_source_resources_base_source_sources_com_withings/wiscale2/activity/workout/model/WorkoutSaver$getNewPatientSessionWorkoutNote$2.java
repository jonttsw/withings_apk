package com.withings.wiscale2.activity.workout.model;

import com.withings.clinicalstudy.repository.PatientSessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import pi.i;
/* compiled from: WorkoutSaver.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpi/f;", "invoke", "()Lpi/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class WorkoutSaver$getNewPatientSessionWorkoutNote$2 extends w implements ym0.a<pi.f> {
    public static final WorkoutSaver$getNewPatientSessionWorkoutNote$2 INSTANCE = new WorkoutSaver$getNewPatientSessionWorkoutNote$2();

    WorkoutSaver$getNewPatientSessionWorkoutNote$2() {
        super(0);
    }

    @Override // ym0.a
    public final pi.f invoke() {
        PatientSessionRepository patientSessionRepository;
        i isForClinicalStudy;
        WorkoutSaver workoutSaver = WorkoutSaver.INSTANCE;
        patientSessionRepository = workoutSaver.getPatientSessionRepository();
        isForClinicalStudy = workoutSaver.isForClinicalStudy();
        return new pi.f(patientSessionRepository, isForClinicalStudy);
    }
}
