package com.withings.library.healthscore.domain.interfaces;

import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import kotlin.Metadata;
/* compiled from: IsHighBloodressureInterface.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/withings/library/healthscore/domain/interfaces/IsHighBloodressureInterface;", "", "execute", "", "isUsCountry", "bloodPressure", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IsHighBloodressureInterface {
    boolean execute(boolean z5, BloodPressureMeasureGroup bloodPressureMeasureGroup);
}
