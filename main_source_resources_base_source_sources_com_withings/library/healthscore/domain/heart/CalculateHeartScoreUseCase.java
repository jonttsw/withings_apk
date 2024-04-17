package com.withings.library.healthscore.domain.heart;

import com.withings.library.healthscore.domain.interfaces.BloodPressureScoreInterface;
import com.withings.library.healthscore.domain.interfaces.EcgAfibScoreInterface;
import com.withings.library.healthscore.domain.interfaces.HeartScoreInterface;
import com.withings.library.healthscore.domain.interfaces.NightHeartScoreInterface;
import com.withings.library.healthscore.domain.interfaces.VascularAgeScoreInterface;
import com.withings.library.healthscore.exeption.HeartScoreException;
import com.withings.library.healthscore.models.BloodPressureScores;
import com.withings.library.healthscore.models.EcgScores;
import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.HSResultKt;
import com.withings.library.healthscore.models.HeartScores;
import com.withings.library.healthscore.models.api.AfibResultMeasureGroup;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.models.api.UserInfo;
import com.withings.library.healthscore.models.api.VascularAgeMeasureGroup;
import com.withings.library.healthscore.utils.ktx.DoubleExtentionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: CalculateHeartScoreUseCase.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ}\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/CalculateHeartScoreUseCase;", "Lcom/withings/library/healthscore/domain/interfaces/HeartScoreInterface;", "calculateBloodPressureScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/BloodPressureScoreInterface;", "calculateEcgAFibScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/EcgAfibScoreInterface;", "calculateNightHeartScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/NightHeartScoreInterface;", "calculateVascularAgeScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/VascularAgeScoreInterface;", "(Lcom/withings/library/healthscore/domain/interfaces/BloodPressureScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/EcgAfibScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/NightHeartScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/VascularAgeScoreInterface;)V", "getHeartScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/HeartScores;", "userInfo", "Lcom/withings/library/healthscore/models/api/UserInfo;", "bloodPressureMeasurements", "", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "afibResults", "Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "sleepNights", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "vascularAgeResults", "Lcom/withings/library/healthscore/models/api/VascularAgeMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "dateOfScore", "", "previousHeartScore", "", "hasEcgData", "", "hasBloodPressureData", "(Lcom/withings/library/healthscore/models/api/UserInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IJLjava/lang/Double;ZZ)Lcom/withings/library/healthscore/models/HSResult;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateHeartScoreUseCase implements HeartScoreInterface {
    private final BloodPressureScoreInterface calculateBloodPressureScoreV2UseCase;
    private final EcgAfibScoreInterface calculateEcgAFibScoreV2UseCase;
    private final NightHeartScoreInterface calculateNightHeartScoreV2UseCase;
    private final VascularAgeScoreInterface calculateVascularAgeScoreV2UseCase;

    public CalculateHeartScoreUseCase(BloodPressureScoreInterface calculateBloodPressureScoreV2UseCase, EcgAfibScoreInterface calculateEcgAFibScoreV2UseCase, NightHeartScoreInterface calculateNightHeartScoreV2UseCase, VascularAgeScoreInterface calculateVascularAgeScoreV2UseCase) {
        u.j(calculateBloodPressureScoreV2UseCase, "calculateBloodPressureScoreV2UseCase");
        u.j(calculateEcgAFibScoreV2UseCase, "calculateEcgAFibScoreV2UseCase");
        u.j(calculateNightHeartScoreV2UseCase, "calculateNightHeartScoreV2UseCase");
        u.j(calculateVascularAgeScoreV2UseCase, "calculateVascularAgeScoreV2UseCase");
        this.calculateBloodPressureScoreV2UseCase = calculateBloodPressureScoreV2UseCase;
        this.calculateEcgAFibScoreV2UseCase = calculateEcgAFibScoreV2UseCase;
        this.calculateNightHeartScoreV2UseCase = calculateNightHeartScoreV2UseCase;
        this.calculateVascularAgeScoreV2UseCase = calculateVascularAgeScoreV2UseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.HeartScoreInterface
    public HSResult<HeartScores> getHeartScore(UserInfo userInfo, List<BloodPressureMeasureGroup> bloodPressureMeasurements, List<AfibResultMeasureGroup> afibResults, List<SleepTrack> sleepNights, List<VascularAgeMeasureGroup> vascularAgeResults, int i11, long j5, Double d11, boolean z5, boolean z11) {
        Double d12;
        Double d13;
        Double d14;
        Double d15;
        HSResult<Double> hSResult;
        HSResult<Double> hSResult2;
        HSResult<Double> hSResult3;
        HSResult<Double> hSResult4;
        HSResult<Double> hSResult5;
        HSResult.Success success;
        HSResult.Success success2;
        HSResult<Double> ecgAFibScore;
        HSResult<Double> bloodPressureScores;
        u.j(userInfo, "userInfo");
        u.j(bloodPressureMeasurements, "bloodPressureMeasurements");
        u.j(afibResults, "afibResults");
        u.j(sleepNights, "sleepNights");
        u.j(vascularAgeResults, "vascularAgeResults");
        try {
            BloodPressureScores bloodPressureScore = this.calculateBloodPressureScoreV2UseCase.getBloodPressureScore(userInfo.isInUsCountry(), bloodPressureMeasurements, j5, i11, z11);
            EcgScores ecgAFibScore2 = this.calculateEcgAFibScoreV2UseCase.getEcgAFibScore(afibResults, i11, j5, z5);
            Double nightHeartScore = this.calculateNightHeartScoreV2UseCase.getNightHeartScore(userInfo.isBornFemaleGender(), sleepNights, j5);
            Double vascularAgeScore = this.calculateVascularAgeScoreV2UseCase.getVascularAgeScore(userInfo.getAge(), vascularAgeResults);
            Double[] dArr = new Double[4];
            HSResult<Double> hSResult6 = null;
            if (bloodPressureScore != null && (bloodPressureScores = bloodPressureScore.getBloodPressureScores()) != null) {
                d12 = (Double) HSResultKt.getOrNull(bloodPressureScores);
            } else {
                d12 = null;
            }
            dArr[0] = d12;
            if (ecgAFibScore2 != null && (ecgAFibScore = ecgAFibScore2.getEcgAFibScore()) != null) {
                d13 = (Double) HSResultKt.getOrNull(ecgAFibScore);
            } else {
                d13 = null;
            }
            dArr[1] = d13;
            dArr[2] = nightHeartScore;
            dArr[3] = vascularAgeScore;
            ArrayList z12 = l.z(dArr);
            if (!(!z12.isEmpty())) {
                z12 = null;
            }
            if (z12 != null) {
                d15 = Double.valueOf(x.u(z12));
                d14 = d11;
            } else {
                d14 = d11;
                d15 = null;
            }
            Double preventScoreVariation = DoubleExtentionsKt.preventScoreVariation(d15, d14);
            if (preventScoreVariation != null) {
                HSResult.Success success3 = new HSResult.Success(Double.valueOf(preventScoreVariation.doubleValue()));
                if (ecgAFibScore2 != null) {
                    hSResult = ecgAFibScore2.getEcgAFibMonitoringEngagement();
                } else {
                    hSResult = null;
                }
                if (ecgAFibScore2 != null) {
                    hSResult2 = ecgAFibScore2.getEcgAFibScore();
                } else {
                    hSResult2 = null;
                }
                if (bloodPressureScore != null) {
                    hSResult3 = bloodPressureScore.getBloodPressureScores();
                } else {
                    hSResult3 = null;
                }
                if (bloodPressureScore != null) {
                    hSResult4 = bloodPressureScore.getBloodPressureBurdenScore();
                } else {
                    hSResult4 = null;
                }
                if (bloodPressureScore != null) {
                    hSResult5 = bloodPressureScore.getBloodPressureEngagementScore();
                } else {
                    hSResult5 = null;
                }
                if (vascularAgeScore != null) {
                    success = new HSResult.Success(Double.valueOf(vascularAgeScore.doubleValue()));
                } else {
                    success = null;
                }
                if (nightHeartScore != null) {
                    success2 = new HSResult.Success(Double.valueOf(nightHeartScore.doubleValue()));
                } else {
                    success2 = null;
                }
                if (ecgAFibScore2 != null) {
                    hSResult6 = ecgAFibScore2.getEcgAFibBurdenScore();
                }
                return new HSResult.Success(new HeartScores(success3, hSResult, hSResult3, success, hSResult4, hSResult2, hSResult5, success2, hSResult6));
            }
            return new HSResult.Failure(new HeartScoreException("Cannot calculate heart score"));
        } catch (Exception e11) {
            return new HSResult.Failure(e11);
        }
    }
}
