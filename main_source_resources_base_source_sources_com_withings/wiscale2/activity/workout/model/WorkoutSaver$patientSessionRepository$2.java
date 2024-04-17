package com.withings.wiscale2.activity.workout.model;

import com.withings.clinicalstudy.repository.PatientSessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WorkoutSaver.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WorkoutSaver$patientSessionRepository$2 extends w implements ym0.a<PatientSessionRepository> {
    public static final WorkoutSaver$patientSessionRepository$2 INSTANCE = new WorkoutSaver$patientSessionRepository$2();

    WorkoutSaver$patientSessionRepository$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final PatientSessionRepository invoke() {
        return PatientSessionRepository.Companion.get();
    }
}
