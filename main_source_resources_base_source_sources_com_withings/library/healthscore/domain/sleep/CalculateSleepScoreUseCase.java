package com.withings.library.healthscore.domain.sleep;

import com.withings.library.healthscore.domain.interfaces.SleepApneaScoreInterface;
import com.withings.library.healthscore.domain.interfaces.SleepEngagementScoreInterface;
import com.withings.library.healthscore.domain.interfaces.SleepScoreInterface;
import com.withings.library.healthscore.domain.interfaces.WithingsSleepScoreInterface;
import com.withings.library.healthscore.exeption.SleepScoreException;
import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.SleepScores;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.utils.ktx.DoubleExtentionsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import pm0.a;
/* compiled from: CalculateSleepScoreUseCase.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJC\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withings/library/healthscore/domain/sleep/CalculateSleepScoreUseCase;", "Lcom/withings/library/healthscore/domain/interfaces/SleepScoreInterface;", "calculateSleepEngagementScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/SleepEngagementScoreInterface;", "calculateWithingsSleepScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/WithingsSleepScoreInterface;", "calculateSleepApneaBurdenScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/SleepApneaScoreInterface;", "(Lcom/withings/library/healthscore/domain/interfaces/SleepEngagementScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/WithingsSleepScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/SleepApneaScoreInterface;)V", "getSleepScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/SleepScores;", "sleepNights", "", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "numberOfWeekOfTheAcquisition", "", "dateOfScoreInMillis", "", "hasSleepData", "", "previousSleepScore", "", "(Ljava/util/List;IJZLjava/lang/Double;)Lcom/withings/library/healthscore/models/HSResult;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateSleepScoreUseCase implements SleepScoreInterface {
    private final SleepApneaScoreInterface calculateSleepApneaBurdenScoreV2UseCase;
    private final SleepEngagementScoreInterface calculateSleepEngagementScoreV2UseCase;
    private final WithingsSleepScoreInterface calculateWithingsSleepScoreV2UseCase;

    public CalculateSleepScoreUseCase(SleepEngagementScoreInterface calculateSleepEngagementScoreV2UseCase, WithingsSleepScoreInterface calculateWithingsSleepScoreV2UseCase, SleepApneaScoreInterface calculateSleepApneaBurdenScoreV2UseCase) {
        u.j(calculateSleepEngagementScoreV2UseCase, "calculateSleepEngagementScoreV2UseCase");
        u.j(calculateWithingsSleepScoreV2UseCase, "calculateWithingsSleepScoreV2UseCase");
        u.j(calculateSleepApneaBurdenScoreV2UseCase, "calculateSleepApneaBurdenScoreV2UseCase");
        this.calculateSleepEngagementScoreV2UseCase = calculateSleepEngagementScoreV2UseCase;
        this.calculateWithingsSleepScoreV2UseCase = calculateWithingsSleepScoreV2UseCase;
        this.calculateSleepApneaBurdenScoreV2UseCase = calculateSleepApneaBurdenScoreV2UseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.SleepScoreInterface
    public HSResult<SleepScores> getSleepScore(List<SleepTrack> sleepNights, int i11, long j5, boolean z5, Double d11) {
        double d12;
        Double d13;
        HSResult.Success success;
        u.j(sleepNights, "sleepNights");
        try {
            if (z5) {
                Double sleepEngagementScore = this.calculateSleepEngagementScoreV2UseCase.getSleepEngagementScore(x.D0(sleepNights, new Comparator() { // from class: com.withings.library.healthscore.domain.sleep.CalculateSleepScoreUseCase$getSleepScore$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        return a.b(Long.valueOf(((SleepTrack) t11).getDateInMillis()), Long.valueOf(((SleepTrack) t12).getDateInMillis()));
                    }
                }), i11, j5, z5);
                if (sleepEngagementScore != null) {
                    d12 = sleepEngagementScore.doubleValue();
                } else {
                    d12 = 20.0d;
                }
                Double withingsSleepScore = this.calculateWithingsSleepScoreV2UseCase.getWithingsSleepScore(sleepNights, j5);
                Double sleepApneaScore = this.calculateSleepApneaBurdenScoreV2UseCase.getSleepApneaScore(sleepNights, j5);
                ArrayList z11 = l.z(new Double[]{Double.valueOf(d12), sleepApneaScore, withingsSleepScore});
                HSResult.Success success2 = null;
                if (!(true ^ z11.isEmpty())) {
                    z11 = null;
                }
                if (z11 != null) {
                    d13 = Double.valueOf(x.u(z11));
                } else {
                    d13 = null;
                }
                Double preventScoreVariation = DoubleExtentionsKt.preventScoreVariation(d13, d11);
                if (preventScoreVariation != null) {
                    HSResult.Success success3 = new HSResult.Success(Double.valueOf(preventScoreVariation.doubleValue()));
                    HSResult.Success success4 = new HSResult.Success(Double.valueOf(d12));
                    if (sleepApneaScore != null) {
                        success = new HSResult.Success(Double.valueOf(sleepApneaScore.doubleValue()));
                    } else {
                        success = null;
                    }
                    if (withingsSleepScore != null) {
                        success2 = new HSResult.Success(Double.valueOf(withingsSleepScore.doubleValue()));
                    }
                    return new HSResult.Success(new SleepScores(success3, success4, success, success2));
                }
                return new HSResult.Failure(new SleepScoreException("Cannot calculate sleep score"));
            }
            return new HSResult.Failure(new SleepScoreException("Cannot calculate sleep score because no sleep data"));
        } catch (Exception e11) {
            return new HSResult.Failure(e11);
        }
    }
}
