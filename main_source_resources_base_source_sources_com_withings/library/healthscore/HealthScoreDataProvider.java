package com.withings.library.healthscore;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.healthscore.models.PreviousHealthScores;
import com.withings.library.healthscore.models.api.ActivityAggregate;
import com.withings.library.healthscore.models.api.AfibResultMeasureGroup;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import com.withings.library.healthscore.models.api.HeightMeasureGroup;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.models.api.StepGoal;
import com.withings.library.healthscore.models.api.UserInfo;
import com.withings.library.healthscore.models.api.VascularAgeMeasureGroup;
import com.withings.library.healthscore.models.api.WeightMeasureGroup;
import java.util.List;
import kotlin.Metadata;
import qm0.d;
/* compiled from: HealthScoreDataProvider.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ%\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0007J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\rJ1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\rJ1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\rJ1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\rJ#\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0007J#\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0007J#\u0010\"\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0007J#\u0010#\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0007J%\u0010$\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0007J#\u0010%\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/withings/library/healthscore/HealthScoreDataProvider;", "", "", NavigationArguments.USER_ID, "scoreDateMillis", "Lcom/withings/library/healthscore/models/api/UserInfo;", "getUserInfo", "(JJLqm0/d;)Ljava/lang/Object;", "startDateMillis", "endDateMillis", "", "Lcom/withings/library/healthscore/models/api/StepGoal;", "getStepGoals", "(JJJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/healthscore/models/api/ActivityAggregate;", "getActivityAggregatesBetween", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "getSleepTracksBetween", "Lcom/withings/library/healthscore/models/api/HeightMeasureGroup;", "getLastHeight", "Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "getWeightMeasuresBetween", "startDate", "endDate", "Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "getAfibResultBetween", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "getBloodPressureBetween", "Lcom/withings/library/healthscore/models/api/VascularAgeMeasureGroup;", "getVascularAgeBetween", "Lcom/withings/library/healthscore/models/PreviousHealthScores;", "getPreviousHealthScore", "", "hasSleepData", "hasBloodPressureData", "hasECGData", "lastBodyData", "hasActivityData", "HealthScore_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface HealthScoreDataProvider {
    Object getActivityAggregatesBetween(long j5, long j11, long j12, d<? super List<ActivityAggregate>> dVar);

    Object getAfibResultBetween(long j5, long j11, long j12, d<? super List<AfibResultMeasureGroup>> dVar);

    Object getBloodPressureBetween(long j5, long j11, long j12, d<? super List<BloodPressureMeasureGroup>> dVar);

    Object getLastHeight(long j5, long j11, d<? super HeightMeasureGroup> dVar);

    Object getPreviousHealthScore(long j5, long j11, d<? super PreviousHealthScores> dVar);

    Object getSleepTracksBetween(long j5, long j11, long j12, d<? super List<SleepTrack>> dVar);

    Object getStepGoals(long j5, long j11, long j12, d<? super List<StepGoal>> dVar);

    Object getUserInfo(long j5, long j11, d<? super UserInfo> dVar);

    Object getVascularAgeBetween(long j5, long j11, long j12, d<? super List<VascularAgeMeasureGroup>> dVar);

    Object getWeightMeasuresBetween(long j5, long j11, long j12, d<? super List<WeightMeasureGroup>> dVar);

    Object hasActivityData(long j5, long j11, d<? super Boolean> dVar);

    Object hasBloodPressureData(long j5, long j11, d<? super Boolean> dVar);

    Object hasECGData(long j5, long j11, d<? super Boolean> dVar);

    Object hasSleepData(long j5, long j11, d<? super Boolean> dVar);

    Object lastBodyData(long j5, long j11, d<? super WeightMeasureGroup> dVar);
}
