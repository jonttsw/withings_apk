package com.withings.library.healthscore.domain.heart;

import com.withings.library.healthscore.domain.interfaces.IsHighBloodressureInterface;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: IsHighBloodPressureUseCase.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/IsHighBloodPressureUseCase;", "Lcom/withings/library/healthscore/domain/interfaces/IsHighBloodressureInterface;", "()V", "execute", "", "isUsCountry", "bloodPressure", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IsHighBloodPressureUseCase implements IsHighBloodressureInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.IsHighBloodressureInterface
    public boolean execute(boolean z5, BloodPressureMeasureGroup bloodPressure) {
        u.j(bloodPressure, "bloodPressure");
        if (z5) {
            if (bloodPressure.getSystole() >= 130 || bloodPressure.getDiastole() >= 80) {
                return true;
            }
        } else if (bloodPressure.getSystole() >= 135 || bloodPressure.getDiastole() >= 85) {
            return true;
        }
        return false;
    }
}
