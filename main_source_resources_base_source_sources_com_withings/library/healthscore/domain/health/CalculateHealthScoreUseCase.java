package com.withings.library.healthscore.domain.health;

import co.touchlab.kermit.Severity;
import com.withings.library.healthscore.domain.interfaces.ActivityScoreInterface;
import com.withings.library.healthscore.domain.interfaces.BodyScoreInterface;
import com.withings.library.healthscore.domain.interfaces.HealthScoreInterface;
import com.withings.library.healthscore.domain.interfaces.HeartScoreInterface;
import com.withings.library.healthscore.domain.interfaces.SleepScoreInterface;
import com.withings.library.healthscore.exeption.HeathScoreInternalError;
import com.withings.library.healthscore.models.ActivityScores;
import com.withings.library.healthscore.models.BodyScores;
import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.HSResultKt;
import com.withings.library.healthscore.models.HealthScores;
import com.withings.library.healthscore.models.HeartScores;
import com.withings.library.healthscore.models.PreviousHealthScores;
import com.withings.library.healthscore.models.SleepScores;
import com.withings.library.healthscore.models.api.AfibResultMeasureGroup;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.models.api.UserInfo;
import com.withings.library.healthscore.models.api.VascularAgeMeasureGroup;
import com.withings.library.healthscore.models.api.WeightMeasureGroup;
import com.withings.library.healthscore.models.internal.HealthScoreInputs;
import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import com.withings.library.healthscore.utils.ktx.DoubleExtentionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.datetime.Instant;
import v9.e;
/* compiled from: CalculateHealthScoreUseCase.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withings/library/healthscore/domain/health/CalculateHealthScoreUseCase;", "Lcom/withings/library/healthscore/domain/interfaces/HealthScoreInterface;", "calculateActivityScoreUseCase", "Lcom/withings/library/healthscore/domain/interfaces/ActivityScoreInterface;", "calculateBodyScoreUseCase", "Lcom/withings/library/healthscore/domain/interfaces/BodyScoreInterface;", "calculateHeartScoreUseCase", "Lcom/withings/library/healthscore/domain/interfaces/HeartScoreInterface;", "calculateSleepScoreUseCase", "Lcom/withings/library/healthscore/domain/interfaces/SleepScoreInterface;", "(Lcom/withings/library/healthscore/domain/interfaces/ActivityScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/BodyScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/HeartScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/SleepScoreInterface;)V", "getHealthScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/HealthScores;", "healthScoreInputs", "Lcom/withings/library/healthscore/models/internal/HealthScoreInputs;", "dateOfScore", "Lkotlinx/datetime/Instant;", "defaultNumberOfWeekOfTheAcquisition", "", "heartDataNumberOfWeekOfTheAcquisition", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateHealthScoreUseCase implements HealthScoreInterface {
    private final ActivityScoreInterface calculateActivityScoreUseCase;
    private final BodyScoreInterface calculateBodyScoreUseCase;
    private final HeartScoreInterface calculateHeartScoreUseCase;
    private final SleepScoreInterface calculateSleepScoreUseCase;

    public CalculateHealthScoreUseCase(ActivityScoreInterface calculateActivityScoreUseCase, BodyScoreInterface calculateBodyScoreUseCase, HeartScoreInterface calculateHeartScoreUseCase, SleepScoreInterface calculateSleepScoreUseCase) {
        u.j(calculateActivityScoreUseCase, "calculateActivityScoreUseCase");
        u.j(calculateBodyScoreUseCase, "calculateBodyScoreUseCase");
        u.j(calculateHeartScoreUseCase, "calculateHeartScoreUseCase");
        u.j(calculateSleepScoreUseCase, "calculateSleepScoreUseCase");
        this.calculateActivityScoreUseCase = calculateActivityScoreUseCase;
        this.calculateBodyScoreUseCase = calculateBodyScoreUseCase;
        this.calculateHeartScoreUseCase = calculateHeartScoreUseCase;
        this.calculateSleepScoreUseCase = calculateSleepScoreUseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.HealthScoreInterface
    public HSResult<HealthScores> getHealthScore(HealthScoreInputs healthScoreInputs, Instant dateOfScore, int i11, int i12) {
        HSResult success;
        HSResult<Double> sleepScore;
        HSResult<Double> heartScore;
        HSResult<Double> bodyScore;
        HSResult<Double> activityScore;
        HSResult hSResult;
        HSResult<Double> sleepQuality;
        HSResult<Double> sleepEngagement;
        HSResult<Double> sleepApneaBurden;
        HSResult<Double> sleepScore2;
        HSResult<Double> afibBurden;
        HSResult<Double> nightHr;
        HSResult<Double> ecgEngagement;
        HSResult<Double> ecgAfib;
        HSResult<Double> vascularAge;
        HSResult<Double> bpmEngagement;
        HSResult<Double> bloodPressureBurden;
        HSResult<Double> bloodPressure;
        HSResult<Double> heartScore2;
        HSResult<Double> weightEngagement;
        HSResult<Double> bodyComposition;
        HSResult<Double> bmi;
        HSResult<Double> bodyScore2;
        HSResult<Double> stepsScore;
        HSResult<Double> activeMinutesScore;
        HSResult<Double> activityScore2;
        Double healthImprovementScore;
        HSResult failure;
        Double sleepScore3;
        Double heartScore3;
        Double bodyScore3;
        Double activityScore3;
        u.j(healthScoreInputs, "healthScoreInputs");
        u.j(dateOfScore, "dateOfScore");
        try {
            if (healthScoreInputs.getHeight() != null) {
                ActivityScoreInterface activityScoreInterface = this.calculateActivityScoreUseCase;
                List<ActivityDayWithGoal> activityDaysWithGoal = healthScoreInputs.getActivityDaysWithGoal();
                long epochMilliseconds = dateOfScore.toEpochMilliseconds();
                PreviousHealthScores previousHealthScore = healthScoreInputs.getPreviousHealthScore();
                HSResult<ActivityScores> activityScore4 = activityScoreInterface.getActivityScore(activityDaysWithGoal, epochMilliseconds, (previousHealthScore == null || (activityScore3 = previousHealthScore.getActivityScore()) == null) ? null : Double.valueOf(DoubleExtentionsKt.rangeScore(activityScore3.doubleValue())));
                BodyScoreInterface bodyScoreInterface = this.calculateBodyScoreUseCase;
                UserInfo userInfo = healthScoreInputs.getUserInfo();
                double doubleValue = healthScoreInputs.getHeight().doubleValue();
                List<WeightMeasureGroup> weights = healthScoreInputs.getWeights();
                long epochMilliseconds2 = dateOfScore.toEpochMilliseconds();
                WeightMeasureGroup lastBodyData = healthScoreInputs.getLastBodyData();
                PreviousHealthScores previousHealthScore2 = healthScoreInputs.getPreviousHealthScore();
                HSResult<BodyScores> bodyScore4 = bodyScoreInterface.getBodyScore(userInfo, doubleValue, weights, i11, epochMilliseconds2, lastBodyData, (previousHealthScore2 == null || (bodyScore3 = previousHealthScore2.getBodyScore()) == null) ? null : Double.valueOf(DoubleExtentionsKt.rangeScore(bodyScore3.doubleValue())));
                HeartScoreInterface heartScoreInterface = this.calculateHeartScoreUseCase;
                UserInfo userInfo2 = healthScoreInputs.getUserInfo();
                List<BloodPressureMeasureGroup> bloodPressures = healthScoreInputs.getBloodPressures();
                List<AfibResultMeasureGroup> aFibResults = healthScoreInputs.getAFibResults();
                List<SleepTrack> sleepNights = healthScoreInputs.getSleepNights();
                ArrayList arrayList = new ArrayList();
                for (Object obj : healthScoreInputs.getVascularAgeResults()) {
                    if (((VascularAgeMeasureGroup) obj).getDateInMillis() > dateOfScore.toEpochMilliseconds() - DateUtilsKt.getThreeMonthInMillis()) {
                        arrayList.add(obj);
                    }
                }
                long epochMilliseconds3 = dateOfScore.toEpochMilliseconds();
                PreviousHealthScores previousHealthScore3 = healthScoreInputs.getPreviousHealthScore();
                HSResult<HeartScores> heartScore4 = heartScoreInterface.getHeartScore(userInfo2, bloodPressures, aFibResults, sleepNights, arrayList, i12, epochMilliseconds3, (previousHealthScore3 == null || (heartScore3 = previousHealthScore3.getHeartScore()) == null) ? null : Double.valueOf(DoubleExtentionsKt.rangeScore(heartScore3.doubleValue())), healthScoreInputs.getHasEcgData(), healthScoreInputs.getHasBloodPressureData());
                SleepScoreInterface sleepScoreInterface = this.calculateSleepScoreUseCase;
                List<SleepTrack> sleepNights2 = healthScoreInputs.getSleepNights();
                long epochMilliseconds4 = dateOfScore.toEpochMilliseconds();
                boolean hasSleepData = healthScoreInputs.getHasSleepData();
                PreviousHealthScores previousHealthScore4 = healthScoreInputs.getPreviousHealthScore();
                HSResult<SleepScores> sleepScore4 = sleepScoreInterface.getSleepScore(sleepNights2, i11, epochMilliseconds4, hasSleepData, (previousHealthScore4 == null || (sleepScore3 = previousHealthScore4.getSleepScore()) == null) ? null : Double.valueOf(DoubleExtentionsKt.rangeScore(sleepScore3.doubleValue())));
                if ((!HSResultKt.isSuccess(bodyScore4) && !HSResultKt.isSuccess(activityScore4) && !HSResultKt.isSuccess(sleepScore4)) || ((!HSResultKt.isSuccess(heartScore4) && !HSResultKt.isSuccess(activityScore4) && !HSResultKt.isSuccess(sleepScore4)) || ((!HSResultKt.isSuccess(bodyScore4) && !HSResultKt.isSuccess(heartScore4) && !HSResultKt.isSuccess(sleepScore4)) || (!HSResultKt.isSuccess(bodyScore4) && !HSResultKt.isSuccess(activityScore4) && !HSResultKt.isSuccess(heartScore4))))) {
                    success = new HSResult.Failure(new HeathScoreInternalError("only one subscore is not null"));
                } else {
                    Double[] dArr = new Double[4];
                    ActivityScores activityScores = (ActivityScores) HSResultKt.getOrNull(activityScore4);
                    dArr[0] = (activityScores == null || (activityScore = activityScores.getActivityScore()) == null) ? null : (Double) HSResultKt.getOrNull(activityScore);
                    BodyScores bodyScores = (BodyScores) HSResultKt.getOrNull(bodyScore4);
                    dArr[1] = (bodyScores == null || (bodyScore = bodyScores.getBodyScore()) == null) ? null : (Double) HSResultKt.getOrNull(bodyScore);
                    HeartScores heartScores = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    dArr[2] = (heartScores == null || (heartScore = heartScores.getHeartScore()) == null) ? null : (Double) HSResultKt.getOrNull(heartScore);
                    SleepScores sleepScores = (SleepScores) HSResultKt.getOrNull(sleepScore4);
                    dArr[3] = (sleepScores == null || (sleepScore = sleepScores.getSleepScore()) == null) ? null : (Double) HSResultKt.getOrNull(sleepScore);
                    ArrayList z5 = l.z(dArr);
                    if (!(!z5.isEmpty())) {
                        z5 = null;
                    }
                    success = z5 != null ? new HSResult.Success(Double.valueOf(x.u(z5))) : new HSResult.Failure(new HeathScoreInternalError("All score compute failed"));
                }
                HSResult hSResult2 = success;
                PreviousHealthScores previousHealthScore5 = healthScoreInputs.getPreviousHealthScore();
                if (previousHealthScore5 == null || (healthImprovementScore = previousHealthScore5.getHealthImprovementScore()) == null) {
                    hSResult = hSResult2;
                } else {
                    double rangeScore = DoubleExtentionsKt.rangeScore(healthImprovementScore.doubleValue());
                    Double d11 = (Double) HSResultKt.getOrNull(hSResult2);
                    if (d11 != null) {
                        Double preventScoreVariation = DoubleExtentionsKt.preventScoreVariation(Double.valueOf(d11.doubleValue()), Double.valueOf(rangeScore));
                        failure = preventScoreVariation != null ? new HSResult.Success(Double.valueOf(preventScoreVariation.doubleValue())) : null;
                        if (failure != null) {
                            hSResult = failure;
                        }
                    }
                    failure = new HSResult.Failure(new HeathScoreInternalError("Score null"));
                    hSResult = failure;
                }
                e.a aVar = e.f103480c;
                Severity a11 = aVar.c().a();
                Severity severity = Severity.f23168b;
                if (a11.compareTo(severity) <= 0) {
                    aVar.f(severity, "Kermit", "HIS: Health Improvement Score: " + hSResult, null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    PreviousHealthScores previousHealthScore6 = healthScoreInputs.getPreviousHealthScore();
                    aVar.f(severity, "Kermit", "HIS: Previous Score activity: " + (previousHealthScore6 != null ? previousHealthScore6.getActivityScore() : null), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    PreviousHealthScores previousHealthScore7 = healthScoreInputs.getPreviousHealthScore();
                    aVar.f(severity, "Kermit", "HIS: Previous Score body: " + (previousHealthScore7 != null ? previousHealthScore7.getBodyScore() : null), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    PreviousHealthScores previousHealthScore8 = healthScoreInputs.getPreviousHealthScore();
                    aVar.f(severity, "Kermit", "HIS: Previous Score heart: " + (previousHealthScore8 != null ? previousHealthScore8.getHeartScore() : null), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    PreviousHealthScores previousHealthScore9 = healthScoreInputs.getPreviousHealthScore();
                    aVar.f(severity, "Kermit", "HIS: Previous Score sleep: " + (previousHealthScore9 != null ? previousHealthScore9.getSleepScore() : null), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    PreviousHealthScores previousHealthScore10 = healthScoreInputs.getPreviousHealthScore();
                    aVar.f(severity, "Kermit", "HIS: Previous Score global: " + (previousHealthScore10 != null ? previousHealthScore10.getHealthImprovementScore() : null), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    ActivityScores activityScores2 = (ActivityScores) HSResultKt.getOrNull(activityScore4);
                    aVar.f(severity, "Kermit", "HIS: Activity Score: " + ((activityScores2 == null || (activityScore2 = activityScores2.getActivityScore()) == null) ? null : (Double) HSResultKt.getOrNull(activityScore2)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    ActivityScores activityScores3 = (ActivityScores) HSResultKt.getOrNull(activityScore4);
                    aVar.f(severity, "Kermit", "HIS: Active Minutes Score: " + ((activityScores3 == null || (activeMinutesScore = activityScores3.getActiveMinutesScore()) == null) ? null : (Double) HSResultKt.getOrNull(activeMinutesScore)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    ActivityScores activityScores4 = (ActivityScores) HSResultKt.getOrNull(activityScore4);
                    aVar.f(severity, "Kermit", "HIS: Steps Score: " + ((activityScores4 == null || (stepsScore = activityScores4.getStepsScore()) == null) ? null : (Double) HSResultKt.getOrNull(stepsScore)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    BodyScores bodyScores2 = (BodyScores) HSResultKt.getOrNull(bodyScore4);
                    aVar.f(severity, "Kermit", "HIS: Body Score: " + ((bodyScores2 == null || (bodyScore2 = bodyScores2.getBodyScore()) == null) ? null : (Double) HSResultKt.getOrNull(bodyScore2)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    BodyScores bodyScores3 = (BodyScores) HSResultKt.getOrNull(bodyScore4);
                    aVar.f(severity, "Kermit", "HIS: Body BMI Score: " + ((bodyScores3 == null || (bmi = bodyScores3.getBmi()) == null) ? null : (Double) HSResultKt.getOrNull(bmi)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    BodyScores bodyScores4 = (BodyScores) HSResultKt.getOrNull(bodyScore4);
                    aVar.f(severity, "Kermit", "HIS: Body Body Composition Score: " + ((bodyScores4 == null || (bodyComposition = bodyScores4.getBodyComposition()) == null) ? null : (Double) HSResultKt.getOrNull(bodyComposition)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    BodyScores bodyScores5 = (BodyScores) HSResultKt.getOrNull(bodyScore4);
                    aVar.f(severity, "Kermit", "HIS: Body Weight Engagement Score: " + ((bodyScores5 == null || (weightEngagement = bodyScores5.getWeightEngagement()) == null) ? null : (Double) HSResultKt.getOrNull(weightEngagement)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    aVar.f(severity, "Kermit", "HIS: Last Body Data: " + healthScoreInputs.getLastBodyData(), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores2 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Score: " + ((heartScores2 == null || (heartScore2 = heartScores2.getHeartScore()) == null) ? null : (Double) HSResultKt.getOrNull(heartScore2)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores3 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Blood Pressure Score: " + ((heartScores3 == null || (bloodPressure = heartScores3.getBloodPressure()) == null) ? null : (Double) HSResultKt.getOrNull(bloodPressure)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores4 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Blood Pressure Burden Score: " + ((heartScores4 == null || (bloodPressureBurden = heartScores4.getBloodPressureBurden()) == null) ? null : (Double) HSResultKt.getOrNull(bloodPressureBurden)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores5 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Blood Pressure Engagement Score: " + ((heartScores5 == null || (bpmEngagement = heartScores5.getBpmEngagement()) == null) ? null : (Double) HSResultKt.getOrNull(bpmEngagement)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores6 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Vascular Age Score: " + ((heartScores6 == null || (vascularAge = heartScores6.getVascularAge()) == null) ? null : (Double) HSResultKt.getOrNull(vascularAge)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores7 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Ecg Afib Score: " + ((heartScores7 == null || (ecgAfib = heartScores7.getEcgAfib()) == null) ? null : (Double) HSResultKt.getOrNull(ecgAfib)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores8 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Ecg Engagement Score: " + ((heartScores8 == null || (ecgEngagement = heartScores8.getEcgEngagement()) == null) ? null : (Double) HSResultKt.getOrNull(ecgEngagement)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores9 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Night Hr Score: " + ((heartScores9 == null || (nightHr = heartScores9.getNightHr()) == null) ? null : (Double) HSResultKt.getOrNull(nightHr)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    HeartScores heartScores10 = (HeartScores) HSResultKt.getOrNull(heartScore4);
                    aVar.f(severity, "Kermit", "HIS: Heart Afib Burden Score: " + ((heartScores10 == null || (afibBurden = heartScores10.getAfibBurden()) == null) ? null : (Double) HSResultKt.getOrNull(afibBurden)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    aVar.f(severity, "Kermit", "HIS: Has Ecg Data: " + healthScoreInputs.getHasEcgData(), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    aVar.f(severity, "Kermit", "HIS: Has Blood Pressure Data: " + healthScoreInputs.getHasBloodPressureData(), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    SleepScores sleepScores2 = (SleepScores) HSResultKt.getOrNull(sleepScore4);
                    aVar.f(severity, "Kermit", "HIS: Sleep Score: " + ((sleepScores2 == null || (sleepScore2 = sleepScores2.getSleepScore()) == null) ? null : (Double) HSResultKt.getOrNull(sleepScore2)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    SleepScores sleepScores3 = (SleepScores) HSResultKt.getOrNull(sleepScore4);
                    aVar.f(severity, "Kermit", "HIS: Sleep Apnea Burden Score: " + ((sleepScores3 == null || (sleepApneaBurden = sleepScores3.getSleepApneaBurden()) == null) ? null : (Double) HSResultKt.getOrNull(sleepApneaBurden)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    SleepScores sleepScores4 = (SleepScores) HSResultKt.getOrNull(sleepScore4);
                    aVar.f(severity, "Kermit", "HIS: Sleep Engagement Score: " + ((sleepScores4 == null || (sleepEngagement = sleepScores4.getSleepEngagement()) == null) ? null : (Double) HSResultKt.getOrNull(sleepEngagement)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    SleepScores sleepScores5 = (SleepScores) HSResultKt.getOrNull(sleepScore4);
                    aVar.f(severity, "Kermit", "HIS: Sleep Quality Score: " + ((sleepScores5 == null || (sleepQuality = sleepScores5.getSleepQuality()) == null) ? null : (Double) HSResultKt.getOrNull(sleepQuality)), null);
                }
                if (aVar.c().a().compareTo(severity) <= 0) {
                    aVar.f(severity, "Kermit", "HIS: Has Sleep Data: " + healthScoreInputs.getHasSleepData(), null);
                }
                return new HSResult.Success(new HealthScores(activityScore4, bodyScore4, heartScore4, sleepScore4, hSResult, hSResult2));
            }
            throw new IllegalArgumentException("height can't be null to compute score".toString());
        } catch (Exception e11) {
            return new HSResult.Failure(e11);
        }
    }
}
