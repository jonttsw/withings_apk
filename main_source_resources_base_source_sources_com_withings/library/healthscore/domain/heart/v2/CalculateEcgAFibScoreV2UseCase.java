package com.withings.library.healthscore.domain.heart.v2;

import com.withings.library.healthscore.domain.interfaces.AfibScoreInterface;
import com.withings.library.healthscore.domain.interfaces.EcgAfibScoreInterface;
import com.withings.library.healthscore.domain.interfaces.EcgEngagementScoreInterface;
import com.withings.library.healthscore.exeption.HeartScoreException;
import com.withings.library.healthscore.models.EcgScores;
import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.api.AfibResultMeasureGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: CalculateEcgAFibScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateEcgAFibScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/EcgAfibScoreInterface;", "calculateEcgEngagementScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/EcgEngagementScoreInterface;", "calculateAFibBurdenScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/AfibScoreInterface;", "(Lcom/withings/library/healthscore/domain/interfaces/EcgEngagementScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/AfibScoreInterface;)V", "getEcgAFibScore", "Lcom/withings/library/healthscore/models/EcgScores;", "afibMeasurements", "", "Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "dateOfScore", "", "hasEcgData", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateEcgAFibScoreV2UseCase implements EcgAfibScoreInterface {
    private final AfibScoreInterface calculateAFibBurdenScoreV2UseCase;
    private final EcgEngagementScoreInterface calculateEcgEngagementScoreV2UseCase;

    public CalculateEcgAFibScoreV2UseCase(EcgEngagementScoreInterface calculateEcgEngagementScoreV2UseCase, AfibScoreInterface calculateAFibBurdenScoreV2UseCase) {
        u.j(calculateEcgEngagementScoreV2UseCase, "calculateEcgEngagementScoreV2UseCase");
        u.j(calculateAFibBurdenScoreV2UseCase, "calculateAFibBurdenScoreV2UseCase");
        this.calculateEcgEngagementScoreV2UseCase = calculateEcgEngagementScoreV2UseCase;
        this.calculateAFibBurdenScoreV2UseCase = calculateAFibBurdenScoreV2UseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.EcgAfibScoreInterface
    public EcgScores getEcgAFibScore(List<AfibResultMeasureGroup> afibMeasurements, int i11, long j5, boolean z5) {
        HSResult failure;
        HSResult.Success success;
        u.j(afibMeasurements, "afibMeasurements");
        Double ecgEngagementScore = this.calculateEcgEngagementScoreV2UseCase.getEcgEngagementScore(afibMeasurements, i11, j5, z5);
        Double aFibBurdenScore = this.calculateAFibBurdenScoreV2UseCase.getAFibBurdenScore(afibMeasurements, j5);
        ArrayList z11 = l.z(new Double[]{ecgEngagementScore, aFibBurdenScore});
        HSResult.Success success2 = null;
        if (!(!z11.isEmpty())) {
            z11 = null;
        }
        if (z11 != null) {
            failure = new HSResult.Success(Double.valueOf(x.u(z11)));
        } else {
            failure = new HSResult.Failure(new HeartScoreException("ecgAFibScore is null"));
        }
        if (aFibBurdenScore != null) {
            success = new HSResult.Success(Double.valueOf(aFibBurdenScore.doubleValue()));
        } else {
            success = null;
        }
        if (ecgEngagementScore != null) {
            success2 = new HSResult.Success(Double.valueOf(ecgEngagementScore.doubleValue()));
        }
        return new EcgScores(failure, success, success2);
    }
}
