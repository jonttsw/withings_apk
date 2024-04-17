package com.withings.library.healthscore.domain.heart.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.common.ComputeMeasurementDaysUseCase;
import com.withings.library.healthscore.domain.heart.IsHighBloodPressureUseCase;
import com.withings.library.healthscore.domain.interfaces.BloodPressureBurdenScoreInterface;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: CalculateBloodPressureBurdenScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J5\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateBloodPressureBurdenScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/BloodPressureBurdenScoreInterface;", "computeMeasurementDaysUseCase", "Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;", "isHighBloodPressureUseCase", "Lcom/withings/library/healthscore/domain/heart/IsHighBloodPressureUseCase;", "(Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;Lcom/withings/library/healthscore/domain/heart/IsHighBloodPressureUseCase;)V", "getBloodPressureBurdenScore", "", "isUsCountry", "", "bloodPressuresData", "", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "dateOfScoreInMillis", "", "numberOfWeeksToProcess", "", "(ZLjava/util/List;JI)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateBloodPressureBurdenScoreV2UseCase implements BloodPressureBurdenScoreInterface {
    private final ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase;
    private final IsHighBloodPressureUseCase isHighBloodPressureUseCase;

    public CalculateBloodPressureBurdenScoreV2UseCase(ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase, IsHighBloodPressureUseCase isHighBloodPressureUseCase) {
        u.j(computeMeasurementDaysUseCase, "computeMeasurementDaysUseCase");
        u.j(isHighBloodPressureUseCase, "isHighBloodPressureUseCase");
        this.computeMeasurementDaysUseCase = computeMeasurementDaysUseCase;
        this.isHighBloodPressureUseCase = isHighBloodPressureUseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.BloodPressureBurdenScoreInterface
    public Double getBloodPressureBurdenScore(boolean z5, List<BloodPressureMeasureGroup> bloodPressuresData, long j5, int i11) {
        Double d11;
        u.j(bloodPressuresData, "bloodPressuresData");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : bloodPressuresData) {
            if (hashSet.add(Integer.valueOf(DateUtilsKt.getDay(((BloodPressureMeasureGroup) obj).getDateInMillis())))) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((BloodPressureMeasureGroup) next).getDateInMillis() > j5 - DateUtilsKt.getThreeMonthInMillis()) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            BloodPressureMeasureGroup bloodPressureMeasureGroup = (BloodPressureMeasureGroup) it2.next();
            if (this.isHighBloodPressureUseCase.execute(z5, bloodPressureMeasureGroup)) {
                d11 = Double.valueOf(DateUtilsKt.getCoefFromDate(bloodPressureMeasureGroup.getDateInMillis(), j5));
            } else {
                d11 = null;
            }
            if (d11 != null) {
                arrayList3.add(d11);
            }
        }
        double E0 = 100 * x.E0(arrayList3);
        Iterator it3 = arrayList2.iterator();
        double d12 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        while (it3.hasNext()) {
            d12 += DateUtilsKt.getCoefFromDate(((BloodPressureMeasureGroup) it3.next()).getDateInMillis(), j5);
        }
        return Double.valueOf(Math.max(Math.min(100.0d, (1.0d - (((E0 / d12) * 2.0d) / 100.0d)) * 100.0d), 20.0d));
    }
}
