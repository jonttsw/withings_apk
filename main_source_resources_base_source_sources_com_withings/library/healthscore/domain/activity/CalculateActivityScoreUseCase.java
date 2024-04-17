package com.withings.library.healthscore.domain.activity;

import com.withings.library.healthscore.domain.interfaces.ActiveMinuteScoreInterface;
import com.withings.library.healthscore.domain.interfaces.ActivityScoreInterface;
import com.withings.library.healthscore.domain.interfaces.StepScoreInterface;
import com.withings.library.healthscore.exeption.ActivityScoreException;
import com.withings.library.healthscore.models.ActivityScores;
import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import com.withings.library.healthscore.utils.ktx.DoubleExtentionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: CalculateActivityScoreUseCase.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/withings/library/healthscore/domain/activity/CalculateActivityScoreUseCase;", "Lcom/withings/library/healthscore/domain/interfaces/ActivityScoreInterface;", "calculateStepScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/StepScoreInterface;", "calculateActiveMinuteScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/ActiveMinuteScoreInterface;", "(Lcom/withings/library/healthscore/domain/interfaces/StepScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/ActiveMinuteScoreInterface;)V", "getActivityScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/ActivityScores;", "activityAggregates", "", "Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "startDate", "", "previousActivityScore", "", "(Ljava/util/List;JLjava/lang/Double;)Lcom/withings/library/healthscore/models/HSResult;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateActivityScoreUseCase implements ActivityScoreInterface {
    private final ActiveMinuteScoreInterface calculateActiveMinuteScoreV2UseCase;
    private final StepScoreInterface calculateStepScoreV2UseCase;

    public CalculateActivityScoreUseCase(StepScoreInterface calculateStepScoreV2UseCase, ActiveMinuteScoreInterface calculateActiveMinuteScoreV2UseCase) {
        u.j(calculateStepScoreV2UseCase, "calculateStepScoreV2UseCase");
        u.j(calculateActiveMinuteScoreV2UseCase, "calculateActiveMinuteScoreV2UseCase");
        this.calculateStepScoreV2UseCase = calculateStepScoreV2UseCase;
        this.calculateActiveMinuteScoreV2UseCase = calculateActiveMinuteScoreV2UseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.ActivityScoreInterface
    public HSResult<ActivityScores> getActivityScore(List<ActivityDayWithGoal> activityAggregates, long j5, Double d11) {
        Double d12;
        HSResult.Success success;
        u.j(activityAggregates, "activityAggregates");
        try {
            Double stepScore = this.calculateStepScoreV2UseCase.getStepScore(activityAggregates, j5);
            Double activeMinuteScore = this.calculateActiveMinuteScoreV2UseCase.getActiveMinuteScore(activityAggregates, j5);
            ArrayList z5 = l.z(new Double[]{stepScore, activeMinuteScore});
            HSResult.Success success2 = null;
            if (!(!z5.isEmpty())) {
                z5 = null;
            }
            if (z5 != null) {
                d12 = Double.valueOf(x.u(z5));
            } else {
                d12 = null;
            }
            Double preventScoreVariation = DoubleExtentionsKt.preventScoreVariation(d12, d11);
            if (preventScoreVariation != null) {
                HSResult.Success success3 = new HSResult.Success(Double.valueOf(preventScoreVariation.doubleValue()));
                if (stepScore != null) {
                    success = new HSResult.Success(Double.valueOf(stepScore.doubleValue()));
                } else {
                    success = null;
                }
                if (activeMinuteScore != null) {
                    success2 = new HSResult.Success(Double.valueOf(activeMinuteScore.doubleValue()));
                }
                return new HSResult.Success(new ActivityScores(success3, success, success2));
            }
            return new HSResult.Failure(new ActivityScoreException("Cannot calculate activity score"));
        } catch (Exception e11) {
            return new HSResult.Failure(e11);
        }
    }
}
