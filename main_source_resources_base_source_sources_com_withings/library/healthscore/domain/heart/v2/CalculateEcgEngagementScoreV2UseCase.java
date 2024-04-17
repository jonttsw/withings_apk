package com.withings.library.healthscore.domain.heart.v2;

import com.withings.library.healthscore.domain.common.ComputeMeasurementDaysUseCase;
import com.withings.library.healthscore.domain.interfaces.EcgEngagementScoreInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: CalculateEcgEngagementScoreV2UseCase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J5\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateEcgEngagementScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/EcgEngagementScoreInterface;", "computeMeasurementDaysUseCase", "Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;", "(Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;)V", "getEcgEngagementScore", "", "afibMeasurements", "", "Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "dateOfScoreInMillis", "", "hasEcgData", "", "(Ljava/util/List;IJZ)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateEcgEngagementScoreV2UseCase implements EcgEngagementScoreInterface {
    private final ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase;

    public CalculateEcgEngagementScoreV2UseCase(ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase) {
        u.j(computeMeasurementDaysUseCase, "computeMeasurementDaysUseCase");
        this.computeMeasurementDaysUseCase = computeMeasurementDaysUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    @Override // com.withings.library.healthscore.domain.interfaces.EcgEngagementScoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Double getEcgEngagementScore(java.util.List<com.withings.library.healthscore.models.api.AfibResultMeasureGroup> r21, int r22, long r23, boolean r25) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.healthscore.domain.heart.v2.CalculateEcgEngagementScoreV2UseCase.getEcgEngagementScore(java.util.List, int, long, boolean):java.lang.Double");
    }
}
