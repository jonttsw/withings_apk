package com.withings.library.healthscore.domain.interfaces;

import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BloodPressureEngagementScoreInterface.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/library/healthscore/domain/interfaces/BloodPressureEngagementScoreInterface;", "", "getBloodPressureEngagementScore", "", "isUsCountry", "", "bloodPressuresData", "", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "startDate", "", "hasBloodPressureData", "(ZLjava/util/List;IJZ)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BloodPressureEngagementScoreInterface {
    Double getBloodPressureEngagementScore(boolean z5, List<BloodPressureMeasureGroup> list, int i11, long j5, boolean z11);
}
