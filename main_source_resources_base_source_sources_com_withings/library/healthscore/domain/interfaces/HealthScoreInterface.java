package com.withings.library.healthscore.domain.interfaces;

import com.withings.library.healthscore.models.HSResult;
import com.withings.library.healthscore.models.HealthScores;
import com.withings.library.healthscore.models.internal.HealthScoreInputs;
import kotlin.Metadata;
import kotlinx.datetime.Instant;
/* compiled from: HealthScoreInterface.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/withings/library/healthscore/domain/interfaces/HealthScoreInterface;", "", "getHealthScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/HealthScores;", "healthScoreInputs", "Lcom/withings/library/healthscore/models/internal/HealthScoreInputs;", "dateOfScore", "Lkotlinx/datetime/Instant;", "defaultNumberOfWeekOfTheAcquisition", "", "heartDataNumberOfWeekOfTheAcquisition", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HealthScoreInterface {
    HSResult<HealthScores> getHealthScore(HealthScoreInputs healthScoreInputs, Instant instant, int i11, int i12);
}
