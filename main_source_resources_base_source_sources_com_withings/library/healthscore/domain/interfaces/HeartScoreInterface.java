package com.withings.library.healthscore.domain.interfaces;

import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.HeartScores;
import com.withings.library.healthscore.models.api.AfibResultMeasureGroup;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.models.api.UserInfo;
import com.withings.library.healthscore.models.api.VascularAgeMeasureGroup;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HeartScoreInterface.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J}\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withings/library/healthscore/domain/interfaces/HeartScoreInterface;", "", "getHeartScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/HeartScores;", "userInfo", "Lcom/withings/library/healthscore/models/api/UserInfo;", "bloodPressureMeasurements", "", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "afibResults", "Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "sleepNights", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "vascularAgeResults", "Lcom/withings/library/healthscore/models/api/VascularAgeMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "dateOfScore", "", "previousHeartScore", "", "hasEcgData", "", "hasBloodPressureData", "(Lcom/withings/library/healthscore/models/api/UserInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IJLjava/lang/Double;ZZ)Lcom/withings/library/healthscore/models/HSResult;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HeartScoreInterface {
    HSResult<HeartScores> getHeartScore(UserInfo userInfo, List<BloodPressureMeasureGroup> list, List<AfibResultMeasureGroup> list2, List<SleepTrack> list3, List<VascularAgeMeasureGroup> list4, int i11, long j5, Double d11, boolean z5, boolean z11);
}
