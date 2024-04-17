package com.withings.library.healthscore.domain.interfaces;

import com.withings.library.healthscore.models.ActivityScores;
import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ActivityScoreInterface.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/withings/library/healthscore/domain/interfaces/ActivityScoreInterface;", "", "getActivityScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/ActivityScores;", "activityAggregates", "", "Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "startDate", "", "previousActivityScore", "", "(Ljava/util/List;JLjava/lang/Double;)Lcom/withings/library/healthscore/models/HSResult;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ActivityScoreInterface {
    HSResult<ActivityScores> getActivityScore(List<ActivityDayWithGoal> list, long j5, Double d11);
}
