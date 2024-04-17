package com.withings.library.healthscore;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.healthscore.domain.activity.CalculateActivityScoreUseCase;
import com.withings.library.healthscore.domain.activity.v2.CalculateActiveMinuteScoreV2UseCase;
import com.withings.library.healthscore.domain.activity.v2.CalculateStepScoreV2UseCase;
import com.withings.library.healthscore.domain.body.CalculateBodyScoreUseCase;
import com.withings.library.healthscore.domain.body.ComputeBmiUseCase;
import com.withings.library.healthscore.domain.body.v2.CalculateBMIScoreV2UseCase;
import com.withings.library.healthscore.domain.body.v2.CalculateBodyCompositionScoreV2UseCase;
import com.withings.library.healthscore.domain.body.v2.CalculateWeightEngagementScoreV2UseCase;
import com.withings.library.healthscore.domain.common.ComputeMeasurementDaysUseCase;
import com.withings.library.healthscore.domain.health.CalculateHealthScoreUseCase;
import com.withings.library.healthscore.domain.heart.CalculateHeartScoreUseCase;
import com.withings.library.healthscore.domain.heart.IsHighBloodPressureUseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateAFibBurdenScoreV2UseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateBloodPressureBurdenScoreV2UseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateBloodPressureEngagementScoreV2UseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateBloodPressureScoreV2UseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateEcgAFibScoreV2UseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateEcgEngagementScoreV2UseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateNightHeartScoreV2UseCase;
import com.withings.library.healthscore.domain.heart.v2.CalculateVascularAgeScoreV2UseCase;
import com.withings.library.healthscore.domain.sleep.CalculateSleepScoreUseCase;
import com.withings.library.healthscore.domain.sleep.v2.CalculateSleepApneaBurdenScoreV2UseCase;
import com.withings.library.healthscore.domain.sleep.v2.CalculateSleepEngagementScoreV2UseCase;
import com.withings.library.healthscore.domain.sleep.v2.CalculateWithingsSleepScoreV2UseCase;
import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.HealthScores;
import com.withings.library.healthscore.utils.HealthScoreInputsProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: HealthScoreService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/withings/library/healthscore/HealthScoreService;", "", "", NavigationArguments.USER_ID, "dateOfScoreInMillis", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/HealthScores;", "getScores", "(JJLqm0/d;)Ljava/lang/Object;", "Companion", "HealthScore_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface HealthScoreService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: HealthScoreService.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/withings/library/healthscore/HealthScoreService$Companion;", "", "()V", "create", "Lcom/withings/library/healthscore/HealthScoreService;", "healthScoreDataProvider", "Lcom/withings/library/healthscore/HealthScoreDataProvider;", "getVersionCode", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final HealthScoreService create(HealthScoreDataProvider healthScoreDataProvider) {
            u.j(healthScoreDataProvider, "healthScoreDataProvider");
            CalculateActivityScoreUseCase calculateActivityScoreUseCase = new CalculateActivityScoreUseCase(new CalculateStepScoreV2UseCase(), new CalculateActiveMinuteScoreV2UseCase());
            ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase = new ComputeMeasurementDaysUseCase();
            CalculateBodyScoreUseCase calculateBodyScoreUseCase = new CalculateBodyScoreUseCase(new CalculateWeightEngagementScoreV2UseCase(computeMeasurementDaysUseCase), new CalculateBodyCompositionScoreV2UseCase(), new CalculateBMIScoreV2UseCase(new ComputeBmiUseCase()));
            IsHighBloodPressureUseCase isHighBloodPressureUseCase = new IsHighBloodPressureUseCase();
            CalculateBloodPressureEngagementScoreV2UseCase calculateBloodPressureEngagementScoreV2UseCase = new CalculateBloodPressureEngagementScoreV2UseCase(computeMeasurementDaysUseCase, isHighBloodPressureUseCase);
            CalculateBloodPressureBurdenScoreV2UseCase calculateBloodPressureBurdenScoreV2UseCase = new CalculateBloodPressureBurdenScoreV2UseCase(computeMeasurementDaysUseCase, isHighBloodPressureUseCase);
            return new HealthScoreServiceImpl(new CalculateHealthScoreUseCase(calculateActivityScoreUseCase, calculateBodyScoreUseCase, new CalculateHeartScoreUseCase(new CalculateBloodPressureScoreV2UseCase(calculateBloodPressureEngagementScoreV2UseCase, calculateBloodPressureBurdenScoreV2UseCase), new CalculateEcgAFibScoreV2UseCase(new CalculateEcgEngagementScoreV2UseCase(computeMeasurementDaysUseCase), new CalculateAFibBurdenScoreV2UseCase()), new CalculateNightHeartScoreV2UseCase(), new CalculateVascularAgeScoreV2UseCase()), new CalculateSleepScoreUseCase(new CalculateSleepEngagementScoreV2UseCase(), new CalculateWithingsSleepScoreV2UseCase(), new CalculateSleepApneaBurdenScoreV2UseCase())), new HealthScoreInputsProvider(healthScoreDataProvider));
        }

        public final int getVersionCode() {
            return 4;
        }
    }

    Object getScores(long j5, long j11, d<? super HSResult<HealthScores>> dVar);
}
