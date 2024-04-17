package com.withings.library.healthscore.domain.interfaces;

import com.withings.library.healthscore.models.api.WeightMeasureGroup;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WeightEngagementScoreInterface.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/healthscore/domain/interfaces/WeightEngagementScoreInterface;", "", "getWeightEngagementScore", "", "weights", "", "Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "dateOfScoreInMilli", "", "(Ljava/util/List;IJ)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WeightEngagementScoreInterface {
    Double getWeightEngagementScore(List<WeightMeasureGroup> list, int i11, long j5);
}
