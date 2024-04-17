package com.withings.library.healthscore.domain.activity;

import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: IsStepGoalEverAchievedUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/withings/library/healthscore/domain/activity/IsStepGoalEverAchievedUseCase;", "", "()V", "execute", "", "activityAggregates", "", "Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IsStepGoalEverAchievedUseCase {
    public final boolean execute(List<ActivityDayWithGoal> activityAggregates) {
        u.j(activityAggregates, "activityAggregates");
        List<ActivityDayWithGoal> list = activityAggregates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ActivityDayWithGoal activityDayWithGoal : list) {
            if (activityDayWithGoal.getStepsForTheDay() > activityDayWithGoal.getStepsGoalForTheDay()) {
                return true;
            }
        }
        return false;
    }
}
