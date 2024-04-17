package com.withings.library.healthscore.domain.body.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.common.ComputeMeasurementDaysUseCase;
import com.withings.library.healthscore.domain.interfaces.WeightEngagementScoreInterface;
import com.withings.library.healthscore.models.api.WeightMeasureGroup;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: CalculateWeightEngagementScoreV2UseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/withings/library/healthscore/domain/body/v2/CalculateWeightEngagementScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/WeightEngagementScoreInterface;", "computeMeasurementDaysUseCase", "Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;", "(Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;)V", "getWeightEngagementScore", "", "weights", "", "Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "dateOfScoreInMilli", "", "(Ljava/util/List;IJ)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateWeightEngagementScoreV2UseCase implements WeightEngagementScoreInterface {
    private final ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase;

    public CalculateWeightEngagementScoreV2UseCase(ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase) {
        u.j(computeMeasurementDaysUseCase, "computeMeasurementDaysUseCase");
        this.computeMeasurementDaysUseCase = computeMeasurementDaysUseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.WeightEngagementScoreInterface
    public Double getWeightEngagementScore(List<WeightMeasureGroup> weights, int i11, long j5) {
        double coefSumForNumberOfWeek;
        u.j(weights, "weights");
        HashSet hashSet = new HashSet();
        ArrayList<WeightMeasureGroup> arrayList = new ArrayList();
        for (Object obj : weights) {
            if (hashSet.add(Integer.valueOf(DateUtilsKt.getDay(((WeightMeasureGroup) obj).getDateInMillis())))) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int day = DateUtilsKt.getDay(j5) - DateUtilsKt.getDay(((WeightMeasureGroup) x.I(arrayList)).getDateInMillis());
            int i12 = day / 7;
            double coefSumForNumberOfWeek2 = DateUtilsKt.getCoefSumForNumberOfWeek(i12);
            int i13 = day % 7;
            double coefForWeek = DateUtilsKt.getCoefForWeek(i12 + 1);
            double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            for (WeightMeasureGroup weightMeasureGroup : arrayList) {
                d11 += DateUtilsKt.getCoefFromDate(weightMeasureGroup.getDateInMillis(), j5);
            }
            double d12 = 100 * d11;
            if (day < i11 * 7) {
                if (i12 == 0) {
                    coefSumForNumberOfWeek = coefSumForNumberOfWeek2 * i13;
                } else {
                    coefSumForNumberOfWeek = (coefSumForNumberOfWeek2 * 7) + (coefForWeek * i13);
                }
            } else {
                coefSumForNumberOfWeek = 7 * DateUtilsKt.getCoefSumForNumberOfWeek(i11);
            }
            return Double.valueOf(Math.min(100.0d, Math.max(20.0d, Math.log((1 + (d12 / coefSumForNumberOfWeek)) / 5) * 41.66666666666667d)));
        }
        return null;
    }
}
